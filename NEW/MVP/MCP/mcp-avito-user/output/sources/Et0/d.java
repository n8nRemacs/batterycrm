package ET0;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import kotlin.Metadata;

/* compiled from: Metrics.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"impl_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {
    @Y61.k
    public static final ViewGroup.MarginLayoutParams a(int i12, int i13, @Y61.l b bVar, @Y61.k Resources resources) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(c(resources, i12), c(resources, i13));
        marginLayoutParams.setMargins(c(resources, bVar != null ? bVar.f4016a : 0), c(resources, bVar != null ? bVar.f4019d : 0), c(resources, bVar != null ? bVar.f4017b : 0), c(resources, bVar != null ? bVar.f4018c : 0));
        return marginLayoutParams;
    }

    public static final int b(@Y61.k Resources resources, int i12) {
        return (int) TypedValue.applyDimension(1, i12, resources.getDisplayMetrics());
    }

    public static final int c(@Y61.k Resources resources, int i12) {
        if (i12 == -2) {
            return -2;
        }
        if (i12 != -1) {
            return b(resources, i12);
        }
        return -1;
    }
}
