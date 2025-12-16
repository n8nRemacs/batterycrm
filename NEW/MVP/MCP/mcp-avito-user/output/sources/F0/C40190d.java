package f0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.v0;

/* compiled from: PersistentHashSetMutableIterator.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lf0/d;", "E", "Lf0/c;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40190d<E> extends C40189c<E> implements Iterator<E>, Z41.d {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C40188b<E> f395512e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public E f395513f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f395514g;

    /* renamed from: h, reason: collision with root package name */
    public int f395515h;

    public C40190d(@k C40188b<E> c40188b) {
        super(c40188b.f395506d);
        this.f395512e = c40188b;
        this.f395515h = c40188b.f395507e;
    }

    public final void c(int i12, C40191e<?> c40191e, E e12, int i13) {
        int i14 = c40191e.f395518a;
        ArrayList arrayList = this.f395509b;
        if (i14 == 0) {
            int iH2 = C42756l.H(e12, c40191e.f395519b);
            C40192f c40192f = (C40192f) arrayList.get(i13);
            c40192f.f395521a = c40191e.f395519b;
            c40192f.f395522b = iH2;
            this.f395510c = i13;
            return;
        }
        int iG2 = c40191e.g(1 << h.c(i12, i13 * 5));
        C40192f c40192f2 = (C40192f) arrayList.get(i13);
        Object[] objArr = c40191e.f395519b;
        c40192f2.f395521a = objArr;
        c40192f2.f395522b = iG2;
        Object obj = objArr[iG2];
        if (obj instanceof C40191e) {
            c(i12, (C40191e) obj, e12, i13 + 1);
        } else {
            this.f395510c = i13;
        }
    }

    @Override // f0.C40189c, java.util.Iterator
    public final E next() {
        if (this.f395512e.f395507e != this.f395515h) {
            throw new ConcurrentModificationException();
        }
        E e12 = (E) super.next();
        this.f395513f = e12;
        this.f395514g = true;
        return e12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f0.C40189c, java.util.Iterator
    public final void remove() {
        if (!this.f395514g) {
            throw new IllegalStateException();
        }
        boolean z12 = this.f395511d;
        C40188b<E> c40188b = this.f395512e;
        if (z12) {
            C40192f c40192f = (C40192f) this.f395509b.get(this.f395510c);
            c40192f.a();
            Object obj = c40192f.f395521a[c40192f.f395522b];
            v0.a(c40188b).remove(this.f395513f);
            c(obj != null ? obj.hashCode() : 0, c40188b.f395506d, obj, 0);
        } else {
            v0.a(c40188b).remove(this.f395513f);
        }
        this.f395513f = null;
        this.f395514g = false;
        this.f395515h = c40188b.f395507e;
    }
}
