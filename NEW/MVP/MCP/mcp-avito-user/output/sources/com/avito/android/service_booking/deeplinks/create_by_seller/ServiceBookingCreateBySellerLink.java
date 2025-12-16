package com.avito.android.service_booking.deeplinks.create_by_seller;

import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ServiceBookingCreateBySellerLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/create_by_seller/ServiceBookingCreateBySellerLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "stepId", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class ServiceBookingCreateBySellerLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ServiceBookingCreateBySellerLink> CREATOR = new a();

    @com.google.gson.annotations.c("stepId")
    @k
    private final String stepId;

    /* compiled from: ServiceBookingCreateBySellerLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingCreateBySellerLink> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingCreateBySellerLink createFromParcel(Parcel parcel) {
            return new ServiceBookingCreateBySellerLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingCreateBySellerLink[] newArray(int i12) {
            return new ServiceBookingCreateBySellerLink[i12];
        }
    }

    /* compiled from: ServiceBookingCreateBySellerLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/create_by_seller/ServiceBookingCreateBySellerLink$b;", "", "a", "b", "c", "Lcom/avito/android/service_booking/deeplinks/create_by_seller/ServiceBookingCreateBySellerLink$b$a;", "Lcom/avito/android/service_booking/deeplinks/create_by_seller/ServiceBookingCreateBySellerLink$b$b;", "Lcom/avito/android/service_booking/deeplinks/create_by_seller/ServiceBookingCreateBySellerLink$b$c;", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ServiceBookingCreateBySellerLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/create_by_seller/ServiceBookingCreateBySellerLink$b$a;", "LJu/c$b;", "Lcom/avito/android/service_booking/deeplinks/create_by_seller/ServiceBookingCreateBySellerLink$b;", "<init>", "()V", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f274210b = new a();
        }

        /* compiled from: ServiceBookingCreateBySellerLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/create_by_seller/ServiceBookingCreateBySellerLink$b$b;", "LJu/c$a;", "Lcom/avito/android/service_booking/deeplinks/create_by_seller/ServiceBookingCreateBySellerLink$b;", "<init>", "()V", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.service_booking.deeplinks.create_by_seller.ServiceBookingCreateBySellerLink$b$b, reason: collision with other inner class name */
        public static final class C8139b implements InterfaceC14249c.a, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C8139b f274211b = new C8139b();
        }

        /* compiled from: ServiceBookingCreateBySellerLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/create_by_seller/ServiceBookingCreateBySellerLink$b$c;", "LJu/c$b;", "Lcom/avito/android/service_booking/deeplinks/create_by_seller/ServiceBookingCreateBySellerLink$b;", "<init>", "()V", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final c f274212b = new c();
        }
    }

    public ServiceBookingCreateBySellerLink(@k String str) {
        this.stepId = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getStepId() {
        return this.stepId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.stepId);
    }
}
