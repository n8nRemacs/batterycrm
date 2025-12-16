package ru.cyberity.input.infoproviders;

import Y61.k;
import Y61.l;
import android.app.ActivityManager;
import android.content.pm.ConfigurationInfo;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.N;
import ru.cyberity.input.tools.threading.safe.c;

/* compiled from: GpuInfoProvider.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lru/cyberity/fingerprint/infoproviders/s;", "Lru/cyberity/fingerprint/infoproviders/r;", "", "a", "Landroid/app/ActivityManager;", "Landroid/app/ActivityManager;", "activityManager", "<init>", "(Landroid/app/ActivityManager;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final ActivityManager activityManager;

    /* compiled from: GpuInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements Y41.a<String> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            ConfigurationInfo deviceConfigurationInfo;
            ActivityManager activityManager = s.this.activityManager;
            String glEsVersion = (activityManager == null || (deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo()) == null) ? null : deviceConfigurationInfo.getGlEsVersion();
            return glEsVersion == null ? "" : glEsVersion;
        }
    }

    public s(@l ActivityManager activityManager) {
        this.activityManager = activityManager;
    }

    @Override // ru.cyberity.input.infoproviders.r
    @k
    public String a() {
        Object objA = c.a(0L, new a(), 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = "";
        }
        return (String) objA;
    }
}
