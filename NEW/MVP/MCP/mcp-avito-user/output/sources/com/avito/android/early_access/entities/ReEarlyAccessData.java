package com.avito.android.early_access.entities;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReEarlyAccessData.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/early_access/entities/ReEarlyAccessData;", "Landroid/os/Parcelable;", "BannerData", "FakedoorInfo", "Legal", "Link", "LinkedText", "Package", "PackagesInfo", "Parameter", "PopupType", "Price", "_avito_early-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReEarlyAccessData implements Parcelable {

    @k
    public static final Parcelable.Creator<ReEarlyAccessData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f145322b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Long f145323c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f145324d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<Price> f145325e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Legal f145326f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<Link> f145327g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Link f145328h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f145329i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f145330j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final PopupType f145331k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final BannerData f145332l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final List<Parameter> f145333m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final PackagesInfo f145334n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final FakedoorInfo f145335o;

    /* compiled from: ReEarlyAccessData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/entities/ReEarlyAccessData$BannerData;", "Landroid/os/Parcelable;", "_avito_early-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BannerData implements Parcelable {

        @k
        public static final Parcelable.Creator<BannerData> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f145336b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Image f145337c;

        /* compiled from: ReEarlyAccessData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BannerData> {
            @Override // android.os.Parcelable.Creator
            public final BannerData createFromParcel(Parcel parcel) {
                return new BannerData(parcel.readString(), (Image) parcel.readParcelable(BannerData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final BannerData[] newArray(int i12) {
                return new BannerData[i12];
            }
        }

        public BannerData(@k String str, @k Image image) {
            this.f145336b = str;
            this.f145337c = image;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BannerData)) {
                return false;
            }
            BannerData bannerData = (BannerData) obj;
            return L.f(this.f145336b, bannerData.f145336b) && L.f(this.f145337c, bannerData.f145337c);
        }

        public final int hashCode() {
            return this.f145337c.hashCode() + (this.f145336b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BannerData(text=");
            sb2.append(this.f145336b);
            sb2.append(", icon=");
            return c.o(sb2, this.f145337c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f145336b);
            parcel.writeParcelable(this.f145337c, i12);
        }
    }

    /* compiled from: ReEarlyAccessData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/entities/ReEarlyAccessData$FakedoorInfo;", "Landroid/os/Parcelable;", "_avito_early-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FakedoorInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<FakedoorInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f145338b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f145339c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final UniversalImage f145340d;

        /* compiled from: ReEarlyAccessData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FakedoorInfo> {
            @Override // android.os.Parcelable.Creator
            public final FakedoorInfo createFromParcel(Parcel parcel) {
                return new FakedoorInfo(parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(FakedoorInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final FakedoorInfo[] newArray(int i12) {
                return new FakedoorInfo[i12];
            }
        }

        public FakedoorInfo(@k String str, @k String str2, @k UniversalImage universalImage) {
            this.f145338b = str;
            this.f145339c = str2;
            this.f145340d = universalImage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FakedoorInfo)) {
                return false;
            }
            FakedoorInfo fakedoorInfo = (FakedoorInfo) obj;
            return L.f(this.f145338b, fakedoorInfo.f145338b) && L.f(this.f145339c, fakedoorInfo.f145339c) && L.f(this.f145340d, fakedoorInfo.f145340d);
        }

        public final int hashCode() {
            return this.f145340d.hashCode() + H.d(this.f145338b.hashCode() * 31, 31, this.f145339c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FakedoorInfo(title=");
            sb2.append(this.f145338b);
            sb2.append(", description=");
            sb2.append(this.f145339c);
            sb2.append(", image=");
            return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f145340d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f145338b);
            parcel.writeString(this.f145339c);
            parcel.writeParcelable(this.f145340d, i12);
        }
    }

    /* compiled from: ReEarlyAccessData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/entities/ReEarlyAccessData$Legal;", "Landroid/os/Parcelable;", "_avito_early-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Legal implements Parcelable {

        @k
        public static final Parcelable.Creator<Legal> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LinkedText f145341b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final LinkedText f145342c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final LinkedText f145343d;

        /* compiled from: ReEarlyAccessData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Legal> {
            @Override // android.os.Parcelable.Creator
            public final Legal createFromParcel(Parcel parcel) {
                Parcelable.Creator<LinkedText> creator = LinkedText.CREATOR;
                return new Legal(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Legal[] newArray(int i12) {
                return new Legal[i12];
            }
        }

        public Legal(@k LinkedText linkedText, @k LinkedText linkedText2, @l LinkedText linkedText3) {
            this.f145341b = linkedText;
            this.f145342c = linkedText2;
            this.f145343d = linkedText3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Legal)) {
                return false;
            }
            Legal legal = (Legal) obj;
            return L.f(this.f145341b, legal.f145341b) && L.f(this.f145342c, legal.f145342c) && L.f(this.f145343d, legal.f145343d);
        }

        public final int hashCode() {
            int iHashCode = (this.f145342c.hashCode() + (this.f145341b.hashCode() * 31)) * 31;
            LinkedText linkedText = this.f145343d;
            return iHashCode + (linkedText == null ? 0 : linkedText.hashCode());
        }

        @k
        public final String toString() {
            return "Legal(offer=" + this.f145341b + ", terms=" + this.f145342c + ", aboutService=" + this.f145343d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f145341b.writeToParcel(parcel, i12);
            this.f145342c.writeToParcel(parcel, i12);
            LinkedText linkedText = this.f145343d;
            if (linkedText == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                linkedText.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: ReEarlyAccessData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/entities/ReEarlyAccessData$Link;", "Landroid/os/Parcelable;", "_avito_early-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Link implements Parcelable {

        @k
        public static final Parcelable.Creator<Link> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f145344b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f145345c;

        /* compiled from: ReEarlyAccessData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Link> {
            @Override // android.os.Parcelable.Creator
            public final Link createFromParcel(Parcel parcel) {
                return new Link(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Link[] newArray(int i12) {
                return new Link[i12];
            }
        }

        public Link(@k String str, @l String str2) {
            this.f145344b = str;
            this.f145345c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Link)) {
                return false;
            }
            Link link = (Link) obj;
            return L.f(this.f145344b, link.f145344b) && L.f(this.f145345c, link.f145345c);
        }

        public final int hashCode() {
            int iHashCode = this.f145344b.hashCode() * 31;
            String str = this.f145345c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Link(title=");
            sb2.append(this.f145344b);
            sb2.append(", uri=");
            return C22026a.c(sb2, this.f145345c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f145344b);
            parcel.writeString(this.f145345c);
        }
    }

    /* compiled from: ReEarlyAccessData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/entities/ReEarlyAccessData$LinkedText;", "Landroid/os/Parcelable;", "_avito_early-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LinkedText implements Parcelable {

        @k
        public static final Parcelable.Creator<LinkedText> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f145346b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Link f145347c;

        /* compiled from: ReEarlyAccessData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LinkedText> {
            @Override // android.os.Parcelable.Creator
            public final LinkedText createFromParcel(Parcel parcel) {
                return new LinkedText(parcel.readString(), Link.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final LinkedText[] newArray(int i12) {
                return new LinkedText[i12];
            }
        }

        public LinkedText(@k String str, @k Link link) {
            this.f145346b = str;
            this.f145347c = link;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkedText)) {
                return false;
            }
            LinkedText linkedText = (LinkedText) obj;
            return L.f(this.f145346b, linkedText.f145346b) && L.f(this.f145347c, linkedText.f145347c);
        }

        public final int hashCode() {
            return this.f145347c.hashCode() + (this.f145346b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "LinkedText(text=" + this.f145346b + ", link=" + this.f145347c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f145346b);
            this.f145347c.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: ReEarlyAccessData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/early_access/entities/ReEarlyAccessData$Package;", "Landroid/os/Parcelable;", "AnalyticsData", "_avito_early-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Package implements Parcelable {

        @k
        public static final Parcelable.Creator<Package> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f145348b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f145349c;

        /* renamed from: d, reason: collision with root package name */
        public final int f145350d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f145351e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f145352f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f145353g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final String f145354h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final String f145355i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final String f145356j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final AnalyticsData f145357k;

        /* compiled from: ReEarlyAccessData.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/entities/ReEarlyAccessData$Package$AnalyticsData;", "Landroid/os/Parcelable;", "_avito_early-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AnalyticsData implements Parcelable {

            @k
            public static final Parcelable.Creator<AnalyticsData> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f145358b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f145359c;

            /* compiled from: ReEarlyAccessData.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<AnalyticsData> {
                @Override // android.os.Parcelable.Creator
                public final AnalyticsData createFromParcel(Parcel parcel) {
                    return new AnalyticsData(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final AnalyticsData[] newArray(int i12) {
                    return new AnalyticsData[i12];
                }
            }

            public AnalyticsData(@l String str, @l String str2) {
                this.f145358b = str;
                this.f145359c = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnalyticsData)) {
                    return false;
                }
                AnalyticsData analyticsData = (AnalyticsData) obj;
                return L.f(this.f145358b, analyticsData.f145358b) && L.f(this.f145359c, analyticsData.f145359c);
            }

            public final int hashCode() {
                String str = this.f145358b;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f145359c;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AnalyticsData(eventOnSelect=");
                sb2.append(this.f145358b);
                sb2.append(", eventOnPurchase=");
                return C22026a.c(sb2, this.f145359c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f145358b);
                parcel.writeString(this.f145359c);
            }
        }

        /* compiled from: ReEarlyAccessData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Package> {
            @Override // android.os.Parcelable.Creator
            public final Package createFromParcel(Parcel parcel) {
                return new Package(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AnalyticsData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Package[] newArray(int i12) {
                return new Package[i12];
            }
        }

        public Package(@k String str, @k String str2, int i12, @l String str3, @l String str4, @l String str5, @k String str6, @l String str7, @l String str8, @l AnalyticsData analyticsData) {
            this.f145348b = str;
            this.f145349c = str2;
            this.f145350d = i12;
            this.f145351e = str3;
            this.f145352f = str4;
            this.f145353g = str5;
            this.f145354h = str6;
            this.f145355i = str7;
            this.f145356j = str8;
            this.f145357k = analyticsData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Package)) {
                return false;
            }
            Package r52 = (Package) obj;
            return L.f(this.f145348b, r52.f145348b) && L.f(this.f145349c, r52.f145349c) && this.f145350d == r52.f145350d && L.f(this.f145351e, r52.f145351e) && L.f(this.f145352f, r52.f145352f) && L.f(this.f145353g, r52.f145353g) && L.f(this.f145354h, r52.f145354h) && L.f(this.f145355i, r52.f145355i) && L.f(this.f145356j, r52.f145356j) && L.f(this.f145357k, r52.f145357k);
        }

        public final int hashCode() {
            int iE2 = r.e(this.f145350d, H.d(this.f145348b.hashCode() * 31, 31, this.f145349c), 31);
            String str = this.f145351e;
            int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f145352f;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f145353g;
            int iD2 = H.d((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f145354h);
            String str4 = this.f145355i;
            int iHashCode3 = (iD2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f145356j;
            int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
            AnalyticsData analyticsData = this.f145357k;
            return iHashCode4 + (analyticsData != null ? analyticsData.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Package(title=" + this.f145348b + ", price=" + this.f145349c + ", contactsCount=" + this.f145350d + ", pricePerContact=" + this.f145351e + ", oldPrice=" + this.f145352f + ", discountAmount=" + this.f145353g + ", id=" + this.f145354h + ", description=" + this.f145355i + ", buttonLabel=" + this.f145356j + ", analyticsData=" + this.f145357k + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f145348b);
            parcel.writeString(this.f145349c);
            parcel.writeInt(this.f145350d);
            parcel.writeString(this.f145351e);
            parcel.writeString(this.f145352f);
            parcel.writeString(this.f145353g);
            parcel.writeString(this.f145354h);
            parcel.writeString(this.f145355i);
            parcel.writeString(this.f145356j);
            AnalyticsData analyticsData = this.f145357k;
            if (analyticsData == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                analyticsData.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: ReEarlyAccessData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/entities/ReEarlyAccessData$Parameter;", "Landroid/os/Parcelable;", "_avito_early-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Parameter implements Parcelable {

        @k
        public static final Parcelable.Creator<Parameter> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f145370b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f145371c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f145372d;

        /* compiled from: ReEarlyAccessData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Parameter> {
            @Override // android.os.Parcelable.Creator
            public final Parameter createFromParcel(Parcel parcel) {
                return new Parameter(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Parameter[] newArray(int i12) {
                return new Parameter[i12];
            }
        }

        public Parameter(@k String str, @k String str2, @l String str3) {
            this.f145370b = str;
            this.f145371c = str2;
            this.f145372d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Parameter)) {
                return false;
            }
            Parameter parameter = (Parameter) obj;
            return L.f(this.f145370b, parameter.f145370b) && L.f(this.f145371c, parameter.f145371c) && L.f(this.f145372d, parameter.f145372d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f145370b.hashCode() * 31, 31, this.f145371c);
            String str = this.f145372d;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Parameter(text=");
            sb2.append(this.f145370b);
            sb2.append(", icon=");
            sb2.append(this.f145371c);
            sb2.append(", description=");
            return C22026a.c(sb2, this.f145372d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f145370b);
            parcel.writeString(this.f145371c);
            parcel.writeString(this.f145372d);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReEarlyAccessData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/entities/ReEarlyAccessData$PopupType;", "", "_avito_early-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PopupType {

        /* renamed from: c, reason: collision with root package name */
        public static final PopupType f145373c;

        /* renamed from: d, reason: collision with root package name */
        public static final PopupType f145374d;

        /* renamed from: e, reason: collision with root package name */
        public static final PopupType f145375e;

        /* renamed from: f, reason: collision with root package name */
        public static final PopupType f145376f;

        /* renamed from: g, reason: collision with root package name */
        public static final PopupType f145377g;

        /* renamed from: h, reason: collision with root package name */
        public static final PopupType f145378h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ PopupType[] f145379i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f145380j;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f145381b;

        static {
            PopupType popupType = new PopupType("POPUP_PURCHASE", 0, "popup_purchase");
            f145373c = popupType;
            PopupType popupType2 = new PopupType("POPUP_PURCHASE_NEW", 1, "popup_purchase_new");
            f145374d = popupType2;
            PopupType popupType3 = new PopupType("POPUP_PURCHASE_PACKAGES_SHORT", 2, "popup_purchase_packages_short");
            f145375e = popupType3;
            PopupType popupType4 = new PopupType("POPUP_PURCHASE_PACKAGES_LONG", 3, "popup_purchase_packages_long");
            f145376f = popupType4;
            PopupType popupType5 = new PopupType("POPUP_EA_BUNDLES", 4, "ea_bundles");
            f145377g = popupType5;
            PopupType popupType6 = new PopupType("POPUP_SECRET_ITEMS", 5, "secret_items");
            f145378h = popupType6;
            PopupType[] popupTypeArr = {popupType, popupType2, popupType3, popupType4, popupType5, popupType6};
            f145379i = popupTypeArr;
            f145380j = kotlin.enums.c.a(popupTypeArr);
        }

        public PopupType(String str, int i12, String str2) {
            this.f145381b = str2;
        }

        public static PopupType valueOf(String str) {
            return (PopupType) Enum.valueOf(PopupType.class, str);
        }

        public static PopupType[] values() {
            return (PopupType[]) f145379i.clone();
        }
    }

    /* compiled from: ReEarlyAccessData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/entities/ReEarlyAccessData$Price;", "Landroid/os/Parcelable;", "_avito_early-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Price implements Parcelable {

        @k
        public static final Parcelable.Creator<Price> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f145382b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f145383c;

        /* compiled from: ReEarlyAccessData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Price> {
            @Override // android.os.Parcelable.Creator
            public final Price createFromParcel(Parcel parcel) {
                return new Price(parcel.readLong(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Price[] newArray(int i12) {
                return new Price[i12];
            }
        }

        public Price(long j12, @k String str) {
            this.f145382b = j12;
            this.f145383c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Price)) {
                return false;
            }
            Price price = (Price) obj;
            return this.f145382b == price.f145382b && L.f(this.f145383c, price.f145383c);
        }

        public final int hashCode() {
            return this.f145383c.hashCode() + (Long.hashCode(this.f145382b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Price(amount=");
            sb2.append(this.f145382b);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f145383c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f145382b);
            parcel.writeString(this.f145383c);
        }
    }

    /* compiled from: ReEarlyAccessData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReEarlyAccessData> {
        @Override // android.os.Parcelable.Creator
        public final ReEarlyAccessData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i12);
            int iC2 = 0;
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList3.add(parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel));
            }
            Legal legalCreateFromParcel = parcel.readInt() == 0 ? null : Legal.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iC3 = 0;
                while (iC3 != i14) {
                    iC3 = com.avito.android.actions_sheet.a.c(Link.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            Link linkCreateFromParcel = parcel.readInt() == 0 ? null : Link.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            PopupType popupTypeValueOf = parcel.readInt() == 0 ? null : PopupType.valueOf(parcel.readString());
            BannerData bannerDataCreateFromParcel = parcel.readInt() == 0 ? null : BannerData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                while (iC2 != i15) {
                    iC2 = com.avito.android.actions_sheet.a.c(Parameter.CREATOR, parcel, arrayList2, iC2, 1);
                    i15 = i15;
                }
            }
            return new ReEarlyAccessData(string, lValueOf, string2, arrayList3, legalCreateFromParcel, arrayList, linkCreateFromParcel, string3, string4, popupTypeValueOf, bannerDataCreateFromParcel, arrayList2, parcel.readInt() == 0 ? null : PackagesInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FakedoorInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ReEarlyAccessData[] newArray(int i12) {
            return new ReEarlyAccessData[i12];
        }
    }

    public ReEarlyAccessData(@k String str, @l Long l12, @l String str2, @k List<Price> list, @l Legal legal, @l List<Link> list2, @l Link link, @l String str3, @l String str4, @l PopupType popupType, @l BannerData bannerData, @l List<Parameter> list3, @l PackagesInfo packagesInfo, @l FakedoorInfo fakedoorInfo) {
        this.f145322b = str;
        this.f145323c = l12;
        this.f145324d = str2;
        this.f145325e = list;
        this.f145326f = legal;
        this.f145327g = list2;
        this.f145328h = link;
        this.f145329i = str3;
        this.f145330j = str4;
        this.f145331k = popupType;
        this.f145332l = bannerData;
        this.f145333m = list3;
        this.f145334n = packagesInfo;
        this.f145335o = fakedoorInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReEarlyAccessData)) {
            return false;
        }
        ReEarlyAccessData reEarlyAccessData = (ReEarlyAccessData) obj;
        return L.f(this.f145322b, reEarlyAccessData.f145322b) && L.f(this.f145323c, reEarlyAccessData.f145323c) && L.f(this.f145324d, reEarlyAccessData.f145324d) && L.f(this.f145325e, reEarlyAccessData.f145325e) && L.f(this.f145326f, reEarlyAccessData.f145326f) && L.f(this.f145327g, reEarlyAccessData.f145327g) && L.f(this.f145328h, reEarlyAccessData.f145328h) && L.f(this.f145329i, reEarlyAccessData.f145329i) && L.f(this.f145330j, reEarlyAccessData.f145330j) && this.f145331k == reEarlyAccessData.f145331k && L.f(this.f145332l, reEarlyAccessData.f145332l) && L.f(this.f145333m, reEarlyAccessData.f145333m) && L.f(this.f145334n, reEarlyAccessData.f145334n) && L.f(this.f145335o, reEarlyAccessData.f145335o);
    }

    public final int hashCode() {
        int iHashCode = this.f145322b.hashCode() * 31;
        Long l12 = this.f145323c;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.f145324d;
        int iE2 = H.e((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f145325e);
        Legal legal = this.f145326f;
        int iHashCode3 = (iE2 + (legal == null ? 0 : legal.hashCode())) * 31;
        List<Link> list = this.f145327g;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Link link = this.f145328h;
        int iHashCode5 = (iHashCode4 + (link == null ? 0 : link.hashCode())) * 31;
        String str2 = this.f145329i;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f145330j;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PopupType popupType = this.f145331k;
        int iHashCode8 = (iHashCode7 + (popupType == null ? 0 : popupType.hashCode())) * 31;
        BannerData bannerData = this.f145332l;
        int iHashCode9 = (iHashCode8 + (bannerData == null ? 0 : bannerData.hashCode())) * 31;
        List<Parameter> list2 = this.f145333m;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        PackagesInfo packagesInfo = this.f145334n;
        int iHashCode11 = (iHashCode10 + (packagesInfo == null ? 0 : packagesInfo.hashCode())) * 31;
        FakedoorInfo fakedoorInfo = this.f145335o;
        return iHashCode11 + (fakedoorInfo != null ? fakedoorInfo.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ReEarlyAccessData(itemId=" + this.f145322b + ", orderId=" + this.f145323c + ", title=" + this.f145324d + ", prices=" + this.f145325e + ", legal=" + this.f145326f + ", legalV2=" + this.f145327g + ", action=" + this.f145328h + ", countdown=" + this.f145329i + ", description=" + this.f145330j + ", popupType=" + this.f145331k + ", banner=" + this.f145332l + ", parameters=" + this.f145333m + ", packagesInfo=" + this.f145334n + ", fakedoorInfo=" + this.f145335o + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f145322b);
        Long l12 = this.f145323c;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.f145324d);
        Iterator itJ = C0.j(this.f145325e, parcel);
        while (itJ.hasNext()) {
            Price price = (Price) itJ.next();
            if (price == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                price.writeToParcel(parcel, i12);
            }
        }
        Legal legal = this.f145326f;
        if (legal == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            legal.writeToParcel(parcel, i12);
        }
        List<Link> list = this.f145327g;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Link) itA.next()).writeToParcel(parcel, i12);
            }
        }
        Link link = this.f145328h;
        if (link == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            link.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f145329i);
        parcel.writeString(this.f145330j);
        PopupType popupType = this.f145331k;
        if (popupType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(popupType.name());
        }
        BannerData bannerData = this.f145332l;
        if (bannerData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bannerData.writeToParcel(parcel, i12);
        }
        List<Parameter> list2 = this.f145333m;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((Parameter) itA2.next()).writeToParcel(parcel, i12);
            }
        }
        PackagesInfo packagesInfo = this.f145334n;
        if (packagesInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            packagesInfo.writeToParcel(parcel, i12);
        }
        FakedoorInfo fakedoorInfo = this.f145335o;
        if (fakedoorInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fakedoorInfo.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: ReEarlyAccessData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/entities/ReEarlyAccessData$PackagesInfo;", "Landroid/os/Parcelable;", "_avito_early-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PackagesInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<PackagesInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Package> f145360b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f145361c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f145362d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f145363e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f145364f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final List<Parameter> f145365g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f145366h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Package f145367i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final List<Link> f145368j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final String f145369k;

        /* compiled from: ReEarlyAccessData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PackagesInfo> {
            @Override // android.os.Parcelable.Creator
            public final PackagesInfo createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iC2 = 0;
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(Package.CREATOR, parcel, arrayList3, iC3, 1);
                }
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i13 = parcel.readInt();
                    arrayList = new ArrayList(i13);
                    int iC4 = 0;
                    while (iC4 != i13) {
                        iC4 = com.avito.android.actions_sheet.a.c(Parameter.CREATOR, parcel, arrayList, iC4, 1);
                    }
                }
                String string5 = parcel.readString();
                Package packageCreateFromParcel = parcel.readInt() == 0 ? null : Package.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i14 = parcel.readInt();
                    arrayList2 = new ArrayList(i14);
                    while (iC2 != i14) {
                        iC2 = com.avito.android.actions_sheet.a.c(Link.CREATOR, parcel, arrayList2, iC2, 1);
                    }
                }
                return new PackagesInfo(arrayList3, string, string2, string3, string4, arrayList, string5, packageCreateFromParcel, arrayList2, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PackagesInfo[] newArray(int i12) {
                return new PackagesInfo[i12];
            }
        }

        public PackagesInfo(@k List<Package> list, @k String str, @l String str2, @l String str3, @l String str4, @l List<Parameter> list2, @l String str5, @l Package r82, @l List<Link> list3, @l String str6) {
            this.f145360b = list;
            this.f145361c = str;
            this.f145362d = str2;
            this.f145363e = str3;
            this.f145364f = str4;
            this.f145365g = list2;
            this.f145366h = str5;
            this.f145367i = r82;
            this.f145368j = list3;
            this.f145369k = str6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PackagesInfo)) {
                return false;
            }
            PackagesInfo packagesInfo = (PackagesInfo) obj;
            return L.f(this.f145360b, packagesInfo.f145360b) && L.f(this.f145361c, packagesInfo.f145361c) && L.f(this.f145362d, packagesInfo.f145362d) && L.f(this.f145363e, packagesInfo.f145363e) && L.f(this.f145364f, packagesInfo.f145364f) && L.f(this.f145365g, packagesInfo.f145365g) && L.f(this.f145366h, packagesInfo.f145366h) && L.f(this.f145367i, packagesInfo.f145367i) && L.f(this.f145368j, packagesInfo.f145368j) && L.f(this.f145369k, packagesInfo.f145369k);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f145360b.hashCode() * 31, 31, this.f145361c);
            String str = this.f145362d;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f145363e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f145364f;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<Parameter> list = this.f145365g;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            String str4 = this.f145366h;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Package r32 = this.f145367i;
            int iHashCode6 = (iHashCode5 + (r32 == null ? 0 : r32.hashCode())) * 31;
            List<Link> list2 = this.f145368j;
            int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str5 = this.f145369k;
            return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PackagesInfo(packages=");
            sb2.append(this.f145360b);
            sb2.append(", packagesExplanation=");
            sb2.append(this.f145361c);
            sb2.append(", packagesTitle=");
            sb2.append(this.f145362d);
            sb2.append(", packagesDescription=");
            sb2.append(this.f145363e);
            sb2.append(", packagesAction=");
            sb2.append(this.f145364f);
            sb2.append(", parameters=");
            sb2.append(this.f145365g);
            sb2.append(", defaultBundleId=");
            sb2.append(this.f145366h);
            sb2.append(", singleContact=");
            sb2.append(this.f145367i);
            sb2.append(", legalV2=");
            sb2.append(this.f145368j);
            sb2.append(", singleContactTitle=");
            return C22026a.c(sb2, this.f145369k, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Iterator itJ = C0.j(this.f145360b, parcel);
            while (itJ.hasNext()) {
                ((Package) itJ.next()).writeToParcel(parcel, i12);
            }
            parcel.writeString(this.f145361c);
            parcel.writeString(this.f145362d);
            parcel.writeString(this.f145363e);
            parcel.writeString(this.f145364f);
            List<Parameter> list = this.f145365g;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((Parameter) itA.next()).writeToParcel(parcel, i12);
                }
            }
            parcel.writeString(this.f145366h);
            Package r22 = this.f145367i;
            if (r22 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                r22.writeToParcel(parcel, i12);
            }
            List<Link> list2 = this.f145368j;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
                while (itA2.hasNext()) {
                    ((Link) itA2.next()).writeToParcel(parcel, i12);
                }
            }
            parcel.writeString(this.f145369k);
        }

        public /* synthetic */ PackagesInfo(List list, String str, String str2, String str3, String str4, List list2, String str5, Package r202, List list3, String str6, int i12, C42822w c42822w) {
            this(list, str, str2, str3, str4, list2, str5, r202, list3, (i12 & 512) != 0 ? null : str6);
        }
    }

    public /* synthetic */ ReEarlyAccessData(String str, Long l12, String str2, List list, Legal legal, List list2, Link link, String str3, String str4, PopupType popupType, BannerData bannerData, List list3, PackagesInfo packagesInfo, FakedoorInfo fakedoorInfo, int i12, C42822w c42822w) {
        this(str, l12, str2, list, legal, list2, link, (i12 & 128) != 0 ? null : str3, (i12 & 256) != 0 ? null : str4, (i12 & 512) != 0 ? null : popupType, (i12 & 1024) != 0 ? null : bannerData, (i12 & 2048) != 0 ? null : list3, (i12 & 4096) != 0 ? null : packagesInfo, (i12 & 8192) != 0 ? null : fakedoorInfo);
    }
}
