package com.avito.android.retrofit;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Pretend;
import com.avito.android.util.C35983y4;
import e30.InterfaceC39938c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.i0;
import retrofit2.HttpException;

/* compiled from: CallWrapperAnalyticsDispatcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/retrofit/o;", "Lcom/avito/android/retrofit/n;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.retrofit.o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C34423o implements InterfaceC34422n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.analytics.B f255152a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.a f255153b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f255154c;

    /* compiled from: CallWrapperAnalyticsDispatcher.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/retrofit/o$a;", "Lokhttp3/Call;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.retrofit.o$a */
    public final class a implements Call {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Request f255155b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Call f255156c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Annotation[] f255157d;

        /* compiled from: CallWrapperAnalyticsDispatcher.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lokhttp3/Request;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.retrofit.o$a$a, reason: collision with other inner class name */
        public static final class C7635a extends kotlin.jvm.internal.N implements Y41.a<Request> {
            public C7635a() {
                super(0);
            }

            @Override // Y41.a
            public final Request invoke() {
                return a.this.f255155b;
            }
        }

        /* compiled from: CallWrapperAnalyticsDispatcher.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/retrofit/o$a$b", "Lokhttp3/Callback;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.retrofit.o$a$b */
        public static final class b implements Callback {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Callback f255161c;

            public b(Callback callback) {
                this.f255161c = callback;
            }

            @Override // okhttp3.Callback
            public final void onFailure(@Y61.k Call call, @Y61.k IOException iOException) {
                a aVar = a.this;
                aVar.a(aVar.f(iOException), iOException);
                this.f255161c.onFailure(call, iOException);
            }

            @Override // okhttp3.Callback
            public final void onResponse(@Y61.k Call call, @Y61.k Response response) {
                a.this.b(response);
                this.f255161c.onResponse(call, response);
            }
        }

        public a(@Y61.k Request request, @Y61.k Call call, @Y61.k Annotation[] annotationArr) {
            this.f255155b = request;
            this.f255156c = call;
            this.f255157d = annotationArr;
        }

        public final void a(ApiError apiError, Throwable th2) {
            C34423o c34423o = C34423o.this;
            try {
                c34423o.f255152a.d(new C7635a(), this.f255157d, B.a(th2 instanceof HttpException ? (HttpException) th2 : null), th2, apiError);
            } catch (Throwable th3) {
                c34423o.f255154c.c(new NonFatalErrorEvent("Failure during pass responses", th3, null, null, 12, null));
            }
        }

        public final void b(Response response) {
            C34423o c34423o = C34423o.this;
            try {
                ResponseBody responseBodyBody = response.body();
                boolean zIsSuccessful = response.isSuccessful();
                Annotation[] annotationArr = this.f255157d;
                if (zIsSuccessful) {
                    c34423o.f255152a.c(new C34424p(this), annotationArr);
                } else if (responseBodyBody == null) {
                    a(null, new IOException("null response body"));
                } else {
                    if (C35983y4.c(annotationArr, InterfaceC39938c.class)) {
                        return;
                    }
                    HttpException httpException = new HttpException(retrofit2.y.b(responseBodyBody, response));
                    ApiError apiErrorF = f(httpException);
                    if (apiErrorF != null) {
                        a(apiErrorF, httpException);
                    } else {
                        c34423o.f255152a.c(new C34424p(this), annotationArr);
                    }
                }
            } catch (Throwable th2) {
                c34423o.f255154c.c(new NonFatalErrorEvent("Failure during pass responses", th2, null, null, 12, null));
            }
        }

        @Override // okhttp3.Call
        public final void cancel() {
            this.f255156c.cancel();
        }

        @Override // okhttp3.Call
        @Y61.k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final a clone() {
            return C34423o.this.new a(this.f255155b, this.f255156c.clone(), this.f255157d);
        }

        @Override // okhttp3.Call
        public final void enqueue(@Y61.k Callback callback) {
            this.f255156c.enqueue(new b(callback));
        }

        @Override // okhttp3.Call
        @Y61.k
        public final Response execute() {
            try {
                Response responseExecute = this.f255156c.execute();
                b(responseExecute);
                return responseExecute;
            } catch (Throwable th2) {
                a(f(th2), th2);
                throw th2;
            }
        }

        public final ApiError f(Throwable th2) {
            boolean z12;
            String strEncodedPath = this.f255155b.url().encodedPath();
            com.avito.android.remote.error.a aVar = C34423o.this.f255153b;
            Annotation[] annotationArr = this.f255157d;
            int length = annotationArr.length;
            boolean z13 = false;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    z12 = false;
                    break;
                }
                if (annotationArr[i12] instanceof Pretend) {
                    z12 = true;
                    break;
                }
                i12++;
            }
            int length2 = annotationArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length2) {
                    break;
                }
                if (annotationArr[i13] instanceof InterfaceC39938c) {
                    z13 = true;
                    break;
                }
                i13++;
            }
            return aVar.b(th2, strEncodedPath, z12, z13);
        }

        @Override // okhttp3.Call
        /* renamed from: isCanceled */
        public final boolean getCanceled() {
            return this.f255156c.getCanceled();
        }

        @Override // okhttp3.Call
        public final boolean isExecuted() {
            return this.f255156c.isExecuted();
        }

        @Override // okhttp3.Call
        @Y61.k
        public final Request request() {
            return this.f255156c.request();
        }

        @Override // okhttp3.Call
        @Y61.k
        public final i0 timeout() {
            return this.f255156c.timeout();
        }
    }

    @Inject
    public C34423o(@Y61.k com.avito.android.remote.analytics.B b12, @Y61.k com.avito.android.remote.error.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f255152a = b12;
        this.f255153b = aVar;
        this.f255154c = interfaceC28373a;
    }
}
