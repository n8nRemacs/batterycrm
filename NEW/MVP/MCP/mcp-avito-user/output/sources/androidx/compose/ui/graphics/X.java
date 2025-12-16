package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ColorFilter.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/X;", "Landroidx/compose/ui/graphics/U;", "Landroidx/compose/ui/graphics/W;", "colorMatrix", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "([FLandroid/graphics/ColorFilter;Lkotlin/jvm/internal/w;)V", "([FLkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class X extends U {

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public float[] f39344c;

    public X(float[] fArr, C42822w c42822w) {
        this(fArr, new ColorMatrixColorFilter(fArr), null);
    }

    public final float[] a() {
        float[] fArr = this.f39344c;
        if (fArr != null) {
            return fArr;
        }
        ColorFilter colorFilter = this.f39333a;
        if (!(colorFilter instanceof ColorMatrixColorFilter)) {
            throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
        }
        Y.f39345a.getClass();
        ColorMatrix colorMatrix = new ColorMatrix();
        ((ColorMatrixColorFilter) colorFilter).getColorMatrix(colorMatrix);
        float[] array = colorMatrix.getArray();
        this.f39344c = array;
        return array;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof X) && Arrays.equals(a(), ((X) obj).a());
    }

    public final int hashCode() {
        float[] fArr = this.f39344c;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    @Y61.k
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.f39344c;
        if (fArr == null) {
            str = "null";
        } else {
            str = "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }

    public X(float[] fArr, ColorFilter colorFilter, C42822w c42822w) {
        super(colorFilter);
        this.f39344c = fArr;
    }
}
