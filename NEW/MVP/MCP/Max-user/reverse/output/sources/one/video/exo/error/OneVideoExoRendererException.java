package one.video.exo.error;

import android.media.MediaCodecInfo;
import defpackage.if6;
import defpackage.pw8;
import defpackage.xy8;
import kotlin.Metadata;
import one.video.player.error.OneVideoRendererException;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/video/exo/error/OneVideoExoRendererException;", "Lone/video/player/error/OneVideoRendererException;", "one-video-player-exo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OneVideoExoRendererException extends OneVideoRendererException {
    public final String a;
    public final xy8 b;
    public final if6 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OneVideoExoRendererException(androidx.media3.exoplayer.ExoPlaybackException r6) {
        /*
            r5 = this;
            hf6 r0 = r6.w0
            int r1 = r6.t0
            r2 = 1
            if (r1 != r2) goto L9
            r3 = r2
            goto La
        L9:
            r3 = 0
        La:
            defpackage.hsi.g(r3)
            java.lang.Throwable r3 = r6.getCause()
            r3.getClass()
            java.lang.Exception r3 = (java.lang.Exception) r3
            r5.<init>(r3)
            java.lang.String r3 = r6.u0
            r5.a = r3
            r4 = 0
            if (r1 != r2) goto L6e
            if (r3 == 0) goto L6e
            int r1 = r3.hashCode()
            r2 = -1782852404(0xffffffff95bbd4cc, float:-7.586443E-26)
            if (r1 == r2) goto L5e
            r2 = -598752976(0xffffffffdc4fc130, float:-2.3391093E17)
            if (r1 == r2) goto L46
            r2 = 846582055(0x3275d127, float:1.4308433E-8)
            if (r1 == r2) goto L36
            goto L6e
        L36:
            java.lang.String r1 = "MediaCodecAudioRenderer"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3f
            goto L6e
        L3f:
            if (r0 == 0) goto L6e
            u30 r0 = defpackage.rui.a(r0)
            goto L6f
        L46:
            java.lang.String r1 = "TextRenderer"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L4f
            goto L6e
        L4f:
            if (r0 == 0) goto L6e
            java.lang.String r1 = r0.a
            java.lang.String r2 = r0.n
            java.lang.String r0 = r0.d
            f4g r3 = new f4g
            r3.<init>(r1, r2, r0)
            r0 = r3
            goto L6f
        L5e:
            java.lang.String r1 = "MediaCodecVideoRenderer"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L67
            goto L6e
        L67:
            if (r0 == 0) goto L6e
            v3h r0 = defpackage.rui.b(r0)
            goto L6f
        L6e:
            r0 = r4
        L6f:
            r5.b = r0
            vsb r0 = defpackage.jf6.a
            int r6 = r6.x0
            vsb r0 = defpackage.jf6.a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r6 = r0.get(r6)
            if6 r6 = (defpackage.if6) r6
            if (r6 != 0) goto L85
            if6 r6 = defpackage.if6.X
        L85:
            r5.c = r6
            java.lang.Throwable r6 = r5.getCause()
            boolean r6 = r6 instanceof androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException
            r5.getCause()
            java.lang.Throwable r0 = r5.getCause()
            boolean r0 = r0 instanceof androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException
            if (r6 == 0) goto Lab
            java.lang.Throwable r6 = r5.getCause()
            boolean r0 = r6 instanceof androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException
            if (r0 == 0) goto La3
            r4 = r6
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException r4 = (androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException) r4
        La3:
            if (r4 == 0) goto Lbf
            pw8 r6 = r4.c
            a(r6)
            return
        Lab:
            if (r0 == 0) goto Lbf
            java.lang.Throwable r6 = r5.getCause()
            boolean r0 = r6 instanceof androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException
            if (r0 == 0) goto Lb8
            r4 = r6
            androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException r4 = (androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException) r4
        Lb8:
            if (r4 == 0) goto Lbf
            pw8 r6 = r4.a
            a(r6)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.video.exo.error.OneVideoExoRendererException.<init>(androidx.media3.exoplayer.ExoPlaybackException):void");
    }

    public static void a(pw8 pw8Var) {
        if (pw8Var == null) {
            return;
        }
        Boolean.compare(pw8Var.h, false);
        Boolean.compare(pw8Var.e, false);
        Boolean.compare(pw8Var.f(), false);
        MediaCodecInfo.CodecCapabilities codecCapabilities = pw8Var.d;
        if (codecCapabilities != null) {
            codecCapabilities.getMaxSupportedInstances();
        }
        Boolean.compare(pw8Var.g, false);
        Boolean.compare(pw8Var.i, false);
        Boolean.compare(pw8Var.j, false);
        Boolean.compare(pw8Var.f, false);
    }
}
