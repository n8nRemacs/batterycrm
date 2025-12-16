package com.avito.android.location_picker.providers;

import com.avito.android.analytics.clickstream.I;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import io.reactivex.rxjava3.internal.operators.single.U;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AddressValidationProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/providers/d;", "Lcom/avito/android/location_picker/providers/b;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.location_picker.providers.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31567d implements InterfaceC31565b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo_common.interactor.g f182445a;

    @Inject
    public C31567d(@Y61.k com.avito.android.geo_common.interactor.g gVar) {
        this.f182445a = gVar;
    }

    @Override // com.avito.android.location_picker.providers.InterfaceC31565b
    @Y61.k
    public final U a(@Y61.k String str, @Y61.k AddressParameter.ValidationRules validationRules) {
        return this.f182445a.u(str, validationRules.convertToFieldMap()).S().r(C31566c.f182444b).u(new I(20));
    }
}
