package com.avito.android.messenger.connection;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.connection.n;
import com.avito.android.messenger.connection.n.a;
import com.avito.android.util.V2;
import hz.InterfaceC41196a;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.G;
import java.util.concurrent.Callable;
import jz.InterfaceC42451b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.rx3.y;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import ru.avito.messenger.j0;

/* compiled from: AvitoMessengerSessionRefresher.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/connection/n;", "Lru/avito/messenger/j0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n implements j0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.session_refresh.l f188866a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<OkHttpClient> f188867b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC41196a> f188868c;

    /* compiled from: AvitoMessengerSessionRefresher.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<Request, Response> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Response invoke(Request request) {
            return n.this.f188867b.get().newCall(request).execute();
        }
    }

    public n(@Y61.k com.avito.android.session_refresh.l lVar, @Y61.k h31.e<OkHttpClient> eVar, @Y61.k h31.e<InterfaceC41196a> eVar2) {
        this.f188866a = lVar;
        this.f188867b = eVar;
        this.f188868c = eVar2;
    }

    @Override // ru.avito.messenger.j0
    @Y61.k
    public final I<Boolean> a(@Y61.k final String str, @Y61.l final String str2) {
        return new G(new Callable() { // from class: com.avito.android.messenger.connection.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                V2.f318762a.i("MessengerSessionRefresher", "Refreshing session...", null);
                n nVar = this.f188862b;
                n.a aVar = nVar.new a();
                return Boolean.valueOf(nVar.f188866a.a(aVar, str, str2));
            }
        }).n(new l41.o() { // from class: com.avito.android.messenger.connection.n.b
            @Override // l41.o
            public final Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                h31.e<InterfaceC41196a> eVar = n.this.f188868c;
                return L.f(eVar.get().a(), InterfaceC42451b.C11596b.f405967a) ? y.b(eVar.get().o()).S().u(new com.avito.android.analytics.clickstream.I(5)).r(new m(zBooleanValue)) : I.q(bool);
            }
        });
    }
}
