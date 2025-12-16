package com.avito.android.extended_profile_selection_create.image;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSetSelectionImageConfig.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/ExtendedProfileSetSelectionImageConfig;", "Landroid/os/Parcelable;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExtendedProfileSetSelectionImageConfig implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ExtendedProfileSetSelectionImageConfig> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f151626b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f151627c;

    /* renamed from: d, reason: collision with root package name */
    public final long f151628d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f151629e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f151630f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f151631g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Image f151632h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Long f151633i;

    /* compiled from: ExtendedProfileSetSelectionImageConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileSetSelectionImageConfig> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSetSelectionImageConfig createFromParcel(Parcel parcel) {
            return new ExtendedProfileSetSelectionImageConfig(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, (Image) parcel.readParcelable(ExtendedProfileSetSelectionImageConfig.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSetSelectionImageConfig[] newArray(int i12) {
            return new ExtendedProfileSetSelectionImageConfig[i12];
        }
    }

    public ExtendedProfileSetSelectionImageConfig(@Y61.k String str, @Y61.k String str2, long j12, boolean z12, @Y61.k String str3, boolean z13, @Y61.l Image image, @Y61.l Long l12) {
        this.f151626b = str;
        this.f151627c = str2;
        this.f151628d = j12;
        this.f151629e = z12;
        this.f151630f = str3;
        this.f151631g = z13;
        this.f151632h = image;
        this.f151633i = l12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedProfileSetSelectionImageConfig)) {
            return false;
        }
        ExtendedProfileSetSelectionImageConfig extendedProfileSetSelectionImageConfig = (ExtendedProfileSetSelectionImageConfig) obj;
        return L.f(this.f151626b, extendedProfileSetSelectionImageConfig.f151626b) && L.f(this.f151627c, extendedProfileSetSelectionImageConfig.f151627c) && this.f151628d == extendedProfileSetSelectionImageConfig.f151628d && this.f151629e == extendedProfileSetSelectionImageConfig.f151629e && L.f(this.f151630f, extendedProfileSetSelectionImageConfig.f151630f) && this.f151631g == extendedProfileSetSelectionImageConfig.f151631g && L.f(this.f151632h, extendedProfileSetSelectionImageConfig.f151632h) && L.f(this.f151633i, extendedProfileSetSelectionImageConfig.f151633i);
    }

    public final int hashCode() {
        int i12 = r.i(H.d(r.i(r.g(H.d(this.f151626b.hashCode() * 31, 31, this.f151627c), 31, this.f151628d), 31, this.f151629e), 31, this.f151630f), 31, this.f151631g);
        Image image = this.f151632h;
        int iHashCode = (i12 + (image == null ? 0 : image.hashCode())) * 31;
        Long l12 = this.f151633i;
        return iHashCode + (l12 != null ? l12.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileSetSelectionImageConfig(fieldName=");
        sb2.append(this.f151626b);
        sb2.append(", valueId=");
        sb2.append(this.f151627c);
        sb2.append(", itemListId=");
        sb2.append(this.f151628d);
        sb2.append(", isEditFlow=");
        sb2.append(this.f151629e);
        sb2.append(", name=");
        sb2.append(this.f151630f);
        sb2.append(", isPublic=");
        sb2.append(this.f151631g);
        sb2.append(", savedImage=");
        sb2.append(this.f151632h);
        sb2.append(", savedImageId=");
        return androidx.media3.exoplayer.analytics.m.m(sb2, this.f151633i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f151626b);
        parcel.writeString(this.f151627c);
        parcel.writeLong(this.f151628d);
        parcel.writeInt(this.f151629e ? 1 : 0);
        parcel.writeString(this.f151630f);
        parcel.writeInt(this.f151631g ? 1 : 0);
        parcel.writeParcelable(this.f151632h, i12);
        Long l12 = this.f151633i;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
    }
}
