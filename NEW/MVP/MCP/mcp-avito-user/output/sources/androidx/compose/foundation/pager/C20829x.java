package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.AbstractC20735o;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LazyLayoutPager.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/x;", "Landroidx/compose/foundation/lazy/layout/o$a;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.pager.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20829x implements AbstractC20735o.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Integer, Object> f30044a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.r<a0, Integer, androidx.compose.runtime.A, Integer, G0> f30045b;

    /* JADX WARN: Multi-variable type inference failed */
    public C20829x(@Y61.l Y41.l<? super Integer, ? extends Object> lVar, @Y61.k Y41.r<? super a0, ? super Integer, ? super androidx.compose.runtime.A, ? super Integer, G0> rVar) {
        this.f30044a = lVar;
        this.f30045b = rVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC20735o.a
    @Y61.l
    public final Y41.l<Integer, Object> getKey() {
        return this.f30044a;
    }
}
