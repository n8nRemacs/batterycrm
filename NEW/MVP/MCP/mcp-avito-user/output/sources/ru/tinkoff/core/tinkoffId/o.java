package ru.tinkoff.core.tinkoffId;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
import ru.tinkoff.core.tinkoffId.error.TinkoffRequestException;
import zb1.C50544a;

/* compiled from: TinkoffPartnerApiService.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/tinkoff/core/tinkoffId/o;", "", "tinkoff-id_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C50544a f437047a;

    public o(@Y61.k C50544a c50544a) {
        this.f437047a = c50544a;
    }

    public static final void a(o oVar, Response response, Y41.l lVar) throws TinkoffRequestException {
        oVar.getClass();
        if (response.isSuccessful()) {
            return;
        }
        if (response.body() != null) {
            try {
                JSONObject jSONObject = new JSONObject(response.body().string());
                String strOptString = jSONObject.optString("error");
                jSONObject.optString("error_message");
                if (strOptString != null) {
                    ((Number) ((n) lVar).invoke(strOptString)).intValue();
                }
            } catch (JSONException unused) {
            }
        }
        throw new TinkoffRequestException(new IOException("Request problem " + response), "Request exception");
    }
}
