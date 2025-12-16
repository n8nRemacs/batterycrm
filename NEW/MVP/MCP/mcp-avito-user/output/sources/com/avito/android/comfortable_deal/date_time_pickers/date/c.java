package com.avito.android.comfortable_deal.date_time_pickers.date;

import Y41.p;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.picker.k;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: DatePickerView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class c extends H implements p<k<?>, k<?>, G0> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(k<?> kVar, k<?> kVar2) {
        TextView textView;
        k<?> kVar3 = kVar;
        k<?> kVar4 = kVar2;
        d dVar = (d) this.receiver;
        dVar.getClass();
        if (kVar3 != null && kVar4 != null) {
            T t12 = kVar3.f180046a;
            Integer num = t12 instanceof Integer ? (Integer) t12 : null;
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 1);
            T t13 = kVar4.f180046a;
            Integer num2 = t13 instanceof Integer ? (Integer) t13 : null;
            boolean zBooleanValue = dVar.f120916b.invoke(numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : 1)).booleanValue();
            View view = dVar.f120917c;
            if (view != null && (textView = (TextView) view.findViewById(R.id.picker_error)) != null) {
                if (zBooleanValue) {
                    D6.g(textView);
                } else {
                    D6.H(textView);
                }
            }
            View view2 = dVar.f120917c;
            Button button = view2 != null ? (Button) view2.findViewById(R.id.apply_button) : null;
            if (button != null) {
                button.setEnabled(zBooleanValue);
            }
        }
        return G0.f406611a;
    }
}
