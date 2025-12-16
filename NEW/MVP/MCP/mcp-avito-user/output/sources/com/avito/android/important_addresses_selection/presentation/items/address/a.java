package com.avito.android.important_addresses_selection.presentation.items.address;

import TV0.g;
import Y41.l;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImportantAddressesSelectionAddressBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/items/address/a;", "LTV0/b;", "Lcom/avito/android/important_addresses_selection/presentation/items/address/e;", "Lcom/avito/android/important_addresses_selection/presentation/items/address/ImportantAddressesSelectionAddressItem;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements TV0.b<e, ImportantAddressesSelectionAddressItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<SM.a, G0> f169845a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f169846b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f169847c = new g.a<>(R.layout.important_addresses_selection_item_address, new C5023a());

    /* compiled from: ImportantAddressesSelectionAddressBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/important_addresses_selection/presentation/items/address/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/important_addresses_selection/presentation/items/address/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.important_addresses_selection.presentation.items.address.a$a, reason: collision with other inner class name */
    public static final class C5023a extends N implements p<ViewGroup, View, f> {
        public C5023a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            return new f(view, a.this.f169845a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public a(@k l<? super SM.a, G0> lVar, @k c cVar) {
        this.f169845a = lVar;
        this.f169846b = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f169846b;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f169847c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ImportantAddressesSelectionAddressItem;
    }
}
