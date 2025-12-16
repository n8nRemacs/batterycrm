package curtains.internal;

import Y61.k;
import android.annotation.SuppressLint;
import java.lang.reflect.Field;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WindowSpy.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcurtains/internal/j;", "", "<init>", "()V", "curtains_release"}, k = 1, mv = {1, 4, 1})
@SuppressLint({"PrivateApi"})
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f393025a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f393026b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final j f393027c = new j();

    /* compiled from: WindowSpy.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "invoke"}, k = 3, mv = {1, 4, 1})
    public static final class a extends N implements Y41.a<Class<?>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f393028l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Class<?> invoke() {
            try {
                return Class.forName("com.android.internal.policy.DecorView");
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: WindowSpy.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Field;", "invoke"}, k = 3, mv = {1, 4, 1})
    public static final class b extends N implements Y41.a<Field> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f393029l = new b();

        public b() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final Field invoke() throws NoSuchFieldException, SecurityException {
            j.f393027c.getClass();
            Class cls = (Class) j.f393025a.getValue();
            if (cls == null) {
                return null;
            }
            try {
                Field declaredField = cls.getDeclaredField("mWindow");
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls.toString();
                return null;
            }
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        f393025a = C42727D.b(lazyThreadSafetyMode, a.f393028l);
        f393026b = C42727D.b(lazyThreadSafetyMode, b.f393029l);
    }
}
