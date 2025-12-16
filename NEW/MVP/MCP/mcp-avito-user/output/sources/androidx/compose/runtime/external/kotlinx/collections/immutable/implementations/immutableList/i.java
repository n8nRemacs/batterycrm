package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.P;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: PersistentVectorMutableIterator.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/i;", "T", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/a;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i<T> extends a<T> implements ListIterator<T>, Z41.f {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g<T> f38312d;

    /* renamed from: e, reason: collision with root package name */
    public int f38313e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public l<? extends T> f38314f;

    /* renamed from: g, reason: collision with root package name */
    public int f38315g;

    public i(@Y61.k g<T> gVar, int i12) {
        super(i12, gVar.f38308i);
        this.f38312d = gVar;
        this.f38313e = gVar.e();
        this.f38315g = -1;
        b();
    }

    public final void a() {
        if (this.f38313e != this.f38312d.e()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator
    public final void add(T t12) {
        a();
        int i12 = this.f38292b;
        g<T> gVar = this.f38312d;
        gVar.add(i12, t12);
        this.f38292b++;
        this.f38293c = gVar.getF38308i();
        this.f38313e = gVar.e();
        this.f38315g = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        g<T> gVar = this.f38312d;
        Object[] objArr = gVar.f38306g;
        if (objArr == null) {
            this.f38314f = null;
            return;
        }
        int i12 = (gVar.f38308i - 1) & (-32);
        int i13 = this.f38292b;
        if (i13 > i12) {
            i13 = i12;
        }
        int i14 = (gVar.f38304e / 5) + 1;
        l<? extends T> lVar = this.f38314f;
        if (lVar == null) {
            this.f38314f = new l<>(objArr, i13, i12, i14);
            return;
        }
        lVar.f38292b = i13;
        lVar.f38293c = i12;
        lVar.f38320d = i14;
        if (lVar.f38321e.length < i14) {
            lVar.f38321e = new Object[i14];
        }
        lVar.f38321e[0] = objArr;
        ?? r62 = i13 == i12 ? 1 : 0;
        lVar.f38322f = r62;
        lVar.b(i13 - r62, 1);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public final T next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f38292b;
        this.f38315g = i12;
        l<? extends T> lVar = this.f38314f;
        g<T> gVar = this.f38312d;
        if (lVar == null) {
            Object[] objArr = gVar.f38307h;
            this.f38292b = i12 + 1;
            return (T) objArr[i12];
        }
        if (lVar.hasNext()) {
            this.f38292b++;
            return lVar.next();
        }
        Object[] objArr2 = gVar.f38307h;
        int i13 = this.f38292b;
        this.f38292b = i13 + 1;
        return (T) objArr2[i13 - lVar.f38293c];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f38292b;
        this.f38315g = i12 - 1;
        l<? extends T> lVar = this.f38314f;
        g<T> gVar = this.f38312d;
        if (lVar == null) {
            Object[] objArr = gVar.f38307h;
            int i13 = i12 - 1;
            this.f38292b = i13;
            return (T) objArr[i13];
        }
        int i14 = lVar.f38293c;
        if (i12 <= i14) {
            this.f38292b = i12 - 1;
            return lVar.previous();
        }
        Object[] objArr2 = gVar.f38307h;
        int i15 = i12 - 1;
        this.f38292b = i15;
        return (T) objArr2[i15 - i14];
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i12 = this.f38315g;
        if (i12 == -1) {
            throw new IllegalStateException();
        }
        g<T> gVar = this.f38312d;
        gVar.a(i12);
        int i13 = this.f38315g;
        if (i13 < this.f38292b) {
            this.f38292b = i13;
        }
        this.f38293c = gVar.getF38308i();
        this.f38313e = gVar.e();
        this.f38315g = -1;
        b();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator
    public final void set(T t12) {
        a();
        int i12 = this.f38315g;
        if (i12 == -1) {
            throw new IllegalStateException();
        }
        g<T> gVar = this.f38312d;
        gVar.set(i12, t12);
        this.f38313e = gVar.e();
        b();
    }
}
