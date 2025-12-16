package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class f2f extends AtomicBoolean implements py4 {
    public final v2f a;
    public final g2f b;

    public f2f(v2f v2fVar, g2f g2fVar) {
        this.a = v2fVar;
        this.b = g2fVar;
    }

    @Override // defpackage.py4
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.b.o(this);
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        return get();
    }
}
