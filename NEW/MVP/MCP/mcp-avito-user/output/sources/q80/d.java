package Q80;

import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1.AdditionalToast;
import kotlin.Metadata;

/* compiled from: ApiSearchPositionPeriodV1Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LQ80/d;", "", "a", "b", "LQ80/d$a;", "LQ80/d$b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface d {

    /* compiled from: ApiSearchPositionPeriodV1Response.kt */
    @P
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"LQ80/d$a;", "LQ80/d;", "Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/AdditionalToast;", "additionalToast", "LQ80/a;", "adviceBanner", "LQ80/e;", "chartData", "", "periodTitle", "LQ80/m;", "positionData", "LQ80/n;", "searchQueriesData", "<init>", "(Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/AdditionalToast;LQ80/a;LQ80/e;Ljava/lang/String;LQ80/m;LQ80/n;)V", "Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/AdditionalToast;", "a", "()Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/AdditionalToast;", "LQ80/a;", "b", "()LQ80/a;", "LQ80/e;", "c", "()LQ80/e;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "LQ80/m;", "e", "()LQ80/m;", "LQ80/n;", "f", "()LQ80/n;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements d {

        @com.google.gson.annotations.c("additionalToast")
        @Y61.l
        private final AdditionalToast additionalToast;

        @com.google.gson.annotations.c("adviceBanner")
        @Y61.l
        private final C14870a adviceBanner;

        @com.google.gson.annotations.c("chartData")
        @Y61.l
        private final e chartData;

        @com.google.gson.annotations.c("periodTitle")
        @Y61.k
        private final String periodTitle;

        @com.google.gson.annotations.c("positionData")
        @Y61.k
        private final m positionData;

        @com.google.gson.annotations.c("searchQueriesData")
        @Y61.l
        private final n searchQueriesData;

        public a(@Y61.l AdditionalToast additionalToast, @Y61.l C14870a c14870a, @Y61.l e eVar, @Y61.k String str, @Y61.k m mVar, @Y61.l n nVar) {
            this.additionalToast = additionalToast;
            this.adviceBanner = c14870a;
            this.chartData = eVar;
            this.periodTitle = str;
            this.positionData = mVar;
            this.searchQueriesData = nVar;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final AdditionalToast getAdditionalToast() {
            return this.additionalToast;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final C14870a getAdviceBanner() {
            return this.adviceBanner;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final e getChartData() {
            return this.chartData;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getPeriodTitle() {
            return this.periodTitle;
        }

        @Y61.k
        /* renamed from: e, reason: from getter */
        public final m getPositionData() {
            return this.positionData;
        }

        @Y61.l
        /* renamed from: f, reason: from getter */
        public final n getSearchQueriesData() {
            return this.searchQueriesData;
        }
    }

    /* compiled from: ApiSearchPositionPeriodV1Response.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LQ80/d$b;", "LQ80/d;", "Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/AdditionalToast;", "additionalToast", "LQ80/n;", "searchQueriesData", "<init>", "(Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/AdditionalToast;LQ80/n;)V", "Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/AdditionalToast;", "a", "()Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/AdditionalToast;", "LQ80/n;", "b", "()LQ80/n;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements d {

        @com.google.gson.annotations.c("additionalToast")
        @Y61.l
        private final AdditionalToast additionalToast;

        @com.google.gson.annotations.c("searchQueriesData")
        @Y61.l
        private final n searchQueriesData;

        public b(@Y61.l AdditionalToast additionalToast, @Y61.l n nVar) {
            this.additionalToast = additionalToast;
            this.searchQueriesData = nVar;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final AdditionalToast getAdditionalToast() {
            return this.additionalToast;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final n getSearchQueriesData() {
            return this.searchQueriesData;
        }
    }
}
