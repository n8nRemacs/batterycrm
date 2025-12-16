package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ClickStreamLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ClickStreamLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class ClickStreamLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ClickStreamLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f133107b;

    /* renamed from: c, reason: collision with root package name */
    public final int f133108c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f133109d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final DeepLink f133110e;

    /* compiled from: ClickStreamLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClickStreamLink> {
        @Override // android.os.Parcelable.Creator
        public final ClickStreamLink createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                int iA2 = 0;
                while (iA2 != i14) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ClickStreamLink(i12, i13, linkedHashMap, (DeepLink) parcel.readParcelable(ClickStreamLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ClickStreamLink[] newArray(int i12) {
            return new ClickStreamLink[i12];
        }
    }

    public ClickStreamLink(int i12, int i13, @Y61.l Map<String, String> map, @Y61.l DeepLink deepLink) {
        this.f133107b = i12;
        this.f133108c = i13;
        this.f133109d = map;
        this.f133110e = deepLink;
    }

    public static ClickStreamLink a(ClickStreamLink clickStreamLink, DeepLink deepLink) {
        int i12 = clickStreamLink.f133107b;
        int i13 = clickStreamLink.f133108c;
        Map<String, String> map = clickStreamLink.f133109d;
        clickStreamLink.getClass();
        return new ClickStreamLink(i12, i13, map, deepLink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickStreamLink)) {
            return false;
        }
        ClickStreamLink clickStreamLink = (ClickStreamLink) obj;
        return this.f133107b == clickStreamLink.f133107b && this.f133108c == clickStreamLink.f133108c && kotlin.jvm.internal.L.f(this.f133109d, clickStreamLink.f133109d) && kotlin.jvm.internal.L.f(this.f133110e, clickStreamLink.f133110e);
    }

    public final int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.f133108c, Integer.hashCode(this.f133107b) * 31, 31);
        Map<String, String> map = this.f133109d;
        int iHashCode = (iE2 + (map == null ? 0 : map.hashCode())) * 31;
        DeepLink deepLink = this.f133110e;
        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClickStreamLink(eventId=");
        sb2.append(this.f133107b);
        sb2.append(", eventVersion=");
        sb2.append(this.f133108c);
        sb2.append(", parameters=");
        sb2.append(this.f133109d);
        sb2.append(", redirect=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f133110e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f133107b);
        parcel.writeInt(this.f133108c);
        Map<String, String> map = this.f133109d;
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
        parcel.writeParcelable(this.f133110e, i12);
    }
}
