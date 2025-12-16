package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.AnalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: ConsultationStartLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ConsultationStartLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class ConsultationStartLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ConsultationStartLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f133115b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133116c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133117d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f133118e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f133119f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final AnalyticsData f133120g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f133121h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f133122i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f133123j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f133124k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f133125l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f133126m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final String f133127n;

    /* compiled from: ConsultationStartLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConsultationStartLink> {
        @Override // android.os.Parcelable.Creator
        public final ConsultationStartLink createFromParcel(Parcel parcel) {
            return new ConsultationStartLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AnalyticsData.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ConsultationStartLink[] newArray(int i12) {
            return new ConsultationStartLink[i12];
        }
    }

    public ConsultationStartLink() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133115b);
        parcel.writeString(this.f133116c);
        parcel.writeString(this.f133117d);
        parcel.writeString(this.f133118e);
        parcel.writeString(this.f133119f);
        AnalyticsData analyticsData = this.f133120g;
        if (analyticsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analyticsData.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f133121h);
        parcel.writeString(this.f133122i);
        parcel.writeString(this.f133123j);
        parcel.writeString(this.f133124k);
        parcel.writeString(this.f133125l);
        parcel.writeString(this.f133126m);
        parcel.writeString(this.f133127n);
    }

    public /* synthetic */ ConsultationStartLink(String str, String str2, String str3, String str4, String str5, AnalyticsData analyticsData, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : analyticsData, (i12 & 64) != 0 ? null : str6, (i12 & 128) != 0 ? null : str7, (i12 & 256) != 0 ? null : str8, (i12 & 512) != 0 ? null : str9, (i12 & 1024) != 0 ? null : str10, (i12 & 2048) != 0 ? null : str11, (i12 & 4096) == 0 ? str12 : null);
    }

    public ConsultationStartLink(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l AnalyticsData analyticsData, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9, @Y61.l String str10, @Y61.l String str11, @Y61.l String str12) {
        this.f133115b = str;
        this.f133116c = str2;
        this.f133117d = str3;
        this.f133118e = str4;
        this.f133119f = str5;
        this.f133120g = analyticsData;
        this.f133121h = str6;
        this.f133122i = str7;
        this.f133123j = str8;
        this.f133124k = str9;
        this.f133125l = str10;
        this.f133126m = str11;
        this.f133127n = str12;
    }
}
