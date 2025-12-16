package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;

/* compiled from: ReflectJavaRecordComponent.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42889a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C42889a f407835a = new C42889a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public static C11655a f407836b;

    /* compiled from: ReflectJavaRecordComponent.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a$a, reason: collision with other inner class name */
    public static final class C11655a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Method f407837a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Method f407838b;

        public C11655a(@Y61.l Method method, @Y61.l Method method2) {
            this.f407837a = method;
            this.f407838b = method2;
        }
    }

    public static C11655a a(Object obj) {
        C11655a c11655a = f407836b;
        if (c11655a == null) {
            Class<?> cls = obj.getClass();
            try {
                c11655a = new C11655a(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                c11655a = new C11655a(null, null);
            }
            f407836b = c11655a;
        }
        return c11655a;
    }
}
