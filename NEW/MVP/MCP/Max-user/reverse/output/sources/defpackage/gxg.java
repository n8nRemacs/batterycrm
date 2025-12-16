package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.Spanned;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.uikit.common.span.FitFontImageSpan;

/* loaded from: classes2.dex */
public final class gxg extends FrameLayout implements u6g {
    public exg a;
    public final AppCompatImageView b;
    public final AppCompatTextView c;
    public final AppCompatImageView d;

    public gxg(exg exgVar, Context context) {
        super(context);
        this.a = exgVar;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setId(View.generateViewId());
        float f = 36;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        float f2 = 12;
        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
        layoutParams.gravity = 8388627;
        appCompatImageView.setLayoutParams(layoutParams);
        int iD = kti.d(6 * vw4.d().getDisplayMetrics().density);
        appCompatImageView.setPadding(iD, iD, iD, iD);
        this.b = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(View.generateViewId());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.setMarginEnd(kti.d(52 * vw4.d().getDisplayMetrics().density));
        layoutParams2.gravity = 16;
        appCompatTextView.setLayoutParams(layoutParams2);
        dpg.f.b(appCompatTextView, t75.b);
        jgh.a(appCompatTextView);
        this.c = appCompatTextView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
        appCompatImageView2.setId(View.generateViewId());
        float f3 = 28;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        layoutParams3.setMarginEnd(kti.d(f2 * vw4.d().getDisplayMetrics().density));
        layoutParams3.gravity = 8388629;
        appCompatImageView2.setLayoutParams(layoutParams3);
        this.d = appCompatImageView2;
        setId(View.generateViewId());
        setLayoutParams(new FrameLayout.LayoutParams(-1, kti.d(48 * vw4.d().getDisplayMetrics().density)));
        addView(appCompatImageView);
        addView(appCompatTextView);
        addView(appCompatImageView2);
        onThemeChanged(a93.s0.y(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AppCompatTextView appCompatTextView = this.c;
        CharSequence text = appCompatTextView.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        Object[] spans = spanned != null ? spanned.getSpans(0, appCompatTextView.getText().length(), FitFontImageSpan.class) : null;
        if (spans == null) {
            spans = new FitFontImageSpan[0];
        }
        for (Object obj : spans) {
            ((FitFontImageSpan) obj).updateDrawableSize(kti.d(15 * vw4.d().getDisplayMetrics().density), a16.c, false);
        }
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        setBackground(new RippleDrawable(ColorStateList.valueOf(a93.s0.y(this).c().a.a.i), new ColorDrawable(yebVar.b().h), new ColorDrawable(-65536)));
        int iOrdinal = this.a.ordinal();
        AppCompatImageView appCompatImageView = this.d;
        AppCompatTextView appCompatTextView = this.c;
        AppCompatImageView appCompatImageView2 = this.b;
        if (iOrdinal == 0 || iOrdinal == 1) {
            appCompatImageView2.setImageTintList(ColorStateList.valueOf(yebVar.getIcon().f));
            appCompatTextView.setTextColor(yebVar.getText().e);
            appCompatImageView.setImageTintList(ColorStateList.valueOf(yebVar.getIcon().f));
            return;
        }
        if (iOrdinal == 2) {
            appCompatImageView2.setImageTintList(ColorStateList.valueOf(yebVar.getIcon().k));
            appCompatTextView.setTextColor(yebVar.getText().j);
            appCompatImageView.setImageTintList(ColorStateList.valueOf(yebVar.getIcon().k));
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            appCompatImageView2.setImageTintList(ColorStateList.valueOf(yebVar.getIcon().f));
            appCompatTextView.setTextColor(yebVar.getText().e);
            Drawable drawable = appCompatImageView.getDrawable();
            EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
            if (enhancedVectorDrawable != null) {
                z18.e(enhancedVectorDrawable, "background", yebVar.b().a.g);
                z18.e(enhancedVectorDrawable, "plus", yebVar.getIcon().b);
            }
        }
    }

    public final void setActionMenuIconClickListener(em6 em6Var) {
        f8j.d(this.d, 300L, new wfe(em6Var, 19, this));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setOnDragIconTouchListener(sm6 sm6Var) {
        this.b.setOnTouchListener(new ml1(4, sm6Var));
    }

    public final void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void setType(exg exgVar) {
        int i;
        v1a v1aVar = a93.s0;
        this.a = exgVar;
        exg exgVar2 = exg.d;
        int i2 = exgVar != exgVar2 ? 0 : 8;
        AppCompatImageView appCompatImageView = this.b;
        appCompatImageView.setVisibility(i2);
        int iOrdinal = exgVar.ordinal();
        if (iOrdinal == 0) {
            i = yud.k1;
        } else if (iOrdinal == 1) {
            i = ivd.D0;
        } else if (iOrdinal == 2) {
            i = ivd.w;
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 0;
        }
        appCompatImageView.setImageResource(i);
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).setMarginStart(exgVar != exgVar2 ? kti.d(60 * vw4.d().getDisplayMetrics().density) : kti.d(12 * vw4.d().getDisplayMetrics().density));
        int i3 = (exgVar == exg.b || exgVar == exgVar2) ? 0 : 8;
        AppCompatImageView appCompatImageView2 = this.d;
        appCompatImageView2.setVisibility(i3);
        int iOrdinal2 = exgVar.ordinal();
        if (iOrdinal2 == 1) {
            int i4 = v1aVar.y(appCompatImageView2).c().a.a.i;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(-1);
            appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i4), null, shapeDrawable));
            appCompatImageView2.setImageResource(yud.a);
        } else if (iOrdinal2 == 3) {
            appCompatImageView2.setImageDrawable(new EnhancedVectorDrawable(appCompatImageView2.getContext(), cxc.ic_add_button_28));
        }
        onThemeChanged(v1aVar.y(this));
    }
}
