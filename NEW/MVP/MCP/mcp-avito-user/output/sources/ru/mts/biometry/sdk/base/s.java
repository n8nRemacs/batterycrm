package ru.mts.biometry.sdk.base;

import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ s[] f436389b;

    static {
        s[] sVarArr = {new s("GALLERY", 0), new s("CAMERA", 1), new s("ALL", 2)};
        f436389b = sVarArr;
        c.a(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f436389b.clone();
    }
}
