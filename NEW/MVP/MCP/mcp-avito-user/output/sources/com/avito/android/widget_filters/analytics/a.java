package com.avito.android.widget_filters.analytics;

import kotlin.Metadata;

/* compiled from: RecentSearchItemSource.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/widget_filters/analytics/a;", "", "a", "b", "Lcom/avito/android/widget_filters/analytics/a$a;", "Lcom/avito/android/widget_filters/analytics/a$b;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: RecentSearchItemSource.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/analytics/a$a;", "Lcom/avito/android/widget_filters/analytics/a;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.widget_filters.analytics.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10241a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C10241a f329704a = new C10241a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C10241a);
        }

        @Override // com.avito.android.widget_filters.analytics.a
        @Y61.k
        public final String getName() {
            return "search_widget_city";
        }

        public final int hashCode() {
            return 1692630295;
        }

        @Y61.k
        public final String toString() {
            return "SearchWidgetLocationInput";
        }
    }

    /* compiled from: RecentSearchItemSource.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/analytics/a$b;", "Lcom/avito/android/widget_filters/analytics/a;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f329705a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // com.avito.android.widget_filters.analytics.a
        @Y61.k
        public final String getName() {
            return "search_widget";
        }

        public final int hashCode() {
            return -653694864;
        }

        @Y61.k
        public final String toString() {
            return "SearchWidgetLocationWidgetExpanded";
        }
    }

    @Y61.k
    String getName();
}
