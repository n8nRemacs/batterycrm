package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.U;
import java.util.HashMap;

/* compiled from: ChangeImageTransform.java */
/* renamed from: androidx.transition.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23496g extends L {

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f54760B = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* renamed from: C, reason: collision with root package name */
    public static final TypeEvaluator<Matrix> f54761C = new a();

    /* renamed from: D, reason: collision with root package name */
    public static final Property<ImageView, Matrix> f54762D = new b(Matrix.class, "animatedTransform");

    /* compiled from: ChangeImageTransform.java */
    /* renamed from: androidx.transition.g$a */
    public class a implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        public final /* bridge */ /* synthetic */ Matrix evaluate(float f12, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* compiled from: ChangeImageTransform.java */
    /* renamed from: androidx.transition.g$b */
    public class b extends Property<ImageView, Matrix> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ImageView imageView, Matrix matrix) {
            ImageView imageView2 = imageView;
            Matrix matrix2 = matrix;
            if (Build.VERSION.SDK_INT >= 29) {
                imageView2.animateTransform(matrix2);
                return;
            }
            if (matrix2 == null) {
                Drawable drawable = imageView2.getDrawable();
                if (drawable != null) {
                    drawable.setBounds(0, 0, (imageView2.getWidth() - imageView2.getPaddingLeft()) - imageView2.getPaddingRight(), (imageView2.getHeight() - imageView2.getPaddingTop()) - imageView2.getPaddingBottom());
                    imageView2.invalidate();
                    return;
                }
                return;
            }
            if (C23513y.f54863a) {
                try {
                    imageView2.animateTransform(matrix2);
                } catch (NoSuchMethodError unused) {
                    C23513y.f54863a = false;
                }
            }
        }
    }

    /* compiled from: ChangeImageTransform.java */
    /* renamed from: androidx.transition.g$c */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54763a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f54763a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54763a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void M(V v12) {
        Matrix matrix;
        View view = v12.f54717b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            HashMap map = v12.f54716a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Drawable drawable = imageView.getDrawable();
            if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                matrix = new Matrix(imageView.getImageMatrix());
            } else {
                int i12 = c.f54763a[imageView.getScaleType().ordinal()];
                if (i12 == 1) {
                    Drawable drawable2 = imageView.getDrawable();
                    Matrix matrix2 = new Matrix();
                    matrix2.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    matrix = matrix2;
                } else if (i12 != 2) {
                    matrix = new Matrix(imageView.getImageMatrix());
                } else {
                    Drawable drawable3 = imageView.getDrawable();
                    int intrinsicWidth = drawable3.getIntrinsicWidth();
                    float width = imageView.getWidth();
                    float f12 = intrinsicWidth;
                    int intrinsicHeight = drawable3.getIntrinsicHeight();
                    float height = imageView.getHeight();
                    float f13 = intrinsicHeight;
                    float fMax = Math.max(width / f12, height / f13);
                    int iRound = Math.round((width - (f12 * fMax)) / 2.0f);
                    int iRound2 = Math.round((height - (f13 * fMax)) / 2.0f);
                    Matrix matrix3 = new Matrix();
                    matrix3.postScale(fMax, fMax);
                    matrix3.postTranslate(iRound, iRound2);
                    matrix = matrix3;
                }
            }
            map.put("android:changeImageTransform:matrix", matrix);
        }
    }

    @Override // androidx.transition.L
    public final void f(@j.N V v12) {
        M(v12);
    }

    @Override // androidx.transition.L
    public final void j(@j.N V v12) {
        M(v12);
    }

    @Override // androidx.transition.L
    @j.P
    public final Animator n(@j.N ViewGroup viewGroup, @j.P V v12, @j.P V v13) {
        if (v12 == null || v13 == null) {
            return null;
        }
        HashMap map = v12.f54716a;
        Rect rect = (Rect) map.get("android:changeImageTransform:bounds");
        HashMap map2 = v13.f54716a;
        Rect rect2 = (Rect) map2.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) map.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) map2.get("android:changeImageTransform:matrix");
        boolean z12 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z12) {
            return null;
        }
        ImageView imageView = (ImageView) v13.f54717b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Property<ImageView, Matrix> property = f54762D;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            TypeEvaluator<Matrix> typeEvaluator = f54761C;
            Matrix matrix3 = C23514z.f54864a;
            return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix3, matrix3});
        }
        if (matrix == null) {
            matrix = C23514z.f54864a;
        }
        if (matrix2 == null) {
            matrix2 = C23514z.f54864a;
        }
        property.set(imageView, matrix);
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) new U.a(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    @Override // androidx.transition.L
    @j.N
    public final String[] v() {
        return f54760B;
    }
}
