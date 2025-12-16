package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.N;

/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes8.dex */
final class p extends N implements Y41.l<Class<?>, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final p f407867l = new p();

    public p() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(Class<?> cls) {
        return Boolean.valueOf(cls.getSimpleName().length() == 0);
    }
}
