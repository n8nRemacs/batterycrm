package kotlin.reflect.jvm.internal;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: caches.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*0\b\u0002\u0010\u0004\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/Q;", "", "Lkotlin/reflect/t;", "", "Key", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.reflect.jvm.internal.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42841c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final AbstractC42839a<r<? extends Object>> f407081a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final AbstractC42839a<F> f407082b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final AbstractC42839a<kotlin.reflect.r> f407083c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final AbstractC42839a<kotlin.reflect.r> f407084d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final AbstractC42839a<ConcurrentHashMap<kotlin.Q<List<kotlin.reflect.t>, Boolean>, kotlin.reflect.r>> f407085e;

    /* compiled from: caches.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Class;", "it", "Lkotlin/reflect/r;", "invoke", "(Ljava/lang/Class;)Lkotlin/reflect/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlin.reflect.jvm.internal.c$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Class<?>, kotlin.reflect.r> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f407086l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.reflect.r invoke(Class<?> cls) {
            r<? extends Object> rVarA = C42841c.f407081a.a(cls);
            C42784z0 c42784z0 = C42784z0.f406748b;
            return kotlin.reflect.full.m.a(rVarA, c42784z0, false, c42784z0);
        }
    }

    /* compiled from: caches.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Ljava/lang/Class;", "it", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Q;", "", "Lkotlin/reflect/t;", "", "Lkotlin/reflect/jvm/internal/Key;", "Lkotlin/reflect/r;", "invoke", "(Ljava/lang/Class;)Ljava/util/concurrent/ConcurrentHashMap;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlin.reflect.jvm.internal.c$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Class<?>, ConcurrentHashMap<kotlin.Q<? extends List<? extends kotlin.reflect.t>, ? extends Boolean>, kotlin.reflect.r>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f407087l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final ConcurrentHashMap<kotlin.Q<? extends List<? extends kotlin.reflect.t>, ? extends Boolean>, kotlin.reflect.r> invoke(Class<?> cls) {
            return new ConcurrentHashMap<>();
        }
    }

    /* compiled from: caches.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Class;", "it", "Lkotlin/reflect/r;", "invoke", "(Ljava/lang/Class;)Lkotlin/reflect/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlin.reflect.jvm.internal.c$c, reason: collision with other inner class name */
    public static final class C11643c extends kotlin.jvm.internal.N implements Y41.l<Class<?>, kotlin.reflect.r> {

        /* renamed from: l, reason: collision with root package name */
        public static final C11643c f407088l = new C11643c();

        public C11643c() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.reflect.r invoke(Class<?> cls) {
            r<? extends Object> rVarA = C42841c.f407081a.a(cls);
            C42784z0 c42784z0 = C42784z0.f406748b;
            return kotlin.reflect.full.m.a(rVarA, c42784z0, true, c42784z0);
        }
    }

    /* compiled from: caches.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/lang/Class;", "it", "Lkotlin/reflect/jvm/internal/r;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlin.reflect.jvm.internal.c$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Class<?>, r<? extends Object>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f407089l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final r<? extends Object> invoke(Class<?> cls) {
            return new r<>(cls);
        }
    }

    /* compiled from: caches.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Class;", "it", "Lkotlin/reflect/jvm/internal/F;", "invoke", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/F;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlin.reflect.jvm.internal.c$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<Class<?>, F> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f407090l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final F invoke(Class<?> cls) {
            return new F(cls);
        }
    }

    static {
        d dVar = d.f407089l;
        int i12 = C42840b.f407077a;
        f407081a = new C42844f(dVar);
        f407082b = new C42844f(e.f407090l);
        f407083c = new C42844f(a.f407086l);
        f407084d = new C42844f(C11643c.f407088l);
        f407085e = new C42844f(b.f407087l);
    }
}
