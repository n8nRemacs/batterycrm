package com.avito.android.charity;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CharitySource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/charity/CharitySource;", "", "_avito_charity_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CharitySource {

    /* renamed from: b, reason: collision with root package name */
    public static final CharitySource f118045b;

    /* renamed from: c, reason: collision with root package name */
    public static final CharitySource f118046c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CharitySource[] f118047d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f118048e;

    static {
        CharitySource charitySource = new CharitySource("SOA", 0);
        f118045b = charitySource;
        CharitySource charitySource2 = new CharitySource("PUBLISH", 1);
        f118046c = charitySource2;
        CharitySource[] charitySourceArr = {charitySource, charitySource2};
        f118047d = charitySourceArr;
        f118048e = kotlin.enums.c.a(charitySourceArr);
    }

    public CharitySource() {
        throw null;
    }

    public static CharitySource valueOf(String str) {
        return (CharitySource) Enum.valueOf(CharitySource.class, str);
    }

    public static CharitySource[] values() {
        return (CharitySource[]) f118047d.clone();
    }
}
