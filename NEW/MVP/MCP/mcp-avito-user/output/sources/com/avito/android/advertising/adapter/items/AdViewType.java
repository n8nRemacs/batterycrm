package com.avito.android.advertising.adapter.items;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdViewType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/AdViewType;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdViewType {

    /* renamed from: b, reason: collision with root package name */
    public static final AdViewType f86908b;

    /* renamed from: c, reason: collision with root package name */
    public static final AdViewType f86909c;

    /* renamed from: d, reason: collision with root package name */
    public static final AdViewType f86910d;

    /* renamed from: e, reason: collision with root package name */
    public static final AdViewType f86911e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AdViewType[] f86912f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f86913g;

    static {
        AdViewType adViewType = new AdViewType("LIST", 0);
        f86908b = adViewType;
        AdViewType adViewType2 = new AdViewType("GRID", 1);
        f86909c = adViewType2;
        AdViewType adViewType3 = new AdViewType("BIG", 2);
        f86910d = adViewType3;
        AdViewType adViewType4 = new AdViewType("SINGLE", 3);
        f86911e = adViewType4;
        AdViewType[] adViewTypeArr = {adViewType, adViewType2, adViewType3, adViewType4};
        f86912f = adViewTypeArr;
        f86913g = c.a(adViewTypeArr);
    }

    public AdViewType() {
        throw null;
    }

    public static AdViewType valueOf(String str) {
        return (AdViewType) Enum.valueOf(AdViewType.class, str);
    }

    public static AdViewType[] values() {
        return (AdViewType[]) f86912f.clone();
    }
}
