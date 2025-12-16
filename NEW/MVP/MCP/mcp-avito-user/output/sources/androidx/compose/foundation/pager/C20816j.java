package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.D0;
import androidx.compose.runtime.I3;
import kotlin.Metadata;

/* compiled from: LazyLayoutPager.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/pager/O;", "invoke", "()Landroidx/compose/foundation/pager/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.pager.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20816j extends kotlin.jvm.internal.N implements Y41.a<O> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I3<M> f29938l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m0 f29939m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20816j(I3<M> i32, m0 m0Var) {
        super(0);
        this.f29938l = i32;
        this.f29939m = m0Var;
    }

    @Override // Y41.a
    public final O invoke() {
        M f42167b = this.f29938l.getF42167b();
        m0 m0Var = this.f29939m;
        return new O(m0Var, f42167b, new D0((kotlin.ranges.l) m0Var.f29967d.f29900f.getF42167b(), f42167b));
    }
}
