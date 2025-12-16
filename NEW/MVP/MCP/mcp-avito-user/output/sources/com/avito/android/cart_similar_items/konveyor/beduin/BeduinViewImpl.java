package com.avito.android.cart_similar_items.konveyor.beduin;

import Y61.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: BeduinView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cart_similar_items/konveyor/beduin/BeduinViewImpl;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/cart_similar_items/konveyor/beduin/g;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BeduinViewImpl extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.beduin_shared.common.component.adapter.b f115814b;

    /* compiled from: BeduinView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/cart_similar_items/konveyor/beduin/BeduinViewImpl$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cart_similar_items.konveyor.beduin.BeduinViewImpl$1, reason: invalid class name */
    public static final class AnonymousClass1 extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
        public final boolean J() {
            return false;
        }
    }

    public BeduinViewImpl(@k RecyclerView recyclerView, @k com.avito.android.beduin_shared.common.component.adapter.b bVar) {
        super(recyclerView);
        this.f115814b = bVar;
        recyclerView.getContext();
        recyclerView.setAdapter(bVar);
        recyclerView.setLayoutManager(new AnonymousClass1());
    }

    @Override // com.avito.android.cart_similar_items.konveyor.beduin.g
    public final void C20(@k c cVar) {
        this.f115814b.k(cVar.f115823d);
    }
}
