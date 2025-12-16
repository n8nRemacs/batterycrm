package defpackage;

import android.graphics.Path;
import android.media.MediaCodec;
import java.io.IOException;

/* loaded from: classes.dex */
public final class dwf implements hw8, rl3 {
    public static MediaCodec a(gw8 gw8Var) throws IOException {
        gw8Var.a.getClass();
        String str = gw8Var.a.a;
        String strValueOf = String.valueOf(str);
        lfi.a(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        lfi.c();
        return mediaCodecCreateByCodecName;
    }

    public static Path b(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    @Override // defpackage.rl3
    public Object j(v6d v6dVar) {
        v6dVar.c(p1a.class);
        return new sj5();
    }

    @Override // defpackage.hw8
    public jw8 o(gw8 gw8Var) {
        MediaCodec mediaCodecA = null;
        try {
            mediaCodecA = a(gw8Var);
            lfi.a("configureCodec");
            mediaCodecA.configure(gw8Var.b, gw8Var.d, gw8Var.e, 0);
            lfi.c();
            lfi.a("startCodec");
            mediaCodecA.start();
            lfi.c();
            return new hc8(mediaCodecA);
        } catch (IOException | RuntimeException e) {
            if (mediaCodecA != null) {
                mediaCodecA.release();
            }
            throw e;
        }
    }
}
