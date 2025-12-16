package com.avito.android.developments_agency_search.screen.realty_agency_search;

import Lw.InterfaceC14443a;
import Lw.b;
import com.avito.android.R;
import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: RealtyAgencySearchFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/k;", "optionItem", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/bottom_sheet/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class j extends N implements Y41.l<com.avito.android.lib.design.bottom_sheet.k, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RealtyAgencySearchFragment f138649l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b.m f138650m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(RealtyAgencySearchFragment realtyAgencySearchFragment, b.m mVar) {
        super(1);
        this.f138649l = realtyAgencySearchFragment;
        this.f138650m = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.bottom_sheet.k kVar) {
        RealtyAgencySearchFragment realtyAgencySearchFragment = this.f138649l;
        String string = realtyAgencySearchFragment.getString(R.string.das_lot_client_fixation_bottom_sheet_option);
        String str = kVar.f178541a;
        boolean zF2 = L.f(str, string);
        b.m mVar = this.f138650m;
        if (zF2) {
            realtyAgencySearchFragment.D5().accept(new InterfaceC14443a.e.d(mVar.f10233b, mVar.f10232a));
        } else if (L.f(str, realtyAgencySearchFragment.getString(R.string.das_lot_booking_bottom_sheet_option))) {
            realtyAgencySearchFragment.D5().accept(new InterfaceC14443a.e.b(mVar.f10233b, mVar.f10232a));
        } else {
            V2.f318762a.j("RealtyAgencySearchFragment", "Unprocessed option item: " + str, null);
        }
        return G0.f406611a;
    }
}
