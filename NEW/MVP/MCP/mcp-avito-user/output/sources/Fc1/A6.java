package Fc1;

import feedback.shared.sdk.api.network.entities.GetTogglesResponse;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class A6 extends AbstractC13777y1<GetTogglesResponse> {
    @Override // Fc1.AbstractC13777y1
    public final GetTogglesResponse o(String str) {
        return new GetTogglesResponse(new JSONObject(str).optBoolean("togglesStatus"));
    }
}
