package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class wsb implements Iterator, my7 {
    public final vig[] a;
    public int b;
    public boolean c = true;

    public wsb(uig uigVar, vig[] vigVarArr) {
        this.a = vigVarArr;
        vigVarArr[0].a(Integer.bitCount(uigVar.a) * 2, 0, uigVar.d);
        this.b = 0;
        a();
    }

    public final void a() {
        int i = this.b;
        vig[] vigVarArr = this.a;
        vig vigVar = vigVarArr[i];
        if (vigVar.c < vigVar.b) {
            return;
        }
        if (i >= 0) {
            while (true) {
                int i2 = i - 1;
                int iB = b(i);
                if (iB == -1) {
                    vig vigVar2 = vigVarArr[i];
                    int i3 = vigVar2.c;
                    Object[] objArr = vigVar2.a;
                    if (i3 < objArr.length) {
                        int length = objArr.length;
                        vigVar2.c = i3 + 1;
                        iB = b(i);
                    }
                }
                if (iB != -1) {
                    this.b = iB;
                    return;
                }
                if (i > 0) {
                    vig vigVar3 = vigVarArr[i - 1];
                    int i4 = vigVar3.c;
                    int length2 = vigVar3.a.length;
                    vigVar3.c = i4 + 1;
                }
                vigVarArr[i].a(0, 0, uig.e.d);
                if (i2 < 0) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        this.c = false;
    }

    public final int b(int i) {
        vig[] vigVarArr = this.a;
        vig vigVar = vigVarArr[i];
        int i2 = vigVar.c;
        if (i2 < vigVar.b) {
            return i;
        }
        Object[] objArr = vigVar.a;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        }
        uig uigVar = (uig) obj;
        if (i == 6) {
            vig vigVar2 = vigVarArr[i + 1];
            Object[] objArr2 = uigVar.d;
            vigVar2.a(objArr2.length, 0, objArr2);
        } else {
            vigVarArr[i + 1].a(Integer.bitCount(uigVar.a) * 2, 0, uigVar.d);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.c) {
            throw new NoSuchElementException();
        }
        Object next = this.a[this.b].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
