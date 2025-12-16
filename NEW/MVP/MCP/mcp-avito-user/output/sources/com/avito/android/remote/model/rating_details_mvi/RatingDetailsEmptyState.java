package com.avito.android.remote.model.rating_details_mvi;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: RatingDetailsEmptyState.kt */
@d
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEmptyState;", "Landroid/os/Parcelable;", "", "title", "text", "Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEmptyState$RatingDetailsEmptyStateButton;", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEmptyState$RatingDetailsEmptyStateButton;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEmptyState$RatingDetailsEmptyStateButton;", "getButton", "()Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEmptyState$RatingDetailsEmptyStateButton;", "RatingDetailsEmptyStateButton", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RatingDetailsEmptyState implements Parcelable {

    @k
    public static final Parcelable.Creator<RatingDetailsEmptyState> CREATOR = new Creator();

    @c("button")
    @l
    private final RatingDetailsEmptyStateButton button;

    @c("text")
    @l
    private final String text;

    @c("title")
    @l
    private final String title;

    /* compiled from: RatingDetailsEmptyState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RatingDetailsEmptyState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingDetailsEmptyState createFromParcel(@k Parcel parcel) {
            return new RatingDetailsEmptyState(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RatingDetailsEmptyStateButton.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingDetailsEmptyState[] newArray(int i12) {
            return new RatingDetailsEmptyState[i12];
        }
    }

    /* compiled from: RatingDetailsEmptyState.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEmptyState$RatingDetailsEmptyStateButton;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RatingDetailsEmptyStateButton implements Parcelable {

        @k
        public static final Parcelable.Creator<RatingDetailsEmptyStateButton> CREATOR = new Creator();

        @c("title")
        @l
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink uri;

        /* compiled from: RatingDetailsEmptyState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RatingDetailsEmptyStateButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final RatingDetailsEmptyStateButton createFromParcel(@k Parcel parcel) {
                return new RatingDetailsEmptyStateButton(parcel.readString(), (DeepLink) parcel.readParcelable(RatingDetailsEmptyStateButton.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final RatingDetailsEmptyStateButton[] newArray(int i12) {
                return new RatingDetailsEmptyStateButton[i12];
            }
        }

        public RatingDetailsEmptyStateButton(@l String str, @l DeepLink deepLink) {
            this.title = str;
            this.uri = deepLink;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @l
        public final DeepLink getUri() {
            return this.uri;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.uri, flags);
        }
    }

    public RatingDetailsEmptyState(@l String str, @l String str2, @l RatingDetailsEmptyStateButton ratingDetailsEmptyStateButton) {
        this.title = str;
        this.text = str2;
        this.button = ratingDetailsEmptyStateButton;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final RatingDetailsEmptyStateButton getButton() {
        return this.button;
    }

    @l
    public final String getText() {
        return this.text;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        RatingDetailsEmptyStateButton ratingDetailsEmptyStateButton = this.button;
        if (ratingDetailsEmptyStateButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ratingDetailsEmptyStateButton.writeToParcel(parcel, flags);
        }
    }
}
