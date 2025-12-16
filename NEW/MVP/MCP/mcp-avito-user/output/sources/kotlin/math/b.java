package kotlin.math;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;

@Metadata(d1 = {"kotlin/math/c", "kotlin/math/d"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 49)
/* loaded from: classes8.dex */
public final class b extends d {
    @InterfaceC42733c0
    public static int a(double d12) {
        if (Double.isNaN(d12)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d12 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        return d12 < -2.147483648E9d ? BeduinInputModel.MIN_TEXT_VERSION : (int) Math.round(d12);
    }

    @InterfaceC42733c0
    public static int b(float f12) {
        if (Float.isNaN(f12)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f12);
    }

    @InterfaceC42733c0
    public static long c(double d12) {
        if (Double.isNaN(d12)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d12);
    }
}
