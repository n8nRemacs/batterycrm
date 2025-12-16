package com.avito.android.safedeal.universal_delivery_type;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalDeliveryTypeParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/UniversalDeliveryTypeParams;", "Landroid/os/Parcelable;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UniversalDeliveryTypeParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<UniversalDeliveryTypeParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f256425b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f256426c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f256427d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f256428e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f256429f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final ParametrizedEvent f256430g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f256431h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Integer f256432i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final ReloadReason f256433j;

    /* compiled from: UniversalDeliveryTypeParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalDeliveryTypeParams> {
        @Override // android.os.Parcelable.Creator
        public final UniversalDeliveryTypeParams createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            return new UniversalDeliveryTypeParams(string, linkedHashMap, parcel.readString(), parcel.readString(), parcel.readString(), (ParametrizedEvent) parcel.readParcelable(UniversalDeliveryTypeParams.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : ReloadReason.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalDeliveryTypeParams[] newArray(int i12) {
            return new UniversalDeliveryTypeParams[i12];
        }
    }

    public UniversalDeliveryTypeParams(@Y61.l String str, @Y61.l Map<String, String> map, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l ParametrizedEvent parametrizedEvent, @Y61.l String str5, @Y61.l Integer num, @Y61.l ReloadReason reloadReason) {
        this.f256425b = str;
        this.f256426c = map;
        this.f256427d = str2;
        this.f256428e = str3;
        this.f256429f = str4;
        this.f256430g = parametrizedEvent;
        this.f256431h = str5;
        this.f256432i = num;
        this.f256433j = reloadReason;
    }

    public static UniversalDeliveryTypeParams a(UniversalDeliveryTypeParams universalDeliveryTypeParams, Integer num, ReloadReason reloadReason) {
        String str = universalDeliveryTypeParams.f256425b;
        Map<String, String> map = universalDeliveryTypeParams.f256426c;
        String str2 = universalDeliveryTypeParams.f256427d;
        String str3 = universalDeliveryTypeParams.f256428e;
        String str4 = universalDeliveryTypeParams.f256429f;
        ParametrizedEvent parametrizedEvent = universalDeliveryTypeParams.f256430g;
        String str5 = universalDeliveryTypeParams.f256431h;
        universalDeliveryTypeParams.getClass();
        return new UniversalDeliveryTypeParams(str, map, str2, str3, str4, parametrizedEvent, str5, num, reloadReason);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalDeliveryTypeParams)) {
            return false;
        }
        UniversalDeliveryTypeParams universalDeliveryTypeParams = (UniversalDeliveryTypeParams) obj;
        return L.f(this.f256425b, universalDeliveryTypeParams.f256425b) && L.f(this.f256426c, universalDeliveryTypeParams.f256426c) && L.f(this.f256427d, universalDeliveryTypeParams.f256427d) && L.f(this.f256428e, universalDeliveryTypeParams.f256428e) && L.f(this.f256429f, universalDeliveryTypeParams.f256429f) && L.f(this.f256430g, universalDeliveryTypeParams.f256430g) && L.f(this.f256431h, universalDeliveryTypeParams.f256431h) && L.f(this.f256432i, universalDeliveryTypeParams.f256432i) && this.f256433j == universalDeliveryTypeParams.f256433j;
    }

    public final int hashCode() {
        String str = this.f256425b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.f256426c;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.f256427d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f256428e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f256429f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.f256430g;
        int iHashCode6 = (iHashCode5 + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        String str5 = this.f256431h;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f256432i;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        ReloadReason reloadReason = this.f256433j;
        return iHashCode8 + (reloadReason != null ? reloadReason.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "UniversalDeliveryTypeParams(deliveryType=" + this.f256425b + ", extraRequestParams=" + this.f256426c + ", nextScreen=" + this.f256427d + ", itemId=" + this.f256428e + ", context=" + this.f256429f + ", contactEvent=" + this.f256430g + ", promocode=" + this.f256431h + ", userAddressId=" + this.f256432i + ", reloadReason=" + this.f256433j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f256425b);
        Map<String, String> map = this.f256426c;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeString(this.f256427d);
        parcel.writeString(this.f256428e);
        parcel.writeString(this.f256429f);
        parcel.writeParcelable(this.f256430g, i12);
        parcel.writeString(this.f256431h);
        Integer num = this.f256432i;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        ReloadReason reloadReason = this.f256433j;
        if (reloadReason == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(reloadReason.name());
        }
    }
}
