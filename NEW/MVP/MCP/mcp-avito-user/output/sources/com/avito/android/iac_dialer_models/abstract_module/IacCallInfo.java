package com.avito.android.iac_dialer_models.abstract_module;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacCallInfo.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacCallInfo;", "Landroid/os/Parcelable;", "a", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacCallInfo implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f166832b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final IacPeerInfo f166833c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final IacItemInfo f166834d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f166835e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f166836f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f166837g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final IacCallDirection f166838h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final DeepLink f166839i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final DeepLink f166840j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final IacSupportData f166841k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final IacCanCallData f166842l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f166843m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f166844n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f166831o = new a(null);

    @k
    public static final Parcelable.Creator<IacCallInfo> CREATOR = new b();

    /* compiled from: IacCallInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacCallInfo$a;", "", "<init>", "()V", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacCallInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<IacCallInfo> {
        @Override // android.os.Parcelable.Creator
        public final IacCallInfo createFromParcel(Parcel parcel) {
            return new IacCallInfo(parcel.readString(), IacPeerInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : IacItemInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, IacCallDirection.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(IacCallInfo.class.getClassLoader()), (DeepLink) parcel.readParcelable(IacCallInfo.class.getClassLoader()), parcel.readInt() == 0 ? null : IacSupportData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? IacCanCallData.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IacCallInfo[] newArray(int i12) {
            return new IacCallInfo[i12];
        }
    }

    public IacCallInfo(@k String str, @k IacPeerInfo iacPeerInfo, @l IacItemInfo iacItemInfo, @k String str2, @k String str3, boolean z12, @k IacCallDirection iacCallDirection, @l DeepLink deepLink, @l DeepLink deepLink2, @l IacSupportData iacSupportData, @l IacCanCallData iacCanCallData, @l String str4, @l String str5) {
        this.f166832b = str;
        this.f166833c = iacPeerInfo;
        this.f166834d = iacItemInfo;
        this.f166835e = str2;
        this.f166836f = str3;
        this.f166837g = z12;
        this.f166838h = iacCallDirection;
        this.f166839i = deepLink;
        this.f166840j = deepLink2;
        this.f166841k = iacSupportData;
        this.f166842l = iacCanCallData;
        this.f166843m = str4;
        this.f166844n = str5;
    }

    public static IacCallInfo a(IacCallInfo iacCallInfo, String str, boolean z12, DeepLink deepLink, IacSupportData iacSupportData, IacCanCallData iacCanCallData, int i12) {
        String str2 = (i12 & 1) != 0 ? iacCallInfo.f166832b : str;
        IacPeerInfo iacPeerInfo = iacCallInfo.f166833c;
        IacItemInfo iacItemInfo = (i12 & 4) != 0 ? iacCallInfo.f166834d : null;
        String str3 = iacCallInfo.f166835e;
        String str4 = (i12 & 16) != 0 ? iacCallInfo.f166836f : "messenger_chat_menu";
        boolean z13 = (i12 & 32) != 0 ? iacCallInfo.f166837g : z12;
        IacCallDirection iacCallDirection = iacCallInfo.f166838h;
        DeepLink deepLink2 = (i12 & 128) != 0 ? iacCallInfo.f166839i : deepLink;
        DeepLink deepLink3 = iacCallInfo.f166840j;
        IacSupportData iacSupportData2 = (i12 & 512) != 0 ? iacCallInfo.f166841k : iacSupportData;
        IacCanCallData iacCanCallData2 = (i12 & 1024) != 0 ? iacCallInfo.f166842l : iacCanCallData;
        String str5 = iacCallInfo.f166843m;
        String str6 = iacCallInfo.f166844n;
        iacCallInfo.getClass();
        return new IacCallInfo(str2, iacPeerInfo, iacItemInfo, str3, str4, z13, iacCallDirection, deepLink2, deepLink3, iacSupportData2, iacCanCallData2, str5, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacCallInfo)) {
            return false;
        }
        IacCallInfo iacCallInfo = (IacCallInfo) obj;
        return L.f(this.f166832b, iacCallInfo.f166832b) && L.f(this.f166833c, iacCallInfo.f166833c) && L.f(this.f166834d, iacCallInfo.f166834d) && L.f(this.f166835e, iacCallInfo.f166835e) && L.f(this.f166836f, iacCallInfo.f166836f) && this.f166837g == iacCallInfo.f166837g && this.f166838h == iacCallInfo.f166838h && L.f(this.f166839i, iacCallInfo.f166839i) && L.f(this.f166840j, iacCallInfo.f166840j) && L.f(this.f166841k, iacCallInfo.f166841k) && L.f(this.f166842l, iacCallInfo.f166842l) && L.f(this.f166843m, iacCallInfo.f166843m) && L.f(this.f166844n, iacCallInfo.f166844n);
    }

    public final int hashCode() {
        int iHashCode = (this.f166833c.hashCode() + (this.f166832b.hashCode() * 31)) * 31;
        IacItemInfo iacItemInfo = this.f166834d;
        int iHashCode2 = (this.f166838h.hashCode() + r.i(H.d(H.d((iHashCode + (iacItemInfo == null ? 0 : iacItemInfo.hashCode())) * 31, 31, this.f166835e), 31, this.f166836f), 31, this.f166837g)) * 31;
        DeepLink deepLink = this.f166839i;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.f166840j;
        int iHashCode4 = (iHashCode3 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        IacSupportData iacSupportData = this.f166841k;
        int iHashCode5 = (iHashCode4 + (iacSupportData == null ? 0 : iacSupportData.hashCode())) * 31;
        IacCanCallData iacCanCallData = this.f166842l;
        int iHashCode6 = (iHashCode5 + (iacCanCallData == null ? 0 : iacCanCallData.hashCode())) * 31;
        String str = this.f166843m;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f166844n;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacCallInfo(");
        sb2.append("callId=" + this.f166832b + ", ");
        sb2.append("peer=" + this.f166833c + ", ");
        sb2.append("item=" + this.f166834d + ", ");
        sb2.append("localUserId=" + this.f166835e + ", ");
        sb2.append("scenario=" + this.f166836f + ", ");
        sb2.append("isVideo=" + this.f166837g + ", ");
        sb2.append("direction=" + this.f166838h + ", ");
        StringBuilder sb3 = new StringBuilder("gsmCallLink=");
        DeepLink deepLink = this.f166839i;
        sb3.append(deepLink != null ? new IacPiiDeepLink(deepLink) : null);
        sb3.append(", ");
        sb2.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder("messengerLink=");
        DeepLink deepLink2 = this.f166840j;
        sb4.append(deepLink2 != null ? new IacPiiDeepLink(deepLink2) : null);
        sb4.append(", ");
        sb2.append(sb4.toString());
        sb2.append("supportData=" + this.f166841k + ", ");
        sb2.append("canCallData=" + this.f166842l + ", ");
        sb2.append("searchContext=" + this.f166843m + ", ");
        sb2.append("callOptionsType=" + this.f166844n + ')');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f166832b);
        this.f166833c.writeToParcel(parcel, i12);
        IacItemInfo iacItemInfo = this.f166834d;
        if (iacItemInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iacItemInfo.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f166835e);
        parcel.writeString(this.f166836f);
        parcel.writeInt(this.f166837g ? 1 : 0);
        parcel.writeString(this.f166838h.name());
        parcel.writeParcelable(this.f166839i, i12);
        parcel.writeParcelable(this.f166840j, i12);
        IacSupportData iacSupportData = this.f166841k;
        if (iacSupportData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iacSupportData.writeToParcel(parcel, i12);
        }
        IacCanCallData iacCanCallData = this.f166842l;
        if (iacCanCallData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iacCanCallData.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f166843m);
        parcel.writeString(this.f166844n);
    }
}
