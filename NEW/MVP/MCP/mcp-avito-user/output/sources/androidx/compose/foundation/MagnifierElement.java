package androidx.compose.foundation;

import android.view.View;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22423m;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.unit.l;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Magnifier.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0099\u0001\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/x1;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/d;", "Ll0/g;", "Lkotlin/w;", "sourceCenter", "magnifierCenter", "Landroidx/compose/ui/unit/l;", "Lkotlin/G0;", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Landroidx/compose/ui/unit/h;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/foundation/R1;", "platformMagnifierFactory", "<init>", "(LY41/l;LY41/l;LY41/l;FZJFFZLandroidx/compose/foundation/R1;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MagnifierElement extends AbstractC22430p0<C21090x1> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<androidx.compose.ui.unit.d, l0.g> f26781b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Y41.l<androidx.compose.ui.unit.d, l0.g> f26782c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.l<androidx.compose.ui.unit.l, kotlin.G0> f26783d;

    /* renamed from: e, reason: collision with root package name */
    public final float f26784e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f26785f;

    /* renamed from: g, reason: collision with root package name */
    public final long f26786g;

    /* renamed from: h, reason: collision with root package name */
    public final float f26787h;

    /* renamed from: i, reason: collision with root package name */
    public final float f26788i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f26789j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final R1 f26790k;

    public MagnifierElement() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MagnifierElement(Y41.l lVar, Y41.l lVar2, Y41.l lVar3, float f12, boolean z12, long j12, float f13, float f14, boolean z13, R1 r12, int i12, C42822w c42822w) {
        long j13;
        float f15;
        float f16;
        Y41.l lVar4 = (i12 & 2) != 0 ? null : lVar2;
        Y41.l lVar5 = (i12 & 4) != 0 ? null : lVar3;
        float f17 = (i12 & 8) != 0 ? Float.NaN : f12;
        boolean z14 = (i12 & 16) != 0 ? false : z12;
        if ((i12 & 32) != 0) {
            androidx.compose.ui.unit.l.f42859b.getClass();
            j13 = androidx.compose.ui.unit.l.f42860c;
        } else {
            j13 = j12;
        }
        if ((i12 & 64) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f15 = androidx.compose.ui.unit.h.f42851e;
        } else {
            f15 = f13;
        }
        if ((i12 & 128) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f16 = androidx.compose.ui.unit.h.f42851e;
        } else {
            f16 = f14;
        }
        this(lVar, lVar4, lVar5, f17, z14, j13, f15, f16, (i12 & 256) != 0 ? true : z13, r12, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new C21090x1(this.f26781b, this.f26782c, this.f26783d, this.f26784e, this.f26785f, this.f26786g, this.f26787h, this.f26788i, this.f26789j, this.f26790k, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C21090x1 c21090x1 = (C21090x1) dVar;
        float f12 = c21090x1.f32308s;
        long j12 = c21090x1.f32310u;
        float f13 = c21090x1.f32311v;
        boolean z12 = c21090x1.f32309t;
        float f14 = c21090x1.f32312w;
        boolean z13 = c21090x1.f32313x;
        R1 r12 = c21090x1.f32314y;
        View view = c21090x1.f32315z;
        androidx.compose.ui.unit.d dVar2 = c21090x1.f32298A;
        c21090x1.f32305p = this.f26781b;
        c21090x1.f32306q = this.f26782c;
        float f15 = this.f26784e;
        c21090x1.f32308s = f15;
        boolean z14 = this.f26785f;
        c21090x1.f32309t = z14;
        long j13 = this.f26786g;
        c21090x1.f32310u = j13;
        float f16 = this.f26787h;
        c21090x1.f32311v = f16;
        float f17 = this.f26788i;
        c21090x1.f32312w = f17;
        boolean z15 = this.f26789j;
        c21090x1.f32313x = z15;
        c21090x1.f32307r = this.f26783d;
        R1 r13 = this.f26790k;
        c21090x1.f32314y = r13;
        View viewA = C22423m.a(c21090x1);
        androidx.compose.ui.unit.d dVar3 = C22421l.g(c21090x1).f40608B;
        if (c21090x1.f32299B != null) {
            androidx.compose.ui.semantics.E<Y41.a<l0.g>> e12 = C21093y1.f32323a;
            if (((!Float.isNaN(f15) || !Float.isNaN(f12)) && f15 != f12 && !r13.a()) || !androidx.compose.ui.unit.l.b(j13, j12) || !androidx.compose.ui.unit.h.b(f16, f13) || !androidx.compose.ui.unit.h.b(f17, f14) || z14 != z12 || z15 != z13 || !kotlin.jvm.internal.L.f(r13, r12) || !viewA.equals(view) || !kotlin.jvm.internal.L.f(dVar3, dVar2)) {
                c21090x1.l2();
            }
        }
        c21090x1.m2();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        return this.f26781b == magnifierElement.f26781b && this.f26782c == magnifierElement.f26782c && this.f26784e == magnifierElement.f26784e && this.f26785f == magnifierElement.f26785f && androidx.compose.ui.unit.l.b(this.f26786g, magnifierElement.f26786g) && androidx.compose.ui.unit.h.b(this.f26787h, magnifierElement.f26787h) && androidx.compose.ui.unit.h.b(this.f26788i, magnifierElement.f26788i) && this.f26789j == magnifierElement.f26789j && this.f26783d == magnifierElement.f26783d && kotlin.jvm.internal.L.f(this.f26790k, magnifierElement.f26790k);
    }

    public final int hashCode() {
        int iHashCode = this.f26781b.hashCode() * 31;
        Y41.l<androidx.compose.ui.unit.d, l0.g> lVar = this.f26782c;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.d(this.f26784e, (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31, 31), 31, this.f26785f);
        l.a aVar = androidx.compose.ui.unit.l.f42859b;
        int iG2 = androidx.appcompat.app.r.g(i12, 31, this.f26786g);
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        int i13 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.d(this.f26788i, androidx.appcompat.app.r.d(this.f26787h, iG2, 31), 31), 31, this.f26789j);
        Y41.l<androidx.compose.ui.unit.l, kotlin.G0> lVar2 = this.f26783d;
        return this.f26790k.hashCode() + ((i13 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31);
    }

    public MagnifierElement(Y41.l lVar, Y41.l lVar2, Y41.l lVar3, float f12, boolean z12, long j12, float f13, float f14, boolean z13, R1 r12, C42822w c42822w) {
        this.f26781b = lVar;
        this.f26782c = lVar2;
        this.f26783d = lVar3;
        this.f26784e = f12;
        this.f26785f = z12;
        this.f26786g = j12;
        this.f26787h = f13;
        this.f26788i = f14;
        this.f26789j = z13;
        this.f26790k = r12;
    }
}
