package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class hq3 extends EditText implements u6g {
    public static final yid b = new yid("[0-9]*");
    public static final gq3 c = new gq3(0);
    public boolean a;

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || !this.a) {
            return;
        }
        postInvalidateDelayed(1500L);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        setBackground(new ColorDrawable(a93.s0.y(this).b().a.i));
        Drawable drawableF = mfh.f(this);
        GradientDrawable gradientDrawable = drawableF instanceof GradientDrawable ? (GradientDrawable) drawableF : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(yebVar.getText().j));
        }
        setTextColor(yebVar.getText().e);
    }

    public final void setSecure(boolean z) {
        this.a = z;
        if (!z) {
            removeTextChangedListener(PasswordTransformationMethod.getInstance());
            setTransformationMethod(SingleLineTransformationMethod.getInstance());
            setInputType(2);
        } else {
            setTransformationMethod(PasswordTransformationMethod.getInstance());
            setInputType(524306);
            removeTextChangedListener(PasswordTransformationMethod.getInstance());
            addTextChangedListener(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        setSecure(this.a);
        super.setText(charSequence, bufferType);
    }
}
