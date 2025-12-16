package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: DeliverySavedAddressCheckLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/DeliverySavedAddressCheckLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class DeliverySavedAddressCheckLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<DeliverySavedAddressCheckLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133196b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133197c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ParametrizedEvent f133198d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f133199e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f133200f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f133201g;

    /* compiled from: DeliverySavedAddressCheckLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeliverySavedAddressCheckLink> {
        @Override // android.os.Parcelable.Creator
        public final DeliverySavedAddressCheckLink createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            ParametrizedEvent parametrizedEventCreateFromParcel = parcel.readInt() == 0 ? null : ParametrizedEvent.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            return new DeliverySavedAddressCheckLink(string, string2, parametrizedEventCreateFromParcel, string3, string4, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final DeliverySavedAddressCheckLink[] newArray(int i12) {
            return new DeliverySavedAddressCheckLink[i12];
        }
    }

    public DeliverySavedAddressCheckLink(@Y61.k String str, @Y61.l String str2, @Y61.l ParametrizedEvent parametrizedEvent, @Y61.l String str3, @Y61.l String str4, @Y61.l Map<String, String> map) {
        this.f133196b = str;
        this.f133197c = str2;
        this.f133198d = parametrizedEvent;
        this.f133199e = str3;
        this.f133200f = str4;
        this.f133201g = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133196b);
        parcel.writeString(this.f133197c);
        ParametrizedEvent parametrizedEvent = this.f133198d;
        if (parametrizedEvent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parametrizedEvent.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f133199e);
        parcel.writeString(this.f133200f);
        Map<String, String> map = this.f133201g;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
