package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.List;

/* loaded from: classes2.dex */
public final class wa9 extends LinearLayout implements u6g {
    public em6 a;
    public final View b;
    public final LinearLayout c;

    public wa9(Context context) {
        super(context, null, 0);
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, kti.d(1 * vw4.d().getDisplayMetrics().density)));
        this.b = view;
        LinearLayout linearLayout = new LinearLayout(context);
        float f = 12;
        linearLayout.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), linearLayout.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), linearLayout.getPaddingBottom());
        this.c = linearLayout;
        setOrientation(1);
        addView(view);
        addView(linearLayout);
        view.setBackgroundColor(a93.s0.y(this).i().b.c);
    }

    public final em6 getOnClickListener() {
        return this.a;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        v1a v1aVar = a93.s0;
        a93.h(v1aVar.x(getContext()), this);
        this.b.setBackgroundColor(v1aVar.y(this).i().b.c);
    }

    public final void setOnClickListener(em6 em6Var) {
        this.a = em6Var;
    }

    public final void setSelected(mb9 mb9Var) {
        f2 f2Var = new f2(9, this.c);
        while (f2Var.hasNext()) {
            View view = (View) f2Var.next();
            va9 va9Var = view instanceof va9 ? (va9) view : null;
            if (va9Var != null) {
                va9Var.setIsSelected(fni.a(va9Var.getState(), mb9Var));
            }
        }
    }

    public final void setState(List<? extends mb9> list) {
        LinearLayout linearLayout = this.c;
        linearLayout.removeAllViews();
        for (mb9 mb9Var : list) {
            va9 va9Var = new va9(getContext());
            va9Var.setIsSelected(false);
            va9Var.setState(mb9Var);
            f8j.d(va9Var, 300L, new kg6(this, 13, mb9Var));
            linearLayout.addView(va9Var);
        }
    }
}
