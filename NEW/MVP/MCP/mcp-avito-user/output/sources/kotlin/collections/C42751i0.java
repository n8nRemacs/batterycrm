package kotlin.collections;

import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Collections.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.i0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C42751i0 extends C42747g0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public static final <T> List<T> a(@Y61.k List<? extends T> list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : Collections.singletonList(list.get(0)) : C42784z0.f406748b;
    }

    public static final void b(int i12, int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i13, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (i13 > i12) {
            throw new IndexOutOfBoundsException(androidx.appcompat.app.r.l(i13, i12, "toIndex (", ") is greater than size (", ")."));
        }
    }
}
