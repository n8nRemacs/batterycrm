package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;

/* compiled from: LazyStaggeredGridDsl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/v0;", "Landroidx/compose/foundation/lazy/staggeredgrid/a;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class v0 implements InterfaceC20753a {

    /* renamed from: a, reason: collision with root package name */
    public long f29673a;

    /* renamed from: b, reason: collision with root package name */
    public float f29674b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public w0 f29675c;

    @Override // androidx.compose.foundation.lazy.staggeredgrid.InterfaceC20753a
    @Y61.k
    public final w0 a(@Y61.k androidx.compose.foundation.lazy.layout.Q q12, long j12) {
        if (this.f29675c != null && C22712b.d(this.f29673a, j12) && this.f29674b == q12.getF42846b()) {
            return this.f29675c;
        }
        this.f29673a = j12;
        this.f29674b = q12.getF42846b();
        C22712b.a(j12);
        throw null;
    }
}
