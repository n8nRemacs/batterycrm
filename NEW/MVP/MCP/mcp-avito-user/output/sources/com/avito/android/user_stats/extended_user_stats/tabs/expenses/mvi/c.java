package com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi;

import RJ0.a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.user_stats.extended_user_stats.StatsConfig;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesTabInternalAction;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesTabState;
import com.avito.android.util.O2;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ExpensesTabActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LRJ0/a;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabState;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.android.arch.mvi.a<RJ0.a, ExpensesTabInternalAction, ExpensesTabState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_stats.b f317804a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f317805b;

    @Inject
    public c(@Y61.k com.avito.android.user_stats.b bVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f317804a = bVar;
        this.f317805b = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ExpensesTabInternalAction> b(RJ0.a aVar, ExpensesTabState expensesTabState) {
        C43210w c43210w;
        String str;
        List<String> list;
        String str2;
        String str3;
        RJ0.a aVar2 = aVar;
        ExpensesTabState expensesTabState2 = expensesTabState;
        boolean z12 = aVar2 instanceof a.w;
        com.avito.android.user_stats.b bVar = this.f317804a;
        if (z12) {
            StatsConfig statsConfig = ((a.w) aVar2).f14337a;
            return bVar.e(QJ0.e.b(statsConfig, true), statsConfig);
        }
        if (aVar2 instanceof a.s) {
            StatsConfig statsConfig2 = expensesTabState2.f317836l;
            return bVar.e(QJ0.e.b(statsConfig2, true), statsConfig2);
        }
        boolean z13 = aVar2 instanceof a.d;
        String str4 = "";
        InterfaceC28373a interfaceC28373a = this.f317805b;
        if (z13) {
            a.d dVar = (a.d) aVar2;
            StatsConfig statsConfig3 = expensesTabState2.f317836l;
            str = O2.a(statsConfig3 != null ? statsConfig3.f317160j : null) ? "ois_expenses" : "expenses";
            StatsConfig statsConfig4 = expensesTabState2.f317836l;
            list = statsConfig4 != null ? statsConfig4.f317160j : null;
            if (list != null && (str3 = (String) C42745f0.G(list)) != null) {
                str4 = str3;
            }
            String str5 = dVar.f14315b;
            interfaceC28373a.c(new OJ0.f(str5, str, str4));
            return new C43210w(new ExpensesTabInternalAction.OnColumnClick(dVar.f14314a, str5));
        }
        if (aVar2 instanceof a.g) {
            a.g gVar = (a.g) aVar2;
            StatsConfig statsConfig5 = expensesTabState2.f317836l;
            str = O2.a(statsConfig5 != null ? statsConfig5.f317160j : null) ? "ois_expenses" : "expenses";
            StatsConfig statsConfig6 = expensesTabState2.f317836l;
            list = statsConfig6 != null ? statsConfig6.f317160j : null;
            if (list != null && (str2 = (String) C42745f0.G(list)) != null) {
                str4 = str2;
            }
            interfaceC28373a.c(new OJ0.d(gVar.f14320b, str, str4));
            return new C43210w(new ExpensesTabInternalAction.OnExpenseClick(gVar.f14319a));
        }
        if (aVar2 instanceof a.f) {
            return new C43210w(new ExpensesTabInternalAction.HandleDeeplink(((a.f) aVar2).f14318a));
        }
        if (aVar2 instanceof a.i) {
            return new C43210w(new ExpensesTabInternalAction.HandleDeeplink(((a.i) aVar2).f14322a));
        }
        if (aVar2 instanceof a.t) {
            c43210w = new C43210w(ExpensesTabInternalAction.ShowVisitUxFeedback.f317823b);
        } else {
            if (!aVar2.equals(a.p.f14330a)) {
                if (aVar2.equals(a.c.f14313a)) {
                    return C43175k.w();
                }
                if (aVar2 instanceof a.u) {
                    return C43175k.w();
                }
                if (aVar2 instanceof a.v) {
                    return C43175k.w();
                }
                if (aVar2.equals(a.k.f14325a)) {
                    return C43175k.w();
                }
                if (aVar2 instanceof a.j) {
                    return C43175k.w();
                }
                if (aVar2.equals(a.b.f14312a)) {
                    return C43175k.w();
                }
                if (aVar2.equals(a.r.f14332a)) {
                    return C43175k.w();
                }
                if (aVar2.equals(a.q.f14331a)) {
                    return C43175k.w();
                }
                if (aVar2.equals(a.C0952a.f14311a)) {
                    return C43175k.w();
                }
                if (aVar2 instanceof a.e) {
                    return C43175k.w();
                }
                if (aVar2.equals(a.l.f14326a)) {
                    return C43175k.w();
                }
                if (aVar2.equals(a.h.f14321a)) {
                    return C43175k.w();
                }
                if (aVar2 instanceof a.n) {
                    return C43175k.w();
                }
                if (aVar2 instanceof a.o) {
                    return C43175k.w();
                }
                if (aVar2 instanceof a.m) {
                    return C43175k.w();
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new ExpensesTabInternalAction.OnColumnClick(null, null));
        }
        return c43210w;
    }
}
