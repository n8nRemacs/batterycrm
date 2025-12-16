package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes8.dex */
public final class wg0 extends af {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39305b f391402a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final af f391403b;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final y9 f391405d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final ap0 f391406e = new ap0();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final uw0 f391404c = new uw0();

    public wg0(@j.N Context context, @j.P SSLSocketFactory sSLSocketFactory) {
        this.f391402a = new C39305b(context, sSLSocketFactory);
        this.f391403b = w10.a(context, null, sSLSocketFactory);
        this.f391405d = C39309c.b(context);
    }

    @Override // com.yandex.mobile.ads.impl.af
    public final o10 a(@j.N qy0<?> qy0Var, @j.N Map<String, String> map) {
        zo0 zo0VarA = this.f391406e.a(qy0Var);
        if (zo0VarA == null) {
            return this.f391405d.a() ? this.f391402a.a(qy0Var, map) : this.f391403b.a(qy0Var, map);
        }
        this.f391404c.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : zo0VarA.f392317c.entrySet()) {
            arrayList.add(new dz(entry.getKey(), entry.getValue()));
        }
        return new o10(zo0VarA.f392315a, arrayList, zo0VarA.f392316b);
    }
}
