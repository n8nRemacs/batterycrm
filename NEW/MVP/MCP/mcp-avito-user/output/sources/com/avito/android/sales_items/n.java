package com.avito.android.sales_items;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;

/* compiled from: FavoriteSalesItemsStorage.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sales_items/n;", "Lcom/avito/android/sales_items/m;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f258241a;

    @Inject
    public n(@Y61.k AK0.l lVar) {
        this.f258241a = lVar;
    }

    @Override // com.avito.android.sales_items.m
    public final void a(@Y61.l String str) {
        this.f258241a.putString("current_sales_id", str);
    }

    @Override // com.avito.android.sales_items.m
    public final boolean b(@Y61.k String str) {
        Set<String> setF = this.f258241a.f("favorite_sales_items_was_show");
        if (setF == null) {
            setF = B0.f406639b;
        }
        return C42745f0.O0(setF).contains(str);
    }

    @Override // com.avito.android.sales_items.m
    public final void c(@Y61.k String str) {
        AK0.l lVar = this.f258241a;
        Set<String> setF = lVar.f("favorite_sales_items_was_show");
        if (setF == null) {
            setF = B0.f406639b;
        }
        LinkedHashSet linkedHashSetO0 = C42745f0.O0(setF);
        linkedHashSetO0.add(str);
        lVar.putStringSet("favorite_sales_items_was_show", linkedHashSetO0);
    }

    @Override // com.avito.android.sales_items.m
    @Y61.l
    public final String d() {
        return this.f258241a.getString("current_sales_id");
    }

    @Override // com.avito.android.sales_items.m
    public final boolean e() {
        return this.f258241a.getBoolean("sales_order_default", true);
    }

    @Override // com.avito.android.sales_items.m
    public final void f(boolean z12) {
        this.f258241a.putBoolean("sales_order_default", z12);
    }
}
