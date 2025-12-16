package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class gdd extends FrameLayout implements u6g {
    public final TextView a;
    public final TextView b;

    public gdd(sxa sxaVar, Context context) {
        super(context);
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        float f = 12;
        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
        textView.setLayoutParams(layoutParams);
        textView.setText(context.getString(g3d.chats_list_search_recent_header));
        dpg.n.b(textView, t75.b);
        v1a v1aVar = a93.s0;
        textView.setTextColor(v1aVar.y(textView).getText().i);
        this.a = textView;
        TextView textView2 = new TextView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388629;
        layoutParams2.setMarginEnd(kti.d(f * vw4.d().getDisplayMetrics().density));
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(g3d.chats_list_search_recent_header_clear));
        textView2.setTextColor(az1.f(dpg.j, textView2, v1aVar, textView2).i);
        f8j.d(textView2, 300L, new pcc(4, sxaVar));
        this.b = textView2;
        setLayoutParams(new ViewGroup.LayoutParams(-1, kti.d(40 * vw4.d().getDisplayMetrics().density)));
        addView(textView);
        addView(textView2);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.a.setTextColor(yebVar.getText().i);
        this.b.setTextColor(yebVar.getText().i);
    }
}
