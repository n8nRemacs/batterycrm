package com.avito.android.developments_agency_search.screen.location_group.analytics;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LocationGroupAnalyticsEvents.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/analytics/SearchFiltersAction;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchFiltersAction {

    /* renamed from: c, reason: collision with root package name */
    public static final SearchFiltersAction f138070c;

    /* renamed from: d, reason: collision with root package name */
    public static final SearchFiltersAction f138071d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SearchFiltersAction[] f138072e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f138073f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f138074b;

    static {
        SearchFiltersAction searchFiltersAction = new SearchFiltersAction("APPLY", 0, "apply");
        f138070c = searchFiltersAction;
        SearchFiltersAction searchFiltersAction2 = new SearchFiltersAction("BACK", 1, "back");
        f138071d = searchFiltersAction2;
        SearchFiltersAction[] searchFiltersActionArr = {searchFiltersAction, searchFiltersAction2};
        f138072e = searchFiltersActionArr;
        f138073f = c.a(searchFiltersActionArr);
    }

    public SearchFiltersAction(String str, int i12, String str2) {
        this.f138074b = str2;
    }

    public static SearchFiltersAction valueOf(String str) {
        return (SearchFiltersAction) Enum.valueOf(SearchFiltersAction.class, str);
    }

    public static SearchFiltersAction[] values() {
        return (SearchFiltersAction[]) f138072e.clone();
    }
}
