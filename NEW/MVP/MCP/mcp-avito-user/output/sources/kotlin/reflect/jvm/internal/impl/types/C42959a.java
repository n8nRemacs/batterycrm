package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: SpecialTypes.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42959a extends AbstractC42999y {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y f410081c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y f410082d;

    public C42959a(@Y61.k Y y12, @Y61.k Y y13) {
        this.f410081c = y12;
        this.f410082d = y13;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    @Y61.k
    /* renamed from: P0 */
    public final Y N0(@Y61.k n0 n0Var) {
        return new C42959a(this.f410081c.N0(n0Var), this.f410082d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42999y
    @Y61.k
    public final Y Q0() {
        return this.f410081c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42999y
    public final AbstractC42999y S0(Y y12) {
        return new C42959a(y12, this.f410082d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    @Y61.k
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final C42959a L0(boolean z12) {
        return new C42959a(this.f410081c.L0(z12), this.f410082d.L0(z12));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42999y
    @Y61.k
    /* renamed from: U0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C42959a J0(@Y61.k kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        return new C42959a((Y) iVar.c(this.f410081c), (Y) iVar.c(this.f410082d));
    }
}
