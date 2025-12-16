package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class il2 extends ConstraintLayout implements u6g {
    public final TextView F0;
    public final TextView G0;
    public final Drawable H0;
    public final FrameLayout I0;
    public final Object J0;
    public final uxa K0;
    public final ImageView L0;

    public il2(Context context) {
        super(context, null);
        TextView textView = new TextView(context);
        kt3 kt3Var = new kt3(-1, -2);
        ((ViewGroup.MarginLayoutParams) kt3Var).bottomMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
        textView.setLayoutParams(kt3Var);
        dpg.f.b(textView, t75.b);
        textView.setSingleLine(true);
        textView.setMaxLines(1);
        textView.setLetterSpacing(0.0f);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.F0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setLayoutParams(new kt3(-1, -2));
        dpg.j.b(textView2, t75.b);
        textView2.setMaxLines(1);
        this.G0 = textView2;
        int iD = kti.d(48 * vw4.d().getDisplayMetrics().density);
        Drawable drawableMutate = r34.b(getContext(), yud.M).mutate();
        this.H0 = drawableMutate;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(v8b.j0);
        kt3 kt3Var2 = new kt3(iD, iD);
        float f = 12;
        kt3Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
        frameLayout.setLayoutParams(kt3Var2);
        this.I0 = frameLayout;
        this.J0 = ipi.b(3, new m3(context, 25, this));
        uxa uxaVar = new uxa(context);
        uxaVar.setId(v8b.k0);
        uxaVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        uxaVar.setAvatarShape(mxa.a);
        uxa.o(uxaVar, drawableMutate, null, null, 30);
        frameLayout.addView(uxaVar);
        this.K0 = uxaVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(v8b.h0);
        linearLayout.setLayoutParams(new kt3(0, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        ImageView imageView = new ImageView(context);
        imageView.setId(v8b.i0);
        float f2 = 24;
        imageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
        imageView.setVisibility(4);
        this.L0 = imageView;
        setLayoutParams(new kt3(-1, -2));
        v1a v1aVar = a93.s0;
        setBackground(new RippleDrawable(ColorStateList.valueOf(v1aVar.y(this).c().a.a.i), null, new ColorDrawable(-1)));
        setMinimumHeight(kti.d(72 * vw4.d().getDisplayMetrics().density));
        float f3 = 15;
        setPaddingRelative(0, kti.d(vw4.d().getDisplayMetrics().density * f3), 0, kti.d(f3 * vw4.d().getDisplayMetrics().density));
        addView(frameLayout);
        addView(linearLayout);
        addView(imageView);
        ut3 ut3VarG = l5j.g(this);
        int id = frameLayout.getId();
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 4, 0, 4);
        int id2 = linearLayout.getId();
        ut3VarG.d(id2, 3, 0, 3);
        ut3VarG.d(id2, 4, 0, 4);
        ut3VarG.d(id2, 6, frameLayout.getId(), 7);
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id2, 5));
        ut3VarG.d(id2, 7, 0, 7);
        new fua(ut3VarG, 7, id2, 5).e(kti.d(f * vw4.d().getDisplayMetrics().density));
        ut3VarG.a(this);
        onThemeChanged(v1aVar.y(this));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.F0.setTextColor(yebVar.getText().e);
        this.G0.setTextColor(yebVar.getText().g);
        this.K0.onThemeChanged(yebVar);
        this.L0.setImageTintList(ColorStateList.valueOf(yebVar.getIcon().f));
    }

    public final void setFileDescription(CharSequence charSequence) {
        this.G0.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.F0.setText(charSequence);
    }
}
