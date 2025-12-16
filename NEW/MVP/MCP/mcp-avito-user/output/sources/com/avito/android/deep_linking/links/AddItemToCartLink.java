package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: AddItemToCartLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/AddItemToCartLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class AddItemToCartLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<AddItemToCartLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f132936b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f132937c;

    /* compiled from: AddItemToCartLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddItemToCartLink> {
        @Override // android.os.Parcelable.Creator
        public final AddItemToCartLink createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = org.webrtc.h.c(AddItemToCartLink.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new AddItemToCartLink(string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final AddItemToCartLink[] newArray(int i12) {
            return new AddItemToCartLink[i12];
        }
    }

    public AddItemToCartLink(@Y61.k String str, @Y61.l Map<String, ? extends Object> map) {
        this.f132936b = str;
        this.f132937c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddItemToCartLink)) {
            return false;
        }
        AddItemToCartLink addItemToCartLink = (AddItemToCartLink) obj;
        return kotlin.jvm.internal.L.f(this.f132936b, addItemToCartLink.f132936b) && kotlin.jvm.internal.L.f(this.f132937c, addItemToCartLink.f132937c);
    }

    public final int hashCode() {
        int iHashCode = this.f132936b.hashCode() * 31;
        Map<String, Object> map = this.f132937c;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddItemToCartLink(itemId=");
        sb2.append(this.f132936b);
        sb2.append(", extraParameters=");
        return androidx.appcompat.app.r.w(sb2, this.f132937c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f132936b);
        Map<String, Object> map = this.f132937c;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
        }
    }
}
