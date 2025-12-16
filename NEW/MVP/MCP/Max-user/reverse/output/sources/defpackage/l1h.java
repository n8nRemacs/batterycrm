package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class l1h extends View {
    public static final /* synthetic */ yy7[] B0 = {new z8a(l1h.class, "isBackgroundEnabled", "isBackgroundEnabled()Z"), u45.h(vid.a, l1h.class, "isCapsuleInside", "isCapsuleInside()Z"), new z8a(l1h.class, "isDrawableEnabled", "isDrawableEnabled()Z"), new z8a(l1h.class, "text", "getText()Ljava/lang/CharSequence;")};
    public static final TextPaint C0 = new TextPaint();
    public final k1h A0;
    public final h18 a;
    public final float b;
    public final int c;
    public final int d;
    public final int o;
    public final Object s0;
    public final int t0;
    public final k1h u0;
    public final k1h v0;
    public final k1h w0;
    public Drawable x0;
    public Layout y0;
    public final Object z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1h(Context context) {
        super(context);
        h18 h18Var = (h18) gq9.a.getAccessor().c(114);
        this.a = h18Var;
        this.b = vw4.d().getDisplayMetrics().density * 4.0f;
        int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
        this.c = iD;
        this.d = kti.d(6 * vw4.d().getDisplayMetrics().density);
        this.o = kti.d(3 * vw4.d().getDisplayMetrics().density);
        this.s0 = ipi.b(3, new q8g(11));
        this.t0 = a93.s0.y(this).a().G().g.a;
        this.u0 = new k1h(this, 1);
        this.v0 = new k1h(this, 2);
        k1h k1hVar = new k1h(this, 3);
        this.w0 = k1hVar;
        this.z0 = ipi.b(3, new q8g(12));
        this.A0 = new k1h(this, 0);
        setId(j7b.P);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setTranslationZ(Float.MAX_VALUE);
        TextPaint textPaint = C0;
        textPaint.setAntiAlias(true);
        t5g t5gVar = vz2.d;
        textPaint.setTextSize(sw4.b(t5gVar.e(t75.b), context));
        textPaint.setLetterSpacing(sw4.b(t5gVar.e, context));
        textPaint.setTypeface(Typeface.create(Typeface.create(t5gVar.f, 0), u45.b(t5gVar.g)));
        setWillNotDraw(false);
        yy7 yy7Var = B0[2];
        if (((Boolean) k1hVar.b).booleanValue()) {
            Drawable drawableMutate = r34.b(getContext(), yud.f2).mutate();
            drawableMutate.setBounds(0, 0, iD, iD);
            drawableMutate.setTint(getDrawableColor());
            this.x0 = drawableMutate;
        }
    }

    private final int getBackgroundColor() {
        v1a v1aVar = a93.s0;
        yy7 yy7Var = B0[1];
        return ((Boolean) this.v0.b).booleanValue() ? v1aVar.y(this).a().G().b.f : v1aVar.y(this).a().G().b.g;
    }

    private final float getBackgroundCornerRadius() {
        return getHeight() / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDrawableColor() {
        a93.s0.y(this).a();
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final BoringLayout.Metrics getMetrics() {
        return (BoringLayout.Metrics) this.z0.getValue();
    }

    private final CharSequence getText() {
        yy7 yy7Var = B0[3];
        return (CharSequence) this.A0.b;
    }

    private final void setText(CharSequence charSequence) {
        this.A0.O(this, B0[3], charSequence);
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int iSave;
        Layout layout = this.y0;
        if (layout == null) {
            return;
        }
        layout.getPaint().setColor(this.t0);
        float height = (getHeight() - layout.getHeight()) * 0.5f;
        yy7 yy7Var = B0[0];
        float fWidth = 0.0f;
        if (((Boolean) this.u0.b).booleanValue()) {
            fWidth = 0.0f + this.d;
            ?? r3 = this.s0;
            ((Paint) r3.getValue()).setColor(getBackgroundColor());
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), getBackgroundCornerRadius(), getBackgroundCornerRadius(), (Paint) r3.getValue());
        } else {
            canvas2 = canvas;
        }
        boolean zD = m8j.d(this);
        float f = this.b;
        if (!zD) {
            Drawable drawable = this.x0;
            if (drawable != null) {
                iSave = canvas2.save();
                canvas2.translate(fWidth, (getHeight() - drawable.getBounds().height()) * 0.5f);
                try {
                    drawable.draw(canvas2);
                    canvas2.restoreToCount(iSave);
                    fWidth += drawable.getBounds().width() + f;
                } finally {
                }
            }
            iSave = canvas2.save();
            canvas2.translate(fWidth, height);
            try {
                layout.draw(canvas2);
                return;
            } finally {
            }
        }
        iSave = canvas2.save();
        canvas2.translate(fWidth, height);
        try {
            layout.draw(canvas2);
            canvas2.restoreToCount(iSave);
            Drawable drawable2 = this.x0;
            if (drawable2 == null) {
                return;
            }
            iSave = canvas2.save();
            canvas2.translate(fWidth + layout.getWidth() + f, (getHeight() - drawable2.getBounds().height()) * 0.5f);
            try {
                drawable2.draw(canvas2);
            } finally {
            }
        } finally {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMax;
        int iWidth;
        Layout layout = this.y0;
        if (layout != null) {
            iWidth = layout.getWidth();
            iMax = layout.getHeight();
        } else {
            iMax = 0;
            iWidth = 0;
        }
        Drawable drawable = this.x0;
        if (drawable != null) {
            iWidth += drawable.getBounds().width() + kti.d(this.b);
            iMax = Math.max(iMax, drawable.getBounds().height());
        }
        yy7 yy7Var = B0[0];
        if (((Boolean) this.u0.b).booleanValue()) {
            iWidth += this.d * 2;
            iMax += this.o * 2;
        }
        setMeasuredDimension(iWidth, iMax);
    }

    public final void setBackgroundEnabled(boolean z) {
        this.u0.O(this, B0[0], Boolean.valueOf(z));
    }

    public final void setCapsuleInside(boolean z) {
        this.v0.O(this, B0[1], Boolean.valueOf(z));
    }

    public final void setContent(CharSequence charSequence) {
        setText(charSequence);
    }

    public final void setDrawableEnabled(boolean z) {
        this.w0.O(this, B0[2], Boolean.valueOf(z));
    }
}
