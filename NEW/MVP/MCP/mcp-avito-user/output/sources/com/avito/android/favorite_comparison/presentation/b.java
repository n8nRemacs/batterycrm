package com.avito.android.favorite_comparison.presentation;

import androidx.compose.foundation.H;
import com.avito.android.comparison.remote.model.EmptyStateInfo;
import com.avito.android.remote.error.ApiError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FavoriteComparisonChange.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/favorite_comparison/presentation/b;", "", "<init>", "()V", "a", "b", "c", "d", "e", "Lcom/avito/android/favorite_comparison/presentation/b$a;", "Lcom/avito/android/favorite_comparison/presentation/b$b;", "Lcom/avito/android/favorite_comparison/presentation/b$c;", "Lcom/avito/android/favorite_comparison/presentation/b$d;", "Lcom/avito/android/favorite_comparison/presentation/b$e;", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class b {

    /* compiled from: FavoriteComparisonChange.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_comparison/presentation/b$a;", "Lcom/avito/android/favorite_comparison/presentation/b;", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<com.avito.android.favorite_comparison.presentation.items.comparison_list_item.a> f155314a;

        public a(@Y61.k List<com.avito.android.favorite_comparison.presentation.items.comparison_list_item.a> list) {
            super(null);
            this.f155314a = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f155314a, ((a) obj).f155314a);
        }

        public final int hashCode() {
            return this.f155314a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("ItemsLoaded(items="), this.f155314a, ')');
        }
    }

    /* compiled from: FavoriteComparisonChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_comparison/presentation/b$b;", "Lcom/avito/android/favorite_comparison/presentation/b;", "<init>", "()V", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite_comparison.presentation.b$b, reason: collision with other inner class name */
    public static final class C4552b extends b {
        static {
            new C4552b();
        }

        public C4552b() {
            super(null);
        }
    }

    /* compiled from: FavoriteComparisonChange.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_comparison/presentation/b$c;", "Lcom/avito/android/favorite_comparison/presentation/b;", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final EmptyStateInfo f155315a;

        public c(@Y61.k EmptyStateInfo emptyStateInfo) {
            super(null);
            this.f155315a = emptyStateInfo;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f155315a, ((c) obj).f155315a);
        }

        public final int hashCode() {
            return this.f155315a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "NoItems(emptyState=" + this.f155315a + ')';
        }
    }

    /* compiled from: FavoriteComparisonChange.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_comparison/presentation/b$d;", "Lcom/avito/android/favorite_comparison/presentation/b;", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f155316a;

        public d(@Y61.k ApiError apiError) {
            super(null);
            this.f155316a = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f155316a, ((d) obj).f155316a);
        }

        public final int hashCode() {
            return this.f155316a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.n(new StringBuilder("OverlayError(error="), this.f155316a, ')');
        }
    }

    /* compiled from: FavoriteComparisonChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_comparison/presentation/b$e;", "Lcom/avito/android/favorite_comparison/presentation/b;", "<init>", "()V", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f155317a = new e();

        public e() {
            super(null);
        }
    }

    public /* synthetic */ b(C42822w c42822w) {
        this();
    }

    public b() {
    }
}
