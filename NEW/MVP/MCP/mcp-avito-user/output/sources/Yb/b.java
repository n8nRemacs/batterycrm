package Yb;

import AK0.l;
import android.os.Build;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.permissions.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocationPermissionStateAnalyticInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LYb/b;", "LYb/a;", "a", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC18250a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f19525a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f19526b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u f19527c;

    /* compiled from: LocationPermissionStateAnalyticInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LYb/b$a;", "", "<init>", "()V", "", "LOCATION_PERMISSION_IS_ENABLED", "Ljava/lang/String;", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@Y61.k l lVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k u uVar) {
        this.f19525a = lVar;
        this.f19526b = interfaceC28373a;
        this.f19527c = uVar;
    }

    @Override // Yb.InterfaceC18250a
    public final void a() {
        l lVar = this.f19525a;
        boolean z12 = false;
        Boolean boolValueOf = lVar.contains("LocationPermissionStateAnalyticInteractor_location_permission_is_enabled") ? Boolean.valueOf(lVar.getBoolean("LocationPermissionStateAnalyticInteractor_location_permission_is_enabled", false)) : null;
        u uVar = this.f19527c;
        if ((uVar.b("android.permission.ACCESS_FINE_LOCATION") && uVar.b("android.permission.ACCESS_COARSE_LOCATION")) || (uVar.b("android.permission.ACCESS_COARSE_LOCATION") && Build.VERSION.SDK_INT >= 31)) {
            z12 = true;
        }
        if (boolValueOf == null) {
            lVar.putBoolean("LocationPermissionStateAnalyticInteractor_location_permission_is_enabled", z12);
        } else {
            if (boolValueOf.equals(Boolean.valueOf(z12))) {
                return;
            }
            lVar.putBoolean("LocationPermissionStateAnalyticInteractor_location_permission_is_enabled", z12);
            this.f19526b.c(new d(z12));
        }
    }
}
