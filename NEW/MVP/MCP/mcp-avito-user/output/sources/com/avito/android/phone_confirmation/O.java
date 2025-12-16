package com.avito.android.phone_confirmation;

import com.avito.android.phone_confirmation.state.PhoneConfirmationResolution;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneConfirmationBinder.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_phone-confirmation_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class O {
    public static final C41982q1 a(U u12, InterfaceC35745a5 interfaceC35745a5, PhoneConfirmationResolution phoneConfirmationResolution) {
        return u12.getF215893c().N(new C33168y(phoneConfirmationResolution)).I0(u12.getF215892b(), C33169z.f216008b).x0(interfaceC35745a5.c());
    }

    public static final I0 b(U u12, InterfaceC35745a5 interfaceC35745a5, PhoneConfirmationResolution... phoneConfirmationResolutionArr) {
        return u12.getF215893c().d0(new A(phoneConfirmationResolutionArr)).x0(interfaceC35745a5.c()).j0(interfaceC35745a5.e());
    }
}
