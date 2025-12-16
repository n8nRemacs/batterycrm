package com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi;

import androidx.compose.ui.platform.C22491k0;
import com.avito.android.arch.mvi.u;
import com.avito.android.user_stats.extended_user_stats.StatsConfig;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.expense.ExpenseItemData;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total.TotalItemData;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.DataStatus;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesItem;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesTabInternalAction;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesTabState;
import com.avito.android.util.C5;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.user_stats.model.extended_user_stats.StatsBonus;
import com.avito.user_stats.model.extended_user_stats.StatsCommonExpenses;
import com.avito.user_stats.model.extended_user_stats.StatsDates;
import com.avito.user_stats.model.extended_user_stats.StatsServices;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ExpensesTabReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabState;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l implements u<ExpensesTabInternalAction, ExpensesTabState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f317851b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f317852c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final o f317853d;

    @Inject
    public l(@Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k QJ0.f fVar) {
        this.f317851b = interfaceC35863o4;
        this.f317852c = new a(interfaceC35863o4);
        this.f317853d = new o(interfaceC35863o4, fVar);
    }

    public static String b(long j12, ExpensesTabState expensesTabState) {
        StatsBonus statsBonusC;
        String symbol = null;
        if (j12 == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b.a(Long.valueOf(j12)));
        sb2.append(' ');
        StatsCommonExpenses statsCommonExpenses = expensesTabState.f317828d;
        if (statsCommonExpenses != null && (statsBonusC = statsCommonExpenses.getBonus()) != null) {
            symbol = statsBonusC.getSymbol();
        }
        sb2.append(symbol);
        return sb2.toString();
    }

    @Override // com.avito.android.arch.mvi.u
    public final ExpensesTabState a(ExpensesTabInternalAction expensesTabInternalAction, ExpensesTabState expensesTabState) {
        StatsServices statsServices;
        List<StatsServices> listG;
        Object next;
        StatsBonus statsBonusC;
        StatsBonus statsBonusC2;
        List<StatsDates> listD;
        double d12;
        long jK2;
        long jLongValue;
        double dA2;
        ExpensesTabInternalAction expensesTabInternalAction2 = expensesTabInternalAction;
        ExpensesTabState expensesTabState2 = expensesTabState;
        if (expensesTabInternalAction2 instanceof ExpensesTabInternalAction.Loading) {
            return ExpensesTabState.a(expensesTabState2, null, DataStatus.f317809c, null, 0.0d, 0, 0.0d, 0L, 0.0d, 0L, null, null, null, null, 8189);
        }
        boolean z12 = expensesTabInternalAction2 instanceof ExpensesTabInternalAction.ShowLoadingIfEmptyData;
        StatsCommonExpenses statsCommonExpenses = expensesTabState2.f317828d;
        if (z12) {
            return statsCommonExpenses == null ? ExpensesTabState.a(expensesTabState2, null, DataStatus.f317809c, null, 0.0d, 0, 0.0d, 0L, 0.0d, 0L, null, null, null, null, 8189) : expensesTabState2;
        }
        boolean z13 = expensesTabInternalAction2 instanceof ExpensesTabInternalAction.Content;
        a aVar = this.f317852c;
        int i12 = 0;
        long j12 = 0;
        if (z13) {
            ExpensesTabInternalAction.Content content = (ExpensesTabInternalAction.Content) expensesTabInternalAction2;
            StatsCommonExpenses statsCommonExpenses2 = content.f317813b;
            List<StatsDates> listD2 = statsCommonExpenses2.d();
            if (listD2 != null) {
                Iterator<T> it = listD2.iterator();
                d12 = 0.0d;
                while (it.hasNext()) {
                    List<StatsServices> listF = ((StatsDates) it.next()).f();
                    if (listF != null) {
                        dA2 = 0.0d;
                        for (StatsServices statsServices2 : listF) {
                            long jK3 = statsServices2.getRealAmount();
                            Long lC2 = statsServices2.getBonusAmount();
                            dA2 += m.a(jK3 + (lC2 != null ? lC2.longValue() : 0L));
                            i12++;
                        }
                    } else {
                        dA2 = 0.0d;
                    }
                    if (dA2 > d12) {
                        d12 = dA2;
                    }
                }
            } else {
                d12 = 0.0d;
            }
            int i13 = i12;
            List<StatsServices> listF2 = statsCommonExpenses2.f();
            if (listF2 != null) {
                long j13 = 0;
                jK2 = 0;
                for (StatsServices statsServices3 : listF2) {
                    jK2 += statsServices3.getRealAmount();
                    List<StatsServices> listG2 = statsServices3.g();
                    if (listG2 != null) {
                        Iterator<T> it2 = listG2.iterator();
                        jLongValue = 0;
                        while (it2.hasNext()) {
                            Long lC3 = ((StatsServices) it2.next()).getBonusAmount();
                            jLongValue += lC3 != null ? lC3.longValue() : 0L;
                        }
                    } else {
                        jLongValue = 0;
                    }
                    if (jLongValue == 0) {
                        Long lC4 = statsServices3.getBonusAmount();
                        jLongValue = lC4 != null ? lC4.longValue() : 0L;
                    }
                    j13 += jLongValue;
                }
                j12 = j13;
            } else {
                jK2 = 0;
            }
            ExpensesTabState expensesTabStateA = ExpensesTabState.a(expensesTabState2, null, null, statsCommonExpenses2, d12, i13, m.a(jK2), j12, 0.0d, 0L, null, null, null, null, 8067);
            ArrayList arrayList = new ArrayList();
            arrayList.add(c(expensesTabStateA));
            StatsCommonExpenses statsCommonExpenses3 = expensesTabStateA.f317828d;
            arrayList.add(this.f317853d.a(statsCommonExpenses3 != null ? statsCommonExpenses3.d() : null, statsCommonExpenses3 != null ? statsCommonExpenses3.f() : null, expensesTabStateA.f317829e, expensesTabStateA.f317835k, null));
            arrayList.addAll(aVar.d(expensesTabStateA));
            DataStatus dataStatus = DataStatus.f317808b;
            StatsConfig statsConfig = content.f317814c;
            return ExpensesTabState.a(expensesTabStateA, arrayList, dataStatus, null, 0.0d, 0, 0.0d, 0L, 0.0d, 0L, null, statsConfig, statsConfig != null ? statsConfig.f317168r : null, statsCommonExpenses2.getUserMessage(), 1020);
        }
        if (expensesTabInternalAction2 instanceof ExpensesTabInternalAction.ErrorExpenses) {
            return ExpensesTabState.a(expensesTabState2, null, DataStatus.f317810d, null, 0.0d, 0, 0.0d, 0L, 0.0d, 0L, null, ((ExpensesTabInternalAction.ErrorExpenses) expensesTabInternalAction2).f317816c, null, null, 7165);
        }
        if (expensesTabInternalAction2 instanceof ExpensesTabInternalAction.OnColumnClick) {
            if (statsCommonExpenses == null) {
                return expensesTabState2;
            }
            Integer num = ((ExpensesTabInternalAction.OnColumnClick) expensesTabInternalAction2).f317819b;
            ExpensesTabState expensesTabStateA2 = ExpensesTabState.a(expensesTabState2, null, null, null, 0.0d, 0, 0.0d, 0L, 0.0d, 0L, L.f(expensesTabState2.f317835k, num) ? null : num, null, null, null, 7679);
            double d13 = expensesTabStateA2.f317833i;
            long j14 = expensesTabStateA2.f317834j;
            StatsCommonExpenses statsCommonExpenses4 = expensesTabStateA2.f317828d;
            if (statsCommonExpenses4 != null && (listD = statsCommonExpenses4.d()) != null) {
                Iterator<T> it3 = listD.iterator();
                while (true) {
                    int i14 = i12;
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    i12 = i14 + 1;
                    if (i14 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    StatsDates statsDates = (StatsDates) next2;
                    if (statsDates.f() != null && !statsDates.f().isEmpty()) {
                        long jK4 = 0;
                        long jLongValue2 = 0;
                        for (StatsServices statsServices4 : statsDates.f()) {
                            jK4 += statsServices4.getRealAmount();
                            Long lC5 = statsServices4.getBonusAmount();
                            jLongValue2 += lC5 != null ? lC5.longValue() : 0L;
                        }
                        double dA3 = m.a(jK4);
                        Integer num2 = expensesTabStateA2.f317835k;
                        if (num2 != null && i14 == num2.intValue()) {
                            d13 = dA3;
                            j14 = jLongValue2;
                        }
                    }
                }
            }
            ExpensesTabState expensesTabStateA3 = ExpensesTabState.a(expensesTabStateA2, null, null, null, 0.0d, 0, 0.0d, 0L, d13, j14, null, null, null, null, 7807);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c(expensesTabStateA3));
            StatsCommonExpenses statsCommonExpenses5 = expensesTabStateA3.f317828d;
            arrayList2.add(this.f317853d.a(statsCommonExpenses5 != null ? statsCommonExpenses5.d() : null, statsCommonExpenses5 != null ? statsCommonExpenses5.f() : null, expensesTabStateA3.f317829e, expensesTabStateA3.f317835k, null));
            arrayList2.addAll(aVar.d(expensesTabStateA3));
            return ExpensesTabState.a(expensesTabStateA3, arrayList2, DataStatus.f317808b, null, 0.0d, 0, 0.0d, 0L, 0.0d, 0L, null, null, null, null, 8188);
        }
        if (!(expensesTabInternalAction2 instanceof ExpensesTabInternalAction.OnExpenseClick)) {
            if ((expensesTabInternalAction2 instanceof ExpensesTabInternalAction.HandleDeeplink) || (expensesTabInternalAction2 instanceof ExpensesTabInternalAction.ShowVisitUxFeedback)) {
                return expensesTabState2;
            }
            throw new NoWhenBranchMatchedException();
        }
        ExpensesTabInternalAction.OnExpenseClick onExpenseClick = (ExpensesTabInternalAction.OnExpenseClick) expensesTabInternalAction2;
        ArrayList arrayList3 = new ArrayList(expensesTabState2.f317826b);
        Iterator it4 = arrayList3.iterator();
        while (true) {
            if (!it4.hasNext()) {
                i12 = -1;
                break;
            }
            if (L.f(((ExpensesItem) it4.next()).getF314301b(), onExpenseClick.f317821b)) {
                break;
            }
            i12++;
        }
        int i15 = i12;
        ExpensesItem expensesItem = (ExpensesItem) C42745f0.K(i15, arrayList3);
        String title = (statsCommonExpenses == null || (statsBonusC2 = statsCommonExpenses.getBonus()) == null) ? null : statsBonusC2.getTitle();
        String symbol = (statsCommonExpenses == null || (statsBonusC = statsCommonExpenses.getBonus()) == null) ? null : statsBonusC.getSymbol();
        if (expensesItem instanceof ExpenseItemData) {
            ExpenseItemData expenseItemData = (ExpenseItemData) expensesItem;
            String str = title;
            String str2 = symbol;
            ExpenseItemData expenseItemData2 = new ExpenseItemData(expenseItemData.f317735b, expenseItemData.f317736c, expenseItemData.f317737d, expenseItemData.f317738e, expenseItemData.f317739f, expenseItemData.f317740g, expenseItemData.f317741h, expenseItemData.f317742i, !expenseItemData.f317743j, expenseItemData.f317744k, expenseItemData.f317745l, expenseItemData.f317746m, expenseItemData.f317747n);
            if (i15 >= 0) {
                arrayList3.set(i15, expenseItemData2);
            }
            List listE = a.e(expensesTabState2);
            if (listE != null) {
                Iterator it5 = listE.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it5.next();
                    if (L.f(((StatsServices) next).getSlug(), expenseItemData2.f317746m)) {
                        break;
                    }
                }
                statsServices = (StatsServices) next;
            } else {
                statsServices = null;
            }
            if (expenseItemData2.f317743j) {
                ArrayList arrayList4 = new ArrayList();
                if (statsServices != null && (listG = statsServices.g()) != null) {
                    Iterator<T> it6 = listG.iterator();
                    while (it6.hasNext()) {
                        arrayList4.add(aVar.b((StatsServices) it6.next(), statsCommonExpenses != null ? statsCommonExpenses.getRealSymbol() : null, str2, str, statsServices.getBonusBadgeColor(), statsServices.getSlug()));
                    }
                }
                arrayList3.addAll(i15 + 1, arrayList4);
            } else {
                ArrayList arrayList5 = new ArrayList();
                int size = arrayList3.size();
                while (i15 < size) {
                    ExpensesItem expensesItem2 = (ExpensesItem) arrayList3.get(i15);
                    if (expensesItem2 instanceof ExpenseItemData) {
                        if (L.f(((ExpenseItemData) expensesItem2).f317747n, statsServices != null ? statsServices.getSlug() : null)) {
                            arrayList5.add(expensesItem2);
                        }
                    }
                    i15++;
                }
                Iterator it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    arrayList3.remove((ExpensesItem) it7.next());
                }
            }
        }
        return ExpensesTabState.a(expensesTabState2, arrayList3, null, null, 0.0d, 0, 0.0d, 0L, 0.0d, 0L, null, null, null, null, 8190);
    }

    public final TotalItemData c(ExpensesTabState expensesTabState) {
        String strB;
        String strB2;
        if (expensesTabState.f317835k == null) {
            strB = C5.b(expensesTabState.f317831g, false);
            strB2 = b(expensesTabState.f317832h, expensesTabState);
        } else {
            strB = C5.b(expensesTabState.f317833i, false);
            strB2 = b(expensesTabState.f317834j, expensesTabState);
        }
        String str = strB2;
        String strA = this.f317851b.a();
        StringBuilder sbB = C22491k0.b(strB, ' ');
        StatsCommonExpenses statsCommonExpenses = expensesTabState.f317828d;
        sbB.append(statsCommonExpenses != null ? statsCommonExpenses.getRealSymbol() : null);
        return new TotalItemData(strA, sbB.toString(), str, null, null, 24, null);
    }
}
