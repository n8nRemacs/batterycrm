package defpackage;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class jtb extends j2 {
    public int X;
    public final htb c;
    public int d;
    public tig o;

    public jtb(htb htbVar, int i) {
        super(i, htbVar.Z);
        this.c = htbVar;
        this.d = htbVar.d();
        this.X = -1;
        b();
    }

    public final void a() {
        if (this.d != this.c.d()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.j2, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.a;
        htb htbVar = this.c;
        htbVar.add(i, obj);
        this.a++;
        this.b = htbVar.getSize();
        this.d = htbVar.d();
        this.X = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        htb htbVar = this.c;
        Object[] objArr = htbVar.X;
        if (objArr == null) {
            this.o = null;
            return;
        }
        int i = (htbVar.Z - 1) & (-32);
        int i2 = this.a;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (htbVar.d / 5) + 1;
        tig tigVar = this.o;
        if (tigVar == null) {
            this.o = new tig(objArr, i2, i, i3);
            return;
        }
        tigVar.a = i2;
        tigVar.b = i;
        tigVar.c = i3;
        if (tigVar.d.length < i3) {
            tigVar.d = new Object[i3];
        }
        tigVar.d[0] = objArr;
        ?? r6 = i2 == i ? 1 : 0;
        tigVar.o = r6;
        tigVar.b(i2 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.a;
        this.X = i;
        tig tigVar = this.o;
        htb htbVar = this.c;
        if (tigVar == null) {
            Object[] objArr = htbVar.Y;
            this.a = i + 1;
            return objArr[i];
        }
        if (tigVar.hasNext()) {
            this.a++;
            return tigVar.next();
        }
        Object[] objArr2 = htbVar.Y;
        int i2 = this.a;
        this.a = i2 + 1;
        return objArr2[i2 - tigVar.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.a;
        this.X = i - 1;
        tig tigVar = this.o;
        htb htbVar = this.c;
        if (tigVar == null) {
            Object[] objArr = htbVar.Y;
            int i2 = i - 1;
            this.a = i2;
            return objArr[i2];
        }
        int i3 = tigVar.b;
        if (i <= i3) {
            this.a = i - 1;
            return tigVar.previous();
        }
        Object[] objArr2 = htbVar.Y;
        int i4 = i - 1;
        this.a = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.j2, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.X;
        if (i == -1) {
            throw new IllegalStateException();
        }
        htb htbVar = this.c;
        htbVar.a(i);
        int i2 = this.X;
        if (i2 < this.a) {
            this.a = i2;
        }
        this.b = htbVar.getSize();
        this.d = htbVar.d();
        this.X = -1;
        b();
    }

    @Override // defpackage.j2, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.X;
        if (i == -1) {
            throw new IllegalStateException();
        }
        htb htbVar = this.c;
        htbVar.set(i, obj);
        this.d = htbVar.d();
        b();
    }
}
