package defpackage;

import one.me.sdk.design.theme.ChromaIllegalApplyThemeException;

/* loaded from: classes.dex */
public final class cxa extends p0 implements a84 {
    @Override // defpackage.a84
    public final void i(x74 x74Var, Throwable th) {
        ChromaIllegalApplyThemeException chromaIllegalApplyThemeException = th instanceof ChromaIllegalApplyThemeException ? (ChromaIllegalApplyThemeException) th : null;
        if (chromaIllegalApplyThemeException == null) {
            chromaIllegalApplyThemeException = new ChromaIllegalApplyThemeException(th);
        }
        t1b.a.d().a("ONEME-8759", chromaIllegalApplyThemeException);
    }
}
