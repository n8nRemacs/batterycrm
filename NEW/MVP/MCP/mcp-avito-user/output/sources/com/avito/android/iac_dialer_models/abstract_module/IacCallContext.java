package com.avito.android.iac_dialer_models.abstract_module;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacCallContext.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacCallContext;", "Landroid/os/Parcelable;", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacCallContext implements Parcelable {

    @k
    public static final Parcelable.Creator<IacCallContext> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f166824b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final IacPeerInfo f166825c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final IacItemInfo f166826d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f166827e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f166828f;

    /* compiled from: IacCallContext.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacCallContext> {
        @Override // android.os.Parcelable.Creator
        public final IacCallContext createFromParcel(Parcel parcel) {
            return new IacCallContext(parcel.readString(), IacPeerInfo.CREATOR.createFromParcel(parcel), IacItemInfo.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(IacCallContext.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IacCallContext[] newArray(int i12) {
            return new IacCallContext[i12];
        }
    }

    public IacCallContext(@k String str, @k IacPeerInfo iacPeerInfo, @k IacItemInfo iacItemInfo, @l DeepLink deepLink, @l String str2) {
        this.f166824b = str;
        this.f166825c = iacPeerInfo;
        this.f166826d = iacItemInfo;
        this.f166827e = deepLink;
        this.f166828f = str2;
    }

    public static IacCallContext a(IacCallContext iacCallContext, String str, IacPeerInfo iacPeerInfo, int i12) {
        if ((i12 & 1) != 0) {
            str = iacCallContext.f166824b;
        }
        String str2 = str;
        if ((i12 & 2) != 0) {
            iacPeerInfo = iacCallContext.f166825c;
        }
        return new IacCallContext(str2, iacPeerInfo, iacCallContext.f166826d, iacCallContext.f166827e, iacCallContext.f166828f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacCallContext)) {
            return false;
        }
        IacCallContext iacCallContext = (IacCallContext) obj;
        return L.f(this.f166824b, iacCallContext.f166824b) && L.f(this.f166825c, iacCallContext.f166825c) && L.f(this.f166826d, iacCallContext.f166826d) && L.f(this.f166827e, iacCallContext.f166827e) && L.f(this.f166828f, iacCallContext.f166828f);
    }

    public final int hashCode() {
        int iHashCode = (this.f166826d.hashCode() + ((this.f166825c.hashCode() + (this.f166824b.hashCode() * 31)) * 31)) * 31;
        DeepLink deepLink = this.f166827e;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str = this.f166828f;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacCallContext");
        sb2.append("scenario=" + this.f166824b + ", ");
        sb2.append("peer=" + this.f166825c + ", ");
        sb2.append("item=" + this.f166826d + ", ");
        StringBuilder sb3 = new StringBuilder("messengerLink=");
        DeepLink deepLink = this.f166827e;
        sb3.append(deepLink != null ? new IacPiiDeepLink(deepLink) : null);
        sb3.append(", ");
        sb2.append(sb3.toString());
        sb2.append("searchContext=" + this.f166828f + ')');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f166824b);
        this.f166825c.writeToParcel(parcel, i12);
        this.f166826d.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f166827e, i12);
        parcel.writeString(this.f166828f);
    }
}
