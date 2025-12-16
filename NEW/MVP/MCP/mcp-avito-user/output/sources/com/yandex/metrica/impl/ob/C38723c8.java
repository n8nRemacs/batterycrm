package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.c8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38723c8 {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f380288a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC38798f8 f380289b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC38798f8 f380290c;

    /* renamed from: d, reason: collision with root package name */
    private final String f380291d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC38748d8 f380292e;

    public C38723c8(@Y61.k InterfaceC38798f8 interfaceC38798f8, @Y61.k InterfaceC38798f8 interfaceC38798f82, @Y61.k String str, @Y61.k InterfaceC38748d8 interfaceC38748d8) {
        this.f380289b = interfaceC38798f8;
        this.f380290c = interfaceC38798f82;
        this.f380291d = str;
        this.f380292e = interfaceC38748d8;
    }

    @Y61.k
    @j.l0
    public final synchronized JSONObject a() {
        try {
            if (this.f380288a == null) {
                JSONObject jSONObjectA = this.f380292e.a(a(this.f380289b), a(this.f380290c));
                this.f380288a = jSONObjectA;
                a(jSONObjectA);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f380288a;
    }

    private final JSONObject a(InterfaceC38798f8 interfaceC38798f8) {
        try {
            String strC = interfaceC38798f8.c();
            return strC != null ? new JSONObject(strC) : new JSONObject();
        } catch (Throwable th2) {
            a(th2);
            return new JSONObject();
        }
    }

    @j.l0
    public final synchronized void a(@Y61.k JSONObject jSONObject) {
        String string = jSONObject.toString();
        try {
            this.f380289b.a(string);
        } catch (Throwable th2) {
            a(th2);
        }
        try {
            this.f380290c.a(string);
        } catch (Throwable th3) {
            a(th3);
        }
    }

    private final void a(Throwable th2) {
        ((C39006nh) C39031oh.a()).reportEvent("vital_data_provider_exception", kotlin.collections.P0.g(new kotlin.Q("tag", this.f380291d), new kotlin.Q("exception", kotlin.jvm.internal.m0.f406844a.b(th2.getClass()).l0())));
        ((C39006nh) C39031oh.a()).reportError("Error during reading vital data for tag = " + this.f380291d, th2);
    }
}
