package com.avito.android.retrofit;

import java.lang.reflect.Type;
import kotlin.Metadata;
import okhttp3.Request;
import retrofit2.InterfaceC47646b;
import retrofit2.InterfaceC47647c;
import retrofit2.InterfaceC47648d;

/* compiled from: ErrorCatchingRetrofitCallAdapter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/retrofit/A;", "", "T", "K", "Lretrofit2/c;", "a", "b", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class A<T, K> implements InterfaceC47647c<T, K> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47647c<T, K> f255079a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.p<InterfaceC47646b<T>, Throwable, Throwable> f255080b;

    /* compiled from: ErrorCatchingRetrofitCallAdapter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/retrofit/A$a;", "T", "Lretrofit2/b;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a<T> implements InterfaceC47646b<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC47646b<T> f255081b;

        public a(@Y61.k InterfaceC47646b<T> interfaceC47646b) {
            this.f255081b = interfaceC47646b;
        }

        @Override // retrofit2.InterfaceC47646b
        public final void cancel() {
            this.f255081b.cancel();
        }

        @Override // 
        @Y61.k
        public InterfaceC47646b<T> clone() {
            return this.f255081b.clone();
        }

        @Override // retrofit2.InterfaceC47646b
        public void enqueue(InterfaceC47648d<T> interfaceC47648d) {
            this.f255081b.enqueue(interfaceC47648d);
        }

        @Override // retrofit2.InterfaceC47646b
        public retrofit2.y<T> execute() {
            return this.f255081b.execute();
        }

        @Override // retrofit2.InterfaceC47646b
        public final boolean isCanceled() {
            return this.f255081b.isCanceled();
        }

        @Override // retrofit2.InterfaceC47646b
        public final Request request() {
            return this.f255081b.request();
        }
    }

    /* compiled from: ErrorCatchingRetrofitCallAdapter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/retrofit/A$b;", "T", "Lcom/avito/android/retrofit/A$a;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b<T> extends a<T> {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Y41.p<InterfaceC47646b<T>, Throwable, Throwable> f255082c;

        /* compiled from: ErrorCatchingRetrofitCallAdapter.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/retrofit/A$b$a", "Lretrofit2/d;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC47648d<T> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC47648d<T> f255083b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b<T> f255084c;

            public a(InterfaceC47648d<T> interfaceC47648d, b<T> bVar) {
                this.f255083b = interfaceC47648d;
                this.f255084c = bVar;
            }

            @Override // retrofit2.InterfaceC47648d
            public final void onFailure(@Y61.k InterfaceC47646b<T> interfaceC47646b, @Y61.k Throwable th2) {
                this.f255083b.onFailure(interfaceC47646b, this.f255084c.f255082c.invoke(interfaceC47646b, th2));
            }

            @Override // retrofit2.InterfaceC47648d
            public final void onResponse(@Y61.k InterfaceC47646b<T> interfaceC47646b, @Y61.k retrofit2.y<T> yVar) {
                this.f255083b.onResponse(interfaceC47646b, yVar);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k InterfaceC47646b<T> interfaceC47646b, @Y61.k Y41.p<? super InterfaceC47646b<T>, ? super Throwable, ? extends Throwable> pVar) {
            super(interfaceC47646b);
            this.f255082c = pVar;
        }

        @Override // com.avito.android.retrofit.A.a, retrofit2.InterfaceC47646b
        public final void enqueue(@Y61.k InterfaceC47648d<T> interfaceC47648d) {
            super.enqueue(new a(interfaceC47648d, this));
        }

        @Override // com.avito.android.retrofit.A.a, retrofit2.InterfaceC47646b
        @Y61.k
        public final retrofit2.y<T> execute() throws Throwable {
            try {
                return super.execute();
            } catch (Exception e12) {
                throw this.f255082c.invoke(this, e12);
            }
        }

        @Override // com.avito.android.retrofit.A.a
        @Y61.k
        public final InterfaceC47646b<T> clone() {
            return new b(this.f255081b.clone(), this.f255082c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public A(@Y61.k InterfaceC47647c<T, K> interfaceC47647c, @Y61.k Y41.p<? super InterfaceC47646b<T>, ? super Throwable, ? extends Throwable> pVar) {
        this.f255079a = interfaceC47647c;
        this.f255080b = pVar;
    }

    @Override // retrofit2.InterfaceC47647c
    @Y61.k
    public final K adapt(@Y61.k InterfaceC47646b<T> interfaceC47646b) {
        return this.f255079a.adapt(new b(interfaceC47646b, this.f255080b));
    }

    @Override // retrofit2.InterfaceC47647c
    @Y61.k
    /* renamed from: responseType */
    public final Type getF255131a() {
        return this.f255079a.getF255131a();
    }
}
