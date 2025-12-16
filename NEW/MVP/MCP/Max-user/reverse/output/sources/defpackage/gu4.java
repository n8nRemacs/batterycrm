package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class gu4 extends LinearLayout implements u6g {
    public static final /* synthetic */ yy7[] u0 = {new z8a(gu4.class, "maxCount", "getMaxCount()I"), u45.h(vid.a, gu4.class, "backgroundColorAttr", "getBackgroundColorAttr()Ljava/lang/Integer;"), new z8a(gu4.class, "textColorAttr", "getTextColorAttr()I"), new z8a(gu4.class, "hintColorAttr", "getHintColorAttr()I"), new z8a(gu4.class, "limitTextColorAttr", "getLimitTextColorAttr()I")};
    public final fu4 a;
    public final fu4 b;
    public final fu4 c;
    public final fu4 d;
    public final fu4 o;
    public final w3b s0;
    public final TextView t0;

    public gu4(Context context) {
        super(context, null);
        this.a = new fu4(this, 0);
        this.b = new fu4(this, 1);
        this.c = new fu4(Integer.valueOf(w9b.X), this, 2);
        int i = w9b.Y;
        this.d = new fu4(Integer.valueOf(i), this, 3);
        this.o = new fu4(Integer.valueOf(i), this, 4);
        w3b w3bVar = new w3b(context, 14);
        w3bVar.setId(zud.P);
        dpg.h.b(w3bVar, t75.b);
        w3bVar.setBackground(null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(kti.d(2 * vw4.d().getDisplayMetrics().density), w3bVar.getLineHeight());
        mfh.l(w3bVar, gradientDrawable);
        w3bVar.setGravity(8388659);
        w3bVar.setMinLines(2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 8388659;
        w3bVar.setLayoutParams(layoutParams);
        w3bVar.setPadding(0, 0, 0, 0);
        this.s0 = w3bVar;
        TextView textView = new TextView(context);
        dpg.r.b(textView, t75.b);
        textView.setPadding(0, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388693;
        textView.setLayoutParams(layoutParams2);
        this.t0 = textView;
        setOrientation(0);
        setGravity(16);
        setClipToOutline(true);
        setOutlineProvider(new u74(kti.d(16 * vw4.d().getDisplayMetrics().density)));
        addView(w3bVar);
        addView(textView);
        float f = 12;
        setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f));
        onThemeChanged(a93.s0.y(this));
    }

    public final Integer getBackgroundColorAttr() {
        yy7 yy7Var = u0[1];
        return (Integer) this.b.b;
    }

    public final int getHintColorAttr() {
        yy7 yy7Var = u0[3];
        return ((Number) this.d.b).intValue();
    }

    public final int getLimitTextColorAttr() {
        yy7 yy7Var = u0[4];
        return ((Number) this.o.b).intValue();
    }

    public final int getMaxCount() {
        yy7 yy7Var = u0[0];
        return ((Number) this.a.b).intValue();
    }

    public final int getTextColorAttr() {
        yy7 yy7Var = u0[2];
        return ((Number) this.c.b).intValue();
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        v1a v1aVar = a93.s0;
        w3b w3bVar = this.s0;
        Drawable drawableF = mfh.f(w3bVar);
        GradientDrawable gradientDrawable = drawableF instanceof GradientDrawable ? (GradientDrawable) drawableF : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(yebVar.getText().j));
        }
        Integer backgroundColorAttr = getBackgroundColorAttr();
        if (backgroundColorAttr != null) {
            setBackgroundColor(v1aVar.y(this).g(backgroundColorAttr.intValue()));
        }
        w3bVar.setTextColor(v1aVar.y(this).g(getTextColorAttr()));
        w3bVar.setHintTextColor(v1aVar.y(this).g(getHintColorAttr()));
        t2i.c(w3bVar, yebVar);
        this.t0.setTextColor(v1aVar.y(this).g(getLimitTextColorAttr()));
    }

    public final void setBackgroundColorAttr(Integer num) {
        this.b.O(this, u0[1], num);
    }

    public final void setHint(s5g s5gVar) {
        this.s0.setHint(s5gVar.d(this));
    }

    public final void setHintColorAttr(int i) {
        this.d.O(this, u0[3], Integer.valueOf(i));
    }

    public final void setLimitTextColorAttr(int i) {
        this.o.O(this, u0[4], Integer.valueOf(i));
    }

    public final void setMaxCount(int i) {
        this.a.O(this, u0[0], Integer.valueOf(i));
    }

    public final void setText(String str) {
        this.s0.setTextKeepState(str == null ? "" : str);
        int i = getMaxCount() != Integer.MAX_VALUE ? 0 : 8;
        TextView textView = this.t0;
        textView.setVisibility(i);
        textView.setText(String.valueOf(getMaxCount() - (str != null ? str.length() : 0)));
    }

    public final void setTextColorAttr(int i) {
        this.c.O(this, u0[2], Integer.valueOf(i));
    }
}
