package androidx.compose.ui.draw;

import androidx.compose.foundation.H;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DrawModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithCacheElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/draw/g;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class DrawWithCacheElement extends AbstractC22430p0<g> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<i, p> f39025b;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithCacheElement(@Y61.k Y41.l<? super i, p> lVar) {
        this.f39025b = lVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new g(new i(), this.f39025b);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        g gVar = (g) dVar;
        gVar.f39042s = this.f39025b;
        gVar.D0();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && L.f(this.f39025b, ((DrawWithCacheElement) obj).f39025b);
    }

    public final int hashCode() {
        return this.f39025b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return H.l(new StringBuilder("DrawWithCacheElement(onBuildDrawCache="), this.f39025b, ')');
    }
}
