package curtains.internal;

import Y61.k;
import Y61.l;
import java.lang.reflect.Field;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WindowManagerSpy.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcurtains/internal/i;", "", "<init>", "()V", "curtains_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f393018a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f393019b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f393020c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final i f393021d = new i();

    /* compiled from: WindowManagerSpy.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Field;", "invoke"}, k = 3, mv = {1, 4, 1})
    public static final class a extends N implements Y41.a<Field> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f393022l = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final Field invoke() throws NoSuchFieldException, SecurityException {
            i.f393021d.getClass();
            Class cls = (Class) i.f393018a.getValue();
            if (cls == null) {
                return null;
            }
            Field declaredField = cls.getDeclaredField("mViews");
            declaredField.setAccessible(true);
            return declaredField;
        }
    }

    /* compiled from: WindowManagerSpy.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "invoke"}, k = 3, mv = {1, 4, 1})
    public static final class b extends N implements Y41.a<Class<?>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f393023l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Class<?> invoke() {
            try {
                return Class.forName("android.view.WindowManagerGlobal");
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: WindowManagerSpy.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    public static final class c extends N implements Y41.a<Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f393024l = new c();

        public c() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        @l
        public final Object invoke() {
            i.f393021d.getClass();
            Class cls = (Class) i.f393018a.getValue();
            if (cls != null) {
                return cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            }
            return null;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        f393018a = C42727D.b(lazyThreadSafetyMode, b.f393023l);
        f393019b = C42727D.b(lazyThreadSafetyMode, c.f393024l);
        f393020c = C42727D.b(lazyThreadSafetyMode, a.f393022l);
    }
}
