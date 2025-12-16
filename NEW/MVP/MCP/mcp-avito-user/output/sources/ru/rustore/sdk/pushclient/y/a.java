package ru.rustore.sdk.pushclient.y;

import ru.rustore.sdk.coreui.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class a implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f436855b = {new a("UNKNOWN_FEATURE", 0), new a("BACKGROUND_WORK_UNAVAILABLE", 1), new a("RU_STORE_NOT_INSTALLED", 2), new a("RU_STORE_OUTDATED", 3), new a("USER_NOT_AUTHORIZED", 4), new a("ERROR", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    a EF5;

    public a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f436855b.clone();
    }
}
