package ru.avito.messenger;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: MessengerUserInfo.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/avito/messenger/MessengerUserType;", "Landroid/os/Parcelable;", "Default", "Employee", "Lru/avito/messenger/MessengerUserType$Default;", "Lru/avito/messenger/MessengerUserType$Employee;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface MessengerUserType extends Parcelable {

    /* compiled from: MessengerUserInfo.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserType$Default;", "Lru/avito/messenger/MessengerUserType;", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Default implements MessengerUserType {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Default f430683b = new Default();

        @Y61.k
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* compiled from: MessengerUserInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Default> {
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Default.f430683b;
            }

            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i12) {
                return new Default[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof Default);
        }

        public final int hashCode() {
            return -532235066;
        }

        @Y61.k
        public final String toString() {
            return "Default";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MessengerUserInfo.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/avito/messenger/MessengerUserType$Employee;", "Lru/avito/messenger/MessengerUserType;", "Company", "Personal", "Lru/avito/messenger/MessengerUserType$Employee$Company;", "Lru/avito/messenger/MessengerUserType$Employee$Personal;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Employee extends MessengerUserType {

        /* compiled from: MessengerUserInfo.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/MessengerUserType$Employee$Company;", "Lru/avito/messenger/MessengerUserType$Employee;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Company implements Employee {

            @Y61.k
            public static final Parcelable.Creator<Company> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f430684b;

            /* compiled from: MessengerUserInfo.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Company> {
                @Override // android.os.Parcelable.Creator
                public final Company createFromParcel(Parcel parcel) {
                    return new Company(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Company[] newArray(int i12) {
                    return new Company[i12];
                }
            }

            public Company(@Y61.k String str) {
                this.f430684b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Company) && kotlin.jvm.internal.L.f(this.f430684b, ((Company) obj).f430684b);
            }

            public final int hashCode() {
                return this.f430684b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Company(companyHashId="), this.f430684b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f430684b);
            }
        }

        /* compiled from: MessengerUserInfo.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserType$Employee$Personal;", "Lru/avito/messenger/MessengerUserType$Employee;", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Personal implements Employee {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Personal f430685b = new Personal();

            @Y61.k
            public static final Parcelable.Creator<Personal> CREATOR = new a();

            /* compiled from: MessengerUserInfo.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Personal> {
                @Override // android.os.Parcelable.Creator
                public final Personal createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Personal.f430685b;
                }

                @Override // android.os.Parcelable.Creator
                public final Personal[] newArray(int i12) {
                    return new Personal[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof Personal);
            }

            public final int hashCode() {
                return -1470661147;
            }

            @Y61.k
            public final String toString() {
                return "Personal";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }
    }
}
