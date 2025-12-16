package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

/* loaded from: classes2.dex */
public final class zi8 extends phd {
    public final mcf d;

    public zi8(tcf tcfVar) {
        this.d = tcfVar;
    }

    @Override // defpackage.phd
    public final int j() {
        return ((List) this.d.getValue()).size();
    }

    @Override // defpackage.phd
    public final void r(mid midVar, int i) {
        String str = (String) ue3.J(i, (List) this.d.getValue());
        View view = ((aj8) midVar).a;
        ((TextView) view).setText(str);
        view.setBackgroundColor((str == null || !vmf.s(str, "exception", true)) ? (str == null || !vmf.s(str, NegotiationErrorStat.KEY_ERROR, true)) ? 0 : zob.b(-65536, 0.75f) : zob.b(-65536, 0.75f));
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        TextView textView = new TextView(viewGroup.getContext());
        dpg.h.b(textView, t75.b);
        float f = 6;
        float f2 = 3;
        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        textView.setTextColor(a93.s0.y(textView).getText().e);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setTextIsSelectable(true);
        return new aj8(textView);
    }
}
