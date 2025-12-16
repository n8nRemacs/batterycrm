package androidx.media3.exoplayer.source;

import androidx.media3.common.util.C23110a;
import androidx.media3.exoplayer.g0;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.InterfaceC23174z;
import java.io.IOException;

/* compiled from: MaskingMediaPeriod.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.exoplayer.source.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23169u implements InterfaceC23174z, InterfaceC23174z.a {

    /* renamed from: b, reason: collision with root package name */
    public final A.b f49831b;

    /* renamed from: c, reason: collision with root package name */
    public final long f49832c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.b f49833d;

    /* renamed from: e, reason: collision with root package name */
    public A f49834e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC23174z f49835f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public InterfaceC23174z.a f49836g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public a f49837h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f49838i;

    /* renamed from: j, reason: collision with root package name */
    public long f49839j = -9223372036854775807L;

    /* compiled from: MaskingMediaPeriod.java */
    /* renamed from: androidx.media3.exoplayer.source.u$a */
    public interface a {
        void a(A.b bVar);

        void b(A.b bVar, IOException iOException);
    }

    public C23169u(A.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j12) {
        this.f49831b = bVar;
        this.f49833d = bVar2;
        this.f49832c = j12;
    }

    public final void a(A.b bVar) {
        long j12 = this.f49839j;
        if (j12 == -9223372036854775807L) {
            j12 = this.f49832c;
        }
        A a12 = this.f49834e;
        a12.getClass();
        InterfaceC23174z interfaceC23174zE = a12.e(bVar, this.f49833d, j12);
        this.f49835f = interfaceC23174zE;
        if (this.f49836g != null) {
            interfaceC23174zE.f(this, j12);
        }
    }

    public final void b() {
        if (this.f49835f != null) {
            A a12 = this.f49834e;
            a12.getClass();
            a12.k(this.f49835f);
        }
    }

    public final void c(A a12) {
        C23110a.g(this.f49834e == null);
        this.f49834e = a12;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final boolean continueLoading(long j12) {
        InterfaceC23174z interfaceC23174z = this.f49835f;
        return interfaceC23174z != null && interfaceC23174z.continueLoading(j12);
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final long d(androidx.media3.exoplayer.trackselection.k[] kVarArr, boolean[] zArr, P[] pArr, boolean[] zArr2, long j12) {
        long j13;
        long j14 = this.f49839j;
        if (j14 == -9223372036854775807L || j12 != this.f49832c) {
            j13 = j12;
        } else {
            this.f49839j = -9223372036854775807L;
            j13 = j14;
        }
        InterfaceC23174z interfaceC23174z = this.f49835f;
        int i12 = androidx.media3.common.util.M.f47887a;
        return interfaceC23174z.d(kVarArr, zArr, pArr, zArr2, j13);
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final void discardBuffer(long j12, boolean z12) {
        InterfaceC23174z interfaceC23174z = this.f49835f;
        int i12 = androidx.media3.common.util.M.f47887a;
        interfaceC23174z.discardBuffer(j12, z12);
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z.a
    public final void e(InterfaceC23174z interfaceC23174z) {
        InterfaceC23174z.a aVar = this.f49836g;
        int i12 = androidx.media3.common.util.M.f47887a;
        aVar.e(this);
        a aVar2 = this.f49837h;
        if (aVar2 == null) {
            return;
        }
        aVar2.a(this.f49831b);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final void f(InterfaceC23174z.a aVar, long j12) {
        this.f49836g = aVar;
        InterfaceC23174z interfaceC23174z = this.f49835f;
        if (interfaceC23174z != null) {
            long j13 = this.f49839j;
            if (j13 == -9223372036854775807L) {
                j13 = this.f49832c;
            }
            interfaceC23174z.f(this, j13);
        }
    }

    @Override // androidx.media3.exoplayer.source.Q.a
    public final void g(Q q12) {
        InterfaceC23174z.a aVar = this.f49836g;
        int i12 = androidx.media3.common.util.M.f47887a;
        aVar.g(this);
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final long getBufferedPositionUs() {
        InterfaceC23174z interfaceC23174z = this.f49835f;
        int i12 = androidx.media3.common.util.M.f47887a;
        return interfaceC23174z.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final long getNextLoadPositionUs() {
        InterfaceC23174z interfaceC23174z = this.f49835f;
        int i12 = androidx.media3.common.util.M.f47887a;
        return interfaceC23174z.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final Y getTrackGroups() {
        InterfaceC23174z interfaceC23174z = this.f49835f;
        int i12 = androidx.media3.common.util.M.f47887a;
        return interfaceC23174z.getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final long i(long j12, g0 g0Var) {
        InterfaceC23174z interfaceC23174z = this.f49835f;
        int i12 = androidx.media3.common.util.M.f47887a;
        return interfaceC23174z.i(j12, g0Var);
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final boolean isLoading() {
        InterfaceC23174z interfaceC23174z = this.f49835f;
        return interfaceC23174z != null && interfaceC23174z.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final void maybeThrowPrepareError() throws IOException {
        try {
            InterfaceC23174z interfaceC23174z = this.f49835f;
            if (interfaceC23174z != null) {
                interfaceC23174z.maybeThrowPrepareError();
            } else {
                A a12 = this.f49834e;
                if (a12 != null) {
                    a12.maybeThrowSourceInfoRefreshError();
                }
            }
        } catch (IOException e12) {
            a aVar = this.f49837h;
            if (aVar == null) {
                throw e12;
            }
            if (this.f49838i) {
                return;
            }
            this.f49838i = true;
            aVar.b(this.f49831b, e12);
            throw null;
        }
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final long readDiscontinuity() {
        InterfaceC23174z interfaceC23174z = this.f49835f;
        int i12 = androidx.media3.common.util.M.f47887a;
        return interfaceC23174z.readDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final void reevaluateBuffer(long j12) {
        InterfaceC23174z interfaceC23174z = this.f49835f;
        int i12 = androidx.media3.common.util.M.f47887a;
        interfaceC23174z.reevaluateBuffer(j12);
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final long seekToUs(long j12) {
        InterfaceC23174z interfaceC23174z = this.f49835f;
        int i12 = androidx.media3.common.util.M.f47887a;
        return interfaceC23174z.seekToUs(j12);
    }
}
