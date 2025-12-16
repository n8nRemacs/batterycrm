package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;

/* loaded from: classes2.dex */
public final class nb6 extends ViewGroup implements u6g {
    public final rpd a;
    public final ynd b;
    public final GradientDrawable c;
    public final TextView d;
    public final TextView o;
    public final SimpleDraweeView s0;

    public nb6(Context context) {
        super(context);
        rpd rpdVar = new rpd();
        this.a = rpdVar;
        float f = 20;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.b = iD <= 0 ? null : new ynd(iD, iD);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 16.0f);
        this.c = gradientDrawable;
        TextView textView = new TextView(context);
        textView.setId(hyc.oneme_folder_widget_title);
        textView.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        dpg.m.b(textView, t75.b);
        this.d = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(hyc.oneme_folder_widget_description);
        textView2.setMaxLines(3);
        textView2.setEllipsize(truncateAt);
        dpg.o.b(textView2, t75.b);
        this.o = textView2;
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        simpleDraweeView.setId(hyc.oneme_folder_widget_icon);
        c2c c2cVarA = zk6.a.a();
        c2cVarA.d = rpdVar;
        c2cVarA.h = true;
        simpleDraweeView.setController(c2cVarA.a());
        this.s0 = simpleDraweeView;
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int iD2 = kti.d(10 * vw4.d().getDisplayMetrics().density);
        setPadding(iD2, iD2, iD2, iD2);
        addView(simpleDraweeView, new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(a93.s0.y(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = 10;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        int iD2 = kti.d(vw4.d().getDisplayMetrics().density * f);
        TextView textView = this.d;
        cri.c(textView, iD2, iD, 0, 12);
        cri.c(this.o, kti.d(vw4.d().getDisplayMetrics().density * f), utb.j(2, vw4.d().getDisplayMetrics().density, textView.getMeasuredHeight(), iD), 0, 12);
        int iD3 = kti.d(vw4.d().getDisplayMetrics().density * f);
        int measuredHeight = getMeasuredHeight();
        SimpleDraweeView simpleDraweeView = this.s0;
        simpleDraweeView.layout(iD3, u45.q(f, vw4.d().getDisplayMetrics().density, measuredHeight - simpleDraweeView.getMeasuredHeight()), simpleDraweeView.getMeasuredWidth() + kti.d(vw4.d().getDisplayMetrics().density * f), u45.q(f, vw4.d().getDisplayMetrics().density, getMeasuredHeight()));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = 10;
        this.d.measure(View.MeasureSpec.makeMeasureSpec(size - (kti.d(vw4.d().getDisplayMetrics().density * f) * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.o.measure(View.MeasureSpec.makeMeasureSpec(u45.d(f, vw4.d().getDisplayMetrics().density, 2, size) - kti.d(6 * vw4.d().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        float f2 = 20;
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
