package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class ih8 implements di4 {
    public static final ih8 a = new ih8();
    public static final jh8 b = jh8.b;

    @Override // defpackage.di4
    public final ki4 a() {
        return b;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        mi4 w91Var;
        if (!b.a.contains(gi4Var)) {
            return null;
        }
        if (gi4Var.equals(jh8.c)) {
            w91Var = new g(21);
        } else {
            if (!gi4Var.equals(jh8.d)) {
                throw new IllegalStateException(az1.h("invalid route ", gi4Var));
            }
            w91Var = new w91(l8j.i("id", bundle), 3);
        }
        return new ni4(str, gi4Var, bundle, 0, null, w91Var, 24);
    }
}
