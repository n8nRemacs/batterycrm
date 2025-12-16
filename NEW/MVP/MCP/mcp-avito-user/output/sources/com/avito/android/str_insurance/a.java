package com.avito.android.str_insurance;

import Xy0.InterfaceC17065e;
import Y61.k;
import android.app.Application;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrInsuranceIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_insurance/a;", "LXy0/e;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements InterfaceC17065e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f288545a;

    @Inject
    public a(@k Application application) {
        this.f288545a = application;
    }

    @Override // Xy0.InterfaceC17065e
    @k
    public final Intent a(@k InsuranceData insuranceData) {
        StrInsuranceActivity.f288539o.getClass();
        Intent intent = new Intent(this.f288545a, (Class<?>) StrInsuranceActivity.class);
        intent.putExtra("key_insurance_data", insuranceData);
        return intent;
    }
}
