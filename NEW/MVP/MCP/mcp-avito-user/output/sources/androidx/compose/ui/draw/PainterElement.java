package androidx.compose.ui.draw;

import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22440v;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PainterModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/draw/t;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class PainterElement extends AbstractC22430p0<t> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.graphics.painter.e f39027b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f39028c = true;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22215f f39029d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22374n f39030e;

    /* renamed from: f, reason: collision with root package name */
    public final float f39031f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final U f39032g;

    public PainterElement(@Y61.k androidx.compose.ui.graphics.painter.e eVar, @Y61.k InterfaceC22215f interfaceC22215f, @Y61.k InterfaceC22374n interfaceC22374n, float f12, @Y61.l U u12) {
        this.f39027b = eVar;
        this.f39029d = interfaceC22215f;
        this.f39030e = interfaceC22374n;
        this.f39031f = f12;
        this.f39032g = u12;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new t(this.f39027b, this.f39028c, this.f39029d, this.f39030e, this.f39031f, this.f39032g);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        t tVar = (t) dVar;
        boolean z12 = tVar.f39065q;
        androidx.compose.ui.graphics.painter.e eVar = this.f39027b;
        boolean z13 = this.f39028c;
        boolean z14 = z12 != z13 || (z13 && !l0.n.b(tVar.f39064p.getF39738j(), eVar.getF39738j()));
        tVar.f39064p = eVar;
        tVar.f39065q = z13;
        tVar.f39066r = this.f39029d;
        tVar.f39067s = this.f39030e;
        tVar.f39068t = this.f39031f;
        tVar.f39069u = this.f39032g;
        if (z14) {
            C22421l.g(tVar).Y();
        }
        C22440v.a(tVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return L.f(this.f39027b, painterElement.f39027b) && this.f39028c == painterElement.f39028c && L.f(this.f39029d, painterElement.f39029d) && L.f(this.f39030e, painterElement.f39030e) && Float.compare(this.f39031f, painterElement.f39031f) == 0 && L.f(this.f39032g, painterElement.f39032g);
    }

    public final int hashCode() {
        int iD2 = androidx.appcompat.app.r.d(this.f39031f, (this.f39030e.hashCode() + ((this.f39029d.hashCode() + androidx.appcompat.app.r.i(this.f39027b.hashCode() * 31, 31, this.f39028c)) * 31)) * 31, 31);
        U u12 = this.f39032g;
        return iD2 + (u12 == null ? 0 : u12.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "PainterElement(painter=" + this.f39027b + ", sizeToIntrinsics=" + this.f39028c + ", alignment=" + this.f39029d + ", contentScale=" + this.f39030e + ", alpha=" + this.f39031f + ", colorFilter=" + this.f39032g + ')';
    }
}
