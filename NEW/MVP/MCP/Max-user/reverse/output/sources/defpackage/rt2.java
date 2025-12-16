package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final class rt2 extends LinearLayout implements u6g {
    public final x4g a;
    public final x4g b;
    public final x4g c;
    public final Paint d;

    public rt2(Context context) {
        super(context, null);
        x4g x4gVar = new x4g(context);
        this.a = x4gVar;
        x4g x4gVar2 = new x4g(context);
        this.b = x4gVar2;
        x4g x4gVar3 = new x4g(context);
        this.c = x4gVar3;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(vw4.d().getDisplayMetrics().density * 1.0f);
        v1a v1aVar = a93.s0;
        paint.setColor(v1aVar.y(this).i().b.b);
        this.d = paint;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 16.0f);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
        jg3 jg3Var = v1aVar.y(this).a().G().b.a;
        gradientDrawable.setColors(new int[]{jg3Var.g, jg3Var.h});
        setOrientation(1);
        setGravity(16);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388611;
        float f = 8;
        layoutParams.topMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
        addView(x4gVar, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        layoutParams2.setMarginEnd(kti.d(vw4.d().getDisplayMetrics().density * f));
        layoutParams2.gravity = 8388613;
        addView(x4gVar2, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388611;
        layoutParams3.topMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        layoutParams3.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
        layoutParams3.bottomMargin = kti.d(f * vw4.d().getDisplayMetrics().density);
        addView(x4gVar3, layoutParams3);
        setClipToOutline(true);
        setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 16.0f));
        setBackground(gradientDrawable);
    }

    public final void a(qt2 qt2Var) {
        int i;
        eh9 eh9Var = qt2Var.d;
        gr9 gr9Var = qt2Var.f;
        pb2 pb2Var = qt2Var.a;
        pm9 pm9VarC = gr9.c(gr9Var, pb2Var, eh9Var, true);
        eh9 eh9Var2 = qt2Var.b;
        pm9 pm9VarC2 = gr9.c(gr9Var, pb2Var, eh9Var2, true);
        eh9 eh9Var3 = qt2Var.c;
        pm9 pm9VarC3 = gr9.c(gr9Var, pb2Var, eh9Var3, true);
        x4g x4gVar = this.a;
        x4gVar.setTextMessageLayout(pm9VarC2);
        kk4 kk4Var = qh9.s;
        v1a v1aVar = a93.s0;
        yeb yebVarY = v1aVar.y(x4gVar);
        kk4Var.getClass();
        x4gVar.setBackground(kk4.o(yebVarY));
        d7c d7cVar = eh9Var2.o;
        d7cVar.g();
        x4gVar.h(d7cVar.k, false);
        x4g x4gVar2 = this.b;
        x4gVar2.setTextMessageLayout(pm9VarC);
        xl9 xl9Var = eh9Var.a.O0;
        if (xl9Var != null) {
            x4gVar2.g(xl9Var, false);
        }
        x4gVar2.setBackground(kk4.o(v1aVar.y(x4gVar2)));
        x4gVar2.setDateViewStatus(qt2Var.e);
        d7c d7cVar2 = eh9Var.o;
        d7cVar2.g();
        x4gVar2.h(d7cVar2.k, false);
        x4g x4gVar3 = this.c;
        x4gVar3.setTextMessageLayout(pm9VarC3);
        x4gVar3.setBackground(kk4.o(v1aVar.y(x4gVar3)));
        d7c d7cVar3 = eh9Var3.o;
        d7cVar3.g();
        x4gVar3.h(d7cVar3.k, false);
        sy2 sy2Var = qt2Var.g;
        x4gVar2.y(sy2Var.r());
        x4gVar2.setTextMessageColors(sy2Var.r());
        x4gVar2.l(sy2Var.r(), true);
        Drawable background = x4gVar2.getBackground();
        qh9 qh9Var = background instanceof qh9 ? (qh9) background : null;
        if (qh9Var != null) {
            i = 1;
            if (qh9.b(qh9Var, false, 1, true, true, sy2Var.r().c.a, false)) {
                qh9Var.invalidateSelf();
            }
        } else {
            i = 1;
        }
        x4gVar2.requestLayout();
        x4gVar3.setTextMessageColors(sy2Var.i());
        x4gVar3.y(sy2Var.i());
        Drawable background2 = x4gVar3.getBackground();
        qh9 qh9Var2 = background2 instanceof qh9 ? (qh9) background2 : null;
        if (qh9Var2 != null) {
            int i2 = i;
            i = i2;
            if (qh9.b(qh9Var2, true, i2, true, true, sy2Var.i().c.a, false)) {
                qh9Var2.invalidateSelf();
            }
        }
        x4gVar3.requestLayout();
        x4gVar.y(sy2Var.i());
        x4gVar.setTextMessageColors(sy2Var.i());
        Drawable background3 = x4gVar.getBackground();
        qh9 qh9Var3 = background3 instanceof qh9 ? (qh9) background3 : null;
        if (qh9Var3 != null) {
            if (qh9.b(qh9Var3, true, i, true, true, sy2Var.i().c.a, false)) {
                qh9Var3.invalidateSelf();
            }
        }
        x4gVar.requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = (vw4.d().getDisplayMetrics().density * 1.0f) / 2;
        canvas.drawRoundRect(f, f, getWidth() - f, getHeight() - f, (vw4.d().getDisplayMetrics().density * 16.0f) - f, (vw4.d().getDisplayMetrics().density * 16.0f) - f, this.d);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        Drawable background = getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            jg3 jg3Var = yebVar.a().G().b.a;
            gradientDrawable.setColors(new int[]{jg3Var.g, jg3Var.h});
        }
        a93.h(a93.s0.x(getContext()), this);
    }

    public final void setBackgroundPreview(Drawable drawable) {
        setBackground(drawable);
        requestLayout();
    }
}
