package com.avito.android.phone_confirmation;

import com.avito.android.phone_confirmation.state.PhoneConfirmationScreenState;
import com.avito.android.remote.model.SuccessResult;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import kotlin.Metadata;

/* compiled from: PhoneConfirmationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_confirmation/U;", "", "_avito_phone-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface U {
    @Y61.k
    B0 a();

    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.O b(@Y61.k String str, boolean z12);

    @Y61.k
    com.avito.android.server_time.f c();

    @Y61.k
    io.reactivex.rxjava3.core.z<SuccessResult> d(@Y61.k String str, @Y61.k String str2, boolean z12);

    @Y61.k
    PhoneConfirmationScreenState f0();

    @Y61.k
    com.jakewharton.rxrelay3.b getState();
}
