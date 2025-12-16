package com.avito.android.remote.model.user_reviews;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: UserReviewsResult.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0014B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/user_reviews/UserReviewsResult;", "", "elements", "", "Lcom/avito/android/remote/model/user_reviews/ReviewElement;", "nextPage", "Landroid/net/Uri;", "emptyStateAction", "Lcom/avito/android/deep_linking/links/DeepLink;", "emptyState", "Lcom/avito/android/remote/model/user_reviews/UserReviewsResult$UserReviewsEmptyState;", "(Ljava/util/List;Landroid/net/Uri;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/user_reviews/UserReviewsResult$UserReviewsEmptyState;)V", "getElements", "()Ljava/util/List;", "getEmptyState", "()Lcom/avito/android/remote/model/user_reviews/UserReviewsResult$UserReviewsEmptyState;", "getEmptyStateAction", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getNextPage", "()Landroid/net/Uri;", "UserReviewsEmptyState", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UserReviewsResult {

    @c("entries")
    @k
    private final List<ReviewElement> elements;

    @c("emptyState")
    @l
    private final UserReviewsEmptyState emptyState;

    @c("emptyStateAction")
    @l
    private final DeepLink emptyStateAction;

    @c("nextPage")
    @l
    private final Uri nextPage;

    /* compiled from: UserReviewsResult.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/user_reviews/UserReviewsResult$UserReviewsEmptyState;", "Landroid/os/Parcelable;", "", "title", "text", "Lcom/avito/android/remote/model/user_reviews/UserReviewsResult$UserReviewsEmptyState$UserReviewsEmptyStateButton;", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/user_reviews/UserReviewsResult$UserReviewsEmptyState$UserReviewsEmptyStateButton;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/user_reviews/UserReviewsResult$UserReviewsEmptyState$UserReviewsEmptyStateButton;", "getButton", "()Lcom/avito/android/remote/model/user_reviews/UserReviewsResult$UserReviewsEmptyState$UserReviewsEmptyStateButton;", "UserReviewsEmptyStateButton", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class UserReviewsEmptyState implements Parcelable {

        @k
        public static final Parcelable.Creator<UserReviewsEmptyState> CREATOR = new Creator();

        @c("button")
        @l
        private final UserReviewsEmptyStateButton button;

        @c("text")
        @l
        private final String text;

        @c("title")
        @l
        private final String title;

        /* compiled from: UserReviewsResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UserReviewsEmptyState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final UserReviewsEmptyState createFromParcel(@k Parcel parcel) {
                return new UserReviewsEmptyState(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : UserReviewsEmptyStateButton.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final UserReviewsEmptyState[] newArray(int i12) {
                return new UserReviewsEmptyState[i12];
            }
        }

        /* compiled from: UserReviewsResult.kt */
        @d
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/user_reviews/UserReviewsResult$UserReviewsEmptyState$UserReviewsEmptyStateButton;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class UserReviewsEmptyStateButton implements Parcelable {

            @k
            public static final Parcelable.Creator<UserReviewsEmptyStateButton> CREATOR = new Creator();

            @c("title")
            @l
            private final String title;

            @c(TooltipAttribute.PARAM_DEEP_LINK)
            @l
            private final DeepLink uri;

            /* compiled from: UserReviewsResult.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<UserReviewsEmptyStateButton> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final UserReviewsEmptyStateButton createFromParcel(@k Parcel parcel) {
                    return new UserReviewsEmptyStateButton(parcel.readString(), (DeepLink) parcel.readParcelable(UserReviewsEmptyStateButton.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final UserReviewsEmptyStateButton[] newArray(int i12) {
                    return new UserReviewsEmptyStateButton[i12];
                }
            }

            public UserReviewsEmptyStateButton(@l String str, @l DeepLink deepLink) {
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

        public UserReviewsEmptyState(@l String str, @l String str2, @l UserReviewsEmptyStateButton userReviewsEmptyStateButton) {
            this.title = str;
            this.text = str2;
            this.button = userReviewsEmptyStateButton;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final UserReviewsEmptyStateButton getButton() {
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
            UserReviewsEmptyStateButton userReviewsEmptyStateButton = this.button;
            if (userReviewsEmptyStateButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                userReviewsEmptyStateButton.writeToParcel(parcel, flags);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserReviewsResult(@k List<? extends ReviewElement> list, @l Uri uri, @l DeepLink deepLink, @l UserReviewsEmptyState userReviewsEmptyState) {
        this.elements = list;
        this.nextPage = uri;
        this.emptyStateAction = deepLink;
        this.emptyState = userReviewsEmptyState;
    }

    @k
    public final List<ReviewElement> getElements() {
        return this.elements;
    }

    @l
    public final UserReviewsEmptyState getEmptyState() {
        return this.emptyState;
    }

    @l
    public final DeepLink getEmptyStateAction() {
        return this.emptyStateAction;
    }

    @l
    public final Uri getNextPage() {
        return this.nextPage;
    }
}
