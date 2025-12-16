package com.avito.android.favorite_comparison.presentation;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FavoriteComparisonAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/favorite_comparison/presentation/a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/favorite_comparison/presentation/a$a;", "Lcom/avito/android/favorite_comparison/presentation/a$b;", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class a {

    /* compiled from: FavoriteComparisonAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_comparison/presentation/a$a;", "Lcom/avito/android/favorite_comparison/presentation/a;", "<init>", "()V", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite_comparison.presentation.a$a, reason: collision with other inner class name */
    public static final class C4551a extends a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C4551a f155312a = new C4551a();

        public C4551a() {
            super(null);
        }
    }

    /* compiled from: FavoriteComparisonAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_comparison/presentation/a$b;", "Lcom/avito/android/favorite_comparison/presentation/a;", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f155313a;

        public b(@Y61.k DeepLink deepLink) {
            super(null);
            this.f155313a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f155313a, ((b) obj).f155313a);
        }

        public final int hashCode() {
            return this.f155313a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenLink(link="), this.f155313a, ')');
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}
