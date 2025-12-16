package FV0;

import Y61.k;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ScreenAwareList.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"attachable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i {
    public static final void a(@k Collection<? extends h> collection, @k a aVar) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            ((h) it.next()).Q(aVar);
        }
    }

    public static final void b(@k Collection<? extends h> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            ((h) it.next()).P();
        }
    }
}
