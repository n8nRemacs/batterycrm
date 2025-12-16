package com.avito.android.serp.adapter;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SerpViewType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/SerpViewType;", "", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SerpViewType {

    /* renamed from: b, reason: collision with root package name */
    public static final SerpViewType f268582b;

    /* renamed from: c, reason: collision with root package name */
    public static final SerpViewType f268583c;

    /* renamed from: d, reason: collision with root package name */
    public static final SerpViewType f268584d;

    /* renamed from: e, reason: collision with root package name */
    public static final SerpViewType f268585e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ SerpViewType[] f268586f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f268587g;

    static {
        SerpViewType serpViewType = new SerpViewType("LIST", 0);
        f268582b = serpViewType;
        SerpViewType serpViewType2 = new SerpViewType("GRID", 1);
        f268583c = serpViewType2;
        SerpViewType serpViewType3 = new SerpViewType("BIG", 2);
        f268584d = serpViewType3;
        SerpViewType serpViewType4 = new SerpViewType("SINGLE", 3);
        f268585e = serpViewType4;
        SerpViewType[] serpViewTypeArr = {serpViewType, serpViewType2, serpViewType3, serpViewType4};
        f268586f = serpViewTypeArr;
        f268587g = kotlin.enums.c.a(serpViewTypeArr);
    }

    public SerpViewType() {
        throw null;
    }

    public static SerpViewType valueOf(String str) {
        return (SerpViewType) Enum.valueOf(SerpViewType.class, str);
    }

    public static SerpViewType[] values() {
        return (SerpViewType[]) f268586f.clone();
    }
}
