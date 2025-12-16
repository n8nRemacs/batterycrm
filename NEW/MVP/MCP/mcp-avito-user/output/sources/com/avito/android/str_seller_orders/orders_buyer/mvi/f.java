package com.avito.android.str_seller_orders.orders_buyer.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.str_seller_orders.orders_buyer.mvi.entity.StrOrdersBuyerInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import pz0.C47173d;
import pz0.InterfaceC47170a;
import pz0.InterfaceC47172c;

/* compiled from: StrOrdersBuyerFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lpz0/a;", "Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerInternalAction;", "Lpz0/d;", "Lpz0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements Y41.l<q<InterfaceC47170a, StrOrdersBuyerInternalAction, C47173d, InterfaceC47172c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f289088l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f289089m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f289090n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f289091o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f289092p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, i iVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar) {
        super(1);
        this.f289088l = dVar;
        this.f289089m = bVar;
        this.f289090n = iVar;
        this.f289091o = screenPerformanceTracker;
        this.f289092p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC47170a, StrOrdersBuyerInternalAction, C47173d, InterfaceC47172c> qVar) {
        q<InterfaceC47170a, StrOrdersBuyerInternalAction, C47173d, InterfaceC47172c> qVar2 = qVar;
        qVar2.f92008d = this.f289088l;
        qVar2.f92009e = this.f289089m;
        qVar2.f92010f = this.f289090n;
        qVar2.f92011g = new o(this.f289091o, this.f289092p);
        return G0.f406611a;
    }
}
