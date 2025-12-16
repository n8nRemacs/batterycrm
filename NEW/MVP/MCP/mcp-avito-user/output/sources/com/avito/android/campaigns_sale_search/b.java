package com.avito.android.campaigns_sale_search;

import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.input.Input;
import kotlin.Metadata;
import um.b;

/* compiled from: CampaignsSaleSearchAddToSaleDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/b;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f114511a;

    public b(d dVar) {
        this.f114511a = dVar;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        d dVar = this.f114511a;
        Input input = dVar.f114515F;
        if (input != null) {
            Input.t(input, hVar.getF262141c(), false, 4);
        }
        com.avito.android.campaigns_sale.konveyor.editBlock.a aVar = hVar instanceof com.avito.android.campaigns_sale.konveyor.editBlock.a ? (com.avito.android.campaigns_sale.konveyor.editBlock.a) hVar : null;
        if (aVar != null) {
            ((h) dVar.f114514E).invoke(new b.k(aVar.f113968b));
        }
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
    }
}
