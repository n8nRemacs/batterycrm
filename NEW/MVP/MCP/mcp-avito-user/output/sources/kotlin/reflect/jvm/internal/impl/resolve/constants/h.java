package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: ConstantValueFactory.kt */
/* loaded from: classes8.dex */
final class h extends N implements Y41.l<E, O> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PrimitiveType f409587l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PrimitiveType primitiveType) {
        super(1);
        this.f409587l = primitiveType;
    }

    @Override // Y41.l
    public final O invoke(E e12) {
        return e12.m().p(this.f409587l);
    }
}
