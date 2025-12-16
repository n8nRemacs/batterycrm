package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.source.InterfaceC36559w;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.InterfaceC36572b;
import com.google.android.exoplayer2.util.C36585a;
import java.util.ArrayList;

/* compiled from: SilenceMediaSource.java */
/* loaded from: classes6.dex */
public final class P extends AbstractC36538a {

    /* renamed from: k, reason: collision with root package name */
    public static final com.google.android.exoplayer2.I f346087k;

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f346088l;

    /* renamed from: i, reason: collision with root package name */
    public final long f346089i;

    /* renamed from: j, reason: collision with root package name */
    public final com.google.android.exoplayer2.O f346090j;

    /* compiled from: SilenceMediaSource.java */
    public static final class b {
    }

    static {
        I.b bVar = new I.b();
        bVar.f343504k = "audio/raw";
        bVar.f343517x = 2;
        bVar.f343518y = 44100;
        bVar.f343519z = 2;
        com.google.android.exoplayer2.I iA2 = bVar.a();
        f346087k = iA2;
        O.c cVar = new O.c();
        cVar.f343534a = "SilenceMediaSource";
        cVar.f343535b = Uri.EMPTY;
        cVar.f343536c = iA2.f343476m;
        cVar.a();
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        f346088l = new byte[4096];
    }

    public P(long j12, com.google.android.exoplayer2.O o12, a aVar) {
        C36585a.b(j12 >= 0);
        this.f346089i = j12;
        this.f346090j = o12;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36538a
    public final void B(@j.P com.google.android.exoplayer2.upstream.M m12) {
        com.google.android.exoplayer2.O o12 = this.f346090j;
        long j12 = this.f346089i;
        C(new Q(-9223372036854775807L, -9223372036854775807L, j12, j12, 0L, 0L, true, false, false, null, o12, null));
    }

    @Override // com.google.android.exoplayer2.source.y
    public final InterfaceC36559w c(y.b bVar, InterfaceC36572b interfaceC36572b, long j12) {
        return new c(this.f346089i);
    }

    @Override // com.google.android.exoplayer2.source.y
    public final com.google.android.exoplayer2.O getMediaItem() {
        return this.f346090j;
    }

    /* compiled from: SilenceMediaSource.java */
    public static final class c implements InterfaceC36559w {

        /* renamed from: d, reason: collision with root package name */
        public static final W f346091d = new W(new V("", P.f346087k));

        /* renamed from: b, reason: collision with root package name */
        public final long f346092b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<M> f346093c = new ArrayList<>();

        public c(long j12) {
            this.f346092b = j12;
        }

        @Override // com.google.android.exoplayer2.source.N
        public final boolean continueLoading(long j12) {
            return false;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final long d(long j12, l0 l0Var) {
            return com.google.android.exoplayer2.util.U.l(j12, 0L, this.f346092b);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final void e(InterfaceC36559w.a aVar, long j12) {
            aVar.c(this);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final long f(com.google.android.exoplayer2.trackselection.k[] kVarArr, boolean[] zArr, M[] mArr, boolean[] zArr2, long j12) {
            long jL2 = com.google.android.exoplayer2.util.U.l(j12, 0L, this.f346092b);
            for (int i12 = 0; i12 < kVarArr.length; i12++) {
                M m12 = mArr[i12];
                ArrayList<M> arrayList = this.f346093c;
                if (m12 != null && (kVarArr[i12] == null || !zArr[i12])) {
                    arrayList.remove(m12);
                    mArr[i12] = null;
                }
                if (mArr[i12] == null && kVarArr[i12] != null) {
                    d dVar = new d(this.f346092b);
                    dVar.a(jL2);
                    arrayList.add(dVar);
                    mArr[i12] = dVar;
                    zArr2[i12] = true;
                }
            }
            return jL2;
        }

        @Override // com.google.android.exoplayer2.source.N
        public final long getBufferedPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.android.exoplayer2.source.N
        public final long getNextLoadPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final W getTrackGroups() {
            return f346091d;
        }

        @Override // com.google.android.exoplayer2.source.N
        public final boolean isLoading() {
            return false;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final long readDiscontinuity() {
            return -9223372036854775807L;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final long seekToUs(long j12) {
            long jL2 = com.google.android.exoplayer2.util.U.l(j12, 0L, this.f346092b);
            int i12 = 0;
            while (true) {
                ArrayList<M> arrayList = this.f346093c;
                if (i12 >= arrayList.size()) {
                    return jL2;
                }
                ((d) arrayList.get(i12)).a(jL2);
                i12++;
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final void maybeThrowPrepareError() {
        }

        @Override // com.google.android.exoplayer2.source.N
        public final void reevaluateBuffer(long j12) {
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final void discardBuffer(long j12, boolean z12) {
        }
    }

    /* compiled from: SilenceMediaSource.java */
    public static final class d implements M {

        /* renamed from: b, reason: collision with root package name */
        public final long f346094b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f346095c;

        /* renamed from: d, reason: collision with root package name */
        public long f346096d;

        public d(long j12) {
            com.google.android.exoplayer2.I i12 = P.f346087k;
            int i13 = com.google.android.exoplayer2.util.U.f348106a;
            this.f346094b = 4 * ((j12 * 44100) / 1000000);
            a(0L);
        }

        public final void a(long j12) {
            com.google.android.exoplayer2.I i12 = P.f346087k;
            int i13 = com.google.android.exoplayer2.util.U.f348106a;
            this.f346096d = com.google.android.exoplayer2.util.U.l(4 * ((j12 * 44100) / 1000000), 0L, this.f346094b);
        }

        @Override // com.google.android.exoplayer2.source.M
        public final int b(long j12) {
            long j13 = this.f346096d;
            a(j12);
            return (int) ((this.f346096d - j13) / P.f346088l.length);
        }

        @Override // com.google.android.exoplayer2.source.M
        public final int g(com.google.android.exoplayer2.J j12, DecoderInputBuffer decoderInputBuffer, int i12) {
            if (!this.f346095c || (i12 & 2) != 0) {
                j12.f343521b = P.f346087k;
                this.f346095c = true;
                return -5;
            }
            long j13 = this.f346096d;
            long j14 = this.f346094b - j13;
            if (j14 == 0) {
                decoderInputBuffer.e(4);
                return -4;
            }
            com.google.android.exoplayer2.I i13 = P.f346087k;
            int i14 = com.google.android.exoplayer2.util.U.f348106a;
            decoderInputBuffer.f344207f = ((j13 / 4) * 1000000) / 44100;
            decoderInputBuffer.e(1);
            byte[] bArr = P.f346088l;
            int iMin = (int) Math.min(bArr.length, j14);
            if ((4 & i12) == 0) {
                decoderInputBuffer.j(iMin);
                decoderInputBuffer.f344205d.put(bArr, 0, iMin);
            }
            if ((i12 & 1) == 0) {
                this.f346096d += iMin;
            }
            return -4;
        }

        @Override // com.google.android.exoplayer2.source.M
        public final boolean n() {
            return true;
        }

        @Override // com.google.android.exoplayer2.source.M
        public final void c() {
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36538a
    public final void D() {
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void t(InterfaceC36559w interfaceC36559w) {
    }
}
