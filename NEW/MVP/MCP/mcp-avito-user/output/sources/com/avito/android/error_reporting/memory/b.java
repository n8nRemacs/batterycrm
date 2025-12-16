package com.avito.android.error_reporting.memory;

import Y61.k;
import android.os.Debug;
import android.support.v4.media.session.PlaybackStateCompat;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OnCrashMemoryState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/error_reporting/memory/b;", "", "<init>", "()V", "a", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f147924a = new a(null);

    /* compiled from: OnCrashMemoryState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/error_reporting/memory/b$a;", "", "<init>", "()V", "", "MEGABYTE", "J", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public b() {
    }

    @k
    public static com.avito.android.error_reporting.memory.a a() {
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
        f147924a.getClass();
        long j12 = jFreeMemory / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        long jMaxMemory = runtime.maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        long nativeHeapSize = Debug.getNativeHeapSize() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        long nativeHeapFreeSize = Debug.getNativeHeapFreeSize() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        return new com.avito.android.error_reporting.memory.a(j12, jMaxMemory - j12, jMaxMemory, nativeHeapSize - nativeHeapFreeSize, nativeHeapFreeSize, nativeHeapSize);
    }
}
