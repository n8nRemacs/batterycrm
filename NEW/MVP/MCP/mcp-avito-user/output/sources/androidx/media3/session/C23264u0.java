package androidx.media3.session;

import android.os.RemoteException;
import android.view.Surface;
import androidx.media3.common.H;
import androidx.media3.common.util.InterfaceC23119j;
import androidx.media3.common.util.r;
import androidx.media3.session.A1;
import androidx.media3.session.AbstractServiceC23270w0;
import androidx.media3.session.BinderC23267v0;
import androidx.media3.session.O0;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.util.concurrent.C37568u0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23264u0 implements BinderC23267v0.a, A1.e, InterfaceC23119j, A1.b, r.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52638b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52639c;

    public /* synthetic */ C23264u0(A1 a12, O0.g gVar) {
        this.f52638b = 3;
        this.f52639c = a12;
    }

    @Override // androidx.media3.session.BinderC23267v0.a
    public void a(C23229i0 c23229i0) throws RemoteException {
        Object obj = this.f52639c;
        switch (this.f52638b) {
            case 0:
                int i12 = BinderC23267v0.f52647p;
                if (c23229i0.f52513v != null) {
                    androidx.media3.common.util.s.c();
                    c23229i0.c0().release();
                    break;
                } else {
                    C23234k c23234k = (C23234k) obj;
                    c23229i0.f52513v = c23234k.f52556d;
                    c23229i0.f52507p = c23234k.f52558f;
                    H.c cVar = c23234k.f52559g;
                    c23229i0.f52508q = cVar;
                    H.c cVar2 = c23234k.f52560h;
                    c23229i0.f52509r = cVar2;
                    H.c cVarG = C23229i0.G(cVar, cVar2);
                    c23229i0.f52510s = cVarG;
                    c23229i0.f52506o = C23229i0.b0(c23234k.f52563k, cVarG, c23229i0.f52507p);
                    c23229i0.f52505n = c23234k.f52562j;
                    try {
                        c23234k.f52556d.asBinder().linkToDeath(c23229i0.f52498g, 0);
                        P1 p12 = c23229i0.f52496e;
                        c23229i0.f52502k = new P1(p12.f52238b.c(), c23234k.f52554b, c23234k.f52555c, p12.f52238b.getPackageName(), c23234k.f52556d, c23234k.f52561i);
                        c23229i0.c0().Y();
                        break;
                    } catch (RemoteException unused) {
                        c23229i0.c0().release();
                        return;
                    }
                }
            default:
                int i13 = BinderC23267v0.f52647p;
                if (c23229i0.isConnected() && c23229i0.f52501j.isEmpty()) {
                    N1 n12 = c23229i0.f52505n.f51977d;
                    N1 n13 = (N1) obj;
                    if (n12.f52192d < n13.f52192d && C1.a(n13, n12)) {
                        c23229i0.f52505n = c23229i0.f52505n.m(n13);
                        break;
                    }
                }
                break;
        }
    }

    @Override // androidx.media3.common.util.InterfaceC23119j
    public void accept(Object obj) {
        Object obj2 = this.f52639c;
        G1 g12 = (G1) obj;
        switch (this.f52638b) {
            case 3:
                T0 t02 = ((A1) obj2).f51916b.get();
                if (t02 != null && !t02.f() && t02.h()) {
                    if (g12.a0() != 0) {
                        androidx.media3.common.util.M.z(g12);
                        break;
                    } else {
                        t02.j(g12);
                        break;
                    }
                }
                break;
            default:
                int i12 = A1.f51915u;
                g12.I((Surface) obj2);
                break;
        }
    }

    @Override // androidx.media3.session.A1.b
    public void b(G1 g12, O0.g gVar) {
        int i12 = A1.f51915u;
        ((InterfaceC23119j) this.f52639c).accept(g12);
    }

    @Override // androidx.media3.session.A1.e
    public Object d(T0 t02, O0.g gVar, int i12) {
        Object obj = this.f52639c;
        switch (this.f52638b) {
            case 2:
                int i13 = A1.f51915u;
                return t02.f52290d.b((AbstractC37401r1) obj);
            case 5:
                int i14 = A1.f51915u;
                return ((G0) t02).p(gVar, (AbstractServiceC23270w0.b) obj);
            default:
                int i15 = A1.f51915u;
                if (t02.f()) {
                    return C37568u0.e();
                }
                ((A1.b) obj).b(t02.f52302p, gVar);
                A1.k4(gVar, i12, new O1(0));
                return C37568u0.e();
        }
    }

    @Override // androidx.media3.common.util.r.a
    public void invoke(Object obj) {
        ((H.g) obj).z((androidx.media3.common.U) this.f52639c);
    }

    public /* synthetic */ C23264u0(Object obj, int i12) {
        this.f52638b = i12;
        this.f52639c = obj;
    }
}
