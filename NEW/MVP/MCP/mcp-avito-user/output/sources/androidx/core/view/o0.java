package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;

/* compiled from: ViewGroup.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o0 {
    @Y61.k
    public static final View a(@Y61.k ViewGroup viewGroup, int i12) {
        View childAt = viewGroup.getChildAt(i12);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index: ", ", Size: ");
        sbJ.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(sbJ.toString());
    }
}
