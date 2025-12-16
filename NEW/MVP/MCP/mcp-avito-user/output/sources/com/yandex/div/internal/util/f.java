package com.yandex.div.internal.util;

import kotlin.Metadata;
import org.json.JSONArray;

/* compiled from: JsonNode.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/util/f;", "Lcom/yandex/div/internal/util/g;", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final JSONArray f370169a;

    public f(@Y61.k JSONArray jSONArray) {
        super(null);
        this.f370169a = jSONArray;
    }

    @Override // com.yandex.div.internal.util.g
    @Y61.k
    public final String a() {
        return this.f370169a.toString();
    }
}
