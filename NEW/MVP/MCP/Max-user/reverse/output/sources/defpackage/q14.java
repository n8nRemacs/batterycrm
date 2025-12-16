package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class q14 implements di4 {
    public final /* synthetic */ int a;
    public final k18 b;

    public /* synthetic */ q14(k18 k18Var, int i) {
        this.a = i;
        this.b = k18Var;
    }

    @Override // defpackage.di4
    public final ki4 a() {
        switch (this.a) {
            case 0:
                return r14.b;
            default:
                return (xl8) this.b.getValue();
        }
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        ni4 ni4Var;
        mi4 n14Var;
        switch (this.a) {
            case 0:
                if (!r14.b.a.contains(gi4Var)) {
                    return null;
                }
                if (gi4Var.equals(r14.c)) {
                    n14Var = new g(9);
                } else {
                    if (!gi4Var.equals(r14.d)) {
                        if (!gi4Var.equals(r14.e)) {
                            throw new IllegalStateException(az1.h("unknown route ", gi4Var));
                        }
                        ni4Var = new ni4(str, gi4Var, bundle, 0, null, new g(10), 24);
                        return ni4Var;
                    }
                    n14Var = new n14(0, this);
                }
                ni4Var = new ni4(str, gi4Var, bundle, 3, null, n14Var, 16);
                return ni4Var;
            default:
                if (!((xl8) this.b.getValue()).a.contains(gi4Var)) {
                    return null;
                }
                xl8.b.getClass();
                if (gi4Var.equals(xl8.c) || gi4Var.equals(xl8.d) || gi4Var.equals(xl8.e) || gi4Var.equals(xl8.f)) {
                    return new ni4(str, gi4Var, bundle, 0, null, new k61(gi4Var, 2, bundle), 24);
                }
                throw new IllegalStateException(az1.h("unknown route ", gi4Var));
        }
    }
}
