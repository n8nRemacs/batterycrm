package defpackage;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ksa extends am0 {
    public boolean X;
    public final vta a;
    public final Iterator b;
    public volatile boolean c;
    public boolean d;
    public boolean o;

    public ksa(vta vtaVar, Iterator it) {
        this.a = vtaVar;
        this.b = it;
    }

    @Override // defpackage.o1f
    public final void clear() {
        this.o = true;
    }

    @Override // defpackage.py4
    public final void dispose() {
        this.c = true;
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.psc
    public final int h(int i) {
        this.d = true;
        return 1;
    }

    @Override // defpackage.o1f
    public final boolean isEmpty() {
        return this.o;
    }

    @Override // defpackage.o1f
    public final Object poll() {
        if (this.o) {
            return null;
        }
        boolean z = this.X;
        Iterator it = this.b;
        if (!z) {
            this.X = true;
        } else if (!it.hasNext()) {
            this.o = true;
            return null;
        }
        Object next = it.next();
        Objects.requireNonNull(next, "The iterator returned a null value");
        return next;
    }
}
