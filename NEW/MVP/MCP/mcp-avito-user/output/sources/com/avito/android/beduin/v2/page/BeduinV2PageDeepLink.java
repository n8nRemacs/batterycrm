package com.avito.android.beduin.v2.page;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: BeduinV2PageDeepLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/v2/page/BeduinV2PageDeepLink;", "Lcom/avito/android/beduin/v2/page/BeduinV2DeepLink;", "_design-modules_beduin-v2-page_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final /* data */ class BeduinV2PageDeepLink extends BeduinV2DeepLink {

    @Y61.k
    public static final Parcelable.Creator<BeduinV2PageDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f104782b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f104783c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f104784d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f104785e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f104786f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f104787g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f104788h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f104789i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f104790j;

    /* compiled from: BeduinV2PageDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinV2PageDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final BeduinV2PageDeepLink createFromParcel(Parcel parcel) {
            return new BeduinV2PageDeepLink(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinV2PageDeepLink[] newArray(int i12) {
            return new BeduinV2PageDeepLink[i12];
        }
    }

    public /* synthetic */ BeduinV2PageDeepLink(String str, String str2, boolean z12, boolean z13, boolean z14, String str3, String str4, String str5, boolean z15, int i12, C42822w c42822w) {
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
        if (!(obj instanceof BeduinV2PageDeepLink)) {
            return false;
        }
        BeduinV2PageDeepLink beduinV2PageDeepLink = (BeduinV2PageDeepLink) obj;
        return L.f(this.f104782b, beduinV2PageDeepLink.f104782b) && L.f(this.f104783c, beduinV2PageDeepLink.f104783c) && this.f104784d == beduinV2PageDeepLink.f104784d && this.f104785e == beduinV2PageDeepLink.f104785e && this.f104786f == beduinV2PageDeepLink.f104786f && L.f(this.f104787g, beduinV2PageDeepLink.f104787g) && L.f(this.f104788h, beduinV2PageDeepLink.f104788h) && L.f(this.f104789i, beduinV2PageDeepLink.f104789i) && this.f104790j == beduinV2PageDeepLink.f104790j;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(H.d(this.f104782b.hashCode() * 31, 31, this.f104783c), 31, this.f104784d), 31, this.f104785e), 31, this.f104786f);
        String str = this.f104787g;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f104788h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f104789i;
        return Boolean.hashCode(this.f104790j) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinV2PageDeepLink(pagePath=");
        sb2.append(this.f104782b);
        sb2.append(", screenName=");
        sb2.append(this.f104783c);
        sb2.append(", scrollOnKeyboardShown=");
        sb2.append(this.f104784d);
        sb2.append(", ignoreSafeArea=");
        sb2.append(this.f104785e);
        sb2.append(", showsBottomBar=");
        sb2.append(this.f104786f);
        sb2.append(", theme=");
        sb2.append(this.f104787g);
        sb2.append(", scenarioParentId=");
        sb2.append(this.f104788h);
        sb2.append(", scenarioId=");
        sb2.append(this.f104789i);
        sb2.append(", enableComposeRenderer=");
        return androidx.appcompat.app.r.x(sb2, this.f104790j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f104782b);
        parcel.writeString(this.f104783c);
        parcel.writeInt(this.f104784d ? 1 : 0);
        parcel.writeInt(this.f104785e ? 1 : 0);
        parcel.writeInt(this.f104786f ? 1 : 0);
        parcel.writeString(this.f104787g);
        parcel.writeString(this.f104788h);
        parcel.writeString(this.f104789i);
        parcel.writeInt(this.f104790j ? 1 : 0);
    }

    public BeduinV2PageDeepLink(@Y61.k String str, @Y61.k String str2, boolean z12, boolean z13, boolean z14, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, boolean z15) {
        super(null);
        this.f104782b = str;
        this.f104783c = str2;
        this.f104784d = z12;
        this.f104785e = z13;
        this.f104786f = z14;
        this.f104787g = str3;
        this.f104788h = str4;
        this.f104789i = str5;
        this.f104790j = z15;
    }
}
