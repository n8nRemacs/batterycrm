package com.avito.android.iac_dialer_models.abstract_module;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacItemInfo.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacItemInfo;", "Landroid/os/Parcelable;", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacItemInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<IacItemInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f166858b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f166859c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f166860d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f166861e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Image f166862f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f166863g;

    /* compiled from: IacItemInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacItemInfo> {
        @Override // android.os.Parcelable.Creator
        public final IacItemInfo createFromParcel(Parcel parcel) {
            return new IacItemInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(IacItemInfo.class.getClassLoader()), (DeepLink) parcel.readParcelable(IacItemInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final IacItemInfo[] newArray(int i12) {
            return new IacItemInfo[i12];
        }
    }

    public IacItemInfo(@k String str, @l String str2, @l String str3, @l String str4, @l Image image, @l DeepLink deepLink) {
        this.f166858b = str;
        this.f166859c = str2;
        this.f166860d = str3;
        this.f166861e = str4;
        this.f166862f = image;
        this.f166863g = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacItemInfo)) {
            return false;
        }
        IacItemInfo iacItemInfo = (IacItemInfo) obj;
        return L.f(this.f166858b, iacItemInfo.f166858b) && L.f(this.f166859c, iacItemInfo.f166859c) && L.f(this.f166860d, iacItemInfo.f166860d) && L.f(this.f166861e, iacItemInfo.f166861e) && L.f(this.f166862f, iacItemInfo.f166862f) && L.f(this.f166863g, iacItemInfo.f166863g);
    }

    public final int hashCode() {
        int iHashCode = this.f166858b.hashCode() * 31;
        String str = this.f166859c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f166860d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f166861e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Image image = this.f166862f;
        int iHashCode5 = (iHashCode4 + (image == null ? 0 : image.hashCode())) * 31;
        DeepLink deepLink = this.f166863g;
        return iHashCode5 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacItemInfo(itemId=");
        sb2.append(this.f166858b);
        sb2.append(", displayName=");
        String str = this.f166860d;
        sb2.append(str != null ? new IacPiiString(str) : null);
        sb2.append(", price=");
        String str2 = this.f166861e;
        sb2.append(str2 != null ? new IacPiiString(str2) : null);
        sb2.append(", itemOwnerUserId=");
        sb2.append(this.f166859c);
        sb2.append(", image=");
        Image image = this.f166862f;
        sb2.append(image != null ? new IacPiiImage(image) : null);
        sb2.append(", itemLink=");
        DeepLink deepLink = this.f166863g;
        sb2.append(deepLink != null ? new IacPiiDeepLink(deepLink) : null);
        sb2.append(')');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f166858b);
        parcel.writeString(this.f166859c);
        parcel.writeString(this.f166860d);
        parcel.writeString(this.f166861e);
        parcel.writeParcelable(this.f166862f, i12);
        parcel.writeParcelable(this.f166863g, i12);
    }

    public /* synthetic */ IacItemInfo(String str, String str2, String str3, String str4, Image image, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, image, (i12 & 32) != 0 ? null : deepLink);
    }
}
