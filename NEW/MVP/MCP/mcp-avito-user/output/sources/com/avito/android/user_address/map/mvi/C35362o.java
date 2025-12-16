package com.avito.android.user_address.map.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_address.UserAddressActivity;
import com.avito.android.user_address.map.mvi.UserAddressMapFullAddressMviState;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UserAddressMapFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.user_address.map.mvi.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35362o implements dagger.internal.h<C35361n> {

    /* renamed from: a, reason: collision with root package name */
    public final Y f307892a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f307893b;

    /* renamed from: c, reason: collision with root package name */
    public final C35359l f307894c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f307895d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f307896e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f307897f;

    public C35362o(Y y12, b0 b0Var, C35359l c35359l, d0 d0Var, dagger.internal.l lVar, Provider provider) {
        this.f307892a = y12;
        this.f307893b = b0Var;
        this.f307894c = c35359l;
        this.f307895d = d0Var;
        this.f307896e = lVar;
        this.f307897f = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Object objA;
        B b12 = (B) this.f307892a.get();
        this.f307893b.getClass();
        a0 a0Var = new a0();
        C35358k c35358k = (C35358k) this.f307894c.get();
        this.f307895d.getClass();
        c0 c0Var = new c0();
        UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map = (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map) this.f307896e.f393949a;
        ScreenPerformanceTracker screenPerformanceTracker = this.f307897f.get();
        if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.Short ? true : map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo) {
            UserAddressMapShortAddressMviState.f307785m.getClass();
            objA = UserAddressMapShortAddressMviState.f307786n;
        } else if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress) {
            UserAddressMapFullAddressMviState.a aVar = UserAddressMapFullAddressMviState.f307723r;
            boolean f307127h = ((UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress) map).getF307127h();
            aVar.getClass();
            objA = UserAddressMapFullAddressMviState.a.a(f307127h);
        } else {
            if (!(map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow)) {
                throw new NoWhenBranchMatchedException();
            }
            UserAddressMapShortAddressMviState.f307785m.getClass();
            objA = UserAddressMapShortAddressMviState.f307786n;
        }
        return new C35361n("UserAddressAddNewAddress", objA, new C35360m(b12, screenPerformanceTracker, a0Var, c35358k, c0Var));
    }
}
