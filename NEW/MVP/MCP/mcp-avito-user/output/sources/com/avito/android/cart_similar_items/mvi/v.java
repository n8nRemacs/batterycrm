package com.avito.android.cart_similar_items.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cart_similar_items.mvi.entity.CartSimilarItemsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mn.C44104d;
import mn.InterfaceC44101a;
import mn.InterfaceC44103c;

/* compiled from: CartSimilarItemsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lmn/a;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "Lmn/d;", "Lmn/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class v extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC44101a, CartSimilarItemsInternalAction, C44104d, InterfaceC44103c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f116126l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C29353a f116127m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f116128n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ A f116129o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y f116130p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t tVar, C29353a c29353a, ScreenPerformanceTracker screenPerformanceTracker, A a12, y yVar) {
        super(1);
        this.f116126l = tVar;
        this.f116127m = c29353a;
        this.f116128n = screenPerformanceTracker;
        this.f116129o = a12;
        this.f116130p = yVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC44101a, CartSimilarItemsInternalAction, C44104d, InterfaceC44103c> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC44101a, CartSimilarItemsInternalAction, C44104d, InterfaceC44103c> qVar2 = qVar;
        qVar2.f92008d = this.f116126l;
        qVar2.f92009e = this.f116127m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f116128n, this.f116129o);
        qVar2.f92010f = this.f116130p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        return G0.f406611a;
    }
}
