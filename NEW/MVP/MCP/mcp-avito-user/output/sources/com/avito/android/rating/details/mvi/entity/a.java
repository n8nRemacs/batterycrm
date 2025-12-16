package com.avito.android.rating.details.mvi.entity;

import Dh0.InterfaceC13400a;
import android.os.Bundle;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.adapter.RatingDetailsItem;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating.details.answer.upload.ReviewReplyState;
import com.avito.android.rating.details.mvi.entity.b;
import com.avito.android.rating_ui.info_with_hint.RatingInfoWithHintItem;
import com.avito.android.rating_ui.reviews.model_review.ModelAction;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.review_action_network_request.ReviewActionNetworkRequestResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingDetailsAction.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u001e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f\u0082\u0001\u001e !\"#$%&'()*+,-./0123456789:;<=¨\u0006>"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "Lcom/avito/android/rating/details/mvi/entity/a$a;", "Lcom/avito/android/rating/details/mvi/entity/a$b;", "Lcom/avito/android/rating/details/mvi/entity/a$c;", "Lcom/avito/android/rating/details/mvi/entity/a$d;", "Lcom/avito/android/rating/details/mvi/entity/a$e;", "Lcom/avito/android/rating/details/mvi/entity/a$f;", "Lcom/avito/android/rating/details/mvi/entity/a$g;", "Lcom/avito/android/rating/details/mvi/entity/a$h;", "Lcom/avito/android/rating/details/mvi/entity/a$i;", "Lcom/avito/android/rating/details/mvi/entity/a$j;", "Lcom/avito/android/rating/details/mvi/entity/a$k;", "Lcom/avito/android/rating/details/mvi/entity/a$l;", "Lcom/avito/android/rating/details/mvi/entity/a$m;", "Lcom/avito/android/rating/details/mvi/entity/a$n;", "Lcom/avito/android/rating/details/mvi/entity/a$o;", "Lcom/avito/android/rating/details/mvi/entity/a$p;", "Lcom/avito/android/rating/details/mvi/entity/a$q;", "Lcom/avito/android/rating/details/mvi/entity/a$r;", "Lcom/avito/android/rating/details/mvi/entity/a$s;", "Lcom/avito/android/rating/details/mvi/entity/a$t;", "Lcom/avito/android/rating/details/mvi/entity/a$u;", "Lcom/avito/android/rating/details/mvi/entity/a$v;", "Lcom/avito/android/rating/details/mvi/entity/a$w;", "Lcom/avito/android/rating/details/mvi/entity/a$x;", "Lcom/avito/android/rating/details/mvi/entity/a$y;", "Lcom/avito/android/rating/details/mvi/entity/a$z;", "Lcom/avito/android/rating/details/mvi/entity/a$A;", "Lcom/avito/android/rating/details/mvi/entity/a$B;", "Lcom/avito/android/rating/details/mvi/entity/a$C;", "Lcom/avito/android/rating/details/mvi/entity/a$D;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$A;", "Lcom/avito/android/rating/details/mvi/entity/a;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class A implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final A f247380a = new A();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof A);
        }

        public final int hashCode() {
            return -880495660;
        }

        @Y61.k
        public final String toString() {
            return "ShowLoadingItem";
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$B;", "Lcom/avito/android/rating/details/mvi/entity/a;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class B implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final B f247381a = new B();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof B);
        }

        public final int hashCode() {
            return 1406978635;
        }

        @Y61.k
        public final String toString() {
            return "SortClicked";
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$C;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class C implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f247382a;

        public C(@Y61.k String str) {
            this.f247382a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C) && L.f(this.f247382a, ((C) obj).f247382a);
        }

        public final int hashCode() {
            return this.f247382a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SortOptionClicked(sortOption="), this.f247382a, ')');
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$D;", "Lcom/avito/android/rating/details/mvi/entity/a;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class D implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final D f247383a = new D();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof D);
        }

        public final int hashCode() {
            return -1377318102;
        }

        @Y61.k
        public final String toString() {
            return "SortTooltipShown";
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$a;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating.details.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C7421a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ReviewReplyState.Result f247384a;

        public C7421a(@Y61.k ReviewReplyState.Result result) {
            this.f247384a = result;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C7421a) && L.f(this.f247384a, ((C7421a) obj).f247384a);
        }

        public final int hashCode() {
            return this.f247384a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "AnswerAdded(state=" + this.f247384a + ')';
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$b;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating.details.mvi.entity.a$b, reason: case insensitive filesystem */
    public static final /* data */ class C34180b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f247385a;

        public C34180b(long j12) {
            this.f247385a = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C34180b) && this.f247385a == ((C34180b) obj).f247385a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f247385a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.u(new StringBuilder("AspectClicked(value="), this.f247385a, ')');
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$c;", "Lcom/avito/android/rating/details/mvi/entity/a;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating.details.mvi.entity.a$c, reason: case insensitive filesystem */
    public static final /* data */ class C34181c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C34181c f247386a = new C34181c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C34181c);
        }

        public final int hashCode() {
            return 468323627;
        }

        @Y61.k
        public final String toString() {
            return "AspectsTooltipShown";
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$d;", "Lcom/avito/android/rating/details/mvi/entity/a;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating.details.mvi.entity.a$d, reason: case insensitive filesystem */
    public static final /* data */ class C34182d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C34182d f247387a = new C34182d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C34182d);
        }

        public final int hashCode() {
            return -1352177388;
        }

        @Y61.k
        public final String toString() {
            return "CommentButtonClicked";
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$e;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f247388a;

        public e(boolean z12) {
            this.f247388a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f247388a == ((e) obj).f247388a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f247388a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("CommentButtonVisibilityChanged(isVisible="), this.f247388a, ')');
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$f;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f247389a;

        public f(long j12) {
            this.f247389a = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f247389a == ((f) obj).f247389a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f247389a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.u(new StringBuilder("DeleteBuyerReviewClicked(reviewId="), this.f247389a, ')');
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$g;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f247390a;

        public g(long j12) {
            this.f247390a = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f247390a == ((g) obj).f247390a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f247390a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.u(new StringBuilder("DeleteReviewClicked(reviewId="), this.f247390a, ')');
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$h;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final GalleryItem f247391a;

        /* renamed from: b, reason: collision with root package name */
        public final int f247392b;

        public h(@Y61.k GalleryItem galleryItem, int i12) {
            this.f247391a = galleryItem;
            this.f247392b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f247391a, hVar.f247391a) && this.f247392b == hVar.f247392b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f247392b) + (this.f247391a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GalleryImageClicked(galleryItem=");
            sb2.append(this.f247391a);
            sb2.append(", position=");
            return androidx.appcompat.app.r.t(sb2, this.f247392b, ')');
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$i;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f247393a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f247394b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Bundle f247395c;

        public i(DeepLink deepLink, String str, Bundle bundle, int i12, C42822w c42822w) {
            str = (i12 & 2) != 0 ? null : str;
            bundle = (i12 & 4) != 0 ? null : bundle;
            this.f247393a = deepLink;
            this.f247394b = str;
            this.f247395c = bundle;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f247393a, iVar.f247393a) && L.f(this.f247394b, iVar.f247394b) && L.f(this.f247395c, iVar.f247395c);
        }

        public final int hashCode() {
            int iHashCode = this.f247393a.hashCode() * 31;
            String str = this.f247394b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Bundle bundle = this.f247395c;
            return iHashCode2 + (bundle != null ? bundle.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f247393a);
            sb2.append(", requestKey=");
            sb2.append(this.f247394b);
            sb2.append(", args=");
            return H.m(sb2, this.f247395c, ')');
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$j;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ReviewActionNetworkRequestResult.Info f247396a;

        public j(@Y61.k ReviewActionNetworkRequestResult.Info info) {
            this.f247396a = info;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f247396a, ((j) obj).f247396a);
        }

        public final int hashCode() {
            return this.f247396a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "HandleNetworkRequestInfoResult(result=" + this.f247396a + ')';
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$k;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final RatingInfoWithHintItem f247397a;

        public k(@Y61.k RatingInfoWithHintItem ratingInfoWithHintItem) {
            this.f247397a = ratingInfoWithHintItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f247397a, ((k) obj).f247397a);
        }

        public final int hashCode() {
            return this.f247397a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "InfoItemClicked(clickedItem=" + this.f247397a + ')';
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$l;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f247398a;

        public l(@Y61.k String str) {
            this.f247398a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f247398a, ((l) obj).f247398a);
        }

        public final int hashCode() {
            return this.f247398a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("InlineBoolFilterClicked(paramName="), this.f247398a, ')');
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$m;", "Lcom/avito/android/rating/details/mvi/entity/a;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f247399a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -414212224;
        }

        @Y61.k
        public final String toString() {
            return "LoadingItemShown";
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$n;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.rating_ui.reviews.model_review.a f247400a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ModelAction f247401b;

        public n(@Y61.k com.avito.android.rating_ui.reviews.model_review.a aVar, @Y61.k ModelAction modelAction) {
            this.f247400a = aVar;
            this.f247401b = modelAction;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return L.f(this.f247400a, nVar.f247400a) && L.f(this.f247401b, nVar.f247401b);
        }

        public final int hashCode() {
            return this.f247401b.hashCode() + (this.f247400a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ModelReviewActionClicked(review=" + this.f247400a + ", action=" + this.f247401b + ')';
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$o;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final RatingDetailsItem f247402a;

        public o(@Y61.k RatingDetailsItem ratingDetailsItem) {
            this.f247402a = ratingDetailsItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f247402a, ((o) obj).f247402a);
        }

        public final int hashCode() {
            return this.f247402a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "RatingDetailsItemClicked(clickedItem=" + this.f247402a + ')';
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$p;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f247403a;

        public p(@Y61.k DeepLink deepLink) {
            this.f247403a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && L.f(this.f247403a, ((p) obj).f247403a);
        }

        public final int hashCode() {
            return this.f247403a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("RatingLLMSummaryButtonClicked(deeplink="), this.f247403a, ')');
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$q;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f247404a;

        public q(@Y61.k DeepLink deepLink) {
            this.f247404a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && L.f(this.f247404a, ((q) obj).f247404a);
        }

        public final int hashCode() {
            return this.f247404a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("RatingLLMSummaryInfoClicked(deeplink="), this.f247404a, ')');
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$r;", "Lcom/avito/android/rating/details/mvi/entity/a;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class r implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final r f247405a = new r();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return -2045735938;
        }

        @Y61.k
        public final String toString() {
            return "RequestReviewClicked";
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$s;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class s implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final b.e f247406a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f247407b;

        public s(@Y61.k b.e eVar, boolean z12) {
            this.f247406a = eVar;
            this.f247407b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return L.f(this.f247406a, sVar.f247406a) && this.f247407b == sVar.f247407b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f247407b) + (this.f247406a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RetryLoading(loadingProgressType=");
            sb2.append(this.f247406a);
            sb2.append(", withDelay=");
            return androidx.appcompat.app.r.x(sb2, this.f247407b, ')');
        }

        public /* synthetic */ s(b.e eVar, boolean z12, int i12, C42822w c42822w) {
            this(eVar, (i12 & 2) != 0 ? false : z12);
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$t;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class t implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f247408a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Bundle f247409b;

        public t(@Y61.k DeepLink deepLink, @Y61.l Bundle bundle) {
            this.f247408a = deepLink;
            this.f247409b = bundle;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return L.f(this.f247408a, tVar.f247408a) && L.f(this.f247409b, tVar.f247409b);
        }

        public final int hashCode() {
            int iHashCode = this.f247408a.hashCode() * 31;
            Bundle bundle = this.f247409b;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RevertAnswerClicked(deeplink=");
            sb2.append(this.f247408a);
            sb2.append(", args=");
            return H.m(sb2, this.f247409b, ')');
        }

        public /* synthetic */ t(DeepLink deepLink, Bundle bundle, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : bundle);
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$u;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class u implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f247410a;

        public u(@Y61.k DeepLink deepLink) {
            this.f247410a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && L.f(this.f247410a, ((u) obj).f247410a);
        }

        public final int hashCode() {
            return this.f247410a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("RevertReviewClicked(deeplink="), this.f247410a, ')');
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$v;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class v implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BaseRatingReviewItem f247411a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final BaseRatingReviewItem.ReviewAction f247412b;

        public v(@Y61.k BaseRatingReviewItem baseRatingReviewItem, @Y61.k BaseRatingReviewItem.ReviewAction reviewAction) {
            this.f247411a = baseRatingReviewItem;
            this.f247412b = reviewAction;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return L.f(this.f247411a, vVar.f247411a) && L.f(this.f247412b, vVar.f247412b);
        }

        public final int hashCode() {
            return this.f247412b.hashCode() + (this.f247411a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ReviewActionClicked(review=" + this.f247411a + ", action=" + this.f247412b + ')';
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$w;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class w implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f247413a;

        public w(long j12) {
            this.f247413a = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f247413a == ((w) obj).f247413a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f247413a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.u(new StringBuilder("ReviewDeletedExternal(reviewId="), this.f247413a, ')');
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$x;", "Lcom/avito/android/rating/details/mvi/entity/a;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class x implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final x f247414a = new x();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof x);
        }

        public final int hashCode() {
            return -1825888139;
        }

        @Y61.k
        public final String toString() {
            return "ReviewGalleryShown";
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$y;", "Lcom/avito/android/rating/details/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class y implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC13400a f247415a;

        public y(@Y61.k InterfaceC13400a interfaceC13400a) {
            this.f247415a = interfaceC13400a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && L.f(this.f247415a, ((y) obj).f247415a);
        }

        public final int hashCode() {
            return this.f247415a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReviewItemClicked(clickedItem=" + this.f247415a + ')';
        }
    }

    /* compiled from: RatingDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/a$z;", "Lcom/avito/android/rating/details/mvi/entity/a;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class z implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final z f247416a = new z();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof z);
        }

        public final int hashCode() {
            return -1942144093;
        }

        @Y61.k
        public final String toString() {
            return "ScreenshotTaken";
        }
    }
}
