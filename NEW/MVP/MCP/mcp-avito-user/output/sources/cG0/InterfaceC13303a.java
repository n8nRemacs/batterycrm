package Cg0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_ui.info_with_hint.RatingInfoWithHintItem;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingDetailsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"LCg0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "LCg0/a$a;", "LCg0/a$b;", "LCg0/a$c;", "LCg0/a$d;", "LCg0/a$e;", "LCg0/a$f;", "LCg0/a$g;", "LCg0/a$h;", "LCg0/a$i;", "LCg0/a$j;", "LCg0/a$k;", "LCg0/a$l;", "LCg0/a$m;", "LCg0/a$n;", "LCg0/a$o;", "LCg0/a$p;", "LCg0/a$q;", "LCg0/a$r;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cg0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC13303a {

    /* compiled from: RatingDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCg0/a$a;", "LCg0/a;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cg0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0120a implements InterfaceC13303a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C0120a f2582a = new C0120a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C0120a);
        }

        public final int hashCode() {
            return -1459753301;
        }

        @Y61.k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: RatingDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCg0/a$b;", "LCg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cg0.a$b */
    public static final /* data */ class b implements InterfaceC13303a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Long f2583a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionAnswerLengthValidation f2584b;

        public b(@Y61.l Long l12, @Y61.l BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionAnswerLengthValidation reviewActionAnswerLengthValidation) {
            this.f2583a = l12;
            this.f2584b = reviewActionAnswerLengthValidation;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f2583a, bVar.f2583a) && L.f(this.f2584b, bVar.f2584b);
        }

        public final int hashCode() {
            Long l12 = this.f2583a;
            int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
            BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionAnswerLengthValidation reviewActionAnswerLengthValidation = this.f2584b;
            return iHashCode + (reviewActionAnswerLengthValidation != null ? reviewActionAnswerLengthValidation.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "OpenAddAnswerScreen(reviewId=" + this.f2583a + ", lengthValidation=" + this.f2584b + ')';
        }
    }

    /* compiled from: RatingDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCg0/a$c;", "LCg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cg0.a$c */
    public static final /* data */ class c implements InterfaceC13303a {

        /* renamed from: a, reason: collision with root package name */
        public final long f2585a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final BaseRatingReviewItem.ReviewAction.ConfirmDialog f2586b;

        public c(long j12, @Y61.k BaseRatingReviewItem.ReviewAction.ConfirmDialog confirmDialog) {
            this.f2585a = j12;
            this.f2586b = confirmDialog;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f2585a == cVar.f2585a && L.f(this.f2586b, cVar.f2586b);
        }

        public final int hashCode() {
            return this.f2586b.hashCode() + (Long.hashCode(this.f2585a) * 31);
        }

        @Y61.k
        public final String toString() {
            return "OpenDeleteBuyerReviewConfirmationDialog(reviewId=" + this.f2585a + ", reviewConfirmation=" + this.f2586b + ')';
        }
    }

    /* compiled from: RatingDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCg0/a$d;", "LCg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cg0.a$d */
    public static final /* data */ class d implements InterfaceC13303a {

        /* renamed from: a, reason: collision with root package name */
        public final long f2587a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final BaseRatingReviewItem.ReviewAction.ConfirmDialog f2588b;

        public d(long j12, @Y61.k BaseRatingReviewItem.ReviewAction.ConfirmDialog confirmDialog) {
            this.f2587a = j12;
            this.f2588b = confirmDialog;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f2587a == dVar.f2587a && L.f(this.f2588b, dVar.f2588b);
        }

        public final int hashCode() {
            return this.f2588b.hashCode() + (Long.hashCode(this.f2587a) * 31);
        }

        @Y61.k
        public final String toString() {
            return "OpenDeleteReviewConfirmationDialog(reviewId=" + this.f2587a + ", reviewConfirmation=" + this.f2588b + ')';
        }
    }

    /* compiled from: RatingDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCg0/a$e;", "LCg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cg0.a$e */
    public static final /* data */ class e implements InterfaceC13303a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<Image> f2589a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2590b;

        public e(@Y61.k List<Image> list, int i12) {
            this.f2589a = list;
            this.f2590b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f2589a, eVar.f2589a) && this.f2590b == eVar.f2590b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f2590b) + (this.f2589a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenGallery(images=");
            sb2.append(this.f2589a);
            sb2.append(", position=");
            return androidx.appcompat.app.r.t(sb2, this.f2590b, ')');
        }
    }

    /* compiled from: RatingDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCg0/a$f;", "LCg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cg0.a$f */
    public static final /* data */ class f implements InterfaceC13303a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final RatingInfoWithHintItem.Hint f2591a;

        public f(@Y61.k RatingInfoWithHintItem.Hint hint) {
            this.f2591a = hint;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f2591a, ((f) obj).f2591a);
        }

        public final int hashCode() {
            return this.f2591a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenInfoHintDialog(hint=" + this.f2591a + ')';
        }
    }

    /* compiled from: RatingDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCg0/a$g;", "LCg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cg0.a$g */
    public static final /* data */ class g implements InterfaceC13303a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Long f2592a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final BaseRatingReviewItem.ReviewAction.ReviewActionValue f2593b;

        public g(@Y61.l Long l12, @Y61.k BaseRatingReviewItem.ReviewAction.ReviewActionValue reviewActionValue) {
            this.f2592a = l12;
            this.f2593b = reviewActionValue;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f2592a, gVar.f2592a) && L.f(this.f2593b, gVar.f2593b);
        }

        public final int hashCode() {
            Long l12 = this.f2592a;
            return this.f2593b.hashCode() + ((l12 == null ? 0 : l12.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            return "OpenInfoScreen(reviewId=" + this.f2592a + ", value=" + this.f2593b + ')';
        }
    }

    /* compiled from: RatingDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCg0/a$h;", "LCg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cg0.a$h */
    public static final /* data */ class h implements InterfaceC13303a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.rating_ui.reviews.model_review.a f2594a;

        public h(@Y61.k com.avito.android.rating_ui.reviews.model_review.a aVar) {
            this.f2594a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f2594a, ((h) obj).f2594a);
        }

        public final int hashCode() {
            return this.f2594a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenModelReviewActionsDialog(modelReview=" + this.f2594a + ')';
        }
    }

    /* compiled from: RatingDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCg0/a$i;", "LCg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cg0.a$i */
    public static final /* data */ class i implements InterfaceC13303a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f2595a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f2596b;

        public i(@Y61.k String str, @Y61.k ArrayList arrayList) {
            this.f2595a = str;
            this.f2596b = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f2595a, iVar.f2595a) && this.f2596b.equals(iVar.f2596b);
        }

        public final int hashCode() {
            return this.f2596b.hashCode() + (this.f2595a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenRatingSummaryScreen(title=");
            sb2.append(this.f2595a);
            sb2.append(", summaryScoresData=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f2596b, ')');
        }
    }

    /* compiled from: RatingDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCg0/a$j;", "LCg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cg0.a$j */
    public static final /* data */ class j implements InterfaceC13303a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BaseRatingReviewItem f2597a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<BaseRatingReviewItem.ReviewAction> f2598b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f2599c;

        public j(@Y61.k BaseRatingReviewItem baseRatingReviewItem, @Y61.k List<BaseRatingReviewItem.ReviewAction> list, @Y61.l String str) {
            this.f2597a = baseRatingReviewItem;
            this.f2598b = list;
            this.f2599c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return L.f(this.f2597a, jVar.f2597a) && L.f(this.f2598b, jVar.f2598b) && L.f(this.f2599c, jVar.f2599c);
        }

        public final int hashCode() {
            int iE2 = H.e(this.f2597a.hashCode() * 31, 31, this.f2598b);
            String str = this.f2599c;
            return iE2 + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenReviewActionsDialog(reviewItem=");
            sb2.append(this.f2597a);
            sb2.append(", actions=");
            sb2.append(this.f2598b);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f2599c, ')');
        }
    }

    /* compiled from: RatingDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCg0/a$k;", "LCg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cg0.a$k */
    public static final /* data */ class k implements InterfaceC13303a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final GalleryItem f2600a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2601b;

        public k(@Y61.k GalleryItem galleryItem, int i12) {
            this.f2600a = galleryItem;
            this.f2601b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f2600a, kVar.f2600a) && this.f2601b == kVar.f2601b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f2601b) + (this.f2600a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenReviewGallery(galleryItem=");
            sb2.append(this.f2600a);
            sb2.append(", position=");
            return androidx.appcompat.app.r.t(sb2, this.f2601b, ')');
        }
    }

    /* compiled from: RatingDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCg0/a$l;", "LCg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cg0.a$l */
    public static final /* data */ class l implements InterfaceC13303a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f2602a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<SearchParametersEntry.SearchParametersBlock.Sort.SortOption> f2603b;

        public l(@Y61.l String str, @Y61.k List<SearchParametersEntry.SearchParametersBlock.Sort.SortOption> list) {
            this.f2602a = str;
            this.f2603b = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return L.f(this.f2602a, lVar.f2602a) && L.f(this.f2603b, lVar.f2603b);
        }

        public final int hashCode() {
            String str = this.f2602a;
            return this.f2603b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenSortDialog(selectedOption=");
            sb2.append(this.f2602a);
            sb2.append(", options=");
            return H.p(sb2, this.f2603b, ')');
        }
    }

    /* compiled from: RatingDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCg0/a$m;", "LCg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cg0.a$m */
    public static final /* data */ class m implements InterfaceC13303a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BaseRatingReviewItem.ReviewAction.ReviewActionValue f2604a;

        public m(@Y61.k BaseRatingReviewItem.ReviewAction.ReviewActionValue reviewActionValue) {
            this.f2604a = reviewActionValue;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f2604a, ((m) obj).f2604a);
        }

        public final int hashCode() {
            return this.f2604a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenTextSheet(actionValue=" + this.f2604a + ')';
        }
    }

    /* compiled from: RatingDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCg0/a$n;", "LCg0/a;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cg0.a$n */
    public static final /* data */ class n implements InterfaceC13303a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f2605a = new n();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -1322165328;
        }

        @Y61.k
        public final String toString() {
            return "PerformHapticFeedback";
        }
    }

    /* compiled from: RatingDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCg0/a$o;", "LCg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cg0.a$o */
    public static final /* data */ class o implements InterfaceC13303a {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            ((o) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        @Y61.k
        public final String toString() {
            return "RefreshScreen(withDelay=true)";
        }
    }

    /* compiled from: RatingDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCg0/a$p;", "LCg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cg0.a$p */
    public static final /* data */ class p implements InterfaceC13303a {

        /* renamed from: a, reason: collision with root package name */
        public final long f2606a;

        public p(long j12) {
            this.f2606a = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f2606a == ((p) obj).f2606a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f2606a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.u(new StringBuilder("ReviewDeletedExternal(reviewId="), this.f2606a, ')');
        }
    }

    /* compiled from: RatingDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCg0/a$r;", "LCg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cg0.a$r */
    public static final /* data */ class r implements InterfaceC13303a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f2613a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f2614b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.rating.details.mvi.entity.a f2615c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2616d;

        public r(@Y61.k String str, @Y61.l String str2, @Y61.l com.avito.android.rating.details.mvi.entity.a aVar, int i12) {
            this.f2613a = str;
            this.f2614b = str2;
            this.f2615c = aVar;
            this.f2616d = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return L.f(this.f2613a, rVar.f2613a) && L.f(this.f2614b, rVar.f2614b) && L.f(this.f2615c, rVar.f2615c) && this.f2616d == rVar.f2616d;
        }

        public final int hashCode() {
            int iHashCode = this.f2613a.hashCode() * 31;
            String str = this.f2614b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            com.avito.android.rating.details.mvi.entity.a aVar = this.f2615c;
            return Integer.hashCode(this.f2616d) + ((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowToastBar(message=");
            sb2.append(this.f2613a);
            sb2.append(", actionText=");
            sb2.append(this.f2614b);
            sb2.append(", action=");
            sb2.append(this.f2615c);
            sb2.append(", duration=");
            return androidx.appcompat.app.r.t(sb2, this.f2616d, ')');
        }

        public /* synthetic */ r(String str, String str2, com.avito.android.rating.details.mvi.entity.a aVar, int i12, int i13, C42822w c42822w) {
            this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : aVar, (i13 & 8) != 0 ? 2750 : i12);
        }
    }

    /* compiled from: RatingDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCg0/a$q;", "LCg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cg0.a$q */
    public static final /* data */ class q implements InterfaceC13303a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f2607a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Throwable f2608b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final PrintableText f2609c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.rating.details.mvi.entity.a f2610d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.rating.details.mvi.entity.a f2611e;

        /* renamed from: f, reason: collision with root package name */
        public final int f2612f;

        public q(@Y61.k PrintableText printableText, @Y61.l Throwable th2, @Y61.l PrintableText printableText2, @Y61.l com.avito.android.rating.details.mvi.entity.a aVar, @Y61.l com.avito.android.rating.details.mvi.entity.a aVar2, int i12) {
            this.f2607a = printableText;
            this.f2608b = th2;
            this.f2609c = printableText2;
            this.f2610d = aVar;
            this.f2611e = aVar2;
            this.f2612f = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return L.f(this.f2607a, qVar.f2607a) && L.f(this.f2608b, qVar.f2608b) && L.f(this.f2609c, qVar.f2609c) && L.f(this.f2610d, qVar.f2610d) && L.f(this.f2611e, qVar.f2611e) && this.f2612f == qVar.f2612f;
        }

        public final int hashCode() {
            int iHashCode = this.f2607a.hashCode() * 31;
            Throwable th2 = this.f2608b;
            int iHashCode2 = (iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31;
            PrintableText printableText = this.f2609c;
            int iHashCode3 = (iHashCode2 + (printableText == null ? 0 : printableText.hashCode())) * 31;
            com.avito.android.rating.details.mvi.entity.a aVar = this.f2610d;
            int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            com.avito.android.rating.details.mvi.entity.a aVar2 = this.f2611e;
            return Integer.hashCode(this.f2612f) + ((iHashCode4 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowErrorToastBar(message=");
            sb2.append(this.f2607a);
            sb2.append(", error=");
            sb2.append(this.f2608b);
            sb2.append(", actionText=");
            sb2.append(this.f2609c);
            sb2.append(", action=");
            sb2.append(this.f2610d);
            sb2.append(", onDismissedAction=");
            sb2.append(this.f2611e);
            sb2.append(", duration=");
            return androidx.appcompat.app.r.t(sb2, this.f2612f, ')');
        }

        public /* synthetic */ q(PrintableText printableText, Throwable th2, PrintableText printableText2, com.avito.android.rating.details.mvi.entity.a aVar, com.avito.android.rating.details.mvi.entity.a aVar2, int i12, int i13, C42822w c42822w) {
            this(printableText, th2, (i13 & 4) != 0 ? null : printableText2, (i13 & 8) != 0 ? null : aVar, (i13 & 16) != 0 ? null : aVar2, (i13 & 32) != 0 ? 2750 : i12);
        }
    }
}
