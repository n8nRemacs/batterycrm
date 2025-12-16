package com.avito.android.important_addresses_selection.presentation.items.additionalButton;

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

/* compiled from: ImportantAddressesSelectionAdditionalActionBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/items/additionalButton/a;", "LTV0/b;", "Lcom/avito/android/important_addresses_selection/presentation/items/additionalButton/e;", "Lcom/avito/android/important_addresses_selection/presentation/items/additionalButton/ImportantAddressesSelectionAdditionalActionItem;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements TV0.b<e, ImportantAddressesSelectionAdditionalActionItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f169824a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<SM.a, G0> f169825b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c f169826c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f169827d = new g.a<>(R.layout.important_addresses_selection_item_additional_action, new C5022a());

    /* compiled from: ImportantAddressesSelectionAdditionalActionBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/important_addresses_selection/presentation/items/additionalButton/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/important_addresses_selection/presentation/items/additionalButton/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.important_addresses_selection.presentation.items.additionalButton.a$a, reason: collision with other inner class name */
    public static final class C5022a extends N implements p<ViewGroup, View, f> {
        public C5022a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            com.avito.android.util.text.a aVar2 = aVar.f169824a;
            return new f(aVar.f169825b, view, aVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public a(@k com.avito.android.util.text.a aVar, @k l<? super SM.a, G0> lVar, @k c cVar) {
        this.f169824a = aVar;
        this.f169825b = lVar;
        this.f169826c = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f169826c;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f169827d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ImportantAddressesSelectionAdditionalActionItem;
    }
}
