package androidx.media3.transformer;

import android.os.SystemClock;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import defpackage.az1;
import defpackage.fg7;
import defpackage.i21;
import defpackage.yjd;

/* loaded from: classes.dex */
public final class ExportException extends Exception {
    public static final yjd b;
    public final int a;

    static {
        fg7 fg7Var = new fg7(4);
        fg7Var.d0("ERROR_CODE_FAILED_RUNTIME_CHECK", 1001);
        fg7Var.d0("ERROR_CODE_IO_UNSPECIFIED", 2000);
        fg7Var.d0("ERROR_CODE_IO_NETWORK_CONNECTION_FAILED", 2001);
        fg7Var.d0("ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT", 2002);
        fg7Var.d0("ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE", 2003);
        fg7Var.d0("ERROR_CODE_IO_BAD_HTTP_STATUS", 2004);
        fg7Var.d0("ERROR_CODE_IO_FILE_NOT_FOUND", 2005);
        fg7Var.d0("ERROR_CODE_IO_NO_PERMISSION", 2006);
        fg7Var.d0("ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED", 2007);
        fg7Var.d0("ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE", 2008);
        fg7Var.d0("ERROR_CODE_DECODER_INIT_FAILED", 3001);
        fg7Var.d0("ERROR_CODE_DECODING_FAILED", 3002);
        fg7Var.d0("ERROR_CODE_DECODING_FORMAT_UNSUPPORTED", 3003);
        fg7Var.d0("ERROR_CODE_ENCODER_INIT_FAILED", 4001);
        fg7Var.d0("ERROR_CODE_ENCODING_FAILED", 4002);
        fg7Var.d0("ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED", 4003);
        fg7Var.d0("ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED", 5001);
        fg7Var.d0("ERROR_CODE_AUDIO_PROCESSING_FAILED", 6001);
        fg7Var.d0("ERROR_CODE_MUXING_FAILED", 7001);
        fg7Var.d0("ERROR_CODE_MUXING_TIMEOUT", 7002);
        fg7Var.d0("ERROR_CODE_MUXING_APPEND", 7003);
        b = fg7Var.u();
    }

    public ExportException(String str, Throwable th, int i, int i2) {
        super(str, th);
        this.a = i;
        SystemClock.elapsedRealtime();
    }

    public static ExportException a(int i, Throwable th) {
        return new ExportException("Asset loader error", th, i, 0);
    }

    public static ExportException b(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, String str) {
        StringBuilder sbN = az1.n("Audio error: ", str, ", audioFormat=");
        sbN.append(audioProcessor$UnhandledAudioFormatException.a);
        return new ExportException(sbN.toString(), audioProcessor$UnhandledAudioFormatException, 6001, 0);
    }

    public static ExportException c(Exception exc, int i, i21 i21Var) {
        return new ExportException("Codec exception: " + i21Var, exc, i, 0);
    }

    public static ExportException d(RuntimeException runtimeException) {
        return new ExportException("Unexpected runtime error", runtimeException, 1001, 0);
    }
}
