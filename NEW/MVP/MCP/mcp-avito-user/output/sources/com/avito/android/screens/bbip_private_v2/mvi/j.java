package com.avito.android.screens.bbip_private_v2.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.error.z;
import com.avito.android.remote.error.ApiError;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction;
import com.avito.android.util.ApiException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import tp0.InterfaceC48700a;
import tp0.InterfaceC48701b;

/* compiled from: BbipPrivateV2OneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "Ltp0/b;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements t<BbipPrivateV2InternalAction, InterfaceC48701b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC48701b b(BbipPrivateV2InternalAction bbipPrivateV2InternalAction) {
        InterfaceC48701b c12682b;
        BbipPrivateV2InternalAction bbipPrivateV2InternalAction2 = bbipPrivateV2InternalAction;
        if (bbipPrivateV2InternalAction2 instanceof BbipPrivateV2InternalAction.CloseScreen) {
            return InterfaceC48701b.a.f439457a;
        }
        if (bbipPrivateV2InternalAction2 instanceof BbipPrivateV2InternalAction.HandleDeeplink) {
            DeepLink deepLink = ((BbipPrivateV2InternalAction.HandleDeeplink) bbipPrivateV2InternalAction2).f261007b;
            if (deepLink != null) {
                c12682b = new InterfaceC48701b.c(deepLink);
                return c12682b;
            }
            return null;
        }
        if (bbipPrivateV2InternalAction2 instanceof BbipPrivateV2InternalAction.ContextContent) {
            c12682b = new InterfaceC48701b.c(((BbipPrivateV2InternalAction.ContextContent) bbipPrivateV2InternalAction2).f260994b.getDeepLink());
        } else {
            if (!(bbipPrivateV2InternalAction2 instanceof BbipPrivateV2InternalAction.ShowMnzUxFeedback)) {
                if (bbipPrivateV2InternalAction2 instanceof BbipPrivateV2InternalAction.ForecastError) {
                    BbipPrivateV2InternalAction.ForecastError forecastError = (BbipPrivateV2InternalAction.ForecastError) bbipPrivateV2InternalAction2;
                    ApiException apiException = forecastError.f261000b;
                    ApiError apiErrorM = z.m(apiException);
                    InterfaceC48700a interfaceC48700a = apiErrorM instanceof ApiError.InternalError ? null : apiErrorM instanceof ApiError.IncorrectData ? InterfaceC48700a.m.f439455a : InterfaceC48700a.l.f439454a;
                    boolean z12 = forecastError.f261001c;
                    return new InterfaceC48701b.d(apiException, z12 ? null : interfaceC48700a, z12);
                }
                if (bbipPrivateV2InternalAction2 instanceof BbipPrivateV2InternalAction.ContextError) {
                    ApiException apiException2 = ((BbipPrivateV2InternalAction.ContextError) bbipPrivateV2InternalAction2).f260995b;
                    return new InterfaceC48701b.d(apiException2, z.m(apiException2) instanceof ApiError.InternalError ? InterfaceC48700a.m.f439455a : InterfaceC48700a.l.f439454a, false, 4, null);
                }
                if (bbipPrivateV2InternalAction2 instanceof BbipPrivateV2InternalAction.ForecastRequired) {
                    c12682b = new InterfaceC48701b.C12682b(((BbipPrivateV2InternalAction.ForecastRequired) bbipPrivateV2InternalAction2).f261006b);
                }
                return null;
            }
            c12682b = new InterfaceC48701b.e(((BbipPrivateV2InternalAction.ShowMnzUxFeedback) bbipPrivateV2InternalAction2).f261012b);
        }
        return c12682b;
    }
}
