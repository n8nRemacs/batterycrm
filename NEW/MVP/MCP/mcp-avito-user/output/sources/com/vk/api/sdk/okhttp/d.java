package com.vk.api.sdk.okhttp;

import com.vk.api.sdk.utils.log.Logger;
import kotlin.Metadata;
import kotlin.text.C43059p;
import okhttp3.logging.HttpLoggingInterceptor;

/* compiled from: LoggingInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/api/sdk/okhttp/d;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class d implements HttpLoggingInterceptor.Logger {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f366646a;

    public d(c cVar) {
        this.f366646a = cVar;
    }

    @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
    public final void log(@Y61.k String str) {
        c cVar = this.f366646a;
        if (cVar.f366638b) {
            ((C43059p) cVar.f366643g.getValue()).g(((C43059p) cVar.f366641e.getValue()).g(str, (Y41.l) cVar.f366642f.getValue()), (Y41.l) cVar.f366644h.getValue());
        }
        Logger logger = cVar.f366640d;
        logger.a(logger.b().getValue());
    }
}
