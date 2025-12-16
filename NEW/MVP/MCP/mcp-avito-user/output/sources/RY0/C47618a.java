package rY0;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.annotation.RestrictTo;
import j.N;
import j.P;
import java.util.Arrays;

/* compiled from: DrawableUtils.java */
@RestrictTo
/* renamed from: rY0.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47618a {
    @P
    public static Drawable a(@P Drawable drawable, @P Drawable drawable2) {
        int intrinsicHeight;
        int intrinsicWidth;
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        if (drawable2.getIntrinsicWidth() == -1 || drawable2.getIntrinsicHeight() == -1) {
            int intrinsicWidth2 = drawable.getIntrinsicWidth();
            intrinsicHeight = drawable.getIntrinsicHeight();
            intrinsicWidth = intrinsicWidth2;
        } else if (drawable2.getIntrinsicWidth() > drawable.getIntrinsicWidth() || drawable2.getIntrinsicHeight() > drawable.getIntrinsicHeight()) {
            float intrinsicWidth3 = drawable2.getIntrinsicWidth() / drawable2.getIntrinsicHeight();
            if (intrinsicWidth3 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                intrinsicWidth = drawable.getIntrinsicWidth();
                intrinsicHeight = (int) (intrinsicWidth / intrinsicWidth3);
            } else {
                intrinsicHeight = drawable.getIntrinsicHeight();
                intrinsicWidth = (int) (intrinsicWidth3 * intrinsicHeight);
            }
        } else {
            intrinsicWidth = drawable2.getIntrinsicWidth();
            intrinsicHeight = drawable2.getIntrinsicHeight();
        }
        layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    @P
    public static Drawable b(@P Drawable drawable, @P ColorStateList colorStateList, @P PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        return drawable;
    }

    @N
    public static int[] c(@N int[] iArr) {
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            if (i13 == 16842912) {
                return iArr;
            }
            if (i13 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i12] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    public static void d(@N Outline outline, @N Path path) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 30) {
            outline.setPath(path);
            return;
        }
        if (i12 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }
}
