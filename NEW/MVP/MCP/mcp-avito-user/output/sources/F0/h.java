package f0;

import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: TrieNode.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {
    public static final Object[] a(Object obj, Object[] objArr, int i12) {
        Object[] objArr2 = new Object[objArr.length + 1];
        C42756l.s(objArr, 0, objArr2, i12, 6);
        C42756l.o(objArr, i12 + 1, objArr2, i12, objArr.length);
        objArr2[i12] = obj;
        return objArr2;
    }

    public static final Object[] b(int i12, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        C42756l.s(objArr, 0, objArr2, i12, 6);
        C42756l.o(objArr, i12, objArr2, i12 + 1, objArr.length);
        return objArr2;
    }

    public static final int c(int i12, int i13) {
        return (i12 >> i13) & 31;
    }
}
