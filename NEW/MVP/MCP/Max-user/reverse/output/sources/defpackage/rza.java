package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class rza extends LinearLayout implements u6g {
    public static final /* synthetic */ yy7[] t0 = {new z8a(rza.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;"), u45.h(vid.a, rza.class, "mode", "getMode()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Mode;"), new z8a(rza.class, "appearance", "getAppearance()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Appearance;")};
    public final Object a;
    public final Object b;
    public em6 c;
    public final qza d;
    public final qza o;
    public final qza s0;

    public rza(Context context) {
        super(context, null);
        this.a = ipi.b(3, new ns2(context, 24));
        this.b = ipi.b(3, new ns2(context, 25));
        this.c = new dga(8);
        this.d = new qza(this, 0);
        this.o = new qza(this, 1);
        this.s0 = new qza(this, 2);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setGravity(17);
        c(this, getAppearance());
        setClipToOutline(true);
        setOutlineProvider(new u74(kti.d(16 * vw4.d().getDisplayMetrics().density)));
        setClickable(true);
        setOrientation(1);
        addView(getIconView());
    }

    private final yeb getCurrentTheme() {
        yeb customTheme = getCustomTheme();
        return customTheme == null ? a93.s0.y(this) : customTheme;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ImageView getIconView() {
        return (ImageView) this.a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final AppCompatTextView getTextView() {
        return (AppCompatTextView) this.b.getValue();
    }

    public final void b() {
        invalidate();
        requestLayout();
    }

    public final void c(View view, nza nzaVar) {
        RippleDrawable rippleDrawable;
        v1a v1aVar = a93.s0;
        int iOrdinal = nzaVar.ordinal();
        if (iOrdinal == 0) {
            v1aVar.y(view);
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(getCurrentTheme().c().a.a.i), new ColorDrawable(getCurrentTheme().b().h), new ColorDrawable(-65536));
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(v1aVar.y(view).c().a.a.e), new ColorDrawable(getCurrentTheme().c().a.a.e), new ColorDrawable(-65536));
        }
        view.setBackground(rippleDrawable);
    }

    public final nza getAppearance() {
        yy7 yy7Var = t0[2];
        return (nza) this.s0.b;
    }

    public final yeb getCustomTheme() {
        yy7 yy7Var = t0[0];
        return (yeb) this.d.b;
    }

    public final em6 getIconTintResolver() {
        return this.c;
    }

    public final oza getMode() {
        yy7 yy7Var = t0[1];
        return (oza) this.o.b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMax = Math.max(getMeasuredHeight(), kti.d(60 * vw4.d().getDisplayMetrics().density));
        if (getMeasuredWidth() < iMax) {
            setMeasuredDimension(iMax, iMax);
        } else {
            setMeasuredDimension(getMeasuredWidth(), iMax);
        }
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        int iIntValue = ((Number) this.c.invoke(getCurrentTheme())).intValue();
        getIconView().setImageTintList(ColorStateList.valueOf(iIntValue));
        Drawable background = getIconView().getBackground();
        if (background != null) {
            background.setTint(iIntValue);
        }
        c(this, getAppearance());
        getTextView().setTextColor(getCurrentTheme().getText().e);
    }

    public final void setAppearance(nza nzaVar) {
        this.s0.O(this, t0[2], nzaVar);
    }

    public final void setCustomTheme(yeb yebVar) {
        this.d.O(this, t0[0], yebVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.48f);
    }

    public final void setIcon(Drawable drawable) {
        if (getIconView().getDrawable() == drawable) {
            return;
        }
        if (drawable != null) {
            drawable.setTint(((Number) this.c.invoke(a93.s0.y(this))).intValue());
        }
        getIconView().setImageDrawable(drawable);
        b();
    }

    public final void setIconTintResolver(em6 em6Var) {
        this.c = em6Var;
    }

    public final void setMode(oza ozaVar) {
        this.o.O(this, t0[1], ozaVar);
    }

    public final void setText(CharSequence charSequence) {
        if (getMode() != oza.b || fni.a(getTextView().getText(), charSequence)) {
            return;
        }
        getTextView().setText(charSequence);
        if (getTextView().getParent() == null) {
            addView(getTextView());
        }
        b();
    }

    public final void setIcon(int i) {
        setIcon(r34.b(getContext(), i).mutate());
    }

    public final void setText(int i) {
        setText(getContext().getString(i));
    }
}
