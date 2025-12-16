package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.decoder.DecoderException;
import j.P;

@J
/* loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {

    /* renamed from: b, reason: collision with root package name */
    @P
    public final String f49244b;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, @P n nVar) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb2.append(nVar == null ? null : nVar.f49386a);
        super(sb2.toString(), illegalStateException);
        if (M.f47887a >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f49244b = diagnosticInfo;
    }
}
