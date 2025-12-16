package com.yandex.mobile.ads.impl;

import com.yandex.metrica.p;
import com.yandex.mobile.ads.impl.ea;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class xc implements p.Ucc {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ea.a f391602a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final bd f391603b;

    public xc(@Y61.k ea.a aVar, @Y61.k bd bdVar) {
        this.f391602a = aVar;
        this.f391603b = bdVar;
    }

    @Override // com.yandex.metrica.p.Ucc
    public final void onError(@Y61.k String str) {
        this.f391602a.b(str);
    }

    @Override // com.yandex.metrica.p.Ucc
    public final void onResult(@Y61.k JSONObject jSONObject) {
        this.f391602a.a(this.f391603b.a(jSONObject));
    }

    public /* synthetic */ xc(ea.a aVar) {
        this(aVar, new bd());
    }
}
