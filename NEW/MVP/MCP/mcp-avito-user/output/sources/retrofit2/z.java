package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.C47645a;
import retrofit2.InterfaceC47647c;
import retrofit2.f;

/* compiled from: Retrofit.java */
/* loaded from: classes9.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f430121a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Call.Factory f430122b;

    /* renamed from: c, reason: collision with root package name */
    public final HttpUrl f430123c;

    /* renamed from: d, reason: collision with root package name */
    public final List<f.a> f430124d;

    /* renamed from: e, reason: collision with root package name */
    public final List<InterfaceC47647c.a> f430125e;

    /* renamed from: f, reason: collision with root package name */
    @I41.h
    public final Executor f430126f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f430127g;

    /* compiled from: Retrofit.java */
    public class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final v f430128a = v.f430064b;

        /* renamed from: b, reason: collision with root package name */
        public final Object[] f430129b = new Object[0];

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Class f430130c;

        public a(Class cls) {
            this.f430130c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @I41.h
        public final Object invoke(Object obj, Method method, @I41.h Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f430129b;
            }
            v vVar = this.f430128a;
            vVar.getClass();
            if (!method.isDefault()) {
                return z.this.c(method).a(objArr);
            }
            Class<?> cls = this.f430130c;
            Constructor<MethodHandles.Lookup> constructor = vVar.f430065a;
            return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }
    }

    public z(Call.Factory factory, HttpUrl httpUrl, List<f.a> list, List<InterfaceC47647c.a> list2, @I41.h Executor executor, boolean z12) {
        this.f430122b = factory;
        this.f430123c = httpUrl;
        this.f430124d = list;
        this.f430125e = list2;
        this.f430126f = executor;
        this.f430127g = z12;
    }

    public final InterfaceC47647c<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<InterfaceC47647c.a> list = this.f430125e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i12 = iIndexOf; i12 < size; i12++) {
            InterfaceC47647c<?, ?> interfaceC47647c = list.get(i12).get(type, annotationArr, this);
            if (interfaceC47647c != null) {
                return interfaceC47647c;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final <T> T b(Class<T> cls) throws SecurityException {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<T> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f430127g) {
            v vVar = v.f430064b;
            for (Method method : cls.getDeclaredMethods()) {
                vVar.getClass();
                if (!method.isDefault() && !Modifier.isStatic(method.getModifiers())) {
                    c(method);
                }
            }
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public final A<?> c(Method method) {
        A<?> aB2;
        A<?> a12 = (A) this.f430121a.get(method);
        if (a12 != null) {
            return a12;
        }
        synchronized (this.f430121a) {
            try {
                aB2 = (A) this.f430121a.get(method);
                if (aB2 == null) {
                    aB2 = A.b(this, method);
                    this.f430121a.put(method, aB2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aB2;
    }

    public final f d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<f.a> list = this.f430124d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i12 = iIndexOf; i12 < size; i12++) {
            f<ResponseBody, ?> fVarB = list.get(i12).b(type, annotationArr, this);
            if (fVarB != null) {
                return fVarB;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final <T> f<T, RequestBody> e(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List<f.a> list = this.f430124d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i12 = iIndexOf; i12 < size; i12++) {
            f<T, RequestBody> fVarA = list.get(i12).a(type, annotationArr, annotationArr2);
            if (fVarA != null) {
                return fVarA;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final <T> f<T, String> f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List<f.a> list = this.f430124d;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            f<T, String> fVarC = list.get(i12).c(type, annotationArr);
            if (fVarC != null) {
                return fVarC;
            }
        }
        return C47645a.d.f429972a;
    }

    /* compiled from: Retrofit.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final v f430132a;

        /* renamed from: b, reason: collision with root package name */
        @I41.h
        public Call.Factory f430133b;

        /* renamed from: c, reason: collision with root package name */
        @I41.h
        public HttpUrl f430134c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f430135d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f430136e;

        /* renamed from: f, reason: collision with root package name */
        @I41.h
        public final Executor f430137f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f430138g;

        public b() {
            v vVar = v.f430064b;
            this.f430135d = new ArrayList();
            this.f430136e = new ArrayList();
            this.f430132a = vVar;
        }

        public final void a(InterfaceC47647c.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f430136e.add(aVar);
        }

        public final void b(f.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f430135d.add(aVar);
        }

        public final void c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            d(HttpUrl.get(str));
        }

        public final void d(HttpUrl httpUrl) {
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            if ("".equals(httpUrl.pathSegments().get(r0.size() - 1))) {
                this.f430134c = httpUrl;
            } else {
                throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
            }
        }

        public final z e() {
            if (this.f430134c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            Call.Factory okHttpClient = this.f430133b;
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient();
            }
            Call.Factory factory = okHttpClient;
            Executor executorA = this.f430137f;
            v vVar = this.f430132a;
            if (executorA == null) {
                executorA = vVar.a();
            }
            Executor executor = executorA;
            ArrayList arrayList = new ArrayList(this.f430136e);
            vVar.getClass();
            arrayList.addAll(Arrays.asList(C47649e.f429984b, new g(executor)));
            ArrayList arrayList2 = this.f430135d;
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 2);
            arrayList3.add(new C47645a());
            arrayList3.addAll(arrayList2);
            arrayList3.addAll(Collections.singletonList(r.f430017a));
            return new z(factory, this.f430134c, Collections.unmodifiableList(arrayList3), Collections.unmodifiableList(arrayList), executor, this.f430138g);
        }

        public b(z zVar) {
            this.f430135d = new ArrayList();
            this.f430136e = new ArrayList();
            v vVar = v.f430064b;
            this.f430132a = vVar;
            this.f430133b = zVar.f430122b;
            this.f430134c = zVar.f430123c;
            List<f.a> list = zVar.f430124d;
            int size = list.size();
            vVar.getClass();
            int i12 = size - 1;
            for (int i13 = 1; i13 < i12; i13++) {
                this.f430135d.add(list.get(i13));
            }
            List<InterfaceC47647c.a> list2 = zVar.f430125e;
            int size2 = list2.size();
            this.f430132a.getClass();
            int i14 = size2 - 2;
            for (int i15 = 0; i15 < i14; i15++) {
                this.f430136e.add(list2.get(i15));
            }
            this.f430137f = zVar.f430126f;
            this.f430138g = zVar.f430127g;
        }
    }
}
