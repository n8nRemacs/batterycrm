package com.avito.android.jsonrpc.client;

import Y41.l;
import Y61.k;
import androidx.camera.camera2.internal.G;
import com.avito.android.jsonrpc.annotations.JsonRpcBody;
import com.avito.android.jsonrpc.annotations.JsonRpcMethod;
import com.avito.android.jsonrpc.annotations.JsonRpcMethodCall;
import com.avito.android.jsonrpc.annotations.JsonRpcMethodName;
import com.avito.android.jsonrpc.annotations.JsonRpcParam;
import com.avito.android.jsonrpc.annotations.JsonRpcParamsMap;
import io.reactivex.rxjava3.core.I;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: JsonRpcInvocationHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/jsonrpc/client/c;", "T", "B", "Ljava/lang/reflect/InvocationHandler;", "a", "_common_jsonrpc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c<T, B> implements InvocationHandler {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f174717f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Class<T> f174718a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.jsonrpc.client.b<B> f174719b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.jsonrpc.client.a<B> f174720c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<String, G0> f174721d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AtomicLong f174722e = new AtomicLong(0);

    /* compiled from: JsonRpcInvocationHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/jsonrpc/client/c$a;", "", "<init>", "()V", "_common_jsonrpc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: JsonRpcInvocationHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "B", "result", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements l<B, Object> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Method f174723l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Type f174724m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ c<T, B> f174725n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method method, Type type, c<T, B> cVar) {
            super(1);
            this.f174723l = method;
            this.f174724m = type;
            this.f174725n = cVar;
        }

        @Override // Y41.l
        @k
        public final Object invoke(B b12) throws NullJsonRpcCallResultException {
            a aVar = c.f174717f;
            if (L.f(this.f174723l.getReturnType().getCanonicalName(), I.class.getCanonicalName())) {
                Type type = this.f174724m;
                if (!type.equals(G0.class)) {
                    c<T, B> cVar = this.f174725n;
                    cVar.f174721d.invoke("JsonRPC: Parsing " + type + " from result=" + b12);
                    Object objA = cVar.f174720c.a(b12, type);
                    if (objA != null) {
                        return objA;
                    }
                    throw new NullJsonRpcCallResultException();
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k Class<T> cls, @k com.avito.android.jsonrpc.client.b<B> bVar, @k com.avito.android.jsonrpc.client.a<B> aVar, @k l<? super String, G0> lVar) {
        this.f174718a = cls;
        this.f174719b = bVar;
        this.f174720c = aVar;
        this.f174721d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v28, types: [java.util.List] */
    @Override // java.lang.reflect.InvocationHandler
    @k
    public final Object invoke(@k Object obj, @k Method method, @Y61.l Object[] objArr) {
        Q q12;
        Annotation annotation;
        Iterator it;
        ?? arrayList;
        Annotation[][] annotationArr;
        Annotation annotation2;
        Annotation annotation3 = (JsonRpcMethod) method.getAnnotation(JsonRpcMethod.class);
        if (annotation3 == null) {
            annotation3 = method.getAnnotation(JsonRpcMethodCall.class);
        }
        if (annotation3 == null) {
            return method.invoke(method, objArr);
        }
        if (!L.f(method.getReturnType().getCanonicalName(), I.class.getCanonicalName())) {
            throw new IllegalStateException("Only io.reactivex.Single<T> is supported as return type");
        }
        long jIncrementAndGet = this.f174722e.incrementAndGet();
        boolean z12 = annotation3 instanceof JsonRpcMethod;
        Class<T> cls = this.f174718a;
        a aVar = f174717f;
        if (z12) {
            String strValue = ((JsonRpcMethod) annotation3).value();
            aVar.getClass();
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            ArrayList arrayList2 = new ArrayList(parameterAnnotations.length);
            int length = parameterAnnotations.length;
            int i12 = 0;
            while (i12 < length) {
                Annotation[] annotationArr2 = parameterAnnotations[i12];
                if (annotationArr2 != null) {
                    int length2 = annotationArr2.length;
                    int i13 = 0;
                    while (i13 < length2) {
                        annotation2 = annotationArr2[i13];
                        annotationArr = parameterAnnotations;
                        if (JsonRpcParam.class.isInstance(annotation2) || JsonRpcParamsMap.class.isInstance(annotation2)) {
                            break;
                        }
                        i13++;
                        parameterAnnotations = annotationArr;
                    }
                    annotationArr = parameterAnnotations;
                    annotation2 = null;
                } else {
                    annotationArr = parameterAnnotations;
                    annotation2 = null;
                }
                arrayList2.add(annotation2);
                i12++;
                parameterAnnotations = annotationArr;
            }
            ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            int i14 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                Annotation annotation4 = (Annotation) next;
                if (annotation4 instanceof JsonRpcParam) {
                    arrayList = Collections.singletonList(new Q(((JsonRpcParam) annotation4).value(), objArr != null ? objArr[i14] : null));
                    it = it2;
                } else {
                    if (!(annotation4 instanceof JsonRpcParamsMap)) {
                        StringBuilder sbJ = G.j(i14, "Argument #", " of ");
                        sbJ.append(cls.getName());
                        sbJ.append('#');
                        sbJ.append(method.getName());
                        sbJ.append("() must be annotated with @JsonRpcParam or @JsonRpcParamsMap");
                        throw new IllegalStateException(sbJ.toString().toString());
                    }
                    Object obj2 = objArr != null ? objArr[i14] : null;
                    if (!(obj2 == null ? true : obj2 instanceof Map)) {
                        StringBuilder sbJ2 = G.j(i14, "Argument #", " of ");
                        sbJ2.append(cls.getName());
                        sbJ2.append('#');
                        sbJ2.append(method.getName());
                        sbJ2.append("() must be an instance of Map<String, Any?>?");
                        throw new IllegalStateException(sbJ2.toString().toString());
                    }
                    Map mapC = (Map) obj2;
                    if (mapC == null) {
                        mapC = P0.c();
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(mapC.size()));
                    for (Map.Entry entry : mapC.entrySet()) {
                        Object key = entry.getKey();
                        Iterator it3 = it2;
                        String str = key instanceof String ? (String) key : null;
                        if (str == null) {
                            StringBuilder sbJ3 = G.j(i14, "Argument #", " of ");
                            sbJ3.append(cls.getName());
                            sbJ3.append('#');
                            sbJ3.append(method.getName());
                            sbJ3.append("() has illegal key: ");
                            sbJ3.append(entry.getKey());
                            throw new IllegalStateException(sbJ3.toString().toString());
                        }
                        linkedHashMap.put(str, entry.getValue());
                        it2 = it3;
                    }
                    it = it2;
                    arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        arrayList.add(new Q(entry2.getKey(), entry2.getValue()));
                    }
                }
                arrayList3.add(arrayList);
                i14 = i15;
                it2 = it;
            }
            ArrayList arrayListH = C42745f0.H(arrayList3);
            int iF2 = P0.f(C42745f0.q(arrayListH, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iF2);
            Iterator it4 = arrayListH.iterator();
            while (it4.hasNext()) {
                Q q13 = (Q) it4.next();
                linkedHashMap2.put(q13.f406619b, q13.f406620c);
            }
            q12 = new Q(strValue, linkedHashMap2);
        } else {
            if (!(annotation3 instanceof JsonRpcMethodCall)) {
                throw new IllegalStateException("Only @JsonRpcMethod & @JsonRpcMethodCall method annotations are supported");
            }
            aVar.getClass();
            if (method.getParameterAnnotations().length != 2) {
                throw new IllegalStateException((cls.getName() + '#' + method.getName() + "() is annotated with @JsonRpcMethodCall so it must have exactly 2 parameters").toString());
            }
            Annotation[][] parameterAnnotations2 = method.getParameterAnnotations();
            ArrayList arrayList4 = new ArrayList(parameterAnnotations2.length);
            for (Annotation[] annotationArr3 : parameterAnnotations2) {
                if (annotationArr3 != null) {
                    int length3 = annotationArr3.length;
                    for (int i16 = 0; i16 < length3; i16++) {
                        annotation = annotationArr3[i16];
                        if (JsonRpcMethodName.class.isInstance(annotation) || JsonRpcBody.class.isInstance(annotation)) {
                            break;
                        }
                    }
                    annotation = null;
                } else {
                    annotation = null;
                }
                arrayList4.add(annotation);
            }
            ArrayList arrayList5 = new ArrayList(C42745f0.q(arrayList4, 10));
            Iterator it5 = arrayList4.iterator();
            String str2 = null;
            Object obj3 = null;
            int i17 = 0;
            while (it5.hasNext()) {
                Object next2 = it5.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                Annotation annotation5 = (Annotation) next2;
                if (annotation5 instanceof JsonRpcMethodName) {
                    Object obj4 = objArr != null ? objArr[i17] : null;
                    str2 = obj4 instanceof String ? (String) obj4 : null;
                    if (str2 == null) {
                        throw new IllegalStateException(("Method name passed to " + cls.getName() + '#' + method.getName() + "() must be a String").toString());
                    }
                } else {
                    if (!(annotation5 instanceof JsonRpcBody)) {
                        StringBuilder sbJ4 = G.j(i17, "Argument #", " of ");
                        sbJ4.append(cls.getName());
                        sbJ4.append('#');
                        sbJ4.append(method.getName());
                        sbJ4.append("() must be annotated with @JsonRpcMethodName or @JsonRpcBody");
                        throw new IllegalStateException(sbJ4.toString().toString());
                    }
                    if (objArr == null || (obj3 = objArr[i17]) == null) {
                        throw new IllegalStateException(("JsonRpcBody passed to " + cls.getName() + '#' + method.getName() + "() must not be null").toString());
                    }
                }
                arrayList5.add(G0.f406611a);
                i17 = i18;
            }
            if (str2 == null) {
                str2 = null;
            }
            if (obj3 == null) {
                obj3 = G0.f406611a;
            }
            q12 = new Q(str2, obj3);
        }
        e eVar = new e(jIncrementAndGet, (String) q12.f406619b, q12.f406620c);
        Type type = (Type) C42756l.C(((ParameterizedType) method.getGenericReturnType()).getActualTypeArguments());
        this.f174721d.invoke("JsonRPC: Calling: " + eVar);
        return this.f174719b.a(eVar, new b(method, type, this));
    }
}
