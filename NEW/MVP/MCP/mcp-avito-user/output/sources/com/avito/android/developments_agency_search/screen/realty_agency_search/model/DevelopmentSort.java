package com.avito.android.developments_agency_search.screen.realty_agency_search.model;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchResultSortingTypes.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/model/DevelopmentSort;", "", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DevelopmentSort {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f138655b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final DevelopmentSort f138656c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ DevelopmentSort[] f138657d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f138658e;

    /* compiled from: SearchResultSortingTypes.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/model/DevelopmentSort$a;", "", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        DevelopmentSort developmentSort = new DevelopmentSort("BY_POPULARITY", 0);
        DevelopmentSort[] developmentSortArr = {developmentSort, new DevelopmentSort("BY_NAME", 1), new DevelopmentSort("BY_COMPLETION_QUARTER", 2), new DevelopmentSort("BY_PRICE_ASC", 3), new DevelopmentSort("BY_PRICE_DESC", 4)};
        f138657d = developmentSortArr;
        f138658e = c.a(developmentSortArr);
        f138655b = new a(null);
        f138656c = developmentSort;
    }

    public DevelopmentSort() {
        throw null;
    }

    public static DevelopmentSort valueOf(String str) {
        return (DevelopmentSort) Enum.valueOf(DevelopmentSort.class, str);
    }

    public static DevelopmentSort[] values() {
        return (DevelopmentSort[]) f138657d.clone();
    }
}
