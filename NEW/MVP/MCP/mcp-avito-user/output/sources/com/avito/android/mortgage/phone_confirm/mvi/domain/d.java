package com.avito.android.mortgage.phone_confirm.mvi.domain;

import androidx.compose.runtime.internal.P;
import com.avito.android.di.B;
import com.avito.android.mortgage.phone_confirm.mvi.entity.PhoneConfirmInternalAction;
import g00.AbstractC40505b;
import g00.C40508e;
import g00.InterfaceC40507d;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ResendCodeTimerInteractor.kt */
@B
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/phone_confirm/mvi/domain/d;", "Lg00/b;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends AbstractC40505b<PhoneConfirmInternalAction> {
    @Inject
    public d() {
        super(InterfaceC40507d.b.a(1.0f));
    }

    @Override // g00.AbstractC40505b
    public final Object a(InterfaceC40507d.a aVar) {
        return new PhoneConfirmInternalAction.TimerTick(kotlin.math.b.b(C40508e.b(aVar)));
    }
}
