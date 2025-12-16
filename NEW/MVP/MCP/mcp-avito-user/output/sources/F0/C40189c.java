package f0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PersistentHashSetIterator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lf0/c;", "E", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C40189c<E> implements Iterator<E>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f395509b;

    /* renamed from: c, reason: collision with root package name */
    public int f395510c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f395511d;

    public C40189c(@k C40191e<E> c40191e) {
        ArrayList arrayListE0 = C42745f0.e0(new C40192f());
        this.f395509b = arrayListE0;
        this.f395511d = true;
        C40192f c40192f = (C40192f) arrayListE0.get(0);
        c40192f.f395521a = c40191e.f395519b;
        c40192f.f395522b = 0;
        this.f395510c = 0;
        a();
    }

    public final void a() {
        int i12 = this.f395510c;
        ArrayList arrayList = this.f395509b;
        if (((C40192f) arrayList.get(i12)).a()) {
            return;
        }
        for (int i13 = this.f395510c; -1 < i13; i13--) {
            int iB2 = b(i13);
            if (iB2 == -1) {
                C40192f c40192f = (C40192f) arrayList.get(i13);
                if (c40192f.f395522b < c40192f.f395521a.length) {
                    C40192f c40192f2 = (C40192f) arrayList.get(i13);
                    int i14 = c40192f2.f395522b;
                    int length = c40192f2.f395521a.length;
                    c40192f2.f395522b = i14 + 1;
                    iB2 = b(i13);
                }
            }
            if (iB2 != -1) {
                this.f395510c = iB2;
                return;
            }
            if (i13 > 0) {
                C40192f c40192f3 = (C40192f) arrayList.get(i13 - 1);
                int i15 = c40192f3.f395522b;
                int length2 = c40192f3.f395521a.length;
                c40192f3.f395522b = i15 + 1;
            }
            C40192f c40192f4 = (C40192f) arrayList.get(i13);
            C40191e.f395516d.getClass();
            c40192f4.f395521a = C40191e.f395517e.f395519b;
            c40192f4.f395522b = 0;
        }
        this.f395511d = false;
    }

    public final int b(int i12) {
        ArrayList arrayList = this.f395509b;
        if (((C40192f) arrayList.get(i12)).a()) {
            return i12;
        }
        C40192f c40192f = (C40192f) arrayList.get(i12);
        int i13 = c40192f.f395522b;
        Object[] objArr = c40192f.f395521a;
        if (i13 >= objArr.length || !(objArr[i13] instanceof C40191e)) {
            return -1;
        }
        C40192f c40192f2 = (C40192f) arrayList.get(i12);
        int i14 = c40192f2.f395522b;
        Object[] objArr2 = c40192f2.f395521a;
        if (i14 < objArr2.length) {
            boolean z12 = objArr2[i14] instanceof C40191e;
        }
        C40191e c40191e = (C40191e) objArr2[i14];
        int i15 = i12 + 1;
        if (i15 == arrayList.size()) {
            arrayList.add(new C40192f());
        }
        C40192f c40192f3 = (C40192f) arrayList.get(i15);
        c40192f3.f395521a = c40191e.f395519b;
        c40192f3.f395522b = 0;
        return b(i15);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f395511d;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!this.f395511d) {
            throw new NoSuchElementException();
        }
        C40192f c40192f = (C40192f) this.f395509b.get(this.f395510c);
        c40192f.a();
        Object[] objArr = c40192f.f395521a;
        int i12 = c40192f.f395522b;
        c40192f.f395522b = i12 + 1;
        E e12 = (E) objArr[i12];
        a();
        return e12;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
