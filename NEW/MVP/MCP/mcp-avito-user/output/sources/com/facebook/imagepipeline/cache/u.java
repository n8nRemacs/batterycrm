package com.facebook.imagepipeline.cache;

import android.app.ActivityManager;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.TimeUnit;

/* compiled from: DefaultBitmapMemoryCacheParamsSupplier.java */
@Nullsafe
/* loaded from: classes12.dex */
public class u implements com.facebook.common.internal.r<I> {

    /* renamed from: b, reason: collision with root package name */
    public static final long f340254b = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    public final ActivityManager f340255a;

    public u(ActivityManager activityManager) {
        this.f340255a = activityManager;
    }

    @Override // com.facebook.common.internal.r
    public final I get() {
        int iMin = Math.min(this.f340255a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        return new I(iMin < 33554432 ? 4194304 : iMin < 67108864 ? 6291456 : iMin / 4, 256, Integer.MAX_VALUE, Integer.MAX_VALUE, f340254b);
    }
}
