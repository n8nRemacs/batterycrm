package rC0;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCptConfigureLevelsDiffUtilCallback.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LrC0/a;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rC0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47523a extends C23424o.f<TV0.a> {
    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        return aVar.getF189215e() == aVar2.getF189215e();
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        Bundle bundle = new Bundle();
        if ((aVar3 instanceof d) && (aVar4 instanceof d)) {
            bundle.putBoolean("payload_cpt_level_cards_change", !L.f(((d) aVar3).f297950c, ((d) aVar4).f297950c));
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }
}
