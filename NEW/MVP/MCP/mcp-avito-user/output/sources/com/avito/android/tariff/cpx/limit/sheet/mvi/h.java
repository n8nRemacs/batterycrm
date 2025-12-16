package com.avito.android.tariff.cpx.limit.sheet.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.cpx.limit.sheet.domain.TariffCpxLimitContent;
import com.avito.android.tariff.cpx.limit.sheet.mvi.entity.TariffCpxLimitInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TariffCpxLimitBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/mvi/h;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements com.avito.android.arch.mvi.b<TariffCpxLimitInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TariffCpxLimitContent f297330a;

    @Inject
    public h(@Y61.k TariffCpxLimitContent tariffCpxLimitContent) {
        this.f297330a = tariffCpxLimitContent;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<TariffCpxLimitInternalAction> a() {
        return new C43210w(new TariffCpxLimitInternalAction.Content(this.f297330a));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
