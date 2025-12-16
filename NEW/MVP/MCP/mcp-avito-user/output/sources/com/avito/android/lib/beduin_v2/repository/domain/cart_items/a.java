package com.avito.android.lib.beduin_v2.repository.domain.cart_items;

import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItem;
import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItemInfo;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import rU.C47595a;

/* compiled from: CartStorage.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/domain/cart_items/a;", "Lcom/avito/android/lib/beduin_v2/repository/domain/cart_items/h;", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_domain_cart-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap f176548a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e2 f176549b = f2.b(0, 1, null, 5);

    @Inject
    public a() {
    }

    @Override // com.avito.android.lib.beduin_v2.repository.domain.cart_items.h
    @Y61.k
    public final InterfaceC43160i<Q<String, CartItemInfo>> a() {
        return C43175k.a(this.f176549b);
    }

    @Override // com.avito.android.lib.beduin_v2.repository.domain.cart_items.h
    public final void b(@Y61.k String str, @Y61.k CartItemInfo cartItemInfo) {
        d(str, cartItemInfo);
    }

    @Override // com.avito.android.lib.beduin_v2.repository.domain.cart_items.h
    public final void c(@Y61.k C47595a c47595a) {
        for (CartItem cartItem : c47595a.f429817a) {
            d(cartItem.f176566b, cartItem.f176567c);
        }
    }

    @Override // com.avito.android.lib.beduin_v2.repository.domain.cart_items.h
    public final void clear() {
        ConcurrentHashMap concurrentHashMap = this.f176548a;
        Set setP0 = C42745f0.P0(concurrentHashMap.keySet());
        concurrentHashMap.clear();
        Iterator it = setP0.iterator();
        while (it.hasNext()) {
            this.f176549b.K5(new Q((String) it.next(), null));
        }
    }

    public final void d(String str, CartItemInfo cartItemInfo) {
        Integer num;
        int i12 = cartItemInfo.f176568b;
        ConcurrentHashMap concurrentHashMap = this.f176548a;
        if (concurrentHashMap.containsKey(str) || i12 > 0 || ((num = cartItemInfo.f176569c) != null && num.intValue() == 0)) {
            concurrentHashMap.put(str, cartItemInfo);
            this.f176549b.K5(new Q(str, cartItemInfo));
        }
    }

    @Override // com.avito.android.lib.beduin_v2.repository.domain.cart_items.h
    @Y61.l
    public final CartItemInfo get(@Y61.k String str) {
        return (CartItemInfo) this.f176548a.get(str);
    }

    @Override // com.avito.android.lib.beduin_v2.repository.domain.cart_items.h
    public final void remove(@Y61.k String str) {
        if (((CartItemInfo) this.f176548a.remove(str)) != null) {
            this.f176549b.K5(new Q(str, null));
        }
    }
}
