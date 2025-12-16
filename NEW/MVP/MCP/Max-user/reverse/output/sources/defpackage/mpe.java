package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class mpe implements di4 {
    public static final mpe a = new mpe();
    public static final npe b = npe.b;

    @Override // defpackage.di4
    public final ki4 a() {
        return b;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        if (!b.a.contains(gi4Var)) {
            return null;
        }
        npe.b.getClass();
        if (gi4Var.equals(npe.c)) {
            return new ni4(str, gi4Var, bundle, 0, null, new g(28), 24);
        }
        wqi.e(mpe.class.getName(), ho7.h("invalid route ", gi4Var), new IllegalArgumentException(ho7.h("invalid route ", gi4Var)));
        return null;
    }
}
