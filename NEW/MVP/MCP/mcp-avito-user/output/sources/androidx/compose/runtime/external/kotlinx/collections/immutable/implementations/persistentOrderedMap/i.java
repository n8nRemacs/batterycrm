package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.P;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.v0;

/* compiled from: PersistentOrderedMapBuilderContentIterators.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/i;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/a;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class i<K, V> implements Iterator<a<V>>, Z41.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Object f38379b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final d<K, V> f38380c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Object f38381d = i0.c.f398334a;

    /* renamed from: e, reason: collision with root package name */
    public boolean f38382e;

    /* renamed from: f, reason: collision with root package name */
    public int f38383f;

    /* renamed from: g, reason: collision with root package name */
    public int f38384g;

    public i(@Y61.l Object obj, @Y61.k d<K, V> dVar) {
        this.f38379b = obj;
        this.f38380c = dVar;
        this.f38383f = dVar.f38374e.f38338f;
    }

    @Override // java.util.Iterator
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a<V> next() {
        d<K, V> dVar = this.f38380c;
        if (dVar.f38374e.f38338f != this.f38383f) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.f38379b;
        this.f38381d = obj;
        this.f38382e = true;
        this.f38384g++;
        a<V> aVar = dVar.f38374e.get(obj);
        if (aVar == null) {
            throw new ConcurrentModificationException(androidx.appcompat.app.r.o(this.f38379b, ") has changed after it was added to the persistent map.", new StringBuilder("Hash code of a key (")));
        }
        a<V> aVar2 = aVar;
        this.f38379b = aVar2.f38365c;
        return aVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38384g < this.f38380c.f38374e.getF38339g();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f38382e) {
            throw new IllegalStateException();
        }
        Object obj = this.f38381d;
        d<K, V> dVar = this.f38380c;
        v0.c(dVar).remove(obj);
        this.f38381d = null;
        this.f38382e = false;
        this.f38383f = dVar.f38374e.f38338f;
        this.f38384g--;
    }
}
