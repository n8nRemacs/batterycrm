package Kh;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.beduin.common.component.bar_chart.BarChartTextSettings;
import com.avito.android.beduin.common.component.bar_chart.j;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.util.f;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: Utils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {
    @k
    public static final TextView a(@k View view, @l String str, @l BarChartTextSettings barChartTextSettings) {
        String style;
        TextView textView = new TextView(view.getContext());
        if (barChartTextSettings == null || (style = barChartTextSettings.getStyle()) == null) {
            style = "xs10";
        }
        Integer numQ = f.q(style);
        if (numQ != null) {
            textView.setTextAppearance(C35835l0.j(numQ.intValue(), textView.getContext()));
        }
        textView.setText(str);
        textView.setTextColor(C48063a.f437606a.a(textView.getContext(), j.a(barChartTextSettings)));
        textView.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(view.getHeight(), BeduinInputModel.MIN_TEXT_VERSION));
        return textView;
    }
}
