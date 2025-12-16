package androidx.compose.foundation.lazy;

import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.U2;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyListScrollPosition.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/r0;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f29561a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f29562b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f29563c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Object f29564d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.lazy.layout.W f29565e;

    /* JADX WARN: Illegal instructions before constructor call */
    public r0() {
        int i12 = 0;
        this(i12, i12, 3, null);
    }

    public final void a(int i12, int i13) {
        if (i12 < 0.0f) {
            androidx.compose.foundation.internal.e.a("Index should be non-negative (" + i12 + ')');
        }
        ((C22061e3) this.f29561a).L3(i12);
        this.f29565e.a(i12);
        ((C22061e3) this.f29562b).L3(i13);
    }

    public r0(int i12, int i13) {
        this.f29561a = U2.a(i12);
        this.f29562b = U2.a(i13);
        this.f29565e = new androidx.compose.foundation.lazy.layout.W(i12, 30, 100);
    }

    public /* synthetic */ r0(int i12, int i13, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? 0 : i12, (i14 & 2) != 0 ? 0 : i13);
    }
}
