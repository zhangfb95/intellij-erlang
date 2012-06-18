// This is a generated file. Not intended for manual editing.
package org.intellij.erlang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.erlang.ErlangTypes.*;
import org.intellij.erlang.psi.*;

public class ErlangTypedExprsImpl extends ErlangCompositeElementImpl implements ErlangTypedExprs {

  public ErlangTypedExprsImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public ErlangExpression getExpression() {
    return findChildByClass(ErlangExpression.class);
  }

  @Override
  @Nullable
  public ErlangTypedExpr getTypedExpr() {
    return findChildByClass(ErlangTypedExpr.class);
  }

  @Override
  @Nullable
  public ErlangTypedExprs getTypedExprs() {
    return findChildByClass(ErlangTypedExprs.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ErlangVisitor) ((ErlangVisitor)visitor).visitTypedExprs(this);
    else super.accept(visitor);
  }

}
