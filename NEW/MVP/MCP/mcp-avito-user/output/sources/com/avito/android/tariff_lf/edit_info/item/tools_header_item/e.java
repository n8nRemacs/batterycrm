package com.avito.android.tariff_lf.edit_info.item.tools_header_item;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ToolsHeaderItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/tools_header_item/e;", "Lcom/avito/android/tariff_lf/edit_info/item/tools_header_item/d;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f299067b;

    @Inject
    public e(@k com.avito.android.util.text.a aVar) {
        this.f299067b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        gVar.setTitle(aVar2.f299061b);
        gVar.Wc(aVar2.f299062c, this.f299067b);
    }
}
