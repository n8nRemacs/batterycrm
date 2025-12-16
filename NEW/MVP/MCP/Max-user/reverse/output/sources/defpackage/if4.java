package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes2.dex */
public final class if4 extends View implements u6g {
    public static final /* synthetic */ yy7[] K0 = {new z8a(if4.class, "isBackgroundEnabled", "isBackgroundEnabled$message_list_release()Z"), u45.h(vid.a, if4.class, "dateText", "getDateText()Ljava/lang/CharSequence;"), new z8a(if4.class, "countViewText", "getCountViewText()Ljava/lang/CharSequence;"), new z8a(if4.class, "isChannelMode", "isChannelMode$message_list_release()Z")};
    public static final TextPaint L0 = new TextPaint();
    public final hf4 A0;
    public ghh B0;
    public Drawable C0;
    public BoringLayout D0;
    public BoringLayout E0;
    public final Object F0;
    public final hf4 G0;
    public final hf4 H0;
    public final hf4 I0;
    public final h8a J0;
    public final float a;
    public final int b;
    public final int c;
    public final int d;
    public int o;
    public final int s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final Object w0;
    public final Object x0;
    public int y0;
    public int z0;

    public if4(Context context) {
        super(context);
        this.a = vw4.d().getDisplayMetrics().density * 4.0f;
        float f = 2;
        this.b = kti.d(vw4.d().getDisplayMetrics().density * f);
        float f2 = 16;
        this.c = kti.d(vw4.d().getDisplayMetrics().density * f2);
        this.d = kti.d(12 * vw4.d().getDisplayMetrics().density);
        this.s0 = kti.d(6 * vw4.d().getDisplayMetrics().density);
        this.t0 = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.u0 = kti.d(f * vw4.d().getDisplayMetrics().density);
        this.v0 = kti.d(f2 * vw4.d().getDisplayMetrics().density);
        this.w0 = ipi.b(3, new ps3(12));
        this.x0 = ipi.b(3, new e44(6, this));
        this.y0 = -1;
        this.z0 = -1;
        this.A0 = new hf4(this, 3);
        this.B0 = ghh.b;
        this.F0 = ipi.b(3, new ps3(13));
        boolean z = false;
        this.G0 = new hf4(this, 0, z);
        this.H0 = new hf4(this, 1, z);
        this.I0 = new hf4(this, 2);
        setId(j7b.K);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setTranslationZ(Float.MAX_VALUE);
        TextPaint textPaint = L0;
        textPaint.setAntiAlias(true);
        t5g t5gVar = vz2.d;
        textPaint.setTextSize(sw4.b(t5gVar.e(t75.b), context));
        textPaint.setLetterSpacing(sw4.b(t5gVar.e, context));
        textPaint.setTypeface(Typeface.create(Typeface.create(t5gVar.f, 0), u45.b(t5gVar.g)));
        setWillNotDraw(false);
        this.J0 = new h8a(ghh.Z.getSize());
    }

    private final float getBackgroundCornerRadius() {
        return getHeight() / 2.0f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Drawable getChannelViewCountDrawable() {
        return (Drawable) this.x0.getValue();
    }

    private final CharSequence getCountViewText() {
        yy7 yy7Var = K0[2];
        return (CharSequence) this.H0.b;
    }

    private final CharSequence getDateText() {
        yy7 yy7Var = K0[1];
        return (CharSequence) this.G0.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final BoringLayout.Metrics getMetrics() {
        return (BoringLayout.Metrics) this.F0.getValue();
    }

    private final void setCountViewText(CharSequence charSequence) {
        this.H0.O(this, K0[2], charSequence);
    }

    private final void setDateText(CharSequence charSequence) {
        this.G0.O(this, K0[1], charSequence);
    }

    public final boolean b() {
        yy7 yy7Var = K0[0];
        return ((Boolean) this.A0.b).booleanValue();
    }

    public final void c(CharSequence charSequence, boolean z) {
        if (z) {
            charSequence = new SpannableStringBuilder(getContext().getString(l7b.Q0)).append((CharSequence) " · ").append(charSequence);
        }
        setDateText(charSequence);
    }

    public final void d(ghh ghhVar) {
        Drawable drawable = this.C0;
        if (drawable != null) {
            int iOrdinal = ghhVar.ordinal();
            if (iOrdinal == 1) {
                te teVar = drawable instanceof te ? (te) drawable : null;
                if (teVar != null) {
                    teVar.c(this.z0);
                    return;
                }
                return;
            }
            if (iOrdinal != 4) {
                drawable.setTint(this.z0);
                return;
            }
            EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
            if (enhancedVectorDrawable != null) {
                v1a v1aVar = a93.s0;
                z18.e(enhancedVectorDrawable, "background", v1aVar.y(this).a().r().b.c);
                v1aVar.y(this).a();
                z18.e(enhancedVectorDrawable, "bar", -1);
                v1aVar.y(this).a();
                z18.e(enhancedVectorDrawable, "dot", -1);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height;
        Canvas canvas2;
        int iSave;
        TextPaint paint;
        TextPaint paint2;
        BoringLayout boringLayout = this.D0;
        BoringLayout boringLayout2 = this.E0;
        if (boringLayout == null && boringLayout2 == null) {
            return;
        }
        if (boringLayout != null && (paint2 = boringLayout.getPaint()) != null) {
            paint2.setColor(this.y0);
        }
        if (boringLayout2 != null && (paint = boringLayout2.getPaint()) != null) {
            paint.setColor(this.y0);
        }
        getChannelViewCountDrawable().setTint(this.y0);
        if (boringLayout != null) {
            height = boringLayout.getHeight();
        } else if (boringLayout2 == null) {
            return;
        } else {
            height = boringLayout2.getHeight();
        }
        float height2 = (getHeight() - height) * 0.5f;
        boolean zB = b();
        int i = this.s0;
        float f = 0.0f;
        if (zB) {
            f = 0.0f + i;
            ?? r2 = this.w0;
            ((Paint) r2.getValue()).setColor(this.o);
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), getBackgroundCornerRadius(), getBackgroundCornerRadius(), (Paint) r2.getValue());
        } else {
            canvas2 = canvas;
        }
        yy7 yy7Var = K0[3];
        if (!((Boolean) this.I0.b).booleanValue()) {
            BoringLayout boringLayout3 = this.D0;
            if (boringLayout3 != null) {
                iSave = canvas2.save();
                canvas2.translate(f, height2);
                try {
                    boringLayout3.draw(canvas2);
                    boringLayout3.getWidth();
                } finally {
                }
            }
            if (!b()) {
                i = 0;
            }
            Drawable drawable = this.C0;
            if (drawable != null) {
                iSave = canvas2.save();
                canvas2.translate((getMeasuredWidth() - i) - drawable.getBounds().width(), (getHeight() - drawable.getBounds().height()) * 0.5f);
                try {
                    drawable.draw(canvas2);
                    drawable.getBounds().width();
                    return;
                } finally {
                }
            }
            return;
        }
        float width = getWidth() - f;
        BoringLayout boringLayout4 = this.D0;
        if (boringLayout4 != null) {
            iSave = canvas2.save();
            canvas2.translate(width - boringLayout4.getWidth(), height2);
            try {
                boringLayout4.draw(canvas2);
                width -= boringLayout4.getWidth();
            } finally {
            }
        }
        Drawable drawable2 = this.C0;
        if (drawable2 != null) {
            iSave = canvas2.save();
            canvas2.translate((width - drawable2.getBounds().width()) - this.a, (getHeight() - drawable2.getBounds().height()) * 0.5f);
            try {
                drawable2.draw(canvas2);
                return;
            } finally {
            }
        }
        BoringLayout boringLayout5 = this.E0;
        if (boringLayout5 != null) {
            iSave = canvas2.save();
            canvas2.translate(width - boringLayout5.getWidth(), height2);
            try {
                boringLayout5.draw(canvas2);
                canvas2.restoreToCount(iSave);
                iSave = canvas2.save();
                canvas2.translate((width - (boringLayout5.getWidth() + this.u0)) - getChannelViewCountDrawable().getBounds().width(), (getHeight() - getChannelViewCountDrawable().getBounds().height()) * 0.5f);
                try {
                    getChannelViewCountDrawable().draw(canvas2);
                } finally {
                }
            } finally {
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMax;
        int width;
        Rect bounds;
        BoringLayout boringLayout = this.D0;
        if (boringLayout != null) {
            width = boringLayout.getWidth();
            iMax = Math.max(0, boringLayout.getHeight());
        } else {
            iMax = 0;
            width = 0;
        }
        Drawable drawable = this.C0;
        int iWidth = drawable != null ? drawable.getBounds().width() + kti.d(this.a) : 0;
        Drawable drawable2 = this.C0;
        int iHeight = (drawable2 == null || (bounds = drawable2.getBounds()) == null) ? 0 : bounds.height();
        BoringLayout boringLayout2 = this.E0;
        int width2 = (boringLayout2 == null || (this.C0 != null && b())) ? 0 : boringLayout2.getWidth() + (this.u0 * 2) + getChannelViewCountDrawable().getBounds().width();
        BoringLayout boringLayout3 = this.E0;
        int iMax2 = (boringLayout3 == null || (this.C0 != null && b())) ? 0 : Math.max((this.b * 2) + getChannelViewCountDrawable().getBounds().height(), boringLayout3.getHeight());
        int iMax3 = Math.max(iWidth, width2) + width;
        int[] iArr = {iHeight, iMax2, this.v0};
        for (int i3 = 0; i3 < 3; i3++) {
            iMax = Math.max(iMax, iArr[i3]);
        }
        if (b()) {
            yy7 yy7Var = K0[3];
            boolean zBooleanValue = ((Boolean) this.I0.b).booleanValue();
            int i4 = this.t0;
            int i5 = this.s0;
            iMax3 += (!zBooleanValue || this.C0 == null || this.E0 == null) ? i5 * 2 : i5 + i4;
            iMax += i4 * 2;
        }
        setMeasuredDimension(iMax3, iMax);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        d(this.B0);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (this.o == i) {
            return;
        }
        this.o = i;
        invalidate();
    }

    public final void setBackgroundEnabled$message_list_release(boolean z) {
        this.A0.O(this, K0[0], Boolean.valueOf(z));
    }

    public final void setChannelMode$message_list_release(boolean z) {
        this.I0.O(this, K0[3], Boolean.valueOf(z));
    }

    public final void setCountView$message_list_release(CharSequence charSequence) {
        if (charSequence == null) {
            setCountViewText(charSequence);
            return;
        }
        setCountViewText(new SpannableStringBuilder(charSequence).append((CharSequence) " · "));
        Drawable channelViewCountDrawable = getChannelViewCountDrawable();
        int i = this.d;
        channelViewCountDrawable.setBounds(0, 0, i, i);
    }

    public final void setDateViewStatusColor(int i) {
        if (this.z0 == i) {
            return;
        }
        this.z0 = i;
        d(this.B0);
        invalidate();
    }

    public final void setStatus$message_list_release(ghh ghhVar) {
        Drawable drawable;
        Drawable drawableMutate;
        this.B0 = ghhVar;
        Integer num = ghhVar.a;
        if (num == null) {
            drawable = null;
        } else {
            int iIntValue = num.intValue();
            h8a h8aVar = this.J0;
            Object objC = h8aVar.c(iIntValue);
            if (objC == null) {
                int iOrdinal = this.B0.ordinal();
                if (iOrdinal == 1) {
                    te teVar = new te(getContext());
                    teVar.setCallback(this);
                    teVar.c(this.z0);
                    teVar.start();
                    drawableMutate = teVar;
                } else if (iOrdinal != 4) {
                    drawableMutate = r34.b(getContext(), num.intValue()).mutate();
                } else {
                    objC = new EnhancedVectorDrawable(getContext(), num.intValue());
                    int iA = h8aVar.a(iIntValue);
                    h8aVar.b[iA] = iIntValue;
                    h8aVar.c[iA] = objC;
                }
                objC = drawableMutate;
                int iA2 = h8aVar.a(iIntValue);
                h8aVar.b[iA2] = iIntValue;
                h8aVar.c[iA2] = objC;
            }
            drawable = (Drawable) objC;
        }
        boolean zA = fni.a(this.C0, drawable);
        if (drawable != null) {
            int i = this.c;
            drawable.setBounds(0, 0, i, i);
        }
        this.C0 = drawable;
        d(ghhVar);
        invalidate();
        if (zA) {
            return;
        }
        requestLayout();
    }

    public final void setTextColor$message_list_release(int i) {
        if (this.y0 == i) {
            return;
        }
        this.y0 = i;
        L0.setColor(i);
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}
