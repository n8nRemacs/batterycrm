package D6;

import Y61.k;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.C27637a2;
import com.avito.android.R;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.advert.item.reviews.AdvertDetailsModelReviewItem;
import com.avito.android.advert.item.reviews.AdvertDetailsRatingLLMSummaryItem;
import com.avito.android.advert.item.reviews.AdvertDetailsReviewItem;
import com.avito.android.advert.item.reviews.AdvertDetailsReviewsScoreItem;
import com.avito.android.advert.item.reviews.entries.AdvertAttributedTextItem;
import com.avito.android.advert.item.reviews.entries.AdvertDetailsRatingBannerItem;
import com.avito.android.advert.item.reviews.entries.AdvertDetailsReviewsButtonItem;
import com.avito.android.advert.item.reviews.entries.AdvertReviewsStatisticItem;
import com.avito.android.advert.item.reviews.info.AdvertDetailsReviewsInfoItem;
import com.avito.android.advert.item.similars.j;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.gap.AdvertDetailsGapItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating_ui.button.BaseRatingButtonItem;
import com.avito.android.rating_ui.lmm_summary.BaseRatingLLMSummaryItem;
import com.avito.android.rating_ui.reviews.model_review.Author;
import com.avito.android.rating_ui.reviews.model_review.ReviewStatus;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.rating_ui.statistic.RatingStatisticRow;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.remote.model.item_reviews.BadgeScoreEntry;
import com.avito.android.remote.model.item_reviews.GalleryEntry;
import com.avito.android.remote.model.item_reviews.ItemReviewsEntry;
import com.avito.android.remote.model.item_reviews.ModelRatingEntry;
import com.avito.android.remote.model.item_reviews.RatingAttributedTextEntry;
import com.avito.android.remote.model.item_reviews.RatingBannerEntry;
import com.avito.android.remote.model.item_reviews.RatingButtonEntry;
import com.avito.android.remote.model.item_reviews.RatingEntry;
import com.avito.android.remote.model.item_reviews.RatingInfoEntry;
import com.avito.android.remote.model.item_reviews.RatingLLMSummaryEntry;
import com.avito.android.remote.model.item_reviews.RatingStatistic;
import com.avito.android.remote.model.item_reviews.RatingStatisticEntry;
import com.avito.android.remote.model.rating_details_mvi.PhotoGalleryContactBar;
import com.avito.android.remote.model.rating_details_mvi.PhotoGalleryReview;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: AdvertDetailsReviewsConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD6/b;", "LD6/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements D6.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f2929a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final VD.b f2930b;

    /* compiled from: AdvertDetailsReviewsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2931a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f2932b;

        static {
            int[] iArr = new int[ModelRatingEntry.ReviewStatus.values().length];
            try {
                iArr[ModelRatingEntry.ReviewStatus.PUBLISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModelRatingEntry.ReviewStatus.DECLINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ModelRatingEntry.ReviewStatus.MODERATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ModelRatingEntry.ReviewStatus.APPROVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f2931a = iArr;
            int[] iArr2 = new int[RatingButtonEntry.FillType.values().length];
            try {
                iArr2[RatingButtonEntry.FillType.FULL_WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RatingButtonEntry.FillType.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f2932b = iArr2;
        }
    }

    @Inject
    public b(@k j jVar, @k VD.b bVar) {
        this.f2929a = jVar;
        this.f2930b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    @Override // D6.a
    @k
    public final ArrayList a(@k List list, boolean z12, boolean z13, boolean z14) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C42784z0 c42784z0;
        C42784z0 c42784z02;
        BaseRatingButtonItem.FillType fillType;
        ReviewStatus reviewStatus;
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            ItemReviewsEntry itemReviewsEntry = (ItemReviewsEntry) obj;
            boolean z15 = itemReviewsEntry instanceof ModelRatingEntry;
            j jVar = this.f2929a;
            if (z15) {
                arrayList3.add(b(32));
                long j12 = i12;
                ModelRatingEntry modelRatingEntry = (ModelRatingEntry) itemReviewsEntry;
                long reviewId = modelRatingEntry.getReviewId();
                String scoreDescription = modelRatingEntry.getScoreDescription();
                String rated = modelRatingEntry.getRated();
                ModelRatingEntry.ReviewStatus status = modelRatingEntry.getStatus();
                if (status != null) {
                    int i14 = a.f2931a[status.ordinal()];
                    reviewStatus = i14 != 1 ? i14 != 2 ? i14 != 3 ? i14 != 4 ? ReviewStatus.f250165b : ReviewStatus.f250169f : ReviewStatus.f250168e : ReviewStatus.f250167d : ReviewStatus.f250166c;
                } else {
                    reviewStatus = null;
                }
                float score = modelRatingEntry.getScore();
                String title = modelRatingEntry.getTitle();
                String modelTitle = modelRatingEntry.getModelTitle();
                Author author = new Author(modelRatingEntry.getAuthor().getTitle(), modelRatingEntry.getAuthor().getAvatar());
                List<RatingEntry.TextSection> textSections = modelRatingEntry.getTextSections();
                if (textSections != null) {
                    List<RatingEntry.TextSection> list2 = textSections;
                    arrayList4 = new ArrayList(C42745f0.q(list2, 10));
                    for (RatingEntry.TextSection textSection : list2) {
                        arrayList4.add(new BaseRatingReviewItem.ReviewTextSection(textSection.getTitle(), textSection.getText(), null, false, 4, null));
                    }
                }
                arrayList3.add(new AdvertDetailsModelReviewItem(j12, Long.valueOf(reviewId), scoreDescription, rated, reviewStatus, Float.valueOf(score), title, modelTitle, author, arrayList4, C42784z0.f406748b, null, null, null, null, jVar.a(), false, null, modelRatingEntry.getStatusText(), null, null, modelRatingEntry.getRejectMessage(), false, 5992448, null));
            } else {
                int i15 = 16;
                if (itemReviewsEntry instanceof BadgeScoreEntry) {
                    arrayList3.add(b(16));
                    BadgeScoreEntry badgeScoreEntry = (BadgeScoreEntry) itemReviewsEntry;
                    DeepLink deeplink = badgeScoreEntry.getDeeplink();
                    AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
                    arrayList3.add(new AdvertDetailsReviewsScoreItem(115, null, badgeScoreEntry.getScoreValue(), badgeScoreEntry.getScoreText(), badgeScoreEntry.getCaption(), deeplink, null, jVar.a(), null, null, 834, null));
                } else if (itemReviewsEntry instanceof RatingStatisticEntry) {
                    arrayList3.add(b(2));
                    RatingStatisticEntry ratingStatisticEntry = (RatingStatisticEntry) itemReviewsEntry;
                    int reviewCount = ratingStatisticEntry.getReviewCount();
                    long j13 = i12;
                    List<RatingStatistic> statistic = ratingStatisticEntry.getStatistic();
                    ArrayList arrayList6 = new ArrayList(C42745f0.q(statistic, 10));
                    for (RatingStatistic ratingStatistic : statistic) {
                        arrayList6.add(new RatingStatisticRow(ratingStatistic.getCount() / ratingStatisticEntry.getReviewCount(), ratingStatistic.getTitle(), ratingStatistic.getScore()));
                    }
                    arrayList3.add(new AdvertReviewsStatisticItem(j13, reviewCount, arrayList6, null, null, null, jVar.getSpanCount(), null, 184, null));
                } else if (itemReviewsEntry instanceof RatingEntry) {
                    PersistableSpannedItem persistableSpannedItem = (PersistableSpannedItem) C42745f0.K(arrayList3.size() - 1, arrayList3);
                    if (persistableSpannedItem instanceof AdvertDetailsRatingLLMSummaryItem) {
                        i15 = 12;
                    } else if (persistableSpannedItem instanceof AdvertDetailsReviewItem) {
                        i15 = 24;
                    }
                    arrayList3.add(b(i15));
                    RatingEntry ratingEntry = (RatingEntry) itemReviewsEntry;
                    Image avatar = ratingEntry.getAvatar();
                    String title2 = ratingEntry.getTitle();
                    String rated2 = ratingEntry.getRated();
                    Float fValueOf = Float.valueOf(ratingEntry.getScore());
                    String stageTitle = ratingEntry.getStageTitle();
                    String itemTitle = ratingEntry.getItemTitle();
                    List<RatingEntry.TextSection> textSections2 = ratingEntry.getTextSections();
                    if (textSections2 != null) {
                        List<RatingEntry.TextSection> list3 = textSections2;
                        arrayList5 = new ArrayList(C42745f0.q(list3, 10));
                        for (RatingEntry.TextSection textSection2 : list3) {
                            arrayList5.add(new BaseRatingReviewItem.ReviewTextSection(textSection2.getTitle(), textSection2.getText(), null, false, 12, null));
                        }
                    }
                    arrayList3.add(new AdvertDetailsReviewItem(0L, null, avatar, title2, rated2, fValueOf, stageTitle, itemTitle, arrayList5, null, jVar.a(), null, null, 6659, null));
                } else if (itemReviewsEntry instanceof RatingAttributedTextEntry) {
                    arrayList3.add(b(16));
                    arrayList3.add(new AdvertAttributedTextItem(i12, null, jVar.a(), null, null, ((RatingAttributedTextEntry) itemReviewsEntry).getAttributedText(), null, 90, null));
                } else if (itemReviewsEntry instanceof RatingInfoEntry) {
                    arrayList3.add(b(16));
                    RatingInfoEntry ratingInfoEntry = (RatingInfoEntry) itemReviewsEntry;
                    arrayList3.add(new AdvertDetailsReviewsInfoItem(i12, ratingInfoEntry.getTitle(), ratingInfoEntry.getSubtitle(), z14 ? R.attr.textH25 : z12 ? R.attr.textH20 : R.attr.textH3, null, null, jVar.a(), null, null, 432, null));
                } else if (itemReviewsEntry instanceof RatingButtonEntry) {
                    RatingButtonEntry ratingButtonEntry = (RatingButtonEntry) itemReviewsEntry;
                    if (ratingButtonEntry.getAction() != null) {
                        arrayList3.add(b(12));
                        long j14 = i12;
                        int iA2 = jVar.a();
                        int i16 = a.f2932b[ratingButtonEntry.getType().ordinal()];
                        if (i16 == 1) {
                            fillType = BaseRatingButtonItem.FillType.f249982b;
                        } else {
                            if (i16 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fillType = BaseRatingButtonItem.FillType.f249983c;
                        }
                        arrayList3.add(new AdvertDetailsReviewsButtonItem(j14, null, iA2, null, null, fillType, ratingButtonEntry.getAction(), null, z14, 154, null));
                    } else {
                        continue;
                    }
                } else if (itemReviewsEntry instanceof GalleryEntry) {
                    VD.b bVar = this.f2930b;
                    bVar.getClass();
                    n<Object> nVar = VD.b.f16995i[5];
                    if (((Boolean) bVar.f17001g.a().invoke()).booleanValue()) {
                        String strValueOf = String.valueOf(i12);
                        int iA3 = jVar.a();
                        GalleryEntry galleryEntry = (GalleryEntry) itemReviewsEntry;
                        List<PhotoGalleryReview> reviews = galleryEntry.getReviews();
                        if (reviews != null) {
                            List<PhotoGalleryReview> list4 = reviews;
                            ?? arrayList7 = new ArrayList(C42745f0.q(list4, 10));
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                arrayList7.add(C27637a2.b((PhotoGalleryReview) it.next()));
                            }
                            c42784z0 = arrayList7;
                        } else {
                            c42784z0 = C42784z0.f406748b;
                        }
                        Uri nextPage = galleryEntry.getNextPage();
                        PhotoGalleryContactBar contactBar = galleryEntry.getContactBar();
                        GalleryItem.GalleryContactBar galleryContactBarA = contactBar != null ? C27637a2.a(contactBar) : null;
                        String navigationTitle = galleryEntry.getNavigationTitle();
                        List<PhotoGalleryReview> reviews2 = galleryEntry.getReviews();
                        if (reviews2 != null) {
                            ?? arrayList8 = new ArrayList();
                            for (PhotoGalleryReview photoGalleryReview : reviews2) {
                                ArrayList arrayList9 = new ArrayList();
                                List<TnsGalleryImage> images = photoGalleryReview.getImages();
                                if (images != null) {
                                    Iterator it2 = images.iterator();
                                    while (it2.hasNext()) {
                                        arrayList9.add(new GalleryItem.GalleryImage((TnsGalleryImage) it2.next(), photoGalleryReview.getId()));
                                    }
                                    G0 g02 = G0.f406611a;
                                }
                                C42745f0.h(arrayList9, arrayList8);
                            }
                            c42784z02 = arrayList8;
                        } else {
                            c42784z02 = C42784z0.f406748b;
                        }
                        arrayList3.add(new GalleryItem(strValueOf, iA3, navigationTitle, c42784z0, galleryContactBarA, c42784z02, y6.b(0), y6.b(16), null, nextPage, 256, null));
                    }
                } else if (itemReviewsEntry instanceof RatingLLMSummaryEntry) {
                    arrayList3.add(b(10));
                    AdvertDetailsItem advertDetailsItem2 = AdvertDetailsItem.f82525b;
                    long j15 = 117;
                    int iA4 = jVar.a();
                    RatingLLMSummaryEntry ratingLLMSummaryEntry = (RatingLLMSummaryEntry) itemReviewsEntry;
                    BaseRatingLLMSummaryItem.Title title3 = new BaseRatingLLMSummaryItem.Title(ratingLLMSummaryEntry.getTitle().getText(), ratingLLMSummaryEntry.getTitle().getAction());
                    List<RatingLLMSummaryEntry.Section> sections = ratingLLMSummaryEntry.getSections();
                    if (sections != null) {
                        List<RatingLLMSummaryEntry.Section> list5 = sections;
                        ArrayList arrayList10 = new ArrayList(C42745f0.q(list5, 10));
                        for (RatingLLMSummaryEntry.Section section : list5) {
                            arrayList10.add(new BaseRatingLLMSummaryItem.Section(section.getTitle(), section.getText()));
                        }
                        arrayList = arrayList10;
                    } else {
                        arrayList = null;
                    }
                    List<RatingLLMSummaryEntry.Button> buttons = ratingLLMSummaryEntry.getButtons();
                    if (buttons != null) {
                        List<RatingLLMSummaryEntry.Button> list6 = buttons;
                        ArrayList arrayList11 = new ArrayList(C42745f0.q(list6, 10));
                        for (RatingLLMSummaryEntry.Button button : list6) {
                            arrayList11.add(new BaseRatingLLMSummaryItem.Button(button.getTitle(), button.getAction()));
                        }
                        arrayList2 = arrayList11;
                    } else {
                        arrayList2 = null;
                    }
                    RatingLLMSummaryEntry.FeedbackSent feedbackSent = ratingLLMSummaryEntry.getFeedbackSent();
                    String title4 = feedbackSent != null ? feedbackSent.getTitle() : null;
                    RatingLLMSummaryEntry.FeedbackSent feedbackSent2 = ratingLLMSummaryEntry.getFeedbackSent();
                    arrayList3.add(new AdvertDetailsRatingLLMSummaryItem(j15, null, title3, arrayList, arrayList2, new BaseRatingLLMSummaryItem.FeedbackSent(title4, feedbackSent2 != null ? feedbackSent2.getText() : null), !z13, iA4, null, null, 770, null));
                } else if (itemReviewsEntry instanceof RatingBannerEntry) {
                    arrayList3.add(b(12));
                    RatingBannerEntry ratingBannerEntry = (RatingBannerEntry) itemReviewsEntry;
                    arrayList3.add(new AdvertDetailsRatingBannerItem(i12, null, jVar.a(), null, null, ratingBannerEntry.getText(), ratingBannerEntry.getBackground(), 26, null));
                    arrayList3.add(b(4));
                }
            }
            i12 = i13;
        }
        return arrayList3;
    }

    public final AdvertDetailsGapItem b(int i12) {
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return new AdvertDetailsGapItem(52, null, i12, this.f2929a.a(), null, null, 50, null);
    }
}
