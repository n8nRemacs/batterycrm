package defpackage;

import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes2.dex */
public final /* synthetic */ class dr5 implements tm6, gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ dr5(int i, long j, boolean z) {
        this.a = i;
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        int i = this.a;
        boolean z = this.c;
        long j = this.b;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 2:
                Locale locale = Locale.ENGLISH;
                wqi.e("vr5", "markAsFavorite: failed for setId=" + j + " favorite=" + z, th);
                break;
            default:
                Locale locale2 = Locale.ENGLISH;
                wqi.e("ps5", "markAsFavorite: failed for stickerId=" + j + " favorite=" + z, th);
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                final qs5 qs5Var = (qs5) obj;
                final int i = 0;
                final boolean z = this.c;
                final long j = this.b;
                return new kk3(1, new p6() { // from class: fr5
                    @Override // defpackage.p6
                    public final void run() {
                        switch (i) {
                            case 0:
                                qs5 qs5Var2 = (qs5) qs5Var;
                                lrd lrdVar = qs5Var2.a;
                                lrdVar.c();
                                try {
                                    ArrayList arrayListC = qs5Var2.c();
                                    long j2 = j;
                                    if (z) {
                                        if (arrayListC.indexOf(Long.valueOf(j2)) == -1) {
                                            arrayListC.add(0, Long.valueOf(j2));
                                            qs5Var2.a(arrayListC);
                                        }
                                    } else if (arrayListC.remove(Long.valueOf(j2))) {
                                        qs5Var2.a(arrayListC);
                                    }
                                    lrdVar.q();
                                    return;
                                } finally {
                                    lrdVar.k();
                                }
                            default:
                                hs5 hs5Var = (hs5) qs5Var;
                                lrd lrdVar2 = hs5Var.a;
                                lrdVar2.c();
                                try {
                                    ArrayList arrayListC2 = hs5Var.c();
                                    long j3 = j;
                                    if (z) {
                                        if (arrayListC2.indexOf(Long.valueOf(j3)) == -1) {
                                            arrayListC2.add(0, Long.valueOf(j3));
                                            hs5Var.a(arrayListC2);
                                        }
                                    } else if (arrayListC2.remove(Long.valueOf(j3))) {
                                        hs5Var.a(arrayListC2);
                                    }
                                    lrdVar2.q();
                                    return;
                                } finally {
                                    lrdVar2.k();
                                }
                        }
                    }
                });
            case 1:
                return new ik3(((zr5) obj).a(), 2, new dr5(3, this.b, this.c));
            default:
                final hs5 hs5Var = (hs5) obj;
                final int i2 = 1;
                final boolean z2 = this.c;
                final long j2 = this.b;
                return new kk3(1, new p6() { // from class: fr5
                    @Override // defpackage.p6
                    public final void run() {
                        switch (i2) {
                            case 0:
                                qs5 qs5Var2 = (qs5) hs5Var;
                                lrd lrdVar = qs5Var2.a;
                                lrdVar.c();
                                try {
                                    ArrayList arrayListC = qs5Var2.c();
                                    long j22 = j2;
                                    if (z2) {
                                        if (arrayListC.indexOf(Long.valueOf(j22)) == -1) {
                                            arrayListC.add(0, Long.valueOf(j22));
                                            qs5Var2.a(arrayListC);
                                        }
                                    } else if (arrayListC.remove(Long.valueOf(j22))) {
                                        qs5Var2.a(arrayListC);
                                    }
                                    lrdVar.q();
                                    return;
                                } finally {
                                    lrdVar.k();
                                }
                            default:
                                hs5 hs5Var2 = (hs5) hs5Var;
                                lrd lrdVar2 = hs5Var2.a;
                                lrdVar2.c();
                                try {
                                    ArrayList arrayListC2 = hs5Var2.c();
                                    long j3 = j2;
                                    if (z2) {
                                        if (arrayListC2.indexOf(Long.valueOf(j3)) == -1) {
                                            arrayListC2.add(0, Long.valueOf(j3));
                                            hs5Var2.a(arrayListC2);
                                        }
                                    } else if (arrayListC2.remove(Long.valueOf(j3))) {
                                        hs5Var2.a(arrayListC2);
                                    }
                                    lrdVar2.q();
                                    return;
                                } finally {
                                    lrdVar2.k();
                                }
                        }
                    }
                });
        }
    }
}
