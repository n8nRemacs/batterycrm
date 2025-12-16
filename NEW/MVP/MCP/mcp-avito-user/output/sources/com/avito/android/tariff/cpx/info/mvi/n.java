package com.avito.android.tariff.cpx.info.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff.cpx.info.mvi.entity.TariffCpxInfoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import wB0.InterfaceC49482b;

/* compiled from: TariffCpxInfoOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/info/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction;", "LwB0/b;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n implements t<TariffCpxInfoInternalAction, InterfaceC49482b> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49482b b(TariffCpxInfoInternalAction tariffCpxInfoInternalAction) {
        DeepLink deepLink;
        TariffCpxInfoInternalAction tariffCpxInfoInternalAction2 = tariffCpxInfoInternalAction;
        if (tariffCpxInfoInternalAction2 instanceof TariffCpxInfoInternalAction.Content) {
            DeepLink uxFeedbackUri = ((TariffCpxInfoInternalAction.Content) tariffCpxInfoInternalAction2).f296713b.getUxFeedbackUri();
            if (uxFeedbackUri != null) {
                return new InterfaceC49482b.C12812b(uxFeedbackUri);
            }
            return null;
        }
        if (tariffCpxInfoInternalAction2 instanceof TariffCpxInfoInternalAction.Back) {
            return InterfaceC49482b.a.f441318a;
        }
        if (tariffCpxInfoInternalAction2 instanceof TariffCpxInfoInternalAction.Error.OnScreenError) {
            return new InterfaceC49482b.c(((TariffCpxInfoInternalAction.Error.OnScreenError) tariffCpxInfoInternalAction2).f296714b);
        }
        if (!(tariffCpxInfoInternalAction2 instanceof TariffCpxInfoInternalAction.HandleDeeplink) || (deepLink = ((TariffCpxInfoInternalAction.HandleDeeplink) tariffCpxInfoInternalAction2).f296716b) == null) {
            return null;
        }
        return new InterfaceC49482b.C12812b(deepLink);
    }
}
