package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.expense;

import RJ0.a;
import Y41.l;
import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f317758b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f317759c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ExpenseItemData f317760d;

    public /* synthetic */ g(l lVar, ExpenseItemData expenseItemData) {
        this.f317759c = lVar;
        this.f317760d = expenseItemData;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.f317759c;
        ExpenseItemData expenseItemData = this.f317760d;
        switch (this.f317758b) {
            case 0:
                int i12 = h.f317761g;
                DeepLink deepLink = expenseItemData.f317745l;
                if (deepLink == null) {
                    if (expenseItemData.f317742i) {
                        lVar.invoke(new a.g(expenseItemData.f317735b, expenseItemData.f317743j));
                        break;
                    }
                } else {
                    lVar.invoke(new a.f(deepLink));
                    break;
                }
                break;
            default:
                int i13 = h.f317761g;
                lVar.invoke(new a.g(expenseItemData.f317735b, expenseItemData.f317743j));
                break;
        }
    }

    public /* synthetic */ g(ExpenseItemData expenseItemData, l lVar) {
        this.f317760d = expenseItemData;
        this.f317759c = lVar;
    }
}
