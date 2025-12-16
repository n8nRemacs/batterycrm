package com.google.android.exoplayer2.analytics;

import android.os.Looper;
import android.util.SparseArray;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.google.android.exoplayer2.C36533n;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.C36554q;
import com.google.android.exoplayer2.source.C36557u;
import com.google.android.exoplayer2.source.C36560x;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.trackselection.r;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36604u;
import com.google.android.exoplayer2.util.InterfaceC36589e;
import com.google.android.exoplayer2.util.InterfaceC36601q;
import com.google.android.exoplayer2.util.U;
import com.google.common.base.F;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.AbstractC37412t1;
import com.google.common.collect.W1;
import j.InterfaceC42153i;
import j.P;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.List;

/* compiled from: DefaultAnalyticsCollector.java */
/* loaded from: classes6.dex */
public class j implements com.google.android.exoplayer2.analytics.a {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC36589e f343773b;

    /* renamed from: c, reason: collision with root package name */
    public final s0.b f343774c;

    /* renamed from: d, reason: collision with root package name */
    public final s0.d f343775d;

    /* renamed from: e, reason: collision with root package name */
    public final a f343776e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray<b.C10568b> f343777f;

    /* renamed from: g, reason: collision with root package name */
    public C36604u<b> f343778g;

    /* renamed from: h, reason: collision with root package name */
    public d0 f343779h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC36601q f343780i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f343781j;

    /* compiled from: DefaultAnalyticsCollector.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final s0.b f343782a;

        /* renamed from: b, reason: collision with root package name */
        public AbstractC37401r1<y.b> f343783b = AbstractC37401r1.C();

        /* renamed from: c, reason: collision with root package name */
        public AbstractC37412t1<y.b, s0> f343784c = AbstractC37412t1.n();

        /* renamed from: d, reason: collision with root package name */
        @P
        public y.b f343785d;

        /* renamed from: e, reason: collision with root package name */
        public y.b f343786e;

        /* renamed from: f, reason: collision with root package name */
        public y.b f343787f;

        public a(s0.b bVar) {
            this.f343782a = bVar;
        }

        @P
        public static y.b b(d0 d0Var, AbstractC37401r1<y.b> abstractC37401r1, @P y.b bVar, s0.b bVar2) {
            s0 currentTimeline = d0Var.getCurrentTimeline();
            int currentPeriodIndex = d0Var.getCurrentPeriodIndex();
            Object objL = currentTimeline.p() ? null : currentTimeline.l(currentPeriodIndex);
            int iC2 = (d0Var.isPlayingAd() || currentTimeline.p()) ? -1 : currentTimeline.f(currentPeriodIndex, bVar2, false).c(U.H(d0Var.getCurrentPosition()) - bVar2.f345874f);
            for (int i12 = 0; i12 < abstractC37401r1.size(); i12++) {
                y.b bVar3 = abstractC37401r1.get(i12);
                if (c(bVar3, objL, d0Var.isPlayingAd(), d0Var.getCurrentAdGroupIndex(), d0Var.getCurrentAdIndexInAdGroup(), iC2)) {
                    return bVar3;
                }
            }
            if (abstractC37401r1.isEmpty() && bVar != null) {
                if (c(bVar, objL, d0Var.isPlayingAd(), d0Var.getCurrentAdGroupIndex(), d0Var.getCurrentAdIndexInAdGroup(), iC2)) {
                    return bVar;
                }
            }
            return null;
        }

        public static boolean c(y.b bVar, @P Object obj, boolean z12, int i12, int i13, int i14) {
            if (!bVar.f346696a.equals(obj)) {
                return false;
            }
            int i15 = bVar.f346697b;
            return (z12 && i15 == i12 && bVar.f346698c == i13) || (!z12 && i15 == -1 && bVar.f346700e == i14);
        }

        public final void a(AbstractC37412t1.b<y.b, s0> bVar, @P y.b bVar2, s0 s0Var) {
            if (bVar2 == null) {
                return;
            }
            if (s0Var.b(bVar2.f346696a) != -1) {
                bVar.c(bVar2, s0Var);
                return;
            }
            s0 s0Var2 = this.f343784c.get(bVar2);
            if (s0Var2 != null) {
                bVar.c(bVar2, s0Var2);
            }
        }

        public final void d(s0 s0Var) {
            AbstractC37412t1.b<y.b, s0> bVarA = AbstractC37412t1.a();
            if (this.f343783b.isEmpty()) {
                a(bVarA, this.f343786e, s0Var);
                if (!F.a(this.f343787f, this.f343786e)) {
                    a(bVarA, this.f343787f, s0Var);
                }
                if (!F.a(this.f343785d, this.f343786e) && !F.a(this.f343785d, this.f343787f)) {
                    a(bVarA, this.f343785d, s0Var);
                }
            } else {
                for (int i12 = 0; i12 < this.f343783b.size(); i12++) {
                    a(bVarA, this.f343783b.get(i12), s0Var);
                }
                if (!this.f343783b.contains(this.f343785d)) {
                    a(bVarA, this.f343785d, s0Var);
                }
            }
            this.f343784c = bVarA.b();
        }
    }

    public j(InterfaceC36589e interfaceC36589e) {
        interfaceC36589e.getClass();
        this.f343773b = interfaceC36589e;
        int i12 = U.f348106a;
        Looper looperMyLooper = Looper.myLooper();
        this.f343778g = new C36604u<>(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, interfaceC36589e, new h(7));
        s0.b bVar = new s0.b();
        this.f343774c = bVar;
        this.f343775d = new s0.d();
        this.f343776e = new a(bVar);
        this.f343777f = new SparseArray<>();
    }

    @Override // com.google.android.exoplayer2.analytics.a
    public final void E2(long j12, long j13, String str) {
        b.C10568b c10568bN = n();
        o(c10568bN, 1016, new f(c10568bN, str, j13, j12, 0));
    }

    @Override // com.google.android.exoplayer2.analytics.a
    public final void F2(int i12, long j12, long j13) {
        b.C10568b c10568bN = n();
        o(c10568bN, 1011, new androidx.media3.exoplayer.analytics.j(c10568bN, i12, j12, j13, 1));
    }

    @Override // com.google.android.exoplayer2.analytics.a
    public final void I2(String str) {
        b.C10568b c10568bN = n();
        o(c10568bN, 1019, new f(c10568bN, str, 3));
    }

    @Override // com.google.android.exoplayer2.analytics.a
    @InterfaceC42153i
    public final void Ih(d0 d0Var, Looper looper) {
        C36585a.d(this.f343779h == null || this.f343776e.f343783b.isEmpty());
        d0Var.getClass();
        this.f343779h = d0Var;
        this.f343780i = this.f343773b.b(looper, null);
        C36604u<b> c36604u = this.f343778g;
        this.f343778g = new C36604u<>(c36604u.f348156d, looper, c36604u.f348153a, new com.avito.android.gig_shift_action.ui.a(17, this, d0Var));
    }

    @Override // com.google.android.exoplayer2.analytics.a
    public final void L2(String str) {
        b.C10568b c10568bN = n();
        o(c10568bN, 1012, new f(c10568bN, str, 1));
    }

    @Override // com.google.android.exoplayer2.analytics.a
    public final void M7(I i12, @P com.google.android.exoplayer2.decoder.h hVar) {
        b.C10568b c10568bN = n();
        o(c10568bN, 1009, new d(c10568bN, i12, hVar, 1));
    }

    @Override // com.google.android.exoplayer2.analytics.a
    public final void R2(int i12, long j12) {
        b.C10568b c10568bH = h(this.f343776e.f343786e);
        o(c10568bH, 1021, new h(i12, j12, c10568bH));
    }

    @Override // com.google.android.exoplayer2.analytics.a
    @InterfaceC42153i
    public final void Vw(b bVar) {
        this.f343778g.e(bVar);
    }

    @Override // com.google.android.exoplayer2.analytics.a
    @InterfaceC42153i
    public final void XL(b bVar) {
        bVar.getClass();
        this.f343778g.a(bVar);
    }

    @Override // com.google.android.exoplayer2.analytics.a
    public final void Yc(I i12, @P com.google.android.exoplayer2.decoder.h hVar) {
        b.C10568b c10568bN = n();
        o(c10568bN, 1017, new d(c10568bN, i12, hVar, 0));
    }

    @Override // com.google.android.exoplayer2.analytics.a
    public final void Yd(com.google.android.exoplayer2.decoder.f fVar) {
        b.C10568b c10568bN = n();
        o(c10568bN, 1015, new e(c10568bN, fVar, 0));
    }

    public final b.C10568b a() {
        return h(this.f343776e.f343785d);
    }

    @Override // com.google.android.exoplayer2.analytics.a
    public final void a2(long j12, Object obj) {
        b.C10568b c10568bN = n();
        o(c10568bN, 26, new com.avito.android.gig_shift_action.ui.a(c10568bN, obj, j12));
    }

    @v61.m
    public final b.C10568b b(s0 s0Var, int i12, @P y.b bVar) {
        y.b bVar2 = s0Var.p() ? null : bVar;
        long jA2 = this.f343773b.a();
        boolean z12 = s0Var.equals(this.f343779h.getCurrentTimeline()) && i12 == this.f343779h.getCurrentMediaItemIndex();
        long jR2 = 0;
        if (bVar2 == null || !bVar2.a()) {
            if (z12) {
                jR2 = this.f343779h.getContentPosition();
            } else if (!s0Var.p()) {
                jR2 = U.R(s0Var.m(i12, this.f343775d, 0L).f345892n);
            }
        } else if (z12 && this.f343779h.getCurrentAdGroupIndex() == bVar2.f346697b && this.f343779h.getCurrentAdIndexInAdGroup() == bVar2.f346698c) {
            jR2 = this.f343779h.getCurrentPosition();
        }
        return new b.C10568b(jA2, s0Var, i12, bVar2, jR2, this.f343779h.getCurrentTimeline(), this.f343779h.getCurrentMediaItemIndex(), this.f343776e.f343785d, this.f343779h.getCurrentPosition(), this.f343779h.getTotalBufferedDuration());
    }

    @Override // com.google.android.exoplayer2.analytics.a
    public final void b1(Exception exc) {
        b.C10568b c10568bN = n();
        o(c10568bN, 1014, new C31685o(c10568bN, exc));
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36574d.a
    public final void c(int i12, long j12, long j13) {
        a aVar = this.f343776e;
        b.C10568b c10568bH = h(aVar.f343783b.isEmpty() ? null : (y.b) W1.d(aVar.f343783b));
        o(c10568bH, ErrorCodes.SSL_HANDSHAKE_EXCEPTION, new androidx.media3.exoplayer.analytics.f(c10568bH, i12, j12, j13, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.analytics.a
    public final void cD(List<y.b> list, @P y.b bVar) {
        d0 d0Var = this.f343779h;
        d0Var.getClass();
        a aVar = this.f343776e;
        aVar.getClass();
        aVar.f343783b = AbstractC37401r1.v(list);
        if (!((AbstractCollection) list).isEmpty()) {
            aVar.f343786e = (y.b) list.get(0);
            bVar.getClass();
            aVar.f343787f = bVar;
        }
        if (aVar.f343785d == null) {
            aVar.f343785d = a.b(d0Var, aVar.f343783b, aVar.f343786e, aVar.f343782a);
        }
        aVar.d(d0Var.getCurrentTimeline());
    }

    @Override // com.google.android.exoplayer2.source.A
    public final void d(int i12, @P y.b bVar, C36557u c36557u) {
        b.C10568b c10568bJ = j(i12, bVar);
        o(c10568bJ, 1005, new c(c10568bJ, c36557u, 1));
    }

    @Override // com.google.android.exoplayer2.analytics.a
    public final void d2(long j12, long j13, String str) {
        b.C10568b c10568bN = n();
        o(c10568bN, 1008, new f(c10568bN, str, j13, j12, 2));
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void e(int i12, @P y.b bVar, int i13) {
        b.C10568b c10568bJ = j(i12, bVar);
        o(c10568bJ, 1022, new g(c10568bJ, i13, 1));
    }

    @Override // com.google.android.exoplayer2.source.A
    public final void f(int i12, @P y.b bVar, C36554q c36554q, C36557u c36557u, IOException iOException, boolean z12) {
        b.C10568b c10568bJ = j(i12, bVar);
        o(c10568bJ, ErrorCodes.MALFORMED_URL_EXCEPTION, new FX0.b(c10568bJ, c36554q, c36557u, iOException, z12, 16));
    }

    @Override // com.google.android.exoplayer2.analytics.a
    public final void f3(long j12) {
        b.C10568b c10568bN = n();
        o(c10568bN, 1010, new C31685o(c10568bN, j12));
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void g(int i12, @P y.b bVar) {
        b.C10568b c10568bJ = j(i12, bVar);
        o(c10568bJ, 1025, new e(c10568bJ, 7, (byte) 0));
    }

    @Override // com.google.android.exoplayer2.analytics.a
    public final void g2(int i12, long j12) {
        b.C10568b c10568bH = h(this.f343776e.f343786e);
        o(c10568bH, 1018, new g(i12, j12, c10568bH));
    }

    @Override // com.google.android.exoplayer2.analytics.a
    public final void g3(Exception exc) {
        b.C10568b c10568bN = n();
        o(c10568bN, 1030, new h(c10568bN, exc, 14));
    }

    @Override // com.google.android.exoplayer2.analytics.a
    public final void g9(com.google.android.exoplayer2.decoder.f fVar) {
        b.C10568b c10568bH = h(this.f343776e.f343786e);
        o(c10568bH, 1020, new com.avito.android.gig_shift_action.ui.a(22, c10568bH, fVar));
    }

    public final b.C10568b h(@P y.b bVar) {
        this.f343779h.getClass();
        s0 s0Var = bVar == null ? null : this.f343776e.f343784c.get(bVar);
        if (bVar != null && s0Var != null) {
            return b(s0Var, s0Var.g(bVar.f346696a, this.f343774c).f345872d, bVar);
        }
        int currentMediaItemIndex = this.f343779h.getCurrentMediaItemIndex();
        s0 currentTimeline = this.f343779h.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.o()) {
            currentTimeline = s0.f345869b;
        }
        return b(currentTimeline, currentMediaItemIndex, null);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void i(int i12, @P y.b bVar, Exception exc) {
        b.C10568b c10568bJ = j(i12, bVar);
        o(c10568bJ, 1024, new com.avito.android.gig_shift_action.ui.a(18, c10568bJ, exc));
    }

    public final b.C10568b j(int i12, @P y.b bVar) {
        this.f343779h.getClass();
        if (bVar != null) {
            return this.f343776e.f343784c.get(bVar) != null ? h(bVar) : b(s0.f345869b, i12, bVar);
        }
        s0 currentTimeline = this.f343779h.getCurrentTimeline();
        if (i12 >= currentTimeline.o()) {
            currentTimeline = s0.f345869b;
        }
        return b(currentTimeline, i12, null);
    }

    @Override // com.google.android.exoplayer2.source.A
    public final void k(int i12, @P y.b bVar, C36554q c36554q, C36557u c36557u) {
        b.C10568b c10568bJ = j(i12, bVar);
        o(c10568bJ, 1001, new C31685o(c10568bJ, c36554q, c36557u));
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void l(int i12, @P y.b bVar) {
        b.C10568b c10568bJ = j(i12, bVar);
        o(c10568bJ, 1027, new e(c10568bJ, 2, (byte) 0));
    }

    @Override // com.google.android.exoplayer2.analytics.a
    public final void l2(Exception exc) {
        b.C10568b c10568bN = n();
        o(c10568bN, 1029, new h(c10568bN, exc, 15));
    }

    @Override // com.google.android.exoplayer2.source.A
    public final void m(int i12, @P y.b bVar, C36554q c36554q, C36557u c36557u) {
        b.C10568b c10568bJ = j(i12, bVar);
        o(c10568bJ, 1002, new h(c10568bJ, c36554q, c36557u, 12));
    }

    @Override // com.google.android.exoplayer2.analytics.a
    public final void md(com.google.android.exoplayer2.decoder.f fVar) {
        b.C10568b c10568bH = h(this.f343776e.f343786e);
        o(c10568bH, 1013, new e(c10568bH, fVar, 1));
    }

    public final b.C10568b n() {
        return h(this.f343776e.f343787f);
    }

    public final void o(b.C10568b c10568b, int i12, C36604u.a<b> aVar) {
        this.f343777f.put(i12, c10568b);
        this.f343778g.f(i12, aVar);
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onAvailableCommandsChanged(d0.c cVar) {
        b.C10568b c10568bA = a();
        o(c10568bA, 13, new h(c10568bA, cVar, 6));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onCues(List<com.google.android.exoplayer2.text.a> list) {
        b.C10568b c10568bA = a();
        o(c10568bA, 27, new androidx.media3.exoplayer.analytics.l(c10568bA, list, 1));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onDeviceInfoChanged(C36533n c36533n) {
        b.C10568b c10568bA = a();
        o(c10568bA, 29, new h(c10568bA, c36533n, 11));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onDeviceVolumeChanged(int i12, boolean z12) {
        b.C10568b c10568bA = a();
        o(c10568bA, 30, new h(c10568bA, i12, z12));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onIsLoadingChanged(boolean z12) {
        b.C10568b c10568bA = a();
        o(c10568bA, 3, new i(c10568bA, z12, 0));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onIsPlayingChanged(boolean z12) {
        b.C10568b c10568bA = a();
        o(c10568bA, 7, new i(c10568bA, z12, 1));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onMediaItemTransition(@P O o12, int i12) {
        b.C10568b c10568bA = a();
        o(c10568bA, 1, new e(c10568bA, o12, i12));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onMediaMetadataChanged(com.google.android.exoplayer2.P p12) {
        b.C10568b c10568bA = a();
        o(c10568bA, 14, new h(c10568bA, p12, 1));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onMetadata(Metadata metadata) {
        b.C10568b c10568bA = a();
        o(c10568bA, 28, new com.avito.android.gig_shift_action.ui.a(25, c10568bA, metadata));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPlayWhenReadyChanged(boolean z12, int i12) {
        b.C10568b c10568bA = a();
        o(c10568bA, 5, new androidx.media3.exoplayer.analytics.k(c10568bA, z12, i12, 1));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPlaybackParametersChanged(c0 c0Var) {
        b.C10568b c10568bA = a();
        o(c10568bA, 12, new com.avito.android.gig_shift_action.ui.a(21, c10568bA, c0Var));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPlaybackStateChanged(int i12) {
        b.C10568b c10568bA = a();
        o(c10568bA, 4, new g(c10568bA, i12, 2));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPlaybackSuppressionReasonChanged(int i12) {
        b.C10568b c10568bA = a();
        o(c10568bA, 6, new g(c10568bA, i12, 4));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPlayerError(PlaybackException playbackException) {
        C36560x c36560x;
        b.C10568b c10568bA = (!(playbackException instanceof ExoPlaybackException) || (c36560x = ((ExoPlaybackException) playbackException).f343389i) == null) ? a() : h(new y.b(c36560x));
        o(c10568bA, 10, new com.avito.android.gig_shift_action.ui.a(23, c10568bA, playbackException));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPlayerErrorChanged(@P PlaybackException playbackException) {
        C36560x c36560x;
        b.C10568b c10568bA = (!(playbackException instanceof ExoPlaybackException) || (c36560x = ((ExoPlaybackException) playbackException).f343389i) == null) ? a() : h(new y.b(c36560x));
        o(c10568bA, 10, new h(c10568bA, playbackException, 10));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPlayerStateChanged(boolean z12, int i12) {
        b.C10568b c10568bA = a();
        o(c10568bA, -1, new h(c10568bA, z12, i12));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPositionDiscontinuity(int i12) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onRepeatModeChanged(int i12) {
        b.C10568b c10568bA = a();
        o(c10568bA, 8, new g(c10568bA, i12, 3));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onSeekProcessed() {
        b.C10568b c10568bA = a();
        o(c10568bA, -1, new h(c10568bA, 3));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onShuffleModeEnabledChanged(boolean z12) {
        b.C10568b c10568bA = a();
        o(c10568bA, 9, new i(c10568bA, z12, 2));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onSkipSilenceEnabledChanged(boolean z12) {
        b.C10568b c10568bN = n();
        o(c10568bN, 23, new i(c10568bN, z12, 3));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onSurfaceSizeChanged(int i12, int i13) {
        b.C10568b c10568bN = n();
        o(c10568bN, 24, new androidx.media3.exoplayer.analytics.o(c10568bN, i12, i13, 1));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onTimelineChanged(s0 s0Var, int i12) {
        d0 d0Var = this.f343779h;
        d0Var.getClass();
        a aVar = this.f343776e;
        aVar.f343785d = a.b(d0Var, aVar.f343783b, aVar.f343786e, aVar.f343782a);
        aVar.d(d0Var.getCurrentTimeline());
        b.C10568b c10568bA = a();
        o(c10568bA, 0, new e(c10568bA, i12));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onTrackSelectionParametersChanged(r rVar) {
        b.C10568b c10568bA = a();
        o(c10568bA, 19, new h(c10568bA, rVar, 8));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onTracksChanged(t0 t0Var) {
        b.C10568b c10568bA = a();
        o(c10568bA, 2, new com.avito.android.gig_shift_action.ui.a(24, c10568bA, t0Var));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onVideoSizeChanged(com.google.android.exoplayer2.video.o oVar) {
        b.C10568b c10568bN = n();
        o(c10568bN, 25, new com.avito.android.gig_shift_action.ui.a(19, c10568bN, oVar));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onVolumeChanged(float f12) {
        b.C10568b c10568bN = n();
        o(c10568bN, 22, new androidx.media3.exoplayer.analytics.i(f12, 1, c10568bN));
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void p(int i12, @P y.b bVar) {
        b.C10568b c10568bJ = j(i12, bVar);
        o(c10568bJ, 1023, new e(c10568bJ, 5, (byte) 0));
    }

    @Override // com.google.android.exoplayer2.source.A
    public final void q(int i12, @P y.b bVar, C36557u c36557u) {
        b.C10568b c10568bJ = j(i12, bVar);
        o(c10568bJ, ErrorCodes.PROTOCOL_EXCEPTION, new c(c10568bJ, c36557u, 0));
    }

    @Override // com.google.android.exoplayer2.source.A
    public final void r(int i12, @P y.b bVar, C36554q c36554q, C36557u c36557u) {
        b.C10568b c10568bJ = j(i12, bVar);
        o(c10568bJ, 1000, new h(c10568bJ, c36554q, c36557u, 9));
    }

    @Override // com.google.android.exoplayer2.analytics.a
    @InterfaceC42153i
    public final void release() {
        InterfaceC36601q interfaceC36601q = this.f343780i;
        C36585a.e(interfaceC36601q);
        interfaceC36601q.d(new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(this, 10));
    }

    @Override // com.google.android.exoplayer2.analytics.a
    public final void u8(com.google.android.exoplayer2.decoder.f fVar) {
        b.C10568b c10568bN = n();
        o(c10568bN, ErrorCodes.IO_EXCEPTION, new e(c10568bN, fVar, 3));
    }

    @Override // com.google.android.exoplayer2.analytics.a
    public final void yc() {
        if (this.f343781j) {
            return;
        }
        b.C10568b c10568bA = a();
        this.f343781j = true;
        o(c10568bA, -1, new C31685o(c10568bA));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPositionDiscontinuity(d0.k kVar, d0.k kVar2, int i12) {
        if (i12 == 1) {
            this.f343781j = false;
        }
        d0 d0Var = this.f343779h;
        d0Var.getClass();
        a aVar = this.f343776e;
        aVar.f343785d = a.b(d0Var, aVar.f343783b, aVar.f343786e, aVar.f343782a);
        b.C10568b c10568bA = a();
        o(c10568bA, 11, new androidx.media3.exoplayer.analytics.n(i12, c10568bA, 1, kVar, kVar2));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onCues(com.google.android.exoplayer2.text.d dVar) {
        b.C10568b c10568bA = a();
        o(c10568bA, 27, new h(c10568bA, dVar, 5));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onRenderedFirstFrame() {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onLoadingChanged(boolean z12) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onEvents(d0 d0Var, d0.f fVar) {
    }
}
