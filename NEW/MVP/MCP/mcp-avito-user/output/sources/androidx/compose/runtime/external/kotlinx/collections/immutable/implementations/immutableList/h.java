package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.P;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: PersistentVectorIterator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/h;", "T", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/a;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h<T> extends a<T> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final T[] f38310d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final l<T> f38311e;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@Y61.k Object[] objArr, int i12, @Y61.k Object[] objArr2, int i13, int i14) {
        super(i12, i13);
        this.f38310d = objArr2;
        int i15 = (i13 - 1) & (-32);
        this.f38311e = new l<>(objArr, i12 > i15 ? i15 : i12, i15, i14);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        l<T> lVar = this.f38311e;
        if (lVar.hasNext()) {
            this.f38292b++;
            return lVar.next();
        }
        int i12 = this.f38292b;
        this.f38292b = i12 + 1;
        return this.f38310d[i12 - lVar.f38293c];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f38292b;
        l<T> lVar = this.f38311e;
        int i13 = lVar.f38293c;
        if (i12 <= i13) {
            this.f38292b = i12 - 1;
            return lVar.previous();
        }
        int i14 = i12 - 1;
        this.f38292b = i14;
        return this.f38310d[i14 - i13];
    }
}
