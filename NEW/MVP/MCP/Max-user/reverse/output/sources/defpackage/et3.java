package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class et3 implements zde {
    public final AtomicReference a;

    public et3(zde zdeVar) {
        this.a = new AtomicReference(zdeVar);
    }

    @Override // defpackage.zde
    public final Iterator iterator() {
        zde zdeVar = (zde) this.a.getAndSet(null);
        if (zdeVar != null) {
            return zdeVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
