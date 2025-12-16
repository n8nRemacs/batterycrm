package com.avito.android.suggest_locations;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;

/* compiled from: SuggestLocationsArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_locations/SuggestLocationsArguments;", "Landroid/os/Parcelable;", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SuggestLocationsArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SuggestLocationsArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f292123b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f292124c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f292125d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f292126e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final PublishIntentFactory.LocationPickerChooseButtonLocation f292127f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final PublishIntentFactory.SuggestLocationsFlowType f292128g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f292129h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final AddressParameter.ValidationRules f292130i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f292131j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f292132k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f292133l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f292134m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final String f292135n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final String f292136o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final Boolean f292137p;

    /* compiled from: SuggestLocationsArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SuggestLocationsArguments> {
        @Override // android.os.Parcelable.Creator
        public final SuggestLocationsArguments createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            PublishIntentFactory.LocationPickerChooseButtonLocation locationPickerChooseButtonLocationValueOf = parcel.readInt() == 0 ? null : PublishIntentFactory.LocationPickerChooseButtonLocation.valueOf(parcel.readString());
            PublishIntentFactory.SuggestLocationsFlowType suggestLocationsFlowType = (PublishIntentFactory.SuggestLocationsFlowType) parcel.readParcelable(SuggestLocationsArguments.class.getClassLoader());
            String string4 = parcel.readString();
            AddressParameter.ValidationRules validationRules = (AddressParameter.ValidationRules) parcel.readParcelable(SuggestLocationsArguments.class.getClassLoader());
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SuggestLocationsArguments(string, string2, numValueOf, string3, locationPickerChooseButtonLocationValueOf, suggestLocationsFlowType, string4, validationRules, z12, z13, z14, string5, string6, string7, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final SuggestLocationsArguments[] newArray(int i12) {
            return new SuggestLocationsArguments[i12];
        }
    }

    public SuggestLocationsArguments(@Y61.l String str, @Y61.l String str2, @Y61.l Integer num, @Y61.l String str3, @Y61.l PublishIntentFactory.LocationPickerChooseButtonLocation locationPickerChooseButtonLocation, @Y61.k PublishIntentFactory.SuggestLocationsFlowType suggestLocationsFlowType, @Y61.l String str4, @Y61.l AddressParameter.ValidationRules validationRules, boolean z12, boolean z13, boolean z14, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l Boolean bool) {
        this.f292123b = str;
        this.f292124c = str2;
        this.f292125d = num;
        this.f292126e = str3;
        this.f292127f = locationPickerChooseButtonLocation;
        this.f292128g = suggestLocationsFlowType;
        this.f292129h = str4;
        this.f292130i = validationRules;
        this.f292131j = z12;
        this.f292132k = z13;
        this.f292133l = z14;
        this.f292134m = str5;
        this.f292135n = str6;
        this.f292136o = str7;
        this.f292137p = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestLocationsArguments)) {
            return false;
        }
        SuggestLocationsArguments suggestLocationsArguments = (SuggestLocationsArguments) obj;
        return kotlin.jvm.internal.L.f(this.f292123b, suggestLocationsArguments.f292123b) && kotlin.jvm.internal.L.f(this.f292124c, suggestLocationsArguments.f292124c) && kotlin.jvm.internal.L.f(this.f292125d, suggestLocationsArguments.f292125d) && kotlin.jvm.internal.L.f(this.f292126e, suggestLocationsArguments.f292126e) && this.f292127f == suggestLocationsArguments.f292127f && kotlin.jvm.internal.L.f(this.f292128g, suggestLocationsArguments.f292128g) && kotlin.jvm.internal.L.f(this.f292129h, suggestLocationsArguments.f292129h) && kotlin.jvm.internal.L.f(this.f292130i, suggestLocationsArguments.f292130i) && this.f292131j == suggestLocationsArguments.f292131j && this.f292132k == suggestLocationsArguments.f292132k && this.f292133l == suggestLocationsArguments.f292133l && kotlin.jvm.internal.L.f(this.f292134m, suggestLocationsArguments.f292134m) && kotlin.jvm.internal.L.f(this.f292135n, suggestLocationsArguments.f292135n) && kotlin.jvm.internal.L.f(this.f292136o, suggestLocationsArguments.f292136o) && kotlin.jvm.internal.L.f(this.f292137p, suggestLocationsArguments.f292137p);
    }

    public final int hashCode() {
        String str = this.f292123b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f292124c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f292125d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f292126e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PublishIntentFactory.LocationPickerChooseButtonLocation locationPickerChooseButtonLocation = this.f292127f;
        int iHashCode5 = (this.f292128g.hashCode() + ((iHashCode4 + (locationPickerChooseButtonLocation == null ? 0 : locationPickerChooseButtonLocation.hashCode())) * 31)) * 31;
        String str4 = this.f292129h;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AddressParameter.ValidationRules validationRules = this.f292130i;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode6 + (validationRules == null ? 0 : validationRules.hashCode())) * 31, 31, this.f292131j), 31, this.f292132k), 31, this.f292133l);
        String str5 = this.f292134m;
        int iHashCode7 = (i12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f292135n;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f292136o;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.f292137p;
        return iHashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestLocationsArguments(locationId=");
        sb2.append(this.f292123b);
        sb2.append(", categoryId=");
        sb2.append(this.f292124c);
        sb2.append(", fromBlock=");
        sb2.append(this.f292125d);
        sb2.append(", query=");
        sb2.append(this.f292126e);
        sb2.append(", chooseButtonLocation=");
        sb2.append(this.f292127f);
        sb2.append(", flowType=");
        sb2.append(this.f292128g);
        sb2.append(", geoSessionId=");
        sb2.append(this.f292129h);
        sb2.append(", validationRules=");
        sb2.append(this.f292130i);
        sb2.append(", autoOpenKeyboard=");
        sb2.append(this.f292131j);
        sb2.append(", useLegacyApi=");
        sb2.append(this.f292132k);
        sb2.append(", hideInnerCloseButton=");
        sb2.append(this.f292133l);
        sb2.append(", publicUserKey=");
        sb2.append(this.f292134m);
        sb2.append(", resultRequestKey=");
        sb2.append(this.f292135n);
        sb2.append(", paramId=");
        sb2.append(this.f292136o);
        sb2.append(", onlyRealLocations=");
        return C0.g(sb2, this.f292137p, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f292123b);
        parcel.writeString(this.f292124c);
        Integer num = this.f292125d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f292126e);
        PublishIntentFactory.LocationPickerChooseButtonLocation locationPickerChooseButtonLocation = this.f292127f;
        if (locationPickerChooseButtonLocation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(locationPickerChooseButtonLocation.name());
        }
        parcel.writeParcelable(this.f292128g, i12);
        parcel.writeString(this.f292129h);
        parcel.writeParcelable(this.f292130i, i12);
        parcel.writeInt(this.f292131j ? 1 : 0);
        parcel.writeInt(this.f292132k ? 1 : 0);
        parcel.writeInt(this.f292133l ? 1 : 0);
        parcel.writeString(this.f292134m);
        parcel.writeString(this.f292135n);
        parcel.writeString(this.f292136o);
        Boolean bool = this.f292137p;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ SuggestLocationsArguments(String str, String str2, Integer num, String str3, PublishIntentFactory.LocationPickerChooseButtonLocation locationPickerChooseButtonLocation, PublishIntentFactory.SuggestLocationsFlowType suggestLocationsFlowType, String str4, AddressParameter.ValidationRules validationRules, boolean z12, boolean z13, boolean z14, String str5, String str6, String str7, Boolean bool, int i12, C42822w c42822w) {
        this(str, str2, num, str3, locationPickerChooseButtonLocation, (i12 & 32) != 0 ? PublishIntentFactory.SuggestLocationsFlowType.Default.f231995b : suggestLocationsFlowType, (i12 & 64) != 0 ? null : str4, (i12 & 128) != 0 ? null : validationRules, (i12 & 256) != 0 ? false : z12, (i12 & 512) != 0 ? false : z13, (i12 & 1024) != 0 ? false : z14, (i12 & 2048) != 0 ? null : str5, (i12 & 4096) != 0 ? null : str6, (i12 & 8192) != 0 ? null : str7, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : bool);
    }
}
