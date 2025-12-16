package com.avito.android.esia_webview;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: EsiaWebViewDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/esia_webview/EsiaWebViewDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_gig_esia-webview_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class EsiaWebViewDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<EsiaWebViewDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f148169b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f148170c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f148171d;

    /* compiled from: EsiaWebViewDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EsiaWebViewDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final EsiaWebViewDeeplink createFromParcel(Parcel parcel) {
            return new EsiaWebViewDeeplink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EsiaWebViewDeeplink[] newArray(int i12) {
            return new EsiaWebViewDeeplink[i12];
        }
    }

    public EsiaWebViewDeeplink(@k String str, @l String str2, @l String str3) {
        this.f148169b = str;
        this.f148170c = str2;
        this.f148171d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f148169b);
        parcel.writeString(this.f148170c);
        parcel.writeString(this.f148171d);
    }
}
