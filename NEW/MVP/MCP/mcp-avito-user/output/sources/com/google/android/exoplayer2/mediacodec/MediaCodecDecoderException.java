package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.util.U;
import j.P;

/* loaded from: classes6.dex */
public class MediaCodecDecoderException extends DecoderException {

    /* renamed from: b, reason: collision with root package name */
    @P
    public final String f345468b;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, @P m mVar) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb2.append(mVar == null ? null : mVar.f345608a);
        super(sb2.toString(), illegalStateException);
        if (U.f348106a >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f345468b = diagnosticInfo;
    }
}
