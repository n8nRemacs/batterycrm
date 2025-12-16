package com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi;

import RJ0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesTabInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ExpensesTabOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction;", "LRJ0/b;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements t<ExpensesTabInternalAction, RJ0.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final RJ0.b b(ExpensesTabInternalAction expensesTabInternalAction) {
        ExpensesTabInternalAction expensesTabInternalAction2 = expensesTabInternalAction;
        if ((expensesTabInternalAction2 instanceof ExpensesTabInternalAction.Content) || (expensesTabInternalAction2 instanceof ExpensesTabInternalAction.ErrorExpenses) || (expensesTabInternalAction2 instanceof ExpensesTabInternalAction.Loading) || (expensesTabInternalAction2 instanceof ExpensesTabInternalAction.ShowLoadingIfEmptyData)) {
            return null;
        }
        if (expensesTabInternalAction2 instanceof ExpensesTabInternalAction.OnColumnClick) {
            return new b.C0953b(((ExpensesTabInternalAction.OnColumnClick) expensesTabInternalAction2).f317820c);
        }
        if (expensesTabInternalAction2 instanceof ExpensesTabInternalAction.ShowVisitUxFeedback) {
            return b.c.f14340a;
        }
        if (expensesTabInternalAction2 instanceof ExpensesTabInternalAction.OnExpenseClick) {
            return null;
        }
        if (expensesTabInternalAction2 instanceof ExpensesTabInternalAction.HandleDeeplink) {
            return new b.a(((ExpensesTabInternalAction.HandleDeeplink) expensesTabInternalAction2).f317818b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
