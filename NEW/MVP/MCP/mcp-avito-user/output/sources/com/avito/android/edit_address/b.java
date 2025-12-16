package com.avito.android.edit_address;

import android.app.Application;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.geo_common.model.location_picker.LocationFlowType;
import com.avito.android.location_picker.LocationPickerActivity;
import com.avito.android.location_picker.LocationPickerArguments;
import com.avito.android.location_picker.analytics.LocationPickerScreenOpenEvent;
import com.avito.android.location_picker.view.LocationPickerChooseButtonLocation;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EditAddressIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_address/b;", "Lcom/avito/android/edit_address/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f145822a;

    @Inject
    public b(@Y61.k Application application) {
        this.f145822a = application;
    }

    @Override // com.avito.android.edit_address.a
    @Y61.k
    public final Intent a() {
        LocationPickerActivity.a aVar = LocationPickerActivity.f182141m;
        AddressParameter.Value value = null;
        String str = null;
        Radius radius = null;
        String str2 = null;
        LocationPickerChooseButtonLocation locationPickerChooseButtonLocation = null;
        SearchParams searchParams = null;
        PublishIntentFactory.JobAssistantParams jobAssistantParams = null;
        AddressParameter.ValidationRules validationRules = null;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        LocationPickerScreenOpenEvent.EventSource eventSource = null;
        boolean z15 = false;
        LocationPickerArguments locationPickerArguments = new LocationPickerArguments(value, str, radius, str2, locationPickerChooseButtonLocation, searchParams, jobAssistantParams, validationRules, z12, z13, z14, eventSource, z15, null, false, LocationFlowType.f159419g, 32766, null);
        aVar.getClass();
        return new Intent(this.f145822a, (Class<?>) LocationPickerActivity.class).putExtra("extra.arguments", locationPickerArguments);
    }
}
