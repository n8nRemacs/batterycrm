package com.avito.android.employee_stub_public;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.EmployeeModeSwitchLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EmployeeStubData.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/employee_stub_public/EmployeeStubData;", "Landroid/os/Parcelable;", "Favorites", "FromDeeplink", "Search", "Lcom/avito/android/employee_stub_public/EmployeeStubData$Favorites;", "Lcom/avito/android/employee_stub_public/EmployeeStubData$FromDeeplink;", "Lcom/avito/android/employee_stub_public/EmployeeStubData$Search;", "_avito_employee-stub_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EmployeeStubData extends Parcelable {

    /* compiled from: EmployeeStubData.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/employee_stub_public/EmployeeStubData$Favorites;", "Lcom/avito/android/employee_stub_public/EmployeeStubData;", "<init>", "()V", "_avito_employee-stub_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Favorites implements EmployeeStubData {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Favorites f147615b = new Favorites();

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final EmployeeModeSwitchLink f147616c = new EmployeeModeSwitchLink(false, null, false, EmployeeModeSwitchLink.SwitchSource.f133303b);

        @k
        public static final Parcelable.Creator<Favorites> CREATOR = new a();

        /* compiled from: EmployeeStubData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Favorites> {
            @Override // android.os.Parcelable.Creator
            public final Favorites createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Favorites.f147615b;
            }

            @Override // android.os.Parcelable.Creator
            public final Favorites[] newArray(int i12) {
                return new Favorites[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: EmployeeStubData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/employee_stub_public/EmployeeStubData$FromDeeplink;", "Lcom/avito/android/employee_stub_public/EmployeeStubData;", "_avito_employee-stub_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FromDeeplink implements EmployeeStubData {

        @k
        public static final Parcelable.Creator<FromDeeplink> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f147617b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f147618c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f147619d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f147620e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final DeepLink f147621f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final DeepLink f147622g;

        /* compiled from: EmployeeStubData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FromDeeplink> {
            @Override // android.os.Parcelable.Creator
            public final FromDeeplink createFromParcel(Parcel parcel) {
                return new FromDeeplink(parcel.readString(), (DeepLink) parcel.readParcelable(FromDeeplink.class.getClassLoader()), (DeepLink) parcel.readParcelable(FromDeeplink.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FromDeeplink[] newArray(int i12) {
                return new FromDeeplink[i12];
            }
        }

        public FromDeeplink(@l String str, @l DeepLink deepLink, @l DeepLink deepLink2, @k String str2, @k String str3, @l String str4) {
            this.f147617b = str;
            this.f147618c = str2;
            this.f147619d = str3;
            this.f147620e = str4;
            this.f147621f = deepLink;
            this.f147622g = deepLink2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FromDeeplink)) {
                return false;
            }
            FromDeeplink fromDeeplink = (FromDeeplink) obj;
            return L.f(this.f147617b, fromDeeplink.f147617b) && L.f(this.f147618c, fromDeeplink.f147618c) && L.f(this.f147619d, fromDeeplink.f147619d) && L.f(this.f147620e, fromDeeplink.f147620e) && L.f(this.f147621f, fromDeeplink.f147621f) && L.f(this.f147622g, fromDeeplink.f147622g);
        }

        public final int hashCode() {
            String str = this.f147617b;
            int iD2 = H.d(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f147618c), 31, this.f147619d);
            String str2 = this.f147620e;
            int iHashCode = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            DeepLink deepLink = this.f147621f;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            DeepLink deepLink2 = this.f147622g;
            return iHashCode2 + (deepLink2 != null ? deepLink2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FromDeeplink(name=");
            sb2.append(this.f147617b);
            sb2.append(", title=");
            sb2.append(this.f147618c);
            sb2.append(", description=");
            sb2.append(this.f147619d);
            sb2.append(", mainButtonTitle=");
            sb2.append(this.f147620e);
            sb2.append(", closeDeeplink=");
            sb2.append(this.f147621f);
            sb2.append(", mainDeeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f147622g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f147617b);
            parcel.writeString(this.f147618c);
            parcel.writeString(this.f147619d);
            parcel.writeString(this.f147620e);
            parcel.writeParcelable(this.f147621f, i12);
            parcel.writeParcelable(this.f147622g, i12);
        }
    }

    /* compiled from: EmployeeStubData.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/employee_stub_public/EmployeeStubData$Search;", "Lcom/avito/android/employee_stub_public/EmployeeStubData;", "<init>", "()V", "_avito_employee-stub_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Search implements EmployeeStubData {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Search f147623b = new Search();

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final EmployeeModeSwitchLink f147624c = new EmployeeModeSwitchLink(false, null, false, EmployeeModeSwitchLink.SwitchSource.f133303b);

        @k
        public static final Parcelable.Creator<Search> CREATOR = new a();

        /* compiled from: EmployeeStubData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Search> {
            @Override // android.os.Parcelable.Creator
            public final Search createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Search.f147623b;
            }

            @Override // android.os.Parcelable.Creator
            public final Search[] newArray(int i12) {
                return new Search[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }
}
