package ru.cyberity.input.infoproviders;

import Y61.k;
import Y61.l;
import android.app.ActivityManager;
import android.os.StatFs;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.N;

/* compiled from: MemInfoProvider.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/cyberity/fingerprint/infoproviders/y;", "Lru/cyberity/fingerprint/infoproviders/x;", "Landroid/app/ActivityManager;", "activityManager", "Landroid/os/StatFs;", "internalStorageStats", "externalStorageStats", "<init>", "(Landroid/app/ActivityManager;Landroid/os/StatFs;Landroid/os/StatFs;)V", "", "b", "()J", "a", "Landroid/app/ActivityManager;", "Landroid/os/StatFs;", "c", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class y implements x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final ActivityManager activityManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final StatFs internalStorageStats;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final StatFs externalStorageStats;

    /* compiled from: MemInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Long;"}, k = 3, mv = {1, 7, 1})
    final class a extends N implements Y41.a<Long> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f436049a;

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(this.f436049a.externalStorageStats.getTotalBytes());
        }
    }

    /* compiled from: MemInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Long;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends N implements Y41.a<Long> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(y.this.internalStorageStats.getTotalBytes());
        }
    }

    /* compiled from: MemInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Long;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements Y41.a<Long> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ActivityManager activityManager = y.this.activityManager;
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
            }
            return Long.valueOf(memoryInfo.totalMem);
        }
    }

    public y(@l ActivityManager activityManager, @l StatFs statFs, @l StatFs statFs2) {
        this.activityManager = activityManager;
        this.internalStorageStats = statFs;
        this.externalStorageStats = statFs2;
    }

    @Override // ru.cyberity.input.infoproviders.x
    public long a() {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, new b(), 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = 0L;
        }
        return ((Number) objA).longValue();
    }

    @Override // ru.cyberity.input.infoproviders.x
    public long b() {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, new c(), 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = 0L;
        }
        return ((Number) objA).longValue();
    }
}
