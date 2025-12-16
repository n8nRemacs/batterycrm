package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.google.android.exoplayer2.decoder.DecoderException;
import defpackage.ow8;
import defpackage.xxg;

/* loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {
    /* JADX WARN: Illegal instructions before constructor call */
    public MediaCodecDecoderException(IllegalStateException illegalStateException, ow8 ow8Var) {
        String strValueOf = String.valueOf(ow8Var == null ? null : ow8Var.a);
        super(strValueOf.length() != 0 ? "Decoder failed: ".concat(strValueOf) : new String("Decoder failed: "), illegalStateException);
        if (xxg.a < 21 || !(illegalStateException instanceof MediaCodec.CodecException)) {
            return;
        }
        ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
    }
}
