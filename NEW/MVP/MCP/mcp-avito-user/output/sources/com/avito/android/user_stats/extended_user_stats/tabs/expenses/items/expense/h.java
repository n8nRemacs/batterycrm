package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.expense;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExpenseItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/expense/h;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/expense/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f317761g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f317762b;

    /* renamed from: c, reason: collision with root package name */
    public final DescriptionParameterItem f317763c;

    /* renamed from: d, reason: collision with root package name */
    public final View f317764d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f317765e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f317766f;

    /* compiled from: ExpenseItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ExpensesType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ExpensesType expensesType = ExpensesType.f317748b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ExpensesType expensesType2 = ExpensesType.f317748b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ExpensesType expensesType3 = ExpensesType.f317748b;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public h(@k View view) {
        super(view);
        this.f317762b = view;
        this.f317763c = (DescriptionParameterItem) view.findViewById(R.id.dtv_expense);
        this.f317764d = view.findViewById(R.id.v_color_expense);
        this.f317765e = (TextView) view.findViewById(R.id.tv_expense_bonus);
        this.f317766f = (TextView) view.findViewById(R.id.tv_expense_bonus_count);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017e  */
    @Override // com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.expense.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void oP(@Y61.k Y41.l r19, @Y61.k com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.expense.ExpenseItemData r20) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.expense.h.oP(Y41.l, com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.expense.ExpenseItemData):void");
    }
}
