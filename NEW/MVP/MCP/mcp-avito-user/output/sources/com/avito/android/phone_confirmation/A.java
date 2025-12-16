package com.avito.android.phone_confirmation;

import com.avito.android.phone_confirmation.state.PhoneConfirmationResolution;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneConfirmationBinder.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/phone_confirmation/state/PhoneConfirmationResolution;", "apply", "(Lcom/avito/android/phone_confirmation/state/PhoneConfirmationResolution;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class A<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PhoneConfirmationResolution[] f215860b;

    public A(PhoneConfirmationResolution[] phoneConfirmationResolutionArr) {
        this.f215860b = phoneConfirmationResolutionArr;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        PhoneConfirmationResolution phoneConfirmationResolution = (PhoneConfirmationResolution) obj;
        PhoneConfirmationResolution[] phoneConfirmationResolutionArr = this.f215860b;
        int length = phoneConfirmationResolutionArr.length;
        boolean z12 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            if (phoneConfirmationResolutionArr[i12] == phoneConfirmationResolution) {
                z12 = true;
                break;
            }
            i12++;
        }
        return Boolean.valueOf(z12);
    }
}
