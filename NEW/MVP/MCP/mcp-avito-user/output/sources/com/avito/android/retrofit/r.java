package com.avito.android.retrofit;

import com.avito.android.di.module.T9;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Pretend;
import com.avito.android.retrofit.error.WrappedDiagnosticsException;
import com.avito.android.util.C35936s;
import com.avito.android.util.C35983y4;
import com.google.gson.Gson;
import e30.InterfaceC39938c;
import j.k0;
import java.io.IOException;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okio.i0;

/* compiled from: CallWrapperApiErrorConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/retrofit/r;", "Lcom/avito/android/retrofit/n;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r implements InterfaceC34422n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.k f255167a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.a f255168b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Gson f255169c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Gson f255170d;

    /* compiled from: CallWrapperApiErrorConverter.kt */
    @k0
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/retrofit/r$a;", "Lokhttp3/Call;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a implements Call {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Request f255171b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Call f255172c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final retrofit2.j f255173d;

        /* compiled from: CallWrapperApiErrorConverter.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/retrofit/r$a$a", "Lokhttp3/Callback;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.retrofit.r$a$a, reason: collision with other inner class name */
        public static final class C7636a implements Callback {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Callback f255176c;

            public C7636a(Callback callback) {
                this.f255176c = callback;
            }

            @Override // okhttp3.Callback
            public final void onFailure(@Y61.k Call call, @Y61.k IOException iOException) {
                this.f255176c.onFailure(call, a.this.b(iOException));
            }

            @Override // okhttp3.Callback
            public final void onResponse(@Y61.k Call call, @Y61.k Response response) {
                Callback callback = this.f255176c;
                a aVar = a.this;
                try {
                    aVar.a(response);
                    callback.onResponse(aVar, response);
                } catch (Throwable th2) {
                    IOException iOExceptionB = aVar.b(th2);
                    Headers headers = response.headers();
                    String str = headers != null ? headers.get("x-diagnostic-context") : null;
                    Headers headers2 = response.headers();
                    String str2 = headers2 != null ? headers2.get("x-diagnostic-context-id") : null;
                    if (str != null || str2 != null) {
                        iOExceptionB = new WrappedDiagnosticsException(str, str2, iOExceptionB);
                    }
                    callback.onFailure(call, iOExceptionB);
                }
            }
        }

        public a(@Y61.k Request request, @Y61.k Call call, @Y61.k retrofit2.j jVar) {
            this.f255171b = request;
            this.f255172c = call;
            this.f255173d = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01b6 A[Catch: Exception -> 0x0041, TryCatch #3 {Exception -> 0x0041, blocks: (B:73:0x016a, B:87:0x01ad, B:89:0x01b6, B:91:0x01d1, B:93:0x01da, B:95:0x01e5, B:94:0x01e1, B:100:0x01fd, B:101:0x0200, B:74:0x0178, B:77:0x0187, B:78:0x018a, B:80:0x0190, B:82:0x0198, B:84:0x01a4, B:85:0x01a9, B:98:0x01fb), top: B:113:0x016a, inners: #0, #1 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(okhttp3.Response r11) throws java.lang.NoSuchMethodException, java.io.IOException, java.lang.SecurityException {
            /*
                Method dump skipped, instructions count: 526
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.retrofit.r.a.a(okhttp3.Response):void");
        }

        public final IOException b(Throwable th2) {
            String strEncodedPath = this.f255172c.request().url().encodedPath();
            Method method = this.f255173d.f430007a;
            ApiError apiErrorB = r.this.f255168b.b(th2, strEncodedPath, C35983y4.c(method.getAnnotations(), Pretend.class), C35983y4.c(method.getAnnotations(), InterfaceC39938c.class));
            return apiErrorB != null ? new IOException(C35936s.a(apiErrorB, th2)) : new IOException(th2);
        }

        @Override // okhttp3.Call
        public final void cancel() {
            this.f255172c.cancel();
        }

        public final Object clone() {
            Call callClone = this.f255172c.clone();
            retrofit2.j jVar = this.f255173d;
            return r.this.new a(this.f255171b, callClone, jVar);
        }

        @Override // okhttp3.Call
        public final void enqueue(@Y61.k Callback callback) {
            this.f255172c.enqueue(new C7636a(callback));
        }

        @Override // okhttp3.Call
        @Y61.k
        public final Response execute() throws IOException {
            try {
                Response responseExecute = this.f255172c.execute();
                a(responseExecute);
                return responseExecute;
            } catch (Throwable th2) {
                throw b(th2);
            }
        }

        @Override // okhttp3.Call
        /* renamed from: isCanceled */
        public final boolean getCanceled() {
            return this.f255172c.getCanceled();
        }

        @Override // okhttp3.Call
        /* renamed from: isExecuted */
        public final boolean getIsExecuted() {
            return this.f255172c.getIsExecuted();
        }

        @Override // okhttp3.Call
        @Y61.k
        public final Request request() {
            return this.f255172c.request();
        }

        @Override // okhttp3.Call
        @Y61.k
        public final i0 timeout() {
            return this.f255172c.timeout();
        }

        @Override // okhttp3.Call
        public final Call clone() {
            Call callClone = this.f255172c.clone();
            retrofit2.j jVar = this.f255173d;
            return r.this.new a(this.f255171b, callClone, jVar);
        }
    }

    @Inject
    public r(@Y61.k com.avito.android.remote.error.k kVar, @Y61.k com.avito.android.remote.error.a aVar, @Y61.k Gson gson, @Y61.k @T9 Gson gson2) {
        this.f255167a = kVar;
        this.f255168b = aVar;
        this.f255169c = gson;
        this.f255170d = gson2;
    }
}
