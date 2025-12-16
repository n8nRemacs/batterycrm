package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.g0;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.InterfaceC23174z;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.O4;

/* compiled from: FilteringMediaSource.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.exoplayer.source.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23165p extends Z {

    /* compiled from: FilteringMediaSource.java */
    /* renamed from: androidx.media3.exoplayer.source.p$a */
    public static final class a implements InterfaceC23174z, InterfaceC23174z.a {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC23174z f49817b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public InterfaceC23174z.a f49818c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public Y f49819d;

        public a(InterfaceC23174z interfaceC23174z) {
            this.f49817b = interfaceC23174z;
        }

        @Override // androidx.media3.exoplayer.source.Q
        public final boolean continueLoading(long j12) {
            return this.f49817b.continueLoading(j12);
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final long d(androidx.media3.exoplayer.trackselection.k[] kVarArr, boolean[] zArr, P[] pArr, boolean[] zArr2, long j12) {
            return this.f49817b.d(kVarArr, zArr, pArr, zArr2, j12);
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final void discardBuffer(long j12, boolean z12) {
            this.f49817b.discardBuffer(j12, z12);
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z.a
        public final void e(InterfaceC23174z interfaceC23174z) {
            Y trackGroups = interfaceC23174z.getTrackGroups();
            O4<Object> o42 = AbstractC37401r1.f359977c;
            AbstractC37401r1.a aVar = new AbstractC37401r1.a();
            if (trackGroups.f49708b > 0) {
                int i12 = trackGroups.a(0).f47441d;
                throw null;
            }
            this.f49819d = new Y((androidx.media3.common.Q[]) aVar.i().toArray(new androidx.media3.common.Q[0]));
            InterfaceC23174z.a aVar2 = this.f49818c;
            aVar2.getClass();
            aVar2.e(this);
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final void f(InterfaceC23174z.a aVar, long j12) {
            this.f49818c = aVar;
            this.f49817b.f(this, j12);
        }

        @Override // androidx.media3.exoplayer.source.Q.a
        public final void g(Q q12) {
            InterfaceC23174z.a aVar = this.f49818c;
            aVar.getClass();
            aVar.g(this);
        }

        @Override // androidx.media3.exoplayer.source.Q
        public final long getBufferedPositionUs() {
            return this.f49817b.getBufferedPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.Q
        public final long getNextLoadPositionUs() {
            return this.f49817b.getNextLoadPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final Y getTrackGroups() {
            Y y12 = this.f49819d;
            y12.getClass();
            return y12;
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final long i(long j12, g0 g0Var) {
            return this.f49817b.i(j12, g0Var);
        }

        @Override // androidx.media3.exoplayer.source.Q
        public final boolean isLoading() {
            return this.f49817b.isLoading();
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final void maybeThrowPrepareError() {
            this.f49817b.maybeThrowPrepareError();
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final long readDiscontinuity() {
            return this.f49817b.readDiscontinuity();
        }

        @Override // androidx.media3.exoplayer.source.Q
        public final void reevaluateBuffer(long j12) {
            this.f49817b.reevaluateBuffer(j12);
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final long seekToUs(long j12) {
            return this.f49817b.seekToUs(j12);
        }
    }

    @Override // androidx.media3.exoplayer.source.Z, androidx.media3.exoplayer.source.A
    public final InterfaceC23174z e(A.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j12) {
        return new a(this.f49711l.e(bVar, bVar2, j12));
    }

    @Override // androidx.media3.exoplayer.source.Z, androidx.media3.exoplayer.source.A
    public final void k(InterfaceC23174z interfaceC23174z) {
        super.k(((a) interfaceC23174z).f49817b);
    }
}
