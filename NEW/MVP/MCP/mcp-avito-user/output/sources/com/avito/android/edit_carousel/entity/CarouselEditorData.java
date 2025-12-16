package com.avito.android.edit_carousel.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.entity.CarouselEditorSettings;
import com.avito.android.profile_settings_extended.entity.ExtendedProfileSettingsAdvert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CarouselEditorData.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/entity/CarouselEditorData;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CarouselEditorData implements Parcelable {

    @k
    public static final Parcelable.Creator<CarouselEditorData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f146377b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f146378c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CarouselEditorSettings f146379d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<ExtendedProfileSettingsAdvert> f146380e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f146381f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f146382g;

    /* compiled from: CarouselEditorData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CarouselEditorData> {
        @Override // android.os.Parcelable.Creator
        public final CarouselEditorData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            CarouselEditorSettings carouselEditorSettingsCreateFromParcel = CarouselEditorSettings.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(ExtendedProfileSettingsAdvert.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new CarouselEditorData(string, string2, carouselEditorSettingsCreateFromParcel, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CarouselEditorData[] newArray(int i12) {
            return new CarouselEditorData[i12];
        }
    }

    public CarouselEditorData(@k String str, @l String str2, @k CarouselEditorSettings carouselEditorSettings, @l List<ExtendedProfileSettingsAdvert> list, @l Integer num, boolean z12) {
        this.f146377b = str;
        this.f146378c = str2;
        this.f146379d = carouselEditorSettings;
        this.f146380e = list;
        this.f146381f = num;
        this.f146382g = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselEditorData)) {
            return false;
        }
        CarouselEditorData carouselEditorData = (CarouselEditorData) obj;
        return L.f(this.f146377b, carouselEditorData.f146377b) && L.f(this.f146378c, carouselEditorData.f146378c) && L.f(this.f146379d, carouselEditorData.f146379d) && L.f(this.f146380e, carouselEditorData.f146380e) && L.f(this.f146381f, carouselEditorData.f146381f) && this.f146382g == carouselEditorData.f146382g;
    }

    public final int hashCode() {
        int iHashCode = this.f146377b.hashCode() * 31;
        String str = this.f146378c;
        int iHashCode2 = (this.f146379d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        List<ExtendedProfileSettingsAdvert> list = this.f146380e;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.f146381f;
        return Boolean.hashCode(this.f146382g) + ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CarouselEditorData(fieldName=");
        sb2.append(this.f146377b);
        sb2.append(", valueId=");
        sb2.append(this.f146378c);
        sb2.append(", settings=");
        sb2.append(this.f146379d);
        sb2.append(", adverts=");
        sb2.append(this.f146380e);
        sb2.append(", nameId=");
        sb2.append(this.f146381f);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f146382g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f146377b);
        parcel.writeString(this.f146378c);
        this.f146379d.writeToParcel(parcel, i12);
        List<ExtendedProfileSettingsAdvert> list = this.f146380e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((ExtendedProfileSettingsAdvert) itA.next()).writeToParcel(parcel, i12);
            }
        }
        Integer num = this.f146381f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeInt(this.f146382g ? 1 : 0);
    }
}
