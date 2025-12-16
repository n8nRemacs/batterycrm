package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;

/* compiled from: JvmBuiltIns.kt */
@s0
/* loaded from: classes8.dex */
final class g extends N implements Y41.a<JvmBuiltIns.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ JvmBuiltIns f407268l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(JvmBuiltIns jvmBuiltIns) {
        super(0);
        this.f407268l = jvmBuiltIns;
    }

    @Override // Y41.a
    public final JvmBuiltIns.a invoke() {
        JvmBuiltIns jvmBuiltIns = this.f407268l;
        Y41.a<JvmBuiltIns.a> aVar = jvmBuiltIns.f407229g;
        if (aVar == null) {
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        JvmBuiltIns.a aVarInvoke = aVar.invoke();
        jvmBuiltIns.f407229g = null;
        return aVarInvoke;
    }
}
