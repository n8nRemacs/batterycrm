package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.U2;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyGridScrollPosition.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/A0;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f28978a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f28979b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28980c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Object f28981d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.lazy.layout.W f28982e;

    /* JADX WARN: Illegal instructions before constructor call */
    public A0() {
        int i12 = 0;
        this(i12, i12, 3, null);
    }

    public final void a(int i12, int i13) {
        if (i12 < 0.0f) {
            androidx.compose.foundation.internal.e.a("Index should be non-negative");
        }
        ((C22061e3) this.f28978a).L3(i12);
        this.f28982e.a(i12);
        ((C22061e3) this.f28979b).L3(i13);
    }

    public A0(int i12, int i13) {
        this.f28978a = U2.a(i12);
        this.f28979b = U2.a(i13);
        this.f28982e = new androidx.compose.foundation.lazy.layout.W(i12, 90, 200);
    }

    public /* synthetic */ A0(int i12, int i13, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? 0 : i12, (i14 & 2) != 0 ? 0 : i13);
    }
}
