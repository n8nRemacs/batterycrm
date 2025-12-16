package com.avito.android.advertising.loaders.buzzoola;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.advertising.loaders.B;
import com.avito.android.advertising.loaders.C;
import com.avito.android.advertising.loaders.E;
import com.avito.android.advertising.loaders.event_service.l;
import com.avito.android.remote.model.advertising.BuzzoolaPromoType;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BuzzoolaBanner.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\b\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner;", "Landroid/os/Parcelable;", "Lcom/avito/android/advertising/b;", "BuzzoolaAVL", "BuzzoolaCredit", "BuzzoolaDirect", "BuzzoolaMediaX2", "BuzzoolaPremium", "BuzzoolaPremiumV2", "BuzzoolaVideo", "Html", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaAVL;", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaCredit;", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaDirect;", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaMediaX2;", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaPremium;", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaPremiumV2;", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaVideo;", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$Html;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BuzzoolaBanner extends Parcelable, com.avito.android.advertising.b {

    /* compiled from: BuzzoolaBanner.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaAVL;", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner;", "Lcom/avito/android/advertising/loaders/buzzoola/p;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BuzzoolaAVL implements BuzzoolaBanner, p {

        @Y61.k
        public static final Parcelable.Creator<BuzzoolaAVL> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f88196b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f88197c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaPremiumConfig f88198d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f88199e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f88200f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f88201g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final Uri f88202h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final BuzzoolaButton f88203i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final Uri f88204j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final String f88205k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaAvlType f88206l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaPixels f88207m;

        /* compiled from: BuzzoolaBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BuzzoolaAVL> {
            @Override // android.os.Parcelable.Creator
            public final BuzzoolaAVL createFromParcel(Parcel parcel) {
                return new BuzzoolaAVL(parcel.readString(), parcel.readString(), BuzzoolaPremiumConfig.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(BuzzoolaAVL.class.getClassLoader()), parcel.readInt() == 0 ? null : BuzzoolaButton.CREATOR.createFromParcel(parcel), (Uri) parcel.readParcelable(BuzzoolaAVL.class.getClassLoader()), parcel.readString(), BuzzoolaAvlType.CREATOR.createFromParcel(parcel), BuzzoolaPixels.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final BuzzoolaAVL[] newArray(int i12) {
                return new BuzzoolaAVL[i12];
            }
        }

        public BuzzoolaAVL(@Y61.l String str, @Y61.l String str2, @Y61.k BuzzoolaPremiumConfig buzzoolaPremiumConfig, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.k Uri uri, @Y61.l BuzzoolaButton buzzoolaButton, @Y61.l Uri uri2, @Y61.l String str6, @Y61.k BuzzoolaAvlType buzzoolaAvlType, @Y61.k BuzzoolaPixels buzzoolaPixels) {
            this.f88196b = str;
            this.f88197c = str2;
            this.f88198d = buzzoolaPremiumConfig;
            this.f88199e = str3;
            this.f88200f = str4;
            this.f88201g = str5;
            this.f88202h = uri;
            this.f88203i = buzzoolaButton;
            this.f88204j = uri2;
            this.f88205k = str6;
            this.f88206l = buzzoolaAvlType;
            this.f88207m = buzzoolaPixels;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner, com.avito.android.advertising.b
        @Y61.k
        public final Integer T() {
            return Integer.valueOf(this.f88198d.f88305c);
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner
        @Y61.k
        /* renamed from: V, reason: from getter */
        public final BuzzoolaPixels getF88278i() {
            return this.f88207m;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        public final String W() {
            return this.f88198d.f88308f;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner
        @Y61.l
        public final String Z4() {
            return E.a(this.f88198d.f88304b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BuzzoolaAVL)) {
                return false;
            }
            BuzzoolaAVL buzzoolaAVL = (BuzzoolaAVL) obj;
            return L.f(this.f88196b, buzzoolaAVL.f88196b) && L.f(this.f88197c, buzzoolaAVL.f88197c) && L.f(this.f88198d, buzzoolaAVL.f88198d) && L.f(this.f88199e, buzzoolaAVL.f88199e) && L.f(this.f88200f, buzzoolaAVL.f88200f) && L.f(this.f88201g, buzzoolaAVL.f88201g) && L.f(this.f88202h, buzzoolaAVL.f88202h) && L.f(this.f88203i, buzzoolaAVL.f88203i) && L.f(this.f88204j, buzzoolaAVL.f88204j) && L.f(this.f88205k, buzzoolaAVL.f88205k) && this.f88206l == buzzoolaAVL.f88206l && L.f(this.f88207m, buzzoolaAVL.f88207m);
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: g0, reason: from getter */
        public final String getF88017e() {
            return this.f88199e;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.p
        @Y61.k
        /* renamed from: getConfig, reason: from getter */
        public final BuzzoolaPremiumConfig getF88259d() {
            return this.f88198d;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: h0, reason: from getter */
        public final String getF88016d() {
            return this.f88197c;
        }

        public final int hashCode() {
            String str = this.f88196b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f88197c;
            int iHashCode2 = (this.f88198d.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f88199e;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f88200f;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f88201g;
            int iE2 = androidx.media3.exoplayer.analytics.m.e(this.f88202h, (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
            BuzzoolaButton buzzoolaButton = this.f88203i;
            int iHashCode5 = (iE2 + (buzzoolaButton == null ? 0 : buzzoolaButton.hashCode())) * 31;
            Uri uri = this.f88204j;
            int iHashCode6 = (iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
            String str6 = this.f88205k;
            return this.f88207m.hashCode() + ((this.f88206l.hashCode() + ((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31)) * 31);
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: j0, reason: from getter */
        public final String getF88015c() {
            return this.f88196b;
        }

        @Y61.k
        public final String toString() {
            return "BuzzoolaAVL(title=" + this.f88196b + ", description=" + this.f88197c + ", config=" + this.f88198d + ", legal=" + this.f88199e + ", juristicText=" + this.f88200f + ", age=" + this.f88201g + ", image=" + this.f88202h + ", button=" + this.f88203i + ", logo=" + this.f88204j + ", advertiser=" + this.f88205k + ", type=" + this.f88206l + ", pixels=" + this.f88207m + ')';
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.p
        @Y61.l
        /* renamed from: v, reason: from getter */
        public final String getF88261f() {
            return this.f88200f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f88196b);
            parcel.writeString(this.f88197c);
            this.f88198d.writeToParcel(parcel, i12);
            parcel.writeString(this.f88199e);
            parcel.writeString(this.f88200f);
            parcel.writeString(this.f88201g);
            parcel.writeParcelable(this.f88202h, i12);
            BuzzoolaButton buzzoolaButton = this.f88203i;
            if (buzzoolaButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buzzoolaButton.writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.f88204j, i12);
            parcel.writeString(this.f88205k);
            this.f88206l.writeToParcel(parcel, i12);
            this.f88207m.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: BuzzoolaBanner.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaCredit;", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BuzzoolaCredit implements BuzzoolaBanner {

        @Y61.k
        public static final Parcelable.Creator<BuzzoolaCredit> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f88208b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f88209c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Uri f88210d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f88211e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f88212f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaCreditConfig f88213g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaPixels f88214h;

        /* compiled from: BuzzoolaBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BuzzoolaCredit> {
            @Override // android.os.Parcelable.Creator
            public final BuzzoolaCredit createFromParcel(Parcel parcel) {
                return new BuzzoolaCredit(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(BuzzoolaCredit.class.getClassLoader()), parcel.readString(), parcel.readString(), BuzzoolaCreditConfig.CREATOR.createFromParcel(parcel), BuzzoolaPixels.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final BuzzoolaCredit[] newArray(int i12) {
                return new BuzzoolaCredit[i12];
            }
        }

        public BuzzoolaCredit(@Y61.k String str, @Y61.k String str2, @Y61.k Uri uri, @Y61.k String str3, @Y61.l String str4, @Y61.k BuzzoolaCreditConfig buzzoolaCreditConfig, @Y61.k BuzzoolaPixels buzzoolaPixels) {
            this.f88208b = str;
            this.f88209c = str2;
            this.f88210d = uri;
            this.f88211e = str3;
            this.f88212f = str4;
            this.f88213g = buzzoolaCreditConfig;
            this.f88214h = buzzoolaPixels;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner, com.avito.android.advertising.b
        @Y61.k
        public final Integer T() {
            return Integer.valueOf(this.f88213g.f88282c);
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner
        @Y61.k
        /* renamed from: V, reason: from getter */
        public final BuzzoolaPixels getF88278i() {
            return this.f88214h;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        public final String W() {
            return this.f88213g.f88286g;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner
        @Y61.l
        public final String Z4() {
            return E.a(this.f88213g.f88281b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BuzzoolaCredit)) {
                return false;
            }
            BuzzoolaCredit buzzoolaCredit = (BuzzoolaCredit) obj;
            return L.f(this.f88208b, buzzoolaCredit.f88208b) && L.f(this.f88209c, buzzoolaCredit.f88209c) && L.f(this.f88210d, buzzoolaCredit.f88210d) && L.f(this.f88211e, buzzoolaCredit.f88211e) && L.f(this.f88212f, buzzoolaCredit.f88212f) && L.f(this.f88213g, buzzoolaCredit.f88213g) && L.f(this.f88214h, buzzoolaCredit.f88214h);
        }

        @Override // com.avito.android.advertising.b
        @Y61.k
        /* renamed from: g0, reason: from getter */
        public final String getF88017e() {
            return this.f88211e;
        }

        @Override // com.avito.android.advertising.b
        @Y61.k
        /* renamed from: h0, reason: from getter */
        public final String getF88016d() {
            return this.f88209c;
        }

        public final int hashCode() {
            int iD2 = H.d(androidx.media3.exoplayer.analytics.m.e(this.f88210d, H.d(this.f88208b.hashCode() * 31, 31, this.f88209c), 31), 31, this.f88211e);
            String str = this.f88212f;
            return this.f88214h.hashCode() + ((this.f88213g.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        @Override // com.avito.android.advertising.b
        @Y61.k
        /* renamed from: j0, reason: from getter */
        public final String getF88015c() {
            return this.f88208b;
        }

        @Y61.k
        public final String toString() {
            return "BuzzoolaCredit(title=" + this.f88208b + ", description=" + this.f88209c + ", logo=" + this.f88210d + ", legalText=" + this.f88211e + ", juristicText=" + this.f88212f + ", config=" + this.f88213g + ", pixels=" + this.f88214h + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f88208b);
            parcel.writeString(this.f88209c);
            parcel.writeParcelable(this.f88210d, i12);
            parcel.writeString(this.f88211e);
            parcel.writeString(this.f88212f);
            this.f88213g.writeToParcel(parcel, i12);
            this.f88214h.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: BuzzoolaBanner.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaDirect;", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BuzzoolaDirect implements BuzzoolaBanner {

        @Y61.k
        public static final Parcelable.Creator<BuzzoolaDirect> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Uri f88215b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f88216c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f88217d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f88218e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f88219f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final String f88220g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaButton f88221h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final Uri f88222i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final String f88223j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final Float f88224k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public final String f88225l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaDirectConfig f88226m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaPixels f88227n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        @InterfaceC42156l
        public Integer f88228o;

        /* compiled from: BuzzoolaBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BuzzoolaDirect> {
            @Override // android.os.Parcelable.Creator
            public final BuzzoolaDirect createFromParcel(Parcel parcel) {
                return new BuzzoolaDirect((Uri) parcel.readParcelable(BuzzoolaDirect.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), BuzzoolaButton.CREATOR.createFromParcel(parcel), (Uri) parcel.readParcelable(BuzzoolaDirect.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), BuzzoolaDirectConfig.CREATOR.createFromParcel(parcel), BuzzoolaPixels.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final BuzzoolaDirect[] newArray(int i12) {
                return new BuzzoolaDirect[i12];
            }
        }

        public BuzzoolaDirect(@Y61.k Uri uri, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k String str5, @Y61.k BuzzoolaButton buzzoolaButton, @Y61.l Uri uri2, @Y61.l String str6, @Y61.l Float f12, @Y61.k String str7, @Y61.k BuzzoolaDirectConfig buzzoolaDirectConfig, @Y61.k BuzzoolaPixels buzzoolaPixels) {
            this.f88215b = uri;
            this.f88216c = str;
            this.f88217d = str2;
            this.f88218e = str3;
            this.f88219f = str4;
            this.f88220g = str5;
            this.f88221h = buzzoolaButton;
            this.f88222i = uri2;
            this.f88223j = str6;
            this.f88224k = f12;
            this.f88225l = str7;
            this.f88226m = buzzoolaDirectConfig;
            this.f88227n = buzzoolaPixels;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner, com.avito.android.advertising.b
        @Y61.k
        public final Integer T() {
            return Integer.valueOf(this.f88226m.f88289c);
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner
        @Y61.k
        /* renamed from: V, reason: from getter */
        public final BuzzoolaPixels getF88278i() {
            return this.f88227n;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        public final String W() {
            return this.f88226m.f88290d;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner
        @Y61.l
        public final String Z4() {
            return E.a(this.f88226m.f88288b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BuzzoolaDirect)) {
                return false;
            }
            BuzzoolaDirect buzzoolaDirect = (BuzzoolaDirect) obj;
            return L.f(this.f88215b, buzzoolaDirect.f88215b) && L.f(this.f88216c, buzzoolaDirect.f88216c) && L.f(this.f88217d, buzzoolaDirect.f88217d) && L.f(this.f88218e, buzzoolaDirect.f88218e) && L.f(this.f88219f, buzzoolaDirect.f88219f) && L.f(this.f88220g, buzzoolaDirect.f88220g) && L.f(this.f88221h, buzzoolaDirect.f88221h) && L.f(this.f88222i, buzzoolaDirect.f88222i) && L.f(this.f88223j, buzzoolaDirect.f88223j) && L.f(this.f88224k, buzzoolaDirect.f88224k) && L.f(this.f88225l, buzzoolaDirect.f88225l) && L.f(this.f88226m, buzzoolaDirect.f88226m) && L.f(this.f88227n, buzzoolaDirect.f88227n);
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: g0, reason: from getter */
        public final String getF88017e() {
            return this.f88219f;
        }

        @Override // com.avito.android.advertising.b
        @Y61.k
        /* renamed from: h0 */
        public final String getF88016d() {
            String str = this.f88217d;
            return str == null ? "" : str;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f88215b.hashCode() * 31, 31, this.f88216c);
            String str = this.f88217d;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f88218e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f88219f;
            int iHashCode3 = (this.f88221h.hashCode() + H.d((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f88220g)) * 31;
            Uri uri = this.f88222i;
            int iHashCode4 = (iHashCode3 + (uri == null ? 0 : uri.hashCode())) * 31;
            String str4 = this.f88223j;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Float f12 = this.f88224k;
            return this.f88227n.hashCode() + ((this.f88226m.hashCode() + H.d((iHashCode5 + (f12 != null ? f12.hashCode() : 0)) * 31, 31, this.f88225l)) * 31);
        }

        @Override // com.avito.android.advertising.b
        @Y61.k
        /* renamed from: j0, reason: from getter */
        public final String getF88015c() {
            return this.f88216c;
        }

        @Y61.k
        public final String toString() {
            return "BuzzoolaDirect(image=" + this.f88215b + ", title=" + this.f88216c + ", description=" + this.f88217d + ", age=" + this.f88218e + ", disclaimer=" + this.f88219f + ", advertiser=" + this.f88220g + ", button=" + this.f88221h + ", logo=" + this.f88222i + ", price=" + this.f88223j + ", rating=" + this.f88224k + ", juristicText=" + this.f88225l + ", config=" + this.f88226m + ", pixels=" + this.f88227n + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f88215b, i12);
            parcel.writeString(this.f88216c);
            parcel.writeString(this.f88217d);
            parcel.writeString(this.f88218e);
            parcel.writeString(this.f88219f);
            parcel.writeString(this.f88220g);
            this.f88221h.writeToParcel(parcel, i12);
            parcel.writeParcelable(this.f88222i, i12);
            parcel.writeString(this.f88223j);
            Float f12 = this.f88224k;
            if (f12 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.B(parcel, 1, f12);
            }
            parcel.writeString(this.f88225l);
            this.f88226m.writeToParcel(parcel, i12);
            this.f88227n.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: BuzzoolaBanner.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaMediaX2;", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner;", "Lcom/avito/android/advertising/loaders/buzzoola/p;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BuzzoolaMediaX2 implements BuzzoolaBanner, p {

        @Y61.k
        public static final Parcelable.Creator<BuzzoolaMediaX2> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Uri f88229b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f88230c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f88231d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f88232e;

        /* renamed from: f, reason: collision with root package name */
        public final float f88233f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f88234g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaPremiumConfig f88235h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaPixels f88236i;

        /* compiled from: BuzzoolaBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BuzzoolaMediaX2> {
            @Override // android.os.Parcelable.Creator
            public final BuzzoolaMediaX2 createFromParcel(Parcel parcel) {
                return new BuzzoolaMediaX2((Uri) parcel.readParcelable(BuzzoolaMediaX2.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readInt() != 0, BuzzoolaPremiumConfig.CREATOR.createFromParcel(parcel), BuzzoolaPixels.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final BuzzoolaMediaX2[] newArray(int i12) {
                return new BuzzoolaMediaX2[i12];
            }
        }

        public BuzzoolaMediaX2(@Y61.k Uri uri, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, float f12, boolean z12, @Y61.k BuzzoolaPremiumConfig buzzoolaPremiumConfig, @Y61.k BuzzoolaPixels buzzoolaPixels) {
            this.f88229b = uri;
            this.f88230c = str;
            this.f88231d = str2;
            this.f88232e = str3;
            this.f88233f = f12;
            this.f88234g = z12;
            this.f88235h = buzzoolaPremiumConfig;
            this.f88236i = buzzoolaPixels;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner, com.avito.android.advertising.b
        @Y61.k
        public final Integer T() {
            return Integer.valueOf(this.f88235h.f88305c);
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner
        @Y61.k
        /* renamed from: V, reason: from getter */
        public final BuzzoolaPixels getF88278i() {
            return this.f88236i;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        public final String W() {
            return this.f88235h.f88308f;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner
        @Y61.l
        public final String Z4() {
            return E.a(this.f88235h.f88304b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BuzzoolaMediaX2)) {
                return false;
            }
            BuzzoolaMediaX2 buzzoolaMediaX2 = (BuzzoolaMediaX2) obj;
            return L.f(this.f88229b, buzzoolaMediaX2.f88229b) && L.f(this.f88230c, buzzoolaMediaX2.f88230c) && L.f(this.f88231d, buzzoolaMediaX2.f88231d) && L.f(this.f88232e, buzzoolaMediaX2.f88232e) && Float.compare(this.f88233f, buzzoolaMediaX2.f88233f) == 0 && this.f88234g == buzzoolaMediaX2.f88234g && L.f(this.f88235h, buzzoolaMediaX2.f88235h) && L.f(this.f88236i, buzzoolaMediaX2.f88236i);
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: g0, reason: from getter */
        public final String getF88017e() {
            return this.f88230c;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.p
        @Y61.k
        /* renamed from: getConfig, reason: from getter */
        public final BuzzoolaPremiumConfig getF88259d() {
            return this.f88235h;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: h0 */
        public final String getF88016d() {
            return null;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f88229b.hashCode() * 31, 31, this.f88230c);
            String str = this.f88231d;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f88232e;
            return this.f88236i.hashCode() + ((this.f88235h.hashCode() + r.i(r.d(this.f88233f, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31, this.f88234g)) * 31);
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: j0 */
        public final String getF88015c() {
            return null;
        }

        @Y61.k
        public final String toString() {
            return "BuzzoolaMediaX2(image=" + this.f88229b + ", legalText=" + this.f88230c + ", juristicText=" + this.f88231d + ", advertiser=" + this.f88232e + ", ratio=" + this.f88233f + ", withParallax=" + this.f88234g + ", config=" + this.f88235h + ", pixels=" + this.f88236i + ')';
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.p
        @Y61.l
        /* renamed from: v, reason: from getter */
        public final String getF88261f() {
            return this.f88231d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f88229b, i12);
            parcel.writeString(this.f88230c);
            parcel.writeString(this.f88231d);
            parcel.writeString(this.f88232e);
            parcel.writeFloat(this.f88233f);
            parcel.writeInt(this.f88234g ? 1 : 0);
            this.f88235h.writeToParcel(parcel, i12);
            this.f88236i.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: BuzzoolaBanner.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaPremium;", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner;", "Lcom/avito/android/advertising/loaders/buzzoola/p;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BuzzoolaPremium implements BuzzoolaBanner, p {

        @Y61.k
        public static final Parcelable.Creator<BuzzoolaPremium> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f88237b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f88238c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f88239d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Uri f88240e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f88241f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaButton f88242g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final BuzzoolaLegal f88243h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f88244i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaPremiumConfig f88245j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaPixels f88246k;

        /* compiled from: BuzzoolaBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BuzzoolaPremium> {
            @Override // android.os.Parcelable.Creator
            public final BuzzoolaPremium createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BuzzoolaPremium.class, parcel, arrayList, iL2, 1);
                }
                return new BuzzoolaPremium(arrayList, parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(BuzzoolaPremium.class.getClassLoader()), parcel.readString(), BuzzoolaButton.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BuzzoolaLegal.CREATOR.createFromParcel(parcel), parcel.readString(), BuzzoolaPremiumConfig.CREATOR.createFromParcel(parcel), BuzzoolaPixels.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final BuzzoolaPremium[] newArray(int i12) {
                return new BuzzoolaPremium[i12];
            }
        }

        public BuzzoolaPremium(@Y61.k ArrayList arrayList, @Y61.k String str, @Y61.k String str2, @Y61.l Uri uri, @Y61.l String str3, @Y61.k BuzzoolaButton buzzoolaButton, @Y61.l BuzzoolaLegal buzzoolaLegal, @Y61.l String str4, @Y61.k BuzzoolaPremiumConfig buzzoolaPremiumConfig, @Y61.k BuzzoolaPixels buzzoolaPixels) {
            this.f88237b = arrayList;
            this.f88238c = str;
            this.f88239d = str2;
            this.f88240e = uri;
            this.f88241f = str3;
            this.f88242g = buzzoolaButton;
            this.f88243h = buzzoolaLegal;
            this.f88244i = str4;
            this.f88245j = buzzoolaPremiumConfig;
            this.f88246k = buzzoolaPixels;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner, com.avito.android.advertising.b
        @Y61.k
        public final Integer T() {
            return Integer.valueOf(this.f88245j.f88305c);
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner
        @Y61.k
        /* renamed from: V, reason: from getter */
        public final BuzzoolaPixels getF88278i() {
            return this.f88246k;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        public final String W() {
            return this.f88245j.f88308f;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner
        @Y61.l
        public final String Z4() {
            return E.a(this.f88245j.f88304b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BuzzoolaPremium)) {
                return false;
            }
            BuzzoolaPremium buzzoolaPremium = (BuzzoolaPremium) obj;
            return this.f88237b.equals(buzzoolaPremium.f88237b) && L.f(this.f88238c, buzzoolaPremium.f88238c) && L.f(this.f88239d, buzzoolaPremium.f88239d) && L.f(this.f88240e, buzzoolaPremium.f88240e) && L.f(this.f88241f, buzzoolaPremium.f88241f) && L.f(this.f88242g, buzzoolaPremium.f88242g) && L.f(this.f88243h, buzzoolaPremium.f88243h) && L.f(this.f88244i, buzzoolaPremium.f88244i) && L.f(this.f88245j, buzzoolaPremium.f88245j) && L.f(this.f88246k, buzzoolaPremium.f88246k);
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: g0 */
        public final String getF88017e() {
            BuzzoolaLegal buzzoolaLegal = this.f88243h;
            if (buzzoolaLegal != null) {
                return buzzoolaLegal.f88292b;
            }
            return null;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.p
        @Y61.k
        /* renamed from: getConfig, reason: from getter */
        public final BuzzoolaPremiumConfig getF88259d() {
            return this.f88245j;
        }

        @Override // com.avito.android.advertising.b
        @Y61.k
        /* renamed from: h0, reason: from getter */
        public final String getF88016d() {
            return this.f88239d;
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f88237b.hashCode() * 31, 31, this.f88238c), 31, this.f88239d);
            Uri uri = this.f88240e;
            int iHashCode = (iD2 + (uri == null ? 0 : uri.hashCode())) * 31;
            String str = this.f88241f;
            int iHashCode2 = (this.f88242g.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            BuzzoolaLegal buzzoolaLegal = this.f88243h;
            int iHashCode3 = (iHashCode2 + (buzzoolaLegal == null ? 0 : buzzoolaLegal.hashCode())) * 31;
            String str2 = this.f88244i;
            int iHashCode4 = str2 != null ? str2.hashCode() : 0;
            return this.f88246k.hashCode() + ((this.f88245j.hashCode() + ((iHashCode3 + iHashCode4) * 31)) * 31);
        }

        @Override // com.avito.android.advertising.b
        @Y61.k
        /* renamed from: j0, reason: from getter */
        public final String getF88015c() {
            return this.f88238c;
        }

        @Y61.k
        public final String toString() {
            return "BuzzoolaPremium(images=" + this.f88237b + ", title=" + this.f88238c + ", description=" + this.f88239d + ", logo=" + this.f88240e + ", age=" + this.f88241f + ", button=" + this.f88242g + ", legal=" + this.f88243h + ", juristicText=" + this.f88244i + ", config=" + this.f88245j + ", pixels=" + this.f88246k + ')';
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.p
        @Y61.l
        /* renamed from: v, reason: from getter */
        public final String getF88261f() {
            return this.f88244i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            ArrayList arrayList = this.f88237b;
            parcel.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i12);
            }
            parcel.writeString(this.f88238c);
            parcel.writeString(this.f88239d);
            parcel.writeParcelable(this.f88240e, i12);
            parcel.writeString(this.f88241f);
            this.f88242g.writeToParcel(parcel, i12);
            BuzzoolaLegal buzzoolaLegal = this.f88243h;
            if (buzzoolaLegal == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buzzoolaLegal.writeToParcel(parcel, i12);
            }
            parcel.writeString(this.f88244i);
            this.f88245j.writeToParcel(parcel, i12);
            this.f88246k.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: BuzzoolaBanner.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaPremiumV2;", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner;", "Lcom/avito/android/advertising/loaders/buzzoola/p;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BuzzoolaPremiumV2 implements BuzzoolaBanner, p {

        @Y61.k
        public static final Parcelable.Creator<BuzzoolaPremiumV2> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f88247b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaTextWithColor f88248c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaTextWithColor f88249d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Uri f88250e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f88251f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaButton f88252g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final BuzzoolaLegal f88253h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f88254i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaPremiumConfig f88255j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaPixels f88256k;

        /* compiled from: BuzzoolaBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BuzzoolaPremiumV2> {
            @Override // android.os.Parcelable.Creator
            public final BuzzoolaPremiumV2 createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BuzzoolaPremiumV2.class, parcel, arrayList, iL2, 1);
                }
                Parcelable.Creator<BuzzoolaTextWithColor> creator = BuzzoolaTextWithColor.CREATOR;
                return new BuzzoolaPremiumV2(arrayList, creator.createFromParcel(parcel), creator.createFromParcel(parcel), (Uri) parcel.readParcelable(BuzzoolaPremiumV2.class.getClassLoader()), parcel.readString(), BuzzoolaButton.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BuzzoolaLegal.CREATOR.createFromParcel(parcel), parcel.readString(), BuzzoolaPremiumConfig.CREATOR.createFromParcel(parcel), BuzzoolaPixels.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final BuzzoolaPremiumV2[] newArray(int i12) {
                return new BuzzoolaPremiumV2[i12];
            }
        }

        public BuzzoolaPremiumV2(@Y61.k ArrayList arrayList, @Y61.k BuzzoolaTextWithColor buzzoolaTextWithColor, @Y61.k BuzzoolaTextWithColor buzzoolaTextWithColor2, @Y61.l Uri uri, @Y61.l String str, @Y61.k BuzzoolaButton buzzoolaButton, @Y61.l BuzzoolaLegal buzzoolaLegal, @Y61.l String str2, @Y61.k BuzzoolaPremiumConfig buzzoolaPremiumConfig, @Y61.k BuzzoolaPixels buzzoolaPixels) {
            this.f88247b = arrayList;
            this.f88248c = buzzoolaTextWithColor;
            this.f88249d = buzzoolaTextWithColor2;
            this.f88250e = uri;
            this.f88251f = str;
            this.f88252g = buzzoolaButton;
            this.f88253h = buzzoolaLegal;
            this.f88254i = str2;
            this.f88255j = buzzoolaPremiumConfig;
            this.f88256k = buzzoolaPixels;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner, com.avito.android.advertising.b
        @Y61.k
        public final Integer T() {
            return Integer.valueOf(this.f88255j.f88305c);
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner
        @Y61.k
        /* renamed from: V, reason: from getter */
        public final BuzzoolaPixels getF88278i() {
            return this.f88256k;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        public final String W() {
            return this.f88255j.f88308f;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner
        @Y61.l
        public final String Z4() {
            return E.a(this.f88255j.f88304b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BuzzoolaPremiumV2)) {
                return false;
            }
            BuzzoolaPremiumV2 buzzoolaPremiumV2 = (BuzzoolaPremiumV2) obj;
            return this.f88247b.equals(buzzoolaPremiumV2.f88247b) && L.f(this.f88248c, buzzoolaPremiumV2.f88248c) && L.f(this.f88249d, buzzoolaPremiumV2.f88249d) && L.f(this.f88250e, buzzoolaPremiumV2.f88250e) && L.f(this.f88251f, buzzoolaPremiumV2.f88251f) && L.f(this.f88252g, buzzoolaPremiumV2.f88252g) && L.f(this.f88253h, buzzoolaPremiumV2.f88253h) && L.f(this.f88254i, buzzoolaPremiumV2.f88254i) && L.f(this.f88255j, buzzoolaPremiumV2.f88255j) && L.f(this.f88256k, buzzoolaPremiumV2.f88256k);
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: g0 */
        public final String getF88017e() {
            BuzzoolaLegal buzzoolaLegal = this.f88253h;
            if (buzzoolaLegal != null) {
                return buzzoolaLegal.f88292b;
            }
            return null;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.p
        @Y61.k
        /* renamed from: getConfig, reason: from getter */
        public final BuzzoolaPremiumConfig getF88259d() {
            return this.f88255j;
        }

        @Override // com.avito.android.advertising.b
        @Y61.k
        /* renamed from: h0 */
        public final String getF88016d() {
            return this.f88249d.f88310b;
        }

        public final int hashCode() {
            int iHashCode = (this.f88249d.hashCode() + ((this.f88248c.hashCode() + (this.f88247b.hashCode() * 31)) * 31)) * 31;
            Uri uri = this.f88250e;
            int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
            String str = this.f88251f;
            int iHashCode3 = (this.f88252g.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            BuzzoolaLegal buzzoolaLegal = this.f88253h;
            int iHashCode4 = (iHashCode3 + (buzzoolaLegal == null ? 0 : buzzoolaLegal.hashCode())) * 31;
            String str2 = this.f88254i;
            return this.f88256k.hashCode() + ((this.f88255j.hashCode() + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
        }

        @Override // com.avito.android.advertising.b
        @Y61.k
        /* renamed from: j0 */
        public final String getF88015c() {
            return this.f88248c.f88310b;
        }

        @Y61.k
        public final String toString() {
            return "BuzzoolaPremiumV2(images=" + this.f88247b + ", titleWithColor=" + this.f88248c + ", descriptionWithColor=" + this.f88249d + ", logo=" + this.f88250e + ", age=" + this.f88251f + ", button=" + this.f88252g + ", legal=" + this.f88253h + ", juristicText=" + this.f88254i + ", config=" + this.f88255j + ", pixels=" + this.f88256k + ')';
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.p
        @Y61.l
        /* renamed from: v, reason: from getter */
        public final String getF88261f() {
            return this.f88254i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            ArrayList arrayList = this.f88247b;
            parcel.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i12);
            }
            this.f88248c.writeToParcel(parcel, i12);
            this.f88249d.writeToParcel(parcel, i12);
            parcel.writeParcelable(this.f88250e, i12);
            parcel.writeString(this.f88251f);
            this.f88252g.writeToParcel(parcel, i12);
            BuzzoolaLegal buzzoolaLegal = this.f88253h;
            if (buzzoolaLegal == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buzzoolaLegal.writeToParcel(parcel, i12);
            }
            parcel.writeString(this.f88254i);
            this.f88255j.writeToParcel(parcel, i12);
            this.f88256k.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: BuzzoolaBanner.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaVideo;", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner;", "Lcom/avito/android/advertising/loaders/buzzoola/p;", "Lcom/avito/android/advertising/loaders/C;", "Lcom/avito/android/advertising/loaders/event_service/b;", "Lcom/avito/android/advertising/loaders/event_service/l;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BuzzoolaVideo implements BuzzoolaBanner, p, C, com.avito.android.advertising.loaders.event_service.b, com.avito.android.advertising.loaders.event_service.l {

        @Y61.k
        public static final Parcelable.Creator<BuzzoolaVideo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f88257b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f88258c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaPremiumConfig f88259d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f88260e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f88261f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f88262g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final Uri f88263h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final Uri f88264i;

        /* renamed from: j, reason: collision with root package name */
        public final float f88265j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final String f88266k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final Uri f88267l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final String f88268m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaPixels f88269n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ l.a.C2612a f88270o;

        /* compiled from: BuzzoolaBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BuzzoolaVideo> {
            @Override // android.os.Parcelable.Creator
            public final BuzzoolaVideo createFromParcel(Parcel parcel) {
                return new BuzzoolaVideo(parcel.readString(), parcel.readString(), BuzzoolaPremiumConfig.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(BuzzoolaVideo.class.getClassLoader()), (Uri) parcel.readParcelable(BuzzoolaVideo.class.getClassLoader()), parcel.readFloat(), parcel.readString(), (Uri) parcel.readParcelable(BuzzoolaVideo.class.getClassLoader()), parcel.readString(), BuzzoolaPixels.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final BuzzoolaVideo[] newArray(int i12) {
                return new BuzzoolaVideo[i12];
            }
        }

        public BuzzoolaVideo(@Y61.l String str, @Y61.l String str2, @Y61.k BuzzoolaPremiumConfig buzzoolaPremiumConfig, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Uri uri, @Y61.k Uri uri2, float f12, @Y61.l String str6, @Y61.l Uri uri3, @Y61.l String str7, @Y61.k BuzzoolaPixels buzzoolaPixels) {
            this.f88257b = str;
            this.f88258c = str2;
            this.f88259d = buzzoolaPremiumConfig;
            this.f88260e = str3;
            this.f88261f = str4;
            this.f88262g = str5;
            this.f88263h = uri;
            this.f88264i = uri2;
            this.f88265j = f12;
            this.f88266k = str6;
            this.f88267l = uri3;
            this.f88268m = str7;
            this.f88269n = buzzoolaPixels;
            com.avito.android.advertising.loaders.event_service.l.f88370M1.getClass();
            this.f88270o = l.a.f88372b;
        }

        @Override // com.avito.android.advertising.loaders.C
        @Y61.l
        public final String A() {
            return this.f88259d.f88308f;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        @Y61.l
        public final List<String> B() {
            return this.f88270o.f88373b;
        }

        @Override // com.avito.android.advertising.loaders.C
        @Y61.k
        /* renamed from: C */
        public final String getF88014b() {
            return this.f88259d.f88304b;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        @Y61.l
        public final List<String> E() {
            return this.f88270o.f88379h;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        /* renamed from: H */
        public final boolean getF87999p() {
            return this.f88270o.f88382k;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        public final void I() {
            this.f88270o.f88376e = true;
        }

        @Override // com.avito.android.advertising.loaders.C
        @Y61.l
        /* renamed from: J, reason: from getter */
        public final String getF88268m() {
            return this.f88268m;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        @Y61.l
        public final List<String> K() {
            return this.f88269n.f88297d;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        public final void L() {
            this.f88269n.f88302i = true;
        }

        @Override // com.avito.android.advertising.loaders.C
        /* renamed from: M, reason: from getter */
        public final float getF88022j() {
            return this.f88265j;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner, com.avito.android.advertising.b
        @Y61.k
        public final Integer T() {
            return Integer.valueOf(this.f88259d.f88305c);
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner
        @Y61.k
        /* renamed from: V, reason: from getter */
        public final BuzzoolaPixels getF88278i() {
            return this.f88269n;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        public final String W() {
            return this.f88259d.f88308f;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner
        @Y61.l
        public final String Z4() {
            return E.a(this.f88259d.f88304b);
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        @Y61.k
        /* renamed from: c */
        public final String getF87989f() {
            return "buzzoola";
        }

        @Override // com.avito.android.advertising.loaders.C
        @Y61.l
        /* renamed from: d, reason: from getter */
        public final String getF88019g() {
            return this.f88262g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BuzzoolaVideo)) {
                return false;
            }
            BuzzoolaVideo buzzoolaVideo = (BuzzoolaVideo) obj;
            return L.f(this.f88257b, buzzoolaVideo.f88257b) && L.f(this.f88258c, buzzoolaVideo.f88258c) && L.f(this.f88259d, buzzoolaVideo.f88259d) && L.f(this.f88260e, buzzoolaVideo.f88260e) && L.f(this.f88261f, buzzoolaVideo.f88261f) && L.f(this.f88262g, buzzoolaVideo.f88262g) && L.f(this.f88263h, buzzoolaVideo.f88263h) && L.f(this.f88264i, buzzoolaVideo.f88264i) && Float.compare(this.f88265j, buzzoolaVideo.f88265j) == 0 && L.f(this.f88266k, buzzoolaVideo.f88266k) && L.f(this.f88267l, buzzoolaVideo.f88267l) && L.f(this.f88268m, buzzoolaVideo.f88268m) && L.f(this.f88269n, buzzoolaVideo.f88269n);
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        public final void f() {
            this.f88270o.f88380i = true;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: g0, reason: from getter */
        public final String getF88017e() {
            return this.f88260e;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.p
        @Y61.k
        /* renamed from: getConfig, reason: from getter */
        public final BuzzoolaPremiumConfig getF88259d() {
            return this.f88259d;
        }

        @Override // com.avito.android.advertising.loaders.C
        @Y61.l
        /* renamed from: getLogo, reason: from getter */
        public final Uri getF88024l() {
            return this.f88267l;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: h0, reason: from getter */
        public final String getF88016d() {
            return this.f88258c;
        }

        public final int hashCode() {
            String str = this.f88257b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f88258c;
            int iHashCode2 = (this.f88259d.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f88260e;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f88261f;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f88262g;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Uri uri = this.f88263h;
            int iD2 = r.d(this.f88265j, androidx.media3.exoplayer.analytics.m.e(this.f88264i, (iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31, 31), 31);
            String str6 = this.f88266k;
            int iHashCode6 = (iD2 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Uri uri2 = this.f88267l;
            int iHashCode7 = (iHashCode6 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
            String str7 = this.f88268m;
            return this.f88269n.hashCode() + ((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31);
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        /* renamed from: i */
        public final boolean getF87993j() {
            return this.f88270o.f88376e;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        public final void j() {
            this.f88270o.f88374c = true;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: j0, reason: from getter */
        public final String getF88015c() {
            return this.f88257b;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        @Y61.l
        public final List<String> l() {
            return this.f88270o.f88381j;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        /* renamed from: l0 */
        public final boolean getF87988e() {
            return this.f88269n.f88302i;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        /* renamed from: m */
        public final boolean getF87995l() {
            return this.f88270o.f88378g;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        public final void n() {
            this.f88270o.f88378g = true;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        @Y61.l
        public final List<String> n0() {
            return this.f88270o.f88377f;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        /* renamed from: o */
        public final boolean getF87997n() {
            return this.f88270o.f88380i;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        public final void p() {
            this.f88270o.f88382k = true;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        /* renamed from: q */
        public final boolean getF87991h() {
            return this.f88270o.f88374c;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        @Y61.l
        public final List<String> s() {
            return this.f88270o.f88375d;
        }

        @Y61.k
        public final String toString() {
            return "BuzzoolaVideo(adTitle=" + this.f88257b + ", adBody=" + this.f88258c + ", config=" + this.f88259d + ", adLegal=" + this.f88260e + ", juristicText=" + this.f88261f + ", age=" + this.f88262g + ", videoPreview=" + this.f88263h + ", video=" + this.f88264i + ", videoRatio=" + this.f88265j + ", buttonText=" + this.f88266k + ", logo=" + this.f88267l + ", advertiser=" + this.f88268m + ", pixels=" + this.f88269n + ')';
        }

        @Override // com.avito.android.advertising.loaders.C
        @Y61.k
        /* renamed from: u, reason: from getter */
        public final Uri getF88021i() {
            return this.f88264i;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.p
        @Y61.l
        /* renamed from: v, reason: from getter */
        public final String getF88261f() {
            return this.f88261f;
        }

        @Override // com.avito.android.advertising.loaders.C
        @Y61.l
        /* renamed from: w, reason: from getter */
        public final String getF88023k() {
            return this.f88266k;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f88257b);
            parcel.writeString(this.f88258c);
            this.f88259d.writeToParcel(parcel, i12);
            parcel.writeString(this.f88260e);
            parcel.writeString(this.f88261f);
            parcel.writeString(this.f88262g);
            parcel.writeParcelable(this.f88263h, i12);
            parcel.writeParcelable(this.f88264i, i12);
            parcel.writeFloat(this.f88265j);
            parcel.writeString(this.f88266k);
            parcel.writeParcelable(this.f88267l, i12);
            parcel.writeString(this.f88268m);
            this.f88269n.writeToParcel(parcel, i12);
        }

        @Override // com.avito.android.advertising.loaders.C
        public final boolean x() {
            return this.f88259d.f88309g == BuzzoolaPromoType.INTERNAL;
        }

        @Override // com.avito.android.advertising.loaders.C
        @Y61.k
        /* renamed from: y */
        public final Float getF88025m() {
            return Float.valueOf(1.5f);
        }

        @Override // com.avito.android.advertising.loaders.C
        @Y61.l
        /* renamed from: z, reason: from getter */
        public final Uri getF88020h() {
            return this.f88263h;
        }
    }

    /* compiled from: BuzzoolaBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Override // com.avito.android.advertising.b
    @Y61.k
    Integer T();

    @Y61.k
    /* renamed from: V */
    BuzzoolaPixels getF88278i();

    @Y61.l
    String Z4();

    /* compiled from: BuzzoolaBanner.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$Html;", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner;", "Lcom/avito/android/advertising/loaders/B;", "Lcom/avito/android/advertising/loaders/event_service/b;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Html implements BuzzoolaBanner, B, com.avito.android.advertising.loaders.event_service.b {

        @Y61.k
        public static final Parcelable.Creator<Html> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f88271b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Integer f88272c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Integer f88273d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Float f88274e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f88275f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f88276g;

        /* renamed from: h, reason: collision with root package name */
        public final int f88277h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final BuzzoolaPixels f88278i;

        /* compiled from: BuzzoolaBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Html> {
            @Override // android.os.Parcelable.Creator
            public final Html createFromParcel(Parcel parcel) {
                return new Html(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), BuzzoolaPixels.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Html[] newArray(int i12) {
                return new Html[i12];
            }
        }

        public Html(@Y61.k String str, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Float f12, boolean z12, boolean z13, int i12, @Y61.k BuzzoolaPixels buzzoolaPixels) {
            this.f88271b = str;
            this.f88272c = num;
            this.f88273d = num2;
            this.f88274e = f12;
            this.f88275f = z12;
            this.f88276g = z13;
            this.f88277h = i12;
            this.f88278i = buzzoolaPixels;
        }

        @Override // com.avito.android.advertising.loaders.B
        public final void G() {
            this.f88276g = true;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        @Y61.l
        public final List<String> K() {
            return this.f88278i.f88297d;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        public final void L() {
            this.f88278i.f88302i = true;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner, com.avito.android.advertising.b
        @Y61.k
        public final Integer T() {
            return Integer.valueOf(this.f88277h);
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner
        @Y61.k
        /* renamed from: V, reason: from getter */
        public final BuzzoolaPixels getF88278i() {
            return this.f88278i;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        public final String W() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner
        @Y61.l
        public final String Z4() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        @Y61.k
        /* renamed from: c */
        public final String getF87989f() {
            return this.f88278i.f88298e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.advertising.loaders.B
        @Y61.k
        /* renamed from: e, reason: from getter */
        public final String getF87970b() {
            return this.f88271b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Html)) {
                return false;
            }
            Html html = (Html) obj;
            return L.f(this.f88271b, html.f88271b) && L.f(this.f88272c, html.f88272c) && L.f(this.f88273d, html.f88273d) && L.f(this.f88274e, html.f88274e) && this.f88275f == html.f88275f && this.f88276g == html.f88276g && this.f88277h == html.f88277h && L.f(this.f88278i, html.f88278i);
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: g0 */
        public final String getF88017e() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.B
        @Y61.l
        /* renamed from: getHeight, reason: from getter */
        public final Integer getF88273d() {
            return this.f88273d;
        }

        @Override // com.avito.android.advertising.loaders.B
        @Y61.l
        /* renamed from: getWidth, reason: from getter */
        public final Integer getF88272c() {
            return this.f88272c;
        }

        @Override // com.avito.android.advertising.loaders.B
        /* renamed from: h, reason: from getter */
        public final boolean getF87972d() {
            return this.f88275f;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: h0 */
        public final String getF88016d() {
            return null;
        }

        public final int hashCode() {
            int iHashCode = this.f88271b.hashCode() * 31;
            Integer num = this.f88272c;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f88273d;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Float f12 = this.f88274e;
            return this.f88278i.hashCode() + r.e(this.f88277h, r.i(r.i((iHashCode3 + (f12 != null ? f12.hashCode() : 0)) * 31, 31, this.f88275f), 31, this.f88276g), 31);
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: j0 */
        public final String getF88015c() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.B
        /* renamed from: k, reason: from getter */
        public final boolean getF87973e() {
            return this.f88276g;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        /* renamed from: l0 */
        public final boolean getF87988e() {
            return this.f88278i.f88302i;
        }

        @Override // com.avito.android.advertising.loaders.B
        @Y61.l
        /* renamed from: r, reason: from getter */
        public final Float getF87971c() {
            return this.f88274e;
        }

        @Override // com.avito.android.advertising.loaders.B
        public final void t() {
            this.f88275f = true;
        }

        @Y61.k
        public final String toString() {
            return "Html(html=" + this.f88271b + ", width=" + this.f88272c + ", height=" + this.f88273d + ", ratio=" + this.f88274e + ", gotError=" + this.f88275f + ", wasRendered=" + this.f88276g + ", creativeId=" + this.f88277h + ", pixels=" + this.f88278i + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f88271b);
            Integer num = this.f88272c;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Integer num2 = this.f88273d;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
            Float f12 = this.f88274e;
            if (f12 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.B(parcel, 1, f12);
            }
            parcel.writeInt(this.f88275f ? 1 : 0);
            parcel.writeInt(this.f88276g ? 1 : 0);
            parcel.writeInt(this.f88277h);
            this.f88278i.writeToParcel(parcel, i12);
        }

        public /* synthetic */ Html(String str, Integer num, Integer num2, Float f12, boolean z12, boolean z13, int i12, BuzzoolaPixels buzzoolaPixels, int i13, C42822w c42822w) {
            this(str, num, num2, f12, (i13 & 16) != 0 ? false : z12, (i13 & 32) != 0 ? false : z13, i12, buzzoolaPixels);
        }
    }
}
