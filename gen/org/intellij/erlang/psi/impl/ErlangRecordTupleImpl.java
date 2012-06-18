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

public class ErlangRecordTupleImpl extends ErlangCompositeElementImpl implements ErlangRecordTuple {

  public ErlangRecordTupleImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<ErlangRecordField> getRecordFieldList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ErlangRecordField.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ErlangVisitor) ((ErlangVisitor)visitor).visitRecordTuple(this);
    else super.accept(visitor);
  }

}
