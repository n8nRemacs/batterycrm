package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public abstract class c4 {
    public final Context d;
    public final jve e = kve.b(0, Integer.MAX_VALUE, 1);
    public final String f;
    public final n18 g;

    public c4(Context context, String str, bx5 bx5Var) {
        this.d = context;
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: u3
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                this.a.e.h(qqg.a);
            }
        };
        this.f = "Prefs/".concat(dnf.q(str, ".prefs", ""));
        n18 n18Var = new n18(context, new ax5(str), bx5Var, new t9f(1, this), 8);
        n18Var.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        this.g = n18Var;
    }

    public void c() {
        wqi.c(this.f, "clear: %s", getClass().getSimpleName());
        yw5 yw5Var = (yw5) this.g.edit();
        yw5Var.clear();
        yw5Var.commit();
    }

    public final JSONObject d(PmsKey pmsKey) {
        String string = this.g.getString(pmsKey.name(), null);
        if (string != null) {
            try {
                return new JSONObject(string);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final List e(String str, List list) {
        JSONArray jSONArray = null;
        String string = this.g.getString(str, null);
        if (string != null) {
            try {
                jSONArray = new JSONArray(string);
            } catch (JSONException unused) {
            }
        }
        if (jSONArray == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                arrayList.add(jSONArray.getString(i));
            } catch (JSONException unused2) {
            }
        }
        return arrayList;
    }

    public final void f(String str, boolean z) {
        yw5 yw5Var = (yw5) this.g.edit();
        yw5Var.putBoolean(str, z);
        yw5Var.apply();
    }

    public final void g(int i, String str) {
        yw5 yw5Var = (yw5) this.g.edit();
        yw5Var.putInt(str, i);
        yw5Var.apply();
    }

    public final void h(long j, String str) {
        yw5 yw5Var = (yw5) this.g.edit();
        yw5Var.putLong(str, j);
        yw5Var.apply();
    }

    public final void i(String str, String str2) {
        yw5 yw5Var = (yw5) this.g.edit();
        yw5Var.putString(str, str2);
        yw5Var.apply();
    }
}
