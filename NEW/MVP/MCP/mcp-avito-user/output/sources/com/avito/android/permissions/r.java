package com.avito.android.permissions;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.T;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LocationPermissionProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/permissions/r;", "Lcom/avito/android/permissions/q;", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final G f215133a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final z f215134b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f215135c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public com.tbruyelle.rxpermissions3.m f215136d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Fragment f215137e;

    /* compiled from: LocationPermissionProvider.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/reactivex/rxjava3/core/y;", "", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/core/y;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            boolean zEquals;
            r rVar = r.this;
            z zVar = rVar.f215134b;
            G g12 = rVar.f215133a;
            try {
                boolean zH2 = g12.h("android.permission.ACCESS_FINE_LOCATION");
                com.tbruyelle.rxpermissions3.m mVar = rVar.f215136d;
                boolean z12 = true;
                boolean zEquals2 = false;
                boolean z13 = mVar != null && mVar.b("android.permission.ACCESS_FINE_LOCATION");
                com.tbruyelle.rxpermissions3.m mVar2 = rVar.f215136d;
                if (mVar2 != null) {
                    Fragment fragment = rVar.f215137e;
                    zEquals = mVar2.d(fragment != null ? fragment.requireActivity() : null, "android.permission.ACCESS_FINE_LOCATION").d().equals(Boolean.TRUE);
                } else {
                    zEquals = false;
                }
                PermissionState permissionState = z13 ? PermissionState.f215104b : (!zH2 || zEquals) ? PermissionState.f215105c : PermissionState.f215106d;
                g12.l("android.permission.ACCESS_FINE_LOCATION", zEquals);
                zVar.c(permissionState, "android.permission.ACCESS_FINE_LOCATION");
                boolean zH3 = g12.h("android.permission.ACCESS_COARSE_LOCATION");
                com.tbruyelle.rxpermissions3.m mVar3 = rVar.f215136d;
                if (mVar3 == null || !mVar3.b("android.permission.ACCESS_COARSE_LOCATION") || Build.VERSION.SDK_INT < 31) {
                    z12 = false;
                }
                com.tbruyelle.rxpermissions3.m mVar4 = rVar.f215136d;
                if (mVar4 != null) {
                    Fragment fragment2 = rVar.f215137e;
                    zEquals2 = mVar4.d(fragment2 != null ? fragment2.requireActivity() : null, "android.permission.ACCESS_COARSE_LOCATION").d().equals(Boolean.TRUE);
                }
                PermissionState permissionState2 = z12 ? PermissionState.f215104b : (!zH3 || zEquals2) ? PermissionState.f215105c : PermissionState.f215106d;
                g12.l("android.permission.ACCESS_COARSE_LOCATION", zEquals2);
                zVar.c(permissionState2, "android.permission.ACCESS_COARSE_LOCATION");
            } catch (Throwable th2) {
                V2.f318762a.c("LocationPermissionProvider", "error updateLocationPermissionState " + th2, null);
            }
        }
    }

    @Inject
    public r(@Y61.k G g12, @Y61.k z zVar) {
        this.f215133a = g12;
        this.f215134b = zVar;
    }

    @Override // com.avito.android.permissions.q
    public final void a() {
        this.f215137e = null;
        this.f215136d = null;
    }

    @Override // com.avito.android.permissions.q
    public final boolean b() {
        Context context;
        Fragment fragment = this.f215137e;
        Object systemService = (fragment == null || (context = fragment.getContext()) == null) ? null : context.getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        return ((locationManager != null ? locationManager.isProviderEnabled("gps") : false) || (locationManager != null ? locationManager.isProviderEnabled("network") : false)) ? false : true;
    }

    @Override // com.avito.android.permissions.q
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Boolean> c() {
        com.tbruyelle.rxpermissions3.m mVar = this.f215136d;
        T tS2 = null;
        if (mVar != null) {
            Fragment fragment = this.f215137e;
            tS2 = mVar.d(fragment != null ? fragment.requireActivity() : null, "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").S();
        }
        return tS2 == null ? io.reactivex.rxjava3.core.I.q(Boolean.FALSE) : tS2;
    }

    @Override // com.avito.android.permissions.q
    public final boolean d() {
        com.tbruyelle.rxpermissions3.m mVar;
        com.tbruyelle.rxpermissions3.m mVar2 = this.f215136d;
        if (mVar2 != null && mVar2.b("android.permission.ACCESS_FINE_LOCATION") && (mVar = this.f215136d) != null && mVar.b("android.permission.ACCESS_COARSE_LOCATION")) {
            return true;
        }
        com.tbruyelle.rxpermissions3.m mVar3 = this.f215136d;
        if (mVar3 == null || !mVar3.b("android.permission.ACCESS_COARSE_LOCATION") || Build.VERSION.SDK_INT < 31) {
            return false;
        }
        this.f215135c = true;
        return true;
    }

    @Override // com.avito.android.permissions.q
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Boolean> e() {
        com.tbruyelle.rxpermissions3.m mVar = this.f215136d;
        T tS2 = mVar != null ? mVar.c("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").G(new a()).S() : null;
        return tS2 == null ? io.reactivex.rxjava3.core.I.q(Boolean.FALSE) : tS2;
    }

    @Override // com.avito.android.permissions.q
    /* renamed from: f, reason: from getter */
    public final boolean getF215135c() {
        return this.f215135c;
    }

    @Override // com.avito.android.permissions.q
    public final void g(@Y61.k Fragment fragment) {
        this.f215137e = fragment;
        this.f215136d = new com.tbruyelle.rxpermissions3.m(fragment);
    }
}
