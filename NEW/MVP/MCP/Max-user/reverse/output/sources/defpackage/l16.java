package defpackage;

import android.content.Context;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class l16 implements cp0, yf, p2g, b85 {
    public static final l16 X;
    public static final l16 Y;
    public static final l16 c;
    public static final l16 d;
    public static final l16 o;
    public final /* synthetic */ int a;
    public int b;

    static {
        int i = 0;
        c = new l16(i, 1);
        d = new l16(i, 2);
        int i2 = 3;
        o = new l16(i, i2);
        X = new l16(1, i2);
        Y = new l16(2, i2);
    }

    @Override // defpackage.b85
    public int a(Context context, String str, boolean z) {
        return 0;
    }

    @Override // defpackage.yf
    public int b() {
        int i = 1 - this.b;
        this.b = i;
        return i;
    }

    @Override // defpackage.b85
    public int c(Context context, String str) {
        return this.b;
    }

    public int d(int i) {
        int i2 = this.b;
        int i3 = i % i2;
        Integer numValueOf = Integer.valueOf(i3);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i3 + i2;
    }

    @Override // defpackage.cp0
    public void e() {
    }

    @Override // defpackage.cp0
    public vc3 f(int i, int i2, int i3) {
        return null;
    }

    @Override // defpackage.cp0
    public void g() {
    }

    @Override // defpackage.cp0
    public void h(hk4 hk4Var, bp0 bp0Var, uo0 uo0Var, int i) {
        hk4 hk4Var2;
        bp0 bp0Var2;
        uo0 uo0Var2;
        int i2 = this.b;
        int i3 = 1;
        if (1 > i2) {
            return;
        }
        while (true) {
            int iP = (i + i3) % uo0Var.c.p();
            if (op5.a.h(2)) {
                op5.e(l16.class, "Preparing frame %d, last drawn: %d", Integer.valueOf(iP), Integer.valueOf(i));
            }
            int iHashCode = (uo0Var.hashCode() * 31) + iP;
            synchronized (((SparseArray) hk4Var.o)) {
                if (((SparseArray) hk4Var.o).get(iHashCode) != null) {
                    op5.d(hk4.class, Integer.valueOf(iP), "Already scheduled decode job for frame %d");
                } else if (bp0Var.d(iP)) {
                    op5.d(hk4.class, Integer.valueOf(iP), "Frame %d is cached already.");
                } else {
                    hk4Var2 = hk4Var;
                    bp0Var2 = bp0Var;
                    uo0Var2 = uo0Var;
                    gk4 gk4Var = new gk4(hk4Var2, uo0Var2, bp0Var2, iP, iHashCode);
                    ((SparseArray) hk4Var2.o).put(iHashCode, gk4Var);
                    ((ExecutorService) hk4Var2.d).execute(gk4Var);
                }
                hk4Var2 = hk4Var;
                bp0Var2 = bp0Var;
                uo0Var2 = uo0Var;
            }
            if (i3 == i2) {
                return;
            }
            i3++;
            hk4Var = hk4Var2;
            uo0Var = uo0Var2;
            bp0Var = bp0Var2;
        }
    }

    @Override // defpackage.cp0
    public void i(int i, int i2) {
    }

    public boolean j(int i) {
        int i2 = this.b;
        return i2 != 0 && (i2 & i) == i;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "Restrictions{restrictions=" + this.b + ", cannotInvite=" + j(1) + ", cannotModifyIcon=" + j(2) + ", cannotModifyTitle=" + j(4) + ", cannotLeave=" + j(8) + ", cannotPin=" + j(16) + ", cannotLiveLocation=" + j(32) + ", cannotInput=" + j(64) + ", cannotStartAndStopBot=" + j(128) + ", cannotComplain=" + j(256) + ", cannotDeleteMessage=" + j(512) + ", cannotDeleteChat=" + j(1024) + ", cannotHideChat=" + j(2048) + ", cannotClearChat=" + j(4096) + '}';
            case 3:
                return wy1.e(this.b, "{value=", "}");
            case 8:
                return String.format(null, "Status: %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.b)}, 1));
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l16(int i, int i2) {
        this.a = i2;
        this.b = i;
    }
}
