package androidx.compose.runtime.collection;

import Y61.k;
import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MutableVector.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\u0005¨\u0006\f"}, d2 = {"", "index", "size", "Lkotlin/G0;", "c", "(II)V", "toIndex", "e", "fromIndex", "d", "(I)V", "f", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {
    public static final void a(int i12, @k List list) {
        int size = list.size();
        if (i12 < 0 || i12 >= size) {
            c(i12, size);
        }
    }

    public static final void b(int i12, int i13, @k List list) {
        if (i12 > i13) {
            f(i12, i13);
        }
        if (i12 < 0) {
            d(i12);
        }
        if (i13 > list.size()) {
            e(i13, list.size());
        }
    }

    private static final void c(int i12, int i13) {
        throw new IndexOutOfBoundsException(r.l(i12, i13, "Index ", " is out of bounds. The list has ", " elements."));
    }

    private static final void d(int i12) {
        throw new IndexOutOfBoundsException(G.e(i12, "fromIndex (", ") is less than 0."));
    }

    private static final void e(int i12, int i13) {
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is more than than the list size (" + i13 + ')');
    }

    private static final void f(int i12, int i13) {
        throw new IllegalArgumentException(r.l(i12, i13, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }
}
