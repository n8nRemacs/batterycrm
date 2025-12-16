package androidx.compose.foundation.pager;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;

/* compiled from: LazyLayoutPager.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/pager/M;", "invoke", "()Landroidx/compose/foundation/pager/M;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.pager.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20815i extends kotlin.jvm.internal.N implements Y41.a<M> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f29935l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f29936m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Integer> f29937n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20815i(InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, Y41.a aVar) {
        super(0);
        this.f29935l = interfaceC22204y1;
        this.f29936m = interfaceC22204y12;
        this.f29937n = aVar;
    }

    @Override // Y41.a
    public final M invoke() {
        return new M((Y41.r) this.f29935l.getF42167b(), (Y41.l) this.f29936m.getF42167b(), this.f29937n.invoke().intValue());
    }
}
