package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.EntryPointParameter;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AdvertHotelRoom.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/hotel/model/HotelOfferInstallments;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/hotel/model/HotelOfferInstallmentsEntryPoint;", EntryPointParameter.TYPE, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/hotel/model/HotelOfferInstallmentsEntryPoint;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/hotel/model/HotelOfferInstallmentsEntryPoint;", "c", "()Lcom/avito/android/hotel/model/HotelOfferInstallmentsEntryPoint;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HotelOfferInstallments implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelOfferInstallments> CREATOR = new a();

    @c(ContextActionHandler.Link.DEEPLINK)
    @l
    private final DeepLink deepLink;

    @c(EntryPointParameter.TYPE)
    @l
    private final HotelOfferInstallmentsEntryPoint entryPoint;

    /* compiled from: AdvertHotelRoom.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelOfferInstallments> {
        @Override // android.os.Parcelable.Creator
        public final HotelOfferInstallments createFromParcel(Parcel parcel) {
            return new HotelOfferInstallments((DeepLink) parcel.readParcelable(HotelOfferInstallments.class.getClassLoader()), parcel.readInt() == 0 ? null : HotelOfferInstallmentsEntryPoint.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelOfferInstallments[] newArray(int i12) {
            return new HotelOfferInstallments[i12];
        }
    }

    public HotelOfferInstallments(@l DeepLink deepLink, @l HotelOfferInstallmentsEntryPoint hotelOfferInstallmentsEntryPoint) {
        this.deepLink = deepLink;
        this.entryPoint = hotelOfferInstallmentsEntryPoint;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final HotelOfferInstallmentsEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.deepLink, i12);
        HotelOfferInstallmentsEntryPoint hotelOfferInstallmentsEntryPoint = this.entryPoint;
        if (hotelOfferInstallmentsEntryPoint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hotelOfferInstallmentsEntryPoint.writeToParcel(parcel, i12);
        }
    }
}
