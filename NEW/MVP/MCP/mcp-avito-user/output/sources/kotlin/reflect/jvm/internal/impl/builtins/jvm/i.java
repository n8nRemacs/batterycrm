package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.G;

/* compiled from: JvmBuiltIns.kt */
/* loaded from: classes8.dex */
final class i extends N implements Y41.a<JvmBuiltIns.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G f407271l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(G g12) {
        super(0);
        this.f407271l = g12;
    }

    @Override // Y41.a
    public final JvmBuiltIns.a invoke() {
        return new JvmBuiltIns.a(this.f407271l);
    }
}
