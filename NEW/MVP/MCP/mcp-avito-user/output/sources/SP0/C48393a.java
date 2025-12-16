package sp0;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.screens.bbip_private.ui.items.budget.BbipPrivateBudgetItem;
import com.avito.android.screens.bbip_private.ui.items.budget_widget.BbipPrivateBudgetWidgetItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BbipPrivateDiffUtil.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsp0/a;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sp0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48393a extends C23424o.f<TV0.a> {
    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF80596b() == aVar4.getF80596b() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        Bundle bundle;
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof com.avito.android.screens.bbip_private.ui.items.duration.b) && (aVar4 instanceof com.avito.android.screens.bbip_private.ui.items.duration.b)) {
            bundle = new Bundle();
            com.avito.android.screens.bbip_private.ui.items.duration.b bVar = (com.avito.android.screens.bbip_private.ui.items.duration.b) aVar3;
            com.avito.android.screens.bbip_private.ui.items.duration.b bVar2 = (com.avito.android.screens.bbip_private.ui.items.duration.b) aVar4;
            List<Integer> list = bVar.f260835f;
            List<Integer> list2 = bVar2.f260835f;
            if (!L.f(list, list2)) {
                bundle.putIntegerArrayList("payload_bbip_private_duration_shown_durations", new ArrayList<>(list2));
            }
            int i12 = bVar.f260837h;
            int i13 = bVar2.f260837h;
            if (i12 != i13) {
                bundle.putInt("payload_bbip_private_duration_selected", i13);
            }
        } else {
            bundle = null;
        }
        if ((aVar3 instanceof BbipPrivateBudgetItem) && (aVar4 instanceof BbipPrivateBudgetItem)) {
            bundle = new Bundle();
            BbipPrivateBudgetItem bbipPrivateBudgetItem = (BbipPrivateBudgetItem) aVar3;
            BbipPrivateBudgetItem bbipPrivateBudgetItem2 = (BbipPrivateBudgetItem) aVar4;
            BbipPrivateBudgetItem.Budget budget = bbipPrivateBudgetItem.f260627d;
            BbipPrivateBudgetItem.Budget budget2 = bbipPrivateBudgetItem2.f260627d;
            if (!L.f(budget, budget2)) {
                bundle.putParcelable("payload_bbip_private_budget_selected", budget2);
            }
            Integer num = bbipPrivateBudgetItem.f260629f;
            Integer num2 = bbipPrivateBudgetItem2.f260629f;
            if (!L.f(num, num2) && num2 != null) {
                bundle.putInt("payload_bbip_private_budget_chosen_id", num2.intValue());
            }
        }
        if ((aVar3 instanceof BbipPrivateBudgetWidgetItem) && (aVar4 instanceof BbipPrivateBudgetWidgetItem)) {
            bundle = new Bundle();
            BbipPrivateBudgetWidgetItem bbipPrivateBudgetWidgetItem = (BbipPrivateBudgetWidgetItem) aVar3;
            BbipPrivateBudgetWidgetItem bbipPrivateBudgetWidgetItem2 = (BbipPrivateBudgetWidgetItem) aVar4;
            BbipPrivateBudgetWidgetItem.Budget budget3 = bbipPrivateBudgetWidgetItem.f260730e;
            BbipPrivateBudgetWidgetItem.Budget budget4 = bbipPrivateBudgetWidgetItem2.f260730e;
            if (!L.f(budget3, budget4)) {
                bundle.putParcelable("payload_bbip_private_budget_selected", budget4);
            }
            Integer num3 = bbipPrivateBudgetWidgetItem.f260732g;
            Integer num4 = bbipPrivateBudgetWidgetItem2.f260732g;
            if (!L.f(num3, num4) && num4 != null) {
                bundle.putInt("payload_bbip_private_budget_chosen_id", num4.intValue());
            }
        }
        if (bundle == null || bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }
}
