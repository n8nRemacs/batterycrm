package com.yandex.div.internal.util;

import kotlin.Metadata;
import org.json.JSONObject;

/* compiled from: JsonNode.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/util/h;", "Lcom/yandex/div/internal/util/g;", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class h extends g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final JSONObject f370170a;

    public h(@Y61.k JSONObject jSONObject) {
        super(null);
        this.f370170a = jSONObject;
    }

    @Override // com.yandex.div.internal.util.g
    @Y61.k
    public final String a() {
        return this.f370170a.toString();
    }
}
