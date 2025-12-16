package androidx.compose.runtime;

import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u0000\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/e0;", "", "", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22058e0 implements Iterable<Object>, Iterator<Object>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    public int f38286b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38286b < 0;
    }

    @Override // java.util.Iterator
    @Y61.l
    public final Object next() {
        int i12 = this.f38286b;
        if (i12 >= 0) {
            throw null;
        }
        this.f38286b = i12 + 1;
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<Object> iterator() {
        return this;
    }
}
