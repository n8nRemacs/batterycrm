package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import defpackage.pw8;

/* loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {
    public final pw8 a;
    public final int b;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, pw8 pw8Var) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(pw8Var == null ? null : pw8Var.a);
        super(sb.toString(), illegalStateException);
        this.a = pw8Var;
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.b = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
