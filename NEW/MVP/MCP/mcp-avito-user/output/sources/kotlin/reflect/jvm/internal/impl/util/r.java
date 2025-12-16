package kotlin.reflect.jvm.internal.impl.util;

import androidx.camera.camera2.internal.G;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.util.f;

/* compiled from: modifierChecks.kt */
/* loaded from: classes8.dex */
public abstract class r implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<kotlin.reflect.jvm.internal.impl.builtins.k, O> f410331a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f410332b;

    /* compiled from: modifierChecks.kt */
    public static final class a extends r {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final a f410333c = new a();

        /* compiled from: modifierChecks.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.util.r$a$a, reason: collision with other inner class name */
        public static final class C11700a extends N implements Y41.l<kotlin.reflect.jvm.internal.impl.builtins.k, O> {

            /* renamed from: l, reason: collision with root package name */
            public static final C11700a f410334l = new C11700a();

            public C11700a() {
                super(1);
            }

            @Override // Y41.l
            public final O invoke(kotlin.reflect.jvm.internal.impl.builtins.k kVar) {
                kotlin.reflect.jvm.internal.impl.builtins.k kVar2 = kVar;
                kVar2.getClass();
                Y yR2 = kVar2.r(PrimitiveType.f407160g);
                if (yR2 != null) {
                    return yR2;
                }
                kotlin.reflect.jvm.internal.impl.builtins.k.a(64);
                throw null;
            }
        }

        public a() {
            super("Boolean", C11700a.f410334l, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class b extends r {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f410335c = new b();

        /* compiled from: modifierChecks.kt */
        public static final class a extends N implements Y41.l<kotlin.reflect.jvm.internal.impl.builtins.k, O> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f410336l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final O invoke(kotlin.reflect.jvm.internal.impl.builtins.k kVar) {
                kotlin.reflect.jvm.internal.impl.builtins.k kVar2 = kVar;
                kVar2.getClass();
                Y yR2 = kVar2.r(PrimitiveType.f407164k);
                if (yR2 != null) {
                    return yR2;
                }
                kotlin.reflect.jvm.internal.impl.builtins.k.a(59);
                throw null;
            }
        }

        public b() {
            super("Int", a.f410336l, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class c extends r {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final c f410337c = new c();

        /* compiled from: modifierChecks.kt */
        public static final class a extends N implements Y41.l<kotlin.reflect.jvm.internal.impl.builtins.k, O> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f410338l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final O invoke(kotlin.reflect.jvm.internal.impl.builtins.k kVar) {
                return kVar.v();
            }
        }

        public c() {
            super("Unit", a.f410338l, null);
        }
    }

    public r() {
        throw null;
    }

    public r(String str, Y41.l lVar, C42822w c42822w) {
        this.f410331a = lVar;
        this.f410332b = G.f("must return ", str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    public final boolean a(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
        return L.f(eVar.f407709h, this.f410331a.invoke(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.e(eVar)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @Y61.l
    public final String b(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
        return f.a.a(this, eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @Y61.k
    public final String getDescription() {
        return this.f410332b;
    }
}
