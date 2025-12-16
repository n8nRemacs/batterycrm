package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: PeriodInfoFeatureParams.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/w;", "", "a", "b", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/w$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/w$b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface w {

    /* compiled from: PeriodInfoFeatureParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/w$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/w;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements w {
        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.w
        @Y61.k
        public final String a() {
            return null;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.w
        @Y61.k
        /* renamed from: b */
        public final String getF220690b() {
            return null;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.w
        /* renamed from: getItemId */
        public final long getF220689a() {
            return 0L;
        }
    }

    /* compiled from: PeriodInfoFeatureParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/w$b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/w;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements w {

        /* renamed from: a, reason: collision with root package name */
        public final long f220689a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f220690b;

        public b(long j12, @Y61.k String str) {
            this.f220689a = j12;
            this.f220690b = str;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.w
        @Y61.k
        public final String a() {
            return "SearchPositionPeriodInfoFeature";
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.w
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getF220690b() {
            return this.f220690b;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.w
        /* renamed from: getItemId, reason: from getter */
        public final long getF220689a() {
            return this.f220689a;
        }
    }

    @Y61.k
    String a();

    @Y61.k
    /* renamed from: b */
    String getF220690b();

    /* renamed from: getItemId */
    long getF220689a();
}
