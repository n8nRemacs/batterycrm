package com.avito.android.messenger.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: FlowerRedirectLink.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/deeplink/FlowerRedirectLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final class FlowerRedirectLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<FlowerRedirectLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f195326b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f195327c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final DeepLink f195328d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f195329e;

    /* compiled from: FlowerRedirectLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlowerRedirectLink> {
        @Override // android.os.Parcelable.Creator
        public final FlowerRedirectLink createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            DeepLink deepLink = (DeepLink) parcel.readParcelable(FlowerRedirectLink.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = org.webrtc.h.c(FlowerRedirectLink.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new FlowerRedirectLink(string, z12, deepLink, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final FlowerRedirectLink[] newArray(int i12) {
            return new FlowerRedirectLink[i12];
        }
    }

    public FlowerRedirectLink(@Y61.k String str, boolean z12, @Y61.k DeepLink deepLink, @Y61.l Map<String, ? extends Object> map) {
        this.f195326b = str;
        this.f195327c = z12;
        this.f195328d = deepLink;
        this.f195329e = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f195326b);
        parcel.writeInt(this.f195327c ? 1 : 0);
        parcel.writeParcelable(this.f195328d, i12);
        Map<String, Object> map = this.f195329e;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = com.akita.compose.theme.re23.style.C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
        }
    }
}
