package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: TypeWithEnhancement.kt */
/* loaded from: classes8.dex */
public final class J extends H implements H0 {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final H f410026e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final O f410027f;

    public J(@Y61.k H h12, @Y61.k O o12) {
        super(h12.f410024c, h12.f410025d);
        this.f410026e = h12;
        this.f410027f = o12;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    public final O J0(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        return new J((H) iVar.c(this.f410026e), iVar.c(this.f410027f));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.H0
    @Y61.k
    public final O L() {
        return this.f410027f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.J0
    @Y61.k
    public final J0 L0(boolean z12) {
        return I0.b(this.f410026e.L0(z12), this.f410027f.K0().L0(z12));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.J0
    /* renamed from: M0 */
    public final J0 J0(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        return new J((H) iVar.c(this.f410026e), iVar.c(this.f410027f));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.J0
    @Y61.k
    public final J0 N0(@Y61.k n0 n0Var) {
        return I0.b(this.f410026e.N0(n0Var), this.f410027f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.H
    @Y61.k
    public final Y O0() {
        return this.f410026e.O0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.H
    @Y61.k
    public final String P0(@Y61.k kotlin.reflect.jvm.internal.impl.renderer.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.renderer.c cVar2) {
        kotlin.reflect.jvm.internal.impl.renderer.i iVar = cVar2.f409484e;
        iVar.getClass();
        return ((Boolean) iVar.f409530m.getValue(iVar, kotlin.reflect.jvm.internal.impl.renderer.i.f409494X[11])).booleanValue() ? cVar.Y(this.f410027f) : this.f410026e.P0(cVar, cVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.H0
    public final J0 n0() {
        return this.f410026e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.H
    @Y61.k
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f410027f + ")] " + this.f410026e;
    }
}
