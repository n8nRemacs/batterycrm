package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Map;

/* loaded from: classes7.dex */
public class M {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39104ri f378858a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39241xb f378859b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Context f378860c;

    public M(@j.N C39104ri c39104ri, @j.N C39241xb c39241xb, @j.N Context context) {
        this.f378858a = c39104ri;
        this.f378859b = c39241xb;
        this.f378860c = context;
    }

    public L a(@j.P Map<String, String> map) {
        return new L(this.f378858a.d(), this.f378859b.a(this.f378860c, new Fb()), map);
    }
}
