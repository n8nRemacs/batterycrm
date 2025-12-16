package com.avito.android.retrofit;

import kotlin.Metadata;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.InterfaceC47646b;
import retrofit2.InterfaceC47648d;

/* compiled from: NetworkContractsCallAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/G;", "", "R", "Lretrofit2/b;", "_common_network_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class G<R> implements InterfaceC47646b<R> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47646b<R> f255089b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final retrofit2.f<ResponseBody, R> f255090c;

    /* compiled from: NetworkContractsCallAdapter.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/retrofit/G$a", "Lretrofit2/d;", "_common_network_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC47648d<R> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC47648d<R> f255091b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ G<R> f255092c;

        public a(InterfaceC47648d<R> interfaceC47648d, G<R> g12) {
            this.f255091b = interfaceC47648d;
            this.f255092c = g12;
        }

        @Override // retrofit2.InterfaceC47648d
        public final void onFailure(@Y61.k InterfaceC47646b<R> interfaceC47646b, @Y61.k Throwable th2) {
            this.f255091b.onFailure(this.f255092c, th2);
        }

        @Override // retrofit2.InterfaceC47648d
        public final void onResponse(@Y61.k InterfaceC47646b<R> interfaceC47646b, @Y61.k retrofit2.y<R> yVar) {
            InterfaceC47648d<R> interfaceC47648d = this.f255091b;
            G<R> g12 = this.f255092c;
            Response response = yVar.f430118a;
            try {
                if (response.isSuccessful()) {
                    interfaceC47648d.onResponse(g12, yVar);
                    return;
                }
                int iCode = response.code();
                ResponseBody responseBody = yVar.f430120c;
                if (iCode > 500) {
                    if (responseBody != null) {
                        throw new HttpException(retrofit2.y.b(responseBody, response));
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                retrofit2.f<ResponseBody, R> fVar = g12.f255090c;
                if (responseBody == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC47648d.onResponse(g12, retrofit2.y.c(fVar.convert(responseBody)));
            } catch (Exception e12) {
                interfaceC47648d.onFailure(g12, e12);
            }
        }
    }

    public G(@Y61.k InterfaceC47646b<R> interfaceC47646b, @Y61.k retrofit2.f<ResponseBody, R> fVar) {
        this.f255089b = interfaceC47646b;
        this.f255090c = fVar;
    }

    @Override // retrofit2.InterfaceC47646b
    public final void cancel() {
        this.f255089b.cancel();
    }

    @Override // retrofit2.InterfaceC47646b
    public final void enqueue(@Y61.k InterfaceC47648d<R> interfaceC47648d) {
        this.f255089b.enqueue(new a(interfaceC47648d, this));
    }

    @Override // retrofit2.InterfaceC47646b
    public final retrofit2.y<R> execute() {
        return this.f255089b.execute();
    }

    @Override // retrofit2.InterfaceC47646b
    public final boolean isCanceled() {
        return this.f255089b.isCanceled();
    }

    @Override // retrofit2.InterfaceC47646b
    public final Request request() {
        return this.f255089b.request();
    }

    @Override // retrofit2.InterfaceC47646b
    @Y61.k
    public final InterfaceC47646b<R> clone() {
        return new G(this.f255089b, this.f255090c);
    }
}
