package com.avito.android.travel_onboarding.mvi;

import ZE0.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.travel_onboarding.mvi.entity.TravelOnboardingInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TravelOnboardingActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/travel_onboarding/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LZE0/a;", "Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction;", "LZE0/c;", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.arch.mvi.a<ZE0.a, TravelOnboardingInternalAction, ZE0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.travel_onboarding.domain.interactors.c f302292a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.travel_onboarding.domain.interactors.a f302293b;

    @Inject
    public b(@Y61.k com.avito.android.travel_onboarding.domain.interactors.c cVar, @Y61.k com.avito.android.travel_onboarding.domain.interactors.a aVar) {
        this.f302292a = cVar;
        this.f302293b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<TravelOnboardingInternalAction> b(ZE0.a aVar, ZE0.c cVar) {
        YE0.j jVar;
        ZE0.a aVar2 = aVar;
        ZE0.c cVar2 = cVar;
        if (aVar2 instanceof a.b) {
            return new C43210w(new TravelOnboardingInternalAction.OpenDeeplink(((a.b) aVar2).f20002a));
        }
        boolean z12 = aVar2 instanceof a.C1428a;
        YE0.b bVar = cVar2.f20014f;
        com.avito.android.travel_onboarding.domain.interactors.a aVar3 = this.f302293b;
        if (z12) {
            YE0.a aVar4 = bVar != null ? bVar.f19391e : null;
            String str = bVar != null ? bVar.f19390d.f19392a.f19396c : null;
            if (aVar4 != null && str != null) {
                aVar3.f302252a.c(new VE0.a(aVar4.f19385a, aVar3.f302253b.a(), aVar4.f19386b, str));
            }
            return new C43210w(TravelOnboardingInternalAction.CloseScreen.f302306b);
        }
        if (!(aVar2 instanceof a.c)) {
            if (aVar2 instanceof a.d) {
                return C43175k.G(new a(cVar2, this, null));
            }
            throw new NoWhenBranchMatchedException();
        }
        YE0.a aVar5 = bVar != null ? bVar.f19391e : null;
        if (bVar != null && (jVar = bVar.f19390d.f19393b) != null) {
            str = jVar.f19413d;
        }
        String str2 = str;
        if (aVar5 != null && str2 != null) {
            aVar3.f302252a.c(new VE0.a(aVar5.f19385a, aVar3.f302253b.a(), aVar5.f19386b, str2));
        }
        return new C43210w(new TravelOnboardingInternalAction.OpenDeeplink(((a.c) aVar2).f20003a));
    }
}
