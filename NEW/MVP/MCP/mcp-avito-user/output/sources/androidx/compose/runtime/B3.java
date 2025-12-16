package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/B3;", "", "Landroidx/compose/runtime/tooling/c;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class B3 implements Iterator<androidx.compose.runtime.tooling.c>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final L2 f37930b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37931c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E0 f37932d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C3 f37933e;

    /* renamed from: f, reason: collision with root package name */
    public final int f37934f;

    /* renamed from: g, reason: collision with root package name */
    public int f37935g;

    public B3(@Y61.k L2 l22, int i12, @Y61.k E0 e02, @Y61.k C3 c32) {
        this.f37930b = l22;
        this.f37931c = i12;
        this.f37932d = e02;
        this.f37933e = c32;
        this.f37934f = l22.f38019i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ArrayList<Object> arrayList = this.f37932d.f37964a;
        return arrayList != null && this.f37935g < arrayList.size();
    }

    @Override // java.util.Iterator
    public final androidx.compose.runtime.tooling.c next() {
        Object obj;
        ArrayList<Object> arrayList = this.f37932d.f37964a;
        if (arrayList != null) {
            int i12 = this.f37935g;
            this.f37935g = i12 + 1;
            obj = arrayList.get(i12);
        } else {
            obj = null;
        }
        boolean z12 = obj instanceof C22068g;
        L2 l22 = this.f37930b;
        if (z12) {
            return new M2(l22, ((C22068g) obj).f38401a, this.f37934f);
        }
        if (!(obj instanceof E0)) {
            G.d("Unexpected group information structure");
            throw new KotlinNothingValueException();
        }
        C22209z2 c22209z2 = new C22209z2(null);
        return new D3(l22, this.f37931c, (E0) obj, c22209z2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
