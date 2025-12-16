package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.yandex.mobile.ads.impl.i91;
import com.yandex.mobile.ads.impl.jd0;
import com.yandex.mobile.ads.impl.k9;
import com.yandex.mobile.ads.impl.xc0;
import java.util.HashMap;

@j.X
/* loaded from: classes8.dex */
public final class bd0 implements k9, et0 {

    /* renamed from: A, reason: collision with root package name */
    private boolean f383896A;

    /* renamed from: a, reason: collision with root package name */
    private final Context f383897a;

    /* renamed from: b, reason: collision with root package name */
    private final fp f383898b;

    /* renamed from: c, reason: collision with root package name */
    private final PlaybackSession f383899c;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private String f383905i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private PlaybackMetrics.Builder f383906j;

    /* renamed from: k, reason: collision with root package name */
    private int f383907k;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    private zs0 f383910n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    private b f383911o;

    /* renamed from: p, reason: collision with root package name */
    @j.P
    private b f383912p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    private b f383913q;

    /* renamed from: r, reason: collision with root package name */
    @j.P
    private vw f383914r;

    /* renamed from: s, reason: collision with root package name */
    @j.P
    private vw f383915s;

    /* renamed from: t, reason: collision with root package name */
    @j.P
    private vw f383916t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f383917u;

    /* renamed from: v, reason: collision with root package name */
    private int f383918v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f383919w;

    /* renamed from: x, reason: collision with root package name */
    private int f383920x;

    /* renamed from: y, reason: collision with root package name */
    private int f383921y;

    /* renamed from: z, reason: collision with root package name */
    private int f383922z;

    /* renamed from: e, reason: collision with root package name */
    private final i91.d f383901e = new i91.d();

    /* renamed from: f, reason: collision with root package name */
    private final i91.b f383902f = new i91.b();

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<String, Long> f383904h = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, Long> f383903g = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final long f383900d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    private int f383908l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f383909m = 0;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f383923a;

        /* renamed from: b, reason: collision with root package name */
        public final int f383924b;

        public a(int i12, int i13) {
            this.f383923a = i12;
            this.f383924b = i13;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final vw f383925a;

        /* renamed from: b, reason: collision with root package name */
        public final int f383926b;

        /* renamed from: c, reason: collision with root package name */
        public final String f383927c;

        public b(vw vwVar, int i12, String str) {
            this.f383925a = vwVar;
            this.f383926b = i12;
            this.f383927c = str;
        }
    }

    private bd0(Context context, PlaybackSession playbackSession) {
        this.f383897a = context.getApplicationContext();
        this.f383899c = playbackSession;
        fp fpVar = new fp();
        this.f383898b = fpVar;
        fpVar.a(this);
    }

    @j.P
    public static bd0 a(Context context) {
        MediaMetricsManager mediaMetricsManagerA = androidx.credentials.provider.r.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new bd0(context, mediaMetricsManagerA.createPlaybackSession());
    }

    public final LogSessionId b() {
        return this.f383899c.getSessionId();
    }

    public final void b(k9.a aVar, String str) {
        jd0.b bVar = aVar.f387078d;
        if ((bVar == null || !bVar.a()) && str.equals(this.f383905i)) {
            a();
        }
        this.f383903g.remove(str);
        this.f383904h.remove(str);
    }

    public final void a(k9.a aVar, String str) {
        jd0.b bVar = aVar.f387078d;
        if (bVar == null || !bVar.a()) {
            a();
            this.f383905i = str;
            this.f383906j = androidx.credentials.provider.r.g().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.1");
            a(aVar.f387076b, aVar.f387078d);
        }
    }

    public final void a(int i12) {
        if (i12 == 1) {
            this.f383917u = true;
        }
        this.f383907k = i12;
    }

    public final void a(tn tnVar) {
        this.f383920x += tnVar.f390235g;
        this.f383921y += tnVar.f390233e;
    }

    public final void a(k9.a aVar, int i12, long j12) {
        jd0.b bVar = aVar.f387078d;
        if (bVar != null) {
            String strA = this.f383898b.a(aVar.f387076b, bVar);
            Long l12 = this.f383904h.get(strA);
            Long l13 = this.f383903g.get(strA);
            this.f383904h.put(strA, Long.valueOf((l12 == null ? 0L : l12.longValue()) + j12));
            this.f383903g.put(strA, Long.valueOf((l13 != null ? l13.longValue() : 0L) + i12));
        }
    }

    public final void a(k9.a aVar, zc0 zc0Var) {
        if (aVar.f387078d == null) {
            return;
        }
        vw vwVar = zc0Var.f392223c;
        vwVar.getClass();
        int i12 = zc0Var.f392224d;
        fp fpVar = this.f383898b;
        i91 i91Var = aVar.f387076b;
        jd0.b bVar = aVar.f387078d;
        bVar.getClass();
        b bVar2 = new b(vwVar, i12, fpVar.a(i91Var, bVar));
        int i13 = zc0Var.f392222b;
        if (i13 != 0) {
            if (i13 == 1) {
                this.f383912p = bVar2;
                return;
            } else if (i13 != 2) {
                if (i13 != 3) {
                    return;
                }
                this.f383913q = bVar2;
                return;
            }
        }
        this.f383911o = bVar2;
    }

    public final void a(ji1 ji1Var) {
        b bVar = this.f383911o;
        if (bVar != null) {
            vw vwVar = bVar.f383925a;
            if (vwVar.f391187r == -1) {
                this.f383911o = new b(vwVar.a().q(ji1Var.f386883a).g(ji1Var.f386884b).a(), bVar.f383926b, bVar.f383927c);
            }
        }
    }

    public final void a(zc0 zc0Var) {
        this.f383918v = zc0Var.f392221a;
    }

    public final void a(zs0 zs0Var) {
        this.f383910n = zs0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0451  */
    /* JADX WARN: Type inference failed for: r15v12, types: [com.yandex.mobile.ads.impl.vw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.yandex.mobile.ads.impl.gt0 r30, com.yandex.mobile.ads.impl.k9.b r31) {
        /*
            Method dump skipped, instructions count: 1632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.bd0.a(com.yandex.mobile.ads.impl.gt0, com.yandex.mobile.ads.impl.k9$b):void");
    }

    private void a(int i12, long j12, @j.P vw vwVar, int i13) {
        int i14;
        TrackChangeEvent.Builder timeSinceCreatedMillis = androidx.media3.exoplayer.analytics.r.l(i12).setTimeSinceCreatedMillis(j12 - this.f383900d);
        if (vwVar != null) {
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
            String str = vwVar.f391180k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = vwVar.f391181l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = vwVar.f391178i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i15 = vwVar.f391177h;
            if (i15 != -1) {
                timeSinceCreatedMillis.setBitrate(i15);
            }
            int i16 = vwVar.f391186q;
            if (i16 != -1) {
                timeSinceCreatedMillis.setWidth(i16);
            }
            int i17 = vwVar.f391187r;
            if (i17 != -1) {
                timeSinceCreatedMillis.setHeight(i17);
            }
            int i18 = vwVar.f391194y;
            if (i18 != -1) {
                timeSinceCreatedMillis.setChannelCount(i18);
            }
            int i19 = vwVar.f391195z;
            if (i19 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i19);
            }
            String str4 = vwVar.f391172c;
            if (str4 != null) {
                int i22 = pc1.f388768a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f12 = vwVar.f391188s;
            if (f12 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f12);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f383896A = true;
        this.f383899c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @v61.m
    private void a(i91 i91Var, @j.P jd0.b bVar) {
        int iA2;
        PlaybackMetrics.Builder builder = this.f383906j;
        if (bVar == null || (iA2 = i91Var.a(bVar.f385280a)) == -1) {
            return;
        }
        int i12 = 0;
        i91Var.a(iA2, this.f383902f, false);
        i91Var.a(this.f383902f.f386391c, this.f383901e, 0L);
        xc0.g gVar = this.f383901e.f386406c.f391606b;
        if (gVar != null) {
            int iA3 = pc1.a(gVar.f391654a, gVar.f391655b);
            i12 = iA3 != 0 ? iA3 != 1 ? iA3 != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i12);
        i91.d dVar = this.f383901e;
        if (dVar.f386417n != -9223372036854775807L && !dVar.f386415l && !dVar.f386412i && !dVar.a()) {
            builder.setMediaDurationMillis(pc1.b(this.f383901e.f386417n));
        }
        builder.setPlaybackType(this.f383901e.a() ? 2 : 1);
        this.f383896A = true;
    }

    private void a() {
        PlaybackMetrics.Builder builder = this.f383906j;
        if (builder != null && this.f383896A) {
            builder.setAudioUnderrunCount(this.f383922z);
            this.f383906j.setVideoFramesDropped(this.f383920x);
            this.f383906j.setVideoFramesPlayed(this.f383921y);
            Long l12 = this.f383903g.get(this.f383905i);
            this.f383906j.setNetworkTransferDurationMillis(l12 == null ? 0L : l12.longValue());
            Long l13 = this.f383904h.get(this.f383905i);
            this.f383906j.setNetworkBytesRead(l13 == null ? 0L : l13.longValue());
            this.f383906j.setStreamSource((l13 == null || l13.longValue() <= 0) ? 0 : 1);
            this.f383899c.reportPlaybackMetrics(this.f383906j.build());
        }
        this.f383906j = null;
        this.f383905i = null;
        this.f383922z = 0;
        this.f383920x = 0;
        this.f383921y = 0;
        this.f383914r = null;
        this.f383915s = null;
        this.f383916t = null;
        this.f383896A = false;
    }
}
