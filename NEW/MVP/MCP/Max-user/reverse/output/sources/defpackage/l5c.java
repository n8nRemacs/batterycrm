package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.apache.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class l5c extends c4 implements age {
    public final gn5 h;
    public final xs i;
    public final bwf j;
    public final bwf k;
    public final und l;
    public final und m;
    public final CopyOnWriteArraySet n;
    public final i3e o;

    public l5c(Context context, bx5 bx5Var, gn5 gn5Var) {
        super(context, "settings.prefs", bx5Var);
        this.h = gn5Var;
        this.i = new xs(1);
        this.j = new bwf(new st5(this, 1));
        this.k = new bwf(new st5(this, 2));
        this.l = new und(new st5(this, 3));
        this.m = new und(new p1b(context, 28));
        this.n = new CopyOnWriteArraySet();
        this.o = new i3e(1, this);
    }

    public final boolean j(Enum r2, boolean z) {
        return this.g.getBoolean(r2.name(), z);
    }

    public final List k(PmsKey pmsKey) {
        JSONArray jSONArray = null;
        String string = this.g.getString(pmsKey.name(), null);
        if (string != null) {
            try {
                jSONArray = new JSONArray(string);
            } catch (JSONException unused) {
            }
        }
        if (jSONArray == null) {
            return hd5.a;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
            } catch (Throwable unused2) {
            }
        }
        return arrayList;
    }

    public final String l() {
        return p(PmsKey.f70invitelink, "https://max.ru");
    }

    public final long m(Enum r4, long j) {
        Number numberValueOf;
        n18 n18Var = this.g;
        try {
            numberValueOf = Long.valueOf(n18Var.getLong(r4.name(), j));
        } catch (ClassCastException unused) {
            numberValueOf = Integer.valueOf(n18Var.getInt(r4.name(), (int) j));
        }
        return numberValueOf.longValue();
    }

    public final t86 n() {
        JSONObject jSONObjectD = d(PmsKey.f169ymap);
        if (jSONObjectD == null || jSONObjectD.length() == 0) {
            return null;
        }
        String strOptString = jSONObjectD.optString("tile");
        String strOptString2 = jSONObjectD.optString("geocoder");
        String strOptString3 = jSONObjectD.optString("static");
        String strOptString4 = jSONObjectD.optString("logoLight");
        String strOptString5 = jSONObjectD.optString("logoDark");
        boolean z = (strOptString4 == null || strOptString4.length() == 0) && (strOptString5 == null || strOptString5.length() == 0);
        if ((strOptString == null || strOptString.length() == 0) && ((strOptString2 == null || strOptString2.length() == 0) && ((strOptString3 == null || strOptString3.length() == 0) && z))) {
            return null;
        }
        return new t86(strOptString, strOptString2, strOptString3, strOptString4, strOptString5);
    }

    public final int o() {
        return (int) m(PmsKey.f80maxdescriptionlength, HttpStatus.SC_BAD_REQUEST);
    }

    public final String p(PmsKey pmsKey, String str) {
        String strT = t(pmsKey, str);
        if (strT != null) {
            return strT;
        }
        throw new IllegalArgumentException(("got null string value for " + pmsKey).toString());
    }

    public final List q(PmsKey pmsKey, List list) {
        List listE = e(pmsKey.name(), list);
        if (listE != null) {
            return listE;
        }
        throw new IllegalArgumentException(("got null stringlist value for " + pmsKey).toString());
    }

    public final int r() {
        return (int) (this.g.getFloat(PmsKey.f62imagequality.name(), 0.8f) * 100);
    }

    public final boolean s() {
        return j(PmsKey.f42draftssyncenabled, false);
    }

    public final String t(Enum r2, String str) {
        return this.g.getString(r2.name(), str);
    }
}
