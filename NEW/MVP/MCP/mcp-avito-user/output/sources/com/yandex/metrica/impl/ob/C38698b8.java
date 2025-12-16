package com.yandex.metrica.impl.ob;

import androidx.compose.ui.platform.C22491k0;
import kotlin.jvm.internal.C42822w;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.b8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38698b8 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f380162b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C38723c8 f380163a;

    /* renamed from: com.yandex.metrica.impl.ob.b8$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b8$b */
    public static final class b implements InterfaceC38748d8 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f380164a = new b();

        @Override // com.yandex.metrica.impl.ob.InterfaceC38748d8
        @Y61.k
        public final JSONObject a(@Y61.k JSONObject jSONObject, @Y61.k JSONObject jSONObject2) throws JSONException {
            JSONObject jSONObject3;
            JSONObject jSONObject4 = new JSONObject();
            Boolean bool = Boolean.FALSE;
            jSONObject4.put("first_event_done", Tl.a(jSONObject2, "first_event_done", Tl.a(jSONObject, "first_event_done", bool)));
            jSONObject4.put("init_event_done", Tl.a(jSONObject2, "init_event_done", Tl.a(jSONObject, "init_event_done", bool)));
            jSONObject4.put("report_request_id", Tl.a(jSONObject2, "report_request_id", Tl.a(jSONObject, "report_request_id", (Integer) (-1))));
            jSONObject4.put("global_number", Tl.a(jSONObject2, "global_number", Tl.a(jSONObject, "global_number", (Integer) 0)));
            jSONObject4.put("session_id", Tl.a(jSONObject2, "session_id", Tl.a(jSONObject, "session_id", (Long) (-1L))));
            jSONObject4.put("referrer_handled", Tl.a(jSONObject2, "referrer_handled", Tl.a(jSONObject, "referrer_handled", bool)));
            JSONObject jSONObject5 = null;
            if (jSONObject.has("numbers_of_type")) {
                try {
                    jSONObject3 = jSONObject.getJSONObject("numbers_of_type");
                } catch (Throwable unused) {
                }
            } else {
                jSONObject3 = null;
            }
            if (jSONObject2.has("numbers_of_type")) {
                try {
                    jSONObject5 = jSONObject2.getJSONObject("numbers_of_type");
                } catch (Throwable unused2) {
                }
            }
            if (jSONObject5 != null) {
                jSONObject3 = jSONObject5;
            }
            jSONObject4.put("numbers_of_type", jSONObject3);
            jSONObject4.put("open_id", Tl.a(jSONObject2, "open_id", Tl.a(jSONObject, "open_id", (Integer) 1)));
            jSONObject4.put("attribution_id", Tl.a(jSONObject2, "attribution_id", Tl.a(jSONObject, "attribution_id", (Integer) 1)));
            jSONObject4.put("last_migration_api_level", Tl.a(jSONObject2, "last_migration_api_level", Tl.a(jSONObject, "last_migration_api_level", (Integer) 0)));
            return jSONObject4;
        }
    }

    public C38698b8(@Y61.k InterfaceC38798f8 interfaceC38798f8, @Y61.k InterfaceC38798f8 interfaceC38798f82, @Y61.l String str) {
        this.f380163a = new C38723c8(interfaceC38798f8, interfaceC38798f82, C22491k0.a(']', "[VitalComponentDataProvider-", str), b.f380164a);
    }

    @j.l0
    public final synchronized void a(boolean z12) {
        C38723c8 c38723c8 = this.f380163a;
        c38723c8.a(c38723c8.a().put("first_event_done", z12));
    }

    @j.l0
    public final synchronized void b(boolean z12) {
        C38723c8 c38723c8 = this.f380163a;
        c38723c8.a(c38723c8.a().put("init_event_done", z12));
    }

    @j.l0
    public final synchronized void c(int i12) {
        C38723c8 c38723c8 = this.f380163a;
        c38723c8.a(c38723c8.a().put("report_request_id", i12));
    }

    @Y61.l
    @j.l0
    public final synchronized JSONObject d() {
        return this.f380163a.a().optJSONObject("numbers_of_type");
    }

    @j.l0
    public final synchronized int e() {
        return this.f380163a.a().optInt("open_id", 1);
    }

    @j.l0
    public final synchronized boolean f() {
        return this.f380163a.a().optBoolean("referrer_handled", false);
    }

    @j.l0
    public final synchronized int g() {
        return this.f380163a.a().optInt("report_request_id", -1);
    }

    @j.l0
    public final synchronized long h() {
        return this.f380163a.a().optLong("session_id", -1L);
    }

    @j.l0
    public final synchronized void i() {
        synchronized (this) {
        }
        int iOptInt = this.f380163a.a().optInt("attribution_id", 1) + 1;
        synchronized (this) {
            C38723c8 c38723c8 = this.f380163a;
            c38723c8.a(c38723c8.a().put("attribution_id", iOptInt));
        }
    }

    @j.l0
    public final synchronized void j() {
        synchronized (this) {
        }
        int iOptInt = this.f380163a.a().optInt("open_id", 1) + 1;
        synchronized (this) {
            C38723c8 c38723c8 = this.f380163a;
            c38723c8.a(c38723c8.a().put("open_id", iOptInt));
        }
    }

    @j.l0
    public final synchronized boolean k() {
        return this.f380163a.a().optBoolean("first_event_done", false);
    }

    @j.l0
    public final synchronized boolean l() {
        return this.f380163a.a().optBoolean("init_event_done", false);
    }

    @j.l0
    public final synchronized void a(int i12) {
        C38723c8 c38723c8 = this.f380163a;
        c38723c8.a(c38723c8.a().put("global_number", i12));
    }

    @j.l0
    public final synchronized int b() {
        return this.f380163a.a().optInt("global_number", 0);
    }

    @j.l0
    public final synchronized void c(boolean z12) {
        C38723c8 c38723c8 = this.f380163a;
        c38723c8.a(c38723c8.a().put("referrer_handled", z12));
    }

    @j.l0
    public final synchronized void a(long j12) {
        C38723c8 c38723c8 = this.f380163a;
        c38723c8.a(c38723c8.a().put("session_id", j12));
    }

    @j.l0
    public final synchronized void b(int i12) {
        C38723c8 c38723c8 = this.f380163a;
        c38723c8.a(c38723c8.a().put("last_migration_api_level", i12));
    }

    @j.l0
    public final synchronized int c() {
        return this.f380163a.a().optInt("last_migration_api_level", 0);
    }

    @j.l0
    public final synchronized void a(@Y61.l JSONObject jSONObject) {
        C38723c8 c38723c8 = this.f380163a;
        c38723c8.a(c38723c8.a().put("numbers_of_type", jSONObject));
    }

    @j.l0
    public final synchronized int a() {
        return this.f380163a.a().optInt("attribution_id", 1);
    }

    @j.l0
    public final synchronized void a(boolean z12, boolean z13, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Long l12, @Y61.l Boolean bool, @Y61.l JSONObject jSONObject, @Y61.l Integer num3, @Y61.l Integer num4, @Y61.l Integer num5) {
        this.f380163a.a(new JSONObject().put("first_event_done", z12).put("init_event_done", z13).put("report_request_id", num).put("global_number", num2).put("session_id", l12).put("referrer_handled", bool).put("open_id", num3).put("attribution_id", num4).put("numbers_of_type", jSONObject).put("last_migration_api_level", num5));
    }
}
