package com.avito.android.remote.autoteka.generated.api.get_step_products_v_3;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetStepProductsV3Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/GetProductsDataAnalytics;", "", "Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/GetProductsDataAnalytics$SearchType;", "searchType", "", "x", "<init>", "(Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/GetProductsDataAnalytics$SearchType;Ljava/lang/String;)V", "Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/GetProductsDataAnalytics$SearchType;", "a", "()Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/GetProductsDataAnalytics$SearchType;", "Ljava/lang/String;", "getX", "()Ljava/lang/String;", "SearchType", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GetProductsDataAnalytics {

    @c("searchType")
    @k
    private final SearchType searchType;

    @c("x")
    @k
    private final String x;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetStepProductsV3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/GetProductsDataAnalytics$SearchType;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "Int1", "Int2", "Int3", "Int4", "Int5", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SearchType {

        @c("1")
        public static final SearchType Int1;

        @c("2")
        public static final SearchType Int2;

        @c("3")
        public static final SearchType Int3;

        @c("4")
        public static final SearchType Int4;

        @c("5")
        public static final SearchType Int5;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SearchType[] f253282b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f253283c;

        static {
            SearchType searchType = new SearchType("Int1", 0, 1);
            Int1 = searchType;
            SearchType searchType2 = new SearchType("Int2", 1, 2);
            Int2 = searchType2;
            SearchType searchType3 = new SearchType("Int3", 2, 3);
            Int3 = searchType3;
            SearchType searchType4 = new SearchType("Int4", 3, 4);
            Int4 = searchType4;
            SearchType searchType5 = new SearchType("Int5", 4, 5);
            Int5 = searchType5;
            SearchType[] searchTypeArr = {searchType, searchType2, searchType3, searchType4, searchType5};
            f253282b = searchTypeArr;
            f253283c = kotlin.enums.c.a(searchTypeArr);
        }

        private SearchType(String str, int i12, int i13) {
        }

        public static SearchType valueOf(String str) {
            return (SearchType) Enum.valueOf(SearchType.class, str);
        }

        public static SearchType[] values() {
            return (SearchType[]) f253282b.clone();
        }
    }

    public GetProductsDataAnalytics(@k SearchType searchType, @k String str) {
        this.searchType = searchType;
        this.x = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final SearchType getSearchType() {
        return this.searchType;
    }
}
