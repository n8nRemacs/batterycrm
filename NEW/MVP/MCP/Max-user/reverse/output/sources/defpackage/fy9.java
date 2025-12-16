package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class fy9 implements di4 {
    public static final fy9 a = new fy9();
    public static final gy9 b = gy9.b;

    @Override // defpackage.di4
    public final ki4 a() {
        return b;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        if (!b.a.contains(gi4Var)) {
            return null;
        }
        gy9.b.getClass();
        if (gi4Var.equals(gy9.c)) {
            return new ni4(str, gi4Var, bundle, 0, null, new g(23), 24);
        }
        wqi.e(fy9.class.getName(), ho7.h("invalid route ", gi4Var), new IllegalArgumentException(ho7.h("invalid route ", gi4Var)));
        return null;
    }
}
