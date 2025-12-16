package com.avito.android.extended_profile_selection_create;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSelectionCreateConfig.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/ExtendedProfileSelectionCreateConfig;", "Landroid/os/Parcelable;", "_avito_extended-profile-selection-create_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExtendedProfileSelectionCreateConfig implements Parcelable {

    @k
    public static final Parcelable.Creator<ExtendedProfileSelectionCreateConfig> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f151611b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f151612c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f151613d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f151614e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f151615f;

    /* renamed from: g, reason: collision with root package name */
    public final int f151616g;

    /* renamed from: h, reason: collision with root package name */
    public final int f151617h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f151618i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Long f151619j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Boolean f151620k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final String f151621l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final Image f151622m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final Long f151623n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final ArrayList f151624o;

    /* compiled from: ExtendedProfileSelectionCreateConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileSelectionCreateConfig> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSelectionCreateConfig createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            String string5 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ExtendedProfileSelectionCreateConfig(string, string2, string3, string4, numValueOf, i12, i13, string5, lValueOf, boolValueOf, parcel.readString(), (Image) parcel.readParcelable(ExtendedProfileSelectionCreateConfig.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSelectionCreateConfig[] newArray(int i12) {
            return new ExtendedProfileSelectionCreateConfig[i12];
        }
    }

    public ExtendedProfileSelectionCreateConfig(@k String str, @k String str2, @l String str3, @l String str4, @l Integer num, int i12, int i13, @l String str5, @l Long l12, @l Boolean bool, @l String str6, @l Image image, @l Long l13, @k ArrayList arrayList) {
        this.f151611b = str;
        this.f151612c = str2;
        this.f151613d = str3;
        this.f151614e = str4;
        this.f151615f = num;
        this.f151616g = i12;
        this.f151617h = i13;
        this.f151618i = str5;
        this.f151619j = l12;
        this.f151620k = bool;
        this.f151621l = str6;
        this.f151622m = image;
        this.f151623n = l13;
        this.f151624o = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedProfileSelectionCreateConfig)) {
            return false;
        }
        ExtendedProfileSelectionCreateConfig extendedProfileSelectionCreateConfig = (ExtendedProfileSelectionCreateConfig) obj;
        return L.f(this.f151611b, extendedProfileSelectionCreateConfig.f151611b) && L.f(this.f151612c, extendedProfileSelectionCreateConfig.f151612c) && L.f(this.f151613d, extendedProfileSelectionCreateConfig.f151613d) && L.f(this.f151614e, extendedProfileSelectionCreateConfig.f151614e) && L.f(this.f151615f, extendedProfileSelectionCreateConfig.f151615f) && this.f151616g == extendedProfileSelectionCreateConfig.f151616g && this.f151617h == extendedProfileSelectionCreateConfig.f151617h && L.f(this.f151618i, extendedProfileSelectionCreateConfig.f151618i) && L.f(this.f151619j, extendedProfileSelectionCreateConfig.f151619j) && L.f(this.f151620k, extendedProfileSelectionCreateConfig.f151620k) && L.f(this.f151621l, extendedProfileSelectionCreateConfig.f151621l) && L.f(this.f151622m, extendedProfileSelectionCreateConfig.f151622m) && L.f(this.f151623n, extendedProfileSelectionCreateConfig.f151623n) && L.f(this.f151624o, extendedProfileSelectionCreateConfig.f151624o);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f151611b.hashCode() * 31, 31, this.f151612c);
        String str = this.f151613d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f151614e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f151615f;
        int iE2 = r.e(this.f151617h, r.e(this.f151616g, (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
        String str3 = this.f151618i;
        int iHashCode3 = (iE2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l12 = this.f151619j;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Boolean bool = this.f151620k;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f151621l;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Image image = this.f151622m;
        int iHashCode7 = (iHashCode6 + (image == null ? 0 : image.hashCode())) * 31;
        Long l13 = this.f151623n;
        return this.f151624o.hashCode() + ((iHashCode7 + (l13 != null ? l13.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileSelectionCreateConfig(userKey=");
        sb2.append(this.f151611b);
        sb2.append(", fieldName=");
        sb2.append(this.f151612c);
        sb2.append(", form=");
        sb2.append(this.f151613d);
        sb2.append(", fromPage=");
        sb2.append(this.f151614e);
        sb2.append(", pageSize=");
        sb2.append(this.f151615f);
        sb2.append(", minAdvertItems=");
        sb2.append(this.f151616g);
        sb2.append(", maxAdvertItems=");
        sb2.append(this.f151617h);
        sb2.append(", savedValueId=");
        sb2.append(this.f151618i);
        sb2.append(", savedItemListId=");
        sb2.append(this.f151619j);
        sb2.append(", savedIsPublic=");
        sb2.append(this.f151620k);
        sb2.append(", savedName=");
        sb2.append(this.f151621l);
        sb2.append(", savedCoverImage=");
        sb2.append(this.f151622m);
        sb2.append(", savedCoverImageId=");
        sb2.append(this.f151623n);
        sb2.append(", valuesIdOrder=");
        return e.p(sb2, this.f151624o, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f151611b);
        parcel.writeString(this.f151612c);
        parcel.writeString(this.f151613d);
        parcel.writeString(this.f151614e);
        Integer num = this.f151615f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeInt(this.f151616g);
        parcel.writeInt(this.f151617h);
        parcel.writeString(this.f151618i);
        Long l12 = this.f151619j;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Boolean bool = this.f151620k;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.f151621l);
        parcel.writeParcelable(this.f151622m, i12);
        Long l13 = this.f151623n;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
        parcel.writeStringList(this.f151624o);
    }
}
