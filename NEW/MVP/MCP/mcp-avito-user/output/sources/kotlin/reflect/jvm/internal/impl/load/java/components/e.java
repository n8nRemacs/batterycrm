package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes8.dex */
final class e extends N implements Y41.l<E, O> {

    /* renamed from: l, reason: collision with root package name */
    public static final e f408021l = new e();

    public e() {
        super(1);
    }

    @Override // Y41.l
    public final O invoke(E e12) {
        d.f408016a.getClass();
        k0 k0VarB = b.b(d.f408018c, e12.m().i(n.a.f407395u));
        O type = k0VarB != null ? k0VarB.getType() : null;
        return type == null ? kotlin.reflect.jvm.internal.impl.types.error.h.b(ErrorTypeKind.f410147D, new String[0]) : type;
    }
}
