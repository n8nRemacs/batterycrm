package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class vif implements di4 {
    public static final vif a = new vif();
    public static final wif b = wif.b;

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
        Long lD = l8j.d("set_id", bundle);
        long jLongValue = lD != null ? lD.longValue() : -1L;
        wif.b.getClass();
        if (gi4Var.equals(wif.c)) {
            xreVar = new xre(4);
        } else if (gi4Var.equals(wif.d)) {
            xreVar = new xre(5);
        } else {
            if (!gi4Var.equals(wif.e)) {
                if (!gi4Var.equals(wif.f)) {
                    throw new IllegalStateException(az1.h("invalid route ", gi4Var));
                }
                w91Var = new w91(jLongValue, 9);
                return new ni4(str, gi4Var, bundle, 1, null, w91Var, 16);
            }
            xreVar = new xre(6);
        }
        w91Var = xreVar;
        return new ni4(str, gi4Var, bundle, 1, null, w91Var, 16);
    }
}
