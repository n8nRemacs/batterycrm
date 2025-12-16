package com.avito.android.tariff.cpx.limit.sheet.mvi;

import NB0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff.cpx.limit.sheet.mvi.entity.TariffCpxLimitInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffCpxLimitOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction;", "LNB0/b;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n implements t<TariffCpxLimitInternalAction, NB0.b> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final NB0.b b(TariffCpxLimitInternalAction tariffCpxLimitInternalAction) {
        TariffCpxLimitInternalAction.HandleChangeDeeplink handleChangeDeeplink;
        DeepLink deepLink;
        NB0.b c0723b;
        TariffCpxLimitInternalAction tariffCpxLimitInternalAction2 = tariffCpxLimitInternalAction;
        if (tariffCpxLimitInternalAction2 instanceof TariffCpxLimitInternalAction.Close) {
            return b.a.f11299a;
        }
        if (tariffCpxLimitInternalAction2 instanceof TariffCpxLimitInternalAction.HandleCancelDeeplink) {
            c0723b = new b.c(((TariffCpxLimitInternalAction.HandleCancelDeeplink) tariffCpxLimitInternalAction2).f297318b);
        } else {
            if (!(tariffCpxLimitInternalAction2 instanceof TariffCpxLimitInternalAction.CloseWithResult)) {
                NB0.b dVar = null;
                if (tariffCpxLimitInternalAction2 instanceof TariffCpxLimitInternalAction.HandleSaveDeeplink) {
                    TariffCpxLimitInternalAction.HandleSaveDeeplink handleSaveDeeplink = (TariffCpxLimitInternalAction.HandleSaveDeeplink) tariffCpxLimitInternalAction2;
                    DeepLink deepLink2 = handleSaveDeeplink.f297321b;
                    if (deepLink2 != null) {
                        dVar = new b.e(deepLink2, handleSaveDeeplink.f297322c);
                    }
                } else if ((tariffCpxLimitInternalAction2 instanceof TariffCpxLimitInternalAction.HandleChangeDeeplink) && (deepLink = (handleChangeDeeplink = (TariffCpxLimitInternalAction.HandleChangeDeeplink) tariffCpxLimitInternalAction2).f297319b) != null) {
                    dVar = new b.d(deepLink, handleChangeDeeplink.f297320c);
                }
                return dVar;
            }
            c0723b = new b.C0723b(((TariffCpxLimitInternalAction.CloseWithResult) tariffCpxLimitInternalAction2).f297316b);
        }
        return c0723b;
    }
}
