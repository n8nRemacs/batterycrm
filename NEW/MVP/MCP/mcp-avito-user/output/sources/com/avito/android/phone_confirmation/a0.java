package com.avito.android.phone_confirmation;

import android.app.Activity;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhoneConfirmationRouter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_confirmation/a0;", "Lcom/avito/android/phone_confirmation/Z;", "_avito_phone-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a0 implements Z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Activity f215895a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.date_time_picker.h f215896b = new com.avito.android.date_time_picker.h(this, 2);

    @Inject
    public a0(@Y61.k Activity activity) {
        this.f215895a = activity;
    }

    @Override // com.avito.android.phone_confirmation.Z
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final com.avito.android.date_time_picker.h getF215896b() {
        return this.f215896b;
    }
}
