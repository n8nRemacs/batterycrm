package com.avito.android.performance;

import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.performance.PerformanceImageTracker;
import kotlin.Metadata;

/* compiled from: PerformanceImageTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/performance/a;", "", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {
    void a(@k Uri uri, long j12, @l Throwable th2);

    void b(@k Uri uri);

    void c(@k Uri uri, long j12, int i12, int i13, long j13, @k PerformanceImageTracker.ImageOrigin imageOrigin);
}
