package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public final class dp0 {
    public static final hl4 c = new hl4("StreamingFormatChecker", "", 1);
    public final LinkedList a = new LinkedList();
    public long b = -1;

    public final void a(nm7 nm7Var) {
        if (nm7Var.f != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long lValueOf = Long.valueOf(jElapsedRealtime);
        LinkedList linkedList = this.a;
        linkedList.add(lValueOf);
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (linkedList.size() == 5) {
            Long l = (Long) linkedList.peekFirst();
            s5j.g(l);
            if (jElapsedRealtime - l.longValue() < MultiFileUploader.UPLOAD_NEXT_INTERVAL) {
                long j = this.b;
                if (j == -1 || jElapsedRealtime - j >= TimeUnit.SECONDS.toMillis(5L)) {
                    this.b = jElapsedRealtime;
                    hl4 hl4Var = c;
                    if (Log.isLoggable(hl4Var.b, 5)) {
                        Log.w("StreamingFormatChecker", hl4Var.b("ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit."));
                    }
                }
            }
        }
    }
}
