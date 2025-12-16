package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SnapshotStateList.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Object f38619a = new Object();

    public static final void a(int i12, int i13) {
        if (i12 < 0 || i12 >= i13) {
            throw new IndexOutOfBoundsException("index (" + i12 + ") is out of bound of [0, " + i13 + ')');
        }
    }
}
