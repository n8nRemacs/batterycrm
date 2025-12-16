package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zf2 extends qj0 {
    public final uxa a;
    public final TextView b;
    public final TextView c;
    public final yf2 d;

    public zf2(Context context) {
        super(context);
        uxa uxaVar = new uxa(context);
        float f = 71;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = kti.d(12 * vw4.d().getDisplayMetrics().density);
        uxaVar.setLayoutParams(layoutParams);
        this.a = uxaVar;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams2);
        textView.setTextAlignment(4);
        textView.setSingleLine(true);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        dpg.g.b(textView, t75.b);
        tqi.c(new x9(3, null, 3), textView);
        this.b = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(17);
        dpg.o.b(textView2, t75.b);
        tqi.c(new x9(3, null, 2), textView2);
        this.c = textView2;
        yf2 yf2Var = new yf2(context);
        yf2Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.d = yf2Var;
        addView(uxaVar);
        addView(textView);
        addView(textView2);
        addView(yf2Var);
        setGravity(1);
        setMinimumWidth(kti.d(296 * vw4.d().getDisplayMetrics().density));
        float f2 = 24;
        setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(20 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
    }

    @Override // defpackage.qj0, defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        super.onThemeChanged(yebVar);
        a93.h(a93.s0.x(getContext()), this);
    }

    public final void setDescriptions(List<? extends s5g> list) {
        yf2 yf2Var = this.d;
        yf2Var.getClass();
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((s5g) it.next()).d(yf2Var));
        }
        yf2Var.s0 = arrayList;
        yf2Var.requestLayout();
        yf2Var.invalidate();
        this.c.setGravity(list.isEmpty() ? 17 : 8388611);
    }

    public final void setSubtitle(s5g s5gVar) {
        CharSequence charSequenceD = s5gVar.d(this);
        TextView textView = this.c;
        textView.setText(charSequenceD);
        CharSequence text = textView.getText();
        textView.setVisibility(text == null || text.length() == 0 ? 8 : 0);
    }

    public final void setTitle(s5g s5gVar) {
        TextView textView = this.b;
        textView.setText(s5gVar.b(textView.getContext()));
    }
}
