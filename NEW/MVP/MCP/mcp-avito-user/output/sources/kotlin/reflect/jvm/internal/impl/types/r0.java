package kotlin.reflect.jvm.internal.impl.types;

import java.util.Map;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes8.dex */
public final class r0 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map<q0, x0> f410241c;

    public r0(Map map) {
        this.f410241c = map;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.A0
    public final boolean a() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.A0
    public final boolean e() {
        return this.f410241c.isEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s0
    @Y61.l
    public final x0 g(@Y61.k q0 q0Var) {
        return this.f410241c.get(q0Var);
    }
}
