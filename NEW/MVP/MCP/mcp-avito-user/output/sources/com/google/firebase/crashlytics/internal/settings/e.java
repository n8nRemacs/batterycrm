package com.google.firebase.crashlytics.internal.settings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SettingsCacheBehavior.java */
/* loaded from: classes4.dex */
final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f361465b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f361466c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f361467d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e[] f361468e;

    static {
        e eVar = new e("USE_CACHE", 0);
        f361465b = eVar;
        e eVar2 = new e("SKIP_CACHE_LOOKUP", 1);
        f361466c = eVar2;
        e eVar3 = new e("IGNORE_CACHE_EXPIRATION", 2);
        f361467d = eVar3;
        f361468e = new e[]{eVar, eVar2, eVar3};
    }

    public e() {
        throw null;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f361468e.clone();
    }
}
