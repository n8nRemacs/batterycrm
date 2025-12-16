package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class n3f extends AtomicReference implements py4 {
    public final v2f a;

    public n3f(v2f v2fVar, o3f o3fVar) {
        this.a = v2fVar;
        lazySet(o3fVar);
    }

    @Override // defpackage.py4
    public final void dispose() {
        o3f o3fVar = (o3f) getAndSet(null);
        if (o3fVar != null) {
            o3fVar.o(this);
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        return get() == null;
    }
}
