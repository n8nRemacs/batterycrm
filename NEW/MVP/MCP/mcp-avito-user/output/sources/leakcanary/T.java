package leakcanary;

import android.app.Service;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import leakcanary.M;

/* compiled from: ServiceWatcher.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00050\u00052,\u0010\u0006\u001a(\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00070\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "method", "Ljava/lang/reflect/Method;", "args", "", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
final class T implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M.f f414030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f414031b;

    public T(M.f fVar, Object obj) {
        this.f414030a = fVar;
        this.f414031b = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        WeakReference<Service> weakReferenceRemove;
        Service service;
        if ("serviceDoneExecuting".equals(method.getName())) {
            if (objArr == null) {
                kotlin.jvm.internal.L.k();
                throw null;
            }
            Object obj2 = objArr[0];
            if (obj2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.os.IBinder");
            }
            IBinder iBinder = (IBinder) obj2;
            M m12 = M.this;
            if (m12.f414010a.containsKey(iBinder) && (weakReferenceRemove = m12.f414010a.remove(iBinder)) != null && (service = weakReferenceRemove.get()) != null) {
                m12.f414016g.a(service, service.getClass().getName().concat(" received Service#onDestroy() callback"));
            }
        }
        Object obj3 = this.f414031b;
        try {
            return objArr == null ? method.invoke(obj3, new Object[0]) : method.invoke(obj3, Arrays.copyOf(objArr, objArr.length));
        } catch (InvocationTargetException e12) {
            throw e12.getTargetException();
        }
    }
}
