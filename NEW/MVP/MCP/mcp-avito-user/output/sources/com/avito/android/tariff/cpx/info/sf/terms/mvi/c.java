package com.avito.android.tariff.cpx.info.sf.terms.mvi;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.cpx.info.sf.terms.domain.TariffCpxInfoSfTermsContent;
import com.avito.android.tariff.cpx.info.sf.terms.mvi.entity.TariffCpxInfoSfTermsInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TariffCpxInfoSfTermsBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/entity/TariffCpxInfoSfTermsInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements com.avito.android.arch.mvi.b<TariffCpxInfoSfTermsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TariffCpxInfoSfTermsContent f296900a;

    @Inject
    public c(@Y61.k TariffCpxInfoSfTermsContent tariffCpxInfoSfTermsContent) {
        this.f296900a = tariffCpxInfoSfTermsContent;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<TariffCpxInfoSfTermsInternalAction> a() {
        return new C43210w(new TariffCpxInfoSfTermsInternalAction.OpenScreen(this.f296900a));
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
