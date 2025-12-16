package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: UniversalDeliveryTypeDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/UniversalDeliveryTypeDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class UniversalDeliveryTypeDeeplink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<UniversalDeliveryTypeDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f133748b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f133749c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133750d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f133751e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f133752f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final ParametrizedEvent f133753g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f133754h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f133755i;

    /* compiled from: UniversalDeliveryTypeDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalDeliveryTypeDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final UniversalDeliveryTypeDeeplink createFromParcel(Parcel parcel) {
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
            return new UniversalDeliveryTypeDeeplink(string, linkedHashMap, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? ParametrizedEvent.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalDeliveryTypeDeeplink[] newArray(int i12) {
            return new UniversalDeliveryTypeDeeplink[i12];
        }
    }

    public UniversalDeliveryTypeDeeplink(@Y61.l String str, @Y61.l Map<String, String> map, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l ParametrizedEvent parametrizedEvent, @Y61.l String str5, @Y61.l String str6) {
        this.f133748b = str;
        this.f133749c = map;
        this.f133750d = str2;
        this.f133751e = str3;
        this.f133752f = str4;
        this.f133753g = parametrizedEvent;
        this.f133754h = str5;
        this.f133755i = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalDeliveryTypeDeeplink)) {
            return false;
        }
        UniversalDeliveryTypeDeeplink universalDeliveryTypeDeeplink = (UniversalDeliveryTypeDeeplink) obj;
        return kotlin.jvm.internal.L.f(this.f133748b, universalDeliveryTypeDeeplink.f133748b) && kotlin.jvm.internal.L.f(this.f133749c, universalDeliveryTypeDeeplink.f133749c) && kotlin.jvm.internal.L.f(this.f133750d, universalDeliveryTypeDeeplink.f133750d) && kotlin.jvm.internal.L.f(this.f133751e, universalDeliveryTypeDeeplink.f133751e) && kotlin.jvm.internal.L.f(this.f133752f, universalDeliveryTypeDeeplink.f133752f) && kotlin.jvm.internal.L.f(this.f133753g, universalDeliveryTypeDeeplink.f133753g) && kotlin.jvm.internal.L.f(this.f133754h, universalDeliveryTypeDeeplink.f133754h) && kotlin.jvm.internal.L.f(this.f133755i, universalDeliveryTypeDeeplink.f133755i);
    }

    public final int hashCode() {
        String str = this.f133748b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.f133749c;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.f133750d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133751e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133752f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.f133753g;
        int iHashCode6 = (iHashCode5 + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        String str5 = this.f133754h;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f133755i;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalDeliveryTypeDeeplink(deliveryType=");
        sb2.append(this.f133748b);
        sb2.append(", extraRequestParams=");
        sb2.append(this.f133749c);
        sb2.append(", nextScreen=");
        sb2.append(this.f133750d);
        sb2.append(", itemId=");
        sb2.append(this.f133751e);
        sb2.append(", context=");
        sb2.append(this.f133752f);
        sb2.append(", contactEvent=");
        sb2.append(this.f133753g);
        sb2.append(", promocode=");
        sb2.append(this.f133754h);
        sb2.append(", reloadReason=");
        return C22026a.c(sb2, this.f133755i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133748b);
        Map<String, String> map = this.f133749c;
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
        parcel.writeString(this.f133750d);
        parcel.writeString(this.f133751e);
        parcel.writeString(this.f133752f);
        ParametrizedEvent parametrizedEvent = this.f133753g;
        if (parametrizedEvent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parametrizedEvent.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f133754h);
        parcel.writeString(this.f133755i);
    }
}
