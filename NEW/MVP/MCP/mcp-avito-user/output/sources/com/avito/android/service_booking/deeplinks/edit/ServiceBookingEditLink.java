package com.avito.android.service_booking.deeplinks.edit;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.service_booking.BookingFlowSource;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ServiceBookingEditLink.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/edit/ServiceBookingEditLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "advertId", "stepId", "bookingId", "microCategoryId", "Lcom/avito/android/service_booking/BookingFlowSource;", SearchParamsConverterKt.SOURCE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/service_booking/BookingFlowSource;)V", "Ljava/lang/String;", "getAdvertId", "()Ljava/lang/String;", "h", "f", "getMicroCategoryId", "Lcom/avito/android/service_booking/BookingFlowSource;", "g", "()Lcom/avito/android/service_booking/BookingFlowSource;", "b", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class ServiceBookingEditLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ServiceBookingEditLink> CREATOR = new a();

    @com.google.gson.annotations.c("advertId")
    @l
    private final String advertId;

    @com.google.gson.annotations.c("bookingId")
    @k
    private final String bookingId;

    @com.google.gson.annotations.c("mcId")
    @l
    private final String microCategoryId;

    @com.google.gson.annotations.c(SearchParamsConverterKt.SOURCE)
    @l
    private final BookingFlowSource source;

    @com.google.gson.annotations.c("stepId")
    @k
    private final String stepId;

    /* compiled from: ServiceBookingEditLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingEditLink> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingEditLink createFromParcel(Parcel parcel) {
            return new ServiceBookingEditLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BookingFlowSource.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingEditLink[] newArray(int i12) {
            return new ServiceBookingEditLink[i12];
        }
    }

    /* compiled from: ServiceBookingEditLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/edit/ServiceBookingEditLink$b;", "", "a", "b", "c", "Lcom/avito/android/service_booking/deeplinks/edit/ServiceBookingEditLink$b$a;", "Lcom/avito/android/service_booking/deeplinks/edit/ServiceBookingEditLink$b$b;", "Lcom/avito/android/service_booking/deeplinks/edit/ServiceBookingEditLink$b$c;", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ServiceBookingEditLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/edit/ServiceBookingEditLink$b$a;", "LJu/c$b;", "Lcom/avito/android/service_booking/deeplinks/edit/ServiceBookingEditLink$b;", "<init>", "()V", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f274240b = new a();
        }

        /* compiled from: ServiceBookingEditLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/edit/ServiceBookingEditLink$b$b;", "LJu/c$b;", "Lcom/avito/android/service_booking/deeplinks/edit/ServiceBookingEditLink$b;", "<init>", "()V", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.service_booking.deeplinks.edit.ServiceBookingEditLink$b$b, reason: collision with other inner class name */
        public static final class C8143b implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C8143b f274241b = new C8143b();
        }

        /* compiled from: ServiceBookingEditLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/edit/ServiceBookingEditLink$b$c;", "LJu/c$a;", "Lcom/avito/android/service_booking/deeplinks/edit/ServiceBookingEditLink$b;", "<init>", "()V", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements InterfaceC14249c.a, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final c f274242b = new c();
        }
    }

    public ServiceBookingEditLink(@l String str, @k String str2, @k String str3, @l String str4, @l BookingFlowSource bookingFlowSource) {
        this.advertId = str;
        this.stepId = str2;
        this.bookingId = str3;
        this.microCategoryId = str4;
        this.source = bookingFlowSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getBookingId() {
        return this.bookingId;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final BookingFlowSource getSource() {
        return this.source;
    }

    @l
    public final String getAdvertId() {
        return this.advertId;
    }

    @l
    public final String getMicroCategoryId() {
        return this.microCategoryId;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getStepId() {
        return this.stepId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.advertId);
        parcel.writeString(this.stepId);
        parcel.writeString(this.bookingId);
        parcel.writeString(this.microCategoryId);
        BookingFlowSource bookingFlowSource = this.source;
        if (bookingFlowSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bookingFlowSource.name());
        }
    }
}
