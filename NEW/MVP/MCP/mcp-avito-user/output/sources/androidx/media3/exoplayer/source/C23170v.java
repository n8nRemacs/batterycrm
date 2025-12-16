package androidx.media3.exoplayer.source;

import androidx.media3.common.C23089c;
import androidx.media3.common.P;
import androidx.media3.exoplayer.source.A;
import j.k0;

/* compiled from: MaskingMediaSource.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.exoplayer.source.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23170v extends Z {

    /* renamed from: m, reason: collision with root package name */
    public final boolean f49840m;

    /* renamed from: n, reason: collision with root package name */
    public final P.d f49841n;

    /* renamed from: o, reason: collision with root package name */
    public final P.b f49842o;

    /* renamed from: p, reason: collision with root package name */
    public a f49843p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    public C23169u f49844q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f49845r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f49846s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f49847t;

    /* compiled from: MaskingMediaSource.java */
    /* renamed from: androidx.media3.exoplayer.source.v$a */
    public static final class a extends AbstractC23166q {

        /* renamed from: j, reason: collision with root package name */
        public static final Object f49848j = new Object();

        /* renamed from: h, reason: collision with root package name */
        @j.P
        public final Object f49849h;

        /* renamed from: i, reason: collision with root package name */
        @j.P
        public final Object f49850i;

        public a(androidx.media3.common.P p12, @j.P Object obj, @j.P Object obj2) {
            super(p12);
            this.f49849h = obj;
            this.f49850i = obj2;
        }

        @Override // androidx.media3.exoplayer.source.AbstractC23166q, androidx.media3.common.P
        public final int g(Object obj) {
            Object obj2;
            if (f49848j.equals(obj) && (obj2 = this.f49850i) != null) {
                obj = obj2;
            }
            return this.f49820g.g(obj);
        }

        @Override // androidx.media3.exoplayer.source.AbstractC23166q, androidx.media3.common.P
        public final P.b n(int i12, P.b bVar, boolean z12) {
            this.f49820g.n(i12, bVar, z12);
            if (androidx.media3.common.util.M.a(bVar.f47380c, this.f49850i) && z12) {
                bVar.f47380c = f49848j;
            }
            return bVar;
        }

        @Override // androidx.media3.exoplayer.source.AbstractC23166q, androidx.media3.common.P
        public final Object t(int i12) {
            Object objT = this.f49820g.t(i12);
            return androidx.media3.common.util.M.a(objT, this.f49850i) ? f49848j : objT;
        }

        @Override // androidx.media3.exoplayer.source.AbstractC23166q, androidx.media3.common.P
        public final P.d u(int i12, P.d dVar, long j12) {
            this.f49820g.u(i12, dVar, j12);
            if (androidx.media3.common.util.M.a(dVar.f47407b, this.f49849h)) {
                dVar.f47407b = P.d.f47399s;
            }
            return dVar;
        }
    }

    /* compiled from: MaskingMediaSource.java */
    @k0
    /* renamed from: androidx.media3.exoplayer.source.v$b */
    public static final class b extends androidx.media3.common.P {

        /* renamed from: g, reason: collision with root package name */
        public final androidx.media3.common.z f49851g;

        public b(androidx.media3.common.z zVar) {
            this.f49851g = zVar;
        }

        @Override // androidx.media3.common.P
        public final int g(Object obj) {
            return obj == a.f49848j ? 0 : -1;
        }

        @Override // androidx.media3.common.P
        public final P.b n(int i12, P.b bVar, boolean z12) {
            bVar.p(z12 ? 0 : null, z12 ? a.f49848j : null, 0, -9223372036854775807L, 0L, C23089c.f47615g, true);
            return bVar;
        }

        @Override // androidx.media3.common.P
        public final int p() {
            return 1;
        }

        @Override // androidx.media3.common.P
        public final Object t(int i12) {
            return a.f49848j;
        }

        @Override // androidx.media3.common.P
        public final P.d u(int i12, P.d dVar, long j12) {
            dVar.b(P.d.f47399s, this.f49851g, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f47418m = true;
            return dVar;
        }

        @Override // androidx.media3.common.P
        public final int w() {
            return 1;
        }
    }

    public C23170v(A a12, boolean z12) {
        super(a12);
        this.f49840m = z12 && a12.b();
        this.f49841n = new P.d();
        this.f49842o = new P.b();
        androidx.media3.common.P pA2 = a12.a();
        if (pA2 == null) {
            this.f49843p = new a(new b(a12.getMediaItem()), P.d.f47399s, a.f49848j);
        } else {
            this.f49843p = new a(pA2, null, null);
            this.f49847t = true;
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e, androidx.media3.exoplayer.source.AbstractC23150a
    public final void C() {
        this.f49846s = false;
        this.f49845r = false;
        super.C();
    }

    @Override // androidx.media3.exoplayer.source.Z
    @j.P
    public final A.b J(A.b bVar) {
        Object obj = bVar.f47212a;
        Object obj2 = this.f49843p.f49850i;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a.f49848j;
        }
        return bVar.b(obj);
    }

    @Override // androidx.media3.exoplayer.source.Z
    public final void L() {
        if (this.f49840m) {
            return;
        }
        this.f49845r = true;
        K();
    }

    @Override // androidx.media3.exoplayer.source.Z, androidx.media3.exoplayer.source.A
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final C23169u e(A.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j12) {
        C23169u c23169u = new C23169u(bVar, bVar2, j12);
        c23169u.c(this.f49711l);
        if (this.f49846s) {
            Object obj = this.f49843p.f49850i;
            Object obj2 = bVar.f47212a;
            if (obj != null && obj2.equals(a.f49848j)) {
                obj2 = this.f49843p.f49850i;
            }
            c23169u.a(bVar.b(obj2));
        } else {
            this.f49844q = c23169u;
            if (!this.f49845r) {
                this.f49845r = true;
                K();
            }
        }
        return c23169u;
    }

    @v61.m
    public final void N(long j12) {
        C23169u c23169u = this.f49844q;
        int iG2 = this.f49843p.g(c23169u.f49831b.f47212a);
        if (iG2 == -1) {
            return;
        }
        a aVar = this.f49843p;
        P.b bVar = this.f49842o;
        aVar.n(iG2, bVar, false);
        long j13 = bVar.f47382e;
        if (j13 != -9223372036854775807L && j12 >= j13) {
            j12 = Math.max(0L, j13 - 1);
        }
        c23169u.f49839j = j12;
    }

    @Override // androidx.media3.exoplayer.source.Z, androidx.media3.exoplayer.source.A
    public final void k(InterfaceC23174z interfaceC23174z) {
        ((C23169u) interfaceC23174z).b();
        if (interfaceC23174z == this.f49844q) {
            this.f49844q = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.exoplayer.source.AbstractC23150a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(androidx.media3.common.P r15) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.C23170v.w(androidx.media3.common.P):void");
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e, androidx.media3.exoplayer.source.A
    public final void maybeThrowSourceInfoRefreshError() {
    }
}
