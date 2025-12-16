package com.avito.android.lib.beduin_v2.repository.domain.cart_items;

import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItemInfo;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: CartItemsRepositoryClientImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/domain/cart_items/e;", "LWU0/a;", "_design-modules_beduin-v2_interactions_repository_domain_cart-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class e implements WU0.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f176556a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43238h f176557b;

    @Inject
    public e(@Y61.k h hVar, @Y61.k R0 r02) {
        this.f176556a = hVar;
        this.f176557b = U.a(r02.b());
    }

    @Override // WU0.a
    @Y61.k
    public final com.avito.android.lib.beduin_v2.repository.beduin_v1_in_memory.a a(@Y61.k Y41.p pVar) {
        return new com.avito.android.lib.beduin_v2.repository.beduin_v1_in_memory.a(C43259k.d(this.f176557b, null, null, new d(this, pVar, null), 3), 1);
    }

    @Override // WU0.a
    public final void b(@Y61.k ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            YU0.a aVar = (YU0.a) it.next();
            String str = aVar.f19481a;
            YU0.b bVar = aVar.f19482b;
            this.f176556a.b(str, new CartItemInfo(bVar.f19483a, bVar.f19484b));
        }
    }

    @Override // WU0.a
    public final void clear() {
        this.f176556a.clear();
    }

    @Override // WU0.a
    @Y61.l
    public final YU0.b get(@Y61.k String str) {
        CartItemInfo cartItemInfo = this.f176556a.get(str);
        if (cartItemInfo == null) {
            return null;
        }
        return new YU0.b(cartItemInfo.f176568b, cartItemInfo.f176569c);
    }

    @Override // WU0.a
    public final void remove(@Y61.k String str) {
        this.f176556a.remove(str);
    }
}
