package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.w0;

/* compiled from: Shadow.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/graphics/H;", "Landroidx/compose/ui/unit/h;", "elevation", "Landroidx/compose/ui/graphics/h1;", "shape", "", "clip", "Landroidx/compose/ui/graphics/T;", "ambientColor", "spotColor", "<init>", "(FLandroidx/compose/ui/graphics/h1;ZJJLkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ShadowGraphicsLayerElement extends AbstractC22430p0<H> {

    /* renamed from: b, reason: collision with root package name */
    public final float f39033b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h1 f39034c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f39035d;

    /* renamed from: e, reason: collision with root package name */
    public final long f39036e;

    /* renamed from: f, reason: collision with root package name */
    public final long f39037f;

    public ShadowGraphicsLayerElement(float f12, h1 h1Var, boolean z12, long j12, long j13, C42822w c42822w) {
        this.f39033b = f12;
        this.f39034c = h1Var;
        this.f39035d = z12;
        this.f39036e = j12;
        this.f39037f = j13;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new H(new x(this));
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        H h12 = (H) dVar;
        h12.f39275p = new x(this);
        AbstractC22443w0 abstractC22443w0 = C22421l.e(h12, 2).f40912q;
        if (abstractC22443w0 != null) {
            abstractC22443w0.b2(h12.f39275p, true);
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return androidx.compose.ui.unit.h.b(this.f39033b, shadowGraphicsLayerElement.f39033b) && L.f(this.f39034c, shadowGraphicsLayerElement.f39034c) && this.f39035d == shadowGraphicsLayerElement.f39035d && T.d(this.f39036e, shadowGraphicsLayerElement.f39036e) && T.d(this.f39037f, shadowGraphicsLayerElement.f39037f);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        int i12 = androidx.appcompat.app.r.i((this.f39034c.hashCode() + (Float.hashCode(this.f39033b) * 31)) * 31, 31, this.f39035d);
        T.a aVar2 = T.f39320b;
        int i13 = w0.f410662c;
        return Long.hashCode(this.f39037f) + androidx.appcompat.app.r.g(i12, 31, this.f39036e);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        androidx.compose.foundation.H.u(this.f39033b, ", shape=", sb2);
        sb2.append(this.f39034c);
        sb2.append(", clip=");
        sb2.append(this.f39035d);
        sb2.append(", ambientColor=");
        androidx.compose.foundation.H.z(this.f39036e, ", spotColor=", sb2);
        sb2.append((Object) T.j(this.f39037f));
        sb2.append(')');
        return sb2.toString();
    }
}
