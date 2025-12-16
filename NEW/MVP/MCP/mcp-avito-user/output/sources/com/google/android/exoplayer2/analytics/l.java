package com.google.android.exoplayer2.analytics;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.analytics.r;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.analytics.m;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.C36557u;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.util.U;
import j.P;
import j.X;
import java.io.IOException;
import java.util.HashMap;
import v61.InterfaceC49174e;

/* compiled from: MediaMetricsListener.java */
@X
/* loaded from: classes6.dex */
public final class l implements com.google.android.exoplayer2.analytics.b, m.a {

    /* renamed from: A, reason: collision with root package name */
    public int f343804A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f343805B;

    /* renamed from: b, reason: collision with root package name */
    public final Context f343806b;

    /* renamed from: c, reason: collision with root package name */
    public final k f343807c;

    /* renamed from: d, reason: collision with root package name */
    public final PlaybackSession f343808d;

    /* renamed from: j, reason: collision with root package name */
    @P
    public String f343814j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public PlaybackMetrics.Builder f343815k;

    /* renamed from: l, reason: collision with root package name */
    public int f343816l;

    /* renamed from: o, reason: collision with root package name */
    @P
    public PlaybackException f343819o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public b f343820p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public b f343821q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public b f343822r;

    /* renamed from: s, reason: collision with root package name */
    @P
    public I f343823s;

    /* renamed from: t, reason: collision with root package name */
    @P
    public I f343824t;

    /* renamed from: u, reason: collision with root package name */
    @P
    public I f343825u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f343826v;

    /* renamed from: w, reason: collision with root package name */
    public int f343827w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f343828x;

    /* renamed from: y, reason: collision with root package name */
    public int f343829y;

    /* renamed from: z, reason: collision with root package name */
    public int f343830z;

    /* renamed from: f, reason: collision with root package name */
    public final s0.d f343810f = new s0.d();

    /* renamed from: g, reason: collision with root package name */
    public final s0.b f343811g = new s0.b();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap<String, Long> f343813i = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap<String, Long> f343812h = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    public final long f343809e = SystemClock.elapsedRealtime();

    /* renamed from: m, reason: collision with root package name */
    public int f343817m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f343818n = 0;

    /* compiled from: MediaMetricsListener.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f343831a;

        /* renamed from: b, reason: collision with root package name */
        public final int f343832b;

        public a(int i12, int i13) {
            this.f343831a = i12;
            this.f343832b = i13;
        }
    }

    /* compiled from: MediaMetricsListener.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final I f343833a;

        /* renamed from: b, reason: collision with root package name */
        public final int f343834b;

        /* renamed from: c, reason: collision with root package name */
        public final String f343835c;

        public b(I i12, int i13, String str) {
            this.f343833a = i12;
            this.f343834b = i13;
            this.f343835c = str;
        }
    }

    public l(Context context, PlaybackSession playbackSession) {
        this.f343806b = context.getApplicationContext();
        this.f343808d = playbackSession;
        k kVar = new k();
        this.f343807c = kVar;
        kVar.f343794e = this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:265:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04da  */
    /* JADX WARN: Type inference failed for: r9v13, types: [com.google.android.exoplayer2.I, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // com.google.android.exoplayer2.analytics.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void QW(com.google.android.exoplayer2.d0 r29, com.google.android.exoplayer2.analytics.b.c r30) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.analytics.l.QW(com.google.android.exoplayer2.d0, com.google.android.exoplayer2.analytics.b$c):void");
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void Uz(int i12, long j12, b.C10568b c10568b) {
        y.b bVar = c10568b.f343746d;
        if (bVar != null) {
            String strB = this.f343807c.b(c10568b.f343744b, bVar);
            HashMap<String, Long> map = this.f343813i;
            Long l12 = map.get(strB);
            HashMap<String, Long> map2 = this.f343812h;
            Long l13 = map2.get(strB);
            map.put(strB, Long.valueOf((l12 == null ? 0L : l12.longValue()) + j12));
            map2.put(strB, Long.valueOf((l13 != null ? l13.longValue() : 0L) + i12));
        }
    }

    @InterfaceC49174e
    public final boolean a(@P b bVar) {
        String str;
        if (bVar != null) {
            k kVar = this.f343807c;
            synchronized (kVar) {
                str = kVar.f343796g;
            }
            if (bVar.f343835c.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.f343815k;
        if (builder != null && this.f343805B) {
            builder.setAudioUnderrunCount(this.f343804A);
            this.f343815k.setVideoFramesDropped(this.f343829y);
            this.f343815k.setVideoFramesPlayed(this.f343830z);
            Long l12 = this.f343812h.get(this.f343814j);
            this.f343815k.setNetworkTransferDurationMillis(l12 == null ? 0L : l12.longValue());
            Long l13 = this.f343813i.get(this.f343814j);
            this.f343815k.setNetworkBytesRead(l13 == null ? 0L : l13.longValue());
            this.f343815k.setStreamSource((l13 == null || l13.longValue() <= 0) ? 0 : 1);
            this.f343808d.reportPlaybackMetrics(this.f343815k.build());
        }
        this.f343815k = null;
        this.f343814j = null;
        this.f343804A = 0;
        this.f343829y = 0;
        this.f343830z = 0;
        this.f343823s = null;
        this.f343824t = null;
        this.f343825u = null;
        this.f343805B = false;
    }

    @v61.m
    public final void c(s0 s0Var, @P y.b bVar) {
        int iB2;
        PlaybackMetrics.Builder builder = this.f343815k;
        if (bVar == null || (iB2 = s0Var.b(bVar.f346696a)) == -1) {
            return;
        }
        s0.b bVar2 = this.f343811g;
        int i12 = 0;
        s0Var.f(iB2, bVar2, false);
        int i13 = bVar2.f345872d;
        s0.d dVar = this.f343810f;
        s0Var.n(i13, dVar);
        O.i iVar = dVar.f345882d.f343529c;
        if (iVar != null) {
            int iD2 = U.D(iVar.f343571a, iVar.f343572b);
            i12 = iD2 != 0 ? iD2 != 1 ? iD2 != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i12);
        if (dVar.f345893o != -9223372036854775807L && !dVar.f345891m && !dVar.f345888j && !dVar.a()) {
            builder.setMediaDurationMillis(U.R(dVar.f345893o));
        }
        builder.setPlaybackType(dVar.a() ? 2 : 1);
        this.f343805B = true;
    }

    public final void d(b.C10568b c10568b, String str) {
        y.b bVar = c10568b.f343746d;
        if ((bVar == null || !bVar.a()) && str.equals(this.f343814j)) {
            b();
        }
        this.f343812h.remove(str);
        this.f343813i.remove(str);
    }

    public final void e(int i12, long j12, @P I i13, int i14) {
        int i15;
        TrackChangeEvent.Builder timeSinceCreatedMillis = r.l(i12).setTimeSinceCreatedMillis(j12 - this.f343809e);
        if (i13 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i14 != 1) {
                i15 = 3;
                if (i14 != 2) {
                    i15 = i14 != 3 ? 1 : 4;
                }
            } else {
                i15 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i15);
            String str = i13.f343475l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = i13.f343476m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = i13.f343473j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i16 = i13.f343472i;
            if (i16 != -1) {
                timeSinceCreatedMillis.setBitrate(i16);
            }
            int i17 = i13.f343481r;
            if (i17 != -1) {
                timeSinceCreatedMillis.setWidth(i17);
            }
            int i18 = i13.f343482s;
            if (i18 != -1) {
                timeSinceCreatedMillis.setHeight(i18);
            }
            int i19 = i13.f343489z;
            if (i19 != -1) {
                timeSinceCreatedMillis.setChannelCount(i19);
            }
            int i22 = i13.f343458A;
            if (i22 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i22);
            }
            String str4 = i13.f343467d;
            if (str4 != null) {
                int i23 = U.f348106a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f12 = i13.f343483t;
            if (f12 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f12);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f343805B = true;
        this.f343808d.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void jC(b.C10568b c10568b, com.google.android.exoplayer2.video.o oVar) {
        b bVar = this.f343820p;
        if (bVar != null) {
            I i12 = bVar.f343833a;
            if (i12.f343482s == -1) {
                I.b bVarA = i12.a();
                bVarA.f343509p = oVar.f348321b;
                bVarA.f343510q = oVar.f348322c;
                this.f343820p = new b(bVarA.a(), bVar.f343834b, bVar.f343835c);
            }
        }
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void jp(b.C10568b c10568b, d0.k kVar, d0.k kVar2, int i12) {
        if (i12 == 1) {
            this.f343826v = true;
        }
        this.f343816l = i12;
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void mt(b.C10568b c10568b, C36557u c36557u, IOException iOException) {
        this.f343827w = c36557u.f346688a;
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void nR(b.C10568b c10568b, C36557u c36557u) {
        y.b bVar = c10568b.f343746d;
        if (bVar == null) {
            return;
        }
        I i12 = c36557u.f346690c;
        i12.getClass();
        bVar.getClass();
        b bVar2 = new b(i12, c36557u.f346691d, this.f343807c.b(c10568b.f343744b, bVar));
        int i13 = c36557u.f346689b;
        if (i13 != 0) {
            if (i13 == 1) {
                this.f343821q = bVar2;
                return;
            } else if (i13 != 2) {
                if (i13 != 3) {
                    return;
                }
                this.f343822r = bVar2;
                return;
            }
        }
        this.f343820p = bVar2;
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void tN(b.C10568b c10568b, com.google.android.exoplayer2.decoder.f fVar) {
        this.f343829y += fVar.f344229g;
        this.f343830z += fVar.f344227e;
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void wO(b.C10568b c10568b, PlaybackException playbackException) {
        this.f343819o = playbackException;
    }
}
