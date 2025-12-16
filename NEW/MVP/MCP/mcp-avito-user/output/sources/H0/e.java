package h0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f;
import androidx.compose.runtime.internal.P;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.v0;

/* compiled from: PersistentOrderedSetMutableIterator.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lh0/e;", "E", "Lh0/d;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e<E> extends d<E> implements Iterator<E>, Z41.d {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c<E> f396967e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public E f396968f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f396969g;

    /* renamed from: h, reason: collision with root package name */
    public int f396970h;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(@k c<E> cVar) {
        Object obj = cVar.f396961c;
        f<E, C40753a> fVar = cVar.f396963e;
        super(fVar, obj);
        this.f396967e = cVar;
        this.f396970h = fVar.f38338f;
    }

    @Override // h0.d, java.util.Iterator
    public final E next() {
        if (this.f396967e.f396963e.f38338f != this.f396970h) {
            throw new ConcurrentModificationException();
        }
        E e12 = (E) super.next();
        this.f396968f = e12;
        this.f396969g = true;
        return e12;
    }

    @Override // h0.d, java.util.Iterator
    public final void remove() {
        if (!this.f396969g) {
            throw new IllegalStateException();
        }
        E e12 = this.f396968f;
        c<E> cVar = this.f396967e;
        v0.a(cVar).remove(e12);
        this.f396968f = null;
        this.f396969g = false;
        this.f396970h = cVar.f396963e.f38338f;
        this.f396966d--;
    }
}
