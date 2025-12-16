package com.avito.android.advert_core.equipments.redesign.bottom_sheet;

import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.remote.model.AdvertEquipments;
import com.avito.android.remote.model.AllComplectationsButton;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EquipmentsDialogFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/equipments/redesign/bottom_sheet/b;", "Lcom/avito/android/advert_core/equipments/redesign/bottom_sheet/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f83487a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m f83488b;

    @Inject
    public b(@Y61.k g gVar, @Y61.k m mVar) {
        this.f83487a = gVar;
        this.f83488b = mVar;
    }

    @Override // com.avito.android.advert_core.equipments.redesign.bottom_sheet.a
    public final void a(@Y61.k Context context, @Y61.k String str, @Y61.l String str2, @Y61.k List<AdvertEquipments.EquipmentOption> list, @Y61.l AllComplectationsButton allComplectationsButton, @Y61.l Boolean bool) {
        View viewInflate = View.inflate(context, R.layout.equipments_bottom_sheet, null);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
        dVar.setContentView(viewInflate);
        com.avito.android.lib.design.bottom_sheet.j.c(dVar, null, true, 0, 0, 0, 121);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        V9.d dVar2 = new V9.d(dVar);
        m mVar = this.f83488b;
        this.f83487a.a(new o(viewInflate, mVar.f83526a, mVar.f83527b), str, str2, list, allComplectationsButton, bool, dVar2);
    }
}
