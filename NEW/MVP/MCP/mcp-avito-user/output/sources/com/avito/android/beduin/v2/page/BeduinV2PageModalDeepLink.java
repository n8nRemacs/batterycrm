package com.avito.android.beduin.v2.page;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: BeduinV2PageModalDeepLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/v2/page/BeduinV2PageModalDeepLink;", "Lcom/avito/android/beduin/v2/page/BeduinV2DeepLink;", "_design-modules_beduin-v2-page_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final /* data */ class BeduinV2PageModalDeepLink extends BeduinV2DeepLink {

    @Y61.k
    public static final Parcelable.Creator<BeduinV2PageModalDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f104791b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f104792c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f104793d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f104794e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f104795f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f104796g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f104797h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f104798i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f104799j;

    /* compiled from: BeduinV2PageModalDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinV2PageModalDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final BeduinV2PageModalDeepLink createFromParcel(Parcel parcel) {
            return new BeduinV2PageModalDeepLink(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinV2PageModalDeepLink[] newArray(int i12) {
            return new BeduinV2PageModalDeepLink[i12];
        }
    }

    public /* synthetic */ BeduinV2PageModalDeepLink(String str, String str2, boolean z12, boolean z13, boolean z14, String str3, String str4, String str5, boolean z15, int i12, C42822w c42822w) {
        this(str, str2, z12, z13, z14, (i12 & 32) != 0 ? null : str3, (i12 & 64) != 0 ? null : str4, (i12 & 128) != 0 ? null : str5, (i12 & 256) != 0 ? false : z15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinV2PageModalDeepLink)) {
            return false;
        }
        BeduinV2PageModalDeepLink beduinV2PageModalDeepLink = (BeduinV2PageModalDeepLink) obj;
        return L.f(this.f104791b, beduinV2PageModalDeepLink.f104791b) && L.f(this.f104792c, beduinV2PageModalDeepLink.f104792c) && this.f104793d == beduinV2PageModalDeepLink.f104793d && this.f104794e == beduinV2PageModalDeepLink.f104794e && this.f104795f == beduinV2PageModalDeepLink.f104795f && L.f(this.f104796g, beduinV2PageModalDeepLink.f104796g) && L.f(this.f104797h, beduinV2PageModalDeepLink.f104797h) && L.f(this.f104798i, beduinV2PageModalDeepLink.f104798i) && this.f104799j == beduinV2PageModalDeepLink.f104799j;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(H.d(this.f104791b.hashCode() * 31, 31, this.f104792c), 31, this.f104793d), 31, this.f104794e), 31, this.f104795f);
        String str = this.f104796g;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f104797h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f104798i;
        return Boolean.hashCode(this.f104799j) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinV2PageModalDeepLink(pagePath=");
        sb2.append(this.f104791b);
        sb2.append(", screenName=");
        sb2.append(this.f104792c);
        sb2.append(", scrollOnKeyboardShown=");
        sb2.append(this.f104793d);
        sb2.append(", ignoreSafeArea=");
        sb2.append(this.f104794e);
        sb2.append(", showsBottomBar=");
        sb2.append(this.f104795f);
        sb2.append(", theme=");
        sb2.append(this.f104796g);
        sb2.append(", scenarioParentId=");
        sb2.append(this.f104797h);
        sb2.append(", scenarioId=");
        sb2.append(this.f104798i);
        sb2.append(", enableComposeRenderer=");
        return androidx.appcompat.app.r.x(sb2, this.f104799j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f104791b);
        parcel.writeString(this.f104792c);
        parcel.writeInt(this.f104793d ? 1 : 0);
        parcel.writeInt(this.f104794e ? 1 : 0);
        parcel.writeInt(this.f104795f ? 1 : 0);
        parcel.writeString(this.f104796g);
        parcel.writeString(this.f104797h);
        parcel.writeString(this.f104798i);
        parcel.writeInt(this.f104799j ? 1 : 0);
    }

    public BeduinV2PageModalDeepLink(@Y61.k String str, @Y61.k String str2, boolean z12, boolean z13, boolean z14, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, boolean z15) {
        super(null);
        this.f104791b = str;
        this.f104792c = str2;
        this.f104793d = z12;
        this.f104794e = z13;
        this.f104795f = z14;
        this.f104796g = str3;
        this.f104797h = str4;
        this.f104798i = str5;
        this.f104799j = z15;
    }
}
