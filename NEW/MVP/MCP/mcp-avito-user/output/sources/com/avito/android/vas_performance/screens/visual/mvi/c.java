package com.avito.android.vas_performance.screens.visual.mvi;

import PL0.a;
import PL0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import uL0.InterfaceC48917a;
import uL0.InterfaceC48918b;

/* compiled from: VisualVasActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LPL0/a;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction;", "LPL0/c;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.android.arch.mvi.a<PL0.a, VisualVasInternalAction, PL0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f321094a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f321095b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.screens.visual.mvi.domain.a f321096c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.screens.visual.mvi.domain.d f321097d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f321098e;

    @Inject
    public c(@InterfaceC48917a @Y61.k String str, @InterfaceC48918b @Y61.k String str2, @Y61.k com.avito.android.vas_performance.screens.visual.mvi.domain.a aVar, @Y61.k com.avito.android.vas_performance.screens.visual.mvi.domain.d dVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f321094a = str;
        this.f321095b = str2;
        this.f321096c = aVar;
        this.f321097d = dVar;
        this.f321098e = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<VisualVasInternalAction> b(PL0.a aVar, PL0.c cVar) {
        PL0.a aVar2 = aVar;
        PL0.c cVar2 = cVar;
        if (aVar2.equals(a.d.f13022a)) {
            c.C0844c c0844c = cVar2.f13034f;
            return new C43210w(new VisualVasInternalAction.OpenDeepLink(c0844c != null ? c0844c.f13049a : null));
        }
        if (aVar2 instanceof a.c) {
            return C43175k.G(new a(cVar2, this, aVar2, null));
        }
        if (aVar2 instanceof a.C0841a) {
            return new C43210w(new VisualVasInternalAction.ItemSelected(((a.C0841a) aVar2).f13019a));
        }
        if (aVar2.equals(a.e.f13023a)) {
            return C43175k.G(new b(this, null));
        }
        if (!aVar2.equals(a.b.f13020a)) {
            throw new NoWhenBranchMatchedException();
        }
        this.f321098e.c(new sL0.d());
        return new C43210w(VisualVasInternalAction.OnBackPressed.f321139b);
    }
}
