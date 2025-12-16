package com.avito.android.retrofit;

import com.avito.android.remote.model.ConvertDtoToTyped;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.TypedResultKt;
import com.avito.android.util.C35983y4;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import okhttp3.Request;
import retrofit2.InterfaceC47646b;
import retrofit2.InterfaceC47647c;
import retrofit2.InterfaceC47648d;

/* compiled from: CallAdapterFactoryCoroutines.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/retrofit/f;", "Lretrofit2/c$a;", "<init>", "()V", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.retrofit.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C34414f extends InterfaceC47647c.a {

    /* compiled from: CallAdapterFactoryCoroutines.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/retrofit/f$a;", "", "R", "Lretrofit2/b;", "Lcom/avito/android/remote/model/TypedResult;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.retrofit.f$a */
    public static final class a<R> implements InterfaceC47646b<TypedResult<R>> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final InterfaceC47646b<R> f255127b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f255128c;

        /* compiled from: CallAdapterFactoryCoroutines.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/retrofit/f$a$a", "Lretrofit2/d;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.retrofit.f$a$a, reason: collision with other inner class name */
        public static final class C7633a implements InterfaceC47648d<R> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC47648d<TypedResult<R>> f255129b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a<R> f255130c;

            public C7633a(InterfaceC47648d<TypedResult<R>> interfaceC47648d, a<R> aVar) {
                this.f255129b = interfaceC47648d;
                this.f255130c = aVar;
            }

            @Override // retrofit2.InterfaceC47648d
            public final void onFailure(@Y61.k InterfaceC47646b<R> interfaceC47646b, @Y61.k Throwable th2) {
                a<R> aVar = this.f255130c;
                aVar.getClass();
                this.f255129b.onResponse(aVar, retrofit2.y.c(TypedResultKt.toTyped(com.avito.android.error.z.n(th2))));
            }

            @Override // retrofit2.InterfaceC47648d
            public final void onResponse(@Y61.k InterfaceC47646b<R> interfaceC47646b, @Y61.k retrofit2.y<R> yVar) {
                a<R> aVar = this.f255130c;
                InterfaceC47648d<TypedResult<R>> interfaceC47648d = this.f255129b;
                try {
                    R r12 = yVar.f430119b;
                    if (r12 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    if (aVar.f255128c) {
                        yVar = retrofit2.y.c(new TypedResult.Success(r12));
                    }
                    interfaceC47648d.onResponse(aVar, yVar);
                } catch (Throwable th2) {
                    aVar.getClass();
                    interfaceC47648d.onResponse(aVar, retrofit2.y.c(TypedResultKt.toTyped(com.avito.android.error.z.n(th2))));
                }
            }
        }

        public a(@Y61.k InterfaceC47646b<R> interfaceC47646b, boolean z12) {
            this.f255127b = interfaceC47646b;
            this.f255128c = z12;
        }

        @Override // retrofit2.InterfaceC47646b
        public final void cancel() {
            this.f255127b.cancel();
        }

        @Override // retrofit2.InterfaceC47646b
        public final void enqueue(@Y61.k InterfaceC47648d<TypedResult<R>> interfaceC47648d) {
            this.f255127b.enqueue(new C7633a(interfaceC47648d, this));
        }

        @Override // retrofit2.InterfaceC47646b
        @Y61.k
        public final retrofit2.y<TypedResult<R>> execute() {
            try {
                retrofit2.y<R> yVarExecute = this.f255127b.execute();
                return this.f255128c ? retrofit2.y.c(new TypedResult.Success(yVarExecute.f430119b)) : yVarExecute;
            } catch (Throwable th2) {
                return retrofit2.y.c(TypedResultKt.toTyped(com.avito.android.error.z.n(th2)));
            }
        }

        @Override // retrofit2.InterfaceC47646b
        public final boolean isCanceled() {
            return this.f255127b.isCanceled();
        }

        @Override // retrofit2.InterfaceC47646b
        @Y61.k
        public final Request request() {
            return this.f255127b.request();
        }

        @Override // retrofit2.InterfaceC47646b
        @Y61.k
        public final InterfaceC47646b<TypedResult<R>> clone() {
            return new a(this.f255127b.clone(), this.f255128c);
        }
    }

    /* compiled from: CallAdapterFactoryCoroutines.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/avito/android/retrofit/f$b", "Lretrofit2/c;", "", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.retrofit.f$b */
    public static final class b implements InterfaceC47647c<Object, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f255131a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f255132b;

        public b(Type type, boolean z12) {
            this.f255131a = type;
            this.f255132b = z12;
        }

        @Override // retrofit2.InterfaceC47647c
        public final Object adapt(InterfaceC47646b<Object> interfaceC47646b) {
            return new a(interfaceC47646b, this.f255132b);
        }

        @Override // retrofit2.InterfaceC47647c
        @Y61.k
        /* renamed from: responseType, reason: from getter */
        public final Type getF255131a() {
            return this.f255131a;
        }
    }

    @Inject
    public C34414f() {
    }

    @Override // retrofit2.InterfaceC47647c.a
    @Y61.l
    public final InterfaceC47647c<?, ?> get(@Y61.k Type type, @Y61.k Annotation[] annotationArr, @Y61.k retrofit2.z zVar) {
        if (!InterfaceC47646b.class.equals(InterfaceC47647c.a.getRawType(type))) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException(("return type must be parameterized as Call<TypedResult<<Foo>> but was " + type).toString());
        }
        Type parameterUpperBound = InterfaceC47647c.a.getParameterUpperBound(0, (ParameterizedType) type);
        if (!TypedResult.class.equals(InterfaceC47647c.a.getRawType(parameterUpperBound))) {
            return null;
        }
        if (!(parameterUpperBound instanceof ParameterizedType)) {
            throw new IllegalStateException(("Response must be parameterized as TypedResult<Foo> but was " + parameterUpperBound).toString());
        }
        boolean zC2 = C35983y4.c(annotationArr, ConvertDtoToTyped.class);
        if (zC2) {
            parameterUpperBound = InterfaceC47647c.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
        }
        return new b(parameterUpperBound, zC2);
    }
}
