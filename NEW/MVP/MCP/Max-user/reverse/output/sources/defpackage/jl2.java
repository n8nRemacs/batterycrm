package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class jl2 extends ConstraintLayout implements u6g {
    public final Object F0;
    public final TextView G0;
    public final TextView H0;
    public final TextView I0;
    public final uxa J0;
    public final LinearLayout K0;

    public jl2(Context context) {
        super(context, null);
        this.F0 = ipi.b(3, new hk1(10, this));
        TextView textView = new TextView(context);
        kt3 kt3Var = new kt3(-1, -2);
        float f = 4;
        ((ViewGroup.MarginLayoutParams) kt3Var).bottomMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        textView.setLayoutParams(kt3Var);
        dpg.f.b(textView, t75.b);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.G0 = textView;
        TextView textView2 = new TextView(context);
        kt3 kt3Var2 = new kt3(-1, -2);
        ((ViewGroup.MarginLayoutParams) kt3Var2).bottomMargin = kti.d(f * vw4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(kt3Var2);
        t5g t5gVar = dpg.j;
        t5gVar.b(textView2, t75.b);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        textView2.setVisibility(8);
        this.H0 = textView2;
        TextView textView3 = new TextView(context);
        textView3.setLayoutParams(new kt3(-1, -2));
        t5gVar.b(textView3, t75.b);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        v1a v1aVar = a93.s0;
        textView3.setBackground(new RippleDrawable(ColorStateList.valueOf(v1aVar.y(textView3).c().a.a.i), null, new ColorDrawable(-1)));
        this.I0 = textView3;
        uxa uxaVar = new uxa(context);
        uxaVar.setId(v8b.m0);
        float f2 = 48;
        uxaVar.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
        uxaVar.setAvatarShape(mxa.a);
        this.J0 = uxaVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(v8b.l0);
        linearLayout.setLayoutParams(new kt3(0, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        this.K0 = linearLayout;
        setLayoutParams(new kt3(-1, -2));
        int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
        setPadding(iD, iD, iD, iD);
        setBackground(new RippleDrawable(ColorStateList.valueOf(v1aVar.y(this).c().a.a.i), null, new ColorDrawable(-1)));
        addView(uxaVar);
        addView(linearLayout);
        onThemeChanged(v1aVar.y(this));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.G0.setTextColor(yebVar.getText().e);
        this.H0.setTextColor(yebVar.getText().g);
        this.I0.setTextColor(yebVar.getText().j);
        this.J0.onThemeChanged(yebVar);
    }

    public final void setLink(CharSequence charSequence) {
        int i = charSequence != null ? 0 : 8;
        TextView textView = this.I0;
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    public final void setLinkOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.I0.setOnLongClickListener(onLongClickListener);
    }

    public final void setLinkPhoto(String str) {
        mc0 mc0VarA = fui.a(this.G0.getText(), 9223372036854775806L);
        uxa uxaVar = this.J0;
        uxaVar.setAvatarUrl(str);
        uxaVar.l(mc0VarA, false);
        v();
    }

    public final void setOnLinkClickListener(View.OnClickListener onClickListener) {
        f8j.d(this.I0, 300L, onClickListener);
    }

    public final void setSubtitle(CharSequence charSequence) {
        int i = charSequence == null || charSequence.length() == 0 ? 8 : 0;
        TextView textView = this.H0;
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.G0.setText(charSequence);
    }

    public final void v() {
        ut3 ut3VarG = l5j.g(this);
        uxa uxaVar = this.J0;
        int id = uxaVar.getId();
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 4, 0, 4);
        int id2 = this.K0.getId();
        ut3VarG.d(id2, 3, 0, 3);
        ut3VarG.d(id2, 4, 0, 4);
        ut3VarG.d(id2, 7, 0, 7);
        ut3VarG.d(id2, 6, uxaVar.getId(), 7);
        new fua(ut3VarG, 6, id2, 5).e(kti.d(12 * vw4.d().getDisplayMetrics().density));
        ut3VarG.a(this);
    }
}
