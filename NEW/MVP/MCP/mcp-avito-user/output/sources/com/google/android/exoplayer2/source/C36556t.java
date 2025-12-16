package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.InterfaceC36572b;
import j.k0;

/* compiled from: MaskingMediaSource.java */
/* renamed from: com.google.android.exoplayer2.source.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36556t extends AbstractC36542e<Void> {

    /* renamed from: l, reason: collision with root package name */
    public final y f346675l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f346676m;

    /* renamed from: n, reason: collision with root package name */
    public final s0.d f346677n;

    /* renamed from: o, reason: collision with root package name */
    public final s0.b f346678o;

    /* renamed from: p, reason: collision with root package name */
    public a f346679p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    public C36555s f346680q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f346681r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f346682s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f346683t;

    /* compiled from: MaskingMediaSource.java */
    /* renamed from: com.google.android.exoplayer2.source.t$a */
    public static final class a extends AbstractC36552o {

        /* renamed from: f, reason: collision with root package name */
        public static final Object f346684f = new Object();

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public final Object f346685d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        public final Object f346686e;

        public a(s0 s0Var, @j.P Object obj, @j.P Object obj2) {
            super(s0Var);
            this.f346685d = obj;
            this.f346686e = obj2;
        }

        @Override // com.google.android.exoplayer2.source.AbstractC36552o, com.google.android.exoplayer2.s0
        public final int b(Object obj) {
            Object obj2;
            if (f346684f.equals(obj) && (obj2 = this.f346686e) != null) {
                obj = obj2;
            }
            return this.f346655c.b(obj);
        }

        @Override // com.google.android.exoplayer2.source.AbstractC36552o, com.google.android.exoplayer2.s0
        public final s0.b f(int i12, s0.b bVar, boolean z12) {
            this.f346655c.f(i12, bVar, z12);
            if (com.google.android.exoplayer2.util.U.a(bVar.f345871c, this.f346686e) && z12) {
                bVar.f345871c = f346684f;
            }
            return bVar;
        }

        @Override // com.google.android.exoplayer2.source.AbstractC36552o, com.google.android.exoplayer2.s0
        public final Object l(int i12) {
            Object objL = this.f346655c.l(i12);
            return com.google.android.exoplayer2.util.U.a(objL, this.f346686e) ? f346684f : objL;
        }

        @Override // com.google.android.exoplayer2.source.AbstractC36552o, com.google.android.exoplayer2.s0
        public final s0.d m(int i12, s0.d dVar, long j12) {
            this.f346655c.m(i12, dVar, j12);
            if (com.google.android.exoplayer2.util.U.a(dVar.f345880b, this.f346685d)) {
                dVar.f345880b = s0.d.f345877s;
            }
            return dVar;
        }
    }

    /* compiled from: MaskingMediaSource.java */
    @k0
    /* renamed from: com.google.android.exoplayer2.source.t$b */
    public static final class b extends s0 {

        /* renamed from: c, reason: collision with root package name */
        public final com.google.android.exoplayer2.O f346687c;

        public b(com.google.android.exoplayer2.O o12) {
            this.f346687c = o12;
        }

        @Override // com.google.android.exoplayer2.s0
        public final int b(Object obj) {
            return obj == a.f346684f ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.s0
        public final s0.b f(int i12, s0.b bVar, boolean z12) {
            bVar.h(z12 ? 0 : null, z12 ? a.f346684f : null, 0, -9223372036854775807L, 0L, com.google.android.exoplayer2.source.ads.a.f346179h, true);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.s0
        public final int h() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.s0
        public final Object l(int i12) {
            return a.f346684f;
        }

        @Override // com.google.android.exoplayer2.s0
        public final s0.d m(int i12, s0.d dVar, long j12) {
            dVar.b(s0.d.f345877s, this.f346687c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f345891m = true;
            return dVar;
        }

        @Override // com.google.android.exoplayer2.s0
        public final int o() {
            return 1;
        }
    }

    public C36556t(y yVar, boolean z12) {
        this.f346675l = yVar;
        this.f346676m = z12 && yVar.b();
        this.f346677n = new s0.d();
        this.f346678o = new s0.b();
        s0 s0VarA = yVar.a();
        if (s0VarA == null) {
            this.f346679p = new a(new b(yVar.getMediaItem()), s0.d.f345877s, a.f346684f);
        } else {
            this.f346679p = new a(s0VarA, null, null);
            this.f346683t = true;
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e, com.google.android.exoplayer2.source.AbstractC36538a
    public final void B(@j.P com.google.android.exoplayer2.upstream.M m12) {
        super.B(m12);
        if (this.f346676m) {
            return;
        }
        this.f346681r = true;
        H(null, this.f346675l);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e, com.google.android.exoplayer2.source.AbstractC36538a
    public final void D() {
        this.f346682s = false;
        this.f346681r = false;
        super.D();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e
    @j.P
    public final y.b E(Void r22, y.b bVar) {
        Object obj = bVar.f346696a;
        Object obj2 = this.f346679p.f346686e;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a.f346684f;
        }
        return bVar.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.AbstractC36542e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(java.lang.Object r13, com.google.android.exoplayer2.source.AbstractC36538a r14, com.google.android.exoplayer2.s0 r15) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C36556t.G(java.lang.Object, com.google.android.exoplayer2.source.a, com.google.android.exoplayer2.s0):void");
    }

    @Override // com.google.android.exoplayer2.source.y
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final C36555s c(y.b bVar, InterfaceC36572b interfaceC36572b, long j12) {
        C36555s c36555s = new C36555s(bVar, interfaceC36572b, j12);
        y yVar = this.f346675l;
        c36555s.h(yVar);
        if (this.f346682s) {
            Object obj = this.f346679p.f346686e;
            Object obj2 = bVar.f346696a;
            if (obj != null && obj2.equals(a.f346684f)) {
                obj2 = this.f346679p.f346686e;
            }
            c36555s.a(bVar.b(obj2));
        } else {
            this.f346680q = c36555s;
            if (!this.f346681r) {
                this.f346681r = true;
                H(null, yVar);
            }
        }
        return c36555s;
    }

    @v61.m
    public final void K(long j12) {
        C36555s c36555s = this.f346680q;
        int iB2 = this.f346679p.b(c36555s.f346666b.f346696a);
        if (iB2 == -1) {
            return;
        }
        a aVar = this.f346679p;
        s0.b bVar = this.f346678o;
        aVar.f(iB2, bVar, false);
        long j13 = bVar.f345873e;
        if (j13 != -9223372036854775807L && j12 >= j13) {
            j12 = Math.max(0L, j13 - 1);
        }
        c36555s.f346674j = j12;
    }

    @Override // com.google.android.exoplayer2.source.y
    public final com.google.android.exoplayer2.O getMediaItem() {
        return this.f346675l.getMediaItem();
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void t(InterfaceC36559w interfaceC36559w) {
        ((C36555s) interfaceC36559w).b();
        if (interfaceC36559w == this.f346680q) {
            this.f346680q = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e, com.google.android.exoplayer2.source.y
    public final void maybeThrowSourceInfoRefreshError() {
    }
}
