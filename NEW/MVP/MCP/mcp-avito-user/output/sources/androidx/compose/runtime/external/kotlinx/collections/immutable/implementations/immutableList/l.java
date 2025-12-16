package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.P;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: TrieIterator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/l;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/a;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l<E> extends a<E> {

    /* renamed from: d, reason: collision with root package name */
    public int f38320d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public Object[] f38321e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f38322f;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public l(@Y61.k Object[] objArr, int i12, int i13, int i14) {
        super(i12, i13);
        this.f38320d = i14;
        Object[] objArr2 = new Object[i14];
        this.f38321e = objArr2;
        ?? r52 = i12 == i13 ? 1 : 0;
        this.f38322f = r52;
        objArr2[0] = objArr;
        b(i12 - r52, 1);
    }

    public final E a() {
        return (E) ((Object[]) this.f38321e[this.f38320d - 1])[this.f38292b & 31];
    }

    public final void b(int i12, int i13) {
        int i14 = (this.f38320d - i13) * 5;
        while (i13 < this.f38320d) {
            Object[] objArr = this.f38321e;
            objArr[i13] = ((Object[]) objArr[i13 - 1])[m.a(i12, i14)];
            i14 -= 5;
            i13++;
        }
    }

    public final void c(int i12) {
        int i13 = 0;
        while (m.a(this.f38292b, i13) == i12) {
            i13 += 5;
        }
        if (i13 > 0) {
            b(this.f38292b, ((this.f38320d - 1) - (i13 / 5)) + 1);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eA2 = a();
        int i12 = this.f38292b + 1;
        this.f38292b = i12;
        if (i12 == this.f38293c) {
            this.f38322f = true;
            return eA2;
        }
        c(0);
        return eA2;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f38292b--;
        if (this.f38322f) {
            this.f38322f = false;
            return a();
        }
        c(31);
        return a();
    }
}
