package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class ir5 implements tm6, xu {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ ir5(int i, int i2, long j) {
        this.a = i2;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                final qs5 qs5Var = (qs5) obj;
                final int i = 0;
                final long j = this.b;
                final int i2 = this.c;
                return new kk3(1, new p6() { // from class: jr5
                    @Override // defpackage.p6
                    public final void run() {
                        int i3;
                        int i4;
                        switch (i) {
                            case 0:
                                qs5 qs5Var2 = (qs5) qs5Var;
                                long j2 = j;
                                lrd lrdVar = qs5Var2.a;
                                lrdVar.c();
                                try {
                                    ArrayList arrayListC = qs5Var2.c();
                                    int iIndexOf = arrayListC.indexOf(Long.valueOf(j2));
                                    if (iIndexOf >= 0 && (i3 = i2) >= 0 && i3 < arrayListC.size()) {
                                        Object obj2 = arrayListC.get(iIndexOf);
                                        arrayListC.remove(iIndexOf);
                                        arrayListC.add(i3, obj2);
                                        qs5Var2.a(arrayListC);
                                    }
                                    lrdVar.q();
                                    return;
                                } finally {
                                    lrdVar.k();
                                }
                            default:
                                hs5 hs5Var = (hs5) qs5Var;
                                long j3 = j;
                                lrd lrdVar2 = hs5Var.a;
                                lrdVar2.c();
                                try {
                                    ArrayList arrayListC2 = hs5Var.c();
                                    int iIndexOf2 = arrayListC2.indexOf(Long.valueOf(j3));
                                    if (iIndexOf2 >= 0 && (i4 = i2) >= 0 && i4 < arrayListC2.size()) {
                                        Object obj3 = arrayListC2.get(iIndexOf2);
                                        arrayListC2.remove(iIndexOf2);
                                        arrayListC2.add(i4, obj3);
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
                return new ik3(((zr5) obj).a(), 2, new ir5(this.c, 2, this.b));
            default:
                final hs5 hs5Var = (hs5) obj;
                final int i3 = 1;
                final long j2 = this.b;
                final int i4 = this.c;
                return new kk3(1, new p6() { // from class: jr5
                    @Override // defpackage.p6
                    public final void run() {
                        int i32;
                        int i42;
                        switch (i3) {
                            case 0:
                                qs5 qs5Var2 = (qs5) hs5Var;
                                long j22 = j2;
                                lrd lrdVar = qs5Var2.a;
                                lrdVar.c();
                                try {
                                    ArrayList arrayListC = qs5Var2.c();
                                    int iIndexOf = arrayListC.indexOf(Long.valueOf(j22));
                                    if (iIndexOf >= 0 && (i32 = i4) >= 0 && i32 < arrayListC.size()) {
                                        Object obj2 = arrayListC.get(iIndexOf);
                                        arrayListC.remove(iIndexOf);
                                        arrayListC.add(i32, obj2);
                                        qs5Var2.a(arrayListC);
                                    }
                                    lrdVar.q();
                                    return;
                                } finally {
                                    lrdVar.k();
                                }
                            default:
                                hs5 hs5Var2 = (hs5) hs5Var;
                                long j3 = j2;
                                lrd lrdVar2 = hs5Var2.a;
                                lrdVar2.c();
                                try {
                                    ArrayList arrayListC2 = hs5Var2.c();
                                    int iIndexOf2 = arrayListC2.indexOf(Long.valueOf(j3));
                                    if (iIndexOf2 >= 0 && (i42 = i4) >= 0 && i42 < arrayListC2.size()) {
                                        Object obj3 = arrayListC2.get(iIndexOf2);
                                        arrayListC2.remove(iIndexOf2);
                                        arrayListC2.add(i42, obj3);
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

    public /* synthetic */ ir5(int i, long j) {
        this.a = 3;
        this.c = i;
        this.b = j;
    }

    @Override // defpackage.tm6
    public ha8 apply(Object obj) {
        return a6a.c(new v69(this.c, this.b, (List) obj));
    }
}
