package com.avito.android.extended_profile_selection_create.name;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSetSelectionNameConfig.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/name/ExtendedProfileSetSelectionNameConfig;", "Landroid/os/Parcelable;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExtendedProfileSetSelectionNameConfig implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ExtendedProfileSetSelectionNameConfig> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f151803b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f151804c;

    /* renamed from: d, reason: collision with root package name */
    public final long f151805d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f151806e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Image f151807f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Long f151808g;

    /* renamed from: h, reason: collision with root package name */
    public final int f151809h;

    /* compiled from: ExtendedProfileSetSelectionNameConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileSetSelectionNameConfig> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSetSelectionNameConfig createFromParcel(Parcel parcel) {
            return new ExtendedProfileSetSelectionNameConfig(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0, (Image) parcel.readParcelable(ExtendedProfileSetSelectionNameConfig.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSetSelectionNameConfig[] newArray(int i12) {
            return new ExtendedProfileSetSelectionNameConfig[i12];
        }
    }

    public ExtendedProfileSetSelectionNameConfig(@Y61.k String str, @Y61.k String str2, long j12, boolean z12, @l Image image, @l Long l12, int i12) {
        this.f151803b = str;
        this.f151804c = str2;
        this.f151805d = j12;
        this.f151806e = z12;
        this.f151807f = image;
        this.f151808g = l12;
        this.f151809h = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedProfileSetSelectionNameConfig)) {
            return false;
        }
        ExtendedProfileSetSelectionNameConfig extendedProfileSetSelectionNameConfig = (ExtendedProfileSetSelectionNameConfig) obj;
        return L.f(this.f151803b, extendedProfileSetSelectionNameConfig.f151803b) && L.f(this.f151804c, extendedProfileSetSelectionNameConfig.f151804c) && this.f151805d == extendedProfileSetSelectionNameConfig.f151805d && this.f151806e == extendedProfileSetSelectionNameConfig.f151806e && L.f(this.f151807f, extendedProfileSetSelectionNameConfig.f151807f) && L.f(this.f151808g, extendedProfileSetSelectionNameConfig.f151808g) && this.f151809h == extendedProfileSetSelectionNameConfig.f151809h;
    }

    public final int hashCode() {
        int i12 = r.i(r.g(H.d(this.f151803b.hashCode() * 31, 31, this.f151804c), 31, this.f151805d), 31, this.f151806e);
        Image image = this.f151807f;
        int iHashCode = (i12 + (image == null ? 0 : image.hashCode())) * 31;
        Long l12 = this.f151808g;
        return Integer.hashCode(this.f151809h) + ((iHashCode + (l12 != null ? l12.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileSetSelectionNameConfig(fieldName=");
        sb2.append(this.f151803b);
        sb2.append(", valueId=");
        sb2.append(this.f151804c);
        sb2.append(", itemListId=");
        sb2.append(this.f151805d);
        sb2.append(", isEditFlow=");
        sb2.append(this.f151806e);
        sb2.append(", savedImage=");
        sb2.append(this.f151807f);
        sb2.append(", savedImageId=");
        sb2.append(this.f151808g);
        sb2.append(", symbolsMaxLimit=");
        return r.t(sb2, this.f151809h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f151803b);
        parcel.writeString(this.f151804c);
        parcel.writeLong(this.f151805d);
        parcel.writeInt(this.f151806e ? 1 : 0);
        parcel.writeParcelable(this.f151807f, i12);
        Long l12 = this.f151808g;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeInt(this.f151809h);
    }

    public /* synthetic */ ExtendedProfileSetSelectionNameConfig(String str, String str2, long j12, boolean z12, Image image, Long l12, int i12, int i13, C42822w c42822w) {
        this(str, str2, j12, z12, image, l12, (i13 & 64) != 0 ? 60 : i12);
    }
}
