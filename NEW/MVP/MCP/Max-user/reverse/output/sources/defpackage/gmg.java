package defpackage;

import android.os.Bundle;
import one.me.settings.twofa.password.TwoFACheckPassScreen;

/* loaded from: classes2.dex */
public final class gmg implements di4 {
    public static final gmg a = new gmg();
    public static final hmg b = hmg.b;

    @Override // defpackage.di4
    public final ki4 a() {
        return b;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        mi4 cqeVar;
        mi4 k61Var;
        if (!b.a.contains(gi4Var)) {
            return null;
        }
        hmg.b.getClass();
        if (!gi4Var.equals(hmg.c)) {
            if (gi4Var.equals(hmg.d)) {
                k61Var = new k61(l8j.k("src", bundle), 3, l8j.k("track_id", bundle));
            } else if (gi4Var.equals(hmg.e)) {
                cqeVar = new xre(7);
            } else if (gi4Var.equals(hmg.g)) {
                final String strK = l8j.k("track_id", bundle);
                final String strK2 = l8j.k("phone", bundle);
                final String string = bundle.getString("hint");
                final String string2 = bundle.getString("email");
                Integer numC = l8j.c("p_mn_l", bundle);
                final int iIntValue = numC != null ? numC.intValue() : 1;
                Integer numC2 = l8j.c("p_mx_l", bundle);
                final int iIntValue2 = numC2 != null ? numC2.intValue() : Integer.MAX_VALUE;
                Integer numC3 = l8j.c("h_mx_l", bundle);
                final int iIntValue3 = numC3 != null ? numC3.intValue() : Integer.MAX_VALUE;
                k61Var = new mi4() { // from class: fmg
                    @Override // defpackage.mi4
                    public final Object a() {
                        return new TwoFACheckPassScreen("AUTH", strK, new up7(null, string, new tp7(0, 14, 0L, string2, null), strK2, new zkg(iIntValue, iIntValue2, iIntValue3), 1));
                    }
                };
            } else {
                if (!gi4Var.equals(hmg.f)) {
                    wqi.e(gmg.class.getName(), ho7.h("invalid route ", gi4Var), new IllegalArgumentException(ho7.h("invalid route ", gi4Var)));
                    return null;
                }
                cqeVar = new cqe(bundle.getString("hint"), 2);
            }
            return new ni4(str, gi4Var, bundle, 0, null, k61Var, 24);
        }
        cqeVar = new cqe(l8j.k("state", bundle), 1);
        k61Var = cqeVar;
        return new ni4(str, gi4Var, bundle, 0, null, k61Var, 24);
    }
}
