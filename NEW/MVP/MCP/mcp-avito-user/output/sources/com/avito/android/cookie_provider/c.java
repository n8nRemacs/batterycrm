package com.avito.android.cookie_provider;

import Y61.k;
import com.avito.android.util.G0;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CookieExpiredTime.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cookie_provider/c;", "Lcom/avito/android/cookie_provider/b;", "_avito_cookie-provider_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.server_time.f f126171a;

    @Inject
    public c(@k com.avito.android.server_time.f fVar) {
        this.f126171a = fVar;
    }

    @Override // com.avito.android.cookie_provider.b
    @k
    public final String O() {
        return G0.a(new Date(this.f126171a.now()), 6).toString();
    }
}
