package com.avito.android.tariff.detailssheet.vm;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.tariff.deeplink.CpaConfigureServicesLink;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffDetailsSheetRepository.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/detailssheet/vm/f;", "Lcom/avito/android/tariff/detailssheet/vm/e;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final WB0.a f297437a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f297438b;

    @Inject
    public f(@Y61.k WB0.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f297437a = aVar;
        this.f297438b = interfaceC35745a5;
    }

    @Override // com.avito.android.tariff.detailssheet.vm.e
    @Y61.l
    public final W a(@Y61.k DeepLink deepLink) {
        I<TypedResult<XB0.a>> iO2 = deepLink instanceof CpaConfigureServicesLink ? this.f297437a.o(((CpaConfigureServicesLink) deepLink).f297365b) : null;
        if (iO2 != null) {
            return iO2.z(this.f297438b.a());
        }
        return null;
    }
}
