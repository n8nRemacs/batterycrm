package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class i0i implements o0i {
    public final long a;
    public final long b;
    public final Context c;
    public final int d;

    public i0i(long j, long j2, Context context, age ageVar) {
        this.a = j;
        this.b = j2;
        this.c = context;
        this.d = (int) ((l5c) ageVar).m(PmsKey.f157webappdskeyscount, 100);
    }

    @Override // defpackage.o0i
    public final Boolean a(String str, String str2) {
        SharedPreferences sharedPreferencesB = b();
        if (!sharedPreferencesB.contains(str) && sharedPreferencesB.getAll().size() == this.d) {
            return Boolean.FALSE;
        }
        sharedPreferencesB.edit().putString(str, str2).apply();
        return Boolean.TRUE;
    }

    public final SharedPreferences b() {
        StringBuilder sbL = az1.l(this.b, "webapp_ds_", "_");
        sbL.append(this.a);
        return this.c.getApplicationContext().getSharedPreferences(sbL.toString(), 0);
    }

    @Override // defpackage.o0i
    public final Boolean clear() {
        SharedPreferences sharedPreferencesB = b();
        if (sharedPreferencesB.getAll().isEmpty()) {
            return Boolean.FALSE;
        }
        sharedPreferencesB.edit().clear().apply();
        return Boolean.TRUE;
    }

    @Override // defpackage.o0i
    public final String get(String str) {
        return b().getString(str, null);
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
