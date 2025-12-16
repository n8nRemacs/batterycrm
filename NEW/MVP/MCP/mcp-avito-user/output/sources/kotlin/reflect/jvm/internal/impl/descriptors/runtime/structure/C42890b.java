package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;

/* compiled from: ReflectJavaClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42890b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C42890b f407839a = new C42890b();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public static a f407840b;

    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Method f407841a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Method f407842b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Method f407843c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Method f407844d;

        public a(@Y61.l Method method, @Y61.l Method method2, @Y61.l Method method3, @Y61.l Method method4) {
            this.f407841a = method;
            this.f407842b = method2;
            this.f407843c = method3;
            this.f407844d = method4;
        }
    }

    public static a a() {
        a aVar = f407840b;
        if (aVar == null) {
            try {
                aVar = new a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new a(null, null, null, null);
            }
            f407840b = aVar;
        }
        return aVar;
    }
}
