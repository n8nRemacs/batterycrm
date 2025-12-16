package com.avito.android.cart_similar_items.mvi;

import com.avito.android.cart_similar_items.mvi.entity.CartSimilarItemsInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ln.C43801b;

/* compiled from: CartSimilarItemsBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/t;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class t implements com.avito.android.arch.mvi.b<CartSimilarItemsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final I f116118a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f116119b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43801b f116120c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f116121d;

    @Inject
    public t(@Y61.k I i12, @Y61.k com.avito.android.favorite.h hVar, @Y61.k C43801b c43801b, @Y61.k R0 r02) {
        this.f116118a = i12;
        this.f116119b = hVar;
        this.f116120c = c43801b;
        this.f116121d = r02;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CartSimilarItemsInternalAction> a() {
        return C43175k.N(C43175k.G(new r(this, null)), new q(kotlinx.coroutines.reactive.A.a(this.f116119b.c())), C43175k.I(this.f116121d.b(), new s(kotlinx.coroutines.rx3.y.a(this.f116120c.f414190a.getF103348p()))));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
