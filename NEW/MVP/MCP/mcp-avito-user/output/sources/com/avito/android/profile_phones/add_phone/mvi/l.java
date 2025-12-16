package com.avito.android.profile_phones.add_phone.mvi;

import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile_phones.add_phone.mvi.entity.AddPhoneInternalAction;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import nb0.InterfaceC44372b;

/* compiled from: AddPhoneOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction;", "Lnb0/b;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements t<AddPhoneInternalAction, InterfaceC44372b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f226941b;

    @Inject
    public l(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f226941b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC44372b b(AddPhoneInternalAction addPhoneInternalAction) {
        InterfaceC44372b fVar;
        String message;
        AddPhoneInternalAction addPhoneInternalAction2 = addPhoneInternalAction;
        if (addPhoneInternalAction2.equals(AddPhoneInternalAction.RoutingGoBack.f226910b)) {
            return InterfaceC44372b.C11864b.f415199a;
        }
        if (!(addPhoneInternalAction2 instanceof AddPhoneInternalAction.RoutingFinish)) {
            PrintableText printableTextC = null;
            if (!(addPhoneInternalAction2 instanceof AddPhoneInternalAction.Loading)) {
                if (addPhoneInternalAction2 instanceof AddPhoneInternalAction.Error) {
                    AddPhoneInternalAction.Error error = (AddPhoneInternalAction.Error) addPhoneInternalAction2;
                    if (error.f226902b == null) {
                        Throwable th2 = error.f226903c;
                        if (th2 != null && (message = th2.getMessage()) != null) {
                            printableTextC = com.avito.android.printable_text.b.f(message);
                        }
                        if (printableTextC == null) {
                            printableTextC = com.avito.android.printable_text.b.c(R.string.confirm_phone_action_error, new Serializable[0]);
                        }
                        fVar = new InterfaceC44372b.g(printableTextC, th2);
                    }
                } else if (!addPhoneInternalAction2.equals(AddPhoneInternalAction.Ok.f226905b)) {
                    if (addPhoneInternalAction2 instanceof AddPhoneInternalAction.ErrorDialog) {
                        fVar = new InterfaceC44372b.h(((AddPhoneInternalAction.ErrorDialog) addPhoneInternalAction2).f226904b);
                    } else if (addPhoneInternalAction2 instanceof AddPhoneInternalAction.PhoneReverificationInfoAccepted) {
                        fVar = new InterfaceC44372b.e(((AddPhoneInternalAction.PhoneReverificationInfoAccepted) addPhoneInternalAction2).f226907b);
                    } else if (addPhoneInternalAction2 instanceof AddPhoneInternalAction.OkWithDeeplink) {
                        b.a.a(this.f226941b, ((AddPhoneInternalAction.OkWithDeeplink) addPhoneInternalAction2).f226906b, null, null, 6);
                    } else if (addPhoneInternalAction2 instanceof AddPhoneInternalAction.AddPhoneResultOk) {
                        AddPhoneInternalAction.AddPhoneResultOk addPhoneResultOk = (AddPhoneInternalAction.AddPhoneResultOk) addPhoneInternalAction2;
                        fVar = new InterfaceC44372b.d(addPhoneResultOk.f226900b, addPhoneResultOk.f226901c);
                    } else if (addPhoneInternalAction2 instanceof AddPhoneInternalAction.RoutingGoToPhoneAllowReverificationInfo) {
                        AddPhoneInternalAction.RoutingGoToPhoneAllowReverificationInfo routingGoToPhoneAllowReverificationInfo = (AddPhoneInternalAction.RoutingGoToPhoneAllowReverificationInfo) addPhoneInternalAction2;
                        fVar = new InterfaceC44372b.c(routingGoToPhoneAllowReverificationInfo.f226911b, routingGoToPhoneAllowReverificationInfo.f226912c, routingGoToPhoneAllowReverificationInfo.f226913d);
                    } else {
                        if (!(addPhoneInternalAction2 instanceof AddPhoneInternalAction.RoutingGoToPhoneDisallowReverificationInfo)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AddPhoneInternalAction.RoutingGoToPhoneDisallowReverificationInfo routingGoToPhoneDisallowReverificationInfo = (AddPhoneInternalAction.RoutingGoToPhoneDisallowReverificationInfo) addPhoneInternalAction2;
                        fVar = new InterfaceC44372b.f(routingGoToPhoneDisallowReverificationInfo.f226914b, routingGoToPhoneDisallowReverificationInfo.f226915c, routingGoToPhoneDisallowReverificationInfo.f226916d);
                    }
                }
            }
            return null;
        }
        AddPhoneInternalAction.RoutingFinish routingFinish = (AddPhoneInternalAction.RoutingFinish) addPhoneInternalAction2;
        fVar = new InterfaceC44372b.a(routingFinish.f226909c, routingFinish.f226908b);
        return fVar;
    }
}
