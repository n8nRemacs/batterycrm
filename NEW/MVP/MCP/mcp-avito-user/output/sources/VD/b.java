package VD;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: RatingFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVD/b;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito-discouraged_avito-feature_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends A0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f16995i;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f16996b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f16997c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final A0.a f16998d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final A0.a f16999e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final A0.a f17000f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final A0.a f17001g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final A0.a f17002h;

    static {
        h0 h0Var = new h0(b.class, "hideReviewsForUnauth", "getHideReviewsForUnauth()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f16995i = new n[]{n0Var.i(h0Var), C0.k(b.class, "ratingSnippetStatusUserRatingRedesign", "getRatingSnippetStatusUserRatingRedesign()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(b.class, "ratingSnippetStatusUserRatingRedesignDebugGroup", "getRatingSnippetStatusUserRatingRedesignDebugGroup()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(b.class, "ratingSnippetStatusUserReviewsRedesign", "getRatingSnippetStatusUserReviewsRedesign()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(b.class, "ratingSnippetStatusUserReviewsRedesignDebugGroup", "getRatingSnippetStatusUserReviewsRedesignDebugGroup()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(b.class, "ratingPhotoGalleryEnabled", "getRatingPhotoGalleryEnabled()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(b.class, "ratingDetailsLoadingDelay", "getRatingDetailsLoadingDelay()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public b() {
        Owners owners = Owners.f210411H1;
        Boolean bool = Boolean.FALSE;
        this.f16996b = A0.u(this, "Закрыть отзывы под залогин. Все отзывы на всех видах профилей& Закон Горелкина заставил нас - мы сами и не хотели", "hideReviewsForUnauth", bool, false, 0, owners, 56);
        this.f16997c = A0.u(this, "Редизайн статуса отзыва в сниппете RAR'24 - Отзывы на пользователя в ЛК", "ratingSnippetStatusUserRatingRedesign", bool, false, 0, owners, 56);
        this.f16998d = A0.u(this, "Редизайн статуса отзыва в сниппете RAR'24 - Отзывы на пользователя в ЛК - переключатель групп", "ratingSnippetStatusUserRatingRedesignDebugGroup", new OptionSet("control", C42745f0.U("control", "test")), false, 0, owners, 40);
        this.f16999e = A0.u(this, "Редизайн статуса отзыва в сниппете RAR'24 - Отзывы, написанные пользователем", "ratingSnippetStatusUserReviewsRedesign", bool, false, 0, owners, 56);
        this.f17000f = A0.u(this, "Редизайн статуса отзыва в сниппете RAR'24 - Отзывы, написанные пользователем - переключатель групп", "ratingSnippetStatusUserReviewsRedesignDebugGroup", new OptionSet("control", C42745f0.U("control", "test")), false, 0, owners, 40);
        this.f17001g = A0.u(this, "Показываем галлерею отзывов на экране отзывов и карточке байера", "isServicesRatingPhotoGalleryEnabled", bool, false, 0, Owners.f210403F, 56);
        this.f17002h = A0.u(this, "Добавляем паузу перед загрузкой отзывов после добавления нового отзыва", "ratingDetailsLoadingDelay", Boolean.TRUE, false, 0, owners, 56);
    }
}
