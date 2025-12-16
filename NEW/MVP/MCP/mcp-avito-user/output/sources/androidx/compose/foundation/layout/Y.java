package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC22363h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ContextualFlowLayout.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Y;", "", "Landroidx/compose/ui/layout/h0;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Y implements Iterator<InterfaceC22363h0>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f28552b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.p<Integer, Y0, List<InterfaceC22363h0>> f28553c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f28554d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f28555e;

    /* renamed from: f, reason: collision with root package name */
    public int f28556f;

    /* JADX WARN: Multi-variable type inference failed */
    public Y(int i12, @Y61.k Y41.p<? super Integer, ? super Y0, ? extends List<? extends InterfaceC22363h0>> pVar) {
        this.f28552b = i12;
        this.f28553c = pVar;
    }

    @Y61.k
    public final InterfaceC22363h0 a(@Y61.k Y0 y02) {
        int i12 = this.f28556f;
        ArrayList arrayList = this.f28554d;
        if (i12 < arrayList.size()) {
            InterfaceC22363h0 interfaceC22363h0 = (InterfaceC22363h0) arrayList.get(this.f28556f);
            this.f28556f++;
            return interfaceC22363h0;
        }
        int i13 = this.f28555e;
        if (i13 >= this.f28552b) {
            throw new IndexOutOfBoundsException("No item returned at index call. Index: " + this.f28555e);
        }
        List<? extends InterfaceC22363h0> listInvoke = ((C20562e1) this.f28553c).invoke(Integer.valueOf(i13), y02);
        this.f28555e++;
        if (listInvoke.isEmpty()) {
            return a(new Y0(0, 0, 0.0f, 0.0f, 15, null));
        }
        InterfaceC22363h0 interfaceC22363h02 = (InterfaceC22363h0) C42745f0.E(listInvoke);
        arrayList.addAll(listInvoke);
        this.f28556f++;
        return interfaceC22363h02;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28556f < this.f28554d.size() || this.f28555e < this.f28552b;
    }

    @Override // java.util.Iterator
    public final InterfaceC22363h0 next() {
        return a(new Y0(0, 0, 0.0f, 0.0f, 15, null));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
