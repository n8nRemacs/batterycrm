package NP0;

import kotlin.Metadata;

/* compiled from: WidgetFiltersOnboarding.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LNP0/r;", "", "a", "b", "LNP0/r$a;", "LNP0/r$b;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface r {

    /* compiled from: WidgetFiltersOnboarding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNP0/r$a;", "LNP0/r;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements r {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f11512a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        @Override // NP0.r
        @Y61.k
        public final String getName() {
            return "fastRecentSearches";
        }

        public final int hashCode() {
            return -798819561;
        }

        @Y61.k
        public final String toString() {
            return "FastRecentSearches";
        }
    }

    /* compiled from: WidgetFiltersOnboarding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNP0/r$b;", "LNP0/r;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements r {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f11513a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // NP0.r
        @Y61.k
        public final String getName() {
            return "flexSearch";
        }

        public final int hashCode() {
            return 184777931;
        }

        @Y61.k
        public final String toString() {
            return "FlexSearch";
        }
    }

    @Y61.k
    String getName();
}
