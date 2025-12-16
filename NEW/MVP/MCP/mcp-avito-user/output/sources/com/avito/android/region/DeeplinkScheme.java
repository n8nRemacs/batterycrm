package com.avito.android.region;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeeplinkScheme.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/region/DeeplinkScheme;", "", "_common_region_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DeeplinkScheme {

    /* renamed from: c, reason: collision with root package name */
    public static final DeeplinkScheme f252697c;

    /* renamed from: d, reason: collision with root package name */
    public static final DeeplinkScheme f252698d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ DeeplinkScheme[] f252699e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f252700f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f252701b;

    static {
        DeeplinkScheme deeplinkScheme = new DeeplinkScheme("MAIN", 0, "ru.avito");
        f252697c = deeplinkScheme;
        DeeplinkScheme deeplinkScheme2 = new DeeplinkScheme("GLOBAL", 1, "com.oberoniv");
        f252698d = deeplinkScheme2;
        DeeplinkScheme[] deeplinkSchemeArr = {deeplinkScheme, deeplinkScheme2};
        f252699e = deeplinkSchemeArr;
        f252700f = c.a(deeplinkSchemeArr);
    }

    public DeeplinkScheme(String str, int i12, String str2) {
        this.f252701b = str2;
    }

    public static DeeplinkScheme valueOf(String str) {
        return (DeeplinkScheme) Enum.valueOf(DeeplinkScheme.class, str);
    }

    public static DeeplinkScheme[] values() {
        return (DeeplinkScheme[]) f252699e.clone();
    }
}
