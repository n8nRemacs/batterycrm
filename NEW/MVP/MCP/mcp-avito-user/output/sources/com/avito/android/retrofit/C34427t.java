package com.avito.android.retrofit;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.remote.error.ApiError;
import java.io.IOException;
import javax.inject.Inject;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okio.i0;

/* compiled from: CallWrapperApiErrorsDispatcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/retrofit/t;", "Lcom/avito/android/retrofit/n;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.retrofit.t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C34427t implements InterfaceC34422n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34410b f255183a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f255184b;

    /* compiled from: CallWrapperApiErrorsDispatcher.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/retrofit/t$a;", "Lokhttp3/Call;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.retrofit.t$a */
    public final class a implements Call {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Request f255185b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Call f255186c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final retrofit2.j f255187d;

        /* compiled from: CallWrapperApiErrorsDispatcher.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/retrofit/t$a$a", "Lokhttp3/Callback;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.retrofit.t$a$a, reason: collision with other inner class name */
        public static final class C7637a implements Callback {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Callback f255189b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f255190c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ C34427t f255191d;

            public C7637a(Callback callback, a aVar, C34427t c34427t) {
                this.f255189b = callback;
                this.f255190c = aVar;
                this.f255191d = c34427t;
            }

            @Override // okhttp3.Callback
            public final void onFailure(@Y61.k Call call, @Y61.k IOException iOException) {
                InterfaceC34410b interfaceC34410b = this.f255191d.f255183a;
                a aVar = this.f255190c;
                aVar.a(interfaceC34410b, iOException);
                this.f255189b.onFailure(aVar, iOException);
            }

            @Override // okhttp3.Callback
            public final void onResponse(@Y61.k Call call, @Y61.k Response response) {
                this.f255189b.onResponse(this.f255190c, response);
            }
        }

        public a(@Y61.k Request request, @Y61.k Call call, @Y61.k retrofit2.j jVar) {
            this.f255185b = request;
            this.f255186c = call;
            this.f255187d = jVar;
        }

        public final void a(InterfaceC34410b interfaceC34410b, IOException iOException) {
            try {
                ApiError apiErrorM = com.avito.android.error.z.m(iOException);
                if (apiErrorM == null) {
                    return;
                }
                interfaceC34410b.a(apiErrorM, this.f255186c.request().url().encodedPath());
            } catch (Throwable th2) {
                C34427t.this.f255184b.c(new NonFatalErrorEvent("Unexpected error till handling error", th2, null, null, 12, null));
            }
        }

        @Override // okhttp3.Call
        public final void cancel() {
            this.f255186c.cancel();
        }

        public final Object clone() {
            Call callMo59clone = this.f255186c.mo59clone();
            retrofit2.j jVar = this.f255187d;
            return C34427t.this.new a(this.f255185b, callMo59clone, jVar);
        }

        @Override // okhttp3.Call
        public final void enqueue(@Y61.k Callback callback) {
            this.f255186c.enqueue(new C7637a(callback, this, C34427t.this));
        }

        @Override // okhttp3.Call
        @Y61.k
        public final Response execute() throws IOException {
            try {
                return this.f255186c.execute();
            } catch (IOException e12) {
                a(C34427t.this.f255183a, e12);
                throw e12;
            }
        }

        @Override // okhttp3.Call
        public final boolean isCanceled() {
            return this.f255186c.isCanceled();
        }

        @Override // okhttp3.Call
        public final boolean isExecuted() {
            return this.f255186c.isExecuted();
        }

        @Override // okhttp3.Call
        @Y61.k
        public final Request request() {
            return this.f255186c.request();
        }

        @Override // okhttp3.Call
        @Y61.k
        public final i0 timeout() {
            return this.f255186c.timeout();
        }

        @Override // okhttp3.Call
        /* renamed from: clone */
        public final Call mo59clone() {
            Call callMo59clone = this.f255186c.mo59clone();
            retrofit2.j jVar = this.f255187d;
            return C34427t.this.new a(this.f255185b, callMo59clone, jVar);
        }
    }

    @Inject
    public C34427t(@Y61.k InterfaceC34410b interfaceC34410b, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f255183a = interfaceC34410b;
        this.f255184b = interfaceC28373a;
    }
}
