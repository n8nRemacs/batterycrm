package K;

import Y61.k;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: RuntimeHelpers.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {
    public static final void a(@k String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void b(@k String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final void c(@k String str) {
        throw new NoSuchElementException(str);
    }
}
