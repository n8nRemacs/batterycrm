package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WakeLocks.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@X41.i
/* loaded from: classes10.dex */
public final class J {
    static {
        androidx.work.G.b("WakeLocks");
    }

    public static final void a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (K.f55947a) {
            linkedHashMap.putAll(K.f55948b);
            G0 g02 = G0.f406611a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            if (wakeLock != null && wakeLock.isHeld()) {
                androidx.work.G.a().getClass();
            }
        }
    }

    @Y61.k
    public static final PowerManager.WakeLock b(@Y61.k Context context, @Y61.k String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String strConcat = "WorkManager: ".concat(str);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strConcat);
        K k12 = K.f55947a;
        synchronized (k12) {
            k12.getClass();
            K.f55948b.put(wakeLockNewWakeLock, strConcat);
        }
        return wakeLockNewWakeLock;
    }
}
