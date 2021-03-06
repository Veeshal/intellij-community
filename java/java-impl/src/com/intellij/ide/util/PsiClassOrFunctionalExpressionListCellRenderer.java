/*
 * Copyright 2000-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.ide.util;

import com.intellij.psi.NavigatablePsiElement;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiFunctionalExpression;
import com.intellij.psi.presentation.java.ClassPresentationUtil;

public class PsiClassOrFunctionalExpressionListCellRenderer extends PsiElementListCellRenderer<NavigatablePsiElement> {
  @Override
  public String getElementText(NavigatablePsiElement element) {
    return element instanceof PsiClass ? ClassPresentationUtil.getNameForClass((PsiClass)element, false)
                                       : ClassPresentationUtil.getFunctionalExpressionPresentation((PsiFunctionalExpression)element, false);
  }

  @Override
  protected String getContainerText(NavigatablePsiElement element, final String name) {
    return PsiClassListCellRenderer.getContainerTextStatic(element);
  }

  @Override
  protected int getIconFlags() {
    return 0;
  }
}
