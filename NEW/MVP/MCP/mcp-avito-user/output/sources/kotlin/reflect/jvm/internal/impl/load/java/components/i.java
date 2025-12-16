package kotlin.reflect.jvm.internal.impl.load.java.components;

import k51.InterfaceC42522g;
import k51.n;
import k51.q;
import kotlin.reflect.jvm.internal.impl.descriptors.U;

/* compiled from: JavaResolverCache.java */
/* loaded from: classes8.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f408029a = new a();

    void a(@Y61.k k51.l lVar, @Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.b bVar);

    void b(@Y61.k q qVar, @Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar);

    void c(@Y61.k InterfaceC42522g interfaceC42522g, @Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f fVar);

    void d(@Y61.k n nVar, @Y61.k U u12);

    /* compiled from: JavaResolverCache.java */
    public static class a implements i {
        public static /* synthetic */ void e(int i12) {
            Object[] objArr = new Object[3];
            switch (i12) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i12) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.i
        public final void a(@Y61.k k51.l lVar, @Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.b bVar) {
            if (lVar != null) {
                return;
            }
            e(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.i
        public final void c(@Y61.k InterfaceC42522g interfaceC42522g, @Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f fVar) {
            if (interfaceC42522g != null) {
                return;
            }
            e(7);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.i
        public final void d(@Y61.k n nVar, @Y61.k U u12) {
            if (u12 != null) {
                return;
            }
            e(6);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.i
        public final void b(@Y61.k q qVar, @Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
        }
    }
}
