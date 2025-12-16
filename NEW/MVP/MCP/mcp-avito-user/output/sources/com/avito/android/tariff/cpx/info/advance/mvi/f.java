package com.avito.android.tariff.cpx.info.advance.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.tariff.deeplink.TariffCpxInfoAdvanceShowLinkBody;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import tB0.InterfaceC48531b;

/* compiled from: TariffCpxInfoAdvanceBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/advance/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "LtB0/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements com.avito.android.arch.mvi.b<InterfaceC48531b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TariffCpxInfoAdvanceShowLinkBody f296342a;

    @Inject
    public f(@Y61.k TariffCpxInfoAdvanceShowLinkBody tariffCpxInfoAdvanceShowLinkBody) {
        this.f296342a = tariffCpxInfoAdvanceShowLinkBody;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC48531b> a() {
        TariffCpxInfoAdvanceShowLinkBody tariffCpxInfoAdvanceShowLinkBody = this.f296342a;
        return new C43210w(new InterfaceC48531b.c(TariffCpxInfoAdvanceShowLinkBody.a(tariffCpxInfoAdvanceShowLinkBody, ButtonAction.copy$default(tariffCpxInfoAdvanceShowLinkBody.getButton(), null, null, null, Boolean.FALSE, 7, null))));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
