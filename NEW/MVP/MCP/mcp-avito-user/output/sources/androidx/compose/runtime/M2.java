package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SlotTable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/M2;", "Landroidx/compose/runtime/tooling/c;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class M2 implements androidx.compose.runtime.tooling.c, Iterable<androidx.compose.runtime.tooling.c>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final L2 f38049b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38050c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38051d;

    public M2(L2 l22, int i12, int i13, int i14, C42822w c42822w) {
        this(l22, i12, (i14 & 4) != 0 ? l22.f38019i : i13);
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<androidx.compose.runtime.tooling.c> iterator() {
        int i12;
        ArrayList<C22068g> arrayList;
        int iF2;
        L2 l22 = this.f38049b;
        if (l22.f38019i != this.f38051d) {
            N2.g();
        }
        int i13 = this.f38050c;
        HashMap<C22068g, E0> map = l22.f38021k;
        E0 e02 = null;
        if (map != null) {
            if (l22.f38018h) {
                G.c("use active SlotWriter to crate an anchor for location instead");
            }
            C22068g c22068g = (i13 < 0 || i13 >= (i12 = l22.f38013c) || (iF2 = N2.f((arrayList = l22.f38020j), i13, i12)) < 0) ? null : arrayList.get(iF2);
            if (c22068g != null) {
                e02 = map.get(c22068g);
            }
        }
        return e02 != null ? new B3(l22, i13, e02, new C22073h(null)) : new C0(l22, i13 + 1, l22.f38012b[(i13 * 5) + 3] + i13);
    }

    public M2(@Y61.k L2 l22, int i12, int i13) {
        this.f38049b = l22;
        this.f38050c = i12;
        this.f38051d = i13;
    }
}
