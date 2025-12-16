package wp0;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BbipV2DiffUtil.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lwp0/a;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wp0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49667a extends C23424o.f<TV0.a> {
    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF189215e() == aVar4.getF189215e() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        Bundle bundle;
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof com.avito.android.screens.bbip_v2.ui.items.forecast.a) && (aVar4 instanceof com.avito.android.screens.bbip_v2.ui.items.forecast.a)) {
            bundle = new Bundle();
            com.avito.android.screens.bbip_v2.ui.items.forecast.a aVar5 = (com.avito.android.screens.bbip_v2.ui.items.forecast.a) aVar4;
            com.avito.android.screens.bbip_v2.ui.items.forecast.a aVar6 = (com.avito.android.screens.bbip_v2.ui.items.forecast.a) aVar3;
            String str = aVar6.f261659d;
            String str2 = aVar5.f261659d;
            if (!L.f(str2, str)) {
                bundle.putString("payload_forecast_v2_value", str2);
            }
            String str3 = aVar5.f261661f;
            if (!L.f(str3, aVar6.f261661f)) {
                bundle.putString("payload_total_v2_price", str3);
            }
            String str4 = aVar5.f261662g;
            if (!L.f(str4, aVar6.f261662g)) {
                bundle.putString("payload_total_v2_budget", str4);
            }
        } else {
            bundle = null;
        }
        if ((aVar3 instanceof com.avito.android.screens.bbip_v2.ui.items.budget.b) && (aVar4 instanceof com.avito.android.screens.bbip_v2.ui.items.budget.b)) {
            bundle = new Bundle();
            boolean z12 = ((com.avito.android.screens.bbip_v2.ui.items.budget.b) aVar3).f261571c;
            boolean z13 = ((com.avito.android.screens.bbip_v2.ui.items.budget.b) aVar4).f261571c;
            if (z13 != z12) {
                bundle.putBoolean("payload_should_block_budgets", z13);
            } else {
                bundle.putBoolean("payload_selected_budget", true);
            }
        }
        if ((aVar3 instanceof com.avito.android.screens.bbip_v2.ui.items.duration.b) && (aVar4 instanceof com.avito.android.screens.bbip_v2.ui.items.duration.b)) {
            bundle = new Bundle();
            boolean z14 = ((com.avito.android.screens.bbip_v2.ui.items.duration.b) aVar3).f261618g;
            boolean z15 = ((com.avito.android.screens.bbip_v2.ui.items.duration.b) aVar4).f261618g;
            if (z15 != z14) {
                bundle.putBoolean("payload_should_block_durations", z15);
            } else {
                bundle.putBoolean("payload_selected_duration", true);
            }
        }
        if (bundle == null || bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }
}
