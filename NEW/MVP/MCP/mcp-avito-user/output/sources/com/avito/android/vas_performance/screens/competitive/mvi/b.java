package com.avito.android.vas_performance.screens.competitive.mvi;

import JL0.a;
import JL0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_performance.screens.competitive.mvi.entity.CompetitiveVasV2InternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CompetitiveVasV2Actor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_performance/screens/competitive/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LJL0/a;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction;", "LJL0/c;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.arch.mvi.a<JL0.a, CompetitiveVasV2InternalAction, JL0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.screens.competitive.domain.a f320439a;

    @Inject
    public b(@Y61.k com.avito.android.vas_performance.screens.competitive.domain.a aVar) {
        this.f320439a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CompetitiveVasV2InternalAction> b(JL0.a aVar, JL0.c cVar) {
        C43210w c43210w;
        JL0.a aVar2 = aVar;
        JL0.c cVar2 = cVar;
        if (aVar2 instanceof a.e) {
            return this.f320439a.a();
        }
        if (aVar2 instanceof a.b) {
            c43210w = new C43210w(cVar2.f8895b ? CompetitiveVasV2InternalAction.FinishFlow.f320447b : CompetitiveVasV2InternalAction.Back.f320443b);
        } else {
            if (aVar2 instanceof a.c) {
                c.a aVar3 = cVar2.f8903j;
                DeepLink deepLink = aVar3 != null ? aVar3.f8917k : null;
                return deepLink == null ? C43175k.w() : C43175k.G(new a(deepLink, null));
            }
            if (aVar2 instanceof a.f) {
                return new C43210w(new CompetitiveVasV2InternalAction.SelectTab(((a.f) aVar2).f8889a));
            }
            if (aVar2 instanceof a.C0523a) {
                c43210w = new C43210w(CompetitiveVasV2InternalAction.GoToPreviousCard.f320449b);
            } else {
                if (!(aVar2 instanceof a.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(CompetitiveVasV2InternalAction.GoToNextCard.f320448b);
            }
        }
        return c43210w;
    }
}
