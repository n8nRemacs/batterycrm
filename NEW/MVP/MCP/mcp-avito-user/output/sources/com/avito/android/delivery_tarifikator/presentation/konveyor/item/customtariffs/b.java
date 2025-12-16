package com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs;

import TV0.g;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CustomTariffsBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/customtariffs/b;", "LTV0/b;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/customtariffs/j;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/customtariffs/d;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements TV0.b<j, d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f135356a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Sv.d f135357b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView.l f135358c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f135359d = new g.a<>(R.layout.item_custom_tariffs, new a(this));

    @Inject
    public b(@Y61.k g gVar, @Sv.g @Y61.k Sv.d dVar, @Sv.g @Y61.k RecyclerView.l lVar) {
        this.f135356a = gVar;
        this.f135357b = dVar;
        this.f135358c = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f135356a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f135359d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof d;
    }
}
