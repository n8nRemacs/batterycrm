package com.avito.android.remote.model.advert_details.realty;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.FormInput;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DevelopmentsAdvice.kt */
@d
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b%\u0010&Jx\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0017J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020*HÖ\u0001¢\u0006\u0004\b2\u0010,J \u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020*HÖ\u0001¢\u0006\u0004\b7\u00108R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010\u001cR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bA\u0010\u001eR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010 R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bG\u0010$R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bI\u0010&¨\u0006J"}, d2 = {"Lcom/avito/android/remote/model/advert_details/realty/SuperFormInfo;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/remote/model/advert_details/realty/FeatureCard;", "featureCard", "Lcom/avito/android/deep_linking/links/DeepLink;", "entryPointShowEvent", "Lcom/avito/android/remote/model/advert_details/realty/CountCard;", "countCard", "Lcom/avito/android/remote/model/advert_details/realty/ReviewsCard;", "reviewsCard", "", "Lcom/avito/android/remote/model/advert_details/realty/Review;", "reviews", "Lcom/avito/android/remote/model/advert_details/realty/Landing;", "landing", "Lcom/avito/android/remote/model/FormInput;", "questionInput", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/advert_details/realty/FeatureCard;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/advert_details/realty/CountCard;Lcom/avito/android/remote/model/advert_details/realty/ReviewsCard;Ljava/util/List;Lcom/avito/android/remote/model/advert_details/realty/Landing;Lcom/avito/android/remote/model/FormInput;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/advert_details/realty/FeatureCard;", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component5", "()Lcom/avito/android/remote/model/advert_details/realty/CountCard;", "component6", "()Lcom/avito/android/remote/model/advert_details/realty/ReviewsCard;", "component7", "()Ljava/util/List;", "component8", "()Lcom/avito/android/remote/model/advert_details/realty/Landing;", "component9", "()Lcom/avito/android/remote/model/FormInput;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/advert_details/realty/FeatureCard;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/advert_details/realty/CountCard;Lcom/avito/android/remote/model/advert_details/realty/ReviewsCard;Ljava/util/List;Lcom/avito/android/remote/model/advert_details/realty/Landing;Lcom/avito/android/remote/model/FormInput;)Lcom/avito/android/remote/model/advert_details/realty/SuperFormInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/avito/android/remote/model/advert_details/realty/FeatureCard;", "getFeatureCard", "Lcom/avito/android/deep_linking/links/DeepLink;", "getEntryPointShowEvent", "Lcom/avito/android/remote/model/advert_details/realty/CountCard;", "getCountCard", "Lcom/avito/android/remote/model/advert_details/realty/ReviewsCard;", "getReviewsCard", "Ljava/util/List;", "getReviews", "Lcom/avito/android/remote/model/advert_details/realty/Landing;", "getLanding", "Lcom/avito/android/remote/model/FormInput;", "getQuestionInput", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SuperFormInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<SuperFormInfo> CREATOR = new Creator();

    @c("developmentsCountCard")
    @k
    private final CountCard countCard;

    @c("description")
    @k
    private final String description;

    @c("entryPointShowEvent")
    @l
    private final DeepLink entryPointShowEvent;

    @c("featureCard")
    @l
    private final FeatureCard featureCard;

    @c("landing")
    @l
    private final Landing landing;

    @c("questionInput")
    @l
    private final FormInput questionInput;

    @c("expertsReviews")
    @k
    private final List<Review> reviews;

    @c("expertsReviewsCard")
    @k
    private final ReviewsCard reviewsCard;

    @c("title")
    @k
    private final String title;

    /* compiled from: DevelopmentsAdvice.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SuperFormInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SuperFormInfo createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            FeatureCard featureCardCreateFromParcel = parcel.readInt() == 0 ? null : FeatureCard.CREATOR.createFromParcel(parcel);
            DeepLink deepLink = (DeepLink) parcel.readParcelable(SuperFormInfo.class.getClassLoader());
            CountCard countCardCreateFromParcel = CountCard.CREATOR.createFromParcel(parcel);
            ReviewsCard reviewsCardCreateFromParcel = ReviewsCard.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(Review.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new SuperFormInfo(string, string2, featureCardCreateFromParcel, deepLink, countCardCreateFromParcel, reviewsCardCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : Landing.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FormInput.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SuperFormInfo[] newArray(int i12) {
            return new SuperFormInfo[i12];
        }
    }

    public SuperFormInfo(@k String str, @k String str2, @l FeatureCard featureCard, @l DeepLink deepLink, @k CountCard countCard, @k ReviewsCard reviewsCard, @k List<Review> list, @l Landing landing, @l FormInput formInput) {
        this.title = str;
        this.description = str2;
        this.featureCard = featureCard;
        this.entryPointShowEvent = deepLink;
        this.countCard = countCard;
        this.reviewsCard = reviewsCard;
        this.reviews = list;
        this.landing = landing;
        this.questionInput = formInput;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final FeatureCard getFeatureCard() {
        return this.featureCard;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DeepLink getEntryPointShowEvent() {
        return this.entryPointShowEvent;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final CountCard getCountCard() {
        return this.countCard;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final ReviewsCard getReviewsCard() {
        return this.reviewsCard;
    }

    @k
    public final List<Review> component7() {
        return this.reviews;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Landing getLanding() {
        return this.landing;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final FormInput getQuestionInput() {
        return this.questionInput;
    }

    @k
    public final SuperFormInfo copy(@k String title, @k String description, @l FeatureCard featureCard, @l DeepLink entryPointShowEvent, @k CountCard countCard, @k ReviewsCard reviewsCard, @k List<Review> reviews, @l Landing landing, @l FormInput questionInput) {
        return new SuperFormInfo(title, description, featureCard, entryPointShowEvent, countCard, reviewsCard, reviews, landing, questionInput);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuperFormInfo)) {
            return false;
        }
        SuperFormInfo superFormInfo = (SuperFormInfo) other;
        return L.f(this.title, superFormInfo.title) && L.f(this.description, superFormInfo.description) && L.f(this.featureCard, superFormInfo.featureCard) && L.f(this.entryPointShowEvent, superFormInfo.entryPointShowEvent) && L.f(this.countCard, superFormInfo.countCard) && L.f(this.reviewsCard, superFormInfo.reviewsCard) && L.f(this.reviews, superFormInfo.reviews) && L.f(this.landing, superFormInfo.landing) && L.f(this.questionInput, superFormInfo.questionInput);
    }

    @k
    public final CountCard getCountCard() {
        return this.countCard;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @l
    public final DeepLink getEntryPointShowEvent() {
        return this.entryPointShowEvent;
    }

    @l
    public final FeatureCard getFeatureCard() {
        return this.featureCard;
    }

    @l
    public final Landing getLanding() {
        return this.landing;
    }

    @l
    public final FormInput getQuestionInput() {
        return this.questionInput;
    }

    @k
    public final List<Review> getReviews() {
        return this.reviews;
    }

    @k
    public final ReviewsCard getReviewsCard() {
        return this.reviewsCard;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(this.title.hashCode() * 31, 31, this.description);
        FeatureCard featureCard = this.featureCard;
        int iHashCode = (iD2 + (featureCard == null ? 0 : featureCard.hashCode())) * 31;
        DeepLink deepLink = this.entryPointShowEvent;
        int iE2 = H.e((this.reviewsCard.hashCode() + ((this.countCard.hashCode() + ((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31)) * 31)) * 31, 31, this.reviews);
        Landing landing = this.landing;
        int iHashCode2 = (iE2 + (landing == null ? 0 : landing.hashCode())) * 31;
        FormInput formInput = this.questionInput;
        return iHashCode2 + (formInput != null ? formInput.hashCode() : 0);
    }

    @k
    public String toString() {
        return "SuperFormInfo(title=" + this.title + ", description=" + this.description + ", featureCard=" + this.featureCard + ", entryPointShowEvent=" + this.entryPointShowEvent + ", countCard=" + this.countCard + ", reviewsCard=" + this.reviewsCard + ", reviews=" + this.reviews + ", landing=" + this.landing + ", questionInput=" + this.questionInput + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        FeatureCard featureCard = this.featureCard;
        if (featureCard == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            featureCard.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.entryPointShowEvent, flags);
        this.countCard.writeToParcel(parcel, flags);
        this.reviewsCard.writeToParcel(parcel, flags);
        Iterator itJ = C0.j(this.reviews, parcel);
        while (itJ.hasNext()) {
            ((Review) itJ.next()).writeToParcel(parcel, flags);
        }
        Landing landing = this.landing;
        if (landing == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            landing.writeToParcel(parcel, flags);
        }
        FormInput formInput = this.questionInput;
        if (formInput == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formInput.writeToParcel(parcel, flags);
        }
    }
}
