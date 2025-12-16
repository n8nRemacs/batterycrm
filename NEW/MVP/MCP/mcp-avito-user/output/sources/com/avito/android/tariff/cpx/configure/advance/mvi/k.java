package com.avito.android.tariff.cpx.configure.advance.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff.cpx.configure.advance.mvi.entity.CpxConfigureAdvanceInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import mB0.d;

/* compiled from: CpxConfigureAdvanceOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction;", "LmB0/d;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements t<CpxConfigureAdvanceInternalAction, mB0.d> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final mB0.d b(CpxConfigureAdvanceInternalAction cpxConfigureAdvanceInternalAction) {
        CpxConfigureAdvanceInternalAction.HandleDeepLink handleDeepLink;
        DeepLink deepLink;
        CpxConfigureAdvanceInternalAction cpxConfigureAdvanceInternalAction2 = cpxConfigureAdvanceInternalAction;
        if (cpxConfigureAdvanceInternalAction2 instanceof CpxConfigureAdvanceInternalAction.Close) {
            return d.a.f414377a;
        }
        d.b bVar = null;
        if ((cpxConfigureAdvanceInternalAction2 instanceof CpxConfigureAdvanceInternalAction.HandleDeepLink) && (deepLink = (handleDeepLink = (CpxConfigureAdvanceInternalAction.HandleDeepLink) cpxConfigureAdvanceInternalAction2).f295752b) != null) {
            bVar = new d.b(deepLink, handleDeepLink.f295753c);
        }
        return bVar;
    }
}
