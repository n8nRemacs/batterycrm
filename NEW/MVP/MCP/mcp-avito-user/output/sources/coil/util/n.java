package coil.util;

import java.io.IOException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* compiled from: Calls.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012#\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\b¨\u0006\t"}, d2 = {"Lcoil/util/n;", "Lokhttp3/Callback;", "Lkotlin/Function1;", "", "Lkotlin/S;", "name", "cause", "Lkotlin/G0;", "Lkotlinx/coroutines/CompletionHandler;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class n implements Callback, Y41.l<Throwable, G0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Call f58785b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.r f58786c;

    public n(@Y61.k Call call, @Y61.k kotlinx.coroutines.r rVar) {
        this.f58785b = call;
        this.f58786c = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        try {
            this.f58785b.cancel();
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
        this.f58786c.resumeWith(new Z.b(iOException));
    }

    @Override // okhttp3.Callback
    public final void onResponse(@Y61.k Call call, @Y61.k Response response) {
        int i12 = Z.f406624c;
        this.f58786c.resumeWith(response);
    }
}
