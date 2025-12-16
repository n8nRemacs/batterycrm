package org.threeten.bp;

import androidx.compose.foundation.H;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: ZoneId.java */
/* loaded from: classes8.dex */
public abstract class o implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final Map<String, String> f422103b;
    private static final long serialVersionUID = 8352817235686L;

    /* compiled from: ZoneId.java */
    public class a implements org.threeten.bp.temporal.j<o> {
        @Override // org.threeten.bp.temporal.j
        public final o a(org.threeten.bp.temporal.d dVar) {
            return o.d(dVar);
        }
    }

    static {
        new a();
        HashMap map = new HashMap();
        map.put("ACT", "Australia/Darwin");
        map.put("AET", "Australia/Sydney");
        map.put("AGT", "America/Argentina/Buenos_Aires");
        map.put("ART", "Africa/Cairo");
        map.put("AST", "America/Anchorage");
        map.put("BET", "America/Sao_Paulo");
        map.put("BST", "Asia/Dhaka");
        map.put("CAT", "Africa/Harare");
        map.put("CNT", "America/St_Johns");
        map.put("CST", "America/Chicago");
        map.put("CTT", "Asia/Shanghai");
        map.put("EAT", "Africa/Addis_Ababa");
        map.put("ECT", "Europe/Paris");
        map.put("IET", "America/Indiana/Indianapolis");
        map.put("IST", "Asia/Kolkata");
        map.put("JST", "Asia/Tokyo");
        map.put("MIT", "Pacific/Apia");
        map.put("NET", "Asia/Yerevan");
        map.put("NST", "Pacific/Auckland");
        map.put("PLT", "Asia/Karachi");
        map.put("PNT", "America/Phoenix");
        map.put("PRT", "America/Puerto_Rico");
        map.put("PST", "America/Los_Angeles");
        map.put("SST", "Pacific/Guadalcanal");
        map.put("VST", "Asia/Ho_Chi_Minh");
        map.put("EST", "-05:00");
        map.put("MST", "-07:00");
        map.put("HST", "-10:00");
        f422103b = Collections.unmodifiableMap(map);
    }

    public o() {
        if (getClass() != q.class && getClass() != r.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static o d(org.threeten.bp.temporal.d dVar) {
        o oVar = (o) dVar.f(org.threeten.bp.temporal.i.f422201d);
        if (oVar != null) {
            return oVar;
        }
        throw new DateTimeException("Unable to obtain ZoneId from TemporalAccessor: " + dVar + ", type " + dVar.getClass().getName());
    }

    public static o p(String str) {
        w81.d.f(str, "zoneId");
        if (str.equals("Z")) {
            return q.f422106g;
        }
        if (str.length() == 1) {
            throw new DateTimeException("Invalid zone: ".concat(str));
        }
        if (str.startsWith("+") || str.startsWith("-")) {
            return q.u(str);
        }
        if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
            q qVar = q.f422106g;
            qVar.getClass();
            return new r(str, org.threeten.bp.zone.f.g(qVar));
        }
        if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
            q qVarU = q.u(str.substring(3));
            if (qVarU.f422109c == 0) {
                return new r(str.substring(0, 3), org.threeten.bp.zone.f.g(qVarU));
            }
            return new r(str.substring(0, 3) + qVarU.f422110d, org.threeten.bp.zone.f.g(qVarU));
        }
        if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
            return r.t(str, true);
        }
        q qVarU2 = q.u(str.substring(2));
        if (qVarU2.f422109c == 0) {
            return new r("UT", org.threeten.bp.zone.f.g(qVarU2));
        }
        return new r("UT" + qVarU2.f422110d, org.threeten.bp.zone.f.g(qVarU2));
    }

    public static o q(String str, q qVar) {
        w81.d.f(str, "prefix");
        w81.d.f(qVar, "offset");
        if (str.length() == 0) {
            return qVar;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("Invalid prefix, must be GMT, UTC or UT: ".concat(str));
        }
        if (qVar.f422109c == 0) {
            return new r(str, org.threeten.bp.zone.f.g(qVar));
        }
        StringBuilder sbR = H.r(str);
        sbR.append(qVar.f422110d);
        return new r(sbR.toString(), org.threeten.bp.zone.f.g(qVar));
    }

    public static o r() {
        String id2 = TimeZone.getDefault().getID();
        w81.d.f(id2, "zoneId");
        Map<String, String> map = f422103b;
        w81.d.f(map, "aliasMap");
        String str = map.get(id2);
        if (str != null) {
            id2 = str;
        }
        return p(id2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return h().equals(((o) obj).h());
        }
        return false;
    }

    public abstract String h();

    public int hashCode() {
        return h().hashCode();
    }

    public abstract org.threeten.bp.zone.f o();

    public abstract void s(ObjectOutput objectOutput);

    public String toString() {
        return h();
    }
}
