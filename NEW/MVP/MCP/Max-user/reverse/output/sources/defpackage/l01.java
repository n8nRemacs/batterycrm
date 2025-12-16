package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class l01 extends ConstraintLayout implements u6g {
    public final AppCompatImageView F0;
    public final AppCompatTextView G0;

    public l01(Context context, int i) {
        super(context, null);
        setBackground(getBackgroundDrawable());
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setId(View.generateViewId());
        appCompatImageView.setImageTintList(getIconColor());
        int iD = kti.d(2 * vw4.d().getDisplayMetrics().density);
        appCompatImageView.setPadding(iD, iD, iD, iD);
        this.F0 = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(View.generateViewId());
        dpg.f.b(appCompatTextView, t75.b);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextColor(getTextColor());
        this.G0 = appCompatTextView;
        float f = 24;
        addView(appCompatImageView, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        addView(appCompatTextView, kti.d(0 * vw4.d().getDisplayMetrics().density), -2);
        ut3 ut3VarG = l5j.g(this);
        int id = appCompatImageView.getId();
        ut3VarG.d(id, 3, appCompatTextView.getId(), 3);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 4, appCompatTextView.getId(), 4);
        int id2 = appCompatTextView.getId();
        ut3VarG.d(id2, 3, 0, 3);
        ut3VarG.d(id2, 6, appCompatImageView.getId(), 7);
        ut3VarG.g(id2).d.K = kti.d(16 * vw4.d().getDisplayMetrics().density);
        ut3VarG.d(id2, 7, 0, 7);
        ut3VarG.d(id2, 4, 0, 4);
        ut3VarG.g(id2).d.l0 = true;
        ut3VarG.a(this);
    }

    private final RippleDrawable getBackgroundDrawable() {
        int i = a93.s0.y(this).c().a.a.i;
        return new RippleDrawable(ColorStateList.valueOf(i), null, new ColorDrawable(-1));
    }

    private final ColorStateList getIconColor() {
        return ColorStateList.valueOf(a93.s0.y(this).getIcon().k);
    }

    private final int getTextColor() {
        return a93.s0.y(this).getText().j;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.F0.setImageTintList(getIconColor());
        this.G0.setTextColor(getTextColor());
        setBackground(getBackgroundDrawable());
    }

    public final void setActionIcon(int i) {
        this.F0.setImageResource(i);
    }

    public final void setActionText(int i) {
        this.G0.setText(i);
    }
}
