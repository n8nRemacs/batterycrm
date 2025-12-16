package com.avito.android.comfortable_deal.date_time_pickers.time;

import Y41.p;
import com.avito.android.lib.design.picker.k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: TimePickerView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class c extends H implements p<k<?>, k<?>, G0> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(k<?> kVar, k<?> kVar2) {
        k<?> kVar3 = kVar;
        k<?> kVar4 = kVar2;
        d dVar = (d) this.receiver;
        dVar.getClass();
        if (kVar3 != null && kVar4 != null) {
            T t12 = kVar3.f180046a;
            Integer num = t12 instanceof Integer ? (Integer) t12 : null;
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 0);
            T t13 = kVar4.f180046a;
            Integer num2 = t13 instanceof Integer ? (Integer) t13 : null;
            dVar.f120932b.invoke(numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : 0));
        }
        return G0.f406611a;
    }
}
