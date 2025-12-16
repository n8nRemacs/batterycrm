package com.avito.android.phone_confirmation;

import com.avito.android.phone_confirmation.state.PhoneConfirmationScreenState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: PhoneConfirmationBinder.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "visible", "Lcom/avito/android/phone_confirmation/state/PhoneConfirmationScreenState;", VoiceInfo.STATE, "Lcom/avito/android/phone_confirmation/view/i;", "apply", "(ZLcom/avito/android/phone_confirmation/state/PhoneConfirmationScreenState;)Lcom/avito/android/phone_confirmation/view/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class N<T1, T2, R> implements l41.c {

    /* renamed from: b, reason: collision with root package name */
    public static final N<T1, T2, R> f215874b = new N<>();

    @Override // l41.c
    public final Object apply(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        PhoneConfirmationScreenState phoneConfirmationScreenState = (PhoneConfirmationScreenState) obj2;
        String str = phoneConfirmationScreenState.f215963j;
        if (str == null) {
            str = phoneConfirmationScreenState.f215962i;
        }
        return new com.avito.android.phone_confirmation.view.i(zBooleanValue, str);
    }
}
