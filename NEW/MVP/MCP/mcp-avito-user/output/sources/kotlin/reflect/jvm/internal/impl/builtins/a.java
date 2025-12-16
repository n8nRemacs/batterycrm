package kotlin.reflect.jvm.internal.impl.builtins;

import f51.InterfaceC40235a;
import java.util.ServiceLoader;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.descriptors.M;

/* compiled from: BuiltInsLoader.kt */
/* loaded from: classes8.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C11647a f407188a = C11647a.f407189a;

    /* compiled from: BuiltInsLoader.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.a$a, reason: collision with other inner class name */
    public static final class C11647a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C11647a f407189a = new C11647a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Object f407190b = C42727D.b(LazyThreadSafetyMode.f406615c, C11648a.f407191l);

        /* compiled from: BuiltInsLoader.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.a$a$a, reason: collision with other inner class name */
        public static final class C11648a extends N implements Y41.a<a> {

            /* renamed from: l, reason: collision with root package name */
            public static final C11648a f407191l = new C11648a();

            public C11648a() {
                super(0);
            }

            @Override // Y41.a
            public final a invoke() {
                a aVar = (a) C42745f0.F(ServiceLoader.load(a.class, a.class.getClassLoader()));
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }
    }

    @Y61.k
    M a(@Y61.k kotlin.reflect.jvm.internal.impl.storage.f fVar, @Y61.k E e12, @Y61.k Iterable iterable, @Y61.k f51.c cVar, @Y61.k InterfaceC40235a interfaceC40235a, boolean z12);
}
