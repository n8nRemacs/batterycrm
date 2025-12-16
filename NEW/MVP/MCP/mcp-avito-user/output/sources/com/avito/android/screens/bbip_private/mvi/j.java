package com.avito.android.screens.bbip_private.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.error.z;
import com.avito.android.remote.error.ApiError;
import com.avito.android.screens.bbip_private.mvi.entity.BbipPrivateInternalAction;
import com.avito.android.util.ApiException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rp0.InterfaceC47705a;
import rp0.InterfaceC47706b;

/* compiled from: BbipPrivateOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/screens/bbip_private/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "Lrp0/b;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements t<BbipPrivateInternalAction, InterfaceC47706b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC47706b b(BbipPrivateInternalAction bbipPrivateInternalAction) {
        InterfaceC47706b dVar;
        BbipPrivateInternalAction bbipPrivateInternalAction2 = bbipPrivateInternalAction;
        if (bbipPrivateInternalAction2 instanceof BbipPrivateInternalAction.CloseScreen) {
            return InterfaceC47706b.a.f430239a;
        }
        InterfaceC47706b.d dVar2 = null;
        dVar2 = null;
        if (bbipPrivateInternalAction2 instanceof BbipPrivateInternalAction.HandleDeeplink) {
            DeepLink deepLink = ((BbipPrivateInternalAction.HandleDeeplink) bbipPrivateInternalAction2).f260605b;
            if (deepLink != null) {
                dVar = new InterfaceC47706b.C12396b(deepLink);
                return dVar;
            }
            return dVar2;
        }
        if (bbipPrivateInternalAction2 instanceof BbipPrivateInternalAction.ContextContent) {
            dVar = new InterfaceC47706b.C12396b(((BbipPrivateInternalAction.ContextContent) bbipPrivateInternalAction2).f260595b.getDeepLink());
        } else if (bbipPrivateInternalAction2 instanceof BbipPrivateInternalAction.ShowMnzUxFeedback) {
            dVar = new InterfaceC47706b.e(((BbipPrivateInternalAction.ShowMnzUxFeedback) bbipPrivateInternalAction2).f260607b);
        } else {
            if (!(bbipPrivateInternalAction2 instanceof BbipPrivateInternalAction.ForecastError)) {
                if (bbipPrivateInternalAction2 instanceof BbipPrivateInternalAction.ContextError) {
                    ApiException apiException = ((BbipPrivateInternalAction.ContextError) bbipPrivateInternalAction2).f260596b;
                    dVar2 = new InterfaceC47706b.d(apiException, z.m(apiException) instanceof ApiError.InternalError ? InterfaceC47705a.i.f430237a : InterfaceC47705a.h.f430236a);
                } else if (bbipPrivateInternalAction2 instanceof BbipPrivateInternalAction.ScrollToScreenTop) {
                    return InterfaceC47706b.c.f430241a;
                }
                return dVar2;
            }
            ApiException apiException2 = ((BbipPrivateInternalAction.ForecastError) bbipPrivateInternalAction2).f260601b;
            ApiError apiErrorM = z.m(apiException2);
            dVar = new InterfaceC47706b.d(apiException2, apiErrorM instanceof ApiError.InternalError ? null : apiErrorM instanceof ApiError.IncorrectData ? InterfaceC47705a.i.f430237a : InterfaceC47705a.h.f430236a);
        }
        return dVar;
    }
}
