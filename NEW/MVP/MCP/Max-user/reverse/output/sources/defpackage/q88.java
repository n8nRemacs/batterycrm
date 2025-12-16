package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class q88 extends ConstraintLayout implements u6g {
    public final AppCompatTextView F0;
    public final AppCompatTextView G0;
    public final AppCompatImageView H0;
    public final AppCompatImageView I0;

    public q88(Context context) {
        super(context);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(v8b.t);
        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        appCompatTextView.setTextAlignment(2);
        appCompatTextView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setText(context.getText(x8b.F));
        v1a v1aVar = a93.s0;
        appCompatTextView.setTextColor(v1aVar.y(appCompatTextView).getText().g);
        t5g t5gVar = vz2.a;
        dpg.G.b(appCompatTextView, t75.b);
        this.F0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
        appCompatTextView2.setId(v8b.u);
        appCompatTextView2.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        appCompatTextView2.setTextAlignment(2);
        appCompatTextView2.setSingleLine(true);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setTextColor(v1aVar.y(appCompatTextView2).getText().j);
        dpg.E.b(appCompatTextView2, t75.b);
        this.G0 = appCompatTextView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setId(v8b.v);
        float f = 24;
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f)));
        appCompatImageView.setImageResource(yud.l0);
        float f2 = 2;
        appCompatImageView.setPadding(kti.c(vw4.d().getDisplayMetrics().density * 3.5d), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.c(vw4.d().getDisplayMetrics().density * 3.5d), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        appCompatImageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(appCompatImageView).getText().j));
        this.H0 = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
        appCompatImageView2.setId(v8b.w);
        appCompatImageView2.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        appCompatImageView2.setImageResource(yud.H1);
        appCompatImageView2.setImageTintList(ColorStateList.valueOf(v1aVar.y(appCompatImageView2).getText().j));
        this.I0 = appCompatImageView2;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        float f3 = 12;
        float f4 = 8;
        setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(f4 * vw4.d().getDisplayMetrics().density));
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(appCompatImageView);
        addView(appCompatImageView2);
        ut3 ut3VarG = l5j.g(this);
        int id = appCompatTextView.getId();
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 4, appCompatTextView2.getId(), 3);
        float f5 = 1;
        new fua(ut3VarG, 4, id, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f5));
        ut3VarG.d(id, 7, appCompatImageView.getId(), 6);
        fua fuaVar = new fua(ut3VarG, 7, id, 5);
        float f6 = 16;
        fuaVar.e(kti.d(vw4.d().getDisplayMetrics().density * f6));
        int id2 = appCompatTextView2.getId();
        ut3VarG.d(id2, 6, 0, 6);
        ut3VarG.d(id2, 3, appCompatTextView.getId(), 4);
        az1.q(f5, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id2, 5));
        ut3VarG.d(id2, 4, 0, 4);
        ut3VarG.d(id2, 7, appCompatImageView.getId(), 6);
        new fua(ut3VarG, 7, id2, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f6));
        int id3 = appCompatImageView.getId();
        ut3VarG.d(id3, 3, 0, 3);
        ut3VarG.d(id3, 4, 0, 4);
        ut3VarG.d(id3, 7, appCompatImageView2.getId(), 6);
        new fua(ut3VarG, 7, id3, 5).e(kti.d(f6 * vw4.d().getDisplayMetrics().density));
        int id4 = appCompatImageView2.getId();
        ut3VarG.d(id4, 3, 0, 3);
        ut3VarG.d(id4, 4, 0, 4);
        ut3VarG.d(id4, 7, 0, 7);
        ut3VarG.a(this);
        onThemeChanged(v1aVar.y(this));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        v1a v1aVar = a93.s0;
        this.F0.setTextColor(v1aVar.y(this).getText().g);
        this.G0.setTextColor(v1aVar.y(this).getText().j);
        this.H0.setImageTintList(ColorStateList.valueOf(yebVar.getIcon().k));
    }

    public final void setLink(CharSequence charSequence) {
        this.G0.setText(charSequence);
    }

    public final void setOnShareLinkClickListener(em6 em6Var) {
        f8j.d(this.H0, 300L, new kg6(this, 7, em6Var));
    }

    public final void setOnShareQrCodeClickListener(cm6 cm6Var) {
        f8j.d(this.I0, 300L, new x6(6, cm6Var));
    }
}
