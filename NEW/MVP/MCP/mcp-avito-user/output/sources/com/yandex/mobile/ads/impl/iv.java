package com.yandex.mobile.ads.impl;

import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.yandex.mobile.ads.impl.gv;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
final class iv implements InterfaceC39353p<gv> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final bc1 f386690a;

    public iv(@j.N bc1 bc1Var) {
        this.f386690a = bc1Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39353p
    @j.N
    public final AbstractC39344m a(@j.N JSONObject jSONObject) throws JSONException, yk0 {
        String strA = mm0.a("type", jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i12);
            String strA2 = mm0.a("title", jSONObject2);
            this.f386690a.getClass();
            arrayList.add(new gv.a(strA2, bc1.a(ContextActionHandler.Link.URL, jSONObject2)));
        }
        if (arrayList.isEmpty()) {
            throw new yk0("Native Ad json has not required attributes");
        }
        return new gv(strA, arrayList);
    }
}
