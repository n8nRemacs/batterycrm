package androidx.compose.foundation.lazy;

import androidx.compose.runtime.I3;
import kotlin.Metadata;

/* compiled from: LazyListItemProvider.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/N;", "invoke", "()Landroidx/compose/foundation/lazy/N;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Q extends kotlin.jvm.internal.N implements Y41.a<N> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I3<J> f28834l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w0 f28835m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C20794z f28836n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(I3<J> i32, w0 w0Var, C20794z c20794z) {
        super(0);
        this.f28834l = i32;
        this.f28835m = w0Var;
        this.f28836n = c20794z;
    }

    @Override // Y41.a
    public final N invoke() {
        J f42167b = this.f28834l.getF42167b();
        w0 w0Var = this.f28835m;
        return new N(w0Var, f42167b, this.f28836n, new androidx.compose.foundation.lazy.layout.D0((kotlin.ranges.l) w0Var.f29717d.f29565e.getF42167b(), f42167b));
    }
}
