package androidx.media3.exoplayer.mediacodec;

import defpackage.hf6;
import defpackage.pw8;

/* loaded from: classes.dex */
public class MediaCodecRenderer$DecoderInitializationException extends Exception {
    public final String a;
    public final boolean b;
    public final pw8 c;
    public final String d;

    public MediaCodecRenderer$DecoderInitializationException(hf6 hf6Var, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + hf6Var, mediaCodecUtil$DecoderQueryException, hf6Var.n, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th, String str2, boolean z, pw8 pw8Var, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = pw8Var;
        this.d = str3;
    }
}
