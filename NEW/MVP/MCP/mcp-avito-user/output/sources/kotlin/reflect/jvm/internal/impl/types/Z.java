package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;

/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes8.dex */
final class Z extends Y {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final q0 f410076c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<x0> f410077d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f410078e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j f410079f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.l<kotlin.reflect.jvm.internal.impl.types.checker.i, Y> f410080g;

    /* JADX WARN: Multi-variable type inference failed */
    public Z(@Y61.k q0 q0Var, @Y61.k List<? extends x0> list, boolean z12, @Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVar, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.types.checker.i, ? extends Y> lVar) {
        this.f410076c = q0Var;
        this.f410077d = list;
        this.f410078e = z12;
        this.f410079f = jVar;
        this.f410080g = lVar;
        if (!(jVar instanceof kotlin.reflect.jvm.internal.impl.types.error.e) || (jVar instanceof kotlin.reflect.jvm.internal.impl.types.error.i)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + jVar + '\n' + q0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public final List<x0> F0() {
        return this.f410077d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public final n0 G0() {
        n0.f410236c.getClass();
        return n0.f410237d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public final q0 H0() {
        return this.f410076c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    public final boolean I0() {
        return this.f410078e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    public final O J0(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        Y yInvoke = this.f410080g.invoke(iVar);
        return yInvoke == null ? this : yInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.J0
    /* renamed from: M0 */
    public final J0 J0(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        Y yInvoke = this.f410080g.invoke(iVar);
        return yInvoke == null ? this : yInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    @Y61.k
    /* renamed from: O0 */
    public final Y L0(boolean z12) {
        return z12 == this.f410078e ? this : z12 ? new W(this) : new U(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    @Y61.k
    /* renamed from: P0 */
    public final Y N0(@Y61.k n0 n0Var) {
        return n0Var.isEmpty() ? this : new C42960a0(this, n0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j n() {
        return this.f410079f;
    }
}
