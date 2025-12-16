package androidx.media3.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.BinderC23095i;
import androidx.media3.common.H;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.P;
import androidx.media3.common.U;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.InterfaceC23119j;
import androidx.media3.common.util.r;
import androidx.media3.session.A1;
import androidx.media3.session.BinderC23267v0;
import androidx.media3.session.C23206a1;
import androidx.media3.session.C23229i0;
import androidx.media3.session.D1;
import androidx.media3.session.MediaControllerImplLegacy;
import androidx.media3.session.O0;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.AbstractC37412t1;
import com.google.common.collect.N4;
import com.google.common.collect.O4;
import com.google.common.util.concurrent.C37568u0;
import com.google.common.util.concurrent.InterfaceC37569v;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class N implements C23229i0.d, r.a, BinderC23267v0.a, C23206a1.g, InterfaceC23119j, A1.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52175c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f52176d;

    public /* synthetic */ N(int i12, Object obj, Object obj2) {
        this.f52174b = i12;
        this.f52175c = obj;
        this.f52176d = obj2;
    }

    @Override // androidx.media3.session.BinderC23267v0.a
    public void a(C23229i0 c23229i0) {
        D1.b bVar;
        boolean z12;
        boolean z13;
        Object obj = this.f52175c;
        Object obj2 = this.f52176d;
        switch (this.f52174b) {
            case 6:
                int i12 = BinderC23267v0.f52647p;
                if (c23229i0.isConnected()) {
                    D1 d12 = c23229i0.f52516y;
                    D1 d13 = (D1) obj;
                    D1.b bVar2 = (D1.b) obj2;
                    if (d12 != null && (bVar = c23229i0.f52517z) != null) {
                        Pair<D1, D1.b> pairD = C1.D(d12, bVar, d13, bVar2, c23229i0.f52510s);
                        D1 d14 = (D1) pairD.first;
                        bVar2 = (D1.b) pairD.second;
                        d13 = d14;
                    }
                    c23229i0.f52516y = null;
                    c23229i0.f52517z = null;
                    if (!c23229i0.f52501j.isEmpty()) {
                        c23229i0.f52516y = d13;
                        c23229i0.f52517z = bVar2;
                        break;
                    } else {
                        D1 d15 = c23229i0.f52505n;
                        D1 d16 = (D1) C1.D(d15, D1.b.f52031d, d13, bVar2, c23229i0.f52510s).first;
                        c23229i0.f52505n = d16;
                        c23229i0.l0(d15, d16, !d15.f51984k.equals(d16.f51984k) ? Integer.valueOf(d16.f51985l) : null, d15.f51994u != d16.f51994u ? Integer.valueOf(d16.f51995v) : null, (d15.f51978e.equals(d13.f51978e) && d15.f51979f.equals(d13.f51979f)) ? null : Integer.valueOf(d16.f51980g), !androidx.media3.common.util.M.a(d15.p(), d16.p()) ? Integer.valueOf(d16.f51976c) : null);
                        break;
                    }
                }
                break;
            default:
                int i13 = BinderC23267v0.f52647p;
                if (c23229i0.isConnected()) {
                    H.c cVar = (H.c) obj2;
                    boolean zA2 = androidx.media3.common.util.M.a(c23229i0.f52508q, cVar);
                    L1 l12 = (L1) obj;
                    boolean zA3 = androidx.media3.common.util.M.a(c23229i0.f52507p, l12);
                    if (!zA2 || !zA3) {
                        if (zA2) {
                            z12 = false;
                        } else {
                            c23229i0.f52508q = cVar;
                            H.c cVar2 = c23229i0.f52510s;
                            H.c cVarG = C23229i0.G(cVar, c23229i0.f52509r);
                            c23229i0.f52510s = cVarG;
                            z12 = !cVarG.equals(cVar2);
                        }
                        if (zA3) {
                            z13 = false;
                        } else {
                            c23229i0.f52507p = l12;
                            AbstractC37401r1<C23213d> abstractC37401r1 = c23229i0.f52506o;
                            AbstractC37401r1<C23213d> abstractC37401r1B0 = C23229i0.b0(abstractC37401r1, c23229i0.f52510s, l12);
                            c23229i0.f52506o = abstractC37401r1B0;
                            z13 = !abstractC37401r1B0.equals(abstractC37401r1);
                        }
                        if (z12) {
                            c23229i0.f52499h.f(13, new W(c23229i0, 8));
                        }
                        if (!zA3) {
                            J jC02 = c23229i0.c0();
                            jC02.getClass();
                            C23110a.g(Looper.myLooper() == jC02.f52080e.getLooper());
                            jC02.f52079d.getClass();
                        }
                        if (z13) {
                            J jC03 = c23229i0.c0();
                            jC03.getClass();
                            C23110a.g(Looper.myLooper() == jC03.f52080e.getLooper());
                            jC03.f52079d.getClass();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // androidx.media3.common.util.InterfaceC23119j
    public void accept(Object obj) {
        G1 g12 = (G1) obj;
        int i12 = A1.f51915u;
        A1 a12 = (A1) this.f52175c;
        a12.getClass();
        androidx.media3.common.U uB2 = (androidx.media3.common.U) this.f52176d;
        AbstractC37412t1<androidx.media3.common.Q, androidx.media3.common.T> abstractC37412t1 = uB2.f47508z;
        if (!abstractC37412t1.isEmpty()) {
            U.a aVarC = uB2.a().c();
            N4<androidx.media3.common.T> it = abstractC37412t1.values().iterator();
            while (it.hasNext()) {
                androidx.media3.common.T next = it.next();
                androidx.media3.common.Q q12 = a12.f51920s.O().get(next.f47454b.f47440c);
                if (q12 == null || next.f47454b.f47439b != q12.f47439b) {
                    aVarC.a(next);
                } else {
                    aVarC.a(new androidx.media3.common.T(q12, next.f47455c));
                }
            }
            uB2 = aVarC.b();
        }
        g12.z(uB2);
    }

    @Override // androidx.media3.session.C23206a1.g
    public void b(O0.g gVar) {
        int i12 = C23206a1.f52355o;
        C23206a1 c23206a1 = (C23206a1) this.f52175c;
        String mediaId = ((MediaDescriptionCompat) this.f52176d).getMediaId();
        if (TextUtils.isEmpty(mediaId)) {
            androidx.media3.common.util.s.g();
            return;
        }
        G1 g12 = c23206a1.f52357b.f52302p;
        if (!g12.u(17)) {
            androidx.media3.common.util.s.g();
            return;
        }
        androidx.media3.common.P currentTimeline = g12.getCurrentTimeline();
        P.d dVar = new P.d();
        for (int i13 = 0; i13 < currentTimeline.w(); i13++) {
            if (TextUtils.equals(currentTimeline.u(i13, dVar, 0L).f47409d.f47978b, mediaId)) {
                g12.c0(i13);
                return;
            }
        }
    }

    @Override // androidx.media3.session.A1.e
    public Object d(final T0 t02, final O0.g gVar, int i12) {
        Object obj = this.f52176d;
        Object obj2 = this.f52175c;
        switch (this.f52174b) {
            case 10:
                int i13 = A1.f51915u;
                return t02.g(gVar, (K1) obj2, (Bundle) obj);
            case 11:
                int i14 = A1.f51915u;
                if (t02.f()) {
                    return C37568u0.d(new O1(-100));
                }
                com.google.common.util.concurrent.D0 d02 = (com.google.common.util.concurrent.D0) ((A1.e) obj2).d(t02, gVar, i12);
                final A1.d dVar = (A1.d) obj;
                final int i15 = 0;
                return androidx.media3.common.util.M.P(d02, new InterfaceC37569v() { // from class: androidx.media3.session.y1
                    @Override // com.google.common.util.concurrent.InterfaceC37569v
                    public final com.google.common.util.concurrent.D0 apply(Object obj3) {
                        Object obj4 = dVar;
                        switch (i15) {
                            case 0:
                                int i16 = A1.f51915u;
                                T0 t03 = t02;
                                Handler handler = t03.f52297k;
                                RunnableC23253q0 runnableC23253q0 = new RunnableC23253q0(t03, gVar, new RunnableC23276z0(t03, (A1.d) obj4, (O0.i) obj3, 6));
                                O1 o12 = new O1(0);
                                int i17 = androidx.media3.common.util.M.f47887a;
                                com.google.common.util.concurrent.e1 e1Var = new com.google.common.util.concurrent.e1();
                                androidx.media3.common.util.M.I(handler, new Me.m(e1Var, runnableC23253q0, o12, 5));
                                return e1Var;
                            default:
                                List list = (List) obj3;
                                int i18 = A1.f51915u;
                                T0 t04 = t02;
                                Handler handler2 = t04.f52297k;
                                A1.c cVar = (A1.c) obj4;
                                O0.g gVar2 = gVar;
                                RunnableC23253q0 runnableC23253q02 = new RunnableC23253q0(t04, gVar2, new RunnableC23222g(t04, cVar, gVar2, list, 8));
                                O1 o13 = new O1(0);
                                int i19 = androidx.media3.common.util.M.f47887a;
                                com.google.common.util.concurrent.e1 e1Var2 = new com.google.common.util.concurrent.e1();
                                androidx.media3.common.util.M.I(handler2, new Me.m(e1Var2, runnableC23253q02, o13, 5));
                                return e1Var2;
                        }
                    }
                });
            default:
                int i16 = A1.f51915u;
                if (t02.f()) {
                    return C37568u0.d(new O1(-100));
                }
                com.google.common.util.concurrent.D0 d03 = (com.google.common.util.concurrent.D0) ((A1.e) obj2).d(t02, gVar, i12);
                final A1.c cVar = (A1.c) obj;
                final int i17 = 1;
                return androidx.media3.common.util.M.P(d03, new InterfaceC37569v() { // from class: androidx.media3.session.y1
                    @Override // com.google.common.util.concurrent.InterfaceC37569v
                    public final com.google.common.util.concurrent.D0 apply(Object obj3) {
                        Object obj4 = cVar;
                        switch (i17) {
                            case 0:
                                int i162 = A1.f51915u;
                                T0 t03 = t02;
                                Handler handler = t03.f52297k;
                                RunnableC23253q0 runnableC23253q0 = new RunnableC23253q0(t03, gVar, new RunnableC23276z0(t03, (A1.d) obj4, (O0.i) obj3, 6));
                                O1 o12 = new O1(0);
                                int i172 = androidx.media3.common.util.M.f47887a;
                                com.google.common.util.concurrent.e1 e1Var = new com.google.common.util.concurrent.e1();
                                androidx.media3.common.util.M.I(handler, new Me.m(e1Var, runnableC23253q0, o12, 5));
                                return e1Var;
                            default:
                                List list = (List) obj3;
                                int i18 = A1.f51915u;
                                T0 t04 = t02;
                                Handler handler2 = t04.f52297k;
                                A1.c cVar2 = (A1.c) obj4;
                                O0.g gVar2 = gVar;
                                RunnableC23253q0 runnableC23253q02 = new RunnableC23253q0(t04, gVar2, new RunnableC23222g(t04, cVar2, gVar2, list, 8));
                                O1 o13 = new O1(0);
                                int i19 = androidx.media3.common.util.M.f47887a;
                                com.google.common.util.concurrent.e1 e1Var2 = new com.google.common.util.concurrent.e1();
                                androidx.media3.common.util.M.I(handler2, new Me.m(e1Var2, runnableC23253q02, o13, 5));
                                return e1Var2;
                        }
                    }
                });
        }
    }

    @Override // androidx.media3.session.C23229i0.d
    public void e(InterfaceC23246o interfaceC23246o, int i12) {
        Object obj = this.f52176d;
        Object obj2 = this.f52175c;
        switch (this.f52174b) {
            case 0:
                C23229i0 c23229i0 = (C23229i0) obj2;
                c23229i0.getClass();
                interfaceC23246o.q2(c23229i0.f52494c, i12, ((androidx.media3.common.G) obj).k());
                break;
            case 1:
                C23229i0 c23229i02 = (C23229i0) obj2;
                c23229i02.getClass();
                interfaceC23246o.q0(c23229i02.f52494c, i12, ((androidx.media3.common.B) obj).k());
                break;
            case 2:
                C23229i0 c23229i03 = (C23229i0) obj2;
                c23229i03.getClass();
                O4<Object> o42 = AbstractC37401r1.f359977c;
                AbstractC37401r1.a aVar = new AbstractC37401r1.a();
                int i13 = 0;
                while (true) {
                    List list = (List) obj;
                    if (i13 >= list.size()) {
                        interfaceC23246o.e3(c23229i03.f52494c, i12, new BinderC23095i(aVar.i()), true);
                        break;
                    } else {
                        aVar.g(((androidx.media3.common.z) ((InterfaceC23096j) list.get(i13))).a(true));
                        i13++;
                    }
                }
            case 3:
                interfaceC23246o.Q1(((C23229i0) obj2).f52494c, i12, ((androidx.media3.common.U) obj).k());
                break;
            default:
                interfaceC23246o.J3(((C23229i0) obj2).f52494c, i12, (Surface) obj);
                break;
        }
    }

    @Override // androidx.media3.common.util.r.a
    public void invoke(Object obj) {
        H.g gVar = (H.g) obj;
        switch (this.f52174b) {
            case 5:
                gVar.w(((Integer) this.f52176d).intValue(), ((MediaControllerImplLegacy.c) this.f52175c).f52163a.p());
                break;
            default:
                gVar.w(((Integer) this.f52176d).intValue(), (androidx.media3.common.z) this.f52175c);
                break;
        }
    }
}
