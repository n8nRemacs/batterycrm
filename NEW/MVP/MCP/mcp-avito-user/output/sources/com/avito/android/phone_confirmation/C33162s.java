package com.avito.android.phone_confirmation;

import com.avito.android.phone_confirmation.state.PhoneConfirmationScreenState;
import com.avito.android.phone_confirmation.state.PhoneConfirmationTime;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: PhoneConfirmationBinder.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", VoiceInfo.STATE, "Lcom/avito/android/phone_confirmation/state/PhoneConfirmationScreenState;", "apply", "(ZLcom/avito/android/phone_confirmation/state/PhoneConfirmationScreenState;)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.phone_confirmation.s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C33162s<T1, T2, R> implements l41.c {

    /* renamed from: b, reason: collision with root package name */
    public static final C33162s<T1, T2, R> f215944b = new C33162s<>();

    @Override // l41.c
    public final Object apply(Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        PhoneConfirmationTime phoneConfirmationTime = ((PhoneConfirmationScreenState) obj2).f215959f;
        return Long.valueOf(phoneConfirmationTime != null ? phoneConfirmationTime.f215966c : 0L);
    }
}
