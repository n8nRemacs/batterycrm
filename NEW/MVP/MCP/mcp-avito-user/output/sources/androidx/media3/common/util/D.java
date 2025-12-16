package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import j.P;

/* compiled from: SystemClock.java */
@J
/* loaded from: classes.dex */
public class D implements InterfaceC23115f {
    @Override // androidx.media3.common.util.InterfaceC23115f
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // androidx.media3.common.util.InterfaceC23115f
    public final InterfaceC23123n b(Looper looper, @P Handler.Callback callback) {
        return new E(new Handler(looper, callback));
    }
}
