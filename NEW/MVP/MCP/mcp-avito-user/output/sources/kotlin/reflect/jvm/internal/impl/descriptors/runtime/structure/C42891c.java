package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.s0;

/* compiled from: ReflectJavaMember.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42891c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C42891c f407845a = new C42891c();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public static a f407846b;

    /* compiled from: ReflectJavaMember.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Method f407847a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Method f407848b;

        public a(@Y61.l Method method, @Y61.l Method method2) {
            this.f407847a = method;
            this.f407848b = method2;
        }
    }

    @Y61.k
    public static a a(@Y61.k Member member) throws NoSuchMethodException, SecurityException {
        Class<?> cls = member.getClass();
        try {
            Method method = cls.getMethod("getParameters", new Class[0]);
            List<kotlin.reflect.d<? extends Object>> list = C42892d.f407849a;
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            }
            return new a(method, classLoader.loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }
}
