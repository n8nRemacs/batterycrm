package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.P;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: BufferIterator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/d;", "T", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/a;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d<T> extends a<T> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final T[] f38295d;

    public d(@Y61.k T[] tArr, int i12, int i13) {
        super(i12, i13);
        this.f38295d = tArr;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f38292b;
        this.f38292b = i12 + 1;
        return this.f38295d[i12];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f38292b - 1;
        this.f38292b = i12;
        return this.f38295d[i12];
    }
}
