package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class jre implements di4 {
    public static final jre a = new jre();
    public static final kre b = kre.b;

    @Override // defpackage.di4
    public final ki4 a() {
        return b;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        if (!b.a.contains(gi4Var)) {
            return null;
        }
        kre.b.getClass();
        if (gi4Var.equals(kre.c)) {
            return new ni4(str, gi4Var, bundle, 0, null, new g(29), 24);
        }
        wqi.e(jre.class.getName(), ho7.h("invalid route ", gi4Var), new IllegalArgumentException(ho7.h("invalid route ", gi4Var)));
        return null;
    }
}
