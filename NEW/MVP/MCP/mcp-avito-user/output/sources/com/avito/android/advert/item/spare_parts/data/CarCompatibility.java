package com.avito.android.advert.item.spare_parts.data;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsV3Dto.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/spare_parts/data/CarCompatibility;", "Landroid/os/Parcelable;", "Button", "Car", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CarCompatibility implements Parcelable {

    @k
    public static final Parcelable.Creator<CarCompatibility> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f80406b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f80407c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Car f80408d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Button f80409e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Button f80410f;

    /* compiled from: SparePartsV3Dto.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/spare_parts/data/CarCompatibility$Button;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f80411b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f80412c;

        /* compiled from: SparePartsV3Dto.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button(parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k String str, @k DeepLink deepLink) {
            this.f80411b = str;
            this.f80412c = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return L.f(this.f80411b, button.f80411b) && L.f(this.f80412c, button.f80412c);
        }

        public final int hashCode() {
            return this.f80412c.hashCode() + (this.f80411b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(text=");
            sb2.append(this.f80411b);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f80412c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f80411b);
            parcel.writeParcelable(this.f80412c, i12);
        }
    }

    /* compiled from: SparePartsV3Dto.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/spare_parts/data/CarCompatibility$Car;", "Landroid/os/Parcelable;", "Status", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Car implements Parcelable {

        @k
        public static final Parcelable.Creator<Car> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Status f80413b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final UniversalImage f80414c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f80415d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f80416e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SparePartsV3Dto.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/spare_parts/data/CarCompatibility$Car$Status;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Status {

            /* renamed from: c, reason: collision with root package name */
            public static final Status f80417c;

            /* renamed from: d, reason: collision with root package name */
            public static final Status f80418d;

            /* renamed from: e, reason: collision with root package name */
            public static final Status f80419e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ Status[] f80420f;

            /* renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f80421g;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f80422b;

            static {
                Status status = new Status("COMPATIBLE", 0, "compatible");
                f80417c = status;
                Status status2 = new Status(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1, "unknown");
                f80418d = status2;
                Status status3 = new Status("NO_DATA", 2, "noData");
                f80419e = status3;
                Status[] statusArr = {status, status2, status3};
                f80420f = statusArr;
                f80421g = c.a(statusArr);
            }

            public Status(String str, int i12, String str2) {
                this.f80422b = str2;
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) f80420f.clone();
            }
        }

        /* compiled from: SparePartsV3Dto.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Car> {
            @Override // android.os.Parcelable.Creator
            public final Car createFromParcel(Parcel parcel) {
                return new Car(Status.valueOf(parcel.readString()), (UniversalImage) parcel.readParcelable(Car.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Car[] newArray(int i12) {
                return new Car[i12];
            }
        }

        public Car(@k Status status, @l UniversalImage universalImage, @k String str, @k String str2) {
            this.f80413b = status;
            this.f80414c = universalImage;
            this.f80415d = str;
            this.f80416e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Car)) {
                return false;
            }
            Car car = (Car) obj;
            return this.f80413b == car.f80413b && L.f(this.f80414c, car.f80414c) && L.f(this.f80415d, car.f80415d) && L.f(this.f80416e, car.f80416e);
        }

        public final int hashCode() {
            int iHashCode = this.f80413b.hashCode() * 31;
            UniversalImage universalImage = this.f80414c;
            return this.f80416e.hashCode() + H.d((iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31, this.f80415d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Car(status=");
            sb2.append(this.f80413b);
            sb2.append(", image=");
            sb2.append(this.f80414c);
            sb2.append(", title=");
            sb2.append(this.f80415d);
            sb2.append(", subtitle=");
            return C22026a.c(sb2, this.f80416e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f80413b.name());
            parcel.writeParcelable(this.f80414c, i12);
            parcel.writeString(this.f80415d);
            parcel.writeString(this.f80416e);
        }
    }

    /* compiled from: SparePartsV3Dto.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CarCompatibility> {
        @Override // android.os.Parcelable.Creator
        public final CarCompatibility createFromParcel(Parcel parcel) {
            return new CarCompatibility(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Car.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CarCompatibility[] newArray(int i12) {
            return new CarCompatibility[i12];
        }
    }

    public CarCompatibility(@l String str, @l String str2, @l Car car, @l Button button, @l Button button2) {
        this.f80406b = str;
        this.f80407c = str2;
        this.f80408d = car;
        this.f80409e = button;
        this.f80410f = button2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarCompatibility)) {
            return false;
        }
        CarCompatibility carCompatibility = (CarCompatibility) obj;
        return L.f(this.f80406b, carCompatibility.f80406b) && L.f(this.f80407c, carCompatibility.f80407c) && L.f(this.f80408d, carCompatibility.f80408d) && L.f(this.f80409e, carCompatibility.f80409e) && L.f(this.f80410f, carCompatibility.f80410f);
    }

    public final int hashCode() {
        String str = this.f80406b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f80407c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Car car = this.f80408d;
        int iHashCode3 = (iHashCode2 + (car == null ? 0 : car.hashCode())) * 31;
        Button button = this.f80409e;
        int iHashCode4 = (iHashCode3 + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.f80410f;
        return iHashCode4 + (button2 != null ? button2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CarCompatibility(title=" + this.f80406b + ", subtitle=" + this.f80407c + ", car=" + this.f80408d + ", primaryButton=" + this.f80409e + ", secondaryButton=" + this.f80410f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f80406b);
        parcel.writeString(this.f80407c);
        Car car = this.f80408d;
        if (car == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            car.writeToParcel(parcel, i12);
        }
        Button button = this.f80409e;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, i12);
        }
        Button button2 = this.f80410f;
        if (button2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button2.writeToParcel(parcel, i12);
        }
    }
}
