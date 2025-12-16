package com.yandex.mobile.ads.impl;

import android.os.Looper;
import android.util.SparseArray;
import com.adjust.sdk.network.ErrorCodes;
import com.yandex.mobile.ads.embedded.guava.collect.q;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.gt0;
import com.yandex.mobile.ads.impl.i91;
import com.yandex.mobile.ads.impl.jd0;
import com.yandex.mobile.ads.impl.k9;
import com.yandex.mobile.ads.impl.m90;
import j.InterfaceC42153i;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes8.dex */
public final class fo implements j9 {

    /* renamed from: a, reason: collision with root package name */
    private final hj f385429a;

    /* renamed from: b, reason: collision with root package name */
    private final i91.b f385430b;

    /* renamed from: c, reason: collision with root package name */
    private final i91.d f385431c;

    /* renamed from: d, reason: collision with root package name */
    private final a f385432d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseArray<k9.a> f385433e;

    /* renamed from: f, reason: collision with root package name */
    private m90<k9> f385434f;

    /* renamed from: g, reason: collision with root package name */
    private gt0 f385435g;

    /* renamed from: h, reason: collision with root package name */
    private bz f385436h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final i91.b f385437a;

        /* renamed from: b, reason: collision with root package name */
        private com.yandex.mobile.ads.embedded.guava.collect.p<jd0.b> f385438b = com.yandex.mobile.ads.embedded.guava.collect.p.i();

        /* renamed from: c, reason: collision with root package name */
        private com.yandex.mobile.ads.embedded.guava.collect.q<jd0.b, i91> f385439c = com.yandex.mobile.ads.embedded.guava.collect.q.h();

        /* renamed from: d, reason: collision with root package name */
        @j.P
        private jd0.b f385440d;

        /* renamed from: e, reason: collision with root package name */
        private jd0.b f385441e;

        /* renamed from: f, reason: collision with root package name */
        private jd0.b f385442f;

        public a(i91.b bVar) {
            this.f385437a = bVar;
        }

        @j.P
        public final jd0.b b() {
            jd0.b next;
            jd0.b bVar;
            if (this.f385438b.isEmpty()) {
                return null;
            }
            com.yandex.mobile.ads.embedded.guava.collect.p<jd0.b> pVar = this.f385438b;
            if (pVar == null) {
                Iterator<jd0.b> it = pVar.iterator();
                do {
                    next = it.next();
                } while (it.hasNext());
                bVar = next;
            } else {
                if (pVar.isEmpty()) {
                    throw new NoSuchElementException();
                }
                bVar = pVar.get(pVar.size() - 1);
            }
            return bVar;
        }

        @j.P
        public final jd0.b c() {
            return this.f385441e;
        }

        @j.P
        public final jd0.b d() {
            return this.f385442f;
        }

        @j.P
        public final jd0.b a() {
            return this.f385440d;
        }

        @j.P
        public final i91 a(jd0.b bVar) {
            return this.f385439c.get(bVar);
        }

        public final void a(gt0 gt0Var) {
            this.f385440d = a(gt0Var, this.f385438b, this.f385441e, this.f385437a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(List<jd0.b> list, @j.P jd0.b bVar, gt0 gt0Var) {
            this.f385438b = com.yandex.mobile.ads.embedded.guava.collect.p.a((Collection) list);
            if (!((AbstractCollection) list).isEmpty()) {
                this.f385441e = (jd0.b) list.get(0);
                bVar.getClass();
                this.f385442f = bVar;
            }
            if (this.f385440d == null) {
                this.f385440d = a(gt0Var, this.f385438b, this.f385441e, this.f385437a);
            }
            a(gt0Var.getCurrentTimeline());
        }

        public final void b(gt0 gt0Var) {
            this.f385440d = a(gt0Var, this.f385438b, this.f385441e, this.f385437a);
            a(gt0Var.getCurrentTimeline());
        }

        private void a(i91 i91Var) {
            q.a<jd0.b, i91> aVarA = com.yandex.mobile.ads.embedded.guava.collect.q.a();
            if (this.f385438b.isEmpty()) {
                a(aVarA, this.f385441e, i91Var);
                if (!vp0.a(this.f385442f, this.f385441e)) {
                    a(aVarA, this.f385442f, i91Var);
                }
                if (!vp0.a(this.f385440d, this.f385441e) && !vp0.a(this.f385440d, this.f385442f)) {
                    a(aVarA, this.f385440d, i91Var);
                }
            } else {
                for (int i12 = 0; i12 < this.f385438b.size(); i12++) {
                    a(aVarA, this.f385438b.get(i12), i91Var);
                }
                if (!this.f385438b.contains(this.f385440d)) {
                    a(aVarA, this.f385440d, i91Var);
                }
            }
            this.f385439c = aVarA.a();
        }

        private void a(q.a<jd0.b, i91> aVar, @j.P jd0.b bVar, i91 i91Var) {
            if (bVar == null) {
                return;
            }
            if (i91Var.a(bVar.f385280a) != -1) {
                aVar.a(bVar, i91Var);
                return;
            }
            i91 i91Var2 = this.f385439c.get(bVar);
            if (i91Var2 != null) {
                aVar.a(bVar, i91Var2);
            }
        }

        @j.P
        private static jd0.b a(gt0 gt0Var, com.yandex.mobile.ads.embedded.guava.collect.p<jd0.b> pVar, @j.P jd0.b bVar, i91.b bVar2) {
            i91 currentTimeline = gt0Var.getCurrentTimeline();
            int currentPeriodIndex = gt0Var.getCurrentPeriodIndex();
            Object objA = currentTimeline.c() ? null : currentTimeline.a(currentPeriodIndex);
            int iA2 = (gt0Var.isPlayingAd() || currentTimeline.c()) ? -1 : currentTimeline.a(currentPeriodIndex, bVar2, false).a(pc1.a(gt0Var.getCurrentPosition()) - bVar2.f386393e);
            for (int i12 = 0; i12 < pVar.size(); i12++) {
                jd0.b bVar3 = pVar.get(i12);
                boolean zIsPlayingAd = gt0Var.isPlayingAd();
                int currentAdGroupIndex = gt0Var.getCurrentAdGroupIndex();
                int currentAdIndexInAdGroup = gt0Var.getCurrentAdIndexInAdGroup();
                if (bVar3.f385280a.equals(objA) && ((zIsPlayingAd && bVar3.f385281b == currentAdGroupIndex && bVar3.f385282c == currentAdIndexInAdGroup) || (!zIsPlayingAd && bVar3.f385281b == -1 && bVar3.f385284e == iA2))) {
                    return bVar3;
                }
            }
            if (pVar.isEmpty() && bVar != null) {
                boolean zIsPlayingAd2 = gt0Var.isPlayingAd();
                int currentAdGroupIndex2 = gt0Var.getCurrentAdGroupIndex();
                int currentAdIndexInAdGroup2 = gt0Var.getCurrentAdIndexInAdGroup();
                if (bVar.f385280a.equals(objA) && ((zIsPlayingAd2 && bVar.f385281b == currentAdGroupIndex2 && bVar.f385282c == currentAdIndexInAdGroup2) || (!zIsPlayingAd2 && bVar.f385281b == -1 && bVar.f385284e == iA2))) {
                    return bVar;
                }
            }
            return null;
        }
    }

    public fo(hj hjVar) {
        this.f385429a = (hj) db.a(hjVar);
        this.f385434f = new m90<>(pc1.c(), hjVar, new L0(13));
        i91.b bVar = new i91.b();
        this.f385430b = bVar;
        this.f385431c = new i91.d();
        this.f385432d = new a(bVar);
        this.f385433e = new SparseArray<>();
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void c() {
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void onCues(List<vm> list) {
        k9.a aVarD = d();
        a(aVarD, 27, new O(0, aVarD, list));
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void onIsLoadingChanged(boolean z12) {
        k9.a aVarD = d();
        a(aVarD, 3, new A0(2, aVarD, z12));
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void onIsPlayingChanged(boolean z12) {
        k9.a aVarD = d();
        a(aVarD, 7, new A0(0, aVarD, z12));
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void onPlayWhenReadyChanged(boolean z12, int i12) {
        k9.a aVarD = d();
        a(aVarD, 5, new X(aVarD, z12, i12, 2));
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void onPlaybackStateChanged(int i12) {
        k9.a aVarD = d();
        a(aVarD, 4, new S(aVarD, i12, 1));
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void onPlaybackSuppressionReasonChanged(int i12) {
        k9.a aVarD = d();
        a(aVarD, 6, new S(aVarD, i12, 0));
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void onPlayerStateChanged(boolean z12, int i12) {
        k9.a aVarD = d();
        a(aVarD, -1, new X(aVarD, z12, i12, 0));
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void onSkipSilenceEnabledChanged(boolean z12) {
        k9.a aVarE = e();
        a(aVarE, 23, new A0(1, aVarE, z12));
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void onSurfaceSizeChanged(int i12, int i13) {
        k9.a aVarE = e();
        a(aVarE, 24, new androidx.media3.exoplayer.analytics.o(aVarE, i12, i13, 2));
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void onVolumeChanged(float f12) {
        k9.a aVarE = e();
        a(aVarE, 22, new androidx.media3.exoplayer.analytics.i(f12, 2, aVarE));
    }

    @Override // com.yandex.mobile.ads.impl.j9
    @InterfaceC42153i
    public final void release() {
        ((bz) db.b(this.f385436h)).a(new J(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(k9 k9Var, nw nwVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(k9.a aVar, tn tnVar, k9 k9Var) {
        ((bd0) k9Var).a(tnVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        k9.a aVarD = d();
        a(aVarD, 1028, new M(aVarD, 2));
        this.f385434f.b();
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.j9
    public final void d(tn tnVar) {
        k9.a aVarE = e();
        a(aVarE, 1015, new B0(aVarE, tnVar, 2));
    }

    private k9.a e() {
        return a(this.f385432d.d());
    }

    @Override // com.yandex.mobile.ads.impl.j9
    @InterfaceC42153i
    public final void a(bd0 bd0Var) {
        this.f385434f.a((m90<k9>) bd0Var);
    }

    @Override // com.yandex.mobile.ads.impl.j9
    public final void b(tn tnVar) {
        k9.a aVarE = e();
        a(aVarE, ErrorCodes.IO_EXCEPTION, new B0(aVarE, tnVar, 1));
    }

    @Override // com.yandex.mobile.ads.impl.j9
    public final void c(Exception exc) {
        k9.a aVarE = e();
        a(aVarE, 1030, new V(aVarE, exc, 1));
    }

    private k9.a e(int i12, @j.P jd0.b bVar) {
        this.f385435g.getClass();
        if (bVar != null) {
            if (this.f385432d.a(bVar) != null) {
                return a(bVar);
            }
            return a(i91.f386387a, i12, bVar);
        }
        i91 currentTimeline = this.f385435g.getCurrentTimeline();
        if (i12 >= currentTimeline.b()) {
            currentTimeline = i91.f386387a;
        }
        return a(currentTimeline, i12, (jd0.b) null);
    }

    @Override // com.yandex.mobile.ads.impl.j9
    @InterfaceC42153i
    public final void a(gt0 gt0Var, Looper looper) {
        db.b(this.f385435g == null || this.f385432d.f385438b.isEmpty());
        this.f385435g = gt0Var;
        this.f385436h = this.f385429a.a(looper, null);
        this.f385434f = this.f385434f.a(looper, new O(1, this, gt0Var));
    }

    @Override // com.yandex.mobile.ads.impl.kd0
    public final void c(int i12, @j.P jd0.b bVar, q90 q90Var, zc0 zc0Var) {
        k9.a aVarE = e(i12, bVar);
        a(aVarE, 1000, new P(aVarE, q90Var, zc0Var, 0));
    }

    @Override // com.yandex.mobile.ads.impl.j9
    public final void b(String str, long j12, long j13) {
        k9.a aVarE = e();
        a(aVarE, 1008, new W(aVarE, str, j13, j12, 0));
    }

    @Override // com.yandex.mobile.ads.exo.drm.f
    public final void d(int i12, @j.P jd0.b bVar) {
        k9.a aVarE = e(i12, bVar);
        a(aVarE, 1026, new M(aVarE, 1));
    }

    @Override // com.yandex.mobile.ads.impl.j9
    public final void b(String str) {
        k9.a aVarE = e();
        a(aVarE, 1012, new C0(aVarE, str, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(gt0 gt0Var, k9 k9Var, nw nwVar) {
        ((bd0) k9Var).a(gt0Var, new k9.b(nwVar, this.f385433e));
    }

    @Override // com.yandex.mobile.ads.impl.j9
    public final void a(List<jd0.b> list, @j.P jd0.b bVar) {
        a aVar = this.f385432d;
        gt0 gt0Var = this.f385435g;
        gt0Var.getClass();
        aVar.a(list, bVar, gt0Var);
    }

    @Override // com.yandex.mobile.ads.exo.drm.f
    public final void c(int i12, @j.P jd0.b bVar) {
        k9.a aVarE = e(i12, bVar);
        a(aVarE, 1023, new M(aVarE, 3));
    }

    public final k9.a d() {
        return a(this.f385432d.a());
    }

    @Override // com.yandex.mobile.ads.impl.j9
    public final void b(Exception exc) {
        k9.a aVarE = e();
        a(aVarE, 1029, new V(aVarE, exc, 0));
    }

    @Override // com.yandex.mobile.ads.impl.j9
    public final void a(vw vwVar, @j.P xn xnVar) {
        k9.a aVarE = e();
        a(aVarE, 1009, new Y(aVarE, vwVar, xnVar, 0));
    }

    @Override // com.yandex.mobile.ads.impl.j9
    public final void b(vw vwVar, @j.P xn xnVar) {
        k9.a aVarE = e();
        a(aVarE, 1017, new Y(aVarE, vwVar, xnVar, 1));
    }

    @Override // com.yandex.mobile.ads.impl.j9
    public final void c(tn tnVar) {
        k9.a aVarA = a(this.f385432d.c());
        a(aVarA, 1020, new B0(aVarA, tnVar, 3));
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void onRenderedFirstFrame() {
    }

    @Override // com.yandex.mobile.ads.impl.j9
    public final void a(final long j12) {
        final k9.a aVarE = e();
        a(aVarE, 1010, new m90.a() { // from class: com.yandex.mobile.ads.impl.Z
            @Override // com.yandex.mobile.ads.impl.m90.a
            public final void invoke(Object obj) {
                k9.a aVar = aVarE;
                long j13 = j12;
                ((k9) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.kd0
    public final void b(int i12, @j.P jd0.b bVar, q90 q90Var, zc0 zc0Var) {
        k9.a aVarE = e(i12, bVar);
        a(aVarE, 1001, new P(aVarE, q90Var, zc0Var, 2));
    }

    @Override // com.yandex.mobile.ads.impl.j9
    public final void a(int i12, long j12, long j13) {
        k9.a aVarE = e();
        a(aVarE, 1011, new Q(aVarE, i12, j12, j13, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(k9.a aVar, int i12, long j12, long j13, k9 k9Var) {
        ((bd0) k9Var).a(aVar, i12, j12);
    }

    @Override // com.yandex.mobile.ads.impl.j9
    public final void a(Exception exc) {
        k9.a aVarE = e();
        a(aVarE, 1014, new V(aVarE, exc, 2));
    }

    @Override // com.yandex.mobile.ads.exo.drm.f
    public final void b(int i12, @j.P jd0.b bVar) {
        k9.a aVarE = e(i12, bVar);
        a(aVarE, 1027, new M(aVarE, 4));
    }

    @Override // com.yandex.mobile.ads.impl.j9
    public final void a(String str, long j12, long j13) {
        k9.a aVarE = e();
        a(aVarE, 1016, new W(aVarE, str, j13, j12, 1));
    }

    @Override // com.yandex.mobile.ads.impl.j9
    public final void b(int i12, long j12) {
        k9.a aVarA = a(this.f385432d.c());
        a(aVarA, 1018, new N(aVarA, i12, j12));
    }

    @Override // com.yandex.mobile.ads.impl.pd.a
    public final void b(int i12, long j12, long j13) {
        k9.a aVarA = a(this.f385432d.b());
        a(aVarA, ErrorCodes.SSL_HANDSHAKE_EXCEPTION, new Q(aVarA, i12, j12, j13, 0));
    }

    @Override // com.yandex.mobile.ads.impl.j9
    public final void a(String str) {
        k9.a aVarE = e();
        a(aVarE, 1019, new C0(aVarE, str, 0));
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void b(lt ltVar) {
        k9.a aVarD;
        fd0 fd0Var;
        if (ltVar != null && (fd0Var = ltVar.f387707h) != null) {
            aVarD = a(new jd0.b(fd0Var));
        } else {
            aVarD = d();
        }
        a(aVarD, 10, new T(aVarD, ltVar, 1));
    }

    @Override // com.yandex.mobile.ads.impl.j9
    public final void a(Object obj, long j12) {
        k9.a aVarE = e();
        a(aVarE, 26, new com.google.android.datatransport.runtime.scheduling.jobscheduling.h(aVarE, j12, obj));
    }

    @Override // com.yandex.mobile.ads.impl.kd0
    public final void a(int i12, @j.P jd0.b bVar, q90 q90Var, zc0 zc0Var) {
        k9.a aVarE = e(i12, bVar);
        a(aVarE, 1002, new P(aVarE, q90Var, zc0Var, 1));
    }

    @Override // com.yandex.mobile.ads.impl.kd0
    public final void a(int i12, @j.P jd0.b bVar, final q90 q90Var, final zc0 zc0Var, final IOException iOException, final boolean z12) {
        final k9.a aVarE = e(i12, bVar);
        a(aVarE, ErrorCodes.MALFORMED_URL_EXCEPTION, new m90.a() { // from class: com.yandex.mobile.ads.impl.U
            @Override // com.yandex.mobile.ads.impl.m90.a
            public final void invoke(Object obj) {
                zc0 zc0Var2 = zc0Var;
                IOException iOException2 = iOException;
                fo.a(aVarE, q90Var, zc0Var2, iOException2, z12, (k9) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(k9.a aVar, q90 q90Var, zc0 zc0Var, IOException iOException, boolean z12, k9 k9Var) {
        ((bd0) k9Var).a(zc0Var);
    }

    @Override // com.yandex.mobile.ads.impl.kd0
    public final void a(int i12, @j.P jd0.b bVar, zc0 zc0Var) {
        k9.a aVarE = e(i12, bVar);
        a(aVarE, ErrorCodes.PROTOCOL_EXCEPTION, new O(10, aVarE, zc0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(k9.a aVar, zc0 zc0Var, k9 k9Var) {
        ((bd0) k9Var).a(aVar, zc0Var);
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void a(int i12) {
        a aVar = this.f385432d;
        gt0 gt0Var = this.f385435g;
        gt0Var.getClass();
        aVar.b(gt0Var);
        k9.a aVarD = d();
        a(aVarD, 0, new S(aVarD, i12, 2));
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void a(@j.P xc0 xc0Var, int i12) {
        k9.a aVarD = d();
        a(aVarD, 1, new M1(aVarD, xc0Var, i12));
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void a(sa1 sa1Var) {
        k9.a aVarD = d();
        a(aVarD, 2, new O(9, aVarD, sa1Var));
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void a(gt0.a aVar) {
        k9.a aVarD = d();
        a(aVarD, 13, new O(7, aVarD, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(k9.a aVar, zs0 zs0Var, k9 k9Var) {
        ((bd0) k9Var).a(zs0Var);
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void a(gt0.c cVar, gt0.c cVar2, int i12) {
        a aVar = this.f385432d;
        gt0 gt0Var = this.f385435g;
        gt0Var.getClass();
        aVar.a(gt0Var);
        k9.a aVarD = d();
        a(aVarD, 11, new androidx.media3.exoplayer.analytics.n(i12, aVarD, 2, cVar, cVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(k9.a aVar, int i12, gt0.c cVar, gt0.c cVar2, k9 k9Var) {
        k9Var.getClass();
        ((bd0) k9Var).a(i12);
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void a(ct0 ct0Var) {
        k9.a aVarD = d();
        a(aVarD, 12, new O(8, aVarD, ct0Var));
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void a(ad0 ad0Var) {
        k9.a aVarD = d();
        a(aVarD, 14, new O(2, aVarD, ad0Var));
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void a(Metadata metadata) {
        k9.a aVarD = d();
        a(aVarD, 28, new O(4, aVarD, metadata));
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void a(xm xmVar) {
        k9.a aVarD = d();
        a(aVarD, 27, new O(5, aVarD, xmVar));
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void a(ji1 ji1Var) {
        k9.a aVarE = e();
        a(aVarE, 25, new O(6, aVarE, ji1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(k9.a aVar, ji1 ji1Var, k9 k9Var) {
        ((bd0) k9Var).a(ji1Var);
        int i12 = ji1Var.f386883a;
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void a(zp zpVar) {
        k9.a aVarD = d();
        a(aVarD, 29, new O(3, aVarD, zpVar));
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void a(boolean z12, int i12) {
        k9.a aVarD = d();
        a(aVarD, 30, new X(i12, aVarD, z12));
    }

    @Override // com.yandex.mobile.ads.exo.drm.f
    public final void a(int i12, @j.P jd0.b bVar, int i13) {
        k9.a aVarE = e(i12, bVar);
        a(aVarE, 1022, new S(aVarE, i13, 3));
    }

    @Override // com.yandex.mobile.ads.exo.drm.f
    public final void a(int i12, @j.P jd0.b bVar, Exception exc) {
        k9.a aVarE = e(i12, bVar);
        a(aVarE, 1024, new V(aVarE, exc, 3));
    }

    @Override // com.yandex.mobile.ads.exo.drm.f
    public final void a(int i12, @j.P jd0.b bVar) {
        k9.a aVarE = e(i12, bVar);
        a(aVarE, 1025, new M(aVarE, 0));
    }

    public final void a(k9.a aVar, int i12, m90.a<k9> aVar2) {
        this.f385433e.put(i12, aVar);
        m90<k9> m90Var = this.f385434f;
        m90Var.a(i12, aVar2);
        m90Var.a();
    }

    @v61.m
    public final k9.a a(i91 i91Var, int i12, @j.P jd0.b bVar) {
        jd0.b bVar2 = i91Var.c() ? null : bVar;
        long jC2 = this.f385429a.c();
        boolean z12 = i91Var.equals(this.f385435g.getCurrentTimeline()) && i12 == this.f385435g.getCurrentMediaItemIndex();
        long jB2 = 0;
        if (bVar2 == null || !bVar2.a()) {
            if (z12) {
                jB2 = this.f385435g.getContentPosition();
            } else if (!i91Var.c()) {
                jB2 = pc1.b(i91Var.a(i12, this.f385431c, 0L).f386416m);
            }
        } else if (z12 && this.f385435g.getCurrentAdGroupIndex() == bVar2.f385281b && this.f385435g.getCurrentAdIndexInAdGroup() == bVar2.f385282c) {
            jB2 = this.f385435g.getCurrentPosition();
        }
        return new k9.a(jC2, i91Var, i12, bVar2, jB2, this.f385435g.getCurrentTimeline(), this.f385435g.getCurrentMediaItemIndex(), this.f385432d.a(), this.f385435g.getCurrentPosition(), this.f385435g.getTotalBufferedDuration());
    }

    private k9.a a(@j.P jd0.b bVar) {
        this.f385435g.getClass();
        i91 i91VarA = bVar == null ? null : this.f385432d.a(bVar);
        if (bVar != null && i91VarA != null) {
            return a(i91VarA, i91VarA.a(bVar.f385280a, this.f385430b).f386391c, bVar);
        }
        int currentMediaItemIndex = this.f385435g.getCurrentMediaItemIndex();
        i91 currentTimeline = this.f385435g.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.b()) {
            currentTimeline = i91.f386387a;
        }
        return a(currentTimeline, currentMediaItemIndex, (jd0.b) null);
    }

    @Override // com.yandex.mobile.ads.impl.j9
    public final void a(tn tnVar) {
        k9.a aVarA = a(this.f385432d.c());
        a(aVarA, 1013, new B0(aVarA, tnVar, 0));
    }

    @Override // com.yandex.mobile.ads.impl.j9
    public final void a(int i12, long j12) {
        k9.a aVarA = a(this.f385432d.c());
        a(aVarA, 1021, new N(aVarA, j12, i12));
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void a(@j.P lt ltVar) {
        k9.a aVarD;
        fd0 fd0Var;
        if (ltVar != null && (fd0Var = ltVar.f387707h) != null) {
            aVarD = a(new jd0.b(fd0Var));
        } else {
            aVarD = d();
        }
        a(aVarD, 10, new T(aVarD, ltVar, 0));
    }
}
