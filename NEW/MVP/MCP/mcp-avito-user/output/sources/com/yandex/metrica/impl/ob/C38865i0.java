package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;
import android.location.Location;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.yandex.metrica.impl.ob.C39026oc;
import com.yandex.metrica.impl.ob.C39109s;
import com.yandex.metrica.impl.ob.C39176ui;
import com.yandex.metrica.impl.ob.zn;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.i0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38865i0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f380752a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final E f380753b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C39205w f380754c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C39194vc f380755d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final I2 f380756e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final D9 f380757f;

    /* renamed from: g, reason: collision with root package name */
    private ContentValues f380758g;

    /* renamed from: h, reason: collision with root package name */
    private Lg f380759h;

    public C38865i0(Context context) {
        this(context, F0.g().c(), F0.g().b(), C39194vc.a(context), H2.a(context));
    }

    public C38865i0 a(ContentValues contentValues) {
        this.f380758g = contentValues;
        return this;
    }

    public C38865i0 a(@j.N Lg lg2) {
        this.f380759h = lg2;
        return this;
    }

    public void a() {
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject);
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        this.f380758g.put("report_request_parameters", jSONObject.toString());
    }

    @j.k0
    public C38865i0(@j.N Context context, @j.N E e12, @j.N C39205w c39205w, @j.N C39194vc c39194vc, @j.N H2 h22) {
        this.f380757f = new D9();
        this.f380752a = context;
        this.f380753b = e12;
        this.f380754c = c39205w;
        this.f380755d = c39194vc;
        this.f380756e = h22.a();
    }

    private void a(@j.N JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectPutOpt = jSONObject.putOpt("dId", this.f380759h.g()).putOpt("uId", this.f380759h.w()).putOpt("appVer", this.f380759h.f()).putOpt("appBuild", this.f380759h.b());
        this.f380759h.getClass();
        JSONObject jSONObjectPutOpt2 = jSONObjectPutOpt.putOpt("analyticsSdkVersionName", "5.3.0");
        this.f380759h.getClass();
        JSONObject jSONObjectPutOpt3 = jSONObjectPutOpt2.putOpt("kitBuildNumber", "45003240").putOpt("kitBuildType", this.f380759h.j()).putOpt("osVer", this.f380759h.o()).putOpt("osApiLev", Integer.valueOf(this.f380759h.n())).putOpt("lang", this.f380759h.k()).putOpt("root", this.f380759h.h()).putOpt("app_debuggable", this.f380759h.z()).putOpt("app_framework", this.f380759h.c()).putOpt("attribution_id", Integer.valueOf(this.f380759h.C()));
        this.f380759h.getClass();
        jSONObjectPutOpt3.putOpt("commit_hash", "a72bf6f57701ed3c2b8ed570054febbff4e58c12");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(@j.N Bm bm, @j.N C39109s.a aVar, @j.N vn<C39176ui.b, Object> vnVar) {
        Location locationH;
        K2 k2B;
        C38715c0 c38715c0 = bm.f377867a;
        this.f380758g.put("name", c38715c0.f380254a);
        this.f380758g.put("value", c38715c0.f380255b);
        this.f380758g.put("type", Integer.valueOf(c38715c0.f380258e));
        this.f380758g.put("custom_type", Integer.valueOf(c38715c0.f380259f));
        this.f380758g.put("error_environment", c38715c0.h());
        this.f380758g.put("user_info", c38715c0.p());
        this.f380758g.put("truncated", Integer.valueOf(c38715c0.f380261h));
        this.f380758g.put("connection_type", Integer.valueOf(H1.b(this.f380752a)));
        this.f380758g.put("profile_id", c38715c0.m());
        this.f380758g.put("encrypting_mode", Integer.valueOf(bm.f377868b.a()));
        this.f380758g.put("first_occurrence_status", Integer.valueOf(c38715c0.j().f377925a));
        EnumC39254y0 enumC39254y0N = c38715c0.n();
        if (enumC39254y0N != null) {
            this.f380758g.put(SearchParamsConverterKt.SOURCE, Integer.valueOf(enumC39254y0N.f382217a));
        }
        Boolean boolC = c38715c0.c();
        if (boolC != null) {
            this.f380758g.put("attribution_id_changed", boolC);
        }
        this.f380758g.put("open_id", c38715c0.k());
        this.f380758g.put("extras", this.f380757f.fromModel(c38715c0.i()));
        this.f380758g.put("app_environment", aVar.f381813a);
        this.f380758g.put("app_environment_revision", Long.valueOf(aVar.f381814b));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enabled", this.f380759h.Q());
            if (this.f380759h.Q()) {
                locationH = this.f380759h.H();
                if (locationH == null) {
                    locationH = this.f380755d.a();
                    k2B = null;
                } else {
                    k2B = K2.a(locationH);
                }
            } else {
                locationH = null;
                k2B = null;
            }
            if (k2B == null && locationH != null) {
                k2B = K2.b(locationH);
            }
            if (k2B != null) {
                a(jSONObject, k2B);
            }
            this.f380758g.put("location_info", jSONObject.toString());
        } catch (Throwable unused) {
        }
        EnumMap enumMap = new EnumMap(C39176ui.b.class);
        Xj xjV = F0.g().v();
        LinkedList linkedList = new LinkedList();
        xjV.a(new C38840h0(this, linkedList));
        C39176ui.b bVar = C39176ui.b.WIFI;
        enumMap.put((EnumMap) bVar, (C39176ui.b) this.f380756e.a());
        C39176ui.b bVar2 = C39176ui.b.CELL;
        enumMap.put((EnumMap) bVar2, (C39176ui.b) (linkedList.isEmpty() ? null : (Collection) linkedList.getFirst()));
        zn<Map<C39176ui.b, Object>> znVar = vnVar.get(enumMap);
        this.f380758g.put("has_omitted_data", Integer.valueOf(znVar.f382336a == zn.a.NOT_CHANGED ? 1 : 0));
        zn.a aVar2 = znVar.f382336a;
        D d12 = znVar.f382337b;
        Collection collection = d12 == 0 ? null : (Collection) ((Map) d12).get(bVar2);
        xjV.a(new C38815g0(this));
        zn.a aVar3 = zn.a.NEW;
        if ((aVar2 == aVar3 || aVar2 == zn.a.REFRESH) && collection != null) {
            this.f380758g.put("cell_info", Tl.a((Collection<C39177uj>) collection).toString());
        }
        zn.a aVar4 = znVar.f382336a;
        D d13 = znVar.f382337b;
        Collection collection2 = d13 != 0 ? (Collection) ((Map) d13).get(bVar) : null;
        if ((aVar4 == zn.a.REFRESH || aVar4 == aVar3) && collection2 != null) {
            this.f380758g.put("wifi_network_info", F2.a(collection2).toString());
        }
        this.f380758g.put("battery_charge_type", Integer.valueOf(this.f380753b.b().a()));
        this.f380758g.put("collection_mode", C39026oc.a.a(this.f380754c.c()).a());
    }

    private void a(@j.N JSONObject jSONObject, @j.N K2 k22) throws JSONException {
        jSONObject.put("lat", k22.getLatitude());
        jSONObject.put(MessageBody.Location.LONGITUDE, k22.getLongitude());
        jSONObject.putOpt("timestamp", Long.valueOf(k22.getTime()));
        jSONObject.putOpt("precision", k22.hasAccuracy() ? Float.valueOf(k22.getAccuracy()) : null);
        jSONObject.putOpt("direction", k22.hasBearing() ? Float.valueOf(k22.getBearing()) : null);
        jSONObject.putOpt("speed", k22.hasSpeed() ? Float.valueOf(k22.getSpeed()) : null);
        jSONObject.putOpt("altitude", k22.hasAltitude() ? Double.valueOf(k22.getAltitude()) : null);
        jSONObject.putOpt("provider", C38689b.a(k22.getProvider(), (String) null));
        jSONObject.putOpt("original_provider", k22.a());
    }
}
