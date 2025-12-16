package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class pq implements di4 {
    public static final pq a = new pq();
    public static final qq b = qq.b;

    @Override // defpackage.di4
    public final ki4 a() {
        return b;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        if (!b.a.contains(gi4Var)) {
            return null;
        }
        if (gi4Var.equals(qq.c)) {
            return new ni4(str, gi4Var, bundle, 1, null, new g(1), 16);
        }
        throw new IllegalStateException(az1.h("Unknown route=", gi4Var));
    }
}
