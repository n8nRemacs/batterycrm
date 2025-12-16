package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ReflectJavaClass.kt */
@s0
/* loaded from: classes8.dex */
final class q extends N implements Y41.l<Class<?>, kotlin.reflect.jvm.internal.impl.name.f> {

    /* renamed from: l, reason: collision with root package name */
    public static final q f407868l = new q();

    public q() {
        super(1);
    }

    @Override // Y41.l
    public final kotlin.reflect.jvm.internal.impl.name.f invoke(Class<?> cls) {
        String simpleName = cls.getSimpleName();
        if (!kotlin.reflect.jvm.internal.impl.name.f.f(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return kotlin.reflect.jvm.internal.impl.name.f.e(simpleName);
        }
        return null;
    }
}
