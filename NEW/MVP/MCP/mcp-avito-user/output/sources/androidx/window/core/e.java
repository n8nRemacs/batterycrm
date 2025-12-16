package androidx.window.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import j.InterfaceC42154j;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConsumerAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/core/e;", "", "a", "b", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanUncheckedReflection"})
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ClassLoader f55184a;

    /* compiled from: ConsumerAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/core/e$a;", "", "T", "Ljava/lang/reflect/InvocationHandler;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.d<T> f55185a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Y41.l<T, G0> f55186b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k kotlin.reflect.d<T> dVar, @Y61.k Y41.l<? super T, G0> lVar) {
            this.f55185a = dVar;
            this.f55186b = lVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Y61.k
        public final Object invoke(@Y61.k Object obj, @Y61.k Method method, @Y61.l Object[] objArr) {
            boolean zF2 = L.f(method.getName(), "accept");
            Y41.l<T, G0> lVar = this.f55186b;
            if (zF2 && objArr != null && objArr.length == 1) {
                Object obj2 = objArr[0];
                kotlin.reflect.e.a(this.f55185a, obj2);
                lVar.invoke(obj2);
                return G0.f406611a;
            }
            if (L.f(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
                return Boolean.valueOf(obj == objArr[0]);
            }
            if (L.f(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
                return Integer.valueOf(lVar.hashCode());
            }
            if (L.f(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return lVar.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
    }

    /* compiled from: ConsumerAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/window/core/e$b;", "", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
        void dispose();
    }

    public e(@Y61.k ClassLoader classLoader) {
        this.f55184a = classLoader;
    }

    @InterfaceC42154j
    @Y61.k
    public final f a(@Y61.k Object obj, @Y61.k kotlin.reflect.d dVar, @Y61.k Activity activity, @Y61.k Y41.l lVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        a aVar = new a(dVar, lVar);
        ClassLoader classLoader = this.f55184a;
        Object objNewProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{classLoader.loadClass("java.util.function.Consumer")}, aVar);
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, classLoader.loadClass("java.util.function.Consumer")).invoke(obj, activity, objNewProxyInstance);
        return new f(obj, objNewProxyInstance, obj.getClass().getMethod("removeWindowLayoutInfoListener", classLoader.loadClass("java.util.function.Consumer")));
    }
}
