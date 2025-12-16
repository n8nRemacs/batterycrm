package SZ0;

import android.os.SystemClock;
import com.google.android.gms.common.internal.C36713l;
import com.google.android.gms.common.internal.C36729v;
import j.N;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
@RX0.a
/* loaded from: classes6.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final C36713l f15069c = new C36713l("StreamingFormatChecker", "");

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f15070a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public long f15071b = -1;

    @RX0.a
    public final void a(@N com.google.mlkit.vision.common.a aVar) {
        if (aVar.f362449g != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LinkedList linkedList = this.f15070a;
        linkedList.add(Long.valueOf(jElapsedRealtime));
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (linkedList.size() == 5) {
            Long l12 = (Long) linkedList.peekFirst();
            C36729v.j(l12);
            if (jElapsedRealtime - l12.longValue() < 5000) {
                long j12 = this.f15071b;
                if (j12 == -1 || jElapsedRealtime - j12 >= TimeUnit.SECONDS.toMillis(5L)) {
                    this.f15071b = jElapsedRealtime;
                    f15069c.c("ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                }
            }
        }
    }
}
