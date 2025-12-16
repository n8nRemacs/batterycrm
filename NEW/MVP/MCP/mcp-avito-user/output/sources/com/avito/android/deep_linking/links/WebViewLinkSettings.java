package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WebViewLink.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/WebViewLinkSettings;", "Landroid/os/Parcelable;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WebViewLinkSettings implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<WebViewLinkSettings> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f133867b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f133868c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f133869d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f133870e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f133871f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f133872g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f133873h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f133874i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f133875j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f133876k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f133877l;

    /* compiled from: WebViewLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WebViewLinkSettings> {
        @Override // android.os.Parcelable.Creator
        public final WebViewLinkSettings createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new WebViewLinkSettings(z12, z13, z14, z15, z16, string, linkedHashMap, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final WebViewLinkSettings[] newArray(int i12) {
            return new WebViewLinkSettings[i12];
        }
    }

    public WebViewLinkSettings() {
        this(false, false, false, false, false, null, null, false, false, false, false, 2047, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewLinkSettings)) {
            return false;
        }
        WebViewLinkSettings webViewLinkSettings = (WebViewLinkSettings) obj;
        return this.f133867b == webViewLinkSettings.f133867b && this.f133868c == webViewLinkSettings.f133868c && this.f133869d == webViewLinkSettings.f133869d && this.f133870e == webViewLinkSettings.f133870e && this.f133871f == webViewLinkSettings.f133871f && kotlin.jvm.internal.L.f(this.f133872g, webViewLinkSettings.f133872g) && kotlin.jvm.internal.L.f(this.f133873h, webViewLinkSettings.f133873h) && this.f133874i == webViewLinkSettings.f133874i && this.f133875j == webViewLinkSettings.f133875j && this.f133876k == webViewLinkSettings.f133876k && this.f133877l == webViewLinkSettings.f133877l;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(Boolean.hashCode(this.f133867b) * 31, 31, this.f133868c), 31, this.f133869d), 31, this.f133870e), 31, this.f133871f);
        String str = this.f133872g;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.f133873h;
        return Boolean.hashCode(this.f133877l) + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode + (map != null ? map.hashCode() : 0)) * 31, 31, this.f133874i), 31, this.f133875j), 31, this.f133876k);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WebViewLinkSettings(fullscreen=");
        sb2.append(this.f133867b);
        sb2.append(", withMavAuthorization=");
        sb2.append(this.f133868c);
        sb2.append(", keepOnDeepLinkOpen=");
        sb2.append(this.f133869d);
        sb2.append(", withQuickLoader=");
        sb2.append(this.f133870e);
        sb2.append(", needAppAuth=");
        sb2.append(this.f133871f);
        sb2.append(", authSource=");
        sb2.append(this.f133872g);
        sb2.append(", headers=");
        sb2.append(this.f133873h);
        sb2.append(", isLongPressEnabled=");
        sb2.append(this.f133874i);
        sb2.append(", supportDeeplinkInRedirect=");
        sb2.append(this.f133875j);
        sb2.append(", openStoreWebLinkInApp=");
        sb2.append(this.f133876k);
        sb2.append(", showWebPageTitle=");
        return androidx.appcompat.app.r.x(sb2, this.f133877l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f133867b ? 1 : 0);
        parcel.writeInt(this.f133868c ? 1 : 0);
        parcel.writeInt(this.f133869d ? 1 : 0);
        parcel.writeInt(this.f133870e ? 1 : 0);
        parcel.writeInt(this.f133871f ? 1 : 0);
        parcel.writeString(this.f133872g);
        Map<String, String> map = this.f133873h;
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
        parcel.writeInt(this.f133874i ? 1 : 0);
        parcel.writeInt(this.f133875j ? 1 : 0);
        parcel.writeInt(this.f133876k ? 1 : 0);
        parcel.writeInt(this.f133877l ? 1 : 0);
    }

    public WebViewLinkSettings(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, @Y61.l String str, @Y61.l Map<String, String> map, boolean z17, boolean z18, boolean z19, boolean z22) {
        this.f133867b = z12;
        this.f133868c = z13;
        this.f133869d = z14;
        this.f133870e = z15;
        this.f133871f = z16;
        this.f133872g = str;
        this.f133873h = map;
        this.f133874i = z17;
        this.f133875j = z18;
        this.f133876k = z19;
        this.f133877l = z22;
    }

    public /* synthetic */ WebViewLinkSettings(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String str, Map map, boolean z17, boolean z18, boolean z19, boolean z22, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? false : z14, (i12 & 8) != 0 ? false : z15, (i12 & 16) != 0 ? false : z16, (i12 & 32) != 0 ? null : str, (i12 & 64) == 0 ? map : null, (i12 & 128) != 0 ? true : z17, (i12 & 256) != 0 ? false : z18, (i12 & 512) != 0 ? false : z19, (i12 & 1024) == 0 ? z22 : false);
    }
}
