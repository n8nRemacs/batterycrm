package com.avito.android.phone_confirmation.di;

import Y61.k;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.phone_confirmation.PhoneConfirmationActivity;
import com.avito.android.phone_confirmation.state.PhoneConfirmationScreenState;
import h31.d;
import kotlin.Metadata;

/* compiled from: PhoneConfirmationComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/phone_confirmation/di/b;", "", "a", "_avito_phone-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: PhoneConfirmationComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_confirmation/di/b$a;", "", "_avito_phone-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @h31.b
        @k
        a a(@k PhoneConfirmationActivity phoneConfirmationActivity);

        @k
        a b(@k c cVar);

        @k
        b build();

        @h31.b
        @k
        a c(boolean z12);

        @h31.b
        @k
        a d(@k PhoneConfirmationScreenState phoneConfirmationScreenState);
    }

    void a(@k PhoneConfirmationActivity phoneConfirmationActivity);
}
