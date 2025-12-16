package tg0;

import Dh0.InterfaceC13400a;
import Uc.C15508b;
import Uc.f;
import Uc.h;
import Y61.k;
import Y61.l;
import com.avito.android.account.E;
import com.avito.android.adapter.analytic.GalleryFromBlock;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.rating.details.RatingDetailsArguments;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import rh0.C47657a;

/* compiled from: RatingDetailsAnalyticsInteractor.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ltg0/c;", "Ltg0/b;", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* renamed from: tg0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C48670c implements InterfaceC48669b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f439384a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f439385b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final E f439386c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RatingDetailsArguments f439387d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final WD.a f439388e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f439389f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f439390g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f439391h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final ReviewsOpenPageFrom f439392i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f439393j;

    /* compiled from: RatingDetailsAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltg0/c$a;", "", "<init>", "()V", "", "ENCODED_PARAM", "Ljava/lang/String;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tg0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public C48670c(@k InterfaceC28373a interfaceC28373a, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k E e12, @k RatingDetailsArguments ratingDetailsArguments, @k WD.a aVar2, boolean z12, boolean z13) {
        this.f439384a = interfaceC28373a;
        this.f439385b = aVar;
        this.f439386c = e12;
        this.f439387d = ratingDetailsArguments;
        this.f439388e = aVar2;
        this.f439389f = z12;
        this.f439390g = z13;
        this.f439391h = ratingDetailsArguments.getF246408b();
        this.f439392i = ratingDetailsArguments.getF246409c();
    }

    public static Long m(RatingDetailsArguments ratingDetailsArguments) {
        if (ratingDetailsArguments instanceof RatingDetailsArguments.ItemReviews) {
            return Long.valueOf(((RatingDetailsArguments.ItemReviews) ratingDetailsArguments).f246412f);
        }
        if (ratingDetailsArguments instanceof RatingDetailsArguments.PublicProfileRating) {
            return ((RatingDetailsArguments.PublicProfileRating) ratingDetailsArguments).f246417h;
        }
        return null;
    }

    @Override // tg0.InterfaceC48669b
    public final void a() {
        String str = this.f439391h;
        if (str == null) {
            return;
        }
        this.f439384a.c(new Uc.g(str));
    }

    @Override // tg0.InterfaceC48669b
    public final void b(@k InterfaceC13400a.c cVar) {
        InterfaceC28464o c47657a;
        if (cVar instanceof InterfaceC13400a.c.b) {
            InterfaceC13400a.c.b bVar = (InterfaceC13400a.c.b) cVar;
            Map<String, Object> map = bVar.f3385g;
            Object obj = map != null ? map.get("reviewType") : null;
            c47657a = new N3.b(bVar.f3384f, bVar.f3383e, null, obj instanceof String ? (String) obj : null, 4, null);
        } else {
            if (!(cVar instanceof InterfaceC13400a.c.C0185a)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC13400a.c.C0185a c0185a = (InterfaceC13400a.c.C0185a) cVar;
            c47657a = new C47657a(c0185a.f3380f, ((InterfaceC13400a.c.C0185a) cVar).f3381g, c0185a.f3379e);
        }
        this.f439384a.c(c47657a);
    }

    @Override // tg0.InterfaceC48669b
    public final void c() {
        if (this.f439389f || this.f439390g || !this.f439393j) {
            RatingDetailsArguments ratingDetailsArguments = this.f439387d;
            boolean z12 = ratingDetailsArguments instanceof RatingDetailsArguments.UserRating;
            WD.a aVar = this.f439388e;
            if (z12) {
                aVar.b().b();
            } else if (ratingDetailsArguments instanceof RatingDetailsArguments.UserReviews) {
                aVar.a().b();
            } else if (!(ratingDetailsArguments instanceof RatingDetailsArguments.PublicProfileRating)) {
                boolean z13 = ratingDetailsArguments instanceof RatingDetailsArguments.ItemReviews;
            }
            this.f439393j = true;
        }
    }

    @Override // tg0.InterfaceC48669b
    public final void d(long j12) {
        this.f439384a.c(new Uc.d(this.f439391h, this.f439392i, m(this.f439387d), Long.valueOf(j12)));
    }

    @Override // tg0.InterfaceC48669b
    public final void e() {
        Uc.e eVar;
        RatingDetailsArguments ratingDetailsArguments = this.f439387d;
        if (ratingDetailsArguments instanceof RatingDetailsArguments.UserRating ? true : ratingDetailsArguments instanceof RatingDetailsArguments.UserReviews) {
            eVar = new Uc.e(null, null, ratingDetailsArguments.getF246409c(), 3, null);
        } else if (ratingDetailsArguments instanceof RatingDetailsArguments.PublicProfileRating) {
            eVar = new Uc.e(((RatingDetailsArguments.PublicProfileRating) ratingDetailsArguments).f246415f, null, ((RatingDetailsArguments.PublicProfileRating) ratingDetailsArguments).f246414e, 2, null);
        } else {
            if (!(ratingDetailsArguments instanceof RatingDetailsArguments.ItemReviews)) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = new Uc.e(null, String.valueOf(((RatingDetailsArguments.ItemReviews) ratingDetailsArguments).f246412f), ((RatingDetailsArguments.ItemReviews) ratingDetailsArguments).f246411e, 1, null);
        }
        this.f439384a.c(eVar);
    }

    @Override // tg0.InterfaceC48669b
    public final void f() {
        String strA = this.f439386c.a();
        String strValueOf = String.valueOf(m(this.f439387d));
        GalleryFromBlock[] galleryFromBlockArr = GalleryFromBlock.f68396b;
        this.f439384a.c(new N3.a(strA, strValueOf, "reviews"));
    }

    @Override // tg0.InterfaceC48669b
    public final void g() {
        this.f439384a.c(new C48668a());
    }

    @Override // tg0.InterfaceC48669b
    public final void h() {
        String strA = this.f439386c.a();
        Long lM2 = m(this.f439387d);
        this.f439384a.c(new N3.c(strA, lM2 != null ? lM2.toString() : null));
    }

    @Override // tg0.InterfaceC48669b
    public final void i(@l Long l12, @k BaseRatingReviewItem.ReviewStatus reviewStatus) {
        f.a aVar;
        if (reviewStatus == BaseRatingReviewItem.ReviewStatus.f250328g || reviewStatus == BaseRatingReviewItem.ReviewStatus.f250329h) {
            RatingDetailsArguments ratingDetailsArguments = this.f439387d;
            if (ratingDetailsArguments instanceof RatingDetailsArguments.UserRating) {
                aVar = f.a.b.f16523b;
            } else if (!(ratingDetailsArguments instanceof RatingDetailsArguments.UserReviews)) {
                return;
            } else {
                aVar = f.a.C1132a.f16522b;
            }
            this.f439384a.c(new Uc.f(l12, aVar));
        }
    }

    @Override // tg0.InterfaceC48669b
    public final void j(@l Long l12, boolean z12) {
        this.f439384a.c(new f(this.f439386c.a(), l12, null, 4, null));
        if (z12 && (this.f439387d instanceof RatingDetailsArguments.UserReviews)) {
            this.f439388e.c().b();
        }
    }

    @Override // tg0.InterfaceC48669b
    public final void k(@l DeepLink deepLink) {
        com.avito.android.deeplink_handler.handler.composite.b.a(this.f439385b, deepLink);
    }

    @Override // tg0.InterfaceC48669b
    public final void l(@l Boolean bool, @l String str, @l String str2, @l List list) {
        String str3 = this.f439391h;
        if (str3 == null) {
            return;
        }
        RatingDetailsArguments ratingDetailsArguments = this.f439387d;
        boolean z12 = ratingDetailsArguments instanceof RatingDetailsArguments.UserRating;
        InterfaceC28373a interfaceC28373a = this.f439384a;
        if (z12) {
            interfaceC28373a.c(new h(str3, this.f439392i, str, str2, bool));
        } else {
            if (ratingDetailsArguments instanceof RatingDetailsArguments.UserReviews) {
                interfaceC28373a.c(new g(str3));
                return;
            }
            if (ratingDetailsArguments instanceof RatingDetailsArguments.PublicProfileRating ? true : ratingDetailsArguments instanceof RatingDetailsArguments.ItemReviews) {
                interfaceC28373a.c(new C15508b(str3, this.f439392i, str, str2, bool, m(ratingDetailsArguments), null, null, null, list, 448, null));
            }
        }
    }
}
