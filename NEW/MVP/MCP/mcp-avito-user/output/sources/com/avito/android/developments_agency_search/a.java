package com.avito.android.developments_agency_search;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.L;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.developments_agency_search.DevelopmentsAgencySearchActivity;
import com.avito.android.developments_agency_search.DevelopmentsAgencySearchFragmentParams;
import com.avito.android.developments_agency_search.screen.deal_cabinet.DealCabinetArguments;
import com.avito.android.developments_agency_search.screen.deal_room.model.DealRoomArguments;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchFragmentData;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import rw.InterfaceC47923a;

/* compiled from: DevelopmentsAgencySearchIntentFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/a;", "Lrw/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements InterfaceC47923a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f136212a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.navigation.a f136213b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final L f136214c;

    @Inject
    public a(@k Context context, @k com.avito.android.navigation.a aVar, @k L l12) {
        this.f136212a = context;
        this.f136213b = aVar;
        this.f136214c = l12;
    }

    @Override // rw.InterfaceC47923a
    @k
    public final Intent a(@k DealCabinetArguments dealCabinetArguments) {
        DevelopmentsAgencySearchActivity.a aVar = DevelopmentsAgencySearchActivity.f136208m;
        DevelopmentsAgencySearchFragmentParams.DealCabinetFragmentParams dealCabinetFragmentParams = new DevelopmentsAgencySearchFragmentParams.DealCabinetFragmentParams(dealCabinetArguments);
        aVar.getClass();
        Intent intent = new Intent(this.f136212a, (Class<?>) DevelopmentsAgencySearchActivity.class);
        intent.putExtra("fragment_params", dealCabinetFragmentParams);
        return intent;
    }

    @Override // rw.InterfaceC47923a
    @k
    public final Intent b(@k RealtyAgencySearchArguments realtyAgencySearchArguments) {
        NavigationTabSetItem navigationTabSetItemA = this.f136213b.a();
        if (navigationTabSetItemA == null) {
            navigationTabSetItemA = NavigationTab.f106974j;
        }
        return this.f136214c.d(new RealtyAgencySearchFragmentData(realtyAgencySearchArguments, navigationTabSetItemA));
    }

    @Override // rw.InterfaceC47923a
    @k
    public final Intent c(@k DealRoomArguments.ClientIdArguments clientIdArguments) {
        DevelopmentsAgencySearchActivity.a aVar = DevelopmentsAgencySearchActivity.f136208m;
        DevelopmentsAgencySearchFragmentParams.DealRoomFragmentParams dealRoomFragmentParams = new DevelopmentsAgencySearchFragmentParams.DealRoomFragmentParams(clientIdArguments);
        aVar.getClass();
        Intent intent = new Intent(this.f136212a, (Class<?>) DevelopmentsAgencySearchActivity.class);
        intent.putExtra("fragment_params", dealRoomFragmentParams);
        return intent;
    }
}
