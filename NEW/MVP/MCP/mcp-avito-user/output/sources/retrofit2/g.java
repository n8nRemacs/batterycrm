package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.Request;
import retrofit2.InterfaceC47647c;

/* compiled from: DefaultCallAdapterFactory.java */
/* loaded from: classes9.dex */
final class g extends InterfaceC47647c.a {

    /* renamed from: b, reason: collision with root package name */
    @I41.h
    public final Executor f429990b;

    /* compiled from: DefaultCallAdapterFactory.java */
    public class a implements InterfaceC47647c<Object, InterfaceC47646b<?>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f429991a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Executor f429992b;

        public a(Type type, Executor executor) {
            this.f429991a = type;
            this.f429992b = executor;
        }

        @Override // retrofit2.InterfaceC47647c
        public final InterfaceC47646b<?> adapt(InterfaceC47646b<Object> interfaceC47646b) {
            Executor executor = this.f429992b;
            return executor == null ? interfaceC47646b : new b(executor, interfaceC47646b);
        }

        @Override // retrofit2.InterfaceC47647c
        /* renamed from: responseType */
        public final Type getSuccessType() {
            return this.f429991a;
        }
    }

    /* compiled from: DefaultCallAdapterFactory.java */
    public static final class b<T> implements InterfaceC47646b<T> {

        /* renamed from: b, reason: collision with root package name */
        public final Executor f429993b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC47646b<T> f429994c;

        /* compiled from: DefaultCallAdapterFactory.java */
        public class a implements InterfaceC47648d<T> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC47648d f429995b;

            public a(InterfaceC47648d interfaceC47648d) {
                this.f429995b = interfaceC47648d;
            }

            @Override // retrofit2.InterfaceC47648d
            public final void onFailure(InterfaceC47646b<T> interfaceC47646b, Throwable th2) {
                b.this.f429993b.execute(new h(this, this.f429995b, th2, 1));
            }

            @Override // retrofit2.InterfaceC47648d
            public final void onResponse(InterfaceC47646b<T> interfaceC47646b, y<T> yVar) {
                b.this.f429993b.execute(new h(this, this.f429995b, yVar, 0));
            }
        }

        public b(Executor executor, InterfaceC47646b<T> interfaceC47646b) {
            this.f429993b = executor;
            this.f429994c = interfaceC47646b;
        }

        @Override // retrofit2.InterfaceC47646b
        public final void cancel() {
            this.f429994c.cancel();
        }

        @Override // retrofit2.InterfaceC47646b
        public final void enqueue(InterfaceC47648d<T> interfaceC47648d) {
            this.f429994c.enqueue(new a(interfaceC47648d));
        }

        @Override // retrofit2.InterfaceC47646b
        public final y<T> execute() {
            return this.f429994c.execute();
        }

        @Override // retrofit2.InterfaceC47646b
        public final boolean isCanceled() {
            return this.f429994c.isCanceled();
        }

        @Override // retrofit2.InterfaceC47646b
        public final Request request() {
            return this.f429994c.request();
        }

        @Override // retrofit2.InterfaceC47646b
        public final InterfaceC47646b<T> clone() {
            return new b(this.f429993b, this.f429994c.clone());
        }
    }

    public g(@I41.h Executor executor) {
        this.f429990b = executor;
    }

    @Override // retrofit2.InterfaceC47647c.a
    @I41.h
    public final InterfaceC47647c<?, ?> get(Type type, Annotation[] annotationArr, z zVar) {
        if (InterfaceC47647c.a.getRawType(type) != InterfaceC47646b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(D.d(0, (ParameterizedType) type), D.h(annotationArr, B.class) ? null : this.f429990b);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
