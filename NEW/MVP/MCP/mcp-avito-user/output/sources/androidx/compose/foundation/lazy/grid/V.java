package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.I3;
import kotlin.Metadata;

/* compiled from: LazyGridItemProvider.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/S;", "invoke", "()Landroidx/compose/foundation/lazy/grid/S;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class V extends kotlin.jvm.internal.N implements Y41.a<S> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I3<H> f29076l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I0 f29077m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(I3<H> i32, I0 i02) {
        super(0);
        this.f29076l = i32;
        this.f29077m = i02;
    }

    @Override // Y41.a
    public final S invoke() {
        H f42167b = this.f29076l.getF42167b();
        I0 i02 = this.f29077m;
        return new S(i02, f42167b, new androidx.compose.foundation.lazy.layout.D0((kotlin.ranges.l) i02.f29022d.f28982e.getF42167b(), f42167b));
    }
}
