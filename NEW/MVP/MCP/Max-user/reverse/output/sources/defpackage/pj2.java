package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class pj2 extends ConstraintLayout implements u6g {
    public final TextView F0;
    public final TextView G0;
    public final o8b H0;
    public r40 I0;
    public r40 J0;
    public x9f K0;
    public x9f L0;
    public Long M0;

    public pj2(Context context) {
        super(context, null);
        TextView textView = new TextView(context);
        kt3 kt3Var = new kt3(-1, -2);
        float f = 4;
        ((ViewGroup.MarginLayoutParams) kt3Var).bottomMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        textView.setLayoutParams(kt3Var);
        dpg.f.b(textView, t75.b);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.F0 = textView;
        TextView textView2 = new TextView(context);
        kt3 kt3Var2 = new kt3(-1, -2);
        ((ViewGroup.MarginLayoutParams) kt3Var2).bottomMargin = kti.d(f * vw4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(kt3Var2);
        dpg.j.b(textView2, t75.b);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        textView2.setVisibility(8);
        this.G0 = textView2;
        o8b o8bVar = new o8b(context);
        o8bVar.setId(v8b.m0);
        float f2 = 40;
        o8bVar.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
        o8bVar.setScaleType(ImageView.ScaleType.CENTER);
        this.H0 = o8bVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(v8b.l0);
        linearLayout.setLayoutParams(new kt3(0, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        setLayoutParams(new kt3(-1, -2));
        float f3 = 12;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f3);
        setPadding(iD, iD, iD, iD);
        v1a v1aVar = a93.s0;
        setBackground(new RippleDrawable(ColorStateList.valueOf(v1aVar.y(this).c().a.a.i), null, new ColorDrawable(-1)));
        addView(o8bVar);
        addView(linearLayout);
        ut3 ut3VarG = l5j.g(this);
        int id = o8bVar.getId();
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 4, 0, 4);
        int id2 = linearLayout.getId();
        ut3VarG.d(id2, 3, 0, 3);
        ut3VarG.d(id2, 4, 0, 4);
        ut3VarG.d(id2, 7, 0, 7);
        ut3VarG.d(id2, 6, o8bVar.getId(), 7);
        new fua(ut3VarG, 6, id2, 5).e(kti.d(f3 * vw4.d().getDisplayMetrics().density));
        ut3VarG.a(this);
        onThemeChanged(v1aVar.y(this));
    }

    private final void setButtonState(p20 p20Var) {
        boolean zA = fni.a(p20Var, wha.c);
        o8b o8bVar = this.H0;
        if (zA) {
            o8bVar.setPlaying(true);
        } else {
            if (!fni.a(p20Var, uha.c) && !fni.a(p20Var, jbe.b) && !fni.a(p20Var, mni.a)) {
                throw new NoWhenBranchMatchedException();
            }
            o8bVar.setPlaying(false);
        }
    }

    private final void setState(x26 x26Var) {
        r40 r40Var;
        this.I0 = new r40(this, 2, x26Var);
        if (isAttachedToWindow() && (r40Var = this.I0) != null) {
            r40Var.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.I0);
    }

    private final void setSubtitle(CharSequence charSequence) {
        int i = charSequence == null || charSequence.length() == 0 ? 8 : 0;
        TextView textView = this.G0;
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        this.F0.setText(charSequence);
    }

    public static final void v(pj2 pj2Var, x40 x40Var) {
        p20 p20Var = x40Var != null ? x40Var.d : null;
        if (p20Var == null || !fni.a(x40Var.a, pj2Var.M0)) {
            pj2Var.setButtonState(jbe.b);
        } else {
            pj2Var.setButtonState(p20Var);
        }
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.F0.setTextColor(yebVar.getText().e);
        this.G0.setTextColor(yebVar.getText().g);
    }

    public final void setupAudio(sb9 sb9Var) {
        r40 r40Var;
        this.M0 = Long.valueOf(sb9Var.b);
        setTitle(sb9Var.X);
        setSubtitle(sb9Var.Y);
        setState(sb9Var.s0);
        this.J0 = new r40(this, 3, sb9Var.t0);
        if (isAttachedToWindow() && (r40Var = this.J0) != null) {
            r40Var.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.J0);
    }
}
