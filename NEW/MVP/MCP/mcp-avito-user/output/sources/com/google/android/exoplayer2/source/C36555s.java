package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.source.InterfaceC36559w;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.InterfaceC36572b;
import com.google.android.exoplayer2.util.C36585a;
import java.io.IOException;

/* compiled from: MaskingMediaPeriod.java */
/* renamed from: com.google.android.exoplayer2.source.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36555s implements InterfaceC36559w, InterfaceC36559w.a {

    /* renamed from: b, reason: collision with root package name */
    public final y.b f346666b;

    /* renamed from: c, reason: collision with root package name */
    public final long f346667c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC36572b f346668d;

    /* renamed from: e, reason: collision with root package name */
    public y f346669e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC36559w f346670f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public InterfaceC36559w.a f346671g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public a f346672h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f346673i;

    /* renamed from: j, reason: collision with root package name */
    public long f346674j = -9223372036854775807L;

    /* compiled from: MaskingMediaPeriod.java */
    /* renamed from: com.google.android.exoplayer2.source.s$a */
    public interface a {
        void a(y.b bVar, IOException iOException);

        void b(y.b bVar);
    }

    public C36555s(y.b bVar, InterfaceC36572b interfaceC36572b, long j12) {
        this.f346666b = bVar;
        this.f346668d = interfaceC36572b;
        this.f346667c = j12;
    }

    public final void a(y.b bVar) {
        long j12 = this.f346674j;
        if (j12 == -9223372036854775807L) {
            j12 = this.f346667c;
        }
        y yVar = this.f346669e;
        yVar.getClass();
        InterfaceC36559w interfaceC36559wC = yVar.c(bVar, this.f346668d, j12);
        this.f346670f = interfaceC36559wC;
        if (this.f346671g != null) {
            interfaceC36559wC.e(this, j12);
        }
    }

    public final void b() {
        if (this.f346670f != null) {
            y yVar = this.f346669e;
            yVar.getClass();
            yVar.t(this.f346670f);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w.a
    public final void c(InterfaceC36559w interfaceC36559w) {
        InterfaceC36559w.a aVar = this.f346671g;
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        aVar.c(this);
        a aVar2 = this.f346672h;
        if (aVar2 == null) {
            return;
        }
        aVar2.b(this.f346666b);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final boolean continueLoading(long j12) {
        InterfaceC36559w interfaceC36559w = this.f346670f;
        return interfaceC36559w != null && interfaceC36559w.continueLoading(j12);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long d(long j12, l0 l0Var) {
        InterfaceC36559w interfaceC36559w = this.f346670f;
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        return interfaceC36559w.d(j12, l0Var);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final void discardBuffer(long j12, boolean z12) {
        InterfaceC36559w interfaceC36559w = this.f346670f;
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        interfaceC36559w.discardBuffer(j12, z12);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final void e(InterfaceC36559w.a aVar, long j12) {
        this.f346671g = aVar;
        InterfaceC36559w interfaceC36559w = this.f346670f;
        if (interfaceC36559w != null) {
            long j13 = this.f346674j;
            if (j13 == -9223372036854775807L) {
                j13 = this.f346667c;
            }
            interfaceC36559w.e(this, j13);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long f(com.google.android.exoplayer2.trackselection.k[] kVarArr, boolean[] zArr, M[] mArr, boolean[] zArr2, long j12) {
        long j13;
        long j14 = this.f346674j;
        if (j14 == -9223372036854775807L || j12 != this.f346667c) {
            j13 = j12;
        } else {
            this.f346674j = -9223372036854775807L;
            j13 = j14;
        }
        InterfaceC36559w interfaceC36559w = this.f346670f;
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        return interfaceC36559w.f(kVarArr, zArr, mArr, zArr2, j13);
    }

    @Override // com.google.android.exoplayer2.source.N.a
    public final void g(N n12) {
        InterfaceC36559w.a aVar = this.f346671g;
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        aVar.g(this);
    }

    @Override // com.google.android.exoplayer2.source.N
    public final long getBufferedPositionUs() {
        InterfaceC36559w interfaceC36559w = this.f346670f;
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        return interfaceC36559w.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.N
    public final long getNextLoadPositionUs() {
        InterfaceC36559w interfaceC36559w = this.f346670f;
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        return interfaceC36559w.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final W getTrackGroups() {
        InterfaceC36559w interfaceC36559w = this.f346670f;
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        return interfaceC36559w.getTrackGroups();
    }

    public final void h(y yVar) {
        C36585a.d(this.f346669e == null);
        this.f346669e = yVar;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final boolean isLoading() {
        InterfaceC36559w interfaceC36559w = this.f346670f;
        return interfaceC36559w != null && interfaceC36559w.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final void maybeThrowPrepareError() throws IOException {
        try {
            InterfaceC36559w interfaceC36559w = this.f346670f;
            if (interfaceC36559w != null) {
                interfaceC36559w.maybeThrowPrepareError();
            } else {
                y yVar = this.f346669e;
                if (yVar != null) {
                    yVar.maybeThrowSourceInfoRefreshError();
                }
            }
        } catch (IOException e12) {
            a aVar = this.f346672h;
            if (aVar == null) {
                throw e12;
            }
            if (this.f346673i) {
                return;
            }
            this.f346673i = true;
            aVar.a(this.f346666b, e12);
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long readDiscontinuity() {
        InterfaceC36559w interfaceC36559w = this.f346670f;
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        return interfaceC36559w.readDiscontinuity();
    }

    @Override // com.google.android.exoplayer2.source.N
    public final void reevaluateBuffer(long j12) {
        InterfaceC36559w interfaceC36559w = this.f346670f;
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        interfaceC36559w.reevaluateBuffer(j12);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long seekToUs(long j12) {
        InterfaceC36559w interfaceC36559w = this.f346670f;
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        return interfaceC36559w.seekToUs(j12);
    }
}
