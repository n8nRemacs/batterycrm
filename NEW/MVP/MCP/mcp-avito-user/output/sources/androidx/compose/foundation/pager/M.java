package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.AbstractC20735o;
import androidx.compose.foundation.lazy.layout.C0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LazyLayoutPager.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/pager/M;", "Landroidx/compose/foundation/lazy/layout/o;", "Landroidx/compose/foundation/pager/x;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class M extends AbstractC20735o<C20829x> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.r<a0, Integer, androidx.compose.runtime.A, Integer, G0> f29818a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Integer, Object> f29819b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C0 f29820c;

    /* JADX WARN: Multi-variable type inference failed */
    public M(@Y61.k Y41.r<? super a0, ? super Integer, ? super androidx.compose.runtime.A, ? super Integer, G0> rVar, @Y61.l Y41.l<? super Integer, ? extends Object> lVar, int i12) {
        this.f29818a = rVar;
        this.f29819b = lVar;
        C0 c02 = new C0();
        c02.a(i12, new C20829x(lVar, rVar));
        this.f29820c = c02;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC20735o
    @Y61.k
    /* renamed from: h, reason: from getter */
    public final C0 getF29820c() {
        return this.f29820c;
    }
}
