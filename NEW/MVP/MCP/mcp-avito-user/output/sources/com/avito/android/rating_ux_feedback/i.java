package com.avito.android.rating_ux_feedback;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RatingUxFeedbackPage.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_ux_feedback/i;", "", "a", "b", "c", "Lcom/avito/android/rating_ux_feedback/i$b;", "Lcom/avito/android/rating_ux_feedback/i$c;", "_avito_rating-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f250501a;

    /* compiled from: RatingUxFeedbackPage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_ux_feedback/i$a;", "", "<init>", "()V", "", "USER_REVIEWS_IDENTIFIER", "Ljava/lang/String;", "_avito_rating-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingUxFeedbackPage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_ux_feedback/i$b;", "Lcom/avito/android/rating_ux_feedback/i;", "<init>", "()V", "_avito_rating-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends i {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f250502b = new b();

        public b() {
            super(null, null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1479146280;
        }

        @k
        public final String toString() {
            return "UserProfile";
        }
    }

    /* compiled from: RatingUxFeedbackPage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_ux_feedback/i$c;", "Lcom/avito/android/rating_ux_feedback/i;", "<init>", "()V", "_avito_rating-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends i {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f250503b = new c();

        public c() {
            super("my_reviews", null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1406442086;
        }

        @k
        public final String toString() {
            return "UserReviews";
        }
    }

    static {
        new a(null);
    }

    public i(String str, C42822w c42822w) {
        this.f250501a = str;
    }
}
