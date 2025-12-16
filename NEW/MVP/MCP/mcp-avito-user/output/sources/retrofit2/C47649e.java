package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.InterfaceC47647c;

/* compiled from: CompletableFutureCallAdapterFactory.java */
@IgnoreJRERequirement
/* renamed from: retrofit2.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C47649e extends InterfaceC47647c.a {

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC47647c.a f429984b = new C47649e();

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    /* renamed from: retrofit2.e$a */
    public static final class a<R> implements InterfaceC47647c<R, CompletableFuture<R>> {

        /* renamed from: a, reason: collision with root package name */
        public final Type f429985a;

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        @IgnoreJRERequirement
        /* renamed from: retrofit2.e$a$a, reason: collision with other inner class name */
        public class C12389a implements InterfaceC47648d<R> {

            /* renamed from: b, reason: collision with root package name */
            public final CompletableFuture<R> f429986b;

            public C12389a(CompletableFuture completableFuture) {
                this.f429986b = completableFuture;
            }

            @Override // retrofit2.InterfaceC47648d
            public final void onFailure(InterfaceC47646b<R> interfaceC47646b, Throwable th2) {
                this.f429986b.completeExceptionally(th2);
            }

            @Override // retrofit2.InterfaceC47648d
            public final void onResponse(InterfaceC47646b<R> interfaceC47646b, y<R> yVar) {
                boolean zIsSuccessful = yVar.f430118a.isSuccessful();
                CompletableFuture<R> completableFuture = this.f429986b;
                if (zIsSuccessful) {
                    completableFuture.complete(yVar.f430119b);
                } else {
                    completableFuture.completeExceptionally(new HttpException(yVar));
                }
            }
        }

        public a(Type type) {
            this.f429985a = type;
        }

        @Override // retrofit2.InterfaceC47647c
        public final Object adapt(InterfaceC47646b interfaceC47646b) {
            b bVar = new b(interfaceC47646b);
            interfaceC47646b.enqueue(new C12389a(bVar));
            return bVar;
        }

        @Override // retrofit2.InterfaceC47647c
        /* renamed from: responseType */
        public final Type getF255138b() {
            return this.f429985a;
        }
    }

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    /* renamed from: retrofit2.e$b */
    public static final class b<T> extends CompletableFuture<T> {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC47646b<?> f429987b;

        public b(InterfaceC47646b<?> interfaceC47646b) {
            this.f429987b = interfaceC47646b;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z12) {
            if (z12) {
                this.f429987b.cancel();
            }
            return super.cancel(z12);
        }
    }

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    /* renamed from: retrofit2.e$c */
    public static final class c<R> implements InterfaceC47647c<R, CompletableFuture<y<R>>> {

        /* renamed from: a, reason: collision with root package name */
        public final Type f429988a;

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        @IgnoreJRERequirement
        /* renamed from: retrofit2.e$c$a */
        public class a implements InterfaceC47648d<R> {

            /* renamed from: b, reason: collision with root package name */
            public final CompletableFuture<y<R>> f429989b;

            public a(CompletableFuture completableFuture) {
                this.f429989b = completableFuture;
            }

            @Override // retrofit2.InterfaceC47648d
            public final void onFailure(InterfaceC47646b<R> interfaceC47646b, Throwable th2) {
                this.f429989b.completeExceptionally(th2);
            }

            @Override // retrofit2.InterfaceC47648d
            public final void onResponse(InterfaceC47646b<R> interfaceC47646b, y<R> yVar) {
                this.f429989b.complete(yVar);
            }
        }

        public c(Type type) {
            this.f429988a = type;
        }

        @Override // retrofit2.InterfaceC47647c
        public final Object adapt(InterfaceC47646b interfaceC47646b) {
            b bVar = new b(interfaceC47646b);
            interfaceC47646b.enqueue(new a(bVar));
            return bVar;
        }

        @Override // retrofit2.InterfaceC47647c
        /* renamed from: responseType */
        public final Type getF255138b() {
            return this.f429988a;
        }
    }

    @Override // retrofit2.InterfaceC47647c.a
    @I41.h
    public final InterfaceC47647c<?, ?> get(Type type, Annotation[] annotationArr, z zVar) {
        if (InterfaceC47647c.a.getRawType(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type parameterUpperBound = InterfaceC47647c.a.getParameterUpperBound(0, (ParameterizedType) type);
        if (InterfaceC47647c.a.getRawType(parameterUpperBound) != y.class) {
            return new a(parameterUpperBound);
        }
        if (parameterUpperBound instanceof ParameterizedType) {
            return new c(InterfaceC47647c.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
