package defpackage;

import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class cbd extends jkf implements u6g {
    public final TextView d;

    public cbd(FrameLayout frameLayout) {
        super(frameLayout);
        TextView textView = (TextView) frameLayout.getChildAt(0);
        this.d = textView;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int iD = kti.d(4 * vw4.d().getDisplayMetrics().density);
        layoutParams.topMargin = iD;
        layoutParams.bottomMargin = iD;
        textView.setLayoutParams(layoutParams);
        textView.setTextAlignment(4);
        dpg.k.b(textView, t75.b);
        int iD2 = kti.d(2 * vw4.d().getDisplayMetrics().density);
        int iD3 = kti.d(12 * vw4.d().getDisplayMetrics().density);
        textView.setPadding(iD3, iD2, iD3, iD2);
        onThemeChanged(a93.s0.y(textView));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.d.setTextColor(yebVar.getText().i);
        this.a.setBackgroundColor(yebVar.b().h);
    }
}
