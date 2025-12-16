package com.avito.android.promo_snippet.models;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalImage;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: GigPromoSnippetWidget.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/promo_snippet/models/EmptyMotivationInfo;", "Landroid/os/Parcelable;", "Lcom/avito/android/promo_snippet/models/EmptyMotivationInfoActionButton;", "actionButton", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "subtitle", "title", "<init>", "(Lcom/avito/android/promo_snippet/models/EmptyMotivationInfoActionButton;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/promo_snippet/models/EmptyMotivationInfoActionButton;", "getActionButton", "()Lcom/avito/android/promo_snippet/models/EmptyMotivationInfoActionButton;", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Ljava/lang/String;", "getSubtitle", "()Ljava/lang/String;", "getTitle", "_avito_gig_promo-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class EmptyMotivationInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<EmptyMotivationInfo> CREATOR = new a();

    @c("actionButton")
    @k
    private final EmptyMotivationInfoActionButton actionButton;

    @c("image")
    @k
    private final UniversalImage image;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: GigPromoSnippetWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EmptyMotivationInfo> {
        @Override // android.os.Parcelable.Creator
        public final EmptyMotivationInfo createFromParcel(Parcel parcel) {
            return new EmptyMotivationInfo(EmptyMotivationInfoActionButton.CREATOR.createFromParcel(parcel), (UniversalImage) parcel.readParcelable(EmptyMotivationInfo.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EmptyMotivationInfo[] newArray(int i12) {
            return new EmptyMotivationInfo[i12];
        }
    }

    public EmptyMotivationInfo(@k EmptyMotivationInfoActionButton emptyMotivationInfoActionButton, @k UniversalImage universalImage, @k String str, @k String str2) {
        this.actionButton = emptyMotivationInfoActionButton;
        this.image = universalImage;
        this.subtitle = str;
        this.title = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.actionButton.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.image, i12);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.title);
    }
}
