package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.C37028k;

/* compiled from: DataCollectionArbiter.java */
/* loaded from: classes4.dex */
public class L {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f360917a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.firebase.g f360918b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f360919c;

    /* renamed from: d, reason: collision with root package name */
    public C37028k<Void> f360920d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f360921e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public Boolean f360922f;

    /* renamed from: g, reason: collision with root package name */
    public final C37028k<Void> f360923g;

    public L(com.google.firebase.g gVar) {
        Object obj = new Object();
        this.f360919c = obj;
        this.f360920d = new C37028k<>();
        this.f360921e = false;
        this.f360923g = new C37028k<>();
        gVar.a();
        Context context = gVar.f361595a;
        this.f360918b = gVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.f360917a = sharedPreferences;
        Boolean boolValueOf = sharedPreferences.contains("firebase_crashlytics_collection_enabled") ? Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true)) : null;
        this.f360922f = boolValueOf == null ? a(context) : boolValueOf;
        synchronized (obj) {
            try {
                if (b()) {
                    this.f360920d.d(null);
                    this.f360921e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @j.P
    public final Boolean a(Context context) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            packageManager = context.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
            com.google.firebase.crashlytics.internal.d.f361031a.b();
        }
        Boolean boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        if (boolValueOf == null) {
            return null;
        }
        return Boolean.valueOf(Boolean.TRUE.equals(boolValueOf));
    }

    public final synchronized boolean b() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.f360922f;
            zBooleanValue = bool != null ? bool.booleanValue() : this.f360918b.h();
            com.google.firebase.crashlytics.internal.d.f361031a.a(3);
        } catch (Throwable th2) {
            throw th2;
        }
        return zBooleanValue;
    }
}
