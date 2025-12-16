package ru.mts.biometry.sdk.view;

import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b[] f436594b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f436595c;

    static {
        b[] bVarArr = {new b("PRIMARY", 0), new b("SECONDARY", 1)};
        f436594b = bVarArr;
        f436595c = c.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f436594b.clone();
    }
}
