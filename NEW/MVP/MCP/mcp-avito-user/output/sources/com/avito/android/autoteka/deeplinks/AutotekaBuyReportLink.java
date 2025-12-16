package com.avito.android.autoteka.deeplinks;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.K;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: AutotekaBuyReportLink.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/AutotekaBuyReportLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "Lcom/avito/android/deep_linking/links/K;", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final class AutotekaBuyReportLink extends PublicDeeplink implements K {

    @k
    public static final Parcelable.Creator<AutotekaBuyReportLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f96212b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f96213c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f96214d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f96215e;

    /* compiled from: AutotekaBuyReportLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutotekaBuyReportLink> {
        @Override // android.os.Parcelable.Creator
        public final AutotekaBuyReportLink createFromParcel(Parcel parcel) {
            return new AutotekaBuyReportLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AutotekaBuyReportLink[] newArray(int i12) {
            return new AutotekaBuyReportLink[i12];
        }
    }

    public /* synthetic */ AutotekaBuyReportLink(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? "teaser" : str2, (i12 & 4) != 0 ? "avito_android" : str3, (i12 & 8) != 0 ? "referral" : str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f96212b);
        parcel.writeString(this.f96213c);
        parcel.writeString(this.f96214d);
        parcel.writeString(this.f96215e);
    }

    public AutotekaBuyReportLink(@k String str, @l String str2, @l String str3, @l String str4) {
        this.f96212b = str;
        this.f96213c = str2;
        this.f96214d = str3;
        this.f96215e = str4;
    }
}
