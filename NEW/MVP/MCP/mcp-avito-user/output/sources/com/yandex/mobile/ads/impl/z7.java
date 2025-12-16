package com.yandex.mobile.ads.impl;

import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class z7 implements InterfaceC39353p {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final bc1 f392196a;

    public z7(@j.N bc1 bc1Var) {
        this.f392196a = bc1Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39353p
    @j.N
    public final AbstractC39344m a(@j.N JSONObject jSONObject) throws JSONException, yk0 {
        String strA = mm0.a("type", jSONObject);
        this.f392196a.getClass();
        String strA2 = bc1.a(ContextActionHandler.Link.URL, jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            arrayList.add(jSONArray.getString(i12));
        }
        return new x7(strA, strA2, arrayList);
    }
}
