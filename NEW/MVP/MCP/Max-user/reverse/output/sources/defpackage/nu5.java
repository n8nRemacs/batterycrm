package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class nu5 implements af4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nu5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g(pe4 pe4Var) {
    }

    private final void h(pe4 pe4Var) {
    }

    private final void i(pe4 pe4Var) {
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, k18] */
    @Override // defpackage.af4
    public final void a(pe4 pe4Var) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                zd7 zd7Var = (zd7) this.b;
                r0 r0Var = (r0) pe4Var;
                float fC = r0Var.c();
                boolean z = (r0Var.g() || r0Var.f()) ? false : true;
                if (fC < 0.99f && z) {
                    if (!Looper.getMainLooper().isCurrentThread()) {
                        Handler handler = zd7Var.getHandler();
                        if (handler == null) {
                            zd7Var.post(new xd7(zd7Var, fC, 1));
                            break;
                        } else {
                            handler.postAtFrontOfQueue(new xd7(zd7Var, fC, 0));
                            break;
                        }
                    } else {
                        zd7Var.setRemoteImageState(rd7.a);
                        ?? r5 = zd7Var.M0;
                        if (r5.e()) {
                            ((r00) r5.getValue()).setLevel(kti.d(fC * 10000));
                            break;
                        }
                    }
                }
                break;
            default:
                qpd qpdVar = (qpd) this.b;
                if (pe4Var == qpdVar.h) {
                    qpdVar.j(((r0) pe4Var).c());
                    break;
                }
                break;
        }
    }

    @Override // defpackage.af4
    public final void b(pe4 pe4Var) {
        switch (this.a) {
            case 0:
                l42 l42Var = (l42) this.b;
                if (l42Var.r()) {
                    Throwable thB = ((r0) pe4Var).b();
                    if (thB == null) {
                        thB = new IllegalStateException("fail");
                    }
                    l42Var.resumeWith(new ipd(thB));
                    break;
                }
                break;
            case 1:
                break;
            default:
                ((qpd) this.b).getClass();
                break;
        }
    }

    @Override // defpackage.af4
    public final void c() {
        switch (this.a) {
            case 0:
                l42 l42Var = (l42) this.b;
                if (l42Var.r()) {
                    l42Var.h(null);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.af4
    public final void d(pe4 pe4Var) {
        switch (this.a) {
            case 0:
                l42 l42Var = (l42) this.b;
                if (!l42Var.isCancelled() && ((r0) pe4Var).g()) {
                    l42Var.resumeWith(pe4Var.d());
                    break;
                }
                break;
            case 1:
                break;
            default:
                qpd qpdVar = (qpd) this.b;
                if (!pe4Var.e()) {
                    ((r0) pe4Var).g();
                    break;
                } else if (pe4Var == qpdVar.h) {
                    qpdVar.k(null, false, ((r0) pe4Var).a);
                    break;
                }
                break;
        }
    }
}
