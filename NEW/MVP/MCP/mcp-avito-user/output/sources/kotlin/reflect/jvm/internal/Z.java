package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* compiled from: ReflectProperties.java */
/* loaded from: classes8.dex */
public class Z {

    /* compiled from: ReflectProperties.java */
    public static class a<T> extends b<T> implements Y41.a<T> {

        /* renamed from: c, reason: collision with root package name */
        public final Y41.a<T> f407074c;

        /* renamed from: d, reason: collision with root package name */
        public volatile SoftReference<Object> f407075d;

        public a(@Y61.l CallableMemberDescriptor callableMemberDescriptor, @Y61.k Y41.a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
            }
            this.f407075d = null;
            this.f407074c = aVar;
            if (callableMemberDescriptor != null) {
                this.f407075d = new SoftReference<>(callableMemberDescriptor);
            }
        }

        @Override // Y41.a
        public final T invoke() {
            T t12;
            SoftReference<Object> softReference = this.f407075d;
            if (softReference == null || (t12 = (T) softReference.get()) == null) {
                T tInvoke = this.f407074c.invoke();
                this.f407075d = new SoftReference<>(tInvoke == null ? b.f407076b : tInvoke);
                return tInvoke;
            }
            if (t12 == b.f407076b) {
                return null;
            }
            return t12;
        }
    }

    /* compiled from: ReflectProperties.java */
    public static abstract class b<T> {

        /* renamed from: b, reason: collision with root package name */
        public static final Object f407076b = new a();

        /* compiled from: ReflectProperties.java */
        public static class a {
        }
    }

    @Y61.k
    public static a a(@Y61.l CallableMemberDescriptor callableMemberDescriptor, @Y61.k Y41.a aVar) {
        if (aVar != null) {
            return new a(callableMemberDescriptor, aVar);
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
    }
}
