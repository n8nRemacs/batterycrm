package androidx.compose.ui.graphics;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AndroidShader.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Landroid/graphics/Shader;", "Shader", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22321z {
    @j.k0
    @Y61.k
    public static final int[] a(@Y61.k List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = V.j(((T) list.get(i12)).f39331a);
        }
        return iArr;
    }

    @j.k0
    @Y61.l
    public static final float[] b(@Y61.l List list, @Y61.k List list2) {
        if (list != null) {
            return C42745f0.J0(list);
        }
        return null;
    }

    public static final void c(List<T> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
