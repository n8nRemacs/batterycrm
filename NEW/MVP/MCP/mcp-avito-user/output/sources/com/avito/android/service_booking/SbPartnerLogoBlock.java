package com.avito.android.service_booking;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalImage;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlock.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/service_booking/SbPartnerLogoBlock;", "Lcom/avito/android/service_booking/ServiceBookingBlock;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SbPartnerLogoBlock implements ServiceBookingBlock {

    @k
    public static final Parcelable.Creator<SbPartnerLogoBlock> CREATOR = new a();

    @c("image")
    @k
    private final UniversalImage image;

    /* compiled from: ServiceBookingBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SbPartnerLogoBlock> {
        @Override // android.os.Parcelable.Creator
        public final SbPartnerLogoBlock createFromParcel(Parcel parcel) {
            return new SbPartnerLogoBlock((UniversalImage) parcel.readParcelable(SbPartnerLogoBlock.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SbPartnerLogoBlock[] newArray(int i12) {
            return new SbPartnerLogoBlock[i12];
        }
    }

    public SbPartnerLogoBlock(@k UniversalImage universalImage) {
        this.image = universalImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SbPartnerLogoBlock) && L.f(this.image, ((SbPartnerLogoBlock) obj).image);
    }

    @k
    public final UniversalImage getImage() {
        return this.image;
    }

    public final int hashCode() {
        return this.image.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.advert.item.delivery_suggests.l.s(new StringBuilder("SbPartnerLogoBlock(image="), this.image, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.image, i12);
    }
}
