package com.vk.push.core.network.utils;

import java.io.IOException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlinx.coroutines.r;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* compiled from: CallHandler.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012#\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\b¨\u0006\t"}, d2 = {"Lcom/vk/push/core/network/utils/e;", "Lokhttp3/Callback;", "Lkotlin/Function1;", "", "Lkotlin/S;", "name", "cause", "Lkotlin/G0;", "Lkotlinx/coroutines/CompletionHandler;", "sdk-public-push-core-network_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
final class e implements Callback, Y41.l<Throwable, G0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Call f367129b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final r f367130c;

    public e(@Y61.k Call call, @Y61.k r rVar) {
        this.f367129b = call;
        this.f367130c = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        try {
            this.f367129b.cancel();
        } catch (Throwable unused) {
        }
        return G0.f406611a;
    }

    @Override // okhttp3.Callback
    public final void onFailure(@Y61.k Call call, @Y61.k IOException iOException) {
        if (call.getCanceled()) {
            return;
        }
        int i12 = Z.f406624c;
        this.f367130c.resumeWith(new Z.b(iOException));
    }

    @Override // okhttp3.Callback
    public final void onResponse(@Y61.k Call call, @Y61.k Response response) {
        int i12 = Z.f406624c;
        this.f367130c.resumeWith(response);
    }
}
