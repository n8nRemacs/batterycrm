package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ei5 implements jd {
    public static final NumberFormat d;
    public final q9g a = new q9g();
    public final m9g b = new m9g();
    public final long c = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        d = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public static String a(x50 x50Var) {
        return x50Var.a + "," + x50Var.c + "," + x50Var.b + "," + x50Var.d + "," + x50Var.e + "," + x50Var.f;
    }

    public static String d(long j) {
        if (j == -9223372036854775807L) {
            return "?";
        }
        return d.format(j / 1000.0f);
    }

    @Override // defpackage.jd
    public final void B(id idVar, boolean z) {
        f(idVar, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // defpackage.jd
    public final void D(id idVar, c3c c3cVar) {
        f(idVar, "playbackParameters", c3cVar.toString());
    }

    @Override // defpackage.jd
    public final void E(id idVar, String str) {
        f(idVar, "audioDecoderInitialized", str);
    }

    @Override // defpackage.jd
    public final void F(id idVar, ty9 ty9Var) {
        g("metadata [" + c(idVar));
        h(ty9Var, "  ");
        g("]");
    }

    @Override // defpackage.jd
    public final void G(id idVar, int i) {
        f(idVar, "state", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE");
    }

    @Override // defpackage.jd
    public final void H0(int i, id idVar, t3c t3cVar, t3c t3cVar2) {
        String str;
        StringBuilder sb = new StringBuilder("reason=");
        switch (i) {
            case 0:
                str = "AUTO_TRANSITION";
                break;
            case 1:
                str = "SEEK";
                break;
            case 2:
                str = "SEEK_ADJUSTMENT";
                break;
            case 3:
                str = "SKIP";
                break;
            case 4:
                str = "REMOVE";
                break;
            case 5:
                str = "INTERNAL";
                break;
            case 6:
                str = "SILENCE_SKIP";
                break;
            default:
                str = "?";
                break;
        }
        sb.append(str);
        sb.append(", PositionInfo:old [");
        sb.append(t3cVar);
        sb.append("], PositionInfo:new [");
        sb.append(t3cVar2);
        sb.append("]");
        f(idVar, "positionDiscontinuity", sb.toString());
    }

    @Override // defpackage.jd
    public final void I(id idVar, long j) {
        f(idVar, "audioPositionAdvancing", "since " + d((SystemClock.elapsedRealtime() + (j - System.currentTimeMillis())) - this.c));
    }

    @Override // defpackage.jd
    public final void J(id idVar, int i) {
        f(idVar, "droppedFrames", Integer.toString(i));
    }

    @Override // defpackage.jd
    public final void J0(id idVar) {
        e(idVar, "drmSessionReleased");
    }

    @Override // defpackage.jd
    public final void K0(id idVar, String str) {
        f(idVar, "videoDecoderInitialized", str);
    }

    @Override // defpackage.jd
    public final void L(id idVar, hf6 hf6Var) {
        f(idVar, "audioInputFormat", hf6.d(hf6Var));
    }

    @Override // defpackage.jd
    public final void M(id idVar, int i, int i2) {
        f(idVar, "surfaceSize", ho7.g("w=", i, i2, ", h="));
    }

    @Override // defpackage.jd
    public final void M0(id idVar, boolean z) {
        f(idVar, "loading", Boolean.toString(z));
    }

    @Override // defpackage.jd
    public final void N(id idVar, nh4 nh4Var) {
        e(idVar, "videoDisabled");
    }

    @Override // defpackage.jd
    public final void N0(id idVar, boolean z, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(", ");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST");
        f(idVar, "playWhenReady", sb.toString());
    }

    @Override // defpackage.jd
    public final void P(id idVar, int i) {
        f(idVar, "repeatMode", i != 0 ? i != 1 ? i != 2 ? "?" : "ALL" : "ONE" : "OFF");
    }

    @Override // defpackage.jd
    public final void P0(id idVar, kgg kggVar) {
        ty9 ty9Var;
        g("tracks [" + c(idVar));
        wg7 wg7Var = kggVar.a;
        for (int i = 0; i < wg7Var.size(); i++) {
            jgg jggVar = (jgg) wg7Var.get(i);
            g("  group [ id=" + jggVar.b.b);
            for (int i2 = 0; i2 < jggVar.a; i2++) {
                String str = jggVar.e[i2] ? "[X]" : "[ ]";
                String strC = zxg.C(jggVar.d[i2]);
                StringBuilder sbM = utb.m(i2, "    ", str, " Track:", ", ");
                sbM.append(hf6.d(jggVar.b.d[i2]));
                sbM.append(", supported=");
                sbM.append(strC);
                g(sbM.toString());
            }
            g("  ]");
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < wg7Var.size(); i3++) {
            jgg jggVar2 = (jgg) wg7Var.get(i3);
            for (int i4 = 0; !z && i4 < jggVar2.a; i4++) {
                if (jggVar2.e[i4] && (ty9Var = jggVar2.b.d[i4].l) != null && ty9Var.a.length > 0) {
                    g("  Metadata [");
                    h(ty9Var, "    ");
                    g("  ]");
                    z = true;
                }
            }
        }
        g("]");
    }

    @Override // defpackage.jd
    public final void Q0(id idVar, Exception exc) {
        a8i.g("OneMeMediaSessionService", b(idVar, "internalError", "drmSessionManagerError", exc));
    }

    @Override // defpackage.jd
    public final void R0(id idVar, int i) {
        f(idVar, "playbackSuppressionReason", i != 0 ? i != 1 ? i != 3 ? i != 4 ? "?" : "SCRUBBING" : "UNSUITABLE_AUDIO_OUTPUT" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE");
    }

    @Override // defpackage.jd
    public final void S(id idVar, k20 k20Var) {
        f(idVar, "audioAttributes", k20Var.a + "," + k20Var.b + "," + k20Var.c + "," + k20Var.d);
    }

    @Override // defpackage.jd
    public final void S0(id idVar) {
        e(idVar, "drmKeysRestored");
    }

    @Override // defpackage.jd
    public final void T0(id idVar, g19 g19Var) {
        f(idVar, "upstreamDiscarded", hf6.d((hf6) g19Var.g));
    }

    @Override // defpackage.jd
    public final void U(id idVar, x50 x50Var) {
        f(idVar, "audioTrackInit", a(x50Var));
    }

    @Override // defpackage.jd
    public final void V(id idVar) {
        e(idVar, "videoEnabled");
    }

    @Override // defpackage.jd
    public final void Y(id idVar, sch schVar) {
        StringBuilder sb = new StringBuilder("w=" + schVar.a + ", h=" + schVar.b);
        float f = schVar.c;
        if (f != 1.0f) {
            sb.append(", par=");
            sb.append(f);
        }
        f(idVar, "videoSize", sb.toString());
    }

    @Override // defpackage.jd
    public final void Z(id idVar, int i) {
        s9g s9gVar = idVar.b;
        int iH = s9gVar.h();
        int iO = s9gVar.o();
        StringBuilder sb = new StringBuilder("timeline [");
        sb.append(c(idVar));
        sb.append(", periodCount=");
        sb.append(iH);
        sb.append(", windowCount=");
        sb.append(iO);
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED");
        g(sb.toString());
        for (int i2 = 0; i2 < Math.min(iH, 3); i2++) {
            m9g m9gVar = this.b;
            s9gVar.f(i2, m9gVar, false);
            g("  period [" + d(zxg.m0(m9gVar.d)) + "]");
        }
        if (iH > 3) {
            g("  ...");
        }
        for (int i3 = 0; i3 < Math.min(iO, 3); i3++) {
            q9g q9gVar = this.a;
            s9gVar.n(i3, q9gVar);
            g("  window [" + d(zxg.m0(q9gVar.m)) + ", seekable=" + q9gVar.h + ", dynamic=" + q9gVar.i + "]");
        }
        if (iO > 3) {
            g("  ...");
        }
        g("]");
    }

    public final String b(id idVar, String str, String str2, Throwable th) {
        StringBuilder sbO = ho7.o(str, " [");
        sbO.append(c(idVar));
        String string = sbO.toString();
        if (th instanceof PlaybackException) {
            StringBuilder sbO2 = ho7.o(string, ", errorCode=");
            sbO2.append(((PlaybackException) th).b());
            string = sbO2.toString();
        }
        if (str2 != null) {
            string = u45.k(string, ", ", str2);
        }
        String strI = a8i.i(th);
        if (!TextUtils.isEmpty(strI)) {
            StringBuilder sbO3 = ho7.o(string, "\n  ");
            sbO3.append(strI.replace("\n", "\n  "));
            sbO3.append('\n');
            string = sbO3.toString();
        }
        return az1.i(string, "]");
    }

    @Override // defpackage.jd
    public final void b0(id idVar, hf6 hf6Var) {
        f(idVar, "videoInputFormat", hf6.d(hf6Var));
    }

    public final String c(id idVar) {
        String string = "window=" + idVar.c;
        d99 d99Var = idVar.d;
        if (d99Var != null) {
            StringBuilder sbO = ho7.o(string, ", period=");
            sbO.append(idVar.b.b(d99Var.a));
            string = sbO.toString();
            if (d99Var.b()) {
                StringBuilder sbO2 = ho7.o(string, ", adGroup=");
                sbO2.append(d99Var.b);
                StringBuilder sbO3 = ho7.o(sbO2.toString(), ", ad=");
                sbO3.append(d99Var.c);
                string = sbO3.toString();
            }
        }
        return "eventTime=" + d(idVar.a - this.c) + ", mediaPos=" + d(idVar.e) + ", " + string;
    }

    @Override // defpackage.jd
    public final void c0(id idVar, g19 g19Var) {
        f(idVar, "downstreamFormat", hf6.d((hf6) g19Var.g));
    }

    @Override // defpackage.jd
    public final void d0(id idVar, ub8 ub8Var, g19 g19Var, IOException iOException, boolean z) {
        a8i.g("OneMeMediaSessionService", b(idVar, "internalError", "loadError", iOException));
    }

    public final void e(id idVar, String str) {
        g(b(idVar, str, null, null));
    }

    public final void f(id idVar, String str, String str2) {
        g(b(idVar, str, str2, null));
    }

    public final void g(String str) {
        a8i.e("OneMeMediaSessionService", str);
    }

    @Override // defpackage.jd
    public final void g0(id idVar, int i) {
        StringBuilder sb = new StringBuilder("mediaItem [");
        sb.append(c(idVar));
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT");
        sb.append("]");
        g(sb.toString());
    }

    public final void h(ty9 ty9Var, String str) {
        for (int i = 0; i < ty9Var.a.length; i++) {
            StringBuilder sbM = az1.m(str);
            sbM.append(ty9Var.a[i]);
            g(sbM.toString());
        }
    }

    @Override // defpackage.jd
    public final void m0(id idVar, Object obj, long j) {
        f(idVar, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // defpackage.jd
    public final void o0(id idVar, String str) {
        f(idVar, "videoDecoderReleased", str);
    }

    @Override // defpackage.jd
    public final void p0(id idVar, x50 x50Var) {
        f(idVar, "audioTrackReleased", a(x50Var));
    }

    @Override // defpackage.jd
    public final void q0(id idVar, int i, int i2, boolean z) {
        StringBuilder sbM = ho7.m(i, "rendererIndex=", ", ");
        sbM.append(zxg.I(i2));
        sbM.append(", ");
        sbM.append(z);
        f(idVar, "rendererReady", sbM.toString());
    }

    @Override // defpackage.jd
    public final void r0(id idVar) {
        e(idVar, "audioEnabled");
    }

    @Override // defpackage.jd
    public final void s0(id idVar, int i) {
        f(idVar, "drmSessionAcquired", "state=" + i);
    }

    @Override // defpackage.jd
    public final void t0(id idVar, int i) {
        f(idVar, "audioSessionId", Integer.toString(i));
    }

    @Override // defpackage.jd
    public final void u(id idVar, boolean z) {
        f(idVar, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // defpackage.jd
    public final void u0(id idVar) {
        e(idVar, "audioDisabled");
    }

    @Override // defpackage.jd
    public final void v(id idVar) {
        e(idVar, "drmKeysLoaded");
    }

    @Override // defpackage.jd
    public final void v0(id idVar, PlaybackException playbackException) {
        a8i.g("OneMeMediaSessionService", b(idVar, "playerFailed", null, playbackException));
    }

    @Override // defpackage.jd
    public final void w(id idVar, boolean z) {
        f(idVar, "isPlaying", Boolean.toString(z));
    }

    @Override // defpackage.jd
    public final void w0(id idVar, float f) {
        f(idVar, "volume", Float.toString(f));
    }

    @Override // defpackage.jd
    public final void x0(id idVar, int i, long j, long j2) {
        a8i.g("OneMeMediaSessionService", b(idVar, "audioTrackUnderrun", i + ", " + j + ", " + j2, null));
    }

    @Override // defpackage.jd
    public final void z(id idVar, String str) {
        f(idVar, "audioDecoderReleased", str);
    }
}
