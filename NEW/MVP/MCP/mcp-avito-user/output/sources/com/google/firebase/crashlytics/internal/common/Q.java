package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: IdManager.java */
/* loaded from: classes4.dex */
public class Q implements S {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f360932g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    public static final String f360933h = Pattern.quote("/");

    /* renamed from: a, reason: collision with root package name */
    public final T f360934a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f360935b;

    /* renamed from: c, reason: collision with root package name */
    public final String f360936c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.firebase.installations.i f360937d;

    /* renamed from: e, reason: collision with root package name */
    public final L f360938e;

    /* renamed from: f, reason: collision with root package name */
    public String f360939f;

    public Q(Context context, String str, com.google.firebase.installations.i iVar, L l12) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f360935b = context;
        this.f360936c = str;
        this.f360937d = iVar;
        this.f360938e = l12;
        this.f360934a = new T();
    }

    public static String b() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    @j.N
    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        String string = UUID.randomUUID().toString();
        lowerCase = string == null ? null : f360932g.matcher(string).replaceAll("").toLowerCase(Locale.US);
        com.google.firebase.crashlytics.internal.d.f361031a.a(2);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    @j.N
    public final synchronized String c() {
        String strB;
        try {
            String str = this.f360939f;
            if (str != null) {
                return str;
            }
            com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
            dVar.a(2);
            SharedPreferences sharedPreferences = this.f360935b.getSharedPreferences("com.google.firebase.crashlytics", 0);
            String string = sharedPreferences.getString("firebase.installation.id", null);
            dVar.a(2);
            if (this.f360938e.b()) {
                try {
                    strB = (String) e0.a(this.f360937d.getId());
                } catch (Exception unused) {
                    com.google.firebase.crashlytics.internal.d.f361031a.a(5);
                    strB = null;
                }
                com.google.firebase.crashlytics.internal.d.f361031a.a(2);
                if (strB == null) {
                    strB = string == null ? b() : string;
                }
                if (strB.equals(string)) {
                    this.f360939f = sharedPreferences.getString("crashlytics.installation.id", null);
                } else {
                    this.f360939f = a(sharedPreferences, strB);
                }
            } else if (string == null || !string.startsWith("SYN_")) {
                this.f360939f = a(sharedPreferences, b());
            } else {
                this.f360939f = sharedPreferences.getString("crashlytics.installation.id", null);
            }
            if (this.f360939f == null) {
                com.google.firebase.crashlytics.internal.d.f361031a.a(5);
                this.f360939f = a(sharedPreferences, b());
            }
            com.google.firebase.crashlytics.internal.d.f361031a.a(2);
            return this.f360939f;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final String d() {
        String str;
        T t12 = this.f360934a;
        Context context = this.f360935b;
        synchronized (t12) {
            try {
                if (t12.f360940a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    t12.f360940a = installerPackageName;
                }
                str = "".equals(t12.f360940a) ? null : t12.f360940a;
            } finally {
            }
        }
        return str;
    }
}
