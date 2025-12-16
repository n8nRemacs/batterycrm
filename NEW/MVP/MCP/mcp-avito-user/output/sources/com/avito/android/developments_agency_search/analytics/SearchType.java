package com.avito.android.developments_agency_search.analytics;

import Y61.k;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnalyticsEnums.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/analytics/SearchType;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchType {

    /* renamed from: c, reason: collision with root package name */
    public static final SearchType f136331c;

    /* renamed from: d, reason: collision with root package name */
    public static final SearchType f136332d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SearchType[] f136333e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f136334f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f136335b;

    static {
        SearchType searchType = new SearchType("DEVELOPMENT", 0, "jk");
        f136331c = searchType;
        SearchType searchType2 = new SearchType("LOTS", 1, "flat");
        f136332d = searchType2;
        SearchType[] searchTypeArr = {searchType, searchType2};
        f136333e = searchTypeArr;
        f136334f = kotlin.enums.c.a(searchTypeArr);
    }

    public SearchType(String str, int i12, String str2) {
        this.f136335b = str2;
    }

    public static SearchType valueOf(String str) {
        return (SearchType) Enum.valueOf(SearchType.class, str);
    }

    public static SearchType[] values() {
        return (SearchType[]) f136333e.clone();
    }
}
