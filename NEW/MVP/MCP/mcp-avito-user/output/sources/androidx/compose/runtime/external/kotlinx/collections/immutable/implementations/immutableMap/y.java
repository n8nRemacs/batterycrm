package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: TrieNode.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y {
    public static final Object[] a(Object obj, Object obj2, Object[] objArr, int i12) {
        Object[] objArr2 = new Object[objArr.length + 2];
        C42756l.s(objArr, 0, objArr2, i12, 6);
        C42756l.o(objArr, i12 + 2, objArr2, i12, objArr.length);
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] b(int i12, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        C42756l.s(objArr, 0, objArr2, i12, 6);
        C42756l.o(objArr, i12, objArr2, i12 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] c(int i12, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        C42756l.s(objArr, 0, objArr2, i12, 6);
        C42756l.o(objArr, i12, objArr2, i12 + 1, objArr.length);
        return objArr2;
    }

    public static final int d(int i12, int i13) {
        return (i12 >> i13) & 31;
    }
}
