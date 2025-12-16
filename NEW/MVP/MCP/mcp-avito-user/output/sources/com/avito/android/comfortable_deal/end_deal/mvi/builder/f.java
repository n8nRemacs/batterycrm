package com.avito.android.comfortable_deal.end_deal.mvi.builder;

import Hp.d;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.end_deal.model.CommissionInfo;
import com.avito.android.comfortable_deal.end_deal.model.EndDealField;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.V2;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EndDealViewStateBuilder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/builder/f;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/builder/e;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements e {
    @Inject
    public f() {
    }

    @Override // com.avito.android.comfortable_deal.end_deal.mvi.builder.e
    @k
    public final Hp.c a(@k Hp.c cVar) {
        Hp.d aVar;
        AttributedText attributedText;
        CommissionInfo commissionInfo;
        if (cVar.f7732b) {
            aVar = d.c.f7748a;
        } else if (cVar.f7740j) {
            aVar = d.b.f7747a;
        } else {
            Map<String, EndDealField> map = cVar.f7737g;
            if (map == null || (attributedText = cVar.f7738h) == null || (commissionInfo = cVar.f7739i) == null) {
                V2.f318762a.d("EndDealDialog", "error at creating viewstate for " + cVar);
                aVar = d.b.f7747a;
            } else {
                aVar = new d.a(cVar.f7733c, cVar.f7735e, map, attributedText, commissionInfo);
            }
        }
        return Hp.c.a(cVar, false, false, false, null, null, null, null, null, false, aVar, 511);
    }
}
