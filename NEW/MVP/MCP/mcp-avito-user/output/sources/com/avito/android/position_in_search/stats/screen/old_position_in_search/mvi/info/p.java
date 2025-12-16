package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: PositionInfoFeatureParams.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/p;", "", "a", "b", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/p$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/p$b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface p {

    /* compiled from: PositionInfoFeatureParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/p$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/p;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements p {

        /* renamed from: a, reason: collision with root package name */
        public final long f220553a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f220554b;

        public a(long j12, @Y61.k String str) {
            this.f220553a = j12;
            this.f220554b = str;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.p
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF220554b() {
            return this.f220554b;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.p
        /* renamed from: getItemId, reason: from getter */
        public final long getF220553a() {
            return this.f220553a;
        }
    }

    /* compiled from: PositionInfoFeatureParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/p$b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/p;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements p {
        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.p
        @Y61.k
        /* renamed from: a */
        public final String getF220554b() {
            return null;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.p
        /* renamed from: getItemId */
        public final long getF220553a() {
            return 0L;
        }
    }

    @Y61.k
    /* renamed from: a */
    String getF220554b();

    /* renamed from: getItemId */
    long getF220553a();
}
