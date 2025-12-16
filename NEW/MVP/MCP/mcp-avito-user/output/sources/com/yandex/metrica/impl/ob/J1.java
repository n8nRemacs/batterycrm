package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.impl.ob.C39026oc;
import com.yandex.metrica.impl.ob.C39078qf;
import com.yandex.metrica.impl.ob.E;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class J1 {

    /* renamed from: a, reason: collision with root package name */
    private static Map<EnumC38796f6, Integer> f378549a;

    /* renamed from: b, reason: collision with root package name */
    private static SparseArray<EnumC38796f6> f378550b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<EnumC38666a1, Integer> f378551c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<EnumC38666a1, C39100re> f378552d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f378553e = 0;

    public class a implements Ge {
        @Override // com.yandex.metrica.impl.ob.Ge
        @j.N
        public byte[] a(@j.N C39077qe c39077qe, @j.N Lg lg2) {
            if (!TextUtils.isEmpty(c39077qe.f381470b)) {
                try {
                    C38756dg c38756dgA = C38756dg.a(Base64.decode(c39077qe.f381470b, 0));
                    C39125sf c39125sf = new C39125sf();
                    String str = c38756dgA.f380375a;
                    c39125sf.f381828a = str == null ? new byte[0] : str.getBytes();
                    c39125sf.f381830c = c38756dgA.f380376b;
                    c39125sf.f381829b = c38756dgA.f380377c;
                    int iOrdinal = c38756dgA.f380378d.ordinal();
                    int i12 = 1;
                    if (iOrdinal != 1) {
                        i12 = 2;
                        if (iOrdinal != 2) {
                            i12 = 0;
                        }
                    }
                    c39125sf.f381831d = i12;
                    return MessageNano.toByteArray(c39125sf);
                } catch (Throwable unused) {
                }
            }
            return new byte[0];
        }
    }

    public class b implements InterfaceC39124se {
        @Override // com.yandex.metrica.impl.ob.InterfaceC39124se
        @j.P
        public Integer a(@j.N C39077qe c39077qe) {
            return c39077qe.f381479k;
        }
    }

    static {
        HashMap map = new HashMap();
        EnumC38796f6 enumC38796f6 = EnumC38796f6.FOREGROUND;
        map.put(enumC38796f6, 0);
        EnumC38796f6 enumC38796f62 = EnumC38796f6.BACKGROUND;
        map.put(enumC38796f62, 1);
        f378549a = Collections.unmodifiableMap(map);
        SparseArray<EnumC38796f6> sparseArray = new SparseArray<>();
        sparseArray.put(0, enumC38796f6);
        sparseArray.put(1, enumC38796f62);
        f378550b = sparseArray;
        HashMap map2 = new HashMap();
        EnumC38666a1 enumC38666a1 = EnumC38666a1.EVENT_TYPE_INIT;
        map2.put(enumC38666a1, 1);
        EnumC38666a1 enumC38666a12 = EnumC38666a1.EVENT_TYPE_REGULAR;
        map2.put(enumC38666a12, 4);
        EnumC38666a1 enumC38666a13 = EnumC38666a1.EVENT_TYPE_SEND_REFERRER;
        map2.put(enumC38666a13, 5);
        EnumC38666a1 enumC38666a14 = EnumC38666a1.EVENT_TYPE_ALIVE;
        map2.put(enumC38666a14, 7);
        EnumC38666a1 enumC38666a15 = EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED;
        map2.put(enumC38666a15, 3);
        EnumC38666a1 enumC38666a16 = EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        map2.put(enumC38666a16, 26);
        EnumC38666a1 enumC38666a17 = EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT;
        map2.put(enumC38666a17, 26);
        EnumC38666a1 enumC38666a18 = EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        map2.put(enumC38666a18, 26);
        EnumC38666a1 enumC38666a19 = EnumC38666a1.EVENT_TYPE_ANR;
        map2.put(enumC38666a19, 25);
        EnumC38666a1 enumC38666a110 = EnumC38666a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        map2.put(enumC38666a110, 3);
        EnumC38666a1 enumC38666a111 = EnumC38666a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC38666a111, 26);
        EnumC38666a1 enumC38666a112 = EnumC38666a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH;
        map2.put(enumC38666a112, 3);
        EnumC38666a1 enumC38666a113 = EnumC38666a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC38666a113, 26);
        EnumC38666a1 enumC38666a114 = EnumC38666a1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF;
        map2.put(enumC38666a114, 26);
        EnumC38666a1 enumC38666a115 = EnumC38666a1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC38666a115, 26);
        EnumC38666a1 enumC38666a116 = EnumC38666a1.EVENT_TYPE_EXCEPTION_USER;
        map2.put(enumC38666a116, 6);
        EnumC38666a1 enumC38666a117 = EnumC38666a1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        map2.put(enumC38666a117, 27);
        EnumC38666a1 enumC38666a118 = EnumC38666a1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        map2.put(enumC38666a118, 27);
        EnumC38666a1 enumC38666a119 = EnumC38666a1.EVENT_TYPE_IDENTITY;
        map2.put(enumC38666a119, 8);
        map2.put(EnumC38666a1.EVENT_TYPE_IDENTITY_LIGHT, 28);
        EnumC38666a1 enumC38666a120 = EnumC38666a1.EVENT_TYPE_STATBOX;
        map2.put(enumC38666a120, 11);
        EnumC38666a1 enumC38666a121 = EnumC38666a1.EVENT_TYPE_SET_USER_INFO;
        map2.put(enumC38666a121, 12);
        EnumC38666a1 enumC38666a122 = EnumC38666a1.EVENT_TYPE_REPORT_USER_INFO;
        map2.put(enumC38666a122, 12);
        EnumC38666a1 enumC38666a123 = EnumC38666a1.EVENT_TYPE_FIRST_ACTIVATION;
        map2.put(enumC38666a123, 13);
        EnumC38666a1 enumC38666a124 = EnumC38666a1.EVENT_TYPE_START;
        map2.put(enumC38666a124, 2);
        EnumC38666a1 enumC38666a125 = EnumC38666a1.EVENT_TYPE_APP_OPEN;
        map2.put(enumC38666a125, 16);
        EnumC38666a1 enumC38666a126 = EnumC38666a1.EVENT_TYPE_APP_UPDATE;
        map2.put(enumC38666a126, 17);
        EnumC38666a1 enumC38666a127 = EnumC38666a1.EVENT_TYPE_PERMISSIONS;
        map2.put(enumC38666a127, 18);
        EnumC38666a1 enumC38666a128 = EnumC38666a1.EVENT_TYPE_APP_FEATURES;
        map2.put(enumC38666a128, 19);
        EnumC38666a1 enumC38666a129 = EnumC38666a1.EVENT_TYPE_SEND_USER_PROFILE;
        map2.put(enumC38666a129, 20);
        EnumC38666a1 enumC38666a130 = EnumC38666a1.EVENT_TYPE_SEND_REVENUE_EVENT;
        map2.put(enumC38666a130, 21);
        EnumC38666a1 enumC38666a131 = EnumC38666a1.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        map2.put(enumC38666a131, 40);
        EnumC38666a1 enumC38666a132 = EnumC38666a1.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        map2.put(enumC38666a132, 35);
        map2.put(EnumC38666a1.EVENT_TYPE_CLEANUP, 29);
        EnumC38666a1 enumC38666a133 = EnumC38666a1.EVENT_TYPE_VIEW_TREE;
        map2.put(enumC38666a133, 30);
        EnumC38666a1 enumC38666a134 = EnumC38666a1.EVENT_TYPE_RAW_VIEW_TREE;
        map2.put(enumC38666a134, 34);
        EnumC38666a1 enumC38666a135 = EnumC38666a1.EVENT_TYPE_STATBOX_EXP;
        map2.put(enumC38666a135, 36);
        EnumC38666a1 enumC38666a136 = EnumC38666a1.EVENT_TYPE_WEBVIEW_SYNC;
        map2.put(enumC38666a136, 38);
        f378551c = Collections.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        C38978me c38978me = new C38978me();
        C39053pe c39053pe = new C39053pe();
        C39003ne c39003ne = new C39003ne();
        C38903je c38903je = new C38903je();
        Fe fe2 = new Fe();
        Be be2 = new Be();
        C39100re c39100reA = C39100re.a().a((Ge) be2).a((InterfaceC39028oe) be2).a();
        C39100re c39100reA2 = C39100re.a().a(c39053pe).a();
        C39100re c39100reA3 = C39100re.a().a(c38903je).a();
        C39100re c39100reA4 = C39100re.a().a(fe2).a();
        C39100re c39100reA5 = C39100re.a().a(c38978me).a();
        C39100re c39100reA6 = C39100re.a().a(new He()).a();
        map3.put(enumC38666a12, c39100reA2);
        map3.put(enumC38666a13, C39100re.a().a(new a()).a());
        map3.put(enumC38666a14, C39100re.a().a(c38978me).a(c39003ne).a(new C38928ke()).a(new C38953le()).a());
        map3.put(enumC38666a110, c39100reA);
        map3.put(enumC38666a112, c39100reA);
        map3.put(enumC38666a111, c39100reA);
        map3.put(enumC38666a113, c39100reA);
        map3.put(enumC38666a114, c39100reA);
        map3.put(enumC38666a115, c39100reA);
        map3.put(enumC38666a116, c39100reA2);
        map3.put(enumC38666a117, c39100reA3);
        map3.put(enumC38666a118, c39100reA3);
        map3.put(enumC38666a119, C39100re.a().a(c39053pe).a(new C39220we()).a());
        map3.put(enumC38666a120, c39100reA2);
        map3.put(enumC38666a121, c39100reA2);
        map3.put(enumC38666a122, c39100reA2);
        map3.put(enumC38666a15, c39100reA2);
        map3.put(enumC38666a16, c39100reA3);
        map3.put(enumC38666a17, c39100reA3);
        map3.put(enumC38666a18, c39100reA3);
        map3.put(enumC38666a19, c39100reA3);
        map3.put(enumC38666a124, C39100re.a().a(new C38978me()).a(c38903je).a());
        map3.put(EnumC38666a1.EVENT_TYPE_CUSTOM_EVENT, C39100re.a().a(new b()).a());
        map3.put(enumC38666a125, c39100reA2);
        map3.put(enumC38666a127, c39100reA5);
        map3.put(enumC38666a128, c39100reA5);
        map3.put(enumC38666a129, c39100reA3);
        map3.put(enumC38666a130, c39100reA3);
        map3.put(enumC38666a131, c39100reA3);
        map3.put(enumC38666a132, c39100reA4);
        map3.put(enumC38666a133, c39100reA2);
        map3.put(enumC38666a134, c39100reA2);
        map3.put(enumC38666a1, c39100reA6);
        map3.put(enumC38666a126, c39100reA6);
        map3.put(enumC38666a123, c39100reA2);
        map3.put(enumC38666a135, c39100reA2);
        map3.put(enumC38666a136, c39100reA2);
        f378552d = Collections.unmodifiableMap(map3);
    }

    @j.N
    public static C39078qf.f a(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("start_time");
        Long asLong2 = contentValues.getAsLong("server_time_offset");
        Boolean asBoolean = contentValues.getAsBoolean("obtained_before_first_sync");
        C39078qf.f fVar = new C39078qf.f();
        if (asLong != null) {
            fVar.f381575a = asLong.longValue();
            fVar.f381576b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(asLong.longValue() * 1000) / 1000;
        }
        if (asLong2 != null) {
            fVar.f381577c = asLong2.longValue();
        }
        if (asBoolean != null) {
            fVar.f381578d = asBoolean.booleanValue();
        }
        return fVar;
    }

    @j.P
    public static C39029of[] b(@j.N JSONArray jSONArray) {
        try {
            C39029of[] c39029ofArr = new C39029of[jSONArray.length()];
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i12);
                    if (jSONObjectOptJSONObject != null) {
                        c39029ofArr[i12] = b(jSONObjectOptJSONObject);
                    }
                } catch (Throwable unused) {
                    return c39029ofArr;
                }
            }
            return c39029ofArr;
        } catch (Throwable unused2) {
            return null;
        }
    }

    @j.N
    public static C39029of b(JSONObject jSONObject) {
        C39029of c39029of = new C39029of();
        int iOptInt = jSONObject.optInt("signal_strength", c39029of.f381252b);
        if (iOptInt != -1) {
            c39029of.f381252b = iOptInt;
        }
        c39029of.f381251a = jSONObject.optInt("cell_id", c39029of.f381251a);
        c39029of.f381253c = jSONObject.optInt("lac", c39029of.f381253c);
        c39029of.f381254d = jSONObject.optInt("country_code", c39029of.f381254d);
        c39029of.f381255e = jSONObject.optInt("operator_id", c39029of.f381255e);
        c39029of.f381256f = jSONObject.optString("operator_name", c39029of.f381256f);
        c39029of.f381257g = jSONObject.optBoolean("is_connected", c39029of.f381257g);
        c39029of.f381258h = jSONObject.optInt("cell_type", 0);
        c39029of.f381259i = jSONObject.optInt("pci", c39029of.f381259i);
        c39029of.f381260j = jSONObject.optLong("last_visible_time_offset", c39029of.f381260j);
        c39029of.f381261k = jSONObject.optInt("lte_rsrq", c39029of.f381261k);
        c39029of.f381262l = jSONObject.optInt("lte_rssnr", c39029of.f381262l);
        c39029of.f381264n = jSONObject.optInt("arfcn", c39029of.f381264n);
        c39029of.f381263m = jSONObject.optInt("lte_rssi", c39029of.f381263m);
        c39029of.f381265o = jSONObject.optInt("lte_bandwidth", c39029of.f381265o);
        c39029of.f381266p = jSONObject.optInt("lte_cqi", c39029of.f381266p);
        return c39029of;
    }

    @j.N
    public static EnumC38796f6 a(int i12) {
        EnumC38796f6 enumC38796f6 = f378550b.get(i12);
        return enumC38796f6 == null ? EnumC38796f6.FOREGROUND : enumC38796f6;
    }

    public static C39101rf[] a(JSONArray jSONArray) {
        try {
            C39101rf[] c39101rfArr = new C39101rf[jSONArray.length()];
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                try {
                    c39101rfArr[i12] = a(jSONArray.getJSONObject(i12));
                } catch (Throwable unused) {
                    return c39101rfArr;
                }
            }
            return c39101rfArr;
        } catch (Throwable unused2) {
            return null;
        }
    }

    @j.N
    private static C39101rf a(JSONObject jSONObject) {
        try {
            C39101rf c39101rf = new C39101rf();
            c39101rf.f381757a = jSONObject.getString("mac");
            c39101rf.f381758b = jSONObject.getInt("signal_strength");
            c39101rf.f381759c = jSONObject.getString("ssid");
            c39101rf.f381760d = jSONObject.optBoolean("is_connected");
            c39101rf.f381761e = jSONObject.optLong("last_visible_offset_seconds", 0L);
            return c39101rf;
        } catch (Throwable unused) {
            C39101rf c39101rf2 = new C39101rf();
            c39101rf2.f381757a = jSONObject.optString("mac");
            return c39101rf2;
        }
    }

    @j.P
    public static Integer b(@j.P EnumC38666a1 enumC38666a1) {
        if (enumC38666a1 == null) {
            return null;
        }
        return f378551c.get(enumC38666a1);
    }

    public static int a(@j.N EnumC38796f6 enumC38796f6) {
        Integer num = f378549a.get(enumC38796f6);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @j.N
    public static C39100re a(@j.P EnumC38666a1 enumC38666a1) {
        C39100re c39100re = enumC38666a1 != null ? f378552d.get(enumC38666a1) : null;
        return c39100re == null ? C39100re.b() : c39100re;
    }

    public static int a(@j.N E.b.a aVar) {
        int iOrdinal = aVar.ordinal();
        int i12 = 1;
        if (iOrdinal != 1) {
            i12 = 2;
            if (iOrdinal != 2) {
                i12 = 3;
                if (iOrdinal != 3) {
                    i12 = 4;
                    if (iOrdinal != 4) {
                        return 0;
                    }
                }
            }
        }
        return i12;
    }

    public static int a(@j.N C39026oc.a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 1) {
            return 0;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 3 : 2;
        }
        return 1;
    }
}
