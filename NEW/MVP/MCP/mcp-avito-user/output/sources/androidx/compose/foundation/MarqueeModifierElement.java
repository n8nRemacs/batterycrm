package androidx.compose.foundation;

import androidx.compose.foundation.C21096z1;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BasicMarquee.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/MarqueeModifierElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/B1;", "", "iterations", "Landroidx/compose/foundation/z1;", "animationMode", "delayMillis", "initialDelayMillis", "Landroidx/compose/foundation/F1;", "spacing", "Landroidx/compose/ui/unit/h;", "velocity", "<init>", "(IIIILandroidx/compose/foundation/F1;FLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class MarqueeModifierElement extends AbstractC22430p0<B1> {

    /* renamed from: b, reason: collision with root package name */
    public final int f26791b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26792c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26793d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26794e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final F1 f26795f;

    /* renamed from: g, reason: collision with root package name */
    public final float f26796g;

    public MarqueeModifierElement(int i12, int i13, int i14, int i15, F1 f12, float f13, C42822w c42822w) {
        this.f26791b = i12;
        this.f26792c = i13;
        this.f26793d = i14;
        this.f26794e = i15;
        this.f26795f = f12;
        this.f26796g = f13;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new B1(this.f26791b, this.f26792c, this.f26793d, this.f26794e, this.f26795f, this.f26796g, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        B1 b12 = (B1) dVar;
        ((C22082i3) b12.f26646y).setValue(this.f26795f);
        ((C22082i3) b12.f26647z).setValue(C21096z1.a(this.f26792c));
        int i12 = b12.f26637p;
        int i13 = this.f26791b;
        int i14 = this.f26793d;
        int i15 = this.f26794e;
        float f12 = this.f26796g;
        if (i12 == i13 && b12.f26638q == i14 && b12.f26639r == i15 && androidx.compose.ui.unit.h.b(b12.f26640s, f12)) {
            return;
        }
        b12.f26637p = i13;
        b12.f26638q = i14;
        b12.f26639r = i15;
        b12.f26640s = f12;
        b12.m2();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarqueeModifierElement)) {
            return false;
        }
        MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) obj;
        if (this.f26791b != marqueeModifierElement.f26791b) {
            return false;
        }
        C21096z1.a aVar = C21096z1.f32326b;
        return this.f26792c == marqueeModifierElement.f26792c && this.f26793d == marqueeModifierElement.f26793d && this.f26794e == marqueeModifierElement.f26794e && kotlin.jvm.internal.L.f(this.f26795f, marqueeModifierElement.f26795f) && androidx.compose.ui.unit.h.b(this.f26796g, marqueeModifierElement.f26796g);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f26791b) * 31;
        C21096z1.a aVar = C21096z1.f32326b;
        int iHashCode2 = (this.f26795f.hashCode() + androidx.appcompat.app.r.e(this.f26794e, androidx.appcompat.app.r.e(this.f26793d, androidx.appcompat.app.r.e(this.f26792c, iHashCode, 31), 31), 31)) * 31;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f26796g) + iHashCode2;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MarqueeModifierElement(iterations=");
        sb2.append(this.f26791b);
        sb2.append(", animationMode=");
        sb2.append((Object) C21096z1.b(this.f26792c));
        sb2.append(", delayMillis=");
        sb2.append(this.f26793d);
        sb2.append(", initialDelayMillis=");
        sb2.append(this.f26794e);
        sb2.append(", spacing=");
        sb2.append(this.f26795f);
        sb2.append(", velocity=");
        return H.h(')', this.f26796g, sb2);
    }
}
