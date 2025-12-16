package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.InterfaceC36572b;
import com.google.android.exoplayer2.util.C36585a;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class ClippingMediaSource extends AbstractC36542e<Void> {

    /* renamed from: l, reason: collision with root package name */
    public final y f345923l;

    /* renamed from: m, reason: collision with root package name */
    public final long f345924m;

    /* renamed from: n, reason: collision with root package name */
    public final long f345925n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f345926o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f345927p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f345928q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList<C36540c> f345929r;

    /* renamed from: s, reason: collision with root package name */
    public final s0.d f345930s;

    /* renamed from: t, reason: collision with root package name */
    @j.P
    public a f345931t;

    /* renamed from: u, reason: collision with root package name */
    @j.P
    public IllegalClippingException f345932u;

    /* renamed from: v, reason: collision with root package name */
    public long f345933v;

    /* renamed from: w, reason: collision with root package name */
    public long f345934w;

    public static final class IllegalClippingException extends IOException {

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public IllegalClippingException(int i12) {
            super("Illegal clipping: ".concat(i12 != 0 ? i12 != 1 ? i12 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
        }
    }

    public static final class a extends AbstractC36552o {

        /* renamed from: d, reason: collision with root package name */
        public final long f345935d;

        /* renamed from: e, reason: collision with root package name */
        public final long f345936e;

        /* renamed from: f, reason: collision with root package name */
        public final long f345937f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f345938g;

        public a(s0 s0Var, long j12, long j13) throws IllegalClippingException {
            super(s0Var);
            boolean z12 = false;
            if (s0Var.h() != 1) {
                throw new IllegalClippingException(0);
            }
            s0.d dVarM = s0Var.m(0, new s0.d(), 0L);
            long jMax = Math.max(0L, j12);
            if (!dVarM.f345891m && jMax != 0 && !dVarM.f345887i) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j13 == Long.MIN_VALUE ? dVarM.f345893o : Math.max(0L, j13);
            long j14 = dVarM.f345893o;
            if (j14 != -9223372036854775807L) {
                jMax2 = jMax2 > j14 ? j14 : jMax2;
                if (jMax > jMax2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.f345935d = jMax;
            this.f345936e = jMax2;
            this.f345937f = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
            if (dVarM.f345888j && (jMax2 == -9223372036854775807L || (j14 != -9223372036854775807L && jMax2 == j14))) {
                z12 = true;
            }
            this.f345938g = z12;
        }

        @Override // com.google.android.exoplayer2.source.AbstractC36552o, com.google.android.exoplayer2.s0
        public final s0.b f(int i12, s0.b bVar, boolean z12) {
            this.f346655c.f(0, bVar, z12);
            long j12 = bVar.f345874f - this.f345935d;
            long j13 = this.f345937f;
            bVar.h(bVar.f345870b, bVar.f345871c, 0, j13 == -9223372036854775807L ? -9223372036854775807L : j13 - j12, j12, com.google.android.exoplayer2.source.ads.a.f346179h, false);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.source.AbstractC36552o, com.google.android.exoplayer2.s0
        public final s0.d m(int i12, s0.d dVar, long j12) {
            this.f346655c.m(0, dVar, 0L);
            long j13 = dVar.f345896r;
            long j14 = this.f345935d;
            dVar.f345896r = j13 + j14;
            dVar.f345893o = this.f345937f;
            dVar.f345888j = this.f345938g;
            long j15 = dVar.f345892n;
            if (j15 != -9223372036854775807L) {
                long jMax = Math.max(j15, j14);
                dVar.f345892n = jMax;
                long j16 = this.f345936e;
                if (j16 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j16);
                }
                dVar.f345892n = jMax - j14;
            }
            long jR2 = com.google.android.exoplayer2.util.U.R(j14);
            long j17 = dVar.f345884f;
            if (j17 != -9223372036854775807L) {
                dVar.f345884f = j17 + jR2;
            }
            long j18 = dVar.f345885g;
            if (j18 != -9223372036854775807L) {
                dVar.f345885g = j18 + jR2;
            }
            return dVar;
        }
    }

    public ClippingMediaSource(y yVar, long j12, long j13, boolean z12, boolean z13, boolean z14) {
        C36585a.b(j12 >= 0);
        yVar.getClass();
        this.f345923l = yVar;
        this.f345924m = j12;
        this.f345925n = j13;
        this.f345926o = z12;
        this.f345927p = z13;
        this.f345928q = z14;
        this.f345929r = new ArrayList<>();
        this.f345930s = new s0.d();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e, com.google.android.exoplayer2.source.AbstractC36538a
    public final void B(@j.P com.google.android.exoplayer2.upstream.M m12) {
        super.B(m12);
        H(null, this.f345923l);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e, com.google.android.exoplayer2.source.AbstractC36538a
    public final void D() {
        super.D();
        this.f345932u = null;
        this.f345931t = null;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e
    public final void G(Object obj, AbstractC36538a abstractC36538a, s0 s0Var) {
        if (this.f345932u != null) {
            return;
        }
        J(s0Var);
    }

    public final void J(s0 s0Var) {
        long j12;
        long j13;
        long j14;
        s0.d dVar = this.f345930s;
        s0Var.n(0, dVar);
        long j15 = dVar.f345896r;
        a aVar = this.f345931t;
        ArrayList<C36540c> arrayList = this.f345929r;
        long j16 = this.f345925n;
        if (aVar == null || arrayList.isEmpty() || this.f345927p) {
            boolean z12 = this.f345928q;
            long j17 = this.f345924m;
            if (z12) {
                long j18 = dVar.f345892n;
                j17 += j18;
                j12 = j18 + j16;
            } else {
                j12 = j16;
            }
            this.f345933v = j15 + j17;
            this.f345934w = j16 != Long.MIN_VALUE ? j15 + j12 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                C36540c c36540c = arrayList.get(i12);
                long j19 = this.f345933v;
                long j22 = this.f345934w;
                c36540c.f346208f = j19;
                c36540c.f346209g = j22;
            }
            j13 = j17;
            j14 = j12;
        } else {
            long j23 = this.f345933v - j15;
            j14 = j16 != Long.MIN_VALUE ? this.f345934w - j15 : Long.MIN_VALUE;
            j13 = j23;
        }
        try {
            a aVar2 = new a(s0Var, j13, j14);
            this.f345931t = aVar2;
            C(aVar2);
        } catch (IllegalClippingException e12) {
            this.f345932u = e12;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                arrayList.get(i13).f346210h = this.f345932u;
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.y
    public final InterfaceC36559w c(y.b bVar, InterfaceC36572b interfaceC36572b, long j12) {
        C36540c c36540c = new C36540c(this.f345923l.c(bVar, interfaceC36572b, j12), this.f345926o, this.f345933v, this.f345934w);
        this.f345929r.add(c36540c);
        return c36540c;
    }

    @Override // com.google.android.exoplayer2.source.y
    public final com.google.android.exoplayer2.O getMediaItem() {
        return this.f345923l.getMediaItem();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e, com.google.android.exoplayer2.source.y
    public final void maybeThrowSourceInfoRefreshError() throws IllegalClippingException {
        IllegalClippingException illegalClippingException = this.f345932u;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void t(InterfaceC36559w interfaceC36559w) {
        ArrayList<C36540c> arrayList = this.f345929r;
        C36585a.d(arrayList.remove(interfaceC36559w));
        this.f345923l.t(((C36540c) interfaceC36559w).f346204b);
        if (!arrayList.isEmpty() || this.f345927p) {
            return;
        }
        a aVar = this.f345931t;
        aVar.getClass();
        J(aVar.f346655c);
    }
}
