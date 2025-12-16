package com.avito.android.map.analytics;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ParenType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/analytics/ParentType;", "", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ParentType {

    /* renamed from: b, reason: collision with root package name */
    public static final ParentType f184821b;

    /* renamed from: c, reason: collision with root package name */
    public static final ParentType f184822c;

    /* renamed from: d, reason: collision with root package name */
    public static final ParentType f184823d;

    /* renamed from: e, reason: collision with root package name */
    public static final ParentType f184824e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ParentType[] f184825f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f184826g;

    static {
        ParentType parentType = new ParentType("SERP", 0);
        f184821b = parentType;
        ParentType parentType2 = new ParentType("MAP", 1);
        f184822c = parentType2;
        ParentType parentType3 = new ParentType("ENTRANCE_TO_MAP", 2);
        f184823d = parentType3;
        ParentType parentType4 = new ParentType("SEARCH_PARAMS_CHANGE", 3);
        f184824e = parentType4;
        ParentType[] parentTypeArr = {parentType, parentType2, parentType3, parentType4};
        f184825f = parentTypeArr;
        f184826g = kotlin.enums.c.a(parentTypeArr);
    }

    public ParentType() {
        throw null;
    }

    public static ParentType valueOf(String str) {
        return (ParentType) Enum.valueOf(ParentType.class, str);
    }

    public static ParentType[] values() {
        return (ParentType[]) f184825f.clone();
    }
}
