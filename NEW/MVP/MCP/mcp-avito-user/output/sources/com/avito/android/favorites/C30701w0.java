package com.avito.android.favorites;

import com.avito.android.cart_snippet_actions.e;
import com.avito.android.cart_snippet_actions.models.CartItemQuantityChange;
import com.avito.android.favorites.adapter.advert.FavoriteAdvertItem;
import com.avito.android.favorites.adapter.advert.RelatedProductsWithState;
import com.avito.android.remote.model.RelatedProducts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.l0;
import yn.C50271a;

/* compiled from: FavoritesListPresenter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lyn/a;", "changedItems", "Lkotlin/Function0;", "Lkotlin/G0;", "onError", "onSuccess", "Lio/reactivex/rxjava3/core/z;", "invoke", "(Ljava/util/List;LY41/a;LY41/a;)Lio/reactivex/rxjava3/core/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.favorites.w0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30701w0 extends kotlin.jvm.internal.N implements Y41.q<List<? extends C50271a>, Y41.a<? extends kotlin.G0>, Y41.a<? extends kotlin.G0>, io.reactivex.rxjava3.core.z<kotlin.G0>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C30684r0 f157578l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x1 f157579m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.h<Map<String, List<CartItemQuantityChange>>> f157580n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30701w0(C30684r0 c30684r0, x1 x1Var, l0.h hVar) {
        super(3);
        this.f157578l = c30684r0;
        this.f157579m = x1Var;
        this.f157580n = hVar;
    }

    @Override // Y41.q
    public final io.reactivex.rxjava3.core.z<kotlin.G0> invoke(List<? extends C50271a> list, Y41.a<? extends kotlin.G0> aVar, Y41.a<? extends kotlin.G0> aVar2) {
        boolean z12;
        String context;
        List<? extends C50271a> list2 = list;
        Y41.a<? extends kotlin.G0> aVar3 = aVar;
        Y41.a<? extends kotlin.G0> aVar4 = aVar2;
        C30684r0 c30684r0 = this.f157578l;
        com.avito.android.cart_snippet_actions.e eVar = c30684r0.f157497v;
        List<? extends C50271a> list3 = list2;
        ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((C50271a) it.next()).getItemId());
        }
        Iterable iterable = c30684r0.f157456a0;
        if (iterable == null) {
            iterable = C42784z0.f406748b;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            if ((obj instanceof FavoriteAdvertItem) && arrayList.contains(((FavoriteAdvertItem) obj).f156404b)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            z12 = false;
        } else {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                RelatedProductsWithState relatedProductsWithState = ((FavoriteAdvertItem) it2.next()).f156425w;
                RelatedProducts relatedProducts = relatedProductsWithState != null ? relatedProductsWithState.f156429b : null;
                if ((relatedProducts instanceof RelatedProducts.TransactionalItem) && ((RelatedProducts.TransactionalItem) relatedProducts).getWithComplementary()) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((C50271a) it3.next()).getItemId());
        }
        Iterable iterable2 = c30684r0.f157456a0;
        if (iterable2 == null) {
            iterable2 = C42784z0.f406748b;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : iterable2) {
            if ((obj2 instanceof FavoriteAdvertItem) && arrayList3.contains(((FavoriteAdvertItem) obj2).f156404b)) {
                arrayList4.add(obj2);
            }
        }
        Iterator it4 = arrayList4.iterator();
        while (true) {
            if (!it4.hasNext()) {
                context = null;
                break;
            }
            RelatedProductsWithState relatedProductsWithState2 = ((FavoriteAdvertItem) it4.next()).f156425w;
            RelatedProducts relatedProducts2 = relatedProductsWithState2 != null ? relatedProductsWithState2.f156429b : null;
            if (relatedProducts2 instanceof RelatedProducts.TransactionalItem) {
                RelatedProducts.TransactionalItem transactionalItem = (RelatedProducts.TransactionalItem) relatedProducts2;
                if (transactionalItem.getWithComplementary()) {
                    context = transactionalItem.getContext();
                    break;
                }
            }
        }
        return e.a.a(eVar, list2, false, z12, context, false, 18).s(c30684r0.f157459c.e()).r(new C30699v0(aVar3, this.f157579m, aVar4, this.f157578l, this.f157580n)).F();
    }
}
