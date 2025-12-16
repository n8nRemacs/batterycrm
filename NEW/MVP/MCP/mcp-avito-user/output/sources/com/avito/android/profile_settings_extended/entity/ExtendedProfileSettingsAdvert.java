package com.avito.android.profile_settings_extended.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsAdvert.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/ExtendedProfileSettingsAdvert;", "Landroid/os/Parcelable;", "Status", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ExtendedProfileSettingsAdvert implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ExtendedProfileSettingsAdvert> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f230267b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f230268c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f230269d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Image f230270e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final DeepLink f230271f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f230272g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Status f230273h;

    /* renamed from: i, reason: collision with root package name */
    public long f230274i;

    /* renamed from: j, reason: collision with root package name */
    public long f230275j;

    /* renamed from: k, reason: collision with root package name */
    public long f230276k;

    /* renamed from: l, reason: collision with root package name */
    public float f230277l;

    /* compiled from: ExtendedProfileSettingsAdvert.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/ExtendedProfileSettingsAdvert$Status;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Status implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Status> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f230278b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f230279c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Boolean f230280d;

        /* compiled from: ExtendedProfileSettingsAdvert.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Status> {
            @Override // android.os.Parcelable.Creator
            public final Status createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                int i12 = parcel.readInt();
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Status(i12, string, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final Status[] newArray(int i12) {
                return new Status[i12];
            }
        }

        public Status(int i12, @Y61.l String str, @Y61.l Boolean bool) {
            this.f230278b = i12;
            this.f230279c = str;
            this.f230280d = bool;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Status)) {
                return false;
            }
            Status status = (Status) obj;
            return this.f230278b == status.f230278b && L.f(this.f230279c, status.f230279c) && L.f(this.f230280d, status.f230280d);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f230278b) * 31;
            String str = this.f230279c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.f230280d;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Status(id=");
            sb2.append(this.f230278b);
            sb2.append(", description=");
            sb2.append(this.f230279c);
            sb2.append(", disabled=");
            return C0.g(sb2, this.f230280d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f230278b);
            parcel.writeString(this.f230279c);
            Boolean bool = this.f230280d;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* compiled from: ExtendedProfileSettingsAdvert.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileSettingsAdvert> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSettingsAdvert createFromParcel(Parcel parcel) {
            return new ExtendedProfileSettingsAdvert(parcel.readLong(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(ExtendedProfileSettingsAdvert.class.getClassLoader()), (DeepLink) parcel.readParcelable(ExtendedProfileSettingsAdvert.class.getClassLoader()), parcel.readString(), Status.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSettingsAdvert[] newArray(int i12) {
            return new ExtendedProfileSettingsAdvert[i12];
        }
    }

    public ExtendedProfileSettingsAdvert(long j12, @Y61.k String str, @Y61.k String str2, @Y61.l Image image, @Y61.k DeepLink deepLink, @Y61.k String str3, @Y61.k Status status) {
        this.f230267b = j12;
        this.f230268c = str;
        this.f230269d = str2;
        this.f230270e = image;
        this.f230271f = deepLink;
        this.f230272g = str3;
        this.f230273h = status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedProfileSettingsAdvert)) {
            return false;
        }
        ExtendedProfileSettingsAdvert extendedProfileSettingsAdvert = (ExtendedProfileSettingsAdvert) obj;
        return this.f230267b == extendedProfileSettingsAdvert.f230267b && L.f(this.f230268c, extendedProfileSettingsAdvert.f230268c) && L.f(this.f230269d, extendedProfileSettingsAdvert.f230269d) && L.f(this.f230270e, extendedProfileSettingsAdvert.f230270e) && L.f(this.f230271f, extendedProfileSettingsAdvert.f230271f) && L.f(this.f230272g, extendedProfileSettingsAdvert.f230272g) && L.f(this.f230273h, extendedProfileSettingsAdvert.f230273h);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(Long.hashCode(this.f230267b) * 31, 31, this.f230268c), 31, this.f230269d);
        Image image = this.f230270e;
        return this.f230273h.hashCode() + H.d(com.avito.android.actions_sheet.a.e(this.f230271f, (iD2 + (image == null ? 0 : image.hashCode())) * 31, 31), 31, this.f230272g);
    }

    @Y61.k
    public final String toString() {
        return "ExtendedProfileSettingsAdvert(id=" + this.f230267b + ", title=" + this.f230268c + ", price=" + this.f230269d + ", image=" + this.f230270e + ", deepLink=" + this.f230271f + ", description=" + this.f230272g + ", status=" + this.f230273h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f230267b);
        parcel.writeString(this.f230268c);
        parcel.writeString(this.f230269d);
        parcel.writeParcelable(this.f230270e, i12);
        parcel.writeParcelable(this.f230271f, i12);
        parcel.writeString(this.f230272g);
        this.f230273h.writeToParcel(parcel, i12);
    }
}
