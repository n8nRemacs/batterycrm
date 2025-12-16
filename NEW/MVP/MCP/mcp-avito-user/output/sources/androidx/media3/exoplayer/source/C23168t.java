package androidx.media3.exoplayer.source;

import android.util.Pair;
import androidx.media3.common.util.C23110a;
import androidx.media3.exoplayer.AbstractC23132a;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.S;

/* compiled from: LoopingMediaSource.java */
@androidx.media3.common.util.J
@Deprecated
/* renamed from: androidx.media3.exoplayer.source.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23168t extends Z {

    /* compiled from: LoopingMediaSource.java */
    /* renamed from: androidx.media3.exoplayer.source.t$a */
    public static final class a extends AbstractC23166q {
        @Override // androidx.media3.exoplayer.source.AbstractC23166q, androidx.media3.common.P
        public final int m(int i12, int i13, boolean z12) {
            androidx.media3.common.P p12 = this.f49820g;
            int iM2 = p12.m(i12, i13, z12);
            return iM2 == -1 ? p12.b(z12) : iM2;
        }

        @Override // androidx.media3.exoplayer.source.AbstractC23166q, androidx.media3.common.P
        public final int s(int i12, int i13, boolean z12) {
            androidx.media3.common.P p12 = this.f49820g;
            int iS2 = p12.s(i12, i13, z12);
            return iS2 == -1 ? p12.j(z12) : iS2;
        }
    }

    /* compiled from: LoopingMediaSource.java */
    /* renamed from: androidx.media3.exoplayer.source.t$b */
    public static final class b extends AbstractC23132a {

        /* renamed from: j, reason: collision with root package name */
        public final androidx.media3.common.P f49828j;

        /* renamed from: k, reason: collision with root package name */
        public final int f49829k;

        /* renamed from: l, reason: collision with root package name */
        public final int f49830l;

        public b(androidx.media3.common.P p12) {
            super(new S.b(0));
            this.f49828j = p12;
            int iP2 = p12.p();
            this.f49829k = iP2;
            this.f49830l = p12.w();
            if (iP2 > 0) {
                C23110a.f("LoopingMediaSource contains too many periods", Integer.MAX_VALUE / iP2 >= 0);
            }
        }

        @Override // androidx.media3.exoplayer.AbstractC23132a
        public final int A(int i12) {
            return i12 / this.f49830l;
        }

        @Override // androidx.media3.exoplayer.AbstractC23132a
        public final Object B(int i12) {
            return Integer.valueOf(i12);
        }

        @Override // androidx.media3.exoplayer.AbstractC23132a
        public final int C(int i12) {
            return i12 * this.f49829k;
        }

        @Override // androidx.media3.exoplayer.AbstractC23132a
        public final int D(int i12) {
            return i12 * this.f49830l;
        }

        @Override // androidx.media3.exoplayer.AbstractC23132a
        public final androidx.media3.common.P G(int i12) {
            return this.f49828j;
        }

        @Override // androidx.media3.common.P
        public final int p() {
            return 0;
        }

        @Override // androidx.media3.common.P
        public final int w() {
            return 0;
        }

        @Override // androidx.media3.exoplayer.AbstractC23132a
        public final int y(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.AbstractC23132a
        public final int z(int i12) {
            return i12 / this.f49829k;
        }
    }

    @Override // androidx.media3.exoplayer.source.Z
    @j.P
    public final A.b J(A.b bVar) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.Z, androidx.media3.exoplayer.source.A
    @j.P
    public final androidx.media3.common.P a() {
        return new b(((C23170v) this.f49711l).f49843p);
    }

    @Override // androidx.media3.exoplayer.source.Z, androidx.media3.exoplayer.source.A
    public final boolean b() {
        return false;
    }

    @Override // androidx.media3.exoplayer.source.Z, androidx.media3.exoplayer.source.A
    public final InterfaceC23174z e(A.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j12) {
        int i12 = AbstractC23132a.f48622i;
        bVar.b(((Pair) bVar.f47212a).second);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.Z, androidx.media3.exoplayer.source.A
    public final void k(InterfaceC23174z interfaceC23174z) {
        this.f49711l.k(interfaceC23174z);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23150a
    public final void w(androidx.media3.common.P p12) {
        z(new b(p12));
    }
}
