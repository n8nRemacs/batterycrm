package com.avito.android.quic.cronet;

import javax.inject.Inject;
import kotlin.Metadata;
import org.chromium.net.CronetEngine;

/* compiled from: CronetInterceptorCreator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/quic/cronet/r;", "Lcom/avito/android/quic/cronet/q;", "<init>", "()V", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class r implements q {
    @Inject
    public r() {
    }

    @Override // com.avito.android.quic.cronet.q
    @Y61.k
    public final com.google.net.cronet.okhttptransport.e a(@Y61.k CronetEngine cronetEngine) {
        return com.google.net.cronet.okhttptransport.e.a(cronetEngine).a();
    }
}
