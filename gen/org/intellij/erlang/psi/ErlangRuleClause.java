// This is a generated file. Not intended for manual editing.
package org.intellij.erlang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ErlangRuleClause extends ErlangCompositeElement {

  @NotNull
  ErlangArgumentList getArgumentList();

  @Nullable
  ErlangGuard getGuard();

  @NotNull
  ErlangQAtom getQAtom();

  @NotNull
  ErlangRuleBody getRuleBody();

  @Nullable
  PsiElement getWhen();

}
