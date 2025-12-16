package com.avito.android.user_address.list.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.user_address.list.mvi.entity.UserAddressListMviInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserAddressListFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LXG0/a;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "LXG0/d;", "LXG0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class a extends N implements Y41.l<q<XG0.a, UserAddressListMviInternalAction, XG0.d, XG0.c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f307380l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f307381m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f307382n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i f307383o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n f307384p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar, n nVar) {
        super(1);
        this.f307380l = gVar;
        this.f307381m = screenPerformanceTracker;
        this.f307382n = kVar;
        this.f307383o = iVar;
        this.f307384p = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<XG0.a, UserAddressListMviInternalAction, XG0.d, XG0.c> qVar) {
        q<XG0.a, UserAddressListMviInternalAction, XG0.d, XG0.c> qVar2 = qVar;
        qVar2.f92009e = this.f307380l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f307381m, this.f307382n);
        qVar2.f92008d = this.f307383o;
        qVar2.f92010f = this.f307384p;
        return G0.f406611a;
    }
}
