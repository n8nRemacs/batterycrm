package com.avito.android.tariff.cpx.info.advance.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.tariff.deeplink.TariffCpxInfoAdvanceShowLinkBody;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;
import tB0.C48533d;
import tB0.InterfaceC48531b;

/* compiled from: TariffCpxInfoAdvanceReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/info/advance/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "LtB0/b;", "LtB0/d;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements u<InterfaceC48531b, C48533d> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C48533d a(InterfaceC48531b interfaceC48531b, C48533d c48533d) {
        InterfaceC48531b interfaceC48531b2 = interfaceC48531b;
        C48533d c48533d2 = c48533d;
        if (interfaceC48531b2 instanceof InterfaceC48531b.c) {
            TariffCpxInfoAdvanceShowLinkBody tariffCpxInfoAdvanceShowLinkBody = ((InterfaceC48531b.c) interfaceC48531b2).f439189a;
            return C48533d.a(c48533d2, tariffCpxInfoAdvanceShowLinkBody.getTitle(), tariffCpxInfoAdvanceShowLinkBody.getButton(), null, 4);
        }
        if (!(interfaceC48531b2 instanceof InterfaceC48531b.a)) {
            return c48533d2;
        }
        InterfaceC48531b.a aVar = (InterfaceC48531b.a) interfaceC48531b2;
        String str = aVar.f439187a;
        return C48533d.a(c48533d2, null, ButtonAction.copy$default(c48533d2.f439198b, null, null, null, Boolean.valueOf((C43066x.K(str) || str.equals("0")) ? false : true), 7, null), aVar.f439187a, 1);
    }
}
