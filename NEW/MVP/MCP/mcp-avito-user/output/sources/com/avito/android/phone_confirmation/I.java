package com.avito.android.phone_confirmation;

import com.avito.android.phone_confirmation.state.PhoneConfirmationScreenState;
import com.avito.android.phone_confirmation.state.PhoneConfirmationTime;
import kotlin.Metadata;

/* compiled from: PhoneConfirmationBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/phone_confirmation/state/PhoneConfirmationScreenState;", "it", "Lcom/avito/android/phone_confirmation/state/PhoneConfirmationTime;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class I<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PhoneConfirmationScreenState f215868b;

    public I(PhoneConfirmationScreenState phoneConfirmationScreenState) {
        this.f215868b = phoneConfirmationScreenState;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        PhoneConfirmationTime phoneConfirmationTime = (PhoneConfirmationTime) obj;
        PhoneConfirmationScreenState phoneConfirmationScreenState = this.f215868b;
        return new PhoneConfirmationScreenState(phoneConfirmationScreenState.f215955b, phoneConfirmationScreenState.f215956c, true, false, phoneConfirmationTime, false, null, null, null, null, 1000, null);
    }
}
