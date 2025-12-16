package defpackage;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.PlaybackException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a29 implements jd {
    public lk6 A0;
    public lk6 B0;
    public hf6 C0;
    public hf6 D0;
    public hf6 E0;
    public boolean F0;
    public int G0;
    public boolean H0;
    public int I0;
    public int J0;
    public int K0;
    public boolean L0;
    public final Context a;
    public final uo4 c;
    public final PlaybackSession d;
    public String t0;
    public PlaybackMetrics.Builder u0;
    public int v0;
    public PlaybackException y0;
    public lk6 z0;
    public final Executor b = if0.a();
    public final q9g X = new q9g();
    public final m9g Y = new m9g();
    public final HashMap s0 = new HashMap();
    public final HashMap Z = new HashMap();
    public final long o = SystemClock.elapsedRealtime();
    public int w0 = 0;
    public int x0 = 0;

    public a29(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        uo4 uo4Var = new uo4();
        this.c = uo4Var;
        uo4Var.d = this;
    }

    @Override // defpackage.jd
    public final void H0(int i, id idVar, t3c t3cVar, t3c t3cVar2) {
        if (i == 1) {
            this.F0 = true;
        }
        this.v0 = i;
    }

    @Override // defpackage.jd
    public final void N(id idVar, nh4 nh4Var) {
        this.I0 += nh4Var.h;
        this.J0 += nh4Var.f;
    }

    @Override // defpackage.jd
    public final void Y(id idVar, sch schVar) {
        lk6 lk6Var = this.z0;
        if (lk6Var != null) {
            hf6 hf6Var = (hf6) lk6Var.c;
            if (hf6Var.v == -1) {
                ff6 ff6VarA = hf6Var.a();
                ff6VarA.t = schVar.a;
                ff6VarA.u = schVar.b;
                this.z0 = new lk6(new hf6(ff6VarA), lk6Var.b, (String) lk6Var.d, 17);
            }
        }
    }

    public final boolean a(lk6 lk6Var) {
        String str;
        if (lk6Var == null) {
            return false;
        }
        String str2 = (String) lk6Var.d;
        uo4 uo4Var = this.c;
        synchronized (uo4Var) {
            str = uo4Var.f;
        }
        return str2.equals(str);
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.u0;
        if (builder != null && this.L0) {
            builder.setAudioUnderrunCount(this.K0);
            this.u0.setVideoFramesDropped(this.I0);
            this.u0.setVideoFramesPlayed(this.J0);
            Long l = (Long) this.Z.get(this.t0);
            this.u0.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.s0.get(this.t0);
            this.u0.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.u0.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.b.execute(new qz5(this, 28, this.u0.build()));
        }
        this.u0 = null;
        this.t0 = null;
        this.K0 = 0;
        this.I0 = 0;
        this.J0 = 0;
        this.C0 = null;
        this.D0 = null;
        this.E0 = null;
        this.L0 = false;
    }

    public final void c(s9g s9gVar, d99 d99Var) {
        int iB;
        PlaybackMetrics.Builder builder = this.u0;
        if (d99Var == null || (iB = s9gVar.b(d99Var.a)) == -1) {
            return;
        }
        m9g m9gVar = this.Y;
        int i = 0;
        s9gVar.f(iB, m9gVar, false);
        int i2 = m9gVar.c;
        q9g q9gVar = this.X;
        s9gVar.n(i2, q9gVar);
        a09 a09Var = q9gVar.c.b;
        if (a09Var != null) {
            int iL = zxg.L(a09Var.a, a09Var.b);
            i = iL != 0 ? iL != 1 ? iL != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (q9gVar.m != -9223372036854775807L && !q9gVar.k && !q9gVar.i && !q9gVar.a()) {
            builder.setMediaDurationMillis(zxg.m0(q9gVar.m));
        }
        builder.setPlaybackType(q9gVar.a() ? 2 : 1);
        this.L0 = true;
    }

    @Override // defpackage.jd
    public final void c0(id idVar, g19 g19Var) {
        d99 d99Var = idVar.d;
        if (d99Var == null) {
            return;
        }
        hf6 hf6Var = (hf6) g19Var.g;
        hf6Var.getClass();
        int i = g19Var.c;
        s9g s9gVar = idVar.b;
        d99Var.getClass();
        lk6 lk6Var = new lk6(hf6Var, i, this.c.c(s9gVar, d99Var), 17);
        int i2 = g19Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                this.A0 = lk6Var;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.B0 = lk6Var;
                return;
            }
        }
        this.z0 = lk6Var;
    }

    public final void d(id idVar, String str) {
        d99 d99Var = idVar.d;
        if ((d99Var == null || !d99Var.b()) && str.equals(this.t0)) {
            b();
        }
        this.Z.remove(str);
        this.s0.remove(str);
    }

    @Override // defpackage.jd
    public final void d0(id idVar, ub8 ub8Var, g19 g19Var, IOException iOException, boolean z) {
        this.G0 = g19Var.a;
    }

    public final void e(int i, long j, hf6 hf6Var, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = z19.j(i).setTimeSinceCreatedMillis(j - this.o);
        if (hf6Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = hf6Var.m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = hf6Var.n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = hf6Var.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = hf6Var.j;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = hf6Var.u;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = hf6Var.v;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = hf6Var.F;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = hf6Var.G;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = hf6Var.d;
            if (str4 != null) {
                String str5 = zxg.a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = hf6Var.y;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.L0 = true;
        this.b.execute(new qz5(this, 25, timeSinceCreatedMillis.build()));
    }

    @Override // defpackage.jd
    public final void v0(id idVar, PlaybackException playbackException) {
        this.y0 = playbackException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:251:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04a9  */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [lk6] */
    /* JADX WARN: Type inference failed for: r9v16 */
    @Override // defpackage.jd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(defpackage.u3c r22, defpackage.s7c r23) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a29.x(u3c, s7c):void");
    }

    @Override // defpackage.jd
    public final void z0(id idVar, int i, long j, long j2) {
        d99 d99Var = idVar.d;
        if (d99Var != null) {
            String strC = this.c.c(idVar.b, d99Var);
            HashMap map = this.s0;
            Long l = (Long) map.get(strC);
            HashMap map2 = this.Z;
            Long l2 = (Long) map2.get(strC);
            map.put(strC, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strC, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }
}
