package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class v0i implements di4 {
    public static final v0i a = new v0i();
    public static final w0i b = w0i.b;

    @Override // defpackage.di4
    public final ki4 a() {
        return b;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        if (!b.a.contains(gi4Var)) {
            return null;
        }
        w0i.b.getClass();
        if (gi4Var.equals(w0i.c)) {
            return new ni4(str, gi4Var, bundle, 1, null, new xre(9), 16);
        }
        wqi.e(v0i.class.getName(), ho7.h("invalid route ", gi4Var), new IllegalArgumentException(ho7.h("invalid route ", gi4Var)));
        return null;
    }
}
