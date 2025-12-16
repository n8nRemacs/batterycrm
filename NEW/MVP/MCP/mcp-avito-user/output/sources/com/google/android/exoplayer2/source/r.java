package com.google.android.exoplayer2.source;

import android.util.Pair;
import com.google.android.exoplayer2.AbstractC36502a;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.O;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.InterfaceC36572b;

/* compiled from: LoopingMediaSource.java */
@Deprecated
/* loaded from: classes6.dex */
public final class r extends AbstractC36542e<Void> {

    /* compiled from: LoopingMediaSource.java */
    public static final class a extends AbstractC36552o {
        @Override // com.google.android.exoplayer2.source.AbstractC36552o, com.google.android.exoplayer2.s0
        public final int e(int i12, int i13, boolean z12) {
            s0 s0Var = this.f346655c;
            int iE2 = s0Var.e(i12, i13, z12);
            return iE2 == -1 ? s0Var.a(z12) : iE2;
        }

        @Override // com.google.android.exoplayer2.source.AbstractC36552o, com.google.android.exoplayer2.s0
        public final int k(int i12, int i13, boolean z12) {
            s0 s0Var = this.f346655c;
            int iK2 = s0Var.k(i12, i13, z12);
            return iK2 == -1 ? s0Var.c(z12) : iK2;
        }
    }

    /* compiled from: LoopingMediaSource.java */
    public static final class b extends AbstractC36502a {

        /* renamed from: f, reason: collision with root package name */
        public final s0 f346663f;

        /* renamed from: g, reason: collision with root package name */
        public final int f346664g;

        /* renamed from: h, reason: collision with root package name */
        public final int f346665h;

        public b(s0 s0Var) {
            super(new O.b(0));
            this.f346663f = s0Var;
            int iH2 = s0Var.h();
            this.f346664g = iH2;
            this.f346665h = s0Var.o();
            if (iH2 > 0) {
                if (!(Integer.MAX_VALUE / iH2 >= 0)) {
                    throw new IllegalStateException("LoopingMediaSource contains too many periods");
                }
            }
        }

        @Override // com.google.android.exoplayer2.s0
        public final int h() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.s0
        public final int o() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.AbstractC36502a
        public final int q(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.AbstractC36502a
        public final int r(int i12) {
            return i12 / this.f346664g;
        }

        @Override // com.google.android.exoplayer2.AbstractC36502a
        public final int s(int i12) {
            return i12 / this.f346665h;
        }

        @Override // com.google.android.exoplayer2.AbstractC36502a
        public final Object t(int i12) {
            return Integer.valueOf(i12);
        }

        @Override // com.google.android.exoplayer2.AbstractC36502a
        public final int u(int i12) {
            return i12 * this.f346664g;
        }

        @Override // com.google.android.exoplayer2.AbstractC36502a
        public final int v(int i12) {
            return i12 * this.f346665h;
        }

        @Override // com.google.android.exoplayer2.AbstractC36502a
        public final s0 y(int i12) {
            return this.f346663f;
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e, com.google.android.exoplayer2.source.AbstractC36538a
    public final void B(@j.P com.google.android.exoplayer2.upstream.M m12) {
        super.B(m12);
        H(null, null);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e
    @j.P
    public final y.b E(Void r12, y.b bVar) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e
    public final void G(Object obj, AbstractC36538a abstractC36538a, s0 s0Var) {
        C(new b(s0Var));
    }

    @Override // com.google.android.exoplayer2.source.y
    @j.P
    public final s0 a() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.y
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.exoplayer2.source.y
    public final InterfaceC36559w c(y.b bVar, InterfaceC36572b interfaceC36572b, long j12) {
        int i12 = AbstractC36502a.f343739e;
        bVar.b(((Pair) bVar.f346696a).second);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.y
    public final com.google.android.exoplayer2.O getMediaItem() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void t(InterfaceC36559w interfaceC36559w) {
        throw null;
    }
}
