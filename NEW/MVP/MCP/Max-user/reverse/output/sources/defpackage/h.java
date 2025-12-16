package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class h implements di4 {
    public static final h a = new h();
    public static final i b = i.b;

    @Override // defpackage.di4
    public final ki4 a() {
        return b;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        if (!b.a.contains(gi4Var)) {
            return null;
        }
        if (gi4Var.equals(i.c)) {
            return new ni4(str, gi4Var, bundle, 1, null, new g(0), 16);
        }
        throw new IllegalStateException(az1.h("Unknown route=", gi4Var));
    }
}
