package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class nv3 implements p6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nv3(int i, long j, long j2, Object obj) {
        this.a = i;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.p6
    public final void run() {
        switch (this.a) {
            case 0:
                ((qv3) this.d).c(this.b, new t00(this.c, 2));
                return;
            default:
                hs5 hs5Var = (hs5) this.d;
                long j = this.b;
                long j2 = this.c;
                lrd lrdVar = hs5Var.a;
                lrdVar.c();
                try {
                    ArrayList arrayListC = hs5Var.c();
                    int iIndexOf = arrayListC.indexOf(Long.valueOf(j));
                    int iIndexOf2 = arrayListC.indexOf(Long.valueOf(j2));
                    if (iIndexOf >= 0 && iIndexOf2 >= 0) {
                        Object obj = arrayListC.get(iIndexOf);
                        arrayListC.remove(iIndexOf);
                        arrayListC.add(iIndexOf2, obj);
                        hs5Var.a(arrayListC);
                    }
                    lrdVar.q();
                    return;
                } finally {
                    lrdVar.k();
                }
        }
    }
}
