package leakcanary;

import android.annotation.SuppressLint;
import android.app.Service;
import android.os.Handler;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C42822w;
import shark.j3;

/* compiled from: ServiceWatcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lleakcanary/M;", "Lleakcanary/s;", "a", "leakcanary-object-watcher-android-core_release"}, k = 1, mv = {1, 4, 1})
@SuppressLint({"PrivateApi"})
/* loaded from: classes8.dex */
public final class M implements InterfaceC43760s {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f414009h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap<IBinder, WeakReference<Service>> f414010a = new WeakHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC42726C f414011b = C42727D.c(b.f414017l);

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC42726C f414012c = C42727D.c(new c());

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC42726C f414013d = C42727D.c(new d());

    /* renamed from: e, reason: collision with root package name */
    public Y41.a<G0> f414014e;

    /* renamed from: f, reason: collision with root package name */
    public Y41.a<G0> f414015f;

    /* renamed from: g, reason: collision with root package name */
    public final E f414016g;

    /* compiled from: ServiceWatcher.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lleakcanary/M$a;", "", "<init>", "()V", "", "METHOD_SERVICE_DONE_EXECUTING", "Ljava/lang/String;", "", "STOP_SERVICE", "I", "leakcanary-object-watcher-android-core_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: ServiceWatcher.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Class<?>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f414017l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Class<?> invoke() {
            return Class.forName("android.app.ActivityThread");
        }
    }

    /* compiled from: ServiceWatcher.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<Object> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        public final Object invoke() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            int i12 = M.f414009h;
            Object objInvoke = ((Class) M.this.f414011b.getValue()).getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke != null) {
                return objInvoke;
            }
            kotlin.jvm.internal.L.k();
            throw null;
        }
    }

    /* compiled from: ServiceWatcher.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Landroid/os/IBinder;", "Landroid/app/Service;", "invoke"}, k = 3, mv = {1, 4, 1})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<Map<IBinder, ? extends Service>> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Map<IBinder, ? extends Service> invoke() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            int i12 = M.f414009h;
            M m12 = M.this;
            Field declaredField = ((Class) m12.f414011b.getValue()).getDeclaredField("mServices");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(m12.f414012c.getValue());
            if (obj != null) {
                return (Map) obj;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<android.os.IBinder, android.app.Service>");
        }
    }

    /* compiled from: ServiceWatcher.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/os/Handler$Callback;", "mCallback", "invoke"}, k = 3, mv = {1, 4, 1})
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<Handler.Callback, Handler.Callback> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final Handler.Callback invoke(Handler.Callback callback) {
            Handler.Callback callback2 = callback;
            M.this.f414014e = new O(this, callback2);
            return new P(this, callback2);
        }
    }

    /* compiled from: ServiceWatcher.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "activityManagerInterface", "Ljava/lang/Class;", "activityManagerInstance", "invoke"}, k = 3, mv = {1, 4, 1})
    public static final class f extends kotlin.jvm.internal.N implements Y41.p<Class<?>, Object, Object> {
        public f() {
            super(2);
        }

        @Override // Y41.p
        public final Object invoke(Class<?> cls, Object obj) {
            Class<?> cls2 = cls;
            M.this.f414015f = new S(this, obj);
            return Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new T(this, obj));
        }
    }

    static {
        new a(null);
    }

    public M(@Y61.k E e12) {
        this.f414016g = e12;
    }

    @SuppressLint({"PrivateApi"})
    public static void b(Y41.p pVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = Class.forName("android.util.Singleton");
        Field declaredField = cls.getDeclaredField("mInstance");
        declaredField.setAccessible(true);
        Method declaredMethod = cls.getDeclaredMethod("get", new Class[0]);
        Class<?> cls2 = Class.forName("android.app.ActivityManager");
        Field declaredField2 = cls2.getDeclaredField("IActivityManagerSingleton");
        declaredField2.setAccessible(true);
        Object obj = declaredField2.get(cls2);
        Object objInvoke = declaredMethod.invoke(obj, new Object[0]);
        Class<?> cls3 = Class.forName("android.app.IActivityManager");
        if (objInvoke != null) {
            declaredField.set(obj, pVar.invoke(cls3, objInvoke));
        } else {
            kotlin.jvm.internal.L.k();
            throw null;
        }
    }

    @Override // leakcanary.InterfaceC43760s
    public final void a() {
        leakcanary.internal.d.a();
        if (!(this.f414014e == null)) {
            throw new IllegalStateException("ServiceWatcher already installed");
        }
        if (this.f414015f != null) {
            throw new IllegalStateException("ServiceWatcher already installed");
        }
        try {
            c(new e());
            b(new f());
        } catch (Throwable th2) {
            j3.f438639b.getClass();
            u uVar = j3.f438638a;
            if (uVar != null) {
                uVar.b("Could not watch destroyed services", th2);
            }
        }
    }

    public final void c(Y41.l<? super Handler.Callback, ? extends Handler.Callback> lVar) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Field declaredField = ((Class) this.f414011b.getValue()).getDeclaredField("mH");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(this.f414012c.getValue());
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.os.Handler");
        }
        Handler handler = (Handler) obj;
        Field declaredField2 = Handler.class.getDeclaredField("mCallback");
        declaredField2.setAccessible(true);
        declaredField2.set(handler, lVar.invoke((Handler.Callback) declaredField2.get(handler)));
    }
}
