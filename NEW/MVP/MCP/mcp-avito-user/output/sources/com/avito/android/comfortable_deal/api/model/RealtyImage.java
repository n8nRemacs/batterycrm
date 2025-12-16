package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RealtyImage.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/RealtyImage;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "smallImage", "largeImage", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;)V", "Landroid/net/Uri;", "d", "()Landroid/net/Uri;", "c", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RealtyImage implements Parcelable {

    @k
    public static final Parcelable.Creator<RealtyImage> CREATOR = new a();

    @c("catalog_vip")
    @l
    private final Uri largeImage;

    @c("catalog")
    @l
    private final Uri smallImage;

    /* compiled from: RealtyImage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RealtyImage> {
        @Override // android.os.Parcelable.Creator
        public final RealtyImage createFromParcel(Parcel parcel) {
            return new RealtyImage((Uri) parcel.readParcelable(RealtyImage.class.getClassLoader()), (Uri) parcel.readParcelable(RealtyImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RealtyImage[] newArray(int i12) {
            return new RealtyImage[i12];
        }
    }

    public RealtyImage(@l Uri uri, @l Uri uri2) {
        this.smallImage = uri;
        this.largeImage = uri2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Uri getLargeImage() {
        return this.largeImage;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Uri getSmallImage() {
        return this.smallImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtyImage)) {
            return false;
        }
        RealtyImage realtyImage = (RealtyImage) obj;
        return L.f(this.smallImage, realtyImage.smallImage) && L.f(this.largeImage, realtyImage.largeImage);
    }

    public final int hashCode() {
        Uri uri = this.smallImage;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        Uri uri2 = this.largeImage;
        return iHashCode + (uri2 != null ? uri2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RealtyImage(smallImage=");
        sb2.append(this.smallImage);
        sb2.append(", largeImage=");
        return com.avito.android.actions_sheet.a.t(sb2, this.largeImage, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.smallImage, i12);
        parcel.writeParcelable(this.largeImage, i12);
    }
}
