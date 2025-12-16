package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import k51.InterfaceC42516a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReflectJavaType.kt */
/* loaded from: classes8.dex */
public abstract class H implements k51.x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f407827a = new a(null);

    /* compiled from: ReflectJavaType.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static H a(@Y61.k Type type) {
            boolean z12 = type instanceof Class;
            if (z12) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new F(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z12 && ((Class) type).isArray())) ? new C42899k(type) : type instanceof WildcardType ? new K((WildcardType) type) : new v(type);
        }

        public a() {
        }
    }

    @Override // k51.InterfaceC42519d
    @Y61.l
    public InterfaceC42516a F(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Object next;
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((InterfaceC42516a) next).c().b(), cVar)) {
                break;
            }
        }
        return (InterfaceC42516a) next;
    }

    public final boolean equals(@Y61.l Object obj) {
        return (obj instanceof H) && L.f(p(), ((H) obj).p());
    }

    public final int hashCode() {
        return p().hashCode();
    }

    @Y61.k
    public abstract Type p();

    @Y61.k
    public final String toString() {
        return getClass().getName() + ": " + p();
    }
}
