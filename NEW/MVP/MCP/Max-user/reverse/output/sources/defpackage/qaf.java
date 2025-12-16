package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class qaf implements di4 {
    public static final qaf a = new qaf();
    public static final saf b = saf.b;

    @Override // defpackage.di4
    public final ki4 a() {
        return b;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        mi4 w91Var;
        mi4 xreVar;
        if (!b.a.contains(gi4Var)) {
            return null;
        }
        saf.b.getClass();
        if (gi4Var.equals(saf.c)) {
            xreVar = new xre(1);
        } else if (gi4Var.equals(saf.d)) {
            xreVar = new xre(2);
        } else {
            if (!gi4Var.equals(saf.e)) {
                if (gi4Var.equals(saf.f)) {
                    w91Var = new n14(1, l8j.e("ids", bundle));
                } else {
                    if (!gi4Var.equals(saf.g)) {
                        wqi.e(qaf.class.getName(), ho7.h("invalid route ", gi4Var), new IllegalArgumentException(ho7.h("invalid route ", gi4Var)));
                        return null;
                    }
                    w91Var = new w91(l8j.i("id", bundle), 8);
                }
                return new ni4(str, gi4Var, bundle, 1, null, w91Var, 16);
            }
            xreVar = new xre(3);
        }
        w91Var = xreVar;
        return new ni4(str, gi4Var, bundle, 1, null, w91Var, 16);
    }
}
