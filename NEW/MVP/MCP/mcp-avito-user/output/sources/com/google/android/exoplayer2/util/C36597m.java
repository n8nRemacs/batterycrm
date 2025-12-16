package com.google.android.exoplayer2.util;

import android.os.SystemClock;
import android.text.TextUtils;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.C36557u;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.t0;
import com.google.common.collect.AbstractC37401r1;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;

/* compiled from: EventLogger.java */
/* renamed from: com.google.android.exoplayer2.util.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36597m implements com.google.android.exoplayer2.analytics.b {

    /* renamed from: e, reason: collision with root package name */
    public static final NumberFormat f348137e;

    /* renamed from: b, reason: collision with root package name */
    public final s0.d f348138b = new s0.d();

    /* renamed from: c, reason: collision with root package name */
    public final s0.b f348139c = new s0.b();

    /* renamed from: d, reason: collision with root package name */
    public final long f348140d = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f348137e = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public static String c(long j12) {
        if (j12 == -9223372036854775807L) {
            return "?";
        }
        return f348137e.format(j12 / 1000.0f);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void Bg(b.C10568b c10568b, Metadata metadata) {
        b(c10568b);
        int i12 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f345623b;
            if (i12 >= entryArr.length) {
                return;
            }
            Objects.toString(entryArr[i12]);
            i12++;
        }
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void CC(b.C10568b c10568b) {
        a(c10568b, "drmKeysLoaded", null, null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void Dh(b.C10568b c10568b, com.google.android.exoplayer2.I i12) {
        a(c10568b, "videoInputFormat", com.google.android.exoplayer2.I.d(i12), null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void FA(b.C10568b c10568b, c0 c0Var) {
        a(c10568b, "playbackParameters", c0Var.toString(), null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void Ff(b.C10568b c10568b) {
        a(c10568b, "drmKeysRestored", null, null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void Gs(b.C10568b c10568b, int i12) {
        a(c10568b, "drmSessionAcquired", AK.c.g(i12, "state="), null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void JW(b.C10568b c10568b, String str) {
        a(c10568b, "videoDecoderInitialized", str, null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void Kx(b.C10568b c10568b, t0 t0Var) {
        Metadata metadata;
        b(c10568b);
        AbstractC37401r1<t0.a> abstractC37401r1A = t0Var.a();
        for (int i12 = 0; i12 < abstractC37401r1A.size(); i12++) {
            t0.a aVar = abstractC37401r1A.get(i12);
            for (int i13 = 0; i13 < aVar.f346710b; i13++) {
                aVar.b(i13);
                U.t(aVar.f346713e[i13]);
                com.google.android.exoplayer2.I.d(aVar.a(i13));
            }
        }
        boolean z12 = false;
        for (int i14 = 0; !z12 && i14 < abstractC37401r1A.size(); i14++) {
            t0.a aVar2 = abstractC37401r1A.get(i14);
            for (int i15 = 0; !z12 && i15 < aVar2.f346710b; i15++) {
                if (aVar2.b(i15) && (metadata = aVar2.a(i15).f343474k) != null && metadata.f345623b.length > 0) {
                    int i16 = 0;
                    while (true) {
                        Metadata.Entry[] entryArr = metadata.f345623b;
                        if (i16 >= entryArr.length) {
                            break;
                        }
                        Objects.toString(entryArr[i16]);
                        i16++;
                    }
                    z12 = true;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void OX(b.C10568b c10568b, int i12, int i13) {
        a(c10568b, "surfaceSize", i12 + ", " + i13, null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void Om(b.C10568b c10568b) {
        b(c10568b);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void QK(b.C10568b c10568b, boolean z12) {
        a(c10568b, "shuffleModeEnabled", Boolean.toString(z12), null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void TD(b.C10568b c10568b, String str) {
        a(c10568b, "audioDecoderReleased", str, null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void TF(b.C10568b c10568b, boolean z12) {
        a(c10568b, "loading", Boolean.toString(z12), null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void TG(b.C10568b c10568b) {
        a(c10568b, "audioDisabled", null, null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void TO(b.C10568b c10568b) {
        a(c10568b, "drmSessionReleased", null, null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void TU(b.C10568b c10568b, String str) {
        a(c10568b, "videoDecoderReleased", str, null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void UC(b.C10568b c10568b, float f12) {
        a(c10568b, "volume", Float.toString(f12), null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void WB(b.C10568b c10568b, int i12) {
        a(c10568b, "repeatMode", i12 != 0 ? i12 != 1 ? i12 != 2 ? "?" : "ALL" : "ONE" : "OFF", null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void Xi(b.C10568b c10568b, int i12, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z12);
        sb2.append(", ");
        sb2.append(i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? i12 != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST");
        a(c10568b, "playWhenReady", sb2.toString(), null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void YO(b.C10568b c10568b, int i12, long j12, long j13) {
        a(c10568b, "audioTrackUnderrun", i12 + ", " + j12 + ", " + j13, null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void ZT(b.C10568b c10568b, int i12) {
        a(c10568b, "droppedFrames", Integer.toString(i12), null);
    }

    public final void a(b.C10568b c10568b, String str, @j.P String str2, @j.P Exception exc) {
        StringBuilder sbZ = androidx.appcompat.app.r.z(str, " [");
        sbZ.append(b(c10568b));
        String string = sbZ.toString();
        if (exc instanceof PlaybackException) {
            StringBuilder sbZ2 = androidx.appcompat.app.r.z(string, ", errorCode=");
            sbZ2.append(((PlaybackException) exc).a());
            string = sbZ2.toString();
        }
        if (str2 != null) {
            string = androidx.appcompat.app.r.r(string, ", ", str2);
        }
        String strB = C36605v.b(exc);
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        StringBuilder sbZ3 = androidx.appcompat.app.r.z(string, "\n  ");
        sbZ3.append(strB.replace("\n", "\n  "));
        sbZ3.append('\n');
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void aP(b.C10568b c10568b) {
        a(c10568b, "audioEnabled", null, null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void at(b.C10568b c10568b, Exception exc) {
        a(c10568b, "internalError", "drmSessionManagerError", exc);
    }

    public final String b(b.C10568b c10568b) {
        String string = "window=" + c10568b.f343745c;
        y.b bVar = c10568b.f343746d;
        if (bVar != null) {
            StringBuilder sbZ = androidx.appcompat.app.r.z(string, ", period=");
            sbZ.append(c10568b.f343744b.b(bVar.f346696a));
            string = sbZ.toString();
            if (bVar.a()) {
                StringBuilder sbZ2 = androidx.appcompat.app.r.z(string, ", adGroup=");
                sbZ2.append(bVar.f346697b);
                StringBuilder sbZ3 = androidx.appcompat.app.r.z(sbZ2.toString(), ", ad=");
                sbZ3.append(bVar.f346698c);
                string = sbZ3.toString();
            }
        }
        return "eventTime=" + c(c10568b.f343743a - this.f348140d) + ", mediaPos=" + c(c10568b.f343747e) + ", " + string;
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void ch(b.C10568b c10568b, int i12) {
        a(c10568b, VoiceInfo.STATE, i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE", null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void fI(b.C10568b c10568b, int i12) {
        a(c10568b, "playbackSuppressionReason", i12 != 0 ? i12 != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE", null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void fl(b.C10568b c10568b) {
        a(c10568b, "videoEnabled", null, null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void hp(b.C10568b c10568b, C36557u c36557u) {
        a(c10568b, "upstreamDiscarded", com.google.android.exoplayer2.I.d(c36557u.f346690c), null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void jC(b.C10568b c10568b, com.google.android.exoplayer2.video.o oVar) {
        a(c10568b, "videoSize", oVar.f348321b + ", " + oVar.f348322c, null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void jp(b.C10568b c10568b, d0.k kVar, d0.k kVar2, int i12) {
        StringBuilder sb2 = new StringBuilder("reason=");
        sb2.append(i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? i12 != 5 ? "?" : "INTERNAL" : "REMOVE" : "SKIP" : "SEEK_ADJUSTMENT" : "SEEK" : "AUTO_TRANSITION");
        sb2.append(", PositionInfo:old [mediaItem=");
        sb2.append(kVar.f344195c);
        sb2.append(", period=");
        sb2.append(kVar.f344198f);
        sb2.append(", pos=");
        sb2.append(kVar.f344199g);
        int i13 = kVar.f344201i;
        if (i13 != -1) {
            sb2.append(", contentPos=");
            sb2.append(kVar.f344200h);
            sb2.append(", adGroup=");
            sb2.append(i13);
            sb2.append(", ad=");
            sb2.append(kVar.f344202j);
        }
        sb2.append("], PositionInfo:new [mediaItem=");
        sb2.append(kVar2.f344195c);
        sb2.append(", period=");
        sb2.append(kVar2.f344198f);
        sb2.append(", pos=");
        sb2.append(kVar2.f344199g);
        int i14 = kVar2.f344201i;
        if (i14 != -1) {
            sb2.append(", contentPos=");
            sb2.append(kVar2.f344200h);
            sb2.append(", adGroup=");
            sb2.append(i14);
            sb2.append(", ad=");
            sb2.append(kVar2.f344202j);
        }
        sb2.append("]");
        a(c10568b, "positionDiscontinuity", sb2.toString(), null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void kR(b.C10568b c10568b, boolean z12) {
        a(c10568b, "isPlaying", Boolean.toString(z12), null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void mC(b.C10568b c10568b) {
        s0 s0Var = c10568b.f343744b;
        int iH2 = s0Var.h();
        int iO2 = s0Var.o();
        b(c10568b);
        for (int i12 = 0; i12 < Math.min(iH2, 3); i12++) {
            s0.b bVar = this.f348139c;
            s0Var.f(i12, bVar, false);
            c(U.R(bVar.f345873e));
        }
        for (int i13 = 0; i13 < Math.min(iO2, 3); i13++) {
            s0.d dVar = this.f348138b;
            s0Var.n(i13, dVar);
            c(U.R(dVar.f345893o));
        }
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void mo(b.C10568b c10568b, Object obj) {
        a(c10568b, "renderedFirstFrame", String.valueOf(obj), null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void mt(b.C10568b c10568b, C36557u c36557u, IOException iOException) {
        a(c10568b, "internalError", "loadError", iOException);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void nR(b.C10568b c10568b, C36557u c36557u) {
        a(c10568b, "downstreamFormat", com.google.android.exoplayer2.I.d(c36557u.f346690c), null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void o40(b.C10568b c10568b, com.google.android.exoplayer2.I i12) {
        a(c10568b, "audioInputFormat", com.google.android.exoplayer2.I.d(i12), null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void qi(b.C10568b c10568b, boolean z12) {
        a(c10568b, "skipSilenceEnabled", Boolean.toString(z12), null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void tN(b.C10568b c10568b, com.google.android.exoplayer2.decoder.f fVar) {
        a(c10568b, "videoDisabled", null, null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void th(b.C10568b c10568b, String str) {
        a(c10568b, "audioDecoderInitialized", str, null);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void wO(b.C10568b c10568b, PlaybackException playbackException) {
        a(c10568b, "playerFailed", null, playbackException);
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void Uz(int i12, long j12, b.C10568b c10568b) {
    }
}
