package com.avito.android.phone_confirmation;

import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneConfirmationIntentFactoryImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_confirmation/Q;", "Lcom/avito/android/phone_confirmation/P;", "_avito_phone-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Q implements P {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f215883a;

    @Inject
    public Q(@Y61.k Context context) {
        this.f215883a = context;
    }

    @Override // com.avito.android.phone_confirmation.P
    @Y61.k
    public final Intent a(@Y61.k String str, @Y61.l String str2, boolean z12, boolean z13) {
        return new Intent(this.f215883a, (Class<?>) PhoneConfirmationActivity.class).setFlags(603979776).putExtra("phone", str).putExtra("manager", str2).putExtra("is_company", z12).putExtra("consultation_form", z13);
    }
}
