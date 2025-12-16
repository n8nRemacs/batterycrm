package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.Spanned;
import android.util.Rational;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import one.me.rlottie.ImageReceiver;
import one.me.rlottie.RLottieDrawable;

/* loaded from: classes.dex */
public abstract class pqi {
    public static HashMap a(Rect rect, boolean z, Rational rational, int i, int i2, int i3, HashMap map) {
        boolean z2 = false;
        z5j.a("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, ((ob0) entry.getValue()).a.getWidth(), ((ob0) entry.getValue()).a.getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put((uwg) entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        Rational rationalC = pfi.c(i, rational);
        if (i2 != 3) {
            Matrix matrix2 = new Matrix();
            RectF rectF5 = new RectF(0.0f, 0.0f, rationalC.getNumerator(), rationalC.getDenominator());
            if (i2 == 0) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.START);
            } else if (i2 == 1) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.CENTER);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException(ho7.f(i2, "Unexpected scale type: "));
                }
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.END);
            }
            RectF rectF6 = new RectF();
            matrix2.mapRect(rectF6, rectF5);
            boolean z3 = z ^ (i3 == 1);
            boolean z4 = i == 0 && !z3;
            boolean z5 = i == 90 && z3;
            if (z4 || z5) {
                rectF2 = rectF6;
            } else {
                boolean z6 = i == 0 && z3;
                boolean z7 = i == 270 && !z3;
                if (z6 || z7) {
                    float fCenterX = rectF2.centerX();
                    float f = fCenterX + fCenterX;
                    rectF2 = new RectF(f - rectF6.right, rectF6.top, f - rectF6.left, rectF6.bottom);
                } else {
                    boolean z8 = i == 90 && !z3;
                    boolean z9 = i == 180 && z3;
                    if (z8 || z9) {
                        float fCenterY = rectF2.centerY();
                        float f2 = fCenterY + fCenterY;
                        rectF2 = new RectF(rectF6.left, f2 - rectF6.bottom, rectF6.right, f2 - rectF6.top);
                    } else {
                        boolean z10 = i == 180 && !z3;
                        if (i == 270 && z3) {
                            z2 = true;
                        }
                        if (!z10 && !z2) {
                            throw new IllegalArgumentException("Invalid argument: mirrored " + z3 + " rotation " + i);
                        }
                        float fCenterY2 = rectF2.centerY();
                        float f3 = fCenterY2 + fCenterY2;
                        RectF rectF7 = new RectF(rectF6.left, f3 - rectF6.bottom, rectF6.right, f3 - rectF6.top);
                        float fCenterX2 = rectF2.centerX();
                        float f4 = fCenterX2 + fCenterX2;
                        rectF2 = new RectF(f4 - rectF7.right, rectF7.top, f4 - rectF7.left, rectF7.bottom);
                    }
                }
            }
        }
        HashMap map3 = new HashMap();
        RectF rectF8 = new RectF();
        Matrix matrix3 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix3);
            matrix3.mapRect(rectF8, rectF2);
            Rect rect2 = new Rect();
            rectF8.round(rect2);
            map3.put((uwg) entry2.getKey(), rect2);
        }
        return map3;
    }

    public static final ArrayList b(dce dceVar) {
        l1f l1fVar;
        dceVar.getClass();
        ArrayList arrayList = new ArrayList(dceVar.a);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((fce) next).f) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            fce fceVar = (fce) it2.next();
            pd8 pd8Var = fceVar.a;
            vd8 vd8VarC = nqi.c(pd8Var);
            String strF = dceVar.f(fceVar);
            if (strF == null) {
                l1fVar = dceVar.l(fceVar);
            } else {
                int i = pd8Var.a;
                if (dceVar.k == 2) {
                    i = 7;
                }
                l1fVar = new l1f(i, strF);
            }
            Uri uriA = zub.b(fceVar.c, pd8Var) ? zub.a(fceVar.c, pd8Var) : vd8VarC.u0;
            l1f l1fVar2 = l1fVar;
            boolean z = pd8Var.a == 7;
            Uri uri = Uri.parse(l1fVar2.b);
            zub zubVar = fceVar.c;
            arrayList3.add(new ece(vd8VarC, z, uri, uriA, null, null, null, zubVar != null ? zubVar.o : null));
        }
        return arrayList3;
    }

    public static final void c(View view, Layout layout, ImageReceiver imageReceiver) {
        CharSequence text = layout.getText();
        int length = text.length();
        Object[] spans = null;
        try {
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                spans = spanned.getSpans(0, length, pk.class);
            }
        } catch (Throwable unused) {
        }
        if (spans == null) {
            spans = new pk[0];
        }
        for (Object obj : spans) {
            ok okVar = ((pk) obj).b;
            okVar.c(imageReceiver);
            okVar.setCallback(view);
            okVar.start();
        }
    }

    public static final void d(ImageView imageView, ImageReceiver imageReceiver) {
        Drawable drawable = imageView.getDrawable();
        ok okVar = drawable instanceof ok ? (ok) drawable : null;
        if (okVar != null) {
            okVar.c(imageReceiver);
            okVar.setCallback(imageView);
            okVar.start();
        }
    }

    public static final void e(Layout layout, ImageReceiver imageReceiver) {
        Spanned spanned;
        CharSequence text = layout.getText();
        int length = text.length();
        try {
            spanned = text instanceof Spanned ? (Spanned) text : null;
        } catch (Throwable unused) {
        }
        Object[] spans = spanned != null ? spanned.getSpans(0, length, pk.class) : null;
        if (spans == null) {
            spans = new pk[0];
        }
        for (Object obj : spans) {
            ok okVar = ((pk) obj).b;
            okVar.setCallback(null);
            RLottieDrawable rLottieDrawable = okVar.x0;
            if (rLottieDrawable != null) {
                rLottieDrawable.removeParentView(imageReceiver);
            }
            okVar.z0.remove(imageReceiver);
            RLottieDrawable rLottieDrawable2 = okVar.x0;
            if (rLottieDrawable2 == null || !rLottieDrawable2.hasParentViews()) {
                okVar.stop();
            }
        }
    }

    public static final void f(ImageView imageView, ImageReceiver imageReceiver) {
        Drawable drawable = imageView.getDrawable();
        ok okVar = drawable instanceof ok ? (ok) drawable : null;
        if (okVar != null) {
            okVar.setCallback(null);
            RLottieDrawable rLottieDrawable = okVar.x0;
            if (rLottieDrawable != null) {
                rLottieDrawable.removeParentView(imageReceiver);
            }
            okVar.z0.remove(imageReceiver);
            RLottieDrawable rLottieDrawable2 = okVar.x0;
            if (rLottieDrawable2 == null || !rLottieDrawable2.hasParentViews()) {
                okVar.stop();
            }
        }
    }
}
