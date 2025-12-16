package com.avito.android.str_seller_orders.strsellerordersdialog.mvi;

import Bz0.C13210c;
import Bz0.InterfaceC13208a;
import Bz0.InterfaceC13209b;
import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.str_seller_orders.strsellerordersdialog.mvi.entity.StrSellerOrdersDialogInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrSellerOrdersDialogFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LBz0/a;", "Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction;", "LBz0/c;", "LBz0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements l<q<InterfaceC13208a, StrSellerOrdersDialogInternalAction, C13210c, InterfaceC13209b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f290145l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f290146m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f290147n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f290148o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f290149p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f290145l = cVar;
        this.f290146m = aVar;
        this.f290147n = screenPerformanceTracker;
        this.f290148o = jVar;
        this.f290149p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC13208a, StrSellerOrdersDialogInternalAction, C13210c, InterfaceC13209b> qVar) {
        q<InterfaceC13208a, StrSellerOrdersDialogInternalAction, C13210c, InterfaceC13209b> qVar2 = qVar;
        qVar2.f92008d = this.f290145l;
        qVar2.f92009e = this.f290146m;
        qVar2.f92011g = new o(this.f290147n, this.f290148o);
        qVar2.f92010f = this.f290149p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
