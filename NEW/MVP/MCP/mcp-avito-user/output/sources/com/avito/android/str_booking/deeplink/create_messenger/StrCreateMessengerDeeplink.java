package com.avito.android.str_booking.deeplink.create_messenger;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: StrCreateMessengerDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/deeplink/create_messenger/StrCreateMessengerDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class StrCreateMessengerDeeplink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<StrCreateMessengerDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f285399b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f285400c;

    /* compiled from: StrCreateMessengerDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrCreateMessengerDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final StrCreateMessengerDeeplink createFromParcel(Parcel parcel) {
            return new StrCreateMessengerDeeplink(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StrCreateMessengerDeeplink[] newArray(int i12) {
            return new StrCreateMessengerDeeplink[i12];
        }
    }

    /* compiled from: StrCreateMessengerDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_booking/deeplink/create_messenger/StrCreateMessengerDeeplink$b;", "", "a", "b", "Lcom/avito/android/str_booking/deeplink/create_messenger/StrCreateMessengerDeeplink$b$a;", "Lcom/avito/android/str_booking/deeplink/create_messenger/StrCreateMessengerDeeplink$b$b;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: StrCreateMessengerDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_booking/deeplink/create_messenger/StrCreateMessengerDeeplink$b$a;", "Lcom/avito/android/str_booking/deeplink/create_messenger/StrCreateMessengerDeeplink$b;", "LJu/c$b;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f285401b = new a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1975705548;
            }

            @Y61.k
            public final String toString() {
                return "Canceled";
            }
        }

        /* compiled from: StrCreateMessengerDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_booking/deeplink/create_messenger/StrCreateMessengerDeeplink$b$b;", "Lcom/avito/android/str_booking/deeplink/create_messenger/StrCreateMessengerDeeplink$b;", "LJu/c$a;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.str_booking.deeplink.create_messenger.StrCreateMessengerDeeplink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C8540b implements b, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C8540b f285402b = new C8540b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C8540b);
            }

            public final int hashCode() {
                return -163361140;
            }

            @Y61.k
            public final String toString() {
                return "Confirmed";
            }
        }
    }

    public StrCreateMessengerDeeplink(long j12, @Y61.k String str) {
        this.f285399b = j12;
        this.f285400c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f285399b);
        parcel.writeString(this.f285400c);
    }
}
