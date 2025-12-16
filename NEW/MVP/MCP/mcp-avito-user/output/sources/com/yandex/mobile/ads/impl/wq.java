package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes8.dex */
final class wq extends kotlin.jvm.internal.N implements Y41.l<JSONObject, kotlin.G0> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List<JSONObject> f391477a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq(ArrayList arrayList) {
        super(1);
        this.f391477a = arrayList;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(JSONObject jSONObject) {
        this.f391477a.add(jSONObject);
        return kotlin.G0.f406611a;
    }
}
