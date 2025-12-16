package androidx.compose.ui.layout;

import androidx.compose.ui.layout.a1;
import kotlin.Metadata;

/* compiled from: SubcomposeLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/a1;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22380q implements a1 {
    @Override // androidx.compose.ui.layout.a1
    public final void a(@Y61.k a1.a aVar) {
        int i12;
        androidx.collection.P0<Object> p02 = aVar.f40438b;
        if (p02.f25699g > 0) {
            long[] jArr = p02.f25695c;
            int i13 = p02.f25696d;
            while (i13 != Integer.MAX_VALUE && (i12 = p02.f25699g) > 0 && i12 != 0) {
                int i14 = (int) (jArr[i13] & 2147483647L);
                p02.i(i13);
                i13 = i14;
            }
        }
    }

    @Override // androidx.compose.ui.layout.a1
    public final boolean b(@Y61.l Object obj, @Y61.l Object obj2) {
        return true;
    }
}
