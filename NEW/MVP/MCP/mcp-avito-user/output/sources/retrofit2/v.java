package retrofit2;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* compiled from: Platform.java */
/* loaded from: classes9.dex */
class v {

    /* renamed from: b, reason: collision with root package name */
    public static final v f430064b;

    /* renamed from: a, reason: collision with root package name */
    @I41.h
    public final Constructor<MethodHandles.Lookup> f430065a;

    /* compiled from: Platform.java */
    public static final class a extends v {

        /* compiled from: Platform.java */
        /* renamed from: retrofit2.v$a$a, reason: collision with other inner class name */
        public static final class ExecutorC12390a implements Executor {

            /* renamed from: b, reason: collision with root package name */
            public final Handler f430066b = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f430066b.post(runnable);
            }
        }

        @Override // retrofit2.v
        public final Executor a() {
            return new ExecutorC12390a();
        }
    }

    static {
        f430064b = "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new v();
    }

    public v() throws NoSuchMethodException, SecurityException {
        Constructor<MethodHandles.Lookup> declaredConstructor = null;
        try {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
        } catch (NoClassDefFoundError | NoSuchMethodException unused) {
        }
        this.f430065a = declaredConstructor;
    }

    @I41.h
    public Executor a() {
        return null;
    }
}
