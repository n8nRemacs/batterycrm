package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: KotlinTypeFactory.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43000z extends AbstractC42999y {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y f410269c;

    public AbstractC43000z(@Y61.k Y y12) {
        this.f410269c = y12;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    @Y61.k
    /* renamed from: O0 */
    public final Y L0(boolean z12) {
        return z12 == I0() ? this : this.f410269c.L0(z12).N0(G0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    @Y61.k
    /* renamed from: P0 */
    public final Y N0(@Y61.k n0 n0Var) {
        return n0Var != G0() ? new C42960a0(this, n0Var) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42999y
    @Y61.k
    public final Y Q0() {
        return this.f410269c;
    }
}
