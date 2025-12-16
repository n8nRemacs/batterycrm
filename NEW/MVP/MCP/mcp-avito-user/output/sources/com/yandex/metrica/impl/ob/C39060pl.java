package com.yandex.metrica.impl.ob;

import android.app.Activity;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.pl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39060pl {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Kk f381375a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Ik f381376b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Jk f381377c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Gk f381378d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final String f381379e;

    public C39060pl(@j.N Kk kk2, @j.N Ik ik2, @j.N Jk jk2, @j.N Gk gk2, @j.N String str) {
        this.f381375a = kk2;
        this.f381376b = ik2;
        this.f381377c = jk2;
        this.f381378d = gk2;
        this.f381379e = str;
    }

    @j.N
    public JSONObject a(@j.N Activity activity, @j.N C38761dl c38761dl, @j.N C38861hl c38861hl, @j.N Ak ak2, long j12) {
        JSONObject jSONObjectA = this.f381375a.a(activity, j12);
        try {
            this.f381377c.a(jSONObjectA, new JSONObject(), this.f381379e);
            this.f381377c.a(jSONObjectA, this.f381376b.a(c38761dl, c38861hl, ak2, (jSONObjectA.toString().getBytes().length + (this.f381378d.a(new JSONObject()).toString().getBytes().length - 2)) - 2), this.f381379e);
        } catch (Throwable unused) {
        }
        return jSONObjectA;
    }
}
