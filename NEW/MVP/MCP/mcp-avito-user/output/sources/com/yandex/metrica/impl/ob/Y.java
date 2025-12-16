package com.yandex.metrica.impl.ob;

import android.content.ComponentName;
import android.content.Context;
import com.yandex.metrica.PreloadInfoContentProvider;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    private static volatile CountDownLatch f379943a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile PreloadInfoContentProvider f379944b;

    @X41.n
    public static final void a(@Y61.k PreloadInfoContentProvider preloadInfoContentProvider) {
        f379943a = new CountDownLatch(1);
        f379944b = preloadInfoContentProvider;
    }

    @X41.n
    public static final void a() {
        CountDownLatch countDownLatch = f379943a;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @X41.n
    public static final void a(@Y61.k Context context) throws InterruptedException {
        CountDownLatch countDownLatch = f379943a;
        if (countDownLatch != null) {
            countDownLatch.await(1L, TimeUnit.SECONDS);
            try {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) PreloadInfoContentProvider.class), 2, 1);
                PreloadInfoContentProvider preloadInfoContentProvider = f379944b;
                if (preloadInfoContentProvider != null) {
                    preloadInfoContentProvider.disable();
                }
            } catch (Throwable unused) {
            }
            f379943a = null;
        }
    }
}
