package com.avito.android.user_address.map.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UserAddressMapFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/user_address/map/mvi/A;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "Lcom/avito/android/user_address/map/mvi/UserAddressAddNewAddressMviState;", "Lcom/avito/android/user_address/map/mvi/Z;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.user_address.map.mvi.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35360m extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.arch.mvi.q<A, UserAddressMapMviInternalAction, UserAddressAddNewAddressMviState, Z>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B f307887l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f307888m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a0 f307889n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C35358k f307890o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c0 f307891p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35360m(B b12, ScreenPerformanceTracker screenPerformanceTracker, a0 a0Var, C35358k c35358k, c0 c0Var) {
        super(1);
        this.f307887l = b12;
        this.f307888m = screenPerformanceTracker;
        this.f307889n = a0Var;
        this.f307890o = c35358k;
        this.f307891p = c0Var;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<A, UserAddressMapMviInternalAction, UserAddressAddNewAddressMviState, Z> qVar) {
        com.avito.android.arch.mvi.q<A, UserAddressMapMviInternalAction, UserAddressAddNewAddressMviState, Z> qVar2 = qVar;
        qVar2.f92009e = this.f307887l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f307888m, this.f307889n);
        qVar2.f92008d = this.f307890o;
        qVar2.f92010f = this.f307891p;
        return G0.f406611a;
    }
}
