package com.avito.android.user_adverts.tab_actions.host.mvi;

import com.avito.android.remote.error.ApiError;
import com.avito.android.user_adverts.model.UserAdvertActionPendingResult;
import com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsInternalAction;
import com.avito.android.user_adverts.tab_actions.host.mvi.entity.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import rI0.C47552a;

/* compiled from: UserAdvertsActionsEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/B;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class B implements com.avito.android.arch.mvi.t<UserAdvertsActionsInternalAction, com.avito.android.user_adverts.tab_actions.host.mvi.entity.a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.tab_actions.host.converter.a f314380b;

    @Inject
    public B(@Y61.k com.avito.android.user_adverts.tab_actions.host.converter.a aVar) {
        this.f314380b = aVar;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.android.arch.mvi.t
    public final com.avito.android.user_adverts.tab_actions.host.mvi.entity.a b(UserAdvertsActionsInternalAction userAdvertsActionsInternalAction) {
        UserAdvertsActionsInternalAction userAdvertsActionsInternalAction2 = userAdvertsActionsInternalAction;
        if (userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.HideActionsEvent) {
            UserAdvertsActionsInternalAction.HideActionsEvent hideActionsEvent = (UserAdvertsActionsInternalAction.HideActionsEvent) userAdvertsActionsInternalAction2;
            return new a.c(hideActionsEvent.f314428b, hideActionsEvent.f314429c);
        }
        if (userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.ErrorActionHandling) {
            ApiError apiError = ((UserAdvertsActionsInternalAction.ErrorActionHandling) userAdvertsActionsInternalAction2).f314421b;
            return new a.e(com.avito.android.printable_text.b.f(apiError != null ? com.avito.android.error.z.k(apiError) : com.avito.android.error.z.c()), apiError);
        }
        if (userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.NeedConfirmation) {
            UserAdvertsActionsInternalAction.NeedConfirmation needConfirmation = (UserAdvertsActionsInternalAction.NeedConfirmation) userAdvertsActionsInternalAction2;
            return new a.d(needConfirmation.f314432c, needConfirmation.f314433d, needConfirmation.f314435f, needConfirmation.f314434e, needConfirmation.f314431b);
        }
        if (userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.ResultActionHandling.Multiple) {
            UserAdvertsActionsInternalAction.ResultActionHandling.Multiple multiple = (UserAdvertsActionsInternalAction.ResultActionHandling.Multiple) userAdvertsActionsInternalAction2;
            if (!(multiple instanceof UserAdvertsActionsInternalAction.ResultActionHandling.Multiple.Cancelled)) {
                if (multiple instanceof UserAdvertsActionsInternalAction.ResultActionHandling.Multiple.Redirect) {
                    return new a.g(((UserAdvertsActionsInternalAction.ResultActionHandling.Multiple.Redirect) multiple).f314438b, "CPT_MASS_ACTIVATION_REQUEST_KEY");
                }
                if (!(multiple instanceof UserAdvertsActionsInternalAction.ResultActionHandling.Multiple.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                UserAdvertsActionsInternalAction.ResultActionHandling.Multiple.Success success = (UserAdvertsActionsInternalAction.ResultActionHandling.Multiple.Success) multiple;
                UserAdvertActionPendingResult userAdvertActionPendingResultA = this.f314380b.a(new C47552a(success.f314439b, success.f314440c, success.f314441d), success.f314442e);
                if (userAdvertActionPendingResultA instanceof UserAdvertActionPendingResult.Failure) {
                    UserAdvertActionPendingResult.Failure failure = (UserAdvertActionPendingResult.Failure) userAdvertActionPendingResultA;
                    return new a.C9711a(com.avito.android.printable_text.b.f(failure.f312162c), ((UserAdvertActionPendingResult.Failure) userAdvertActionPendingResultA).f312161b, failure.f312163d);
                }
                if (userAdvertActionPendingResultA instanceof UserAdvertActionPendingResult.Info) {
                    return new a.b((UserAdvertActionPendingResult.Info) userAdvertActionPendingResultA);
                }
                if (userAdvertActionPendingResultA instanceof UserAdvertActionPendingResult.Ok) {
                    return new a.f(((UserAdvertActionPendingResult.Ok) userAdvertActionPendingResultA).f312169b, com.avito.android.printable_text.b.f(((UserAdvertActionPendingResult.Ok) userAdvertActionPendingResultA).f312170c));
                }
                if (userAdvertActionPendingResultA instanceof UserAdvertActionPendingResult.Redirect) {
                    return new a.g(((UserAdvertActionPendingResult.Redirect) userAdvertActionPendingResultA).f312172c, null);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else if (userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.ResultActionHandling.Single) {
            UserAdvertsActionsInternalAction.ResultActionHandling.Single single = (UserAdvertsActionsInternalAction.ResultActionHandling.Single) userAdvertsActionsInternalAction2;
            if (!(single instanceof UserAdvertsActionsInternalAction.ResultActionHandling.Single.Cancelled)) {
                if (single instanceof UserAdvertsActionsInternalAction.ResultActionHandling.Single.Error) {
                    ApiError apiError2 = ((UserAdvertsActionsInternalAction.ResultActionHandling.Single.Error) single).f314445c;
                    return new a.e(com.avito.android.printable_text.b.f(com.avito.android.error.z.k(apiError2)), apiError2);
                }
                if (single instanceof UserAdvertsActionsInternalAction.ResultActionHandling.Single.Redirect) {
                    UserAdvertsActionsInternalAction.ResultActionHandling.Single.Redirect redirect = (UserAdvertsActionsInternalAction.ResultActionHandling.Single.Redirect) single;
                    return new a.i(redirect.f314447c, ((UserAdvertsActionsInternalAction.ResultActionHandling.Single.Redirect) single).f314446b, null, redirect.f314448d);
                }
                if (!(single instanceof UserAdvertsActionsInternalAction.ResultActionHandling.Single.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                UserAdvertsActionsInternalAction.ResultActionHandling.Single.Success success2 = (UserAdvertsActionsInternalAction.ResultActionHandling.Single.Success) single;
                UserAdvertsActionsInternalAction.ResultActionHandling.Single.Success success3 = (UserAdvertsActionsInternalAction.ResultActionHandling.Single.Success) single;
                String str = success2.f314451d;
                return new a.i(success2.f314450c, success3.f314449b, str != null ? com.avito.android.printable_text.b.f(str) : null, null);
            }
        } else {
            if (userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.HandleSingleAction) {
                UserAdvertsActionsInternalAction.HandleSingleAction handleSingleAction = (UserAdvertsActionsInternalAction.HandleSingleAction) userAdvertsActionsInternalAction2;
                return new a.h(handleSingleAction.f314424b, handleSingleAction.f314425c);
            }
            if (!(userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.StartActionHandling ? true : userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.ShowMultipleActions ? true : userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.ShowSingleActions ? true : userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.HideActions ? true : userAdvertsActionsInternalAction2 instanceof UserAdvertsActionsInternalAction.NoChange)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
