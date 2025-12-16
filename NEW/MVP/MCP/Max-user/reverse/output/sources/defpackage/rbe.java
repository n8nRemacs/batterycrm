package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rbe extends ugc {
    public final ImageView E0;
    public final AppCompatTextView F0;
    public final AppCompatTextView G0;

    public rbe(Context context) {
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        super(constraintLayout);
        ImageView imageView = new ImageView(context);
        float f = 24;
        kt3 kt3Var = new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        int i = r8b.r0;
        imageView.setId(i);
        kt3Var.t = 0;
        kt3Var.i = 0;
        kt3Var.l = 0;
        imageView.setLayoutParams(kt3Var);
        this.E0 = imageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        int i2 = r8b.t0;
        appCompatTextView.setId(i2);
        kt3 kt3Var2 = new kt3(0, -2);
        float f2 = 12;
        appCompatTextView.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f2), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingEnd(), appCompatTextView.getPaddingBottom());
        kt3Var2.s = i;
        kt3Var2.i = 0;
        kt3Var2.v = 0;
        appCompatTextView.setLayoutParams(kt3Var2);
        appCompatTextView.setSingleLine(true);
        dpg.f.b(appCompatTextView, t75.b);
        this.F0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
        appCompatTextView2.setId(r8b.s0);
        kt3 kt3Var3 = new kt3(0, -2);
        kt3Var3.t = i2;
        kt3Var3.j = i2;
        kt3Var3.l = 0;
        kt3Var3.v = 0;
        float f3 = 8;
        appCompatTextView2.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(4 * vw4.d().getDisplayMetrics().density), appCompatTextView2.getPaddingEnd(), kti.d(vw4.d().getDisplayMetrics().density * f3));
        appCompatTextView2.setLayoutParams(kt3Var3);
        dpg.j.b(appCompatTextView2, t75.b);
        this.G0 = appCompatTextView2;
        constraintLayout.setLayoutParams(new kt3(-1, -2));
        constraintLayout.addView(imageView);
        constraintLayout.addView(appCompatTextView);
        constraintLayout.addView(appCompatTextView2);
        constraintLayout.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        tqi.c(new kga(this, (Continuation) null, 23), constraintLayout);
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        qbe qbeVar = (qbe) t98Var;
        int i = hzc.profile_selectable_item_tag;
        Integer numValueOf = Integer.valueOf(qbeVar.a);
        View view = this.a;
        rqi.e(i, view, numValueOf);
        this.F0.setText(qbeVar.c.b(view.getContext()));
        this.G0.setText(qbeVar.d.b(view.getContext()));
        boolean z = qbeVar.b;
        ImageView imageView = this.E0;
        imageView.setSelected(z);
        imageView.setImageDrawable(z ? r34.b(view.getContext(), y9b.o) : null);
    }
}
