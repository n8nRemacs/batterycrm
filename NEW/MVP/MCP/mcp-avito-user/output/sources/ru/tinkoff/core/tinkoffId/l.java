package ru.tinkoff.core.tinkoffId;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Response;
import ru.tinkoff.core.tinkoffId.error.TinkoffRequestException;

/* compiled from: TinkoffPartnerApiService.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lru/tinkoff/core/tinkoffId/l;", "Lru/tinkoff/core/tinkoffId/d;", "tinkoff-id_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class l implements d<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Call f437041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f437042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, Integer> f437043c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Response, Object> f437044d;

    /* JADX WARN: Multi-variable type inference failed */
    public l(Call call, o oVar, Y41.l<? super String, Integer> lVar, Y41.l<? super Response, Object> lVar2) {
        this.f437041a = call;
        this.f437042b = oVar;
        this.f437043c = lVar;
        this.f437044d = lVar2;
    }

    public final Object a() throws Exception {
        try {
            Response responseExecute = this.f437041a.execute();
            o.a(this.f437042b, responseExecute, this.f437043c);
            if (responseExecute.isSuccessful()) {
                return ((m) this.f437044d).invoke(responseExecute);
            }
            throw new IOException("Unexpected response " + responseExecute);
        } catch (Exception e12) {
            if (e12 instanceof TinkoffRequestException) {
                throw e12;
            }
            throw new TinkoffRequestException(e12, null, null, 6, null);
        }
    }
}
