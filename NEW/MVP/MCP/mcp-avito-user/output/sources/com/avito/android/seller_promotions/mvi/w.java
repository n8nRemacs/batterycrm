package com.avito.android.seller_promotions.mvi;

import com.avito.android.seller_promotions.mvi.entity.SellerPromotionsInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SellerPromotionsBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/w;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class w implements com.avito.android.arch.mvi.b<SellerPromotionsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final B f268064a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f268065b;

    @Inject
    public w(@Y61.k B b12, @Y61.k com.avito.android.favorite.h hVar) {
        this.f268064a = b12;
        this.f268065b = hVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<SellerPromotionsInternalAction> a() {
        return C43175k.N(C43175k.G(new v(this, null)), new u(kotlinx.coroutines.reactive.A.a(this.f268065b.c())));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
