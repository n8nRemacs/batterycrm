package Dh0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.Image;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingReviewClickedItem.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"LDh0/a;", "", "a", "b", "c", "d", "e", "LDh0/a$a;", "LDh0/a$c;", "LDh0/a$d;", "LDh0/a$e;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dh0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC13400a {

    /* compiled from: RatingReviewClickedItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDh0/a$a;", "LDh0/a;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dh0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0184a implements InterfaceC13400a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BaseRatingReviewItem f3373a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f3374b;

        public C0184a(@k BaseRatingReviewItem baseRatingReviewItem, boolean z12) {
            this.f3373a = baseRatingReviewItem;
            this.f3374b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0184a)) {
                return false;
            }
            C0184a c0184a = (C0184a) obj;
            return L.f(this.f3373a, c0184a.f3373a) && this.f3374b == c0184a.f3374b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f3374b) + (this.f3373a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Actions(reviewItem=");
            sb2.append(this.f3373a);
            sb2.append(", isReviewAction=");
            return r.x(sb2, this.f3374b, ')');
        }
    }

    /* compiled from: RatingReviewClickedItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDh0/a$b;", "", "<init>", "()V", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dh0.a$b */
    public static final class b {
        static {
            new b();
        }
    }

    /* compiled from: RatingReviewClickedItem.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LDh0/a$c;", "LDh0/a;", "a", "b", "LDh0/a$c$a;", "LDh0/a$c$b;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dh0.a$c */
    public static abstract class c implements InterfaceC13400a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<Image> f3375a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3376b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Map<String, Object> f3377c;

        /* compiled from: RatingReviewClickedItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDh0/a$c$a;", "LDh0/a$c;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Dh0.a$c$a, reason: collision with other inner class name */
        public static final /* data */ class C0185a extends c {

            /* renamed from: d, reason: collision with root package name */
            @k
            public final List<Image> f3378d;

            /* renamed from: e, reason: collision with root package name */
            public final int f3379e;

            /* renamed from: f, reason: collision with root package name */
            @l
            public final Long f3380f;

            /* renamed from: g, reason: collision with root package name */
            @l
            public final Long f3381g;

            public C0185a(@k List<Image> list, int i12, @l Long l12, @l Long l13) {
                super(list, i12, l12, null, null);
                this.f3378d = list;
                this.f3379e = i12;
                this.f3380f = l12;
                this.f3381g = l13;
            }

            @Override // Dh0.InterfaceC13400a.c
            @k
            public final List<Image> a() {
                return this.f3378d;
            }

            @Override // Dh0.InterfaceC13400a.c
            /* renamed from: b, reason: from getter */
            public final int getF3376b() {
                return this.f3379e;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0185a)) {
                    return false;
                }
                C0185a c0185a = (C0185a) obj;
                return L.f(this.f3378d, c0185a.f3378d) && this.f3379e == c0185a.f3379e && L.f(this.f3380f, c0185a.f3380f) && L.f(this.f3381g, c0185a.f3381g);
            }

            public final int hashCode() {
                int iE2 = r.e(this.f3379e, this.f3378d.hashCode() * 31, 31);
                Long l12 = this.f3380f;
                int iHashCode = (iE2 + (l12 == null ? 0 : l12.hashCode())) * 31;
                Long l13 = this.f3381g;
                return iHashCode + (l13 != null ? l13.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Answer(images=");
                sb2.append(this.f3378d);
                sb2.append(", index=");
                sb2.append(this.f3379e);
                sb2.append(", reviewId=");
                sb2.append(this.f3380f);
                sb2.append(", answerId=");
                return m.m(sb2, this.f3381g, ')');
            }
        }

        /* compiled from: RatingReviewClickedItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDh0/a$c$b;", "LDh0/a$c;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Dh0.a$c$b */
        public static final /* data */ class b extends c {

            /* renamed from: d, reason: collision with root package name */
            @k
            public final List<Image> f3382d;

            /* renamed from: e, reason: collision with root package name */
            public final int f3383e;

            /* renamed from: f, reason: collision with root package name */
            @l
            public final Long f3384f;

            /* renamed from: g, reason: collision with root package name */
            @l
            public final Map<String, Object> f3385g;

            public b(@k List<Image> list, int i12, @l Long l12, @l Map<String, ? extends Object> map) {
                super(list, i12, l12, map, null);
                this.f3382d = list;
                this.f3383e = i12;
                this.f3384f = l12;
                this.f3385g = map;
            }

            @Override // Dh0.InterfaceC13400a.c
            @k
            public final List<Image> a() {
                return this.f3382d;
            }

            @Override // Dh0.InterfaceC13400a.c
            /* renamed from: b, reason: from getter */
            public final int getF3376b() {
                return this.f3383e;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f3382d, bVar.f3382d) && this.f3383e == bVar.f3383e && L.f(this.f3384f, bVar.f3384f) && L.f(this.f3385g, bVar.f3385g);
            }

            public final int hashCode() {
                int iE2 = r.e(this.f3383e, this.f3382d.hashCode() * 31, 31);
                Long l12 = this.f3384f;
                int iHashCode = (iE2 + (l12 == null ? 0 : l12.hashCode())) * 31;
                Map<String, Object> map = this.f3385g;
                return iHashCode + (map != null ? map.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Review(images=");
                sb2.append(this.f3382d);
                sb2.append(", index=");
                sb2.append(this.f3383e);
                sb2.append(", reviewId=");
                sb2.append(this.f3384f);
                sb2.append(", analyticsParams=");
                return r.w(sb2, this.f3385g, ')');
            }
        }

        public c() {
            throw null;
        }

        public c(List list, int i12, Long l12, Map map, C42822w c42822w) {
            this.f3375a = list;
            this.f3376b = i12;
            this.f3377c = map;
        }

        @k
        public List<Image> a() {
            return this.f3375a;
        }

        /* renamed from: b, reason: from getter */
        public int getF3376b() {
            return this.f3376b;
        }
    }

    /* compiled from: RatingReviewClickedItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDh0/a$d;", "LDh0/a;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dh0.a$d */
    public static final /* data */ class d implements InterfaceC13400a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.rating_ui.reviews.model_review.a f3386a;

        public d(@k com.avito.android.rating_ui.reviews.model_review.a aVar) {
            this.f3386a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f3386a, ((d) obj).f3386a);
        }

        public final int hashCode() {
            return this.f3386a.hashCode();
        }

        @k
        public final String toString() {
            return "ModelActions(modelReviewItem=" + this.f3386a + ')';
        }
    }

    /* compiled from: RatingReviewClickedItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDh0/a$e;", "LDh0/a;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dh0.a$e */
    public static final /* data */ class e implements InterfaceC13400a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BaseRatingReviewItem f3387a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f3388b;

        public e(@k BaseRatingReviewItem baseRatingReviewItem, @k DeepLink deepLink) {
            this.f3387a = baseRatingReviewItem;
            this.f3388b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f3387a, eVar.f3387a) && L.f(this.f3388b, eVar.f3388b);
        }

        public final int hashCode() {
            return this.f3388b.hashCode() + (this.f3387a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Status(reviewItem=");
            sb2.append(this.f3387a);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f3388b, ')');
        }
    }
}
