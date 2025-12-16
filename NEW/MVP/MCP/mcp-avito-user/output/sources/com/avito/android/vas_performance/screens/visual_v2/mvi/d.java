package com.avito.android.vas_performance.screens.visual_v2.mvi;

import RL0.a;
import RL0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: VisualVasV2Actor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual_v2/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LRL0/a;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction;", "LRL0/c;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements com.avito.android.arch.mvi.a<RL0.a, VisualVasV2InternalAction, RL0.c> {

    /* renamed from: a, reason: collision with root package name */
    public final long f321256a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f321257b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.screens.visual_v2.domain.a f321258c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.screens.visual_v2.domain.c f321259d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.screens.visual_v2.domain.e f321260e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f321261f;

    @Inject
    public d(@com.avito.android.vas_performance.screens.visual_v2.di.d long j12, @com.avito.android.vas_performance.screens.visual_v2.di.a @Y61.k String str, @Y61.k com.avito.android.vas_performance.screens.visual_v2.domain.a aVar, @Y61.k com.avito.android.vas_performance.screens.visual_v2.domain.c cVar, @Y61.k com.avito.android.vas_performance.screens.visual_v2.domain.e eVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f321256a = j12;
        this.f321257b = str;
        this.f321258c = aVar;
        this.f321259d = cVar;
        this.f321260e = eVar;
        this.f321261f = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<VisualVasV2InternalAction> b(RL0.a aVar, RL0.c cVar) {
        RL0.a aVar2 = aVar;
        RL0.c cVar2 = cVar;
        if (aVar2.equals(a.d.f14346a)) {
            c.d dVar = cVar2.f14359g;
            return new C43210w(new VisualVasV2InternalAction.OpenDeepLink(dVar != null ? dVar.f14391a : null));
        }
        if (aVar2 instanceof a.c) {
            return C43175k.G(new a(cVar2, this, null));
        }
        if (aVar2 instanceof a.f) {
            return new C43210w(new VisualVasV2InternalAction.ServiceSwitched(((a.f) aVar2).f14348a));
        }
        if (aVar2 instanceof a.C0955a) {
            return C43175k.G(new b(cVar2, aVar2, this, null));
        }
        if (aVar2.equals(a.e.f14347a)) {
            return C43175k.G(new c(this, null));
        }
        if (!aVar2.equals(a.b.f14344a)) {
            throw new NoWhenBranchMatchedException();
        }
        this.f321261f.c(new sL0.d());
        return new C43210w(new VisualVasV2InternalAction.OnBackPressed(cVar2.f14362j));
    }
}
