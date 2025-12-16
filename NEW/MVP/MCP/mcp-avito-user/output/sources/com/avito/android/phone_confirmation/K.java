package com.avito.android.phone_confirmation;

import com.avito.android.phone_confirmation.state.PhoneConfirmationScreenState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;

/* compiled from: PhoneConfirmationBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/phone_confirmation/state/PhoneConfirmationScreenState;", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/phone_confirmation/state/PhoneConfirmationScreenState;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class K<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f215870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35745a5 f215871c;

    public K(U u12, InterfaceC35745a5 interfaceC35745a5) {
        this.f215870b = u12;
        this.f215871c = interfaceC35745a5;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        PhoneConfirmationScreenState phoneConfirmationScreenState = (PhoneConfirmationScreenState) obj;
        io.reactivex.rxjava3.internal.operators.observable.O oB2 = this.f215870b.b(phoneConfirmationScreenState.f215955b, phoneConfirmationScreenState.f215956c);
        InterfaceC35745a5 interfaceC35745a5 = this.f215871c;
        return oB2.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.c()).d0(new I(phoneConfirmationScreenState)).m0(new J(phoneConfirmationScreenState));
    }
}
