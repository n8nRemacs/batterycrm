package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: KotlinTypeFactory.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.a0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42960a0 extends AbstractC43000z {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final n0 f410083d;

    public C42960a0(@Y61.k Y y12, @Y61.k n0 n0Var) {
        super(y12);
        this.f410083d = n0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42999y, kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public final n0 G0() {
        return this.f410083d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42999y
    public final AbstractC42999y S0(Y y12) {
        return new C42960a0(y12, this.f410083d);
    }
}
