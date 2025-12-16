package com.avito.android.advert_core.equipments.redesign.bottom_sheet;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.remote.model.AllComplectationsButton;
import com.avito.android.util.I5;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import x9.InterfaceC49794a;

/* compiled from: EquipmentsDialogPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/equipments/redesign/bottom_sheet/j;", "Lcom/avito/android/advert_core/equipments/redesign/bottom_sheet/g;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f83520a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49794a f83521b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f83522c;

    @Inject
    public j(@Y61.k d dVar, @Y61.k InterfaceC49794a interfaceC49794a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f83520a = dVar;
        this.f83521b = interfaceC49794a;
        this.f83522c = aVar;
    }

    @Override // com.avito.android.advert_core.equipments.redesign.bottom_sheet.g
    public final void a(@Y61.k o oVar, @Y61.k String str, @Y61.l String str2, @Y61.k List list, @Y61.l AllComplectationsButton allComplectationsButton, @Y61.l Boolean bool, @Y61.k V9.d dVar) {
        oVar.f83531b.setText(str);
        I5.a(oVar.f83532c, str2, false);
        oVar.f83530a.c(new UV0.c(this.f83520a.a(list)));
        RecyclerView.Adapter adapter = oVar.f83533d.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        if (allComplectationsButton == null || !L.f(bool, Boolean.TRUE)) {
            oVar.a(R.attr.buttonSecondaryLarge, new i(dVar), this.f83521b.getF442271f());
        } else {
            oVar.a(R.attr.buttonPrimaryLarge, new h(this, allComplectationsButton), allComplectationsButton.getButtonTitle());
        }
        com.avito.android.lib.util.g.a(dVar.f16989a);
    }
}
