package com.yandex.metrica.impl.ob;

import android.util.Base64;
import com.adjust.sdk.Constants;
import kotlin.text.C43047d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.a8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38673a8 {

    /* renamed from: a, reason: collision with root package name */
    private final C38723c8 f380110a;

    /* renamed from: com.yandex.metrica.impl.ob.a8$a */
    public static final class a implements InterfaceC38748d8 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f380111a = new a();

        @Override // com.yandex.metrica.impl.ob.InterfaceC38748d8
        @Y61.k
        public final JSONObject a(@Y61.k JSONObject jSONObject, @Y61.k JSONObject jSONObject2) throws JSONException {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("device_id", Tl.a(jSONObject, jSONObject2, "device_id"));
            jSONObject3.put("device_id_hash", Tl.a(jSONObject, jSONObject2, "device_id_hash"));
            jSONObject3.put(Constants.REFERRER, Tl.a(jSONObject, jSONObject2, Constants.REFERRER));
            jSONObject3.put("referrer_checked", Tl.a(jSONObject2, "referrer_checked", Tl.a(jSONObject, "referrer_checked", Boolean.FALSE)));
            jSONObject3.put("location_id", Tl.a(jSONObject2, "location_id", Tl.a(jSONObject, "location_id", (Long) (-1L))));
            jSONObject3.put("lbs_id", Tl.a(jSONObject2, "lbs_id", Tl.a(jSONObject, "lbs_id", (Long) (-1L))));
            jSONObject3.put("location_request_id", Tl.a(jSONObject2, "location_request_id", Tl.a(jSONObject, "location_request_id", (Long) (-1L))));
            jSONObject3.put("last_migration_api_level", Tl.a(jSONObject2, "last_migration_api_level", Tl.a(jSONObject, "last_migration_api_level", (Integer) (-1))));
            return jSONObject3;
        }
    }

    public C38673a8(@Y61.k InterfaceC38798f8 interfaceC38798f8, @Y61.k InterfaceC38798f8 interfaceC38798f82) {
        this.f380110a = new C38723c8(interfaceC38798f8, interfaceC38798f82, "[VitalCommonDataProvider]", a.f380111a);
    }

    @Y61.l
    @j.l0
    public final synchronized String a() {
        return Tl.b(this.f380110a.a(), "device_id");
    }

    @Y61.l
    @j.l0
    public final synchronized String b() {
        return Tl.b(this.f380110a.a(), "device_id_hash");
    }

    @j.l0
    public final synchronized void c(long j12) {
        C38723c8 c38723c8 = this.f380110a;
        c38723c8.a(c38723c8.a().put("location_request_id", j12));
    }

    @j.l0
    public final synchronized long d() {
        return this.f380110a.a().optLong("lbs_id", -1L);
    }

    @j.l0
    public final synchronized long e() {
        return this.f380110a.a().optLong("location_id", -1L);
    }

    @j.l0
    public final synchronized long f() {
        return this.f380110a.a().optLong("location_request_id", -1L);
    }

    @Y61.l
    @j.l0
    public final synchronized C38756dg g() {
        C38756dg c38756dgA;
        String strB = Tl.b(this.f380110a.a(), Constants.REFERRER);
        if (strB != null) {
            try {
                c38756dgA = C38756dg.a(Base64.decode(strB.getBytes(C43047d.f410589b), 0));
            } catch (Throwable unused) {
            }
        } else {
            c38756dgA = null;
        }
        return c38756dgA;
    }

    @j.l0
    public final synchronized boolean h() {
        return this.f380110a.a().optBoolean("referrer_checked", false);
    }

    @j.l0
    public final synchronized void a(@Y61.l String str) {
        C38723c8 c38723c8 = this.f380110a;
        c38723c8.a(c38723c8.a().put("device_id", str));
    }

    @j.l0
    public final synchronized void b(@Y61.l String str) {
        C38723c8 c38723c8 = this.f380110a;
        c38723c8.a(c38723c8.a().put("device_id_hash", str));
    }

    @j.l0
    public final synchronized int c() {
        return this.f380110a.a().optInt("last_migration_api_level", -1);
    }

    @j.l0
    public final synchronized void a(@Y61.l C38756dg c38756dg) {
        try {
            C38723c8 c38723c8 = this.f380110a;
            c38723c8.a(c38723c8.a().put(Constants.REFERRER, c38756dg != null ? new String(Base64.encode(c38756dg.a(), 0), C43047d.f410589b) : null));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @j.l0
    public final synchronized void b(long j12) {
        C38723c8 c38723c8 = this.f380110a;
        c38723c8.a(c38723c8.a().put("location_id", j12));
    }

    @j.l0
    public final synchronized void a(boolean z12) {
        C38723c8 c38723c8 = this.f380110a;
        c38723c8.a(c38723c8.a().put("referrer_checked", z12));
    }

    @j.l0
    public final synchronized void a(long j12) {
        C38723c8 c38723c8 = this.f380110a;
        c38723c8.a(c38723c8.a().put("lbs_id", j12));
    }

    @j.l0
    public final synchronized void a(int i12) {
        C38723c8 c38723c8 = this.f380110a;
        c38723c8.a(c38723c8.a().put("last_migration_api_level", i12));
    }

    @j.l0
    public final synchronized void a(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Boolean bool, @Y61.l Long l12, @Y61.l Long l13, @Y61.l Long l14, @Y61.l Integer num) {
        this.f380110a.a(new JSONObject().put("device_id", str).put("device_id_hash", str2).put(Constants.REFERRER, str3).put("referrer_checked", bool).put("location_id", l12).put("lbs_id", l13).put("location_request_id", l14).put("last_migration_api_level", num));
    }
}
