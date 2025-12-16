package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: EmployeeOffLimitLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/EmployeeOffLimitLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class EmployeeOffLimitLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<EmployeeOffLimitLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133314b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133315c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133316d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final DeepLink f133317e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final DeepLink f133318f;

    /* compiled from: EmployeeOffLimitLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EmployeeOffLimitLink> {
        @Override // android.os.Parcelable.Creator
        public final EmployeeOffLimitLink createFromParcel(Parcel parcel) {
            return new EmployeeOffLimitLink(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(EmployeeOffLimitLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(EmployeeOffLimitLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final EmployeeOffLimitLink[] newArray(int i12) {
            return new EmployeeOffLimitLink[i12];
        }
    }

    public EmployeeOffLimitLink(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l DeepLink deepLink, @Y61.l DeepLink deepLink2) {
        this.f133314b = str;
        this.f133315c = str2;
        this.f133316d = str3;
        this.f133317e = deepLink;
        this.f133318f = deepLink2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmployeeOffLimitLink)) {
            return false;
        }
        EmployeeOffLimitLink employeeOffLimitLink = (EmployeeOffLimitLink) obj;
        return kotlin.jvm.internal.L.f(this.f133314b, employeeOffLimitLink.f133314b) && kotlin.jvm.internal.L.f(this.f133315c, employeeOffLimitLink.f133315c) && kotlin.jvm.internal.L.f(this.f133316d, employeeOffLimitLink.f133316d) && kotlin.jvm.internal.L.f(this.f133317e, employeeOffLimitLink.f133317e) && kotlin.jvm.internal.L.f(this.f133318f, employeeOffLimitLink.f133318f);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(this.f133314b.hashCode() * 31, 31, this.f133315c);
        String str = this.f133316d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f133317e;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.f133318f;
        return iHashCode2 + (deepLink2 != null ? deepLink2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EmployeeOffLimitLink(title=");
        sb2.append(this.f133314b);
        sb2.append(", subtitle=");
        sb2.append(this.f133315c);
        sb2.append(", buttonTitle=");
        sb2.append(this.f133316d);
        sb2.append(", buttonDeeplink=");
        sb2.append(this.f133317e);
        sb2.append(", closeDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f133318f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133314b);
        parcel.writeString(this.f133315c);
        parcel.writeString(this.f133316d);
        parcel.writeParcelable(this.f133317e, i12);
        parcel.writeParcelable(this.f133318f, i12);
    }
}
