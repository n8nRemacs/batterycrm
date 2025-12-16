package com.avito.android.suggest_locations.sheet;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SuggestLocationsSheetArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_locations/sheet/SuggestLocationsSheetArguments;", "Landroid/os/Parcelable;", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SuggestLocationsSheetArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<SuggestLocationsSheetArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f292364b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f292365c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f292366d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f292367e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final PublishIntentFactory.LocationPickerChooseButtonLocation f292368f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final PublishIntentFactory.SuggestLocationsFlowType f292369g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f292370h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final AddressParameter.ValidationRules f292371i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f292372j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f292373k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f292374l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f292375m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f292376n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final String f292377o;

    /* compiled from: SuggestLocationsSheetArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SuggestLocationsSheetArguments> {
        @Override // android.os.Parcelable.Creator
        public final SuggestLocationsSheetArguments createFromParcel(Parcel parcel) {
            return new SuggestLocationsSheetArguments(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? PublishIntentFactory.LocationPickerChooseButtonLocation.valueOf(parcel.readString()) : null, (PublishIntentFactory.SuggestLocationsFlowType) parcel.readParcelable(SuggestLocationsSheetArguments.class.getClassLoader()), parcel.readString(), (AddressParameter.ValidationRules) parcel.readParcelable(SuggestLocationsSheetArguments.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuggestLocationsSheetArguments[] newArray(int i12) {
            return new SuggestLocationsSheetArguments[i12];
        }
    }

    public SuggestLocationsSheetArguments(@l String str, @l String str2, @l Integer num, @l String str3, @l PublishIntentFactory.LocationPickerChooseButtonLocation locationPickerChooseButtonLocation, @k PublishIntentFactory.SuggestLocationsFlowType suggestLocationsFlowType, @l String str4, @l AddressParameter.ValidationRules validationRules, boolean z12, boolean z13, boolean z14, @l String str5, @l String str6, @l String str7) {
        this.f292364b = str;
        this.f292365c = str2;
        this.f292366d = num;
        this.f292367e = str3;
        this.f292368f = locationPickerChooseButtonLocation;
        this.f292369g = suggestLocationsFlowType;
        this.f292370h = str4;
        this.f292371i = validationRules;
        this.f292372j = z12;
        this.f292373k = z13;
        this.f292374l = z14;
        this.f292375m = str5;
        this.f292376n = str6;
        this.f292377o = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestLocationsSheetArguments)) {
            return false;
        }
        SuggestLocationsSheetArguments suggestLocationsSheetArguments = (SuggestLocationsSheetArguments) obj;
        return L.f(this.f292364b, suggestLocationsSheetArguments.f292364b) && L.f(this.f292365c, suggestLocationsSheetArguments.f292365c) && L.f(this.f292366d, suggestLocationsSheetArguments.f292366d) && L.f(this.f292367e, suggestLocationsSheetArguments.f292367e) && this.f292368f == suggestLocationsSheetArguments.f292368f && L.f(this.f292369g, suggestLocationsSheetArguments.f292369g) && L.f(this.f292370h, suggestLocationsSheetArguments.f292370h) && L.f(this.f292371i, suggestLocationsSheetArguments.f292371i) && this.f292372j == suggestLocationsSheetArguments.f292372j && this.f292373k == suggestLocationsSheetArguments.f292373k && this.f292374l == suggestLocationsSheetArguments.f292374l && L.f(this.f292375m, suggestLocationsSheetArguments.f292375m) && L.f(this.f292376n, suggestLocationsSheetArguments.f292376n) && L.f(this.f292377o, suggestLocationsSheetArguments.f292377o);
    }

    public final int hashCode() {
        String str = this.f292364b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f292365c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f292366d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f292367e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PublishIntentFactory.LocationPickerChooseButtonLocation locationPickerChooseButtonLocation = this.f292368f;
        int iHashCode5 = (this.f292369g.hashCode() + ((iHashCode4 + (locationPickerChooseButtonLocation == null ? 0 : locationPickerChooseButtonLocation.hashCode())) * 31)) * 31;
        String str4 = this.f292370h;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AddressParameter.ValidationRules validationRules = this.f292371i;
        int i12 = r.i(r.i(r.i((iHashCode6 + (validationRules == null ? 0 : validationRules.hashCode())) * 31, 31, this.f292372j), 31, this.f292373k), 31, this.f292374l);
        String str5 = this.f292375m;
        int iHashCode7 = (i12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f292376n;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f292377o;
        return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestLocationsSheetArguments(locationId=");
        sb2.append(this.f292364b);
        sb2.append(", categoryId=");
        sb2.append(this.f292365c);
        sb2.append(", fromBlock=");
        sb2.append(this.f292366d);
        sb2.append(", query=");
        sb2.append(this.f292367e);
        sb2.append(", chooseButtonLocation=");
        sb2.append(this.f292368f);
        sb2.append(", flowType=");
        sb2.append(this.f292369g);
        sb2.append(", geoSessionId=");
        sb2.append(this.f292370h);
        sb2.append(", validationRules=");
        sb2.append(this.f292371i);
        sb2.append(", autoOpenKeyboard=");
        sb2.append(this.f292372j);
        sb2.append(", useLegacyApi=");
        sb2.append(this.f292373k);
        sb2.append(", hideInnerCloseButton=");
        sb2.append(this.f292374l);
        sb2.append(", publicUserKey=");
        sb2.append(this.f292375m);
        sb2.append(", resultRequestKey=");
        sb2.append(this.f292376n);
        sb2.append(", headerTitle=");
        return C22026a.c(sb2, this.f292377o, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f292364b);
        parcel.writeString(this.f292365c);
        Integer num = this.f292366d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f292367e);
        PublishIntentFactory.LocationPickerChooseButtonLocation locationPickerChooseButtonLocation = this.f292368f;
        if (locationPickerChooseButtonLocation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(locationPickerChooseButtonLocation.name());
        }
        parcel.writeParcelable(this.f292369g, i12);
        parcel.writeString(this.f292370h);
        parcel.writeParcelable(this.f292371i, i12);
        parcel.writeInt(this.f292372j ? 1 : 0);
        parcel.writeInt(this.f292373k ? 1 : 0);
        parcel.writeInt(this.f292374l ? 1 : 0);
        parcel.writeString(this.f292375m);
        parcel.writeString(this.f292376n);
        parcel.writeString(this.f292377o);
    }

    public /* synthetic */ SuggestLocationsSheetArguments(String str, String str2, Integer num, String str3, PublishIntentFactory.LocationPickerChooseButtonLocation locationPickerChooseButtonLocation, PublishIntentFactory.SuggestLocationsFlowType suggestLocationsFlowType, String str4, AddressParameter.ValidationRules validationRules, boolean z12, boolean z13, boolean z14, String str5, String str6, String str7, int i12, C42822w c42822w) {
        this(str, str2, num, str3, locationPickerChooseButtonLocation, (i12 & 32) != 0 ? PublishIntentFactory.SuggestLocationsFlowType.Default.f231995b : suggestLocationsFlowType, (i12 & 64) != 0 ? null : str4, (i12 & 128) != 0 ? null : validationRules, (i12 & 256) != 0 ? false : z12, (i12 & 512) != 0 ? false : z13, (i12 & 1024) != 0 ? false : z14, (i12 & 2048) != 0 ? null : str5, (i12 & 4096) != 0 ? null : str6, (i12 & 8192) != 0 ? null : str7);
    }
}
