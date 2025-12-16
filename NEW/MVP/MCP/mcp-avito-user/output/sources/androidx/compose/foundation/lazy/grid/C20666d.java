package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import kotlin.Metadata;

/* compiled from: LazyGridDsl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/d;", "Landroidx/compose/foundation/lazy/grid/F0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.grid.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20666d implements F0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f29112a;

    /* renamed from: b, reason: collision with root package name */
    public long f29113b = C22713c.b(0, 0, 15);

    /* renamed from: c, reason: collision with root package name */
    public float f29114c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public E0 f29115d;

    /* JADX WARN: Multi-variable type inference failed */
    public C20666d(@Y61.k Y41.p<? super androidx.compose.ui.unit.d, ? super C22712b, E0> pVar) {
        this.f29112a = (kotlin.jvm.internal.N) pVar;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // androidx.compose.foundation.lazy.grid.F0
    @Y61.k
    public final E0 a(@Y61.k androidx.compose.foundation.lazy.layout.Q q12, long j12) {
        if (this.f29115d != null && C22712b.d(this.f29113b, j12) && this.f29114c == q12.getF40389c()) {
            return this.f29115d;
        }
        this.f29113b = j12;
        this.f29114c = q12.getF40389c();
        E0 e02 = (E0) this.f29112a.invoke(q12, C22712b.a(j12));
        this.f29115d = e02;
        return e02;
    }
}
