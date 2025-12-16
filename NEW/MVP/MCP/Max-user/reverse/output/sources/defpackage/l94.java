package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class l94 extends d2f {
    public static final int G0 = View.generateViewId();
    public static final int H0 = View.generateViewId();
    public final ImageView E0;
    public final TextView F0;

    public l94(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, kti.d(56 * vw4.d().getDisplayMetrics().density)));
        float f = 18;
        float f2 = 12;
        linearLayout.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        View imageView = new ImageView(context);
        int i = G0;
        imageView.setId(i);
        float f3 = 24;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        layoutParams.setMarginEnd(kti.d(f * vw4.d().getDisplayMetrics().density));
        imageView.setLayoutParams(layoutParams);
        linearLayout.setGravity(16);
        linearLayout.addView(imageView);
        TextView textView = new TextView(context);
        int i2 = H0;
        textView.setId(i2);
        dpg.f.b(textView, t75.b);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.gravity = 19;
        textView.setLayoutParams(layoutParams2);
        linearLayout.addView(textView);
        tqi.c(new uh1(imageView, textView, null, 1), linearLayout);
        super(linearLayout);
        this.E0 = (ImageView) linearLayout.findViewById(i);
        this.F0 = (TextView) linearLayout.findViewById(i2);
    }

    @Override // defpackage.d2f
    public final void E() {
        ((LinearLayout) this.a).setOnClickListener(null);
    }

    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(k94 k94Var) {
        this.E0.setImageResource(k94Var.b);
        n5g n5gVar = k94Var.c;
        TextView textView = this.F0;
        textView.setText(n5gVar.b(textView.getContext()));
        ((LinearLayout) this.a).setOnClickListener(null);
    }
}
