package com.avito.android.tariff.cpx.info.sf.terms.mvi;

import BB0.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.tariff.cpx.info.sf.terms.mvi.entity.TariffCpxInfoSfTermsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TariffCpxInfoSfTermsActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LBB0/a;", "Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/entity/TariffCpxInfoSfTermsInternalAction;", "LBB0/c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.a<BB0.a, TariffCpxInfoSfTermsInternalAction, BB0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff.cpx.info.sf.terms.domain.a f296898a;

    @Inject
    public a(@Y61.k com.avito.android.tariff.cpx.info.sf.terms.domain.a aVar) {
        this.f296898a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<TariffCpxInfoSfTermsInternalAction> b(BB0.a aVar, BB0.c cVar) {
        BB0.a aVar2 = aVar;
        if (aVar2 instanceof a.C0045a) {
            return this.f296898a.a();
        }
        if (aVar2 instanceof a.b) {
            return new C43210w(TariffCpxInfoSfTermsInternalAction.CloseDialog.f296907b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
