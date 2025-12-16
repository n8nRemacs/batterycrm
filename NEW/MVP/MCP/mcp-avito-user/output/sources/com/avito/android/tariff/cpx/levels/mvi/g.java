package com.avito.android.tariff.cpx.levels.mvi;

import HB0.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.tariff.cpx.levels.mvi.entity.CpxLevelsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: CpxLevelsActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpx/levels/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "LHB0/a;", "Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction;", "LHB0/c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements com.avito.android.arch.mvi.a<HB0.a, CpxLevelsInternalAction, HB0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff.cpx.levels.domain.a f297133a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final v50.g f297134b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f297135c;

    @Inject
    public g(@Y61.k com.avito.android.tariff.cpx.levels.domain.a aVar, @Y61.k v50.g gVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f297133a = aVar;
        this.f297134b = gVar;
        this.f297135c = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.G(new d(this.f297134b.a(), null)), new c(new a(new b(y.a(this.f297135c.d9())))), com.avito.android.arch.mvi.utils.h.e(c43197r1, e.f297123l, new f(this, aVar), 1000L));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<CpxLevelsInternalAction> b(@Y61.k HB0.a aVar, @Y61.k HB0.c cVar) {
        ButtonAction buttonAction;
        if (aVar instanceof a.f) {
            return (InterfaceC43160i) this.f297133a.invoke();
        }
        if (aVar instanceof a.d) {
            return new C43210w(new CpxLevelsInternalAction.LevelSelect(((a.d) aVar).f6987a));
        }
        if (aVar instanceof a.C0397a) {
            return new C43210w(new CpxLevelsInternalAction.HandleDeeplink(((a.C0397a) aVar).f6984a));
        }
        if (aVar instanceof a.b) {
            FB0.a aVar2 = cVar.f6997e;
            return new C43210w(new CpxLevelsInternalAction.HandleDeeplink((aVar2 == null || (buttonAction = aVar2.f4597d) == null) ? null : buttonAction.getDeeplink()));
        }
        if (aVar instanceof a.c) {
            return new C43210w(new CpxLevelsInternalAction.HandleDeeplink(((a.c) aVar).f6986a));
        }
        if (aVar instanceof a.e) {
            return new C43210w(new CpxLevelsInternalAction.ProgressChanged(((a.e) aVar).f6988a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
