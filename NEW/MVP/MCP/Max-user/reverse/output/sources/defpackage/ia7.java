package defpackage;

import android.os.Looper;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class ia7 extends nk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ia7(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.nk0
    public final void a() {
        boolean zRemove;
        ArrayList arrayList;
        mk0 mk0Var;
        ArrayList arrayListL;
        ArrayList arrayListJ;
        ce5 ce5Var;
        switch (this.a) {
            case 0:
                if (((Future) this.b).cancel(false)) {
                    tu5 tu5Var = (tu5) ((i5i) this.c).a;
                    tu5Var.a().k(tu5Var.b, "NetworkFetchProducer");
                    tu5Var.a.c();
                    return;
                }
                return;
            case 1:
                synchronized (((g7a) this.c)) {
                    try {
                        zRemove = ((g7a) this.c).b.remove((Pair) this.b);
                        arrayList = null;
                        if (!zRemove) {
                            mk0Var = null;
                            arrayListL = null;
                        } else if (((g7a) this.c).b.isEmpty()) {
                            mk0Var = ((g7a) this.c).f;
                            arrayListL = null;
                        } else {
                            ArrayList arrayListK = ((g7a) this.c).k();
                            arrayListL = ((g7a) this.c).l();
                            arrayListJ = ((g7a) this.c).j();
                            mk0Var = null;
                            arrayList = arrayListK;
                        }
                        arrayListJ = arrayListL;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                mk0.c(arrayList);
                mk0.d(arrayListL);
                mk0.b(arrayListJ);
                if (mk0Var != null) {
                    mk0Var.e();
                }
                if (zRemove) {
                    ((hj0) ((Pair) this.b).first).c();
                    return;
                }
                return;
            case 2:
                wnd wndVar = (wnd) this.c;
                gu7 gu7Var = wndVar.g;
                synchronized (gu7Var) {
                    ce5Var = gu7Var.e;
                    gu7Var.e = null;
                    gu7Var.f = 0;
                }
                ce5.d(ce5Var);
                wndVar.f = true;
                ((hj0) this.b).c();
                return;
            case 3:
                mbd mbdVar = (mbd) this.b;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    mbdVar.d();
                    return;
                } else {
                    ((h0g) this.c).e.execute(new bee(18, mbdVar));
                    return;
                }
            default:
                fd8 fd8Var = (fd8) this.b;
                fd8Var.a();
                aqc aqcVar = (aqc) ((p7g) this.c).c;
                synchronized (aqcVar) {
                    ((ArrayDeque) aqcVar.c).remove(fd8Var);
                }
                return;
        }
    }

    @Override // defpackage.nk0
    public void b() {
        switch (this.a) {
            case 1:
                mk0.b(((g7a) this.c).j());
                break;
            case 2:
                wnd wndVar = (wnd) this.c;
                if (((mk0) wndVar.e).f()) {
                    wndVar.g.c();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.nk0
    public void c() {
        switch (this.a) {
            case 1:
                mk0.c(((g7a) this.c).k());
                break;
        }
    }

    @Override // defpackage.nk0
    public void d() {
        switch (this.a) {
            case 1:
                mk0.d(((g7a) this.c).l());
                break;
        }
    }

    public /* synthetic */ ia7(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
