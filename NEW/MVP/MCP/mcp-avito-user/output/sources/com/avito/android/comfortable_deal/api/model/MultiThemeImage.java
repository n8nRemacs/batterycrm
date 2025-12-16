package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AgentRoomDealResponse.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/MultiThemeImage;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "image", "imageDark", "<init>", "(Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;)V", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "getImageDark", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MultiThemeImage implements Parcelable {

    @k
    public static final Parcelable.Creator<MultiThemeImage> CREATOR = new a();

    @c("lightImage")
    @l
    private final Image image;

    @c("darkImage")
    @l
    private final Image imageDark;

    /* compiled from: AgentRoomDealResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MultiThemeImage> {
        @Override // android.os.Parcelable.Creator
        public final MultiThemeImage createFromParcel(Parcel parcel) {
            return new MultiThemeImage((Image) parcel.readParcelable(MultiThemeImage.class.getClassLoader()), (Image) parcel.readParcelable(MultiThemeImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MultiThemeImage[] newArray(int i12) {
            return new MultiThemeImage[i12];
        }
    }

    public MultiThemeImage(@l Image image, @l Image image2) {
        this.image = image;
        this.imageDark = image2;
    }

    @k
    public final UniversalImage c() {
        return new UniversalImage(this.image, this.imageDark);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiThemeImage)) {
            return false;
        }
        MultiThemeImage multiThemeImage = (MultiThemeImage) obj;
        return L.f(this.image, multiThemeImage.image) && L.f(this.imageDark, multiThemeImage.imageDark);
    }

    public final int hashCode() {
        Image image = this.image;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.imageDark;
        return iHashCode + (image2 != null ? image2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiThemeImage(image=");
        sb2.append(this.image);
        sb2.append(", imageDark=");
        return AK.c.o(sb2, this.imageDark, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.image, i12);
        parcel.writeParcelable(this.imageDark, i12);
    }
}
