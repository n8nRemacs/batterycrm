package pB0;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.tariff.cpx.configure.landing.items.accordions_card.CpxConfigureLandingAccordionItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CpxConfigureLandingDiffUtil.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LpB0/a;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pB0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46929a extends C23424o.f<TV0.a> {
    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF186822h() == aVar4.getF186822h() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        Bundle bundle;
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof com.avito.android.tariff.cpx.configure.landing.items.accordions_card.a) && (aVar4 instanceof com.avito.android.tariff.cpx.configure.landing.items.accordions_card.a)) {
            bundle = new Bundle();
            com.avito.android.tariff.cpx.configure.landing.items.accordions_card.a aVar5 = (com.avito.android.tariff.cpx.configure.landing.items.accordions_card.a) aVar4;
            List<CpxConfigureLandingAccordionItem> list = ((com.avito.android.tariff.cpx.configure.landing.items.accordions_card.a) aVar3).f295947d;
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                CpxConfigureLandingAccordionItem cpxConfigureLandingAccordionItem = list.get(i12);
                if (cpxConfigureLandingAccordionItem.f295944e != aVar5.f295947d.get(i12).f295944e) {
                    bundle.putString("payload_cpx_configure_landing_accordion_tag_id", cpxConfigureLandingAccordionItem.f295941b);
                }
            }
        } else {
            bundle = null;
        }
        if (bundle == null || bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }
}
