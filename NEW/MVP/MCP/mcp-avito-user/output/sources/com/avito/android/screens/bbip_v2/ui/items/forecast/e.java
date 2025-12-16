package com.avito.android.screens.bbip_v2.ui.items.forecast;

import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BbipV2ForecastItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_v2/ui/items/forecast/e;", "Lcom/avito/android/screens/bbip_v2/ui/items/forecast/d;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {
    @Inject
    public e() {
    }

    public static void k(@k g gVar, @k a aVar) {
        gVar.z9(aVar.f261658c);
        gVar.z6(aVar.f261660e);
        String str = aVar.f261659d;
        gVar.Hc(str);
        String str2 = aVar.f261661f;
        gVar.Zb(str2);
        gVar.Vb(aVar.f261662g);
        gVar.Xd(str == null || str2 == null);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((g) eVar, (a) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof Bundle) {
                obj = obj2;
            }
        }
        Bundle bundle = (Bundle) (obj instanceof Bundle ? obj : null);
        if (bundle == null) {
            k(gVar, aVar2);
            return;
        }
        String string = bundle.getString("payload_forecast_v2_value");
        if (string == null) {
            string = aVar2.f261659d;
        }
        gVar.Hc(string);
        String string2 = bundle.getString("payload_total_v2_price");
        if (string2 == null) {
            string2 = aVar2.f261661f;
        }
        gVar.Zb(string2);
        String string3 = bundle.getString("payload_total_v2_budget");
        if (string3 == null) {
            string3 = aVar2.f261662g;
        }
        gVar.Vb(string3);
        gVar.Xd(string == null || string2 == null);
    }
}
