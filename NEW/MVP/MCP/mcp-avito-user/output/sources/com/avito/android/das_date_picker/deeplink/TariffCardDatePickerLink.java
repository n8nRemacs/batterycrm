package com.avito.android.das_date_picker.deeplink;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: TariffCardDatePickerLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/das_date_picker/deeplink/TariffCardDatePickerLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class TariffCardDatePickerLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<TariffCardDatePickerLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Date f132247b;

    /* compiled from: TariffCardDatePickerLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCardDatePickerLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCardDatePickerLink createFromParcel(Parcel parcel) {
            return new TariffCardDatePickerLink((Date) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCardDatePickerLink[] newArray(int i12) {
            return new TariffCardDatePickerLink[i12];
        }
    }

    /* compiled from: TariffCardDatePickerLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/das_date_picker/deeplink/TariffCardDatePickerLink$b;", "LJu/c$b;", "a", "b", "Lcom/avito/android/das_date_picker/deeplink/TariffCardDatePickerLink$b$a;", "Lcom/avito/android/das_date_picker/deeplink/TariffCardDatePickerLink$b$b;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: TariffCardDatePickerLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/das_date_picker/deeplink/TariffCardDatePickerLink$b$a;", "Lcom/avito/android/das_date_picker/deeplink/TariffCardDatePickerLink$b;", "LJu/a$b;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b, InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Date f132248b;

            public a(@Y61.k Date date) {
                this.f132248b = date;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f132248b, ((a) obj).f132248b);
            }

            public final int hashCode() {
                return this.f132248b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.bxcontent.mvi.entity.f.n(new StringBuilder("DatePicked(date="), this.f132248b, ')');
            }
        }

        /* compiled from: TariffCardDatePickerLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/das_date_picker/deeplink/TariffCardDatePickerLink$b$b;", "Lcom/avito/android/das_date_picker/deeplink/TariffCardDatePickerLink$b;", "LJu/a$a;", "<init>", "()V", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.das_date_picker.deeplink.TariffCardDatePickerLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C3956b implements b, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C3956b f132249b = new C3956b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C3956b);
            }

            public final int hashCode() {
                return -1721733841;
            }

            @Y61.k
            public final String toString() {
                return "Failed";
            }
        }
    }

    public TariffCardDatePickerLink(@Y61.k Date date) {
        this.f132247b = date;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TariffCardDatePickerLink) && L.f(this.f132247b, ((TariffCardDatePickerLink) obj).f132247b);
    }

    public final int hashCode() {
        return this.f132247b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return com.avito.android.bxcontent.mvi.entity.f.n(new StringBuilder("TariffCardDatePickerLink(date="), this.f132247b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f132247b);
    }
}
