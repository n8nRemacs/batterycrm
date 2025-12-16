package com.avito.android.remote.model.category_parameters.slot.delivery_all_toggles;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: DeliveryAllTogglesConfig.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesBanner;", "Landroid/os/Parcelable;", "", "image", "imageDark", "moreLink", "moreLinkHref", "descriptionText", "descriptionTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getImage", "()Ljava/lang/String;", "getImageDark", "getMoreLink", "getMoreLinkHref", "getDescriptionText", "getDescriptionTitle", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AllTogglesBanner implements Parcelable {

    @k
    public static final Parcelable.Creator<AllTogglesBanner> CREATOR = new Creator();

    @c("descriptionText")
    @l
    private final String descriptionText;

    @c("descriptionTitle")
    @l
    private final String descriptionTitle;

    @c("image")
    @l
    private final String image;

    @c("imageDark")
    @l
    private final String imageDark;

    @c("moreLink")
    @l
    private final String moreLink;

    @c("moreLinkHref")
    @l
    private final String moreLinkHref;

    /* compiled from: DeliveryAllTogglesConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AllTogglesBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AllTogglesBanner createFromParcel(@k Parcel parcel) {
            return new AllTogglesBanner(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AllTogglesBanner[] newArray(int i12) {
            return new AllTogglesBanner[i12];
        }
    }

    public AllTogglesBanner(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6) {
        this.image = str;
        this.imageDark = str2;
        this.moreLink = str3;
        this.moreLinkHref = str4;
        this.descriptionText = str5;
        this.descriptionTitle = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getDescriptionText() {
        return this.descriptionText;
    }

    @l
    public final String getDescriptionTitle() {
        return this.descriptionTitle;
    }

    @l
    public final String getImage() {
        return this.image;
    }

    @l
    public final String getImageDark() {
        return this.imageDark;
    }

    @l
    public final String getMoreLink() {
        return this.moreLink;
    }

    @l
    public final String getMoreLinkHref() {
        return this.moreLinkHref;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.image);
        parcel.writeString(this.imageDark);
        parcel.writeString(this.moreLink);
        parcel.writeString(this.moreLinkHref);
        parcel.writeString(this.descriptionText);
        parcel.writeString(this.descriptionTitle);
    }
}
