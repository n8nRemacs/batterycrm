package com.avito.android.cart_similar_items.mvi;

import com.avito.android.cart_similar_items.mvi.entity.CartSimilarItemsInternalAction;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43175k;
import yn.C50271a;

/* compiled from: CartSimilarItemsActor.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lyn/a;", "changedItems", "Lkotlin/Function0;", "Lkotlin/G0;", "onError", "onSuccess", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "invoke", "(Ljava/util/List;LY41/a;LY41/a;)Lio/reactivex/rxjava3/core/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.cart_similar_items.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29359g extends N implements Y41.q<List<? extends C50271a>, Y41.a<? extends G0>, Y41.a<? extends G0>, io.reactivex.rxjava3.core.z<CartSimilarItemsInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C29353a f116062l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f116063m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29359g(C29353a c29353a, LinkedHashMap linkedHashMap) {
        super(3);
        this.f116062l = c29353a;
        this.f116063m = linkedHashMap;
    }

    @Override // Y41.q
    public final io.reactivex.rxjava3.core.z<CartSimilarItemsInternalAction> invoke(List<? extends C50271a> list, Y41.a<? extends G0> aVar, Y41.a<? extends G0> aVar2) {
        LinkedHashMap linkedHashMap = this.f116063m;
        return kotlinx.coroutines.rx3.y.b(C43175k.I(this.f116062l.f115980f.a(), C43175k.G(new C29358f(this.f116062l, list, aVar, linkedHashMap, aVar2, null))));
    }
}
