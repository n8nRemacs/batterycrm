package ru.mts.biometry.sdk.domain.entity.polling.status;

import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f436392b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f436393c;

    static {
        a[] aVarArr = {new a("expired", 0), new a("selfie_photo_mismatch", 1)};
        f436392b = aVarArr;
        f436393c = c.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f436392b.clone();
    }
}
