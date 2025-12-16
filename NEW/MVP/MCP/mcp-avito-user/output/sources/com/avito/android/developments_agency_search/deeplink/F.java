package com.avito.android.developments_agency_search.deeplink;

import Fc1.DialogInterfaceOnShowListenerC13648j6;
import android.content.Context;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffCardRegionSelectorLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lcom/avito/android/lib/design/bottom_sheet/d;", "invoke", "(Landroid/content/Context;)Lcom/avito/android/lib/design/bottom_sheet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class F extends N implements Y41.l<Context, com.avito.android.lib.design.bottom_sheet.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TariffCardRegionSelectorLink f136377l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G f136378m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(TariffCardRegionSelectorLink tariffCardRegionSelectorLink, G g12) {
        super(1);
        this.f136377l = tariffCardRegionSelectorLink;
        this.f136378m = g12;
    }

    @Override // Y41.l
    public final com.avito.android.lib.design.bottom_sheet.d invoke(Context context) {
        Context context2 = context;
        com.avito.android.realty_agency.inline_filters.location_suggest.a aVar = new com.avito.android.realty_agency.inline_filters.location_suggest.a(context2, context2.getString(R.string.das_tariff_card_region_selector_dialog_title), this.f136377l.f136394b, new E(this.f136378m));
        aVar.setOnShowListener(new DialogInterfaceOnShowListenerC13648j6(aVar, 2));
        return aVar;
    }
}
