package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.location.Location;
import android.os.Parcel;
import android.os.ResultReceiver;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.Mg;
import java.util.Map;

/* loaded from: classes7.dex */
public class D3 {

    /* renamed from: a, reason: collision with root package name */
    public final Mg.b f377929a;

    /* renamed from: b, reason: collision with root package name */
    public final a f377930b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final ResultReceiver f377931c;

    public static class a implements Dg<a, a> {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public final String f377932a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public final String f377933b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public final String f377934c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public final String f377935d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        public final Boolean f377936e;

        /* renamed from: f, reason: collision with root package name */
        @j.P
        public final Location f377937f;

        /* renamed from: g, reason: collision with root package name */
        @j.P
        public final Boolean f377938g;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        public final Integer f377939h;

        /* renamed from: i, reason: collision with root package name */
        @j.P
        public final Integer f377940i;

        /* renamed from: j, reason: collision with root package name */
        @j.P
        public final Integer f377941j;

        /* renamed from: k, reason: collision with root package name */
        @j.P
        public final Boolean f377942k;

        /* renamed from: l, reason: collision with root package name */
        @j.P
        public final Boolean f377943l;

        /* renamed from: m, reason: collision with root package name */
        @j.P
        public final Map<String, String> f377944m;

        /* renamed from: n, reason: collision with root package name */
        @j.P
        public final Integer f377945n;

        /* renamed from: o, reason: collision with root package name */
        @j.P
        public final Boolean f377946o;

        /* renamed from: p, reason: collision with root package name */
        @j.P
        public final Boolean f377947p;

        /* renamed from: q, reason: collision with root package name */
        @j.P
        public final Boolean f377948q;

        public a(@j.P String str, @j.P String str2, @j.P String str3, @j.P String str4, @j.P Boolean bool, @j.P Location location, @j.P Boolean bool2, @j.P Integer num, @j.P Integer num2, @j.P Integer num3, @j.P Boolean bool3, @j.P Boolean bool4, @j.P Map<String, String> map, @j.P Integer num4, @j.P Boolean bool5, @j.P Boolean bool6, @j.P Boolean bool7) {
            this.f377932a = str;
            this.f377933b = str2;
            this.f377934c = str3;
            this.f377935d = str4;
            this.f377936e = bool;
            this.f377937f = location;
            this.f377938g = bool2;
            this.f377939h = num;
            this.f377940i = num2;
            this.f377941j = num3;
            this.f377942k = bool3;
            this.f377943l = bool4;
            this.f377944m = map;
            this.f377945n = num4;
            this.f377946o = bool5;
            this.f377947p = bool6;
            this.f377948q = bool7;
        }

        @Override // com.yandex.metrica.impl.ob.Dg
        public boolean b(@j.N a aVar) {
            return equals(aVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            String str = this.f377932a;
            if (str == null ? aVar.f377932a != null : !str.equals(aVar.f377932a)) {
                return false;
            }
            String str2 = this.f377933b;
            if (str2 == null ? aVar.f377933b != null : !str2.equals(aVar.f377933b)) {
                return false;
            }
            String str3 = this.f377934c;
            if (str3 == null ? aVar.f377934c != null : !str3.equals(aVar.f377934c)) {
                return false;
            }
            String str4 = this.f377935d;
            if (str4 == null ? aVar.f377935d != null : !str4.equals(aVar.f377935d)) {
                return false;
            }
            Boolean bool = this.f377936e;
            if (bool == null ? aVar.f377936e != null : !bool.equals(aVar.f377936e)) {
                return false;
            }
            Location location = this.f377937f;
            if (location == null ? aVar.f377937f != null : !location.equals(aVar.f377937f)) {
                return false;
            }
            Boolean bool2 = this.f377938g;
            if (bool2 == null ? aVar.f377938g != null : !bool2.equals(aVar.f377938g)) {
                return false;
            }
            Integer num = this.f377939h;
            if (num == null ? aVar.f377939h != null : !num.equals(aVar.f377939h)) {
                return false;
            }
            Integer num2 = this.f377940i;
            if (num2 == null ? aVar.f377940i != null : !num2.equals(aVar.f377940i)) {
                return false;
            }
            Integer num3 = this.f377941j;
            if (num3 == null ? aVar.f377941j != null : !num3.equals(aVar.f377941j)) {
                return false;
            }
            Boolean bool3 = this.f377942k;
            if (bool3 == null ? aVar.f377942k != null : !bool3.equals(aVar.f377942k)) {
                return false;
            }
            Boolean bool4 = this.f377943l;
            if (bool4 == null ? aVar.f377943l != null : !bool4.equals(aVar.f377943l)) {
                return false;
            }
            Map<String, String> map = this.f377944m;
            if (map == null ? aVar.f377944m != null : !map.equals(aVar.f377944m)) {
                return false;
            }
            Integer num4 = this.f377945n;
            if (num4 == null ? aVar.f377945n != null : !num4.equals(aVar.f377945n)) {
                return false;
            }
            Boolean bool5 = this.f377946o;
            if (bool5 == null ? aVar.f377946o != null : !bool5.equals(aVar.f377946o)) {
                return false;
            }
            Boolean bool6 = this.f377947p;
            if (bool6 == null ? aVar.f377947p != null : !bool6.equals(aVar.f377947p)) {
                return false;
            }
            Boolean bool7 = this.f377948q;
            return bool7 != null ? bool7.equals(aVar.f377948q) : aVar.f377948q == null;
        }

        public int hashCode() {
            String str = this.f377932a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f377933b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f377934c;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f377935d;
            int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Boolean bool = this.f377936e;
            int iHashCode5 = (iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
            Location location = this.f377937f;
            int iHashCode6 = (iHashCode5 + (location != null ? location.hashCode() : 0)) * 31;
            Boolean bool2 = this.f377938g;
            int iHashCode7 = (iHashCode6 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Integer num = this.f377939h;
            int iHashCode8 = (iHashCode7 + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.f377940i;
            int iHashCode9 = (iHashCode8 + (num2 != null ? num2.hashCode() : 0)) * 31;
            Integer num3 = this.f377941j;
            int iHashCode10 = (iHashCode9 + (num3 != null ? num3.hashCode() : 0)) * 31;
            Boolean bool3 = this.f377942k;
            int iHashCode11 = (iHashCode10 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            Boolean bool4 = this.f377943l;
            int iHashCode12 = (iHashCode11 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
            Map<String, String> map = this.f377944m;
            int iHashCode13 = (iHashCode12 + (map != null ? map.hashCode() : 0)) * 31;
            Integer num4 = this.f377945n;
            int iHashCode14 = (iHashCode13 + (num4 != null ? num4.hashCode() : 0)) * 31;
            Boolean bool5 = this.f377946o;
            int iHashCode15 = (iHashCode14 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
            Boolean bool6 = this.f377947p;
            int iHashCode16 = (iHashCode15 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
            Boolean bool7 = this.f377948q;
            return iHashCode16 + (bool7 != null ? bool7.hashCode() : 0);
        }

        @Override // com.yandex.metrica.impl.ob.Dg
        @j.N
        public a a(@j.N a aVar) {
            String str = this.f377932a;
            String str2 = aVar.f377932a;
            if (str == null) {
                str = str2;
            }
            String str3 = this.f377933b;
            String str4 = aVar.f377933b;
            if (str3 == null) {
                str3 = str4;
            }
            String str5 = this.f377934c;
            String str6 = aVar.f377934c;
            if (str5 == null) {
                str5 = str6;
            }
            String str7 = this.f377935d;
            String str8 = aVar.f377935d;
            if (str7 == null) {
                str7 = str8;
            }
            Boolean bool = this.f377936e;
            Boolean bool2 = aVar.f377936e;
            if (bool == null) {
                bool = bool2;
            }
            Location location = this.f377937f;
            Location location2 = aVar.f377937f;
            if (location == null) {
                location = location2;
            }
            Boolean bool3 = this.f377938g;
            Boolean bool4 = aVar.f377938g;
            if (bool3 == null) {
                bool3 = bool4;
            }
            Integer num = this.f377939h;
            Integer num2 = aVar.f377939h;
            if (num == null) {
                num = num2;
            }
            Integer num3 = this.f377940i;
            Integer num4 = aVar.f377940i;
            if (num3 == null) {
                num3 = num4;
            }
            Integer num5 = this.f377941j;
            Integer num6 = aVar.f377941j;
            if (num5 == null) {
                num5 = num6;
            }
            Boolean bool5 = this.f377942k;
            Boolean bool6 = aVar.f377942k;
            if (bool5 == null) {
                bool5 = bool6;
            }
            Boolean bool7 = this.f377943l;
            Boolean bool8 = aVar.f377943l;
            if (bool7 == null) {
                bool7 = bool8;
            }
            Map<String, String> map = this.f377944m;
            Map<String, String> map2 = aVar.f377944m;
            if (map == null) {
                map = map2;
            }
            Integer num7 = this.f377945n;
            Map<String, String> map3 = map;
            Integer num8 = aVar.f377945n;
            if (num7 == null) {
                num7 = num8;
            }
            Boolean bool9 = this.f377946o;
            Integer num9 = num7;
            Boolean bool10 = bool9 == null ? aVar.f377946o : bool9;
            Boolean bool11 = this.f377947p;
            Boolean bool12 = bool11 == null ? aVar.f377947p : bool11;
            Boolean bool13 = this.f377948q;
            return new a(str, str3, str5, str7, bool, location, bool3, num, num3, num5, bool5, bool7, map3, num9, bool10, bool12, bool13 == null ? aVar.f377948q : bool13);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(@j.N CounterConfiguration counterConfiguration, @j.P Map<String, String> map) {
            Boolean asBoolean;
            String asString = counterConfiguration.f377493b.getAsString("CFG_DEVICE_SIZE_TYPE");
            String asString2 = counterConfiguration.f377493b.getAsString("CFG_APP_VERSION");
            String asString3 = counterConfiguration.f377493b.getAsString("CFG_APP_VERSION_CODE");
            String strC = counterConfiguration.c();
            Boolean asBoolean2 = counterConfiguration.f377493b.getAsBoolean("CFG_LOCATION_TRACKING");
            ContentValues contentValues = counterConfiguration.f377493b;
            Location location = null;
            if (contentValues.containsKey("CFG_MANUAL_LOCATION")) {
                byte[] asByteArray = contentValues.getAsByteArray("CFG_MANUAL_LOCATION");
                int i12 = C39194vc.f382050q;
                if (asByteArray != null) {
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(asByteArray, 0, asByteArray.length);
                        parcelObtain.setDataPosition(0);
                        Location location2 = (Location) parcelObtain.readValue(Location.class.getClassLoader());
                        parcelObtain.recycle();
                        location = location2;
                    } catch (Throwable unused) {
                        parcelObtain.recycle();
                    }
                }
            }
            Boolean asBoolean3 = counterConfiguration.f377493b.getAsBoolean("CFG_IS_FIRST_ACTIVATION_AS_UPDATE");
            Integer asInteger = counterConfiguration.f377493b.getAsInteger("CFG_SESSION_TIMEOUT");
            Integer asInteger2 = counterConfiguration.f377493b.getAsInteger("CFG_MAX_REPORTS_COUNT");
            Integer asInteger3 = counterConfiguration.f377493b.getAsInteger("CFG_DISPATCH_PERIOD");
            Boolean asBoolean4 = counterConfiguration.f377493b.getAsBoolean("CFG_IS_LOG_ENABLED");
            Boolean asBoolean5 = counterConfiguration.f377493b.getAsBoolean("CFG_STATISTICS_SENDING");
            Integer asInteger4 = counterConfiguration.f377493b.getAsInteger("MAX_REPORTS_IN_DB_COUNT");
            Boolean asBoolean6 = counterConfiguration.f377493b.getAsBoolean("CFG_NATIVE_CRASHES_ENABLED");
            Boolean asBoolean7 = counterConfiguration.f377493b.getAsBoolean("CFG_LOCATION_ALLOWED_BY_BRIDGE");
            synchronized (counterConfiguration) {
                asBoolean = counterConfiguration.f377493b.getAsBoolean("CFG_REVENUE_AUTO_TRACKING_ENABLED");
            }
            this(asString, asString2, asString3, strC, asBoolean2, location, asBoolean3, asInteger, asInteger2, asInteger3, asBoolean4, asBoolean5, map, asInteger4, asBoolean6, asBoolean7, asBoolean);
        }

        public a() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }
    }

    public D3(@j.N C39281z3 c39281z3) {
        this(new Mg.b(c39281z3), new a(c39281z3.b(), c39281z3.a().a()), c39281z3.a().c());
    }

    public D3(@j.N Mg.b bVar, @j.N a aVar, @j.P ResultReceiver resultReceiver) {
        this.f377929a = bVar;
        this.f377930b = aVar;
        this.f377931c = resultReceiver;
    }
}
