package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period;

import X80.c;
import X80.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoBanner;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoPeriod;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoPeriodAction;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PeriodInfoReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/x;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction;", "LX80/j;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class x implements com.avito.android.arch.mvi.u<PeriodInfoInternalAction, X80.j> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f220691b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f220692c;

    @Inject
    public x(@Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k lE.g gVar) {
        this.f220691b = interfaceC35863o4;
        kotlin.reflect.n<Object> nVar = lE.g.f413657e[1];
        this.f220692c = ((Boolean) gVar.f413659c.a().invoke()).booleanValue();
    }

    @Override // com.avito.android.arch.mvi.u
    public final X80.j a(PeriodInfoInternalAction periodInfoInternalAction, X80.j jVar) {
        X80.c cVarA;
        X80.c cVar;
        X80.a aVar;
        X80.j jVarF;
        X80.c cVarA2;
        X80.c cVarA3;
        PositionInfoBanner positionInfoBanner;
        X80.c cVarA4;
        PeriodInfoInternalAction periodInfoInternalAction2 = periodInfoInternalAction;
        X80.j jVarF2 = jVar;
        boolean z12 = periodInfoInternalAction2 instanceof PeriodInfoInternalAction.ExpandQueryItem;
        X80.c cVar2 = jVarF2.f18714f;
        if (z12) {
            PeriodInfoInternalAction.ExpandQueryItem expandQueryItem = (PeriodInfoInternalAction.ExpandQueryItem) periodInfoInternalAction2;
            c.a aVarA = X80.k.a(cVar2);
            if (aVarA != null) {
                List<X80.h> list = aVarA.f18676f;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                for (X80.h hVar : list) {
                    if (L.f(hVar.f18705b.f220463b, expandQueryItem.f220590b)) {
                        hVar = new X80.h(!hVar.f18704a, hVar.f18705b);
                    }
                    arrayList.add(hVar);
                }
                cVarA4 = c.a.a(aVarA, null, null, arrayList, null, null, 479);
            } else {
                cVarA4 = cVar2;
            }
            return X80.j.a(jVarF2, null, null, cVarA4, null, 47);
        }
        positionInfoBanner = null;
        positionInfoBanner = null;
        PositionInfoBanner positionInfoBanner2 = null;
        aVar = null;
        X80.a aVar2 = null;
        if (periodInfoInternalAction2 instanceof PeriodInfoInternalAction.BannerClosed) {
            c.a aVarA2 = X80.k.a(cVar2);
            String str = ((PeriodInfoInternalAction.BannerClosed) periodInfoInternalAction2).f220587b;
            if (aVarA2 != null && (positionInfoBanner = aVarA2.f18678h) != null && L.f(positionInfoBanner.f220414a, str)) {
                positionInfoBanner2 = positionInfoBanner;
            }
            if (positionInfoBanner2 == null) {
                return jVarF2;
            }
            LinkedHashSet linkedHashSetI = b1.i(jVarF2.f18715g, str);
            c.a aVarA3 = X80.k.a(cVar2);
            return X80.j.a(jVarF2, null, null, aVarA3 != null ? c.a.a(aVarA3, null, null, null, null, null, 383) : cVar2, linkedHashSetI, 15);
        }
        if (periodInfoInternalAction2 instanceof PeriodInfoInternalAction.LoadingError) {
            return e((PeriodInfoInternalAction.LoadingError) periodInfoInternalAction2, jVarF2);
        }
        if (periodInfoInternalAction2 instanceof PeriodInfoInternalAction.LoadingResult) {
            return f((PeriodInfoInternalAction.LoadingResult) periodInfoInternalAction2, jVarF2, false);
        }
        if (periodInfoInternalAction2 instanceof PeriodInfoInternalAction.LoadingStart) {
            return d(jVarF2);
        }
        boolean z13 = periodInfoInternalAction2 instanceof PeriodInfoInternalAction.NextPage;
        InterfaceC35863o4 interfaceC35863o4 = this.f220691b;
        if (z13) {
            PeriodInfoInternalAction.LoadingAction loadingActionA = ((PeriodInfoInternalAction.NextPage) periodInfoInternalAction2).a();
            if (loadingActionA instanceof PeriodInfoInternalAction.LoadingError) {
                c.a aVarA4 = X80.k.a(cVar2);
                if (aVarA4 != null) {
                    X80.e eVar = aVarA4.f18677g;
                    PeriodInfoInternalAction.LoadingError loadingError = (PeriodInfoInternalAction.LoadingError) loadingActionA;
                    cVarA3 = c.a.a(aVarA4, null, null, null, eVar != null ? X80.e.a(eVar, false) : null, new l.a(loadingError.f220591b, interfaceC35863o4.a(), loadingError.f220592c), 191);
                } else {
                    cVarA3 = cVar2;
                }
                jVarF = X80.j.a(jVarF2, null, null, cVarA3, null, 47);
            } else if (loadingActionA instanceof PeriodInfoInternalAction.LoadingStart) {
                c.a aVarA5 = X80.k.a(cVar2);
                if (aVarA5 != null) {
                    X80.e eVar2 = aVarA5.f18677g;
                    cVarA2 = c.a.a(aVarA5, null, null, null, eVar2 != null ? X80.e.a(eVar2, true) : null, null, 447);
                } else {
                    cVarA2 = cVar2;
                }
                jVarF = X80.j.a(jVarF2, null, PositionInfoPeriodAction.f220479c, cVarA2, null, 43);
            } else {
                if (!(loadingActionA instanceof PeriodInfoInternalAction.LoadingResult)) {
                    throw new NoWhenBranchMatchedException();
                }
                jVarF = f((PeriodInfoInternalAction.LoadingResult) loadingActionA, jVarF2, false);
            }
            return jVarF;
        }
        if (periodInfoInternalAction2 instanceof PeriodInfoInternalAction.PeriodSelected) {
            PeriodInfoInternalAction.PeriodSelected periodSelected = (PeriodInfoInternalAction.PeriodSelected) periodInfoInternalAction2;
            PeriodInfoInternalAction.LoadingAction loadingActionA2 = periodSelected.a();
            if (loadingActionA2 instanceof PeriodInfoInternalAction.LoadingError) {
                jVarF2 = e((PeriodInfoInternalAction.LoadingError) loadingActionA2, jVarF2);
            } else if (loadingActionA2 instanceof PeriodInfoInternalAction.LoadingResult) {
                jVarF2 = f((PeriodInfoInternalAction.LoadingResult) loadingActionA2, jVarF2, false);
            } else {
                if (!(loadingActionA2 instanceof PeriodInfoInternalAction.LoadingStart)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (cVar2 instanceof c.a) {
                    c.a aVar3 = (c.a) cVar2;
                    X80.f fVar = aVar3.f18672b;
                    X80.f fVar2 = new X80.f(fVar.f18699a, true, fVar.f18701c);
                    if (this.f220692c && (aVar = aVar3.f18673c) != null) {
                        aVar2 = new X80.a(aVar.f18653a, true, aVar.f18655c);
                    }
                    jVarF2 = X80.j.a(jVarF2, null, null, new c.e(null, fVar2, aVar2, aVar3.f18674d, aVar3.f18675e, aVar3.f18678h, interfaceC35863o4.a(), 1, null), null, 47);
                } else if (!(cVar2 instanceof c.e)) {
                    jVarF2 = d(jVarF2);
                }
            }
            return X80.j.a(jVarF2, periodSelected.getF220618e(), PositionInfoPeriodAction.f220479c, null, null, 57);
        }
        if (periodInfoInternalAction2 instanceof PeriodInfoInternalAction.Sort) {
            PeriodInfoInternalAction.LoadingAction loadingActionA3 = ((PeriodInfoInternalAction.Sort) periodInfoInternalAction2).a();
            if (loadingActionA3 instanceof PeriodInfoInternalAction.LoadingStart) {
                if (cVar2 instanceof c.a) {
                    c.a aVar4 = (c.a) cVar2;
                    jVarF2 = X80.j.a(jVarF2, null, null, new c.e(aVar4.f18671a, aVar4.f18672b, aVar4.f18673c, aVar4.f18674d, aVar4.f18675e, aVar4.f18678h, interfaceC35863o4.a()), null, 47);
                } else if (!(cVar2 instanceof c.e)) {
                    jVarF2 = d(jVarF2);
                }
            } else if (loadingActionA3 instanceof PeriodInfoInternalAction.LoadingError) {
                jVarF2 = e((PeriodInfoInternalAction.LoadingError) loadingActionA3, jVarF2);
            } else {
                if (!(loadingActionA3 instanceof PeriodInfoInternalAction.LoadingResult)) {
                    throw new NoWhenBranchMatchedException();
                }
                jVarF2 = f((PeriodInfoInternalAction.LoadingResult) loadingActionA3, jVarF2, true);
            }
            return X80.j.a(jVarF2, null, PositionInfoPeriodAction.f220479c, null, null, 59);
        }
        if (periodInfoInternalAction2 instanceof PeriodInfoInternalAction.ToastClosed) {
            PeriodInfoInternalAction.ToastClosed toastClosed = (PeriodInfoInternalAction.ToastClosed) periodInfoInternalAction2;
            c.a aVarA6 = X80.k.a(cVar2);
            if (aVarA6 != null) {
                X80.l lVar = aVarA6.f18679i;
                if (L.f(lVar != null ? lVar.getF18721a() : null, toastClosed.f220628b)) {
                    aVarA6 = c.a.a(aVarA6, null, null, null, null, null, 255);
                }
                cVar = aVarA6;
            } else {
                cVar = cVar2;
            }
            return X80.j.a(jVarF2, null, null, cVar, null, 47);
        }
        if (!(periodInfoInternalAction2 instanceof PeriodInfoInternalAction.ChangeSortItem)) {
            if (periodInfoInternalAction2 instanceof PeriodInfoInternalAction.NoChange ? true : periodInfoInternalAction2 instanceof PeriodInfoInternalAction.OpenDeepLink ? true : periodInfoInternalAction2 instanceof PeriodInfoInternalAction.OpenSortDeepLink) {
                return jVarF2;
            }
            throw new NoWhenBranchMatchedException();
        }
        PeriodInfoInternalAction.ChangeSortItem changeSortItem = (PeriodInfoInternalAction.ChangeSortItem) periodInfoInternalAction2;
        if (cVar2 instanceof c.a) {
            c.a aVar5 = (c.a) cVar2;
            X80.i iVar = aVar5.f18675e;
            cVarA = c.a.a(aVar5, null, iVar != null ? new X80.i(changeSortItem.f220589c, changeSortItem.f220588b, iVar.f18708c, iVar.f18709d) : null, null, null, null, 495);
        } else {
            cVarA = cVar2;
        }
        return X80.j.a(jVarF2, null, null, cVarA, null, 47);
    }

    public final X80.e b(PositionInfoPeriod.d.b bVar, X80.j jVar) {
        String strA;
        X80.e eVar;
        c.a aVarA = X80.k.a(jVar.f18714f);
        if (aVarA == null || (eVar = aVarA.f18677g) == null || (strA = eVar.f18695a) == null) {
            strA = this.f220691b.a();
        }
        return new X80.e(bVar.f220460a, false, strA, bVar.f220461b);
    }

    public final X80.g c(PositionInfoPeriod.d.a aVar, X80.j jVar) {
        String strA;
        X80.g gVar;
        X80.g gVar2;
        c.a aVarA = X80.k.a(jVar.f18714f);
        if (aVarA == null || (gVar2 = aVarA.f18674d) == null || (strA = gVar2.f18702a) == null) {
            X80.c cVar = jVar.f18714f;
            c.e eVar = cVar instanceof c.e ? (c.e) cVar : null;
            strA = (eVar == null || (gVar = eVar.f18688d) == null) ? this.f220691b.a() : gVar.f18702a;
        }
        return new X80.g(strA, aVar);
    }

    public final X80.j d(X80.j jVar) {
        PositionInfoPeriodAction positionInfoPeriodAction = PositionInfoPeriodAction.f220478b;
        X80.c cVar = jVar.f18714f;
        return X80.j.a(jVar, null, positionInfoPeriodAction, cVar instanceof c.C1321c ? (c.C1321c) cVar : new c.C1321c(this.f220691b.a()), null, 43);
    }

    public final X80.j e(PeriodInfoInternalAction.LoadingError loadingError, X80.j jVar) {
        return X80.j.a(jVar, null, null, new c.b(loadingError.f220591b, this.f220691b.a(), loadingError.f220592c), null, 47);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c8  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X80.j f(com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction.LoadingResult r29, X80.j r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.x.f(com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction$LoadingResult, X80.j, boolean):X80.j");
    }
}
