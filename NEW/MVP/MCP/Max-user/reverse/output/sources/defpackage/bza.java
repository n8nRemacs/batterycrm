package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class bza extends TextView {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public bza(Context context) {
        super(context);
        GradientDrawable gradientDrawableE = uga.e(-1, -1, Integer.valueOf(kti.d(1 * vw4.d().getDisplayMetrics().density)), kti.d(vw4.d().getDisplayMetrics().density * 12));
        this.b = gradientDrawableE;
        setMinHeight(kti.d(40 * vw4.d().getDisplayMetrics().density));
        setGravity(17);
        setTextAlignment(4);
        int iD = kti.d(10 * vw4.d().getDisplayMetrics().density);
        setPadding(getPaddingLeft(), iD, getPaddingRight(), iD);
        dpg.N.b(this, t75.b);
        setOutlineProvider(new u74(kti.d(r2 * vw4.d().getDisplayMetrics().density)));
        setClipToOutline(true);
        setBackground(gradientDrawableE);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                roe roeVar = (roe) this.b;
                if (roeVar.X0 != hoe.Y) {
                    getPaint().setShader(null);
                    break;
                } else {
                    Matrix titleGradientMatrix = roeVar.getTitleGradientMatrix();
                    titleGradientMatrix.reset();
                    titleGradientMatrix.setScale(i, i2);
                    titleGradientMatrix.postTranslate(0.0f, 0.0f);
                    Shader shader = getPaint().getShader();
                    LinearGradient linearGradient = shader instanceof LinearGradient ? (LinearGradient) shader : null;
                    if (linearGradient != null) {
                        linearGradient.setLocalMatrix(roeVar.getTitleGradientMatrix());
                        break;
                    }
                }
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bza(Context context, roe roeVar) {
        super(context, null);
        this.b = roeVar;
        setId(qab.i);
        setLayoutParams(new kt3(-2, -2));
        dpg.f.b(this, t75.b);
        setPadding(0, 0, 0, 0);
        setMaxLines(2);
        setEllipsize(TextUtils.TruncateAt.END);
    }
}
