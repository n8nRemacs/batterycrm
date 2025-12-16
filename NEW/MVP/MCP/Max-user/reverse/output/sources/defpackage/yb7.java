package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class yb7 extends View {
    public final em6 a;
    public Drawable b;
    public float c;
    public final Rect d;
    public final int o;
    public final float s0;
    public final Paint t0;
    public final Matrix u0;
    public final int[] v0;

    public yb7(Context context, em6 em6Var) {
        super(context, null);
        this.a = em6Var;
        this.b = r34.b(getContext(), yud.Y1).mutate();
        this.d = new Rect();
        this.o = 3;
        this.s0 = 0.9f;
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.t0 = paint;
        this.u0 = new Matrix();
        this.v0 = new int[]{v4j.c(0, 0.75f), -16777216};
    }

    public final void a(Canvas canvas, float f, float f2, float f3, int i, wb7 wb7Var) {
        List listSingletonList;
        Drawable.ConstantState constantState;
        if (i >= this.o) {
            return;
        }
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = i2 * 45;
            double radians = Math.toRadians(i3);
            wb7 wb7Var2 = wb7.d;
            if (wb7Var == wb7Var2 || wb7Var.a.contains(Double.valueOf(radians))) {
                float fCos = (((float) Math.cos(radians)) * f3) + f;
                float fSin = (((float) Math.sin(radians)) * f3) + f2;
                float fD = kti.d(((Number) this.a.invoke((wb7Var != wb7Var2 || i3 % 90 == 0) ? Integer.valueOf(i) : Integer.valueOf(i + 1))).intValue() * vw4.d().getDisplayMetrics().density) / 2;
                int i4 = (int) (fCos - fD);
                int i5 = (int) (fSin - fD);
                int i6 = (int) (fCos + fD);
                int i7 = (int) (fSin + fD);
                Rect rect = this.d;
                rect.set(i4, i5, i6, i7);
                Drawable drawable = this.b;
                Drawable drawableNewDrawable = (drawable == null || (constantState = drawable.getConstantState()) == null) ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    drawableNewDrawable.setBounds(rect);
                }
                if (drawableNewDrawable != null) {
                    drawableNewDrawable.draw(canvas);
                }
                rect.setEmpty();
            }
        }
        int i8 = xb7.$EnumSwitchMapping$0[wb7Var.ordinal()];
        if (i8 == 1) {
            listSingletonList = Collections.singletonList(Double.valueOf(Math.toRadians(180.0d)));
        } else if (i8 == 2) {
            listSingletonList = Collections.singletonList(Double.valueOf(Math.toRadians(0.0d)));
        } else {
            if (i8 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            listSingletonList = ve3.j(Double.valueOf(Math.toRadians(180.0d)), Double.valueOf(Math.toRadians(0.0d)));
        }
        ArrayList arrayList = new ArrayList(we3.q(listSingletonList, 10));
        Iterator it = listSingletonList.iterator();
        while (it.hasNext()) {
            double dDoubleValue = ((Number) it.next()).doubleValue();
            arrayList.add(new imb(Float.valueOf((((float) Math.cos(dDoubleValue)) * f3) + f), Float.valueOf((((float) Math.sin(dDoubleValue)) * f3) + f2)));
        }
        int iOrdinal = wb7Var.ordinal();
        float f4 = this.s0;
        if (iOrdinal == 0) {
            imb imbVar = (imb) arrayList.get(0);
            a(canvas, ((Number) imbVar.a).floatValue(), ((Number) imbVar.b).floatValue(), f4 * f3, 1 + i, wb7.b);
            return;
        }
        if (iOrdinal == 1) {
            imb imbVar2 = (imb) arrayList.get(0);
            a(canvas, ((Number) imbVar2.a).floatValue(), ((Number) imbVar2.b).floatValue(), f4 * f3, 1 + i, wb7.c);
            return;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        imb imbVar3 = (imb) arrayList.get(0);
        float fFloatValue = ((Number) imbVar3.a).floatValue();
        float fFloatValue2 = ((Number) imbVar3.b).floatValue();
        imb imbVar4 = (imb) arrayList.get(1);
        float fFloatValue3 = ((Number) imbVar4.a).floatValue();
        float fFloatValue4 = ((Number) imbVar4.b).floatValue();
        float f5 = f4 * f3;
        int i9 = 1 + i;
        a(canvas, fFloatValue, fFloatValue2, f5, i9, wb7.b);
        a(canvas, fFloatValue3, fFloatValue4, f5, i9, wb7.c);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        RadialGradient radialGradient = new RadialGradient(width, height, Math.max(width, height), this.v0, (float[]) null, Shader.TileMode.CLAMP);
        Matrix matrix = this.u0;
        matrix.reset();
        matrix.setScale(1.0f, 0.4f, width, height);
        radialGradient.setLocalMatrix(matrix);
        Paint paint = this.t0;
        paint.setShader(radialGradient);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        a(canvas2, width, height, this.c, 0, wb7.d);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
    }

    public final void setIcon$common_release(Drawable drawable) {
        this.b = drawable;
        invalidate();
    }

    public final void setInitialRadius$common_release(float f) {
        this.c = f;
        invalidate();
    }

    public final void setIcon$common_release(int i) {
        this.b = r34.b(getContext(), i).mutate();
        invalidate();
    }
}
