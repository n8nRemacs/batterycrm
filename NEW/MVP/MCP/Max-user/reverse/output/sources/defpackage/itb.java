package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class itb extends j2 {
    public final Object[] c;
    public final tig d;

    public itb(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.c = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.d = new tig(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        tig tigVar = this.d;
        if (tigVar.hasNext()) {
            this.a++;
            return tigVar.next();
        }
        int i = this.a;
        this.a = i + 1;
        return this.c[i - tigVar.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.a;
        tig tigVar = this.d;
        int i2 = tigVar.b;
        if (i <= i2) {
            this.a = i - 1;
            return tigVar.previous();
        }
        int i3 = i - 1;
        this.a = i3;
        return this.c[i3 - i2];
    }
}
