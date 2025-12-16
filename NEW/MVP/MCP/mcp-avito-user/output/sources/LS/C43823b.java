package ls;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State;
import java.util.ArrayList;
import javax.inject.Inject;
import js.C42419a;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: CpxPromoV2InternalActionGenerator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lls/b;", "Lls/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ls.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C43823b implements InterfaceC43822a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.cpx_promo.b f414219a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.cpx_promo.v2.a f414220b;

    @Inject
    public C43823b(@k com.avito.android.cpx_promo.b bVar, @k com.avito.android.cpx_promo.v2.a aVar) {
        this.f414219a = bVar;
        this.f414220b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    @Override // ls.InterfaceC43822a
    @k
    public final CpxPromoV2InternalAction.UpdateBudget a(boolean z12, @l CpxPromoV2.Auto.Budget.Value.BudgetId budgetId, @l CpxPromoV2 cpxPromoV2) {
        ?? arrayList;
        CpxPromoV2.Auto auto;
        CpxPromoV2.Auto auto2;
        C42419a c42419a = null;
        if (cpxPromoV2 == null || (auto2 = cpxPromoV2.f127488j) == null) {
            arrayList = 0;
        } else {
            ArrayList<CpxPromoV2.Auto.Budget.Value> arrayList2 = auto2.f127491a.f127494c;
            arrayList = new ArrayList(C42745f0.q(arrayList2, 10));
            for (CpxPromoV2.Auto.Budget.Value value : arrayList2) {
                arrayList.add(new CpxPromoV2State.a(value.f127495a, value.f127496b));
            }
        }
        if (cpxPromoV2 != null && (auto = cpxPromoV2.f127488j) != null) {
            c42419a = auto.f127491a.f127492a;
        }
        if (arrayList == 0) {
            arrayList = C42784z0.f406748b;
        }
        if (budgetId == null) {
            budgetId = CpxPromoV2.Auto.Budget.Value.BudgetId.f127498c;
        }
        return new CpxPromoV2InternalAction.UpdateBudget(z12, c42419a, arrayList, budgetId);
    }

    @Override // ls.InterfaceC43822a
    @k
    public final CpxPromoV2InternalAction.UpdateLimit b(boolean z12, @l Long l12, @l CpxPromoV2 cpxPromoV2) {
        CpxPromoV2.c cVar;
        return new CpxPromoV2InternalAction.UpdateLimit(z12, (cpxPromoV2 == null || (cVar = cpxPromoV2.f127487i) == null) ? null : cVar.f127516b.f127517a, l12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    @Override // ls.InterfaceC43822a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction.UpdateSlider c(@Y61.l js.c r32, @Y61.l java.lang.Integer r33, @Y61.l java.lang.Long r34, @Y61.l com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2.a r35) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.C43823b.c(js.c, java.lang.Integer, java.lang.Long, com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2$a):com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction$UpdateSlider");
    }

    @Override // ls.InterfaceC43822a
    @k
    public final CpxPromoV2InternalAction.UpdateSegmentedControl d(boolean z12, @l CpxPromoV2 cpxPromoV2) {
        return new CpxPromoV2InternalAction.UpdateSegmentedControl(cpxPromoV2 != null ? cpxPromoV2.f127486h.f127525a : null, C42756l.B(new String[]{cpxPromoV2 != null ? cpxPromoV2.f127486h.f127526b : null, cpxPromoV2 != null ? cpxPromoV2.f127486h.f127527c : null}), z12, cpxPromoV2 != null ? cpxPromoV2.f127486h.f127529e : true);
    }
}
