package androidx.media3.session;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.collection.C20203c;
import androidx.media.AbstractServiceC23085i;
import androidx.media3.common.BinderC23095i;
import androidx.media3.common.C23089c;
import androidx.media3.common.C23091e;
import androidx.media3.common.C23104o;
import androidx.media3.common.C23107s;
import androidx.media3.common.H;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.P;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.InterfaceC23115f;
import androidx.media3.common.util.r;
import androidx.media3.session.D1;
import androidx.media3.session.InterfaceC23246o;
import androidx.media3.session.InterfaceC23249p;
import androidx.media3.session.J;
import androidx.media3.session.J1;
import androidx.media3.session.P1;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.O4;
import com.google.common.util.concurrent.C37568u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: MediaControllerImplBase.java */
/* renamed from: androidx.media3.session.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C23229i0 implements J.d {

    /* renamed from: a, reason: collision with root package name */
    public final J f52492a;

    /* renamed from: b, reason: collision with root package name */
    public final J1 f52493b;

    /* renamed from: c, reason: collision with root package name */
    public final BinderC23267v0 f52494c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f52495d;

    /* renamed from: e, reason: collision with root package name */
    public final P1 f52496e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f52497f;

    /* renamed from: g, reason: collision with root package name */
    public final C23217e0 f52498g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.media3.common.util.r<H.g> f52499h;

    /* renamed from: i, reason: collision with root package name */
    public final b f52500i;

    /* renamed from: j, reason: collision with root package name */
    public final C20203c<Integer> f52501j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public P1 f52502k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public e f52503l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f52504m;

    /* renamed from: q, reason: collision with root package name */
    public H.c f52508q;

    /* renamed from: r, reason: collision with root package name */
    public H.c f52509r;

    /* renamed from: s, reason: collision with root package name */
    public H.c f52510s;

    /* renamed from: t, reason: collision with root package name */
    @j.P
    public Surface f52511t;

    /* renamed from: v, reason: collision with root package name */
    @j.P
    public InterfaceC23246o f52513v;

    /* renamed from: w, reason: collision with root package name */
    public long f52514w;

    /* renamed from: x, reason: collision with root package name */
    public long f52515x;

    /* renamed from: y, reason: collision with root package name */
    @j.P
    public D1 f52516y;

    /* renamed from: z, reason: collision with root package name */
    @j.P
    public D1.b f52517z;

    /* renamed from: n, reason: collision with root package name */
    public D1 f52505n = D1.f51936G;

    /* renamed from: u, reason: collision with root package name */
    public androidx.media3.common.util.C f52512u = androidx.media3.common.util.C.f47872c;

    /* renamed from: p, reason: collision with root package name */
    public L1 f52507p = L1.f52123c;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC37401r1<C23213d> f52506o = AbstractC37401r1.C();

    /* compiled from: MediaControllerImplBase.java */
    /* renamed from: androidx.media3.session.i0$b */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f52518a;

        public b(Looper looper) {
            this.f52518a = new Handler(looper, new C23232j0(this, 0));
        }
    }

    /* compiled from: MediaControllerImplBase.java */
    /* renamed from: androidx.media3.session.i0$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f52520a;

        /* renamed from: b, reason: collision with root package name */
        public final long f52521b;

        public c(int i12, long j12) {
            this.f52520a = i12;
            this.f52521b = j12;
        }
    }

    /* compiled from: MediaControllerImplBase.java */
    /* renamed from: androidx.media3.session.i0$d */
    public interface d {
        void e(InterfaceC23246o interfaceC23246o, int i12);
    }

    /* compiled from: MediaControllerImplBase.java */
    /* renamed from: androidx.media3.session.i0$e */
    public class e implements ServiceConnection {

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f52522b;

        public e(Bundle bundle) {
            this.f52522b = bundle;
        }

        @Override // android.content.ServiceConnection
        public final void onBindingDied(ComponentName componentName) {
            C23229i0 c23229i0 = C23229i0.this;
            J jC02 = c23229i0.c0();
            J jC03 = c23229i0.c0();
            Objects.requireNonNull(jC03);
            jC02.a0(new Z(jC03, 2));
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C23229i0 c23229i0 = C23229i0.this;
            try {
                if (!c23229i0.f52496e.f52238b.getPackageName().equals(componentName.getPackageName())) {
                    c23229i0.f52496e.f52238b.getPackageName();
                    componentName.toString();
                    androidx.media3.common.util.s.c();
                } else {
                    InterfaceC23249p interfaceC23249pE4 = InterfaceC23249p.b.e4(iBinder);
                    if (interfaceC23249pE4 == null) {
                        androidx.media3.common.util.s.c();
                    } else {
                        interfaceC23249pE4.H3(c23229i0.f52494c, new C23231j(c23229i0.f52495d.getPackageName(), Process.myPid(), this.f52522b).k());
                    }
                }
            } catch (RemoteException unused) {
                Objects.toString(componentName);
                androidx.media3.common.util.s.g();
            } finally {
                J jC02 = c23229i0.c0();
                J jC03 = c23229i0.c0();
                Objects.requireNonNull(jC03);
                jC02.a0(new Z(jC03, 2));
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            C23229i0 c23229i0 = C23229i0.this;
            J jC02 = c23229i0.c0();
            J jC03 = c23229i0.c0();
            Objects.requireNonNull(jC03);
            jC02.a0(new Z(jC03, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.media3.session.e0] */
    public C23229i0(Context context, J j12, P1 p12, Bundle bundle, Looper looper) {
        H.c cVar = H.c.f47239c;
        this.f52508q = cVar;
        this.f52509r = cVar;
        this.f52510s = G(cVar, cVar);
        this.f52499h = new androidx.media3.common.util.r<>(looper, InterfaceC23115f.f47901a, new W(this, 7));
        this.f52492a = j12;
        C23110a.e(context, "context must not be null");
        C23110a.e(p12, "token must not be null");
        this.f52495d = context;
        this.f52493b = new J1();
        this.f52494c = new BinderC23267v0(this);
        this.f52501j = new C20203c<>();
        this.f52496e = p12;
        this.f52497f = bundle;
        this.f52498g = new IBinder.DeathRecipient() { // from class: androidx.media3.session.e0
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                C23229i0 c23229i0 = this.f52447a;
                J jC02 = c23229i0.c0();
                J jC03 = c23229i0.c0();
                Objects.requireNonNull(jC03);
                jC02.a0(new Z(jC03, 2));
            }
        };
        new f(null);
        this.f52503l = p12.f52238b.getType() != 0 ? new e(bundle) : null;
        this.f52500i = new b(looper);
        this.f52514w = -9223372036854775807L;
        this.f52515x = -9223372036854775807L;
    }

    public static H.c G(H.c cVar, H.c cVar2) {
        H.c.a aVar = new H.c.a();
        aVar.a(32);
        for (int i12 = 0; i12 < cVar.g(); i12++) {
            C23107s c23107s = cVar.f47242b;
            if (cVar2.a(c23107s.b(i12))) {
                aVar.a(c23107s.b(i12));
            }
        }
        return aVar.c();
    }

    public static P.c J(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC37401r1.a aVar = new AbstractC37401r1.a();
        aVar.e(arrayList);
        AbstractC37401r1 abstractC37401r1I = aVar.i();
        AbstractC37401r1.a aVar2 = new AbstractC37401r1.a();
        aVar2.e(arrayList2);
        AbstractC37401r1 abstractC37401r1I2 = aVar2.i();
        int size = arrayList.size();
        AbstractServiceC23085i.a aVar3 = C1.f51933a;
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = i12;
        }
        return new P.c(abstractC37401r1I, abstractC37401r1I2, iArr);
    }

    public static int a0(D1 d12) {
        int i12 = d12.f51977d.f52190b.f47255c;
        if (i12 == -1) {
            return 0;
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.common.collect.AbstractC37401r1<androidx.media3.session.C23213d> b0(java.util.List<androidx.media3.session.C23213d> r12, androidx.media3.common.H.c r13, androidx.media3.session.L1 r14) {
        /*
            com.google.common.collect.r1$a r0 = new com.google.common.collect.r1$a
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r12.size()
            if (r2 >= r3) goto L5b
            java.lang.Object r3 = r12.get(r2)
            androidx.media3.session.d r3 = (androidx.media3.session.C23213d) r3
            int r4 = r3.f52424c
            boolean r4 = r13.a(r4)
            if (r4 != 0) goto L38
            androidx.media3.session.K1 r4 = r3.f52423b
            if (r4 == 0) goto L2a
            r14.getClass()
            com.google.common.collect.H1<androidx.media3.session.K1> r5 = r14.f52126b
            boolean r4 = r5.contains(r4)
            if (r4 != 0) goto L38
        L2a:
            r4 = -1
            int r5 = r3.f52424c
            if (r5 == r4) goto L36
            boolean r4 = r14.a(r5)
            if (r4 == 0) goto L36
            goto L38
        L36:
            r11 = r1
            goto L3a
        L38:
            r4 = 1
            r11 = r4
        L3a:
            boolean r4 = r3.f52428g
            if (r4 != r11) goto L3f
            goto L55
        L3f:
            androidx.media3.session.d r4 = new androidx.media3.session.d
            android.os.Bundle r10 = new android.os.Bundle
            android.os.Bundle r5 = r3.f52427f
            r10.<init>(r5)
            androidx.media3.session.K1 r6 = r3.f52423b
            int r7 = r3.f52424c
            int r8 = r3.f52425d
            java.lang.CharSequence r9 = r3.f52426e
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3 = r4
        L55:
            r0.g(r3)
            int r2 = r2 + 1
            goto L7
        L5b:
            com.google.common.collect.r1 r12 = r0.i()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.C23229i0.b0(java.util.List, androidx.media3.common.H$c, androidx.media3.session.L1):com.google.common.collect.r1");
    }

    public static D1 f0(D1 d12, int i12, List<androidx.media3.common.z> list) {
        int size;
        androidx.media3.common.P p12 = d12.f51984k;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = 0;
        for (int i13 = 0; i13 < p12.w(); i13++) {
            arrayList.add(p12.u(i13, new P.d(), 0L));
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            androidx.media3.common.z zVar = list.get(i14);
            P.d dVar = new P.d();
            dVar.b(0, zVar, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, -1, -1, 0L);
            arrayList.add(i14 + i12, dVar);
        }
        m0(p12, arrayList, arrayList2);
        P.c cVarJ = J(arrayList, arrayList2);
        if (d12.f51984k.x()) {
            size = 0;
        } else {
            N1 n12 = d12.f51977d;
            int i15 = n12.f52190b.f47255c;
            size2 = i15 >= i12 ? list.size() + i15 : i15;
            int i16 = n12.f52190b.f47258f;
            size = i16 >= i12 ? list.size() + i16 : i16;
        }
        return h0(d12, cVarJ, size2, size, 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        r13 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.session.D1 g0(androidx.media3.session.D1 r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.C23229i0.g0(androidx.media3.session.D1, int, int):androidx.media3.session.D1");
    }

    public static D1 h0(D1 d12, P.c cVar, int i12, int i13, int i14) {
        P.d dVar = new P.d();
        cVar.u(i12, dVar, 0L);
        androidx.media3.common.z zVar = dVar.f47409d;
        H.k kVar = d12.f51977d.f52190b;
        H.k kVar2 = new H.k(null, i12, zVar, null, i13, kVar.f47259g, kVar.f47260h, kVar.f47261i, kVar.f47262j);
        N1 n12 = d12.f51977d;
        return i0(d12, cVar, kVar2, new N1(kVar2, n12.f52191c, SystemClock.elapsedRealtime(), n12.f52193e, n12.f52194f, n12.f52195g, n12.f52196h, n12.f52197i, n12.f52198j, n12.f52199k), i14);
    }

    public static D1 i0(D1 d12, androidx.media3.common.P p12, H.k kVar, N1 n12, int i12) {
        D1.a aVar = new D1.a(d12);
        aVar.f52014j = p12;
        aVar.f52008d = d12.f51977d.f52190b;
        aVar.f52009e = kVar;
        aVar.f52007c = n12;
        aVar.f52010f = i12;
        return aVar.a();
    }

    public static void m0(androidx.media3.common.P p12, ArrayList arrayList, ArrayList arrayList2) {
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            P.d dVar = (P.d) arrayList.get(i12);
            int i13 = dVar.f47421p;
            int i14 = dVar.f47422q;
            if (i13 == -1 || i14 == -1) {
                dVar.f47421p = arrayList2.size();
                dVar.f47422q = arrayList2.size();
                P.b bVar = new P.b();
                bVar.p(null, null, i12, -9223372036854775807L, 0L, C23089c.f47615g, true);
                arrayList2.add(bVar);
            } else {
                dVar.f47421p = arrayList2.size();
                dVar.f47422q = (i14 - i13) + arrayList2.size();
                while (i13 <= i14) {
                    P.b bVar2 = new P.b();
                    p12.n(i13, bVar2, false);
                    bVar2.f47381d = i12;
                    arrayList2.add(bVar2);
                    i13++;
                }
            }
        }
    }

    @Override // androidx.media3.session.J.d
    public final boolean A() {
        return this.f52505n.f51993t;
    }

    @Override // androidx.media3.session.J.d
    public final com.google.common.util.concurrent.D0<O1> B(K1 k12, Bundle bundle) {
        InterfaceC23246o interfaceC23246o;
        U u12 = new U(this, k12, bundle);
        C23110a.b(k12.f52115b == 0);
        L1 l12 = this.f52507p;
        l12.getClass();
        if (l12.f52126b.contains(k12)) {
            interfaceC23246o = this.f52513v;
        } else {
            androidx.media3.common.util.s.g();
            interfaceC23246o = null;
        }
        return X(interfaceC23246o, u12, false);
    }

    @Override // androidx.media3.session.J.d
    public final int C() {
        return this.f52505n.f51977d.f52195g;
    }

    @Override // androidx.media3.session.J.d
    public final void D() {
        if (e0(4)) {
            Y(new W(this, 0));
            n0(a0(this.f52505n), -9223372036854775807L);
        }
    }

    @Override // androidx.media3.session.J.d
    public final void E(H.g gVar) {
        this.f52499h.e(gVar);
    }

    @Override // androidx.media3.session.J.d
    public final void F(H.g gVar) {
        this.f52499h.a(gVar);
    }

    @Override // androidx.media3.session.J.d
    @Deprecated
    public final void H(int i12) {
        if (e0(25)) {
            Y(new M(this, i12, 7));
            D1 d12 = this.f52505n;
            C23104o c23104o = d12.f51991r;
            if (d12.f51992s == i12 || c23104o.f47693c > i12) {
                return;
            }
            int i13 = c23104o.f47694d;
            if (i13 == 0 || i12 <= i13) {
                this.f52505n = d12.b(i12, d12.f51993t);
                M m12 = new M(this, i12, 8);
                androidx.media3.common.util.r<H.g> rVar = this.f52499h;
                rVar.c(30, m12);
                rVar.b();
            }
        }
    }

    @Override // androidx.media3.session.J.d
    public final void I(@j.P Surface surface) {
        if (e0(27)) {
            if (this.f52511t != null) {
                this.f52511t = null;
            }
            this.f52511t = surface;
            Z(new N(4, this, surface));
            int i12 = surface == null ? 0 : -1;
            j0(i12, i12);
        }
    }

    @Override // androidx.media3.session.J.d
    public final void K(androidx.media3.common.B b12) {
        if (e0(19)) {
            Y(new N(1, this, b12));
            if (this.f52505n.f51987n.equals(b12)) {
                return;
            }
            D1 d12 = this.f52505n;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52017m = b12;
            this.f52505n = aVarB.a();
            C23256r1 c23256r1 = new C23256r1(b12);
            androidx.media3.common.util.r<H.g> rVar = this.f52499h;
            rVar.c(15, c23256r1);
            rVar.b();
        }
    }

    @Override // androidx.media3.session.J.d
    @Deprecated
    public final void L(boolean z12) {
        if (e0(26)) {
            Y(new C23208b0(this, z12, 2));
            D1 d12 = this.f52505n;
            if (d12.f51993t != z12) {
                this.f52505n = d12.b(d12.f51992s, z12);
                C23208b0 c23208b0 = new C23208b0(this, z12, 3);
                androidx.media3.common.util.r<H.g> rVar = this.f52499h;
                rVar.c(30, c23208b0);
                rVar.b();
            }
        }
    }

    @Override // androidx.media3.session.J.d
    public final void M(final List<androidx.media3.common.z> list, final int i12, final long j12) {
        if (e0(20)) {
            Y(new d() { // from class: androidx.media3.session.T
                @Override // androidx.media3.session.C23229i0.d
                public final void e(InterfaceC23246o interfaceC23246o, int i13) {
                    C23229i0 c23229i0 = this.f52282b;
                    c23229i0.getClass();
                    O4<Object> o42 = AbstractC37401r1.f359977c;
                    AbstractC37401r1.a aVar = new AbstractC37401r1.a();
                    int i14 = 0;
                    while (true) {
                        List list2 = list;
                        if (i14 >= list2.size()) {
                            interfaceC23246o.N0(c23229i0.f52494c, i13, new BinderC23095i(aVar.i()), i12, j12);
                            return;
                        }
                        aVar.g(((androidx.media3.common.z) ((InterfaceC23096j) list2.get(i14))).a(true));
                        i14++;
                    }
                }
            });
            o0(list, i12, j12, false);
        }
    }

    @Override // androidx.media3.session.J.d
    @Deprecated
    public final void N() {
        if (e0(26)) {
            Y(new W(this, 6));
            D1 d12 = this.f52505n;
            int i12 = d12.f51992s - 1;
            if (i12 >= d12.f51991r.f47693c) {
                this.f52505n = d12.b(i12, d12.f51993t);
                M m12 = new M(this, i12, 9);
                androidx.media3.common.util.r<H.g> rVar = this.f52499h;
                rVar.c(30, m12);
                rVar.b();
            }
        }
    }

    @Override // androidx.media3.session.J.d
    public final void O(final int i12, final int i13, final List<androidx.media3.common.z> list) {
        if (e0(20)) {
            C23110a.b(i12 >= 0 && i12 <= i13);
            Y(new d() { // from class: androidx.media3.session.g0
                @Override // androidx.media3.session.C23229i0.d
                public final void e(InterfaceC23246o interfaceC23246o, int i14) {
                    C23229i0 c23229i0 = this.f52469b;
                    c23229i0.getClass();
                    O4<Object> o42 = AbstractC37401r1.f359977c;
                    AbstractC37401r1.a aVar = new AbstractC37401r1.a();
                    int i15 = 0;
                    while (true) {
                        List list2 = list;
                        if (i15 >= list2.size()) {
                            break;
                        }
                        aVar.g(((androidx.media3.common.z) ((InterfaceC23096j) list2.get(i15))).a(true));
                        i15++;
                    }
                    BinderC23095i binderC23095i = new BinderC23095i(aVar.i());
                    P1 p12 = c23229i0.f52502k;
                    p12.getClass();
                    int i16 = p12.f52238b.i();
                    int i17 = i12;
                    int i18 = i13;
                    if (i16 >= 2) {
                        interfaceC23246o.O2(c23229i0.f52494c, i14, i17, i18, binderC23095i);
                        return;
                    }
                    BinderC23267v0 binderC23267v0 = c23229i0.f52494c;
                    interfaceC23246o.z1(binderC23267v0, i14, i18, binderC23095i);
                    interfaceC23246o.E2(binderC23267v0, i14, i17, i18);
                }
            });
            int iW2 = this.f52505n.f51984k.w();
            if (i12 > iW2) {
                return;
            }
            if (this.f52505n.f51984k.x()) {
                o0(list, -1, -9223372036854775807L, false);
                return;
            }
            int iMin = Math.min(i13, iW2);
            D1 d1G0 = g0(f0(this.f52505n, iMin, list), i12, iMin);
            int i14 = this.f52505n.f51977d.f52190b.f47255c;
            boolean z12 = i14 >= i12 && i14 < iMin;
            q0(d1G0, 0, null, z12 ? 4 : null, z12 ? 3 : null);
        }
    }

    @Override // androidx.media3.session.J.d
    public final void P(int i12) {
        if (e0(34)) {
            Y(new M(this, i12, 0));
            D1 d12 = this.f52505n;
            int i13 = d12.f51992s - 1;
            if (i13 >= d12.f51991r.f47693c) {
                this.f52505n = d12.b(i13, d12.f51993t);
                M m12 = new M(this, i13, 1);
                androidx.media3.common.util.r<H.g> rVar = this.f52499h;
                rVar.c(30, m12);
                rVar.b();
            }
        }
    }

    @Override // androidx.media3.session.J.d
    public final C23091e Q() {
        return this.f52505n.f51989p;
    }

    @Override // androidx.media3.session.J.d
    public final void R(int i12, int i13) {
        if (e0(33)) {
            Y(new X(this, i12, i13, 0));
            D1 d12 = this.f52505n;
            C23104o c23104o = d12.f51991r;
            if (d12.f51992s == i12 || c23104o.f47693c > i12) {
                return;
            }
            int i14 = c23104o.f47694d;
            if (i14 == 0 || i12 <= i14) {
                this.f52505n = d12.b(i12, d12.f51993t);
                M m12 = new M(this, i12, 2);
                androidx.media3.common.util.r<H.g> rVar = this.f52499h;
                rVar.c(30, m12);
                rVar.b();
            }
        }
    }

    @Override // androidx.media3.session.J.d
    public final void S(androidx.media3.common.z zVar) {
        if (e0(31)) {
            Y(new P(this, zVar, 1));
            o0(Collections.singletonList(zVar), -1, -9223372036854775807L, true);
        }
    }

    @Override // androidx.media3.session.J.d
    public final void T(int i12, List<androidx.media3.common.z> list) {
        if (e0(20)) {
            C23110a.b(i12 >= 0);
            Y(new C23214d0(i12, this, list));
            if (list.isEmpty()) {
                return;
            }
            if (this.f52505n.f51984k.x()) {
                o0(list, -1, -9223372036854775807L, false);
            } else {
                q0(f0(this.f52505n, Math.min(i12, this.f52505n.f51984k.w()), list), 0, null, null, this.f52505n.f51984k.x() ? 3 : null);
            }
        }
    }

    @Override // androidx.media3.session.J.d
    public final long U() {
        return this.f52505n.f51977d.f52194f;
    }

    @Override // androidx.media3.session.J.d
    public final void V(final androidx.media3.common.z zVar, final long j12) {
        if (e0(31)) {
            Y(new d() { // from class: androidx.media3.session.h0
                @Override // androidx.media3.session.C23229i0.d
                public final void e(InterfaceC23246o interfaceC23246o, int i12) {
                    C23229i0 c23229i0 = this.f52486b;
                    c23229i0.getClass();
                    interfaceC23246o.Z(c23229i0.f52494c, i12, zVar.a(true), j12);
                }
            });
            o0(Collections.singletonList(zVar), -1, j12, false);
        }
    }

    @Override // androidx.media3.session.J.d
    public final void W(final int i12, final int i13, final int i14) {
        if (e0(20)) {
            C23110a.b(i12 >= 0 && i12 <= i13 && i14 >= 0);
            Y(new d() { // from class: androidx.media3.session.c0
                @Override // androidx.media3.session.C23229i0.d
                public final void e(InterfaceC23246o interfaceC23246o, int i15) {
                    interfaceC23246o.n0(this.f52398b.f52494c, i15, i12, i13, i14);
                }
            });
            androidx.media3.common.P p12 = this.f52505n.f51984k;
            int iW2 = p12.w();
            int iMin = Math.min(i13, iW2);
            int i15 = iMin - i12;
            int iMin2 = Math.min(i14, iW2 - i15);
            if (i12 >= iW2 || i12 == iMin || i12 == iMin2) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i16 = 0; i16 < iW2; i16++) {
                arrayList.add(p12.u(i16, new P.d(), 0L));
            }
            androidx.media3.common.util.M.E(arrayList, i12, iMin, iMin2);
            m0(p12, arrayList, arrayList2);
            P.c cVarJ = J(arrayList, arrayList2);
            if (cVarJ.x()) {
                return;
            }
            int iA02 = a0(this.f52505n);
            int i17 = (iA02 < i12 || iA02 >= iMin) ? (iMin > iA02 || iMin2 <= iA02) ? (iMin <= iA02 || iMin2 > iA02) ? iA02 : iA02 + i15 : iA02 - i15 : (iA02 - i12) + iMin2;
            P.d dVar = new P.d();
            int i18 = this.f52505n.f51977d.f52190b.f47258f - p12.u(iA02, dVar, 0L).f47421p;
            cVarJ.u(i17, dVar, 0L);
            q0(h0(this.f52505n, cVarJ, i17, dVar.f47421p + i18, 5), 0, null, null, null);
        }
    }

    public final com.google.common.util.concurrent.D0<O1> X(@j.P InterfaceC23246o interfaceC23246o, d dVar, boolean z12) {
        J1.a<?> aVar;
        if (interfaceC23246o == null) {
            return C37568u0.d(new O1(-4));
        }
        J1 j12 = this.f52493b;
        O1 o12 = new O1(1);
        synchronized (j12.f52095a) {
            try {
                int iA2 = j12.a();
                aVar = new J1.a<>(iA2, o12);
                if (j12.f52100f) {
                    aVar.r();
                } else {
                    j12.f52097c.put(Integer.valueOf(iA2), aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i12 = aVar.f52101i;
        if (z12) {
            this.f52501j.add(Integer.valueOf(i12));
        }
        try {
            dVar.e(interfaceC23246o, i12);
        } catch (RemoteException e12) {
            androidx.media3.common.util.s.h("Cannot connect to the service or the session is gone", e12);
            this.f52501j.remove(Integer.valueOf(i12));
            this.f52493b.c(i12, new O1(-100));
        }
        return aVar;
    }

    public final void Y(d dVar) {
        b bVar = this.f52500i;
        if (C23229i0.this.f52513v != null) {
            Handler handler = bVar.f52518a;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
        }
        X(this.f52513v, dVar, true);
    }

    public final void Z(d dVar) {
        com.google.common.util.concurrent.D0<O1> d0X = X(this.f52513v, dVar, true);
        try {
            C1.y(d0X);
        } catch (ExecutionException e12) {
            throw new IllegalStateException(e12);
        } catch (TimeoutException e13) {
            if (d0X instanceof J1.a) {
                int i12 = ((J1.a) d0X).f52101i;
                this.f52501j.remove(Integer.valueOf(i12));
                this.f52493b.c(i12, new O1(-1));
            }
            androidx.media3.common.util.s.h("Synchronous command takes too long on the session side.", e13);
        }
    }

    @Override // androidx.media3.session.J.d
    @j.P
    public final PlaybackException a() {
        return this.f52505n.f51975b;
    }

    @Override // androidx.media3.session.J.d
    public final long b() {
        return this.f52505n.f51972D;
    }

    @Override // androidx.media3.session.J.d
    public final void c(List list) {
        if (e0(20)) {
            Y(new N(2, this, list));
            o0(list, -1, -9223372036854775807L, true);
        }
    }

    public J c0() {
        return this.f52492a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [androidx.media3.session.o] */
    @Override // androidx.media3.session.J.d
    public final void connect() {
        InterfaceC23246o.b.a aVar;
        P1 p12 = this.f52496e;
        int type = p12.f52238b.getType();
        P1.a aVar2 = p12.f52238b;
        Context context = this.f52495d;
        Bundle bundle = this.f52497f;
        if (type == 0) {
            this.f52503l = null;
            Object objH = aVar2.h();
            C23110a.h(objH);
            IBinder iBinder = (IBinder) objH;
            int i12 = InterfaceC23246o.b.f52593a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC23246o)) {
                InterfaceC23246o.b.a aVar3 = new InterfaceC23246o.b.a();
                aVar3.f52594a = iBinder;
                aVar = aVar3;
            } else {
                aVar = (InterfaceC23246o) iInterfaceQueryLocalInterface;
            }
            try {
                aVar.n3(this.f52494c, this.f52493b.a(), new C23231j(context.getPackageName(), Process.myPid(), bundle).k());
                return;
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.h("Failed to call connection request.", e12);
            }
        } else {
            this.f52503l = new e(bundle);
            int i13 = androidx.media3.common.util.M.f47887a >= 29 ? 4097 : 1;
            Intent intent = new Intent("androidx.media3.session.MediaSessionService");
            intent.setClassName(aVar2.getPackageName(), aVar2.e());
            if (context.bindService(intent, this.f52503l, i13)) {
                return;
            }
            p12.toString();
            androidx.media3.common.util.s.g();
        }
        J jC02 = c0();
        J jC03 = c0();
        Objects.requireNonNull(jC03);
        jC02.a0(new Z(jC03, 2));
    }

    @Override // androidx.media3.session.J.d
    public final void d(androidx.media3.common.G g12) {
        if (e0(13)) {
            Y(new N(0, this, g12));
            if (this.f52505n.f51981h.equals(g12)) {
                return;
            }
            this.f52505n = this.f52505n.j(g12);
            C23239l1 c23239l1 = new C23239l1(g12, 1);
            androidx.media3.common.util.r<H.g> rVar = this.f52499h;
            rVar.c(12, c23239l1);
            rVar.b();
        }
    }

    @j.P
    public final c d0(androidx.media3.common.P p12, int i12, long j12) {
        if (p12.x()) {
            return null;
        }
        P.d dVar = new P.d();
        P.b bVar = new P.b();
        if (i12 == -1 || i12 >= p12.w()) {
            i12 = p12.b(this.f52505n.f51983j);
            j12 = androidx.media3.common.util.M.Q(p12.u(i12, dVar, 0L).f47419n);
        }
        long jF2 = androidx.media3.common.util.M.F(j12);
        C23110a.c(i12, p12.w());
        p12.v(i12, dVar);
        if (jF2 == -9223372036854775807L) {
            jF2 = dVar.f47419n;
            if (jF2 == -9223372036854775807L) {
                return null;
            }
        }
        int i13 = dVar.f47421p;
        p12.n(i13, bVar, false);
        while (i13 < dVar.f47422q && bVar.f47383f != jF2) {
            int i14 = i13 + 1;
            if (p12.n(i14, bVar, false).f47383f > jF2) {
                break;
            }
            i13 = i14;
        }
        p12.n(i13, bVar, false);
        return new c(i13, jF2 - bVar.f47383f);
    }

    @Override // androidx.media3.session.J.d
    public final androidx.media3.common.X e() {
        return this.f52505n.f51986m;
    }

    public final boolean e0(int i12) {
        if (this.f52510s.a(i12)) {
            return true;
        }
        androidx.media3.common.util.s.g();
        return false;
    }

    @Override // androidx.media3.session.J.d
    public final void f(androidx.media3.common.z zVar) {
        if (e0(31)) {
            Y(new P(this, zVar, 0));
            o0(Collections.singletonList(zVar), -1, -9223372036854775807L, true);
        }
    }

    @Override // androidx.media3.session.J.d
    public final androidx.media3.common.U g() {
        return this.f52505n.f51974F;
    }

    @Override // androidx.media3.session.J.d
    public final long getContentPosition() {
        N1 n12 = this.f52505n.f51977d;
        if (n12.f52191c) {
            return n12.f52190b.f47260h;
        }
        k0();
        return this.f52514w;
    }

    @Override // androidx.media3.session.J.d
    public final int getCurrentAdGroupIndex() {
        return this.f52505n.f51977d.f52190b.f47261i;
    }

    @Override // androidx.media3.session.J.d
    public final int getCurrentAdIndexInAdGroup() {
        return this.f52505n.f51977d.f52190b.f47262j;
    }

    @Override // androidx.media3.session.J.d
    public final int getCurrentMediaItemIndex() {
        return a0(this.f52505n);
    }

    @Override // androidx.media3.session.J.d
    public final int getCurrentPeriodIndex() {
        return this.f52505n.f51977d.f52190b.f47258f;
    }

    @Override // androidx.media3.session.J.d
    public final long getCurrentPosition() {
        k0();
        return this.f52514w;
    }

    @Override // androidx.media3.session.J.d
    public final androidx.media3.common.P getCurrentTimeline() {
        return this.f52505n.f51984k;
    }

    @Override // androidx.media3.session.J.d
    public final androidx.media3.common.V getCurrentTracks() {
        return this.f52505n.f51973E;
    }

    @Override // androidx.media3.session.J.d
    public final C23104o getDeviceInfo() {
        return this.f52505n.f51991r;
    }

    @Override // androidx.media3.session.J.d
    public final long getDuration() {
        return this.f52505n.f51977d.f52193e;
    }

    @Override // androidx.media3.session.J.d
    public final boolean getPlayWhenReady() {
        return this.f52505n.f51994u;
    }

    @Override // androidx.media3.session.J.d
    public final androidx.media3.common.G getPlaybackParameters() {
        return this.f52505n.f51981h;
    }

    @Override // androidx.media3.session.J.d
    public final int getPlaybackState() {
        return this.f52505n.f51999z;
    }

    @Override // androidx.media3.session.J.d
    public final int getPlaybackSuppressionReason() {
        return this.f52505n.f51998y;
    }

    @Override // androidx.media3.session.J.d
    public final int getRepeatMode() {
        return this.f52505n.f51982i;
    }

    @Override // androidx.media3.session.J.d
    public final long getTotalBufferedDuration() {
        return this.f52505n.f51977d.f52196h;
    }

    @Override // androidx.media3.session.J.d
    public final float getVolume() {
        return this.f52505n.f51988o;
    }

    @Override // androidx.media3.session.J.d
    public final void h(boolean z12) {
        if (e0(14)) {
            Y(new C23208b0(this, z12, 1));
            D1 d12 = this.f52505n;
            if (d12.f51983j != z12) {
                D1.a aVar = new D1.a(d12);
                aVar.f52013i = z12;
                this.f52505n = aVar.a();
                C23227h1 c23227h1 = new C23227h1(z12, 3);
                androidx.media3.common.util.r<H.g> rVar = this.f52499h;
                rVar.c(9, c23227h1);
                rVar.b();
            }
        }
    }

    @Override // androidx.media3.session.J.d
    public final long i() {
        return this.f52505n.f51977d.f52198j;
    }

    @Override // androidx.media3.session.J.d
    public final boolean isConnected() {
        return this.f52513v != null;
    }

    @Override // androidx.media3.session.J.d
    public final boolean isLoading() {
        return this.f52505n.f51997x;
    }

    @Override // androidx.media3.session.J.d
    public final boolean isPlayingAd() {
        return this.f52505n.f51977d.f52191c;
    }

    @Override // androidx.media3.session.J.d
    public final long j() {
        return this.f52505n.f51971C;
    }

    public final void j0(int i12, int i13) {
        androidx.media3.common.util.C c12 = this.f52512u;
        if (c12.f47873a == i12 && c12.f47874b == i13) {
            return;
        }
        this.f52512u = new androidx.media3.common.util.C(i12, i13);
        this.f52499h.f(24, new C23251p1(i12, i13, 2));
    }

    @Override // androidx.media3.session.J.d
    public final boolean k() {
        return this.f52505n.f51996w;
    }

    public final void k0() {
        long j12 = this.f52515x;
        D1 d12 = this.f52505n;
        N1 n12 = d12.f51977d;
        boolean z12 = j12 < n12.f52192d;
        if (!d12.f51996w) {
            if (z12 || this.f52514w == -9223372036854775807L) {
                this.f52514w = n12.f52190b.f47259g;
                return;
            }
            return;
        }
        if (z12 || this.f52514w == -9223372036854775807L) {
            long jElapsedRealtime = c0().f52081f != -9223372036854775807L ? c0().f52081f : SystemClock.elapsedRealtime() - this.f52505n.f51977d.f52192d;
            D1 d13 = this.f52505n;
            N1 n13 = d13.f51977d;
            long jMin = n13.f52190b.f47259g + ((long) (jElapsedRealtime * d13.f51981h.f47236b));
            long j13 = n13.f52193e;
            if (j13 != -9223372036854775807L) {
                jMin = Math.min(jMin, j13);
            }
            this.f52514w = jMin;
        }
    }

    @Override // androidx.media3.session.J.d
    public final long l() {
        return this.f52505n.f51977d.f52199k;
    }

    public final void l0(D1 d12, final D1 d13, @j.P final Integer num, @j.P final Integer num2, @j.P final Integer num3, @j.P Integer num4) {
        androidx.media3.common.util.r<H.g> rVar = this.f52499h;
        if (num != null) {
            final int i12 = 0;
            rVar.c(0, new r.a() { // from class: androidx.media3.session.Q
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i12) {
                        case 0:
                            D1 d14 = d13;
                            gVar.v(d14.f51984k, num.intValue());
                            break;
                        case 1:
                            D1 d15 = d13;
                            gVar.t(num.intValue(), d15.f51978e, d15.f51979f);
                            break;
                        default:
                            D1 d16 = d13;
                            gVar.onPlayWhenReadyChanged(d16.f51994u, num.intValue());
                            break;
                    }
                }
            });
        }
        if (num3 != null) {
            final int i13 = 1;
            rVar.c(11, new r.a() { // from class: androidx.media3.session.Q
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i13) {
                        case 0:
                            D1 d14 = d13;
                            gVar.v(d14.f51984k, num3.intValue());
                            break;
                        case 1:
                            D1 d15 = d13;
                            gVar.t(num3.intValue(), d15.f51978e, d15.f51979f);
                            break;
                        default:
                            D1 d16 = d13;
                            gVar.onPlayWhenReadyChanged(d16.f51994u, num3.intValue());
                            break;
                    }
                }
            });
        }
        androidx.media3.common.z zVarP = d13.p();
        if (num4 != null) {
            rVar.c(1, new N(13, zVarP, num4));
        }
        PlaybackException playbackException = d12.f51975b;
        PlaybackException playbackException2 = d13.f51975b;
        if (playbackException != playbackException2 && (playbackException == null || !playbackException.a(playbackException2))) {
            rVar.c(10, new V(0, playbackException2));
            if (playbackException2 != null) {
                rVar.c(10, new V(1, playbackException2));
            }
        }
        if (!d12.f51973E.equals(d13.f51973E)) {
            final int i14 = 17;
            rVar.c(2, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i14) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
        }
        if (!d12.f51969A.equals(d13.f51969A)) {
            final int i15 = 18;
            rVar.c(14, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i15) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
        }
        if (d12.f51997x != d13.f51997x) {
            final int i16 = 19;
            rVar.c(3, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i16) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
        }
        if (d12.f51999z != d13.f51999z) {
            final int i17 = 20;
            rVar.c(4, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i17) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
        }
        if (num2 != null) {
            final int i18 = 2;
            rVar.c(5, new r.a() { // from class: androidx.media3.session.Q
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i18) {
                        case 0:
                            D1 d14 = d13;
                            gVar.v(d14.f51984k, num2.intValue());
                            break;
                        case 1:
                            D1 d15 = d13;
                            gVar.t(num2.intValue(), d15.f51978e, d15.f51979f);
                            break;
                        default:
                            D1 d16 = d13;
                            gVar.onPlayWhenReadyChanged(d16.f51994u, num2.intValue());
                            break;
                    }
                }
            });
        }
        if (d12.f51998y != d13.f51998y) {
            final int i19 = 0;
            rVar.c(6, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i19) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
        }
        if (d12.f51996w != d13.f51996w) {
            final int i22 = 1;
            rVar.c(7, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i22) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
        }
        if (!d12.f51981h.equals(d13.f51981h)) {
            final int i23 = 2;
            rVar.c(12, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i23) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
        }
        if (d12.f51982i != d13.f51982i) {
            final int i24 = 3;
            rVar.c(8, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i24) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
        }
        if (d12.f51983j != d13.f51983j) {
            final int i25 = 4;
            rVar.c(9, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i25) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
        }
        if (!d12.f51987n.equals(d13.f51987n)) {
            final int i26 = 5;
            rVar.c(15, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i26) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
        }
        if (d12.f51988o != d13.f51988o) {
            final int i27 = 6;
            rVar.c(22, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i27) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
        }
        if (!d12.f51989p.equals(d13.f51989p)) {
            final int i28 = 7;
            rVar.c(20, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i28) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
        }
        if (!d12.f51990q.f47860b.equals(d13.f51990q.f47860b)) {
            final int i29 = 8;
            rVar.c(27, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i29) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
            final int i32 = 9;
            rVar.c(27, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i32) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
        }
        if (!d12.f51991r.equals(d13.f51991r)) {
            final int i33 = 10;
            rVar.c(29, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i33) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
        }
        if (d12.f51992s != d13.f51992s || d12.f51993t != d13.f51993t) {
            final int i34 = 11;
            rVar.c(30, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i34) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
        }
        if (!d12.f51986m.equals(d13.f51986m)) {
            final int i35 = 12;
            rVar.c(25, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i35) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
        }
        if (d12.f51970B != d13.f51970B) {
            final int i36 = 13;
            rVar.c(16, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i36) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
        }
        if (d12.f51971C != d13.f51971C) {
            final int i37 = 14;
            rVar.c(17, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i37) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
        }
        if (d12.f51972D != d13.f51972D) {
            final int i38 = 15;
            rVar.c(18, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i38) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
        }
        if (!d12.f51974F.equals(d13.f51974F)) {
            final int i39 = 16;
            rVar.c(19, new r.a() { // from class: androidx.media3.session.S
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    H.g gVar = (H.g) obj;
                    switch (i39) {
                        case 0:
                            gVar.onPlaybackSuppressionReasonChanged(d13.f51998y);
                            break;
                        case 1:
                            gVar.onIsPlayingChanged(d13.f51996w);
                            break;
                        case 2:
                            gVar.m(d13.f51981h);
                            break;
                        case 3:
                            gVar.onRepeatModeChanged(d13.f51982i);
                            break;
                        case 4:
                            gVar.onShuffleModeEnabledChanged(d13.f51983j);
                            break;
                        case 5:
                            gVar.E(d13.f51987n);
                            break;
                        case 6:
                            gVar.onVolumeChanged(d13.f51988o);
                            break;
                        case 7:
                            gVar.D(d13.f51989p);
                            break;
                        case 8:
                            gVar.onCues(d13.f51990q.f47860b);
                            break;
                        case 9:
                            gVar.a(d13.f51990q);
                            break;
                        case 10:
                            gVar.k(d13.f51991r);
                            break;
                        case 11:
                            D1 d14 = d13;
                            gVar.onDeviceVolumeChanged(d14.f51992s, d14.f51993t);
                            break;
                        case 12:
                            gVar.b(d13.f51986m);
                            break;
                        case 13:
                            gVar.y(d13.f51970B);
                            break;
                        case 14:
                            gVar.i(d13.f51971C);
                            break;
                        case 15:
                            gVar.q(d13.f51972D);
                            break;
                        case 16:
                            gVar.z(d13.f51974F);
                            break;
                        case 17:
                            gVar.j(d13.f51973E);
                            break;
                        case 18:
                            gVar.e(d13.f51969A);
                            break;
                        case 19:
                            gVar.onIsLoadingChanged(d13.f51997x);
                            break;
                        default:
                            gVar.onPlaybackStateChanged(d13.f51999z);
                            break;
                    }
                }
            });
        }
        rVar.b();
    }

    @Override // androidx.media3.session.J.d
    public final androidx.media3.common.text.b m() {
        return this.f52505n.f51990q;
    }

    @Override // androidx.media3.session.J.d
    public final H.c n() {
        return this.f52510s;
    }

    public final void n0(int i12, long j12) {
        boolean z12;
        D1 d1M;
        D1 d1I0;
        androidx.media3.common.P p12 = this.f52505n.f51984k;
        if ((p12.x() || i12 < p12.w()) && !isPlayingAd()) {
            D1 d12 = this.f52505n;
            D1 d1L = d12.l(d12.f51999z == 1 ? 1 : 2, d12.f51975b);
            c cVarD0 = d0(p12, i12, j12);
            if (cVarD0 == null) {
                z12 = false;
                H.k kVar = new H.k(null, i12, null, null, i12, j12 == -9223372036854775807L ? 0L : j12, j12 == -9223372036854775807L ? 0L : j12, -1, -1);
                D1 d13 = this.f52505n;
                androidx.media3.common.P p13 = d13.f51984k;
                boolean z13 = this.f52505n.f51977d.f52191c;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                N1 n12 = this.f52505n.f51977d;
                d1I0 = i0(d13, p13, kVar, new N1(kVar, z13, jElapsedRealtime, n12.f52193e, j12 == -9223372036854775807L ? 0L : j12, 0, 0L, n12.f52197i, n12.f52198j, j12 == -9223372036854775807L ? 0L : j12), 1);
            } else {
                z12 = false;
                N1 n13 = d1L.f51977d;
                int i13 = n13.f52190b.f47258f;
                P.b bVar = new P.b();
                p12.n(i13, bVar, false);
                P.b bVar2 = new P.b();
                int i14 = cVarD0.f52520a;
                p12.n(i14, bVar2, false);
                boolean z14 = i13 != i14;
                k0();
                long jF2 = androidx.media3.common.util.M.F(this.f52514w) - bVar.f47383f;
                long j13 = cVarD0.f52521b;
                if (z14 || j13 != jF2) {
                    H.k kVar2 = n13.f52190b;
                    C23110a.g(kVar2.f47261i == -1);
                    H.k kVar3 = new H.k(null, bVar.f47381d, kVar2.f47256d, null, i13, androidx.media3.common.util.M.Q(bVar.f47383f + jF2), androidx.media3.common.util.M.Q(bVar.f47383f + jF2), -1, -1);
                    z12 = false;
                    p12.n(i14, bVar2, false);
                    P.d dVar = new P.d();
                    p12.v(bVar2.f47381d, dVar);
                    H.k kVar4 = new H.k(null, bVar2.f47381d, dVar.f47409d, null, i14, androidx.media3.common.util.M.Q(bVar2.f47383f + j13), androidx.media3.common.util.M.Q(bVar2.f47383f + j13), -1, -1);
                    D1.a aVar = new D1.a(d1L);
                    aVar.f52008d = kVar3;
                    aVar.f52009e = kVar4;
                    aVar.f52010f = 1;
                    D1 d1A = aVar.a();
                    if (z14 || j13 < jF2) {
                        d1M = d1A.m(new N1(kVar4, false, SystemClock.elapsedRealtime(), androidx.media3.common.util.M.Q(dVar.f47420o), androidx.media3.common.util.M.Q(bVar2.f47383f + j13), C1.b(androidx.media3.common.util.M.Q(bVar2.f47383f + j13), androidx.media3.common.util.M.Q(dVar.f47420o)), 0L, -9223372036854775807L, -9223372036854775807L, androidx.media3.common.util.M.Q(bVar2.f47383f + j13)));
                    } else {
                        long jMax = Math.max(0L, androidx.media3.common.util.M.F(d1A.f51977d.f52196h) - (j13 - jF2));
                        long j14 = j13 + jMax;
                        d1M = d1A.m(new N1(kVar4, false, SystemClock.elapsedRealtime(), androidx.media3.common.util.M.Q(dVar.f47420o), androidx.media3.common.util.M.Q(j14), C1.b(androidx.media3.common.util.M.Q(j14), androidx.media3.common.util.M.Q(dVar.f47420o)), androidx.media3.common.util.M.Q(jMax), -9223372036854775807L, -9223372036854775807L, androidx.media3.common.util.M.Q(j14)));
                    }
                    d1L = d1M;
                }
                d1I0 = d1L;
            }
            boolean zX2 = this.f52505n.f51984k.x();
            N1 n14 = d1I0.f51977d;
            boolean z15 = (zX2 || n14.f52190b.f47255c == this.f52505n.f51977d.f52190b.f47255c) ? z12 : true;
            if (z15 || n14.f52190b.f47259g != this.f52505n.f51977d.f52190b.f47259g) {
                q0(d1I0, null, null, 1, z15 ? 2 : null);
            }
        }
    }

    @Override // androidx.media3.session.J.d
    public final boolean o() {
        return this.f52505n.f51983j;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o0(java.util.List<androidx.media3.common.z> r66, int r67, long r68, boolean r70) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.C23229i0.o0(java.util.List, int, long, boolean):void");
    }

    @Override // androidx.media3.session.J.d
    public final androidx.media3.common.B p() {
        return this.f52505n.f51969A;
    }

    public final void p0(boolean z12) {
        D1 d12 = this.f52505n;
        if (d12.f51994u == z12 && d12.f51998y == 0) {
            return;
        }
        k0();
        this.f52515x = SystemClock.elapsedRealtime();
        q0(this.f52505n.g(1, 0, z12), null, 1, null, null);
    }

    @Override // androidx.media3.session.J.d
    public final void pause() {
        if (e0(1)) {
            Y(new W(this, 1));
            p0(false);
        }
    }

    @Override // androidx.media3.session.J.d
    public final void play() {
        if (e0(1)) {
            Y(new W(this, 3));
            p0(true);
        }
    }

    @Override // androidx.media3.session.J.d
    public final void prepare() {
        if (e0(2)) {
            Y(new W(this, 5));
            D1 d12 = this.f52505n;
            if (d12.f51999z == 1) {
                q0(d12.l(d12.f51984k.x() ? 4 : 2, null), null, null, null, null);
            }
        }
    }

    @Override // androidx.media3.session.J.d
    public final long q() {
        return this.f52505n.f51970B;
    }

    public final void q0(D1 d12, @j.P Integer num, @j.P Integer num2, @j.P Integer num3, @j.P Integer num4) {
        D1 d13 = this.f52505n;
        this.f52505n = d12;
        l0(d13, d12, num, num2, num3, num4);
    }

    @Override // androidx.media3.session.J.d
    public final void r(final int i12, final boolean z12) {
        if (e0(34)) {
            Y(new d() { // from class: androidx.media3.session.a0
                @Override // androidx.media3.session.C23229i0.d
                public final void e(InterfaceC23246o interfaceC23246o, int i13) {
                    interfaceC23246o.L0(this.f52352b.f52494c, i13, z12, i12);
                }
            });
            D1 d12 = this.f52505n;
            if (d12.f51993t != z12) {
                this.f52505n = d12.b(d12.f51992s, z12);
                C23208b0 c23208b0 = new C23208b0(this, z12, 0);
                androidx.media3.common.util.r<H.g> rVar = this.f52499h;
                rVar.c(30, c23208b0);
                rVar.b();
            }
        }
    }

    @Override // androidx.media3.session.J.d
    public final void release() {
        InterfaceC23246o interfaceC23246o = this.f52513v;
        if (this.f52504m) {
            return;
        }
        this.f52504m = true;
        this.f52502k = null;
        b bVar = this.f52500i;
        Handler handler = bVar.f52518a;
        if (handler.hasMessages(1)) {
            try {
                C23229i0 c23229i0 = C23229i0.this;
                c23229i0.f52513v.D2(c23229i0.f52494c);
            } catch (RemoteException unused) {
                androidx.media3.common.util.s.g();
            }
        }
        handler.removeCallbacksAndMessages(null);
        this.f52513v = null;
        if (interfaceC23246o != null) {
            int iA2 = this.f52493b.a();
            try {
                interfaceC23246o.asBinder().unlinkToDeath(this.f52498g, 0);
                interfaceC23246o.Z0(this.f52494c, iA2);
            } catch (RemoteException unused2) {
            }
        }
        this.f52499h.d();
        J1 j12 = this.f52493b;
        Z z12 = new Z(this, 0);
        synchronized (j12.f52095a) {
            try {
                Handler handlerN = androidx.media3.common.util.M.n(null);
                j12.f52099e = handlerN;
                j12.f52098d = z12;
                if (j12.f52097c.isEmpty()) {
                    j12.b();
                } else {
                    handlerN.postDelayed(new Z(j12, 1), 30000L);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media3.session.J.d
    public final void s(int i12) {
        if (e0(34)) {
            Y(new M(this, i12, 4));
            D1 d12 = this.f52505n;
            int i13 = d12.f51992s + 1;
            int i14 = d12.f51991r.f47694d;
            if (i14 == 0 || i13 <= i14) {
                this.f52505n = d12.b(i13, d12.f51993t);
                M m12 = new M(this, i13, 5);
                androidx.media3.common.util.r<H.g> rVar = this.f52499h;
                rVar.c(30, m12);
                rVar.b();
            }
        }
    }

    @Override // androidx.media3.session.J.d
    public final void seekTo(long j12) {
        if (e0(5)) {
            Y(new O(this, j12));
            n0(a0(this.f52505n), j12);
        }
    }

    @Override // androidx.media3.session.J.d
    public final void setPlayWhenReady(boolean z12) {
        if (e0(1)) {
            Y(new C23208b0(this, z12, 4));
            p0(z12);
        }
    }

    @Override // androidx.media3.session.J.d
    public final void setPlaybackSpeed(float f12) {
        if (e0(13)) {
            Y(new Y(f12, 0, this));
            androidx.media3.common.G g12 = this.f52505n.f51981h;
            if (g12.f47236b != f12) {
                androidx.media3.common.G g13 = new androidx.media3.common.G(f12, g12.f47237c);
                this.f52505n = this.f52505n.j(g13);
                C23239l1 c23239l1 = new C23239l1(g13, 2);
                androidx.media3.common.util.r<H.g> rVar = this.f52499h;
                rVar.c(12, c23239l1);
                rVar.b();
            }
        }
    }

    @Override // androidx.media3.session.J.d
    public final void setRepeatMode(int i12) {
        if (e0(15)) {
            Y(new M(this, i12, 6));
            D1 d12 = this.f52505n;
            if (d12.f51982i != i12) {
                D1.a aVar = new D1.a(d12);
                aVar.f52012h = i12;
                this.f52505n = aVar.a();
                C23261t0 c23261t0 = new C23261t0(i12, 6);
                androidx.media3.common.util.r<H.g> rVar = this.f52499h;
                rVar.c(8, c23261t0);
                rVar.b();
            }
        }
    }

    @Override // androidx.media3.session.J.d
    public final void setVolume(float f12) {
        if (e0(24)) {
            Y(new Y(f12, 1, this));
            D1 d12 = this.f52505n;
            if (d12.f51988o != f12) {
                D1.a aVar = new D1.a(d12);
                aVar.f52018n = f12;
                this.f52505n = aVar.a();
                C23230i1 c23230i1 = new C23230i1(f12, 2);
                androidx.media3.common.util.r<H.g> rVar = this.f52499h;
                rVar.c(22, c23230i1);
                rVar.b();
            }
        }
    }

    @Override // androidx.media3.session.J.d
    public final void stop() {
        if (e0(3)) {
            Y(new W(this, 4));
            D1 d12 = this.f52505n;
            N1 n12 = this.f52505n.f51977d;
            H.k kVar = n12.f52190b;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            N1 n13 = this.f52505n.f51977d;
            long j12 = n13.f52193e;
            long j13 = n13.f52190b.f47259g;
            int iB2 = C1.b(j13, j12);
            N1 n14 = this.f52505n.f51977d;
            D1 d1M = d12.m(new N1(kVar, n12.f52191c, jElapsedRealtime, j12, j13, iB2, 0L, n14.f52197i, n14.f52198j, n14.f52190b.f47259g));
            this.f52505n = d1M;
            if (d1M.f51999z != 1) {
                this.f52505n = d1M.l(1, d1M.f51975b);
                M1 m12 = new M1(9);
                androidx.media3.common.util.r<H.g> rVar = this.f52499h;
                rVar.c(4, m12);
                rVar.b();
            }
        }
    }

    @Override // androidx.media3.session.J.d
    public final void t(int i12, int i13) {
        if (e0(20)) {
            C23110a.b(i12 >= 0 && i13 >= i12);
            Y(new X(this, i12, i13, 1));
            int iW2 = this.f52505n.f51984k.w();
            int iMin = Math.min(i13, iW2);
            if (i12 >= iW2 || i12 == iMin || iW2 == 0) {
                return;
            }
            boolean z12 = a0(this.f52505n) >= i12 && a0(this.f52505n) < iMin;
            D1 d1G0 = g0(this.f52505n, i12, iMin);
            int i14 = this.f52505n.f51977d.f52190b.f47255c;
            q0(d1G0, 0, null, z12 ? 4 : null, i14 >= i12 && i14 < iMin ? 3 : null);
        }
    }

    @Override // androidx.media3.session.J.d
    public final L1 u() {
        return this.f52507p;
    }

    @Override // androidx.media3.session.J.d
    @Deprecated
    public final void v() {
        if (e0(26)) {
            Y(new W(this, 2));
            D1 d12 = this.f52505n;
            int i12 = d12.f51992s + 1;
            int i13 = d12.f51991r.f47694d;
            if (i13 == 0 || i12 <= i13) {
                this.f52505n = d12.b(i12, d12.f51993t);
                M m12 = new M(this, i12, 3);
                androidx.media3.common.util.r<H.g> rVar = this.f52499h;
                rVar.c(30, m12);
                rVar.b();
            }
        }
    }

    @Override // androidx.media3.session.J.d
    public final int w() {
        return this.f52505n.f51992s;
    }

    @Override // androidx.media3.session.J.d
    public final long x() {
        return this.f52505n.f51977d.f52197i;
    }

    @Override // androidx.media3.session.J.d
    public final androidx.media3.common.B y() {
        return this.f52505n.f51987n;
    }

    @Override // androidx.media3.session.J.d
    public final void z(androidx.media3.common.U u12) {
        if (e0(29)) {
            Y(new N(3, this, u12));
            D1 d12 = this.f52505n;
            if (u12 != d12.f51974F) {
                this.f52505n = d12.o(u12);
                C23264u0 c23264u0 = new C23264u0(u12, 8);
                androidx.media3.common.util.r<H.g> rVar = this.f52499h;
                rVar.c(19, c23264u0);
                rVar.b();
            }
        }
    }

    /* compiled from: MediaControllerImplBase.java */
    /* renamed from: androidx.media3.session.i0$f */
    public class f implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
        public f(a aVar) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i12, int i13) {
            C23229i0.this.getClass();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C23229i0.this.getClass();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i12, int i13) {
            C23229i0.this.getClass();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i12, int i13, int i14) {
            C23229i0 c23229i0 = C23229i0.this;
            c23229i0.getClass();
            if (surfaceHolder != null) {
                return;
            }
            c23229i0.j0(i13, i14);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            C23229i0 c23229i0 = C23229i0.this;
            c23229i0.getClass();
            if (surfaceHolder != null) {
                return;
            }
            c23229i0.f52511t = surfaceHolder.getSurface();
            c23229i0.Z(new C23235k0(this, 0));
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            c23229i0.j0(surfaceFrame.width(), surfaceFrame.height());
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C23229i0 c23229i0 = C23229i0.this;
            c23229i0.getClass();
            if (surfaceHolder != null) {
                return;
            }
            c23229i0.f52511t = null;
            c23229i0.Z(new C23235k0(this, 1));
            c23229i0.j0(0, 0);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
