package com.avito.android.remote.model.advert_details.reviews;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ItemReviewsHeader.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/advert_details/reviews/ItemReviewsHeader;", "Landroid/os/Parcelable;", "", "scoreValue", "", "scoreText", "caption", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/advert_details/reviews/ReviewsOnboarding;", "onboarding", "<init>", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/advert_details/reviews/ReviewsOnboarding;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Float;", "getScoreValue", "()Ljava/lang/Float;", "Ljava/lang/String;", "getScoreText", "()Ljava/lang/String;", "getCaption", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/advert_details/reviews/ReviewsOnboarding;", "getOnboarding", "()Lcom/avito/android/remote/model/advert_details/reviews/ReviewsOnboarding;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ItemReviewsHeader implements Parcelable {

    @k
    public static final Parcelable.Creator<ItemReviewsHeader> CREATOR = new Creator();

    @c("caption")
    @k
    private final String caption;

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("onboarding")
    @l
    private final ReviewsOnboarding onboarding;

    @c("scoreText")
    @k
    private final String scoreText;

    @c("scoreValue")
    @l
    private final Float scoreValue;

    /* compiled from: ItemReviewsHeader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ItemReviewsHeader> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemReviewsHeader createFromParcel(@k Parcel parcel) {
            return new ItemReviewsHeader(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ItemReviewsHeader.class.getClassLoader()), parcel.readInt() != 0 ? ReviewsOnboarding.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemReviewsHeader[] newArray(int i12) {
            return new ItemReviewsHeader[i12];
        }
    }

    public ItemReviewsHeader(@l Float f12, @k String str, @k String str2, @l DeepLink deepLink, @l ReviewsOnboarding reviewsOnboarding) {
        this.scoreValue = f12;
        this.scoreText = str;
        this.caption = str2;
        this.deeplink = deepLink;
        this.onboarding = reviewsOnboarding;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final String getCaption() {
        return this.caption;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final ReviewsOnboarding getOnboarding() {
        return this.onboarding;
    }

    @k
    public final String getScoreText() {
        return this.scoreText;
    }

    @l
    public final Float getScoreValue() {
        return this.scoreValue;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Float f12 = this.scoreValue;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f12);
        }
        parcel.writeString(this.scoreText);
        parcel.writeString(this.caption);
        parcel.writeParcelable(this.deeplink, flags);
        ReviewsOnboarding reviewsOnboarding = this.onboarding;
        if (reviewsOnboarding == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reviewsOnboarding.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ ItemReviewsHeader(Float f12, String str, String str2, DeepLink deepLink, ReviewsOnboarding reviewsOnboarding, int i12, C42822w c42822w) {
        this(f12, str, str2, deepLink, (i12 & 16) != 0 ? null : reviewsOnboarding);
    }
}
