package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class V1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f354940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f354941c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f354942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f354943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f354944f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ S1 f354945g;

    public V1(S1 s12, int i12, String str, Object obj, Object obj2, Object obj3) {
        this.f354940b = i12;
        this.f354941c = str;
        this.f354942d = obj;
        this.f354943e = obj2;
        this.f354944f = obj3;
        this.f354945g = s12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S1 s12 = this.f354945g;
        C36876f2 c36876f2 = s12.f355183a.f354716h;
        I2.d(c36876f2);
        if (!c36876f2.f355168b) {
            Log.println(6, s12.t(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (s12.f354886c == 0) {
            if (s12.f355183a.f354715g.v()) {
                s12.f354886c = 'C';
            } else {
                s12.f354886c = 'c';
            }
        }
        if (s12.f354887d < 0) {
            s12.f354887d = 84002L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.f354940b);
        char c12 = s12.f354886c;
        long j12 = s12.f354887d;
        Object obj = this.f354942d;
        String str = this.f354941c;
        String strK = S1.k(true, str, obj, this.f354943e, this.f354944f);
        StringBuilder sb2 = new StringBuilder("2");
        sb2.append(cCharAt);
        sb2.append(c12);
        sb2.append(j12);
        String strS = AK.c.s(sb2, ":", strK);
        if (strS.length() > 1024) {
            strS = str.substring(0, 1024);
        }
        C36904j2 c36904j2 = c36876f2.f355128f;
        if (c36904j2 != null) {
            C36876f2 c36876f22 = c36904j2.f355214e;
            c36876f22.e();
            if (c36876f22.m().getLong(c36904j2.f355210a, 0L) == 0) {
                c36904j2.a();
            }
            if (strS == null) {
                strS = "";
            }
            SharedPreferences sharedPreferencesM = c36876f22.m();
            String str2 = c36904j2.f355211b;
            long j13 = sharedPreferencesM.getLong(str2, 0L);
            String str3 = c36904j2.f355212c;
            if (j13 <= 0) {
                SharedPreferences.Editor editorEdit = c36876f22.m().edit();
                editorEdit.putString(str3, strS);
                editorEdit.putLong(str2, 1L);
                editorEdit.apply();
                return;
            }
            long j14 = j13 + 1;
            boolean z12 = (c36876f22.c().u0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j14;
            SharedPreferences.Editor editorEdit2 = c36876f22.m().edit();
            if (z12) {
                editorEdit2.putString(str3, strS);
            }
            editorEdit2.putLong(str2, j14);
            editorEdit2.apply();
        }
    }
}
