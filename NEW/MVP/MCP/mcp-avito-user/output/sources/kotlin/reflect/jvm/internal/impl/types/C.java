package kotlin.reflect.jvm.internal.impl.types;

import u51.InterfaceC48803e;

/* compiled from: dynamicTypes.kt */
/* loaded from: classes8.dex */
public final class C extends H implements InterfaceC48803e {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final n0 f410008e;

    public C(@Y61.k kotlin.reflect.jvm.internal.impl.builtins.k kVar, @Y61.k n0 n0Var) {
        super(kVar.m(), kVar.n());
        this.f410008e = n0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.H, kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public final n0 G0() {
        return this.f410008e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.H, kotlin.reflect.jvm.internal.impl.types.O
    public final boolean I0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.J0
    public final J0 N0(n0 n0Var) {
        return new C(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.e(this.f410025d), n0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.H
    @Y61.k
    public final Y O0() {
        return this.f410025d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.H
    @Y61.k
    public final String P0(@Y61.k kotlin.reflect.jvm.internal.impl.renderer.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.renderer.c cVar2) {
        return "dynamic";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    public final O J0(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.J0
    public final J0 L0(boolean z12) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.J0
    /* renamed from: M0 */
    public final J0 J0(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        return this;
    }
}
