package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class av0 extends j2 {
    public final /* synthetic */ int c = 0;
    public final Object d;

    public av0(int i, int i2, Object[] objArr) {
        super(i, i2);
        this.d = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.c) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.d;
                int i = this.a;
                this.a = i + 1;
                return objArr[i];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.a++;
                return this.d;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.c) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.d;
                int i = this.a - 1;
                this.a = i;
                return objArr[i];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.a--;
                return this.d;
        }
    }

    public av0(int i, Object obj) {
        super(i, 1);
        this.d = obj;
    }
}
