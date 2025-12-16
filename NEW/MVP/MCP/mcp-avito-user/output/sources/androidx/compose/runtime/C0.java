package androidx.compose.runtime;

import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/C0;", "", "Landroidx/compose/runtime/tooling/c;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class C0 implements Iterator<androidx.compose.runtime.tooling.c>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final L2 f37937b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37938c;

    /* renamed from: d, reason: collision with root package name */
    public int f37939d;

    /* renamed from: e, reason: collision with root package name */
    public final int f37940e;

    public C0(@Y61.k L2 l22, int i12, int i13) {
        this.f37937b = l22;
        this.f37938c = i13;
        this.f37939d = i12;
        this.f37940e = l22.f38019i;
        if (l22.f38018h) {
            N2.g();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37939d < this.f37938c;
    }

    @Override // java.util.Iterator
    public final androidx.compose.runtime.tooling.c next() {
        L2 l22 = this.f37937b;
        int i12 = l22.f38019i;
        int i13 = this.f37940e;
        if (i12 != i13) {
            N2.g();
        }
        int i14 = this.f37939d;
        this.f37939d = N2.a(i14, l22.f38012b) + i14;
        return new M2(l22, i14, i13);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
