package ru.tinkoff.core.tinkoffId;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import ru.tinkoff.core.tinkoffId.error.TinkoffRequestException;

/* compiled from: TinkoffPartnerApiService.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokhttp3/Response;", "it", "Lru/tinkoff/core/tinkoffId/p;", "invoke", "(Lokhttp3/Response;)Lru/tinkoff/core/tinkoffId/p;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes9.dex */
final class m extends N implements Y41.l<Response, p> {

    /* renamed from: l, reason: collision with root package name */
    public static final m f437045l = new m();

    public m() {
        super(1);
    }

    @Override // Y41.l
    public final p invoke(Response response) throws TinkoffRequestException {
        Response response2 = response;
        if (response2.body() == null) {
            throw new TinkoffRequestException(new IOException("Empty body " + response2), null, null, 6, null);
        }
        ResponseBody responseBodyBody = response2.body();
        if (responseBodyBody == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        JSONObject jSONObject = new JSONObject(responseBodyBody.string());
        return new p(jSONObject.getString("access_token"), jSONObject.getInt("expires_in"), jSONObject.optString("id_token"), jSONObject.getString("refresh_token"));
    }
}
