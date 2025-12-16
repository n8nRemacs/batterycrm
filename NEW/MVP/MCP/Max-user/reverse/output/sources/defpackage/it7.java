package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class it7 extends rrg {
    public final Object b;
    public boolean c;

    public it7(Object obj) {
        super(0);
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c) {
            throw new NoSuchElementException();
        }
        this.c = true;
        return this.b;
    }
}
