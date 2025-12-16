package com.avito.android.str_seller_orders.orders.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.str_seller_orders.orders.mvi.entity.StrOrdersInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mz0.C44158c;
import mz0.InterfaceC44156a;
import mz0.InterfaceC44157b;

/* compiled from: StrOrdersFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lmz0/a;", "Lcom/avito/android/str_seller_orders/orders/mvi/entity/StrOrdersInternalAction;", "Lmz0/c;", "Lmz0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements Y41.l<q<InterfaceC44156a, StrOrdersInternalAction, C44158c, InterfaceC44157b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f288891l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f288892m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f288893n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f288894o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f288895p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, i iVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar) {
        super(1);
        this.f288891l = dVar;
        this.f288892m = bVar;
        this.f288893n = iVar;
        this.f288894o = screenPerformanceTracker;
        this.f288895p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC44156a, StrOrdersInternalAction, C44158c, InterfaceC44157b> qVar) {
        q<InterfaceC44156a, StrOrdersInternalAction, C44158c, InterfaceC44157b> qVar2 = qVar;
        qVar2.f92008d = this.f288891l;
        qVar2.f92009e = this.f288892m;
        qVar2.f92010f = this.f288893n;
        qVar2.f92011g = new o(this.f288894o, this.f288895p);
        return G0.f406611a;
    }
}
