package com.avito.android.review.report.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import bn0.C25683a;
import com.avito.android.analytics.screens.mvi.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ComfortableDealReviewsInternalAction.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/review/report/mvi/entity/ComfortableDealReviewsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "<init>", "()V", "BackPressed", "ReviewsLoaded", "Lcom/avito/android/review/report/mvi/entity/ComfortableDealReviewsInternalAction$BackPressed;", "Lcom/avito/android/review/report/mvi/entity/ComfortableDealReviewsInternalAction$ReviewsLoaded;", "_avito_comfortable-deal-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ComfortableDealReviewsInternalAction implements n {

    /* compiled from: ComfortableDealReviewsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/review/report/mvi/entity/ComfortableDealReviewsInternalAction$BackPressed;", "Lcom/avito/android/review/report/mvi/entity/ComfortableDealReviewsInternalAction;", "<init>", "()V", "_avito_comfortable-deal-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BackPressed extends ComfortableDealReviewsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final BackPressed f255413b = new BackPressed();

        private BackPressed() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof BackPressed);
        }

        public final int hashCode() {
            return 553159735;
        }

        @k
        public final String toString() {
            return "BackPressed";
        }
    }

    /* compiled from: ComfortableDealReviewsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/review/report/mvi/entity/ComfortableDealReviewsInternalAction$ReviewsLoaded;", "Lcom/avito/android/review/report/mvi/entity/ComfortableDealReviewsInternalAction;", "_avito_comfortable-deal-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReviewsLoaded extends ComfortableDealReviewsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<C25683a> f255414b;

        public ReviewsLoaded(@k List<C25683a> list) {
            super(null);
            this.f255414b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReviewsLoaded) && L.f(this.f255414b, ((ReviewsLoaded) obj).f255414b);
        }

        public final int hashCode() {
            return this.f255414b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ReviewsLoaded(reviews="), this.f255414b, ')');
        }
    }

    public /* synthetic */ ComfortableDealReviewsInternalAction(C42822w c42822w) {
        this();
    }

    private ComfortableDealReviewsInternalAction() {
    }
}
