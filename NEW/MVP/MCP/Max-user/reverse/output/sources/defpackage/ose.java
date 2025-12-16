package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class ose extends LinearLayout implements u6g {
    public final uxa a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final AppCompatTextView d;
    public final AppCompatTextView o;
    public final LinearLayout s0;

    public ose(Context context) {
        super(context, null);
        uxa uxaVar = new uxa(context);
        uxaVar.setId(obb.k);
        float f = 96;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        layoutParams.gravity = 1;
        float f2 = 12;
        layoutParams.bottomMargin = kti.d(vw4.d().getDisplayMetrics().density * f2);
        layoutParams.topMargin = kti.d(f2 * vw4.d().getDisplayMetrics().density);
        uxaVar.setLayoutParams(layoutParams);
        uxaVar.setAvatarShape(kxa.a);
        this.a = uxaVar;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(obb.n);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = kti.d(6 * vw4.d().getDisplayMetrics().density);
        appCompatTextView.setLayoutParams(layoutParams2);
        float f3 = 20;
        appCompatTextView.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f3), appCompatTextView.getPaddingTop(), kti.d(vw4.d().getDisplayMetrics().density * f3), appCompatTextView.getPaddingBottom());
        appCompatTextView.setGravity(1);
        dpg.b.b(appCompatTextView, t75.b);
        v1a v1aVar = a93.s0;
        appCompatTextView.setTextColor(v1aVar.y(appCompatTextView).getText().e);
        appCompatTextView.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        this.b = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
        appCompatTextView2.setId(obb.p);
        appCompatTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView2.setGravity(1);
        t5g t5gVar = dpg.j;
        t5gVar.b(appCompatTextView2, t75.b);
        appCompatTextView2.setTextColor(v1aVar.y(appCompatTextView2).getText().j);
        this.c = appCompatTextView2;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context, null);
        appCompatTextView3.setId(obb.m);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        float f4 = 4;
        layoutParams3.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f4));
        layoutParams3.setMarginEnd(kti.d(f4 * vw4.d().getDisplayMetrics().density));
        appCompatTextView3.setLayoutParams(layoutParams3);
        appCompatTextView3.setText("·");
        appCompatTextView3.setGravity(1);
        t5gVar.b(appCompatTextView3, t75.b);
        appCompatTextView3.setTextColor(v1aVar.y(appCompatTextView3).getText().h);
        this.d = appCompatTextView3;
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(context, null);
        appCompatTextView4.setId(obb.o);
        appCompatTextView4.setLayoutParams(new oe3(-2, -2));
        appCompatTextView4.setGravity(1);
        t5gVar.b(appCompatTextView4, t75.b);
        appCompatTextView4.setTextColor(v1aVar.y(appCompatTextView4).getText().j);
        appCompatTextView4.setEllipsize(truncateAt);
        appCompatTextView4.setMaxLines(1);
        this.o = appCompatTextView4;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(obb.l);
        linearLayout.setLayoutParams(new oe3(-2, -2));
        linearLayout.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f3), linearLayout.getPaddingTop(), kti.d(f3 * vw4.d().getDisplayMetrics().density), linearLayout.getPaddingBottom());
        linearLayout.setOrientation(0);
        linearLayout.addView(appCompatTextView2);
        linearLayout.addView(appCompatTextView3);
        linearLayout.addView(appCompatTextView4);
        this.s0 = linearLayout;
        setId(obb.j);
        oe3 oe3Var = new oe3(-1, -2);
        setMinimumHeight(kti.d(172 * vw4.d().getDisplayMetrics().density));
        oe3Var.a = 2;
        oe3Var.b = -0.3f;
        ((FrameLayout.LayoutParams) oe3Var).bottomMargin = kti.d(24 * vw4.d().getDisplayMetrics().density);
        setLayoutParams(oe3Var);
        setClipToPadding(false);
        setGravity(1);
        setOrientation(1);
        addView(uxaVar);
        addView(appCompatTextView);
        addView(linearLayout);
    }

    private final void setDivider(boolean z) {
        this.d.setVisibility(z ? 0 : 8);
    }

    private final void setNickname(String str) {
        int i = str == null || str.length() == 0 ? 8 : 0;
        AppCompatTextView appCompatTextView = this.o;
        appCompatTextView.setVisibility(i);
        if (str == null) {
            str = "";
        }
        appCompatTextView.setText(str);
    }

    private final void setPhoneNumber(String str) {
        int i = str == null || str.length() == 0 ? 8 : 0;
        AppCompatTextView appCompatTextView = this.c;
        appCompatTextView.setVisibility(i);
        if (str == null) {
            str = "";
        }
        appCompatTextView.setText(str);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.b.setTextColor(yebVar.getText().e);
        this.c.setTextColor(yebVar.getText().j);
        this.o.setTextColor(yebVar.getText().j);
        this.d.setTextColor(yebVar.getText().h);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.s0.setAlpha(f);
        this.a.setAlpha(f);
    }

    public final void setAvatarClickedListener(cm6 cm6Var) {
        f8j.d(this.a, 300L, new x6(15, cm6Var));
    }

    public final void setNicknameClickListener(cm6 cm6Var) {
        f8j.d(this.o, 300L, new x6(14, cm6Var));
    }

    public final void setTopBarContent(fre freVar) {
        uxa.n(this.a, freVar.b, Long.valueOf(freVar.a), freVar.d);
        this.b.setText(freVar.c);
        String str = freVar.e;
        setPhoneNumber(str);
        String str2 = freVar.f;
        setNickname(str2);
        setDivider((str.length() == 0 || str2 == null || str2.length() == 0) ? false : true);
    }

    public final void setUserPhoneClickListener(cm6 cm6Var) {
        f8j.d(this.c, 300L, new x6(13, cm6Var));
    }
}
