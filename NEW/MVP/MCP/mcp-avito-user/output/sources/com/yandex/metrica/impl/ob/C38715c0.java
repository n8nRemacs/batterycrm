package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Pair;
import androidx.media3.common.C23088b;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.impl.ob.C39277z;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.c0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38715c0 implements Parcelable {
    public static final Parcelable.Creator<C38715c0> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    String f380254a;

    /* renamed from: b, reason: collision with root package name */
    String f380255b;

    /* renamed from: c, reason: collision with root package name */
    private String f380256c;

    /* renamed from: d, reason: collision with root package name */
    private String f380257d;

    /* renamed from: e, reason: collision with root package name */
    int f380258e;

    /* renamed from: f, reason: collision with root package name */
    int f380259f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private Pair<String, String> f380260g;

    /* renamed from: h, reason: collision with root package name */
    int f380261h;

    /* renamed from: i, reason: collision with root package name */
    private String f380262i;

    /* renamed from: j, reason: collision with root package name */
    private long f380263j;

    /* renamed from: k, reason: collision with root package name */
    private long f380264k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private D0 f380265l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    private EnumC39254y0 f380266m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    private Bundle f380267n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    private Boolean f380268o;

    /* renamed from: p, reason: collision with root package name */
    @j.P
    private Integer f380269p;

    /* renamed from: q, reason: collision with root package name */
    @j.N
    private Map<String, byte[]> f380270q;

    /* renamed from: com.yandex.metrica.impl.ob.c0$a */
    public class a implements Parcelable.Creator<C38715c0> {
        @Override // android.os.Parcelable.Creator
        public C38715c0 createFromParcel(Parcel parcel) {
            Bundle bundle = parcel.readBundle(ResultReceiverC38790f0.class.getClassLoader());
            EnumC39254y0 enumC39254y0A = bundle.containsKey("CounterReport.Source") ? EnumC39254y0.a(bundle.getInt("CounterReport.Source")) : null;
            C38715c0 c38715c0 = new C38715c0();
            c38715c0.f380258e = bundle.getInt("CounterReport.Type", EnumC38666a1.EVENT_TYPE_UNDEFINED.b());
            c38715c0.f380259f = bundle.getInt("CounterReport.CustomType");
            String string = bundle.getString("CounterReport.Value");
            if (string == null) {
                string = "";
            }
            c38715c0.f380255b = string;
            C38715c0 c38715c0A = C38715c0.a(c38715c0.e(bundle.getString("CounterReport.UserInfo")).c(bundle.getString("CounterReport.Environment")).b(bundle.getString("CounterReport.Event")), (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) ? new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue")) : null);
            c38715c0A.f380261h = bundle.getInt("CounterReport.TRUNCATED");
            C38715c0 c38715c0A2 = c38715c0A.d(bundle.getString("CounterReport.ProfileID")).a(bundle.getLong("CounterReport.CreationElapsedRealtime")).b(bundle.getLong("CounterReport.CreationTimestamp")).a(D0.a(Integer.valueOf(bundle.getInt("CounterReport.UniquenessStatus")))).a(enumC39254y0A).c(bundle.getBundle("CounterReport.Payload")).a(bundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(bundle.getBoolean("CounterReport.AttributionIdChanged")) : null).a(bundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(bundle.getInt("CounterReport.OpenId")) : null);
            Bundle bundle2 = bundle.getBundle("CounterReport.Extras");
            int i12 = W21.a.f17732a;
            HashMap map = new HashMap();
            if (bundle2 != null) {
                for (String str : bundle2.keySet()) {
                    byte[] byteArray = bundle2.getByteArray(str);
                    if (byteArray != null) {
                        map.put(str, byteArray);
                    }
                }
            }
            return c38715c0A2.a(map);
        }

        @Override // android.os.Parcelable.Creator
        public C38715c0[] newArray(int i12) {
            return new C38715c0[i12];
        }
    }

    public C38715c0() {
        this("", 0);
    }

    public C38715c0 a(@j.P byte[] bArr) {
        this.f380255b = new String(Base64.encode(bArr, 0));
        return this;
    }

    public C38715c0 b(String str) {
        this.f380254a = str;
        return this;
    }

    public C38715c0 c(String str) {
        this.f380257d = str;
        return this;
    }

    public int d() {
        return this.f380261h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C38715c0 e(String str) {
        this.f380256c = str;
        return this;
    }

    public C38715c0 f(String str) {
        this.f380255b = str;
        return this;
    }

    public String g() {
        return this.f380254a;
    }

    @j.P
    public String h() {
        return this.f380257d;
    }

    @j.N
    public Map<String, byte[]> i() {
        return this.f380270q;
    }

    @j.N
    public D0 j() {
        return this.f380265l;
    }

    @j.P
    public Integer k() {
        return this.f380269p;
    }

    @j.P
    public Bundle l() {
        return this.f380267n;
    }

    @j.P
    public String m() {
        return this.f380262i;
    }

    @j.P
    public EnumC39254y0 n() {
        return this.f380266m;
    }

    public int o() {
        return this.f380258e;
    }

    public String p() {
        return this.f380256c;
    }

    public String q() {
        return this.f380255b;
    }

    public byte[] r() {
        return Base64.decode(this.f380255b, 0);
    }

    public String toString() {
        Locale locale = Locale.US;
        String str = this.f380254a;
        String strA = EnumC38666a1.a(this.f380258e).a();
        return AK.c.s(C23088b.b("[event: ", str, ", type: ", strA, ", value: "), A2.a(this.f380255b, 500), "]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f380254a);
        bundle.putString("CounterReport.Value", this.f380255b);
        bundle.putInt("CounterReport.Type", this.f380258e);
        bundle.putInt("CounterReport.CustomType", this.f380259f);
        bundle.putInt("CounterReport.TRUNCATED", this.f380261h);
        bundle.putString("CounterReport.ProfileID", this.f380262i);
        bundle.putInt("CounterReport.UniquenessStatus", this.f380265l.f377925a);
        Bundle bundle2 = this.f380267n;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f380257d;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        String str2 = this.f380256c;
        if (str2 != null) {
            bundle.putString("CounterReport.UserInfo", str2);
        }
        Pair<String, String> pair = this.f380260g;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f380263j);
        bundle.putLong("CounterReport.CreationTimestamp", this.f380264k);
        EnumC39254y0 enumC39254y0 = this.f380266m;
        if (enumC39254y0 != null) {
            bundle.putInt("CounterReport.Source", enumC39254y0.f382217a);
        }
        Boolean bool = this.f380268o;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f380269p;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        Map<String, byte[]> map = this.f380270q;
        int i13 = W21.a.f17732a;
        Bundle bundle3 = new Bundle(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            bundle3.putByteArray(entry.getKey(), entry.getValue());
        }
        bundle.putBundle("CounterReport.Extras", bundle3);
        parcel.writeBundle(bundle);
    }

    public C38715c0(String str, int i12) {
        this("", str, i12);
    }

    public C38715c0 a(int i12) {
        this.f380258e = i12;
        return this;
    }

    public Pair<String, String> b() {
        return this.f380260g;
    }

    public C38715c0 c(@j.P Bundle bundle) {
        this.f380267n = bundle;
        return this;
    }

    public C38715c0 d(@j.P String str) {
        this.f380262i = str;
        return this;
    }

    public long e() {
        return this.f380263j;
    }

    public long f() {
        return this.f380264k;
    }

    public C38715c0(String str, String str2, int i12) {
        this(str, str2, i12, new com.yandex.metrica.coreutils.services.e());
    }

    private static C38715c0 d(@j.N C38715c0 c38715c0) {
        C38715c0 c38715c02 = new C38715c0();
        c38715c02.f380264k = c38715c0.f380264k;
        c38715c02.f380263j = c38715c0.f380263j;
        c38715c02.f380256c = c38715c0.f380256c;
        c38715c02.f380260g = c38715c0.f380260g;
        c38715c02.f380257d = c38715c0.f380257d;
        c38715c02.f380267n = c38715c0.f380267n;
        c38715c02.f380270q = c38715c0.f380270q;
        c38715c02.f380262i = c38715c0.f380262i;
        return c38715c02;
    }

    public static C38715c0 e(C38715c0 c38715c0) {
        return a(c38715c0, EnumC38666a1.EVENT_TYPE_APP_UPDATE);
    }

    public C38715c0 a(String str, String str2) {
        if (this.f380260g == null) {
            this.f380260g = new Pair<>(str, str2);
        }
        return this;
    }

    public C38715c0 b(long j12) {
        this.f380264k = j12;
        return this;
    }

    @j.P
    public Boolean c() {
        return this.f380268o;
    }

    @j.k0
    public C38715c0(String str, String str2, int i12, com.yandex.metrica.coreutils.services.e eVar) {
        this.f380265l = D0.UNKNOWN;
        this.f380270q = new HashMap();
        this.f380254a = str2;
        this.f380258e = i12;
        this.f380255b = str;
        eVar.getClass();
        this.f380263j = SystemClock.elapsedRealtime();
        this.f380264k = System.currentTimeMillis();
    }

    public static C38715c0 c(C38715c0 c38715c0) {
        return a(c38715c0, EnumC38666a1.EVENT_TYPE_INIT);
    }

    @j.N
    public Bundle b(Bundle bundle) {
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public static C38715c0 a(C38715c0 c38715c0, Pair pair) {
        c38715c0.f380260g = pair;
        return c38715c0;
    }

    public static C38715c0 b(C38715c0 c38715c0) {
        return a(c38715c0, EnumC38666a1.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public C38715c0 a(long j12) {
        this.f380263j = j12;
        return this;
    }

    @j.N
    public C38715c0 a(@j.N D0 d02) {
        this.f380265l = d02;
        return this;
    }

    @j.N
    public C38715c0 a(@j.P EnumC39254y0 enumC39254y0) {
        this.f380266m = enumC39254y0;
        return this;
    }

    @j.N
    public C38715c0 a(@j.P Boolean bool) {
        this.f380268o = bool;
        return this;
    }

    public C38715c0 a(@j.P Integer num) {
        this.f380269p = num;
        return this;
    }

    @j.N
    public C38715c0 a(@j.N Map<String, byte[]> map) {
        this.f380270q = map;
        return this;
    }

    @j.N
    public static C38715c0 a(Bundle bundle) {
        if (bundle != null) {
            try {
                C38715c0 c38715c0 = (C38715c0) bundle.getParcelable("CounterReport.Object");
                if (c38715c0 != null) {
                    return c38715c0;
                }
            } catch (Throwable unused) {
                return new C38715c0();
            }
        }
        return new C38715c0();
    }

    private static C38715c0 a(C38715c0 c38715c0, EnumC38666a1 enumC38666a1) {
        C38715c0 c38715c0D = d(c38715c0);
        c38715c0D.f380258e = enumC38666a1.b();
        return c38715c0D;
    }

    public static C38715c0 a(C38715c0 c38715c0) {
        return a(c38715c0, EnumC38666a1.EVENT_TYPE_ALIVE);
    }

    public static C38715c0 a(C38715c0 c38715c0, @j.N A0 a02) {
        C38715c0 c38715c0A = a(c38715c0, EnumC38666a1.EVENT_TYPE_START);
        String strA = a02.a();
        C39004nf c39004nf = new C39004nf();
        if (strA != null) {
            c39004nf.f381159a = strA.getBytes();
        }
        c38715c0A.a(MessageNano.toByteArray(c39004nf));
        c38715c0A.f380264k = c38715c0.f380264k;
        c38715c0A.f380263j = c38715c0.f380263j;
        return c38715c0A;
    }

    public static C38715c0 a(C38715c0 c38715c0, L3 l32) {
        Context contextG = l32.g();
        Y0 y0C = new Y0(contextG, new C39063q0(contextG)).c();
        try {
            y0C.b();
        } catch (Throwable unused) {
        }
        C38715c0 c38715c0D = d(c38715c0);
        c38715c0D.f380258e = EnumC38666a1.EVENT_TYPE_IDENTITY.b();
        c38715c0D.f380255b = y0C.a();
        return c38715c0D;
    }

    public static C38715c0 a(C38715c0 c38715c0, @j.N Collection<Bd> collection, @j.P C39277z c39277z, @j.N C39181v c39181v, @j.N List<String> list) {
        String string;
        String str;
        C38715c0 c38715c0D = d(c38715c0);
        try {
            JSONArray jSONArray = new JSONArray();
            for (Bd bd2 : collection) {
                jSONArray.put(new JSONObject().put("name", bd2.f377845a).put("granted", bd2.f377846b));
            }
            JSONObject jSONObject = new JSONObject();
            if (c39277z != null) {
                jSONObject.put("background_restricted", c39277z.f382278b);
                C39277z.a aVar = c39277z.f382277a;
                c39181v.getClass();
                if (aVar != null) {
                    int iOrdinal = aVar.ordinal();
                    if (iOrdinal == 0) {
                        str = "ACTIVE";
                    } else if (iOrdinal == 1) {
                        str = "WORKING_SET";
                    } else if (iOrdinal == 2) {
                        str = "FREQUENT";
                    } else if (iOrdinal == 3) {
                        str = "RARE";
                    } else if (iOrdinal == 4) {
                        str = "RESTRICTED";
                    }
                    jSONObject.put("app_standby_bucket", str);
                }
                str = null;
                jSONObject.put("app_standby_bucket", str);
            }
            string = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            string = "";
        }
        c38715c0D.f380258e = EnumC38666a1.EVENT_TYPE_PERMISSIONS.b();
        c38715c0D.f380255b = string;
        return c38715c0D;
    }

    public static C38715c0 a(C38715c0 c38715c0, String str) {
        C38715c0 c38715c0D = d(c38715c0);
        c38715c0D.f380258e = EnumC38666a1.EVENT_TYPE_APP_FEATURES.b();
        c38715c0D.f380255b = str;
        return c38715c0D;
    }

    @j.N
    public static C38715c0 a() {
        C38715c0 c38715c0 = new C38715c0();
        c38715c0.f380258e = EnumC38666a1.EVENT_TYPE_SEND_REVENUE_EVENT.b();
        return c38715c0;
    }

    @j.N
    public static C38715c0 a(@j.N String str) {
        C38715c0 c38715c0 = new C38715c0();
        c38715c0.f380258e = EnumC38666a1.EVENT_TYPE_WEBVIEW_SYNC.b();
        c38715c0.f380255b = str;
        c38715c0.f380266m = EnumC39254y0.JS;
        return c38715c0;
    }
}
