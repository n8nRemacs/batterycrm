package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ky0;
import java.util.Map;

/* loaded from: classes8.dex */
public final class qn implements pn {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ny0 f389250a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final Map<String, Object> f389251b;

    public qn(@Y61.k ny0 ny0Var, @Y61.k Map<String, ? extends Object> map) {
        this.f389250a = ny0Var;
        this.f389251b = map;
    }

    @Override // com.yandex.mobile.ads.impl.pn
    public final void a(@Y61.k on onVar) {
        this.f389250a.a(new ky0(ky0.b.f387299T, (Map<String, Object>) com.avito.android.authorization.auto_recovery.phone_confirm.b.l("log_type", onVar.a(), this.f389251b)));
    }
}
