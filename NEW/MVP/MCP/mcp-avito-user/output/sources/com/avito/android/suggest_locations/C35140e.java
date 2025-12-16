package com.avito.android.suggest_locations;

import android.app.Application;
import android.content.Intent;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SuggestLocationsIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_locations/e;", "Lcom/avito/android/suggest_locations/d;", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.suggest_locations.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35140e implements InterfaceC35139d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f292328a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.L f292329b;

    @Inject
    public C35140e(@Y61.k Application application, @Y61.k com.avito.android.L l12) {
        this.f292328a = application;
        this.f292329b = l12;
    }

    @Override // com.avito.android.suggest_locations.InterfaceC35139d
    @Y61.k
    public final Intent a(@Y61.l String str, @Y61.l String str2, @Y61.l Integer num, @Y61.l String str3, @Y61.l PublishIntentFactory.LocationPickerChooseButtonLocation locationPickerChooseButtonLocation, @Y61.l NavigationTabSetItem navigationTabSetItem, @Y61.k PublishIntentFactory.SuggestLocationsFlowType suggestLocationsFlowType, @Y61.l String str4, @Y61.l AddressParameter.ValidationRules validationRules, @Y61.l String str5, @Y61.l String str6, @Y61.l Boolean bool) {
        boolean z12 = false;
        boolean z13 = false;
        if (navigationTabSetItem != null) {
            return this.f292329b.d(new SuggestLocationsFragmentData(new SuggestLocationsArguments(str, str2, num, str3, locationPickerChooseButtonLocation, suggestLocationsFlowType, str4, validationRules, z12, z13, false, str5, null, str6, bool, 5120, null), navigationTabSetItem));
        }
        SuggestLocationsActivity.f292122m.getClass();
        return new Intent(this.f292328a, (Class<?>) SuggestLocationsActivity.class).putExtra("extra_location_id", str).putExtra("extra_category_id", str2).putExtra("extra_from_block", num).putExtra("extra_query", str3).putExtra("extra_choose_button_location", locationPickerChooseButtonLocation).putExtra("extra_suggest_flow_type", suggestLocationsFlowType).putExtra("extra_geo_session_id", str4).putExtra("extra_validation_rules", validationRules).putExtra("extra_auto_open_keyboard", false).putExtra("extra_use_legacy_api", false).putExtra("public_user_key", str5).putExtra("extra_param_id", str6).putExtra("extra_only_real_locations", bool);
    }
}
