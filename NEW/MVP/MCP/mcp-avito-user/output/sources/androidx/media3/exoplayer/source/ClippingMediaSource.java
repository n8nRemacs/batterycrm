package androidx.media3.exoplayer.source;

import androidx.media3.common.C23089c;
import androidx.media3.common.P;
import androidx.media3.common.util.C23110a;
import androidx.media3.exoplayer.source.A;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class ClippingMediaSource extends Z {

    /* renamed from: m, reason: collision with root package name */
    public final long f49468m;

    /* renamed from: n, reason: collision with root package name */
    public final long f49469n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f49470o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f49471p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f49472q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList<C23152c> f49473r;

    /* renamed from: s, reason: collision with root package name */
    public final P.d f49474s;

    /* renamed from: t, reason: collision with root package name */
    @j.P
    public a f49475t;

    /* renamed from: u, reason: collision with root package name */
    @j.P
    public IllegalClippingException f49476u;

    /* renamed from: v, reason: collision with root package name */
    public long f49477v;

    /* renamed from: w, reason: collision with root package name */
    public long f49478w;

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

    public static final class a extends AbstractC23166q {

        /* renamed from: h, reason: collision with root package name */
        public final long f49479h;

        /* renamed from: i, reason: collision with root package name */
        public final long f49480i;

        /* renamed from: j, reason: collision with root package name */
        public final long f49481j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f49482k;

        public a(androidx.media3.common.P p12, long j12, long j13) throws IllegalClippingException {
            super(p12);
            boolean z12 = false;
            if (p12.p() != 1) {
                throw new IllegalClippingException(0);
            }
            P.d dVarU = p12.u(0, new P.d(), 0L);
            long jMax = Math.max(0L, j12);
            if (!dVarU.f47418m && jMax != 0 && !dVarU.f47414i) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j13 == Long.MIN_VALUE ? dVarU.f47420o : Math.max(0L, j13);
            long j14 = dVarU.f47420o;
            if (j14 != -9223372036854775807L) {
                jMax2 = jMax2 > j14 ? j14 : jMax2;
                if (jMax > jMax2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.f49479h = jMax;
            this.f49480i = jMax2;
            this.f49481j = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
            if (dVarU.f47415j && (jMax2 == -9223372036854775807L || (j14 != -9223372036854775807L && jMax2 == j14))) {
                z12 = true;
            }
            this.f49482k = z12;
        }

        @Override // androidx.media3.exoplayer.source.AbstractC23166q, androidx.media3.common.P
        public final P.b n(int i12, P.b bVar, boolean z12) {
            this.f49820g.n(0, bVar, z12);
            long j12 = bVar.f47383f - this.f49479h;
            long j13 = this.f49481j;
            bVar.p(bVar.f47379b, bVar.f47380c, 0, j13 == -9223372036854775807L ? -9223372036854775807L : j13 - j12, j12, C23089c.f47615g, false);
            return bVar;
        }

        @Override // androidx.media3.exoplayer.source.AbstractC23166q, androidx.media3.common.P
        public final P.d u(int i12, P.d dVar, long j12) {
            this.f49820g.u(0, dVar, 0L);
            long j13 = dVar.f47423r;
            long j14 = this.f49479h;
            dVar.f47423r = j13 + j14;
            dVar.f47420o = this.f49481j;
            dVar.f47415j = this.f49482k;
            long j15 = dVar.f47419n;
            if (j15 != -9223372036854775807L) {
                long jMax = Math.max(j15, j14);
                dVar.f47419n = jMax;
                long j16 = this.f49480i;
                if (j16 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j16);
                }
                dVar.f47419n = jMax - j14;
            }
            long jQ2 = androidx.media3.common.util.M.Q(j14);
            long j17 = dVar.f47411f;
            if (j17 != -9223372036854775807L) {
                dVar.f47411f = j17 + jQ2;
            }
            long j18 = dVar.f47412g;
            if (j18 != -9223372036854775807L) {
                dVar.f47412g = j18 + jQ2;
            }
            return dVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClippingMediaSource(A a12, long j12, long j13, boolean z12, boolean z13, boolean z14) {
        super(a12);
        a12.getClass();
        C23110a.b(j12 >= 0);
        this.f49468m = j12;
        this.f49469n = j13;
        this.f49470o = z12;
        this.f49471p = z13;
        this.f49472q = z14;
        this.f49473r = new ArrayList<>();
        this.f49474s = new P.d();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e, androidx.media3.exoplayer.source.AbstractC23150a
    public final void C() {
        super.C();
        this.f49476u = null;
        this.f49475t = null;
    }

    public final void M(androidx.media3.common.P p12) {
        long j12;
        long j13;
        long j14;
        P.d dVar = this.f49474s;
        p12.v(0, dVar);
        long j15 = dVar.f47423r;
        a aVar = this.f49475t;
        ArrayList<C23152c> arrayList = this.f49473r;
        long j16 = this.f49469n;
        if (aVar == null || arrayList.isEmpty() || this.f49471p) {
            boolean z12 = this.f49472q;
            long j17 = this.f49468m;
            if (z12) {
                long j18 = dVar.f47419n;
                j17 += j18;
                j12 = j18 + j16;
            } else {
                j12 = j16;
            }
            this.f49477v = j15 + j17;
            this.f49478w = j16 != Long.MIN_VALUE ? j15 + j12 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                C23152c c23152c = arrayList.get(i12);
                long j19 = this.f49477v;
                long j22 = this.f49478w;
                c23152c.f49741f = j19;
                c23152c.f49742g = j22;
            }
            j13 = j17;
            j14 = j12;
        } else {
            long j23 = this.f49477v - j15;
            j14 = j16 != Long.MIN_VALUE ? this.f49478w - j15 : Long.MIN_VALUE;
            j13 = j23;
        }
        try {
            a aVar2 = new a(p12, j13, j14);
            this.f49475t = aVar2;
            z(aVar2);
        } catch (IllegalClippingException e12) {
            this.f49476u = e12;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                arrayList.get(i13).f49743h = this.f49476u;
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.Z, androidx.media3.exoplayer.source.A
    public final InterfaceC23174z e(A.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j12) {
        C23152c c23152c = new C23152c(this.f49711l.e(bVar, bVar2, j12), this.f49470o, this.f49477v, this.f49478w);
        this.f49473r.add(c23152c);
        return c23152c;
    }

    @Override // androidx.media3.exoplayer.source.Z, androidx.media3.exoplayer.source.A
    public final void k(InterfaceC23174z interfaceC23174z) {
        ArrayList<C23152c> arrayList = this.f49473r;
        C23110a.g(arrayList.remove(interfaceC23174z));
        this.f49711l.k(((C23152c) interfaceC23174z).f49737b);
        if (!arrayList.isEmpty() || this.f49471p) {
            return;
        }
        a aVar = this.f49475t;
        aVar.getClass();
        M(aVar.f49820g);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23154e, androidx.media3.exoplayer.source.A
    public final void maybeThrowSourceInfoRefreshError() throws IllegalClippingException {
        IllegalClippingException illegalClippingException = this.f49476u;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23150a
    public final void w(androidx.media3.common.P p12) {
        if (this.f49476u != null) {
            return;
        }
        M(p12);
    }
}
