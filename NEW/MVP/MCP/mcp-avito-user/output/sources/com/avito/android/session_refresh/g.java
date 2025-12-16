package com.avito.android.session_refresh;

import kotlin.Metadata;
import kotlin.jvm.internal.H;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: SessionInterceptorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class g extends H implements Y41.l<Request, Response> {
    @Override // Y41.l
    public final Response invoke(Request request) {
        return ((Interceptor.Chain) this.receiver).proceed(request);
    }
}
