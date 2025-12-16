package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.x0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39230x0 {

    /* renamed from: a, reason: collision with root package name */
    private C38687am f382156a = new C38687am();

    /* renamed from: b, reason: collision with root package name */
    private C38713bn f382157b;

    public C39230x0(C38713bn c38713bn) {
        this.f382157b = c38713bn;
    }

    public void a(String str, String str2) {
        this.f382157b.b(this.f382156a, str, str2);
    }

    @j.P
    public String a() {
        if (this.f382156a.isEmpty()) {
            return null;
        }
        return new JSONObject(this.f382156a).toString();
    }
}
