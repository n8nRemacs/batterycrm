package com.avito.android.tariff.cpa.info.mvi;

import androidx.compose.runtime.internal.P;
import bB0.InterfaceC25489b;
import com.avito.android.arch.mvi.t;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: CpaInfoOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "LbB0/b;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements t<CpaInfoInternalAction, InterfaceC25489b> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC25489b b(CpaInfoInternalAction cpaInfoInternalAction) {
        InterfaceC25489b dVar;
        CpaInfoInternalAction cpaInfoInternalAction2 = cpaInfoInternalAction;
        if (cpaInfoInternalAction2 instanceof CpaInfoInternalAction.CloseScreen) {
            return InterfaceC25489b.C1996b.f56988a;
        }
        if (cpaInfoInternalAction2 instanceof CpaInfoInternalAction.RefillLoading) {
            return new InterfaceC25489b.f(true);
        }
        if (cpaInfoInternalAction2 instanceof CpaInfoInternalAction.RefillContent) {
            return InterfaceC25489b.a.f56987a;
        }
        if (cpaInfoInternalAction2 instanceof CpaInfoInternalAction.RefillError) {
            return new InterfaceC25489b.f(false);
        }
        if (cpaInfoInternalAction2 instanceof CpaInfoInternalAction.InputChange) {
            StringBuilder sb2 = new StringBuilder();
            String str = ((CpaInfoInternalAction.InputChange) cpaInfoInternalAction2).f294744b;
            int length = str.length();
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = str.charAt(i12);
                if (Character.isDigit(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            Long lZ02 = C43066x.z0(sb2.toString());
            return new InterfaceC25489b.h((lZ02 != null ? lZ02.longValue() : 0L) > 0);
        }
        if (cpaInfoInternalAction2 instanceof CpaInfoInternalAction.OpenDeeplink) {
            dVar = new InterfaceC25489b.c(((CpaInfoInternalAction.OpenDeeplink) cpaInfoInternalAction2).f294754b);
        } else if (cpaInfoInternalAction2 instanceof CpaInfoInternalAction.OpenDialog) {
            dVar = new InterfaceC25489b.e(((CpaInfoInternalAction.OpenDialog) cpaInfoInternalAction2).f294755b);
        } else if (cpaInfoInternalAction2 instanceof CpaInfoInternalAction.ShowErrorRefillMsg) {
            dVar = new InterfaceC25489b.g(((CpaInfoInternalAction.ShowErrorRefillMsg) cpaInfoInternalAction2).f294762b, ToastBarPosition.f181046d);
        } else if (cpaInfoInternalAction2 instanceof CpaInfoInternalAction.ShowPaymentMsg) {
            dVar = new InterfaceC25489b.g(((CpaInfoInternalAction.ShowPaymentMsg) cpaInfoInternalAction2).f294763b, ToastBarPosition.f181047e);
        } else {
            if (!(cpaInfoInternalAction2 instanceof CpaInfoInternalAction.Redirect)) {
                return null;
            }
            dVar = new InterfaceC25489b.d(((CpaInfoInternalAction.Redirect) cpaInfoInternalAction2).f294756b);
        }
        return dVar;
    }
}
