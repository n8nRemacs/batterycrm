package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class plh implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ umh b;
    public final /* synthetic */ qlh c;

    public /* synthetic */ plh(qlh qlhVar, umh umhVar, int i) {
        this.a = i;
        this.c = qlhVar;
        this.b = umhVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        lrd lrdVar;
        switch (this.a) {
            case 0:
                qlh qlhVar = this.c;
                lrdVar = qlhVar.a;
                lrdVar.c();
                try {
                    qlhVar.b.B(this.b);
                    lrdVar.q();
                    lrdVar.k();
                    return qqg.a;
                } finally {
                }
            default:
                qlh qlhVar2 = this.c;
                lrdVar = qlhVar2.a;
                lrdVar.c();
                try {
                    qlhVar2.c.A(this.b);
                    lrdVar.q();
                    lrdVar.k();
                    return qqg.a;
                } finally {
                }
        }
    }
}
