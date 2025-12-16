package com.avito.android.item_price_history.presentation.mvi;

import com.avito.android.favorite.InterfaceC30570d;
import com.avito.android.item_price_history.presentation.mvi.entity.ItemPriceHistoryInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.reactive.A;

/* compiled from: ItemPriceHistoryBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/item_price_history/presentation/mvi/h;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements com.avito.android.arch.mvi.b<ItemPriceHistoryInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AO.a f173828a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f173829b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30570d f173830c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f173831d;

    @Inject
    public h(@Y61.k AO.a aVar, @Y61.k R0 r02, @Y61.k InterfaceC30570d interfaceC30570d) {
        this.f173828a = aVar;
        this.f173829b = r02;
        this.f173830c = interfaceC30570d;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ItemPriceHistoryInternalAction> a() {
        return this.f173831d ? C43175k.w() : C43175k.N(C43175k.I(this.f173829b.a(), C43175k.G(new f(this, null))), C43175k.G(new g(A.a(this.f173830c.c()), null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
