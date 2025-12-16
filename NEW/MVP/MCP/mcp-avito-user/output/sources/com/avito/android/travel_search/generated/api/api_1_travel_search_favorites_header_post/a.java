package com.avito.android.travel_search.generated.api.api_1_travel_search_favorites_header_post;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.GuestsSelectParameter;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Api1TravelSearchFavoritesHeaderPostResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/a;", "", "a", "b", "c", "Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/a$a;", "Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/a$b;", "Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/a$c;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: Api1TravelSearchFavoritesHeaderPostResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/a$a;", "Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/a;", "", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.travel_search.generated.api.api_1_travel_search_favorites_header_post.a$a, reason: collision with other inner class name */
    public static final class C9277a implements a {

        @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
        @k
        private final String from;

        @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
        @k
        private final String to;

        public C9277a(@k String str, @k String str2) {
            this.from = str;
            this.to = str2;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getFrom() {
            return this.from;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getTo() {
            return this.to;
        }
    }

    /* compiled from: Api1TravelSearchFavoritesHeaderPostResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/a$b;", "Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/a;", "", GuestsSelectParameter.TYPE, "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        @com.google.gson.annotations.c(GuestsSelectParameter.TYPE)
        @k
        private final String guestsSelect;

        public b(@k String str) {
            this.guestsSelect = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getGuestsSelect() {
            return this.guestsSelect;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.guestsSelect, ((b) obj).guestsSelect);
        }

        public final int hashCode() {
            return this.guestsSelect.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("GuestsSelect(guestsSelect="), this.guestsSelect, ')');
        }
    }

    /* compiled from: Api1TravelSearchFavoritesHeaderPostResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/a$c;", "Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/a;", "", SearchParamsConverterKt.SORT, "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        @com.google.gson.annotations.c(SearchParamsConverterKt.SORT)
        @k
        private final String sort;

        public c(@k String str) {
            this.sort = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getSort() {
            return this.sort;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.sort, ((c) obj).sort);
        }

        public final int hashCode() {
            return this.sort.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Sort(sort="), this.sort, ')');
        }
    }
}
