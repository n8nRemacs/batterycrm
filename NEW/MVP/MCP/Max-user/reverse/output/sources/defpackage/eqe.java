package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class eqe implements di4 {
    public static final eqe a = new eqe();
    public static final fqe b = fqe.b;

    @Override // defpackage.di4
    public final ki4 a() {
        return b;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        mi4 cqeVar;
        mi4 mi4Var;
        if (!b.a.contains(gi4Var)) {
            return null;
        }
        fqe.b.getClass();
        if (gi4Var.equals(fqe.c)) {
            mi4Var = dqe.b;
        } else if (gi4Var.equals(fqe.d)) {
            mi4Var = dqe.c;
        } else if (gi4Var.equals(fqe.e)) {
            mi4Var = dqe.d;
        } else {
            if (!gi4Var.equals(fqe.f)) {
                wqi.e(eqe.class.getName(), ho7.h("invalid route ", gi4Var), new IllegalArgumentException(ho7.h("invalid route ", gi4Var)));
                return null;
            }
            String strK = l8j.k("mode", bundle);
            if (!strK.equals("setup")) {
                if (!strK.equals("confirm")) {
                    throw new IllegalStateException("illegal mode");
                }
                cqeVar = new cqe(l8j.k("hash", bundle), 0);
                return new ni4(str, gi4Var, bundle, 0, null, cqeVar, 24);
            }
            mi4Var = dqe.o;
        }
        cqeVar = mi4Var;
        return new ni4(str, gi4Var, bundle, 0, null, cqeVar, 24);
    }
}
