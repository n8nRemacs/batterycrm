package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: MutableCollections.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.p0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C42765p0 extends C42763o0 {
    public static final <T> boolean c(Iterable<? extends T> iterable, Y41.l<? super T, Boolean> lVar, boolean z12) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z13 = false;
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue() == z12) {
                it.remove();
                z13 = true;
            }
        }
        return z13;
    }
}
