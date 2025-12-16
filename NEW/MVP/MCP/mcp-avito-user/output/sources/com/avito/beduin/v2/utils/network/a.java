package com.avito.beduin.v2.utils.network;

import com.avito.beduin.v2.logger.LogLevel;
import com.avito.beduin.v2.utils.network.b;
import okhttp3.logging.HttpLoggingInterceptor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements HttpLoggingInterceptor.Logger {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f338455a;

    @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
    public final void log(String str) {
        b.a aVar = b.f338456e;
        if (this.f338455a) {
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (1 >= RU0.b.f14469c) {
                RU0.b.f14468b.d(RU0.b.f14470d + ":OkHttp", str);
            }
        }
    }
}
