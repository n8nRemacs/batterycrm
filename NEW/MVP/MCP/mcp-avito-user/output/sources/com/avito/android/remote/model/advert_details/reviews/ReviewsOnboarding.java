package com.avito.android.remote.model.advert_details.reviews;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.ButtonAction;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ItemReviewsHeader.kt */
@d
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/advert_details/reviews/ReviewsOnboarding;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/remote/model/ButtonAction;", "actionButton", "secondaryButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/ButtonAction;Lcom/avito/android/remote/model/ButtonAction;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/remote/model/ButtonAction;", "getActionButton", "()Lcom/avito/android/remote/model/ButtonAction;", "getSecondaryButton", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ReviewsOnboarding implements Parcelable {

    @k
    public static final Parcelable.Creator<ReviewsOnboarding> CREATOR = new Creator();

    @c("actionButton")
    @l
    private final ButtonAction actionButton;

    @c("description")
    @l
    private final String description;

    @c("secondaryButton")
    @l
    private final ButtonAction secondaryButton;

    @c("title")
    @l
    private final String title;

    /* compiled from: ItemReviewsHeader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ReviewsOnboarding> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ReviewsOnboarding createFromParcel(@k Parcel parcel) {
            return new ReviewsOnboarding(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ButtonAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonAction.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ReviewsOnboarding[] newArray(int i12) {
            return new ReviewsOnboarding[i12];
        }
    }

    public ReviewsOnboarding(@l String str, @l String str2, @l ButtonAction buttonAction, @l ButtonAction buttonAction2) {
        this.title = str;
        this.description = str2;
        this.actionButton = buttonAction;
        this.secondaryButton = buttonAction2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final ButtonAction getActionButton() {
        return this.actionButton;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final ButtonAction getSecondaryButton() {
        return this.secondaryButton;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        ButtonAction buttonAction = this.actionButton;
        if (buttonAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonAction.writeToParcel(parcel, flags);
        }
        ButtonAction buttonAction2 = this.secondaryButton;
        if (buttonAction2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonAction2.writeToParcel(parcel, flags);
        }
    }
}
