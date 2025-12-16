package com.avito.android.remote.interceptor;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.Interceptor;

/* compiled from: ServerTimeInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/interceptor/v0;", "Lokhttp3/Interceptor;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.interceptor.v0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C34312v0 implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.c f253549b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.a f253550c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f253551d;

    public C34312v0(@Y61.k com.avito.android.server_time.c cVar, @Y61.k com.avito.android.server_time.a aVar, boolean z12) {
        this.f253549b = cVar;
        this.f253550c = aVar;
        this.f253551d = z12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        r1 = kotlin.G0.f406611a;
     */
    @Override // okhttp3.Interceptor
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response intercept(@Y61.k okhttp3.Interceptor.Chain r13) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.interceptor.C34312v0.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    public /* synthetic */ C34312v0(com.avito.android.server_time.c cVar, com.avito.android.server_time.a aVar, boolean z12, int i12, C42822w c42822w) {
        this(cVar, aVar, (i12 & 4) != 0 ? false : z12);
    }
}
