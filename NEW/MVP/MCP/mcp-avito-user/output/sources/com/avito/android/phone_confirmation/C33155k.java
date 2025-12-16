package com.avito.android.phone_confirmation;

import com.avito.android.phone_confirmation.state.PhoneConfirmationScreenState;
import com.avito.android.util.K5;
import kotlin.Metadata;

/* compiled from: PhoneConfirmationBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/phone_confirmation/state/PhoneConfirmationScreenState;", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.phone_confirmation.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C33155k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PhoneConfirmationScreenState f215935b;

    public C33155k(PhoneConfirmationScreenState phoneConfirmationScreenState) {
        this.f215935b = phoneConfirmationScreenState;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (K5.d(th2)) {
            return PhoneConfirmationScreenState.a(this.f215935b, null, null, false, null, null, th2.getMessage(), null, 767);
        }
        if (K5.e(th2)) {
            return PhoneConfirmationScreenState.a(this.f215935b, null, null, true, null, null, null, null, 991);
        }
        return PhoneConfirmationScreenState.a(this.f215935b, null, null, false, null, com.avito.android.error.z.l(th2), null, null, 895);
    }
}
