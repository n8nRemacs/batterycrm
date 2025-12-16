package coil.compose;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22440v;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContentPainterModifier.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil/compose/ContentPainterElement;", "Landroidx/compose/ui/node/p0;", "Lcoil/compose/m;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ContentPainterElement extends AbstractC22430p0<m> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.graphics.painter.e f58157b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22215f f58158c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22374n f58159d;

    /* renamed from: e, reason: collision with root package name */
    public final float f58160e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final U f58161f;

    public ContentPainterElement(@Y61.k androidx.compose.ui.graphics.painter.e eVar, @Y61.k InterfaceC22215f interfaceC22215f, @Y61.k InterfaceC22374n interfaceC22374n, float f12, @Y61.l U u12) {
        this.f58157b = eVar;
        this.f58158c = interfaceC22215f;
        this.f58159d = interfaceC22374n;
        this.f58160e = f12;
        this.f58161f = u12;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        m mVar = new m();
        mVar.f58244p = this.f58157b;
        mVar.f58245q = this.f58158c;
        mVar.f58246r = this.f58159d;
        mVar.f58247s = this.f58160e;
        mVar.f58248t = this.f58161f;
        return mVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        m mVar = (m) dVar;
        long f39738j = mVar.f58244p.getF39738j();
        androidx.compose.ui.graphics.painter.e eVar = this.f58157b;
        boolean zB2 = l0.n.b(f39738j, eVar.getF39738j());
        mVar.f58244p = eVar;
        mVar.f58245q = this.f58158c;
        mVar.f58246r = this.f58159d;
        mVar.f58247s = this.f58160e;
        mVar.f58248t = this.f58161f;
        if (!zB2) {
            C22421l.g(mVar).Y();
        }
        C22440v.a(mVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return L.f(this.f58157b, contentPainterElement.f58157b) && L.f(this.f58158c, contentPainterElement.f58158c) && L.f(this.f58159d, contentPainterElement.f58159d) && Float.compare(this.f58160e, contentPainterElement.f58160e) == 0 && L.f(this.f58161f, contentPainterElement.f58161f);
    }

    public final int hashCode() {
        int iD2 = androidx.appcompat.app.r.d(this.f58160e, (this.f58159d.hashCode() + ((this.f58158c.hashCode() + (this.f58157b.hashCode() * 31)) * 31)) * 31, 31);
        U u12 = this.f58161f;
        return iD2 + (u12 == null ? 0 : u12.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "ContentPainterElement(painter=" + this.f58157b + ", alignment=" + this.f58158c + ", contentScale=" + this.f58159d + ", alpha=" + this.f58160e + ", colorFilter=" + this.f58161f + ')';
    }
}
