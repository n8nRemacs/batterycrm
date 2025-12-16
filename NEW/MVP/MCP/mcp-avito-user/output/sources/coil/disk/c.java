package coil.disk;

import Y61.k;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42754k;
import kotlin.jvm.internal.s0;
import okio.AbstractC44813x;
import okio.S;
import okio.c0;

/* compiled from: DiskLruCache.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/disk/c;", "Lokio/x;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends AbstractC44813x {
    @Override // okio.AbstractC44813x, okio.AbstractC44811v
    @k
    public final c0 h(@k S s5) throws IOException {
        S sB2 = s5.b();
        if (sB2 != null) {
            C42754k c42754k = new C42754k();
            while (sB2 != null && !b(sB2)) {
                c42754k.addFirst(sB2);
                sB2 = sB2.b();
            }
            Iterator<E> it = c42754k.iterator();
            while (it.hasNext()) {
                this.f420162b.l((S) it.next());
            }
        }
        return this.f420162b.h(s5);
    }
}
