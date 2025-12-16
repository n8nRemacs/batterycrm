package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class j0i implements o0i {
    public final long a;
    public final long b;
    public final Context c;
    public final lqh d;
    public final int e;
    public final String f;

    public j0i(long j, long j2, Context context, age ageVar) {
        StringBuilder sbL = az1.l(j2, "webapp_s_key_", "_");
        sbL.append(j);
        lqh lqhVar = new lqh(sbL.toString(), false);
        this.a = j;
        this.b = j2;
        this.c = context;
        this.d = lqhVar;
        this.e = (int) ((l5c) ageVar).m(PmsKey.f158webappsskeyscount, 10);
        this.f = j0i.class.getName();
    }

    @Override // defpackage.o0i
    public final Boolean a(String str, String str2) {
        Object ipdVar;
        SharedPreferences sharedPreferencesB = b();
        try {
            ipdVar = this.d.e(str2, null);
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (ipdVar instanceof ipd) {
            wqi.p(this.f, "Can't encrypt value", kpd.a(ipdVar));
            return Boolean.FALSE;
        }
        g8j.b(ipdVar);
        String str3 = (String) ipdVar;
        if (!sharedPreferencesB.contains(str) && sharedPreferencesB.getAll().size() == this.e) {
            return Boolean.FALSE;
        }
        sharedPreferencesB.edit().putString(str, str3).apply();
        return Boolean.TRUE;
    }

    public final SharedPreferences b() {
        StringBuilder sbL = az1.l(this.b, "webapp_ss_", "_");
        sbL.append(this.a);
        return this.c.getApplicationContext().getSharedPreferences(sbL.toString(), 0);
    }

    @Override // defpackage.o0i
    public final Boolean clear() {
        SharedPreferences sharedPreferencesB = b();
        if (sharedPreferencesB.getAll().isEmpty()) {
            return Boolean.FALSE;
        }
        this.d.c();
        sharedPreferencesB.edit().clear().apply();
        return Boolean.TRUE;
    }

    @Override // defpackage.o0i
    public final String get(String str) {
        Object ipdVar;
        String string = b().getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            ipdVar = this.d.d(string, null);
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        return (String) (ipdVar instanceof ipd ? null : ipdVar);
    }

    @Override // defpackage.o0i
    public final Boolean remove(String str) {
        SharedPreferences sharedPreferencesB = b();
        if (!sharedPreferencesB.contains(str)) {
            return Boolean.FALSE;
        }
        sharedPreferencesB.edit().remove(str).apply();
        return Boolean.TRUE;
    }
}
