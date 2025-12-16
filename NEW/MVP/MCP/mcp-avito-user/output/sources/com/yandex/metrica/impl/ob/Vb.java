package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.yandex.metrica.impl.ob.C39026oc;
import com.yandex.metrica.impl.ob.E;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Vb {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private Context f379781a;

    public Vb(@j.N Context context) {
        this.f379781a = context;
    }

    @j.P
    public String a(@j.N Hc hc2) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("collection_mode", hc2.f378254a.a());
            jSONObject.put("lat", hc2.c().getLatitude());
            jSONObject.put(MessageBody.Location.LONGITUDE, hc2.c().getLongitude());
            jSONObject.putOpt("timestamp", Long.valueOf(hc2.c().getTime()));
            jSONObject.putOpt("receive_timestamp", Long.valueOf(hc2.e()));
            jSONObject.put("receive_elapsed_realtime_seconds", hc2.d());
            jSONObject.putOpt("precision", hc2.c().hasAccuracy() ? Float.valueOf(hc2.c().getAccuracy()) : null);
            jSONObject.putOpt("direction", hc2.c().hasBearing() ? Float.valueOf(hc2.c().getBearing()) : null);
            jSONObject.putOpt("speed", hc2.c().hasSpeed() ? Float.valueOf(hc2.c().getSpeed()) : null);
            jSONObject.putOpt("altitude", hc2.c().hasAltitude() ? Double.valueOf(hc2.c().getAltitude()) : null);
            jSONObject.putOpt("provider", C38689b.a(hc2.c().getProvider(), (String) null));
            jSONObject.put("charge_type", hc2.a().a());
            string = jSONObject.toString();
        } catch (Throwable unused) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        try {
            return Tl.b(this.f379781a, string);
        } catch (UnsupportedEncodingException unused2) {
            return null;
        }
    }

    @j.P
    public Hc b(long j12, @j.N String str) {
        String strA;
        try {
            strA = Tl.a(this.f379781a, str);
        } catch (UnsupportedEncodingException unused) {
            strA = null;
        }
        if (strA != null && !TextUtils.isEmpty(strA)) {
            try {
                JSONObject jSONObject = new JSONObject(strA);
                long jOptLong = jSONObject.optLong("receive_timestamp", 0L);
                long jOptLong2 = jSONObject.optLong("receive_elapsed_realtime_seconds", 0L);
                C39026oc.a aVarA = C39026oc.a.a(jSONObject.optString("collection_mode"));
                Location location = new Location(jSONObject.optString("provider", null));
                location.setLongitude(jSONObject.optDouble(MessageBody.Location.LONGITUDE, 0.0d));
                location.setLatitude(jSONObject.optDouble("lat", 0.0d));
                location.setTime(jSONObject.optLong("timestamp", 0L));
                location.setAccuracy((float) jSONObject.optDouble("precision", 0.0d));
                location.setBearing((float) jSONObject.optDouble("direction", 0.0d));
                location.setSpeed((float) jSONObject.optDouble("speed", 0.0d));
                location.setAltitude(jSONObject.optDouble("altitude", 0.0d));
                return new Hc(aVarA, jOptLong, jOptLong2, location, E.b.a.a(Integer.valueOf(jSONObject.optInt("charge_type", BeduinInputModel.MIN_TEXT_VERSION))), Long.valueOf(j12));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    @j.P
    public C38951lc a(long j12, @j.N String str) {
        String strA;
        try {
            strA = Tl.a(this.f379781a, str);
        } catch (UnsupportedEncodingException unused) {
            strA = null;
        }
        if (strA == null || TextUtils.isEmpty(strA)) {
            return null;
        }
        try {
            C38951lc c38951lc = new C38951lc();
            try {
                c38951lc.a(Long.valueOf(j12));
                JSONObject jSONObject = new JSONObject(strA);
                c38951lc.b(jSONObject.optLong("timestamp", 0L));
                c38951lc.a(jSONObject.optLong("elapsed_realtime_seconds", 0L));
                c38951lc.a(jSONObject.optJSONArray("cell_info"));
                c38951lc.b(jSONObject.optJSONArray("wifi_info"));
                c38951lc.a(E.b.a.a(Integer.valueOf(jSONObject.optInt("charge_type", BeduinInputModel.MIN_TEXT_VERSION))));
                c38951lc.a(C39026oc.a.a(jSONObject.optString("collection_mode")));
            } catch (Throwable unused2) {
            }
            return c38951lc;
        } catch (Throwable unused3) {
            return null;
        }
    }

    @j.P
    public String a(@j.N C38951lc c38951lc) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", c38951lc.d());
            jSONObject.put("elapsed_realtime_seconds", c38951lc.c());
            jSONObject.putOpt("wifi_info", c38951lc.g());
            jSONObject.putOpt("cell_info", c38951lc.a());
            if (c38951lc.b() != null) {
                jSONObject.put("charge_type", c38951lc.b().a());
            }
            if (c38951lc.e() != null) {
                jSONObject.put("collection_mode", c38951lc.e().a());
            }
            string = jSONObject.toString();
        } catch (Throwable unused) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        try {
            return Tl.b(this.f379781a, string);
        } catch (UnsupportedEncodingException unused2) {
            return null;
        }
    }
}
