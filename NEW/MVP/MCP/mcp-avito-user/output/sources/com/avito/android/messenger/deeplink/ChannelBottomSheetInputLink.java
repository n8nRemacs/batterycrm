package com.avito.android.messenger.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ChannelBottomSheetInputLink.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/deeplink/ChannelBottomSheetInputLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class ChannelBottomSheetInputLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ChannelBottomSheetInputLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f195308b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f195309c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f195310d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f195311e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f195312f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f195313g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f195314h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f195315i;

    /* compiled from: ChannelBottomSheetInputLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChannelBottomSheetInputLink> {
        @Override // android.os.Parcelable.Creator
        public final ChannelBottomSheetInputLink createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = org.webrtc.h.c(ChannelBottomSheetInputLink.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
                }
            }
            return new ChannelBottomSheetInputLink(string, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelBottomSheetInputLink[] newArray(int i12) {
            return new ChannelBottomSheetInputLink[i12];
        }
    }

    public ChannelBottomSheetInputLink(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l Map map) {
        this.f195308b = str;
        this.f195309c = map;
        this.f195310d = str2;
        this.f195311e = str3;
        this.f195312f = str4;
        this.f195313g = str5;
        this.f195314h = str6;
        this.f195315i = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelBottomSheetInputLink)) {
            return false;
        }
        ChannelBottomSheetInputLink channelBottomSheetInputLink = (ChannelBottomSheetInputLink) obj;
        return kotlin.jvm.internal.L.f(this.f195308b, channelBottomSheetInputLink.f195308b) && kotlin.jvm.internal.L.f(this.f195309c, channelBottomSheetInputLink.f195309c) && kotlin.jvm.internal.L.f(this.f195310d, channelBottomSheetInputLink.f195310d) && kotlin.jvm.internal.L.f(this.f195311e, channelBottomSheetInputLink.f195311e) && kotlin.jvm.internal.L.f(this.f195312f, channelBottomSheetInputLink.f195312f) && kotlin.jvm.internal.L.f(this.f195313g, channelBottomSheetInputLink.f195313g) && kotlin.jvm.internal.L.f(this.f195314h, channelBottomSheetInputLink.f195314h) && kotlin.jvm.internal.L.f(this.f195315i, channelBottomSheetInputLink.f195315i);
    }

    public final int hashCode() {
        int iHashCode = this.f195308b.hashCode() * 31;
        Map<String, Object> map = this.f195309c;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f195310d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f195311e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f195312f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f195313g;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f195314h;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f195315i;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChannelBottomSheetInputLink(url=");
        sb2.append(this.f195308b);
        sb2.append(", urlParams=");
        sb2.append(this.f195309c);
        sb2.append(", title=");
        sb2.append(this.f195310d);
        sb2.append(", description=");
        sb2.append(this.f195311e);
        sb2.append(", placeholder=");
        sb2.append(this.f195312f);
        sb2.append(", defaultInput=");
        sb2.append(this.f195313g);
        sb2.append(", actionButtonTitle=");
        sb2.append(this.f195314h);
        sb2.append(", cancelButtonTitle=");
        return C22026a.c(sb2, this.f195315i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f195308b);
        Map<String, Object> map = this.f195309c;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = com.akita.compose.theme.re23.style.C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        parcel.writeString(this.f195310d);
        parcel.writeString(this.f195311e);
        parcel.writeString(this.f195312f);
        parcel.writeString(this.f195313g);
        parcel.writeString(this.f195314h);
        parcel.writeString(this.f195315i);
    }
}
