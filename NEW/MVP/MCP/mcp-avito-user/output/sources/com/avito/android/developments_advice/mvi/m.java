package com.avito.android.developments_advice.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.developments_advice.mvi.entity.DevelopmentsAdviceInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import mw.InterfaceC44145b;

/* compiled from: DevelopmentsAdviceOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_advice/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "Lmw/b;", "<init>", "()V", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements t<DevelopmentsAdviceInternalAction, InterfaceC44145b> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC44145b b(DevelopmentsAdviceInternalAction developmentsAdviceInternalAction) {
        DevelopmentsAdviceInternalAction developmentsAdviceInternalAction2 = developmentsAdviceInternalAction;
        if (developmentsAdviceInternalAction2 instanceof DevelopmentsAdviceInternalAction.PhoneInputError) {
            return new InterfaceC44145b.g(((DevelopmentsAdviceInternalAction.PhoneInputError) developmentsAdviceInternalAction2).f136152b);
        }
        if (developmentsAdviceInternalAction2 instanceof DevelopmentsAdviceInternalAction.NameInputError) {
            return new InterfaceC44145b.f(((DevelopmentsAdviceInternalAction.NameInputError) developmentsAdviceInternalAction2).f136150b);
        }
        if (developmentsAdviceInternalAction2 instanceof DevelopmentsAdviceInternalAction.QuestionInputError) {
            return new InterfaceC44145b.h(((DevelopmentsAdviceInternalAction.QuestionInputError) developmentsAdviceInternalAction2).f136157b);
        }
        if (developmentsAdviceInternalAction2 instanceof DevelopmentsAdviceInternalAction.BackWithAction) {
            return new InterfaceC44145b.C11849b(((DevelopmentsAdviceInternalAction.BackWithAction) developmentsAdviceInternalAction2).f136144b);
        }
        if (developmentsAdviceInternalAction2 instanceof DevelopmentsAdviceInternalAction.BackWithToast) {
            return new InterfaceC44145b.c(((DevelopmentsAdviceInternalAction.BackWithToast) developmentsAdviceInternalAction2).f136145b);
        }
        if (developmentsAdviceInternalAction2 instanceof DevelopmentsAdviceInternalAction.RequestError) {
            return new InterfaceC44145b.i(((DevelopmentsAdviceInternalAction.RequestError) developmentsAdviceInternalAction2).f136158b);
        }
        if (developmentsAdviceInternalAction2 instanceof DevelopmentsAdviceInternalAction.PhoneNeedVerification) {
            return new InterfaceC44145b.e(((DevelopmentsAdviceInternalAction.PhoneNeedVerification) developmentsAdviceInternalAction2).f136154c);
        }
        if (developmentsAdviceInternalAction2 instanceof DevelopmentsAdviceInternalAction.OpenDeeplink) {
            return new InterfaceC44145b.d(((DevelopmentsAdviceInternalAction.OpenDeeplink) developmentsAdviceInternalAction2).f136151b);
        }
        if (developmentsAdviceInternalAction2.equals(DevelopmentsAdviceInternalAction.CloseScreen.f136146b)) {
            return InterfaceC44145b.a.f414808a;
        }
        return null;
    }
}
