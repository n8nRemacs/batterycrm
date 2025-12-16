package ME0;

import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1StrSellerGuestProfileGetResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LME0/d;", "", "a", "b", "c", "d", "LME0/d$a;", "LME0/d$b;", "LME0/d$c;", "LME0/d$d;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface d {

    /* compiled from: Api1StrSellerGuestProfileGetResponse.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"LME0/d$a;", "LME0/d;", "Lcom/avito/android/remote/model/text/AttributedText;", "additionalInfo", "Lcom/avito/android/remote/model/Image;", "avatar", "", "LME0/f;", "badges", "LME0/h;", "blackListInfo", "personalInfo", "rating", "userName", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/Image;Ljava/util/List;LME0/h;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/Image;", "b", "()Lcom/avito/android/remote/model/Image;", "Ljava/util/List;", "c", "()Ljava/util/List;", "LME0/h;", "d", "()LME0/h;", "e", "f", "g", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements d {

        @com.google.gson.annotations.c("additionalInfo")
        @Y61.k
        private final AttributedText additionalInfo;

        @com.google.gson.annotations.c("avatar")
        @Y61.k
        private final Image avatar;

        @com.google.gson.annotations.c("badges")
        @Y61.k
        private final List<f> badges;

        @com.google.gson.annotations.c("blackListInfo")
        @Y61.l
        private final h blackListInfo;

        @com.google.gson.annotations.c("personalInfo")
        @Y61.k
        private final AttributedText personalInfo;

        @com.google.gson.annotations.c("rating")
        @Y61.l
        private final AttributedText rating;

        @com.google.gson.annotations.c("userName")
        @Y61.k
        private final AttributedText userName;

        public a(@Y61.k AttributedText attributedText, @Y61.k Image image, @Y61.k List<f> list, @Y61.l h hVar, @Y61.k AttributedText attributedText2, @Y61.l AttributedText attributedText3, @Y61.k AttributedText attributedText4) {
            this.additionalInfo = attributedText;
            this.avatar = image;
            this.badges = list;
            this.blackListInfo = hVar;
            this.personalInfo = attributedText2;
            this.rating = attributedText3;
            this.userName = attributedText4;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final AttributedText getAdditionalInfo() {
            return this.additionalInfo;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final Image getAvatar() {
            return this.avatar;
        }

        @Y61.k
        public final List<f> c() {
            return this.badges;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final h getBlackListInfo() {
            return this.blackListInfo;
        }

        @Y61.k
        /* renamed from: e, reason: from getter */
        public final AttributedText getPersonalInfo() {
            return this.personalInfo;
        }

        @Y61.l
        /* renamed from: f, reason: from getter */
        public final AttributedText getRating() {
            return this.rating;
        }

        @Y61.k
        /* renamed from: g, reason: from getter */
        public final AttributedText getUserName() {
            return this.userName;
        }
    }

    /* compiled from: Api1StrSellerGuestProfileGetResponse.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LME0/d$b;", "LME0/d;", "", "id", "LME0/i;", "reviewButton", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "title", "<init>", "(Ljava/lang/String;LME0/i;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LME0/i;", "b", "()LME0/i;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "d", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements d {

        @com.google.gson.annotations.c("id")
        @Y61.l
        private final String id;

        @com.google.gson.annotations.c("reviewButton")
        @Y61.l
        private final i reviewButton;

        @com.google.gson.annotations.c("subtitle")
        @Y61.k
        private final AttributedText subtitle;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final AttributedText title;

        public b(@Y61.l String str, @Y61.l i iVar, @Y61.k AttributedText attributedText, @Y61.k AttributedText attributedText2) {
            this.id = str;
            this.reviewButton = iVar;
            this.subtitle = attributedText;
            this.title = attributedText2;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final i getReviewButton() {
            return this.reviewButton;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }
    }

    /* compiled from: Api1StrSellerGuestProfileGetResponse.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LME0/d$c;", "LME0/d;", "", "LME0/j;", "statistics", "Lcom/avito/android/remote/model/text/AttributedText;", "statisticsTitle", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements d {

        @com.google.gson.annotations.c("statistics")
        @Y61.k
        private final List<j> statistics;

        @com.google.gson.annotations.c("statisticsTitle")
        @Y61.k
        private final AttributedText statisticsTitle;

        public c(@Y61.k List<j> list, @Y61.k AttributedText attributedText) {
            this.statistics = list;
            this.statisticsTitle = attributedText;
        }

        @Y61.k
        public final List<j> a() {
            return this.statistics;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final AttributedText getStatisticsTitle() {
            return this.statisticsTitle;
        }
    }

    /* compiled from: Api1StrSellerGuestProfileGetResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LME0/d$d;", "LME0/d;", "LME0/k;", "activatePlanButton", "", "Lcom/avito/android/remote/model/text/AttributedText;", "benefits", "LME0/l;", "promoImage", "title", "<init>", "(LME0/k;Ljava/util/List;LME0/l;Lcom/avito/android/remote/model/text/AttributedText;)V", "LME0/k;", "a", "()LME0/k;", "Ljava/util/List;", "b", "()Ljava/util/List;", "LME0/l;", "c", "()LME0/l;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ME0.d$d, reason: collision with other inner class name */
    public static final class C0667d implements d {

        @com.google.gson.annotations.c("activatePlanButton")
        @Y61.k
        private final k activatePlanButton;

        @com.google.gson.annotations.c("benefits")
        @Y61.k
        private final List<AttributedText> benefits;

        @com.google.gson.annotations.c("promoImage")
        @Y61.k
        private final l promoImage;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final AttributedText title;

        public C0667d(@Y61.k k kVar, @Y61.k List<AttributedText> list, @Y61.k l lVar, @Y61.k AttributedText attributedText) {
            this.activatePlanButton = kVar;
            this.benefits = list;
            this.promoImage = lVar;
            this.title = attributedText;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final k getActivatePlanButton() {
            return this.activatePlanButton;
        }

        @Y61.k
        public final List<AttributedText> b() {
            return this.benefits;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final l getPromoImage() {
            return this.promoImage;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }
    }
}
