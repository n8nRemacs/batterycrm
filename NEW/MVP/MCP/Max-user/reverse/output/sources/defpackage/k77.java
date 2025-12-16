package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class k77 extends ConstraintLayout implements u6g {
    public final AppCompatTextView F0;
    public final AppCompatImageView G0;

    public k77(Context context) {
        super(context);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(View.generateViewId());
        appCompatTextView.setGravity(8388611);
        dpg.f.b(appCompatTextView, t75.b);
        v1a v1aVar = a93.s0;
        appCompatTextView.setTextColor(v1aVar.y(appCompatTextView).getText().e);
        this.F0 = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setId(View.generateViewId());
        float f = 24;
        appCompatImageView.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        appCompatImageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(appCompatImageView).getIcon().k));
        appCompatImageView.setImageResource(yud.n);
        this.G0 = appCompatImageView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, kti.d(48 * vw4.d().getDisplayMetrics().density)));
        setBackgroundColor(v1aVar.y(this).b().h);
        addView(appCompatTextView);
        addView(appCompatImageView);
        ut3 ut3VarG = l5j.g(this);
        int id = appCompatImageView.getId();
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 4, 0, 4);
        ut3VarG.d(id, 6, 0, 6);
        fua fuaVar = new fua(ut3VarG, 6, id, 5);
        float f2 = 12;
        fuaVar.e(kti.d(vw4.d().getDisplayMetrics().density * f2));
        int id2 = appCompatTextView.getId();
        ut3VarG.d(id2, 3, 0, 3);
        ut3VarG.d(id2, 4, 0, 4);
        ut3VarG.d(id2, 6, appCompatImageView.getId(), 7);
        new fua(ut3VarG, 6, id2, 5).e(kti.d(f2 * vw4.d().getDisplayMetrics().density));
        ut3VarG.a(this);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        setBackgroundColor(yebVar.b().h);
        this.G0.setImageTintList(ColorStateList.valueOf(yebVar.getIcon().k));
        this.F0.setTextColor(yebVar.getText().e);
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        this.G0.setVisibility(!z ? 4 : 0);
    }
}
