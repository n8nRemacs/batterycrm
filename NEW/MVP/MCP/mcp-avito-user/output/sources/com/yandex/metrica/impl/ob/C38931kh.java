package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Jf;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.kh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38931kh {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38956lh f380925a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.e f380926b;

    public C38931kh() {
        this(new C38956lh(), C39031oh.a());
    }

    public void a(@j.N Jf.e.b bVar) {
        this.f380926b.b("provided_request_result", this.f380925a.a(bVar));
    }

    public void b(@j.N Jf.e.a aVar) {
        String string;
        com.yandex.metrica.e eVar = this.f380926b;
        this.f380925a.getClass();
        try {
            string = new JSONObject().put("id", aVar.f378599a).toString();
        } catch (Throwable th2) {
            string = th2.toString();
        }
        eVar.b("provided_request_send", string);
    }

    @j.k0
    public C38931kh(@j.N C38956lh c38956lh, @j.N com.yandex.metrica.e eVar) {
        this.f380925a = c38956lh;
        this.f380926b = eVar;
    }

    public void a(@j.N Jf.e.a aVar) {
        String string;
        com.yandex.metrica.e eVar = this.f380926b;
        this.f380925a.getClass();
        try {
            string = new JSONObject().put("id", aVar.f378599a).toString();
        } catch (Throwable th2) {
            string = th2.toString();
        }
        eVar.b("provided_request_schedule", string);
    }
}
