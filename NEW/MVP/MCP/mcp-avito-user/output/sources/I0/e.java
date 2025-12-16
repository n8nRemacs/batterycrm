package i0;

import X41.n;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ListImplementation.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li0/e;", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {
    static {
        new e();
    }

    @n
    public static final void a(int i12, int i13) {
        if (i12 < 0 || i12 >= i13) {
            throw new IndexOutOfBoundsException(H.j(i12, i13, "index: ", ", size: "));
        }
    }

    @n
    public static final void b(int i12, int i13) {
        if (i12 < 0 || i12 > i13) {
            throw new IndexOutOfBoundsException(H.j(i12, i13, "index: ", ", size: "));
        }
    }

    @n
    public static final void c(int i12, int i13, int i14) {
        if (i12 < 0 || i13 > i14) {
            StringBuilder sbY = r.y(i12, i13, "fromIndex: ", ", toIndex: ", ", size: ");
            sbY.append(i14);
            throw new IndexOutOfBoundsException(sbY.toString());
        }
        if (i12 > i13) {
            throw new IllegalArgumentException(H.j(i12, i13, "fromIndex: ", " > toIndex: "));
        }
    }
}
