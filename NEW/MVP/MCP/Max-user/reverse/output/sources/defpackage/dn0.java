package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;

/* loaded from: classes2.dex */
public final class dn0 extends FrameLayout implements u6g {
    public final rpd a;
    public final ynd b;
    public final GradientDrawable c;
    public final TextView d;
    public final TextView o;
    public final SimpleDraweeView s0;

    public dn0(Context context) {
        super(context);
        rpd rpdVar = new rpd();
        this.a = rpdVar;
        float f = 32;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.b = iD <= 0 ? null : new ynd(iD, iD);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 20.0f);
        this.c = gradientDrawable;
        TextView textView = new TextView(context);
        textView.setId(hyc.oneme_folder_widget_title);
        textView.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        dpg.v.b(textView, t75.b);
        this.d = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(hyc.oneme_folder_widget_description);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        dpg.j.b(textView2, t75.b);
        this.o = textView2;
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        simpleDraweeView.setId(hyc.oneme_folder_widget_icon);
        c2c c2cVarA = zk6.a.a();
        c2cVarA.d = rpdVar;
        c2cVarA.h = true;
        simpleDraweeView.setController(c2cVarA.a());
        this.s0 = simpleDraweeView;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(simpleDraweeView, new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        addView(textView, new FrameLayout.LayoutParams(-2, -2));
        addView(textView2, new FrameLayout.LayoutParams(-2, -2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(a93.s0.y(this));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = getMeasuredHeight() / 2;
        TextView textView = this.d;
        int measuredHeight2 = textView.getMeasuredHeight();
        TextView textView2 = this.o;
        int measuredHeight3 = textView2.getMeasuredHeight() + measuredHeight2;
        float f = 2;
        int iD = measuredHeight - ((kti.d(vw4.d().getDisplayMetrics().density * f) + measuredHeight3) / 2);
        float f2 = 24;
        cri.c(textView, kti.d(vw4.d().getDisplayMetrics().density * f2), iD, 0, 12);
        cri.c(textView2, kti.d(vw4.d().getDisplayMetrics().density * f2), utb.j(f, vw4.d().getDisplayMetrics().density, textView.getMeasuredHeight(), iD), 0, 12);
        int iQ = u45.q(f2, vw4.d().getDisplayMetrics().density, getMeasuredWidth());
        SimpleDraweeView simpleDraweeView = this.s0;
        simpleDraweeView.layout(iQ - simpleDraweeView.getMeasuredWidth(), (getMeasuredHeight() / 2) - (simpleDraweeView.getMeasuredHeight() / 2), u45.q(f2, vw4.d().getDisplayMetrics().density, getMeasuredWidth()), (simpleDraweeView.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = 24;
        float f2 = 32;
        int iQ = u45.q(f, vw4.d().getDisplayMetrics().density, u45.q(f2, vw4.d().getDisplayMetrics().density, u45.d(f, vw4.d().getDisplayMetrics().density, 2, size)));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(iQ, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.o.measure(View.MeasureSpec.makeMeasureSpec(iQ, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.s0.measure(View.MeasureSpec.makeMeasureSpec(kti.d(vw4.d().getDisplayMetrics().density * f2), 1073741824), View.MeasureSpec.makeMeasureSpec(kti.d(f2 * vw4.d().getDisplayMetrics().density), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.d.setTextColor(yebVar.getText().e);
        this.o.setTextColor(yebVar.getText().h);
        int i = yebVar.b().i;
        GradientDrawable gradientDrawable = this.c;
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(kti.c(vw4.d().getDisplayMetrics().density * 0.5d), yebVar.i().g);
    }
}
