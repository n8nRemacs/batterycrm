package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.LinkedHashSet;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public class x3b extends ViewGroup implements u6g {
    public static final /* synthetic */ yy7[] y0;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final ImageView o;
    public final TextView s0;
    public final TextView t0;
    public final OneMeButton u0;
    public final nk v0;
    public final Object w0;
    public final LinkedHashSet x0;

    static {
        z8a z8aVar = new z8a(x3b.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;");
        vid.a.getClass();
        y0 = new yy7[]{z8aVar};
    }

    public x3b(Context context) {
        super(context, null);
        float f = 32;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.a = iD;
        int iD2 = kti.d(8 * vw4.d().getDisplayMetrics().density);
        this.b = iD2;
        int iD3 = kti.d(24 * vw4.d().getDisplayMetrics().density);
        this.c = iD3;
        float f2 = 80;
        this.d = kti.d(vw4.d().getDisplayMetrics().density * f2);
        ImageView imageView = new ImageView(context);
        imageView.setId(o0d.oneme_empty_view_icon);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setElevation(vw4.d().getDisplayMetrics().density * 8.0f);
        v1a v1aVar = a93.s0;
        imageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(imageView).getIcon().b));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, szi.a(v1aVar.x(context).k()));
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        this.o = imageView;
        TextView textView = new TextView(context);
        textView.setId(o0d.oneme_empty_view_title);
        dpg.c.b(textView, t75.b);
        this.s0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(o0d.oneme_empty_view_subtitle);
        textView2.setMaxLines(4);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        dpg.j.b(textView2, t75.b);
        textView2.setVisibility(8);
        this.t0 = textView2;
        OneMeButton oneMeButton = new OneMeButton(context, null);
        oneMeButton.setId(o0d.oneme_empty_view_main_action);
        oneMeButton.setVisibility(8);
        oneMeButton.setAppearance(gza.d);
        this.u0 = oneMeButton;
        this.v0 = new nk(22, this);
        this.w0 = ipi.b(3, new p1b(context, 3));
        float f3 = 16;
        setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        addView(imageView, kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = iD;
        addView(textView, marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams2.topMargin = iD2;
        addView(textView2, marginLayoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams3.topMargin = iD3;
        addView(oneMeButton, marginLayoutParams3);
        onThemeChanged(v1aVar.x(context).k());
        tqi.c(new kga(context, (Continuation) null, 2), this);
        setBackground(getShineEmptyStateDrawable());
        this.x0 = new LinkedHashSet();
    }

    public static int b(View view, int i, int i2) {
        if (view.getVisibility() != 0) {
            return 0;
        }
        cri.c(view, (((View) view.getParent()).getMeasuredWidth() - view.getMeasuredWidth()) / 2, i + i2, 0, 12);
        return view.getMeasuredHeight() + i2;
    }

    public static int c(View view, int i, int i2, int i3) {
        if (view.getVisibility() != 0) {
            return 0;
        }
        view.measure(i, i2);
        return view.getMeasuredHeight() + i3;
    }

    public static final boolean e(x3b x3bVar, sid sidVar, View view, int i) {
        if (view.getVisibility() == 0) {
            int measuredHeight = view.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i2 = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            if ((((x3bVar.getMeasuredHeight() - sidVar.a) - i2) - x3bVar.getPaddingTop()) - x3bVar.getPaddingBottom() >= i) {
                x3bVar.x0.add(view);
                sidVar.a += i2;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yeb getCurrentTheme() {
        yeb customTheme = getCustomTheme();
        return customTheme == null ? a93.s0.y(this) : customTheme;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final owe getShineEmptyStateDrawable() {
        return (owe) this.w0.getValue();
    }

    public final void d(boolean z) {
        if (!z) {
            setBackground(null);
            getShineEmptyStateDrawable().stop();
            return;
        }
        setBackground(getShineEmptyStateDrawable());
        ImageView imageView = this.o;
        getShineEmptyStateDrawable().a(imageView.getBottom() - (imageView.getMeasuredHeight() / 2));
        getShineEmptyStateDrawable().start();
    }

    public final void f(String str, View.OnClickListener onClickListener) {
        OneMeButton oneMeButton = this.u0;
        oneMeButton.setVisibility(0);
        oneMeButton.setText(str);
        f8j.d(oneMeButton, 300L, onClickListener);
    }

    public final yeb getCustomTheme() {
        yy7 yy7Var = y0[0];
        return (yeb) this.v0.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(getCurrentTheme());
        owe background = getBackground();
        if (background != null) {
            background.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        owe background = getBackground();
        if (background != null) {
            background.stop();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0126  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x3b.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int i3 = this.d;
        c(this.o, View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824), 0);
        c(this.s0, View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0), this.a);
        c(this.t0, View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0), this.b);
        c(this.u0, View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0), this.c);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        owe background = getBackground();
        if (background != null) {
            background.onThemeChanged(getCurrentTheme());
        }
        getCurrentTheme().getIcon();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(-1);
        ImageView imageView = this.o;
        imageView.setImageTintList(colorStateListValueOf);
        ((GradientDrawable) imageView.getBackground()).setColors(szi.a(getCurrentTheme()));
        this.s0.setTextColor(getCurrentTheme().getText().e);
        this.t0.setTextColor(getCurrentTheme().getText().g);
        this.u0.setCustomTheme(getCustomTheme());
    }

    public final void setCustomTheme(yeb yebVar) {
        this.v0.O(this, y0[0], yebVar);
    }

    public final void setIcon(int i) {
        this.o.setImageResource(i);
    }

    public final void setSubtitle(s5g s5gVar) {
        TextView textView = this.t0;
        textView.setText(s5gVar.b(textView.getContext()));
        CharSequence text = textView.getText();
        textView.setVisibility(text == null || text.length() == 0 ? 8 : 0);
    }

    public final void setTitle(s5g s5gVar) {
        TextView textView = this.s0;
        textView.setText(s5gVar.b(textView.getContext()));
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        owe background;
        return super.verifyDrawable(drawable) || ((background = getBackground()) != null && background.c(drawable));
    }

    @Override // android.view.View
    public owe getBackground() {
        Drawable background = super.getBackground();
        if (background instanceof owe) {
            return (owe) background;
        }
        return null;
    }
}
