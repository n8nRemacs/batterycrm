package com.avito.android.lib.beduin_v2.network.di;

import Y41.l;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import okhttp3.OkHttpClient;
import retrofit2.z;

/* compiled from: BeduinRetrofitFactoryModule.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lretrofit2/z;", "invoke", "(Lretrofit2/z;)Lretrofit2/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e extends N implements l<z, z> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f176399l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ OkHttpClient f176400m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, OkHttpClient okHttpClient) {
        super(1);
        this.f176399l = str;
        this.f176400m = okHttpClient;
    }

    @Override // Y41.l
    public final z invoke(z zVar) {
        z.b bVar = new z.b(zVar);
        bVar.c(this.f176399l);
        OkHttpClient okHttpClient = this.f176400m;
        Objects.requireNonNull(okHttpClient, "client == null");
        bVar.f430133b = okHttpClient;
        return bVar.e();
    }
}
