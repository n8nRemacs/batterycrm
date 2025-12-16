package com.avito.android.btob_business_trip;

import Y61.k;
import android.app.Application;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import qk.InterfaceC47408a;

/* compiled from: B2bBusinessTripIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/a;", "Lqk/a;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements InterfaceC47408a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f107838a;

    @Inject
    public a(@k Application application) {
        this.f107838a = application;
    }

    @Override // qk.InterfaceC47408a
    @k
    public final Intent a() {
        B2bBusinessTripActivity.f107837m.getClass();
        return new Intent(this.f107838a, (Class<?>) B2bBusinessTripActivity.class);
    }
}
