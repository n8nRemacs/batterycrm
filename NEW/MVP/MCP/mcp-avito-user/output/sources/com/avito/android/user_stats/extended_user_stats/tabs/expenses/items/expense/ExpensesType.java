package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.expense;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExpenseItemData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/expense/ExpensesType;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExpensesType {

    /* renamed from: b, reason: collision with root package name */
    public static final ExpensesType f317748b;

    /* renamed from: c, reason: collision with root package name */
    public static final ExpensesType f317749c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ExpensesType[] f317750d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f317751e;

    static {
        ExpensesType expensesType = new ExpensesType("TOTAL", 0);
        ExpensesType expensesType2 = new ExpensesType("BONUSES", 1);
        ExpensesType expensesType3 = new ExpensesType("PARENT", 2);
        f317748b = expensesType3;
        ExpensesType expensesType4 = new ExpensesType("CHILD", 3);
        f317749c = expensesType4;
        ExpensesType[] expensesTypeArr = {expensesType, expensesType2, expensesType3, expensesType4};
        f317750d = expensesTypeArr;
        f317751e = kotlin.enums.c.a(expensesTypeArr);
    }

    public ExpensesType() {
        throw null;
    }

    public static ExpensesType valueOf(String str) {
        return (ExpensesType) Enum.valueOf(ExpensesType.class, str);
    }

    public static ExpensesType[] values() {
        return (ExpensesType[]) f317750d.clone();
    }
}
