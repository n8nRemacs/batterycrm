package com.vk.api.sdk.okhttp;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import okhttp3.logging.HttpLoggingInterceptor;

/* compiled from: LoggingInterceptor.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lokhttp3/logging/HttpLoggingInterceptor;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final class e extends N implements Y41.a<HttpLoggingInterceptor> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f366647l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar) {
        super(0);
        this.f366647l = cVar;
    }

    @Override // Y41.a
    public final HttpLoggingInterceptor invoke() {
        return new HttpLoggingInterceptor(new d(this.f366647l));
    }
}
