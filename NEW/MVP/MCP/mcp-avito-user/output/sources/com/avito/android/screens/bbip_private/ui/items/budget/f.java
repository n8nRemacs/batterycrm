package com.avito.android.screens.bbip_private.ui.items.budget;

import com.avito.android.screens.bbip_private.ui.items.budget.BbipPrivateBudgetItem;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BbipPrivateBudgetItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "budgetId", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f260675l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f260676m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List<BbipPrivateBudgetItem.Budget> list, g gVar) {
        super(1);
        this.f260675l = list;
        this.f260676m = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        Object next;
        int iIntValue = num.intValue();
        Iterator it = ((Iterable) this.f260675l).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((BbipPrivateBudgetItem.Budget) next).f260636b == iIntValue) {
                break;
            }
        }
        BbipPrivateBudgetItem.Budget budget = (BbipPrivateBudgetItem.Budget) next;
        if (budget != null) {
            this.f260676m.f260677b.invoke(budget);
        }
        return G0.f406611a;
    }
}
