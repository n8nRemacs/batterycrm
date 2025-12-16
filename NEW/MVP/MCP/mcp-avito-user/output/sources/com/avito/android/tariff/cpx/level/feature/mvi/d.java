package com.avito.android.tariff.cpx.level.feature.mvi;

import EB0.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.cpx.level.feature.mvi.entity.TariffCpxLevelFeatureInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TariffCpxLevelFeatureActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpx/level/feature/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LEB0/a;", "Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction;", "LEB0/c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.arch.mvi.a<EB0.a, TariffCpxLevelFeatureInternalAction, EB0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final v50.g f296983a;

    @Inject
    public d(@Y61.k v50.g gVar) {
        this.f296983a = gVar;
    }

    @Y61.k
    public static C43210w c(@Y61.k EB0.a aVar) {
        C43210w c43210w;
        if (aVar instanceof a.C0221a) {
            return new C43210w(TariffCpxLevelFeatureInternalAction.Close.f296985b);
        }
        if (aVar instanceof a.c) {
            c43210w = new C43210w(new TariffCpxLevelFeatureInternalAction.ProgressChange(((a.c) aVar).f3863a));
        } else {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new TariffCpxLevelFeatureInternalAction.HandleDeeplink(((a.b) aVar).f3862a));
        }
        return c43210w;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.G(new a(this.f296983a.a(), null)), com.avito.android.arch.mvi.utils.h.e(c43197r1, b.f296980l, new c(this, aVar), 1000L));
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<TariffCpxLevelFeatureInternalAction> b(EB0.a aVar, EB0.c cVar) {
        return c(aVar);
    }
}
