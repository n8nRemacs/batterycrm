package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class x32 extends ugc implements u6g {
    public final OneMeButton E0;
    public final AppCompatTextView F0;

    public x32(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        super(linearLayout);
        OneMeButton oneMeButton = new OneMeButton(context, null);
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.a);
        oneMeButton.setAppearance(gza.c);
        oneMeButton.setText(u8b.j);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
        float f = 12;
        layoutParams.topMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        layoutParams.leftMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        layoutParams.rightMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        oneMeButton.setLayoutParams(layoutParams);
        this.E0 = oneMeButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        Drawable drawableB = r34.b(context, q8b.a);
        ArrayList arrayList = b6g.a;
        appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB, (Drawable) null, (Drawable) null, (Drawable) null);
        v1a v1aVar = a93.s0;
        appCompatTextView.setCompoundDrawableTintList(ColorStateList.valueOf(v1aVar.y(linearLayout).getIcon().c));
        float f2 = 20;
        appCompatTextView.setCompoundDrawablePadding(kti.d(vw4.d().getDisplayMetrics().density * f2));
        dpg.d.b(appCompatTextView, t75.b);
        appCompatTextView.setTextColor(v1aVar.y(linearLayout).getText().b);
        appCompatTextView.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(10 * vw4.d().getDisplayMetrics().density));
        this.F0 = appCompatTextView;
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setBackground(null);
        linearLayout.addView(appCompatTextView);
        linearLayout.addView(oneMeButton);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        v1a v1aVar = a93.s0;
        View view = this.a;
        int i = v1aVar.y(view).getText().b;
        AppCompatTextView appCompatTextView = this.F0;
        appCompatTextView.setTextColor(i);
        int i2 = v1aVar.y(view).getIcon().c;
        ArrayList arrayList = b6g.a;
        appCompatTextView.setCompoundDrawableTintList(ColorStateList.valueOf(i2));
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        this.F0.setText(((w32) t98Var).a.b(this.a.getContext()));
    }
}
