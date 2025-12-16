package androidx.media3.exoplayer.analytics;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.C23108t;
import androidx.media3.common.H;
import androidx.media3.common.P;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.z;
import androidx.media3.exoplayer.C23138g;
import androidx.media3.exoplayer.analytics.b;
import androidx.media3.exoplayer.analytics.t;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.C23171w;
import j.P;
import j.X;
import java.io.IOException;
import java.util.HashMap;
import v61.InterfaceC49174e;

/* compiled from: MediaMetricsListener.java */
@J
@X
/* loaded from: classes.dex */
public final class s implements androidx.media3.exoplayer.analytics.b, t.a {

    /* renamed from: A, reason: collision with root package name */
    public boolean f48718A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f48719a;

    /* renamed from: b, reason: collision with root package name */
    public final q f48720b;

    /* renamed from: c, reason: collision with root package name */
    public final PlaybackSession f48721c;

    /* renamed from: i, reason: collision with root package name */
    @P
    public String f48727i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public PlaybackMetrics.Builder f48728j;

    /* renamed from: k, reason: collision with root package name */
    public int f48729k;

    /* renamed from: n, reason: collision with root package name */
    @P
    public PlaybackException f48732n;

    /* renamed from: o, reason: collision with root package name */
    @P
    public b f48733o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public b f48734p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public b f48735q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public C23108t f48736r;

    /* renamed from: s, reason: collision with root package name */
    @P
    public C23108t f48737s;

    /* renamed from: t, reason: collision with root package name */
    @P
    public C23108t f48738t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f48739u;

    /* renamed from: v, reason: collision with root package name */
    public int f48740v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f48741w;

    /* renamed from: x, reason: collision with root package name */
    public int f48742x;

    /* renamed from: y, reason: collision with root package name */
    public int f48743y;

    /* renamed from: z, reason: collision with root package name */
    public int f48744z;

    /* renamed from: e, reason: collision with root package name */
    public final P.d f48723e = new P.d();

    /* renamed from: f, reason: collision with root package name */
    public final P.b f48724f = new P.b();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap<String, Long> f48726h = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap<String, Long> f48725g = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final long f48722d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    public int f48730l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f48731m = 0;

    /* compiled from: MediaMetricsListener.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f48745a;

        /* renamed from: b, reason: collision with root package name */
        public final int f48746b;

        public a(int i12, int i13) {
            this.f48745a = i12;
            this.f48746b = i13;
        }
    }

    /* compiled from: MediaMetricsListener.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final C23108t f48747a;

        /* renamed from: b, reason: collision with root package name */
        public final int f48748b;

        /* renamed from: c, reason: collision with root package name */
        public final String f48749c;

        public b(C23108t c23108t, int i12, String str) {
            this.f48747a = c23108t;
            this.f48748b = i12;
            this.f48749c = str;
        }
    }

    public s(Context context, PlaybackSession playbackSession) {
        this.f48719a = context.getApplicationContext();
        this.f48721c = playbackSession;
        q qVar = new q();
        this.f48720b = qVar;
        qVar.f48707e = this;
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public final void J(b.C1823b c1823b, PlaybackException playbackException) {
        this.f48732n = playbackException;
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public final void K(b.C1823b c1823b, C23138g c23138g) {
        this.f48742x += c23138g.f49161g;
        this.f48743y += c23138g.f49159e;
    }

    @InterfaceC49174e
    public final boolean P(@j.P b bVar) {
        String str;
        if (bVar != null) {
            q qVar = this.f48720b;
            synchronized (qVar) {
                str = qVar.f48709g;
            }
            if (bVar.f48749c.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void Q() {
        PlaybackMetrics.Builder builder = this.f48728j;
        if (builder != null && this.f48718A) {
            builder.setAudioUnderrunCount(this.f48744z);
            this.f48728j.setVideoFramesDropped(this.f48742x);
            this.f48728j.setVideoFramesPlayed(this.f48743y);
            Long l12 = this.f48725g.get(this.f48727i);
            this.f48728j.setNetworkTransferDurationMillis(l12 == null ? 0L : l12.longValue());
            Long l13 = this.f48726h.get(this.f48727i);
            this.f48728j.setNetworkBytesRead(l13 == null ? 0L : l13.longValue());
            this.f48728j.setStreamSource((l13 == null || l13.longValue() <= 0) ? 0 : 1);
            this.f48721c.reportPlaybackMetrics(this.f48728j.build());
        }
        this.f48728j = null;
        this.f48727i = null;
        this.f48744z = 0;
        this.f48742x = 0;
        this.f48743y = 0;
        this.f48736r = null;
        this.f48737s = null;
        this.f48738t = null;
        this.f48718A = false;
    }

    @v61.m
    public final void R(androidx.media3.common.P p12, @j.P A.b bVar) {
        int iG2;
        PlaybackMetrics.Builder builder = this.f48728j;
        if (bVar == null || (iG2 = p12.g(bVar.f47212a)) == -1) {
            return;
        }
        P.b bVar2 = this.f48724f;
        int i12 = 0;
        p12.n(iG2, bVar2, false);
        int i13 = bVar2.f47381d;
        P.d dVar = this.f48723e;
        p12.v(i13, dVar);
        z.h hVar = dVar.f47409d.f47979c;
        if (hVar != null) {
            int iA2 = M.A(hVar.f48069b, hVar.f48070c);
            i12 = iA2 != 0 ? iA2 != 1 ? iA2 != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i12);
        if (dVar.f47420o != -9223372036854775807L && !dVar.f47418m && !dVar.f47415j && !dVar.a()) {
            builder.setMediaDurationMillis(M.Q(dVar.f47420o));
        }
        builder.setPlaybackType(dVar.a() ? 2 : 1);
        this.f48718A = true;
    }

    public final void S(b.C1823b c1823b, String str) {
        A.b bVar = c1823b.f48635d;
        if ((bVar == null || !bVar.a()) && str.equals(this.f48727i)) {
            Q();
        }
        this.f48725g.remove(str);
        this.f48726h.remove(str);
    }

    public final void T(int i12, long j12, @j.P C23108t c23108t, int i13) {
        int i14;
        TrackChangeEvent.Builder timeSinceCreatedMillis = r.l(i12).setTimeSinceCreatedMillis(j12 - this.f48722d);
        if (c23108t != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i13 != 1) {
                i14 = 3;
                if (i13 != 2) {
                    i14 = i13 != 3 ? 1 : 4;
                }
            } else {
                i14 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i14);
            String str = c23108t.f47756l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c23108t.f47757m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c23108t.f47754j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i15 = c23108t.f47753i;
            if (i15 != -1) {
                timeSinceCreatedMillis.setBitrate(i15);
            }
            int i16 = c23108t.f47762r;
            if (i16 != -1) {
                timeSinceCreatedMillis.setWidth(i16);
            }
            int i17 = c23108t.f47763s;
            if (i17 != -1) {
                timeSinceCreatedMillis.setHeight(i17);
            }
            int i18 = c23108t.f47770z;
            if (i18 != -1) {
                timeSinceCreatedMillis.setChannelCount(i18);
            }
            int i19 = c23108t.f47737A;
            if (i19 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i19);
            }
            String str4 = c23108t.f47748d;
            if (str4 != null) {
                int i22 = M.f47887a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f12 = c23108t.f47764t;
            if (f12 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f12);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f48718A = true;
        this.f48721c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public final void h(int i12, long j12, b.C1823b c1823b) {
        A.b bVar = c1823b.f48635d;
        if (bVar != null) {
            String strC = this.f48720b.c(c1823b.f48633b, bVar);
            HashMap<String, Long> map = this.f48726h;
            Long l12 = map.get(strC);
            HashMap<String, Long> map2 = this.f48725g;
            Long l13 = map2.get(strC);
            map.put(strC, Long.valueOf((l12 == null ? 0L : l12.longValue()) + j12));
            map2.put(strC, Long.valueOf((l13 != null ? l13.longValue() : 0L) + i12));
        }
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public final void k(b.C1823b c1823b, androidx.media3.common.X x12) {
        b bVar = this.f48733o;
        if (bVar != null) {
            C23108t c23108t = bVar.f48747a;
            if (c23108t.f47763s == -1) {
                C23108t.b bVarA = c23108t.a();
                bVarA.f47792p = x12.f47555b;
                bVarA.f47793q = x12.f47556c;
                this.f48733o = new b(bVarA.a(), bVar.f48748b, bVar.f48749c);
            }
        }
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public final void l(b.C1823b c1823b, C23171w c23171w) {
        A.b bVar = c1823b.f48635d;
        if (bVar == null) {
            return;
        }
        C23108t c23108t = c23171w.f49854c;
        c23108t.getClass();
        bVar.getClass();
        b bVar2 = new b(c23108t, c23171w.f49855d, this.f48720b.c(c1823b.f48633b, bVar));
        int i12 = c23171w.f49853b;
        if (i12 != 0) {
            if (i12 == 1) {
                this.f48734p = bVar2;
                return;
            } else if (i12 != 2) {
                if (i12 != 3) {
                    return;
                }
                this.f48735q = bVar2;
                return;
            }
        }
        this.f48733o = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:282:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x069d A[ORIG_RETURN, RETURN] */
    @Override // androidx.media3.exoplayer.analytics.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(androidx.media3.common.H r29, androidx.media3.exoplayer.analytics.b.c r30) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.analytics.s.m(androidx.media3.common.H, androidx.media3.exoplayer.analytics.b$c):void");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public final void v(b.C1823b c1823b, C23171w c23171w, IOException iOException) {
        this.f48740v = c23171w.f49852a;
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public final void x(b.C1823b c1823b, H.k kVar, H.k kVar2, int i12) {
        if (i12 == 1) {
            this.f48739u = true;
        }
        this.f48729k = i12;
    }
}
