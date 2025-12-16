package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: TypeWithEnhancement.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.b0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42962b0 extends AbstractC42999y implements H0 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y f410084c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final O f410085d;

    public C42962b0(@Y61.k Y y12, @Y61.k O o12) {
        this.f410084c = y12;
        this.f410085d = o12;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.H0
    @Y61.k
    public final O L() {
        return this.f410085d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    @Y61.k
    /* renamed from: O0 */
    public final Y L0(boolean z12) {
        return (Y) I0.b(this.f410084c.L0(z12), this.f410085d.K0().L0(z12));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    @Y61.k
    /* renamed from: P0 */
    public final Y N0(@Y61.k n0 n0Var) {
        return (Y) I0.b(this.f410084c.N0(n0Var), this.f410085d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42999y
    @Y61.k
    public final Y Q0() {
        return this.f410084c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42999y
    public final AbstractC42999y S0(Y y12) {
        return new C42962b0(y12, this.f410085d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42999y
    @Y61.k
    /* renamed from: T0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C42962b0 J0(@Y61.k kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        return new C42962b0((Y) iVar.c(this.f410084c), iVar.c(this.f410085d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.H0
    public final J0 n0() {
        return this.f410084c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    @Y61.k
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f410085d + ")] " + this.f410084c;
    }
}
