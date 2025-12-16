package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.C22250e0;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.r1;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GraphicsLayerModifier.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/graphics/j1;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/r1;", "transformOrigin", "Landroidx/compose/ui/graphics/h1;", "shape", "", "clip", "Landroidx/compose/ui/graphics/Z0;", "renderEffect", "Landroidx/compose/ui/graphics/T;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/e0;", "compositingStrategy", "<init>", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/h1;ZLandroidx/compose/ui/graphics/Z0;JJILkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class GraphicsLayerElement extends AbstractC22430p0<j1> {

    /* renamed from: b, reason: collision with root package name */
    public final float f39258b;

    /* renamed from: c, reason: collision with root package name */
    public final float f39259c;

    /* renamed from: d, reason: collision with root package name */
    public final float f39260d;

    /* renamed from: e, reason: collision with root package name */
    public final float f39261e;

    /* renamed from: f, reason: collision with root package name */
    public final float f39262f;

    /* renamed from: g, reason: collision with root package name */
    public final float f39263g;

    /* renamed from: h, reason: collision with root package name */
    public final float f39264h;

    /* renamed from: i, reason: collision with root package name */
    public final float f39265i;

    /* renamed from: j, reason: collision with root package name */
    public final float f39266j;

    /* renamed from: k, reason: collision with root package name */
    public final float f39267k;

    /* renamed from: l, reason: collision with root package name */
    public final long f39268l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final h1 f39269m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f39270n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final Z0 f39271o;

    /* renamed from: p, reason: collision with root package name */
    public final long f39272p;

    /* renamed from: q, reason: collision with root package name */
    public final long f39273q;

    /* renamed from: r, reason: collision with root package name */
    public final int f39274r;

    public GraphicsLayerElement(float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f22, float f23, long j12, h1 h1Var, boolean z12, Z0 z02, long j13, long j14, int i12, C42822w c42822w) {
        this.f39258b = f12;
        this.f39259c = f13;
        this.f39260d = f14;
        this.f39261e = f15;
        this.f39262f = f16;
        this.f39263g = f17;
        this.f39264h = f18;
        this.f39265i = f19;
        this.f39266j = f22;
        this.f39267k = f23;
        this.f39268l = j12;
        this.f39269m = h1Var;
        this.f39270n = z12;
        this.f39271o = z02;
        this.f39272p = j13;
        this.f39273q = j14;
        this.f39274r = i12;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new j1(this.f39258b, this.f39259c, this.f39260d, this.f39261e, this.f39262f, this.f39263g, this.f39264h, this.f39265i, this.f39266j, this.f39267k, this.f39268l, this.f39269m, this.f39270n, this.f39271o, this.f39272p, this.f39273q, this.f39274r, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        j1 j1Var = (j1) dVar;
        j1Var.f39532p = this.f39258b;
        j1Var.f39533q = this.f39259c;
        j1Var.f39534r = this.f39260d;
        j1Var.f39535s = this.f39261e;
        j1Var.f39536t = this.f39262f;
        j1Var.f39537u = this.f39263g;
        j1Var.f39538v = this.f39264h;
        j1Var.f39539w = this.f39265i;
        j1Var.f39540x = this.f39266j;
        j1Var.f39541y = this.f39267k;
        j1Var.f39542z = this.f39268l;
        j1Var.f39525A = this.f39269m;
        j1Var.f39526B = this.f39270n;
        j1Var.f39527C = this.f39271o;
        j1Var.f39528D = this.f39272p;
        j1Var.f39529E = this.f39273q;
        j1Var.f39530F = this.f39274r;
        AbstractC22443w0 abstractC22443w0 = C22421l.e(j1Var, 2).f40912q;
        if (abstractC22443w0 != null) {
            abstractC22443w0.b2(j1Var.f39531G, true);
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f39258b, graphicsLayerElement.f39258b) == 0 && Float.compare(this.f39259c, graphicsLayerElement.f39259c) == 0 && Float.compare(this.f39260d, graphicsLayerElement.f39260d) == 0 && Float.compare(this.f39261e, graphicsLayerElement.f39261e) == 0 && Float.compare(this.f39262f, graphicsLayerElement.f39262f) == 0 && Float.compare(this.f39263g, graphicsLayerElement.f39263g) == 0 && Float.compare(this.f39264h, graphicsLayerElement.f39264h) == 0 && Float.compare(this.f39265i, graphicsLayerElement.f39265i) == 0 && Float.compare(this.f39266j, graphicsLayerElement.f39266j) == 0 && Float.compare(this.f39267k, graphicsLayerElement.f39267k) == 0 && r1.b(this.f39268l, graphicsLayerElement.f39268l) && kotlin.jvm.internal.L.f(this.f39269m, graphicsLayerElement.f39269m) && this.f39270n == graphicsLayerElement.f39270n && kotlin.jvm.internal.L.f(this.f39271o, graphicsLayerElement.f39271o) && T.d(this.f39272p, graphicsLayerElement.f39272p) && T.d(this.f39273q, graphicsLayerElement.f39273q) && C22250e0.a(this.f39274r, graphicsLayerElement.f39274r);
    }

    public final int hashCode() {
        int iD2 = androidx.appcompat.app.r.d(this.f39267k, androidx.appcompat.app.r.d(this.f39266j, androidx.appcompat.app.r.d(this.f39265i, androidx.appcompat.app.r.d(this.f39264h, androidx.appcompat.app.r.d(this.f39263g, androidx.appcompat.app.r.d(this.f39262f, androidx.appcompat.app.r.d(this.f39261e, androidx.appcompat.app.r.d(this.f39260d, androidx.appcompat.app.r.d(this.f39259c, Float.hashCode(this.f39258b) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        r1.a aVar = r1.f39755b;
        int i12 = androidx.appcompat.app.r.i((this.f39269m.hashCode() + androidx.appcompat.app.r.g(iD2, 31, this.f39268l)) * 31, 31, this.f39270n);
        Z0 z02 = this.f39271o;
        int iHashCode = (i12 + (z02 == null ? 0 : z02.hashCode())) * 31;
        T.a aVar2 = T.f39320b;
        int i13 = kotlin.w0.f410662c;
        int iG2 = androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(iHashCode, 31, this.f39272p), 31, this.f39273q);
        C22250e0.a aVar3 = C22250e0.f39504b;
        return Integer.hashCode(this.f39274r) + iG2;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb2.append(this.f39258b);
        sb2.append(", scaleY=");
        sb2.append(this.f39259c);
        sb2.append(", alpha=");
        sb2.append(this.f39260d);
        sb2.append(", translationX=");
        sb2.append(this.f39261e);
        sb2.append(", translationY=");
        sb2.append(this.f39262f);
        sb2.append(", shadowElevation=");
        sb2.append(this.f39263g);
        sb2.append(", rotationX=");
        sb2.append(this.f39264h);
        sb2.append(", rotationY=");
        sb2.append(this.f39265i);
        sb2.append(", rotationZ=");
        sb2.append(this.f39266j);
        sb2.append(", cameraDistance=");
        sb2.append(this.f39267k);
        sb2.append(", transformOrigin=");
        sb2.append((Object) r1.e(this.f39268l));
        sb2.append(", shape=");
        sb2.append(this.f39269m);
        sb2.append(", clip=");
        sb2.append(this.f39270n);
        sb2.append(", renderEffect=");
        sb2.append(this.f39271o);
        sb2.append(", ambientShadowColor=");
        androidx.compose.foundation.H.z(this.f39272p, ", spotShadowColor=", sb2);
        androidx.compose.foundation.H.z(this.f39273q, ", compositingStrategy=", sb2);
        sb2.append((Object) C22250e0.b(this.f39274r));
        sb2.append(')');
        return sb2.toString();
    }
}
