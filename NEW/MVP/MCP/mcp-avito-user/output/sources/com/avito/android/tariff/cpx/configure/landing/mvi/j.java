package com.avito.android.tariff.cpx.configure.landing.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff.cpx.configure.landing.mvi.entity.CpxConfigureLandingInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import qB0.InterfaceC47273d;

/* compiled from: CpxConfigureLandingOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/landing/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/tariff/cpx/configure/landing/mvi/entity/CpxConfigureLandingInternalAction;", "LqB0/d;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements t<CpxConfigureLandingInternalAction, InterfaceC47273d> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC47273d b(CpxConfigureLandingInternalAction cpxConfigureLandingInternalAction) {
        DeepLink deepLink;
        CpxConfigureLandingInternalAction cpxConfigureLandingInternalAction2 = cpxConfigureLandingInternalAction;
        if (cpxConfigureLandingInternalAction2 instanceof CpxConfigureLandingInternalAction.Close) {
            return InterfaceC47273d.a.f429092a;
        }
        if (!(cpxConfigureLandingInternalAction2 instanceof CpxConfigureLandingInternalAction.HandleDeeplink) || (deepLink = ((CpxConfigureLandingInternalAction.HandleDeeplink) cpxConfigureLandingInternalAction2).f296030b) == null) {
            return null;
        }
        return new InterfaceC47273d.b(deepLink);
    }
}
