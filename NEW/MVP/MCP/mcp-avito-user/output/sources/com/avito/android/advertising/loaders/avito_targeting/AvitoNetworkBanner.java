package com.avito.android.advertising.loaders.avito_targeting;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advertising.loaders.B;
import com.avito.android.advertising.loaders.C;
import com.avito.android.advertising.loaders.D;
import com.avito.android.util.C35800g5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import okhttp3.internal.http2.Http2;

/* compiled from: AvitoBanner.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner;", "Landroid/os/Parcelable;", "Lcom/avito/android/advertising/b;", "AnalyticsParams", "BDUI", "HideReason", "Html", "Image", "MarkInfo", "Pixels", "ProfilePromo", "ProfilePromoGallery", "Video", "Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$BDUI;", "Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$Html;", "Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$Image;", "Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$ProfilePromo;", "Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$ProfilePromoGallery;", "Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$Video;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AvitoNetworkBanner extends Parcelable, com.avito.android.advertising.b {

    /* compiled from: AvitoBanner.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$BDUI;", "Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner;", "Lcom/avito/android/advertising/loaders/event_service/b;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BDUI implements AvitoNetworkBanner, com.avito.android.advertising.loaders.event_service.b {

        @Y61.k
        public static final Parcelable.Creator<BDUI> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Map<String, Object> f87962b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f87963c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f87964d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f87965e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final AnalyticsParams f87966f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final Pixels f87967g;

        /* compiled from: AvitoBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BDUI> {
            @Override // android.os.Parcelable.Creator
            public final BDUI createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = org.webrtc.h.c(BDUI.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new BDUI(linkedHashMap, parcel.readString(), parcel.readString(), parcel.readString(), AnalyticsParams.CREATOR.createFromParcel(parcel), Pixels.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final BDUI[] newArray(int i12) {
                return new BDUI[i12];
            }
        }

        public BDUI(@Y61.l Map<String, ? extends Object> map, @Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.k AnalyticsParams analyticsParams, @Y61.k Pixels pixels) {
            this.f87962b = map;
            this.f87963c = str;
            this.f87964d = str2;
            this.f87965e = str3;
            this.f87966f = analyticsParams;
            this.f87967g = pixels;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        @Y61.l
        public final List<String> K() {
            return this.f87967g.f87987d;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        public final void L() {
            this.f87967g.f87988e = true;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        public final Integer T() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner
        @Y61.k
        /* renamed from: V, reason: from getter */
        public final Pixels getF88027o() {
            return this.f87967g;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        public final String W() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        @Y61.k
        /* renamed from: c */
        public final String getF88298e() {
            return this.f87967g.f87989f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BDUI)) {
                return false;
            }
            BDUI bdui = (BDUI) obj;
            return L.f(this.f87962b, bdui.f87962b) && L.f(this.f87963c, bdui.f87963c) && L.f(this.f87964d, bdui.f87964d) && L.f(this.f87965e, bdui.f87965e) && L.f(this.f87966f, bdui.f87966f) && L.f(this.f87967g, bdui.f87967g);
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: g0 */
        public final String getF88260e() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner
        @Y61.k
        /* renamed from: getAnalyticParams, reason: from getter */
        public final AnalyticsParams getF88026n() {
            return this.f87966f;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: h0 */
        public final String getF88258c() {
            return null;
        }

        public final int hashCode() {
            Map<String, Object> map = this.f87962b;
            int iD2 = H.d((map == null ? 0 : map.hashCode()) * 31, 31, this.f87963c);
            String str = this.f87964d;
            return this.f87967g.hashCode() + ((this.f87966f.hashCode() + H.d((iD2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f87965e)) * 31);
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: j0 */
        public final String getF88257b() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        /* renamed from: l0 */
        public final boolean getF88302i() {
            return this.f87967g.f87988e;
        }

        @Y61.k
        public final String toString() {
            return "BDUI(content=" + this.f87962b + ", templateType=" + this.f87963c + ", json=" + this.f87964d + ", openUrl=" + this.f87965e + ", analyticParams=" + this.f87966f + ", pixels=" + this.f87967g + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Map<String, Object> map = this.f87962b;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                Iterator itH = C0.h(parcel, 1, map);
                while (itH.hasNext()) {
                    Map.Entry entry = (Map.Entry) itH.next();
                    org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
                }
            }
            parcel.writeString(this.f87963c);
            parcel.writeString(this.f87964d);
            parcel.writeString(this.f87965e);
            this.f87966f.writeToParcel(parcel, i12);
            this.f87967g.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: AvitoBanner.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$HideReason;", "Landroid/os/Parcelable;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideReason implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<HideReason> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f87968b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f87969c;

        /* compiled from: AvitoBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<HideReason> {
            @Override // android.os.Parcelable.Creator
            public final HideReason createFromParcel(Parcel parcel) {
                return new HideReason(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final HideReason[] newArray(int i12) {
                return new HideReason[i12];
            }
        }

        public HideReason(int i12, @Y61.k String str) {
            this.f87968b = i12;
            this.f87969c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HideReason)) {
                return false;
            }
            HideReason hideReason = (HideReason) obj;
            return this.f87968b == hideReason.f87968b && L.f(this.f87969c, hideReason.f87969c);
        }

        public final int hashCode() {
            return this.f87969c.hashCode() + (Integer.hashCode(this.f87968b) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HideReason(id=");
            sb2.append(this.f87968b);
            sb2.append(", description=");
            return C22026a.c(sb2, this.f87969c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f87968b);
            parcel.writeString(this.f87969c);
        }
    }

    /* compiled from: AvitoBanner.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$Image;", "Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Image implements AvitoNetworkBanner {

        @Y61.k
        public static final Parcelable.Creator<Image> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Uri f87976b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f87977c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final AnalyticsParams f87978d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Pixels f87979e;

        /* compiled from: AvitoBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Image> {
            @Override // android.os.Parcelable.Creator
            public final Image createFromParcel(Parcel parcel) {
                return new Image((Uri) parcel.readParcelable(Image.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : AnalyticsParams.CREATOR.createFromParcel(parcel), Pixels.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Image[] newArray(int i12) {
                return new Image[i12];
            }
        }

        public Image(@Y61.k Uri uri, @Y61.k String str, @Y61.l AnalyticsParams analyticsParams, @Y61.k Pixels pixels) {
            this.f87976b = uri;
            this.f87977c = str;
            this.f87978d = analyticsParams;
            this.f87979e = pixels;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        public final Integer T() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner
        @Y61.k
        /* renamed from: V, reason: from getter */
        public final Pixels getF88027o() {
            return this.f87979e;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        public final String W() {
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Image)) {
                return false;
            }
            Image image = (Image) obj;
            return L.f(this.f87976b, image.f87976b) && L.f(this.f87977c, image.f87977c) && L.f(this.f87978d, image.f87978d) && L.f(this.f87979e, image.f87979e);
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: g0 */
        public final String getF88260e() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner
        @Y61.l
        /* renamed from: getAnalyticParams, reason: from getter */
        public final AnalyticsParams getF88026n() {
            return this.f87978d;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: h0 */
        public final String getF88258c() {
            return null;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f87976b.hashCode() * 31, 31, this.f87977c);
            AnalyticsParams analyticsParams = this.f87978d;
            return this.f87979e.hashCode() + ((iD2 + (analyticsParams == null ? 0 : analyticsParams.hashCode())) * 31);
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: j0 */
        public final String getF88257b() {
            return null;
        }

        @Y61.k
        public final String toString() {
            return "Image(image=" + this.f87976b + ", link=" + this.f87977c + ", analyticParams=" + this.f87978d + ", pixels=" + this.f87979e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f87976b, i12);
            parcel.writeString(this.f87977c);
            AnalyticsParams analyticsParams = this.f87978d;
            if (analyticsParams == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                analyticsParams.writeToParcel(parcel, i12);
            }
            this.f87979e.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: AvitoBanner.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$MarkInfo;", "Landroid/os/Parcelable;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MarkInfo implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<MarkInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f87980b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f87981c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f87982d;

        /* compiled from: AvitoBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MarkInfo> {
            @Override // android.os.Parcelable.Creator
            public final MarkInfo createFromParcel(Parcel parcel) {
                return new MarkInfo(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MarkInfo[] newArray(int i12) {
                return new MarkInfo[i12];
            }
        }

        public MarkInfo(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
            this.f87980b = str;
            this.f87981c = str2;
            this.f87982d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarkInfo)) {
                return false;
            }
            MarkInfo markInfo = (MarkInfo) obj;
            return L.f(this.f87980b, markInfo.f87980b) && L.f(this.f87981c, markInfo.f87981c) && L.f(this.f87982d, markInfo.f87982d);
        }

        public final int hashCode() {
            int iHashCode = this.f87980b.hashCode() * 31;
            String str = this.f87981c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f87982d;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MarkInfo(juristicInfo=");
            sb2.append(this.f87980b);
            sb2.append(", legalInfo=");
            sb2.append(this.f87981c);
            sb2.append(", age=");
            return C22026a.c(sb2, this.f87982d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f87980b);
            parcel.writeString(this.f87981c);
            parcel.writeString(this.f87982d);
        }
    }

    /* compiled from: AvitoBanner.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$ProfilePromo;", "Lcom/avito/android/advertising/loaders/D;", "Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProfilePromo implements D, AvitoNetworkBanner {

        @Y61.k
        public static final Parcelable.Creator<ProfilePromo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f88000b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f88001c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Uri f88002d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f88003e;

        /* renamed from: f, reason: collision with root package name */
        public final int f88004f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f88005g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final MarkInfo f88006h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final List<HideReason> f88007i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final String f88008j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final String f88009k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public final InterfaceC42726C f88010l = C42727D.c(new b());

        /* compiled from: AvitoBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ProfilePromo> {
            @Override // android.os.Parcelable.Creator
            public final ProfilePromo createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                Uri uri = (Uri) parcel.readParcelable(ProfilePromo.class.getClassLoader());
                String string3 = parcel.readString();
                int i12 = parcel.readInt();
                int iC2 = 0;
                boolean z12 = parcel.readInt() != 0;
                ArrayList arrayList = null;
                MarkInfo markInfoCreateFromParcel = parcel.readInt() == 0 ? null : MarkInfo.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int i13 = parcel.readInt();
                    arrayList = new ArrayList(i13);
                    while (iC2 != i13) {
                        iC2 = com.avito.android.actions_sheet.a.c(HideReason.CREATOR, parcel, arrayList, iC2, 1);
                    }
                }
                return new ProfilePromo(string, string2, uri, string3, i12, z12, markInfoCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final ProfilePromo[] newArray(int i12) {
                return new ProfilePromo[i12];
            }
        }

        /* compiled from: AvitoBanner.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$AnalyticsParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b extends N implements Y41.a<AnalyticsParams> {
            public b() {
                super(0);
            }

            @Override // Y41.a
            public final AnalyticsParams invoke() {
                ProfilePromo profilePromo = ProfilePromo.this;
                return new AnalyticsParams(profilePromo.f88008j, profilePromo.f88009k, null, null, null, null, true, 60, null);
            }
        }

        public ProfilePromo(@Y61.k String str, @Y61.k String str2, @Y61.k Uri uri, @Y61.k String str3, int i12, boolean z12, @Y61.l MarkInfo markInfo, @Y61.l List<HideReason> list) {
            this.f88000b = str;
            this.f88001c = str2;
            this.f88002d = uri;
            this.f88003e = str3;
            this.f88004f = i12;
            this.f88005g = z12;
            this.f88006h = markInfo;
            this.f88007i = list;
            Map mapD = C35800g5.d(Uri.parse(str3).getQueryParameter("context"));
            mapD = mapD == null ? P0.c() : mapD;
            Object obj = mapD.get("adv_creative_id");
            this.f88008j = obj != null ? obj.toString() : null;
            Object obj2 = mapD.get("adv_campaign_id");
            this.f88009k = obj2 != null ? obj2.toString() : null;
        }

        @Override // com.avito.android.advertising.loaders.D
        @Y61.l
        public final List<HideReason> D() {
            return this.f88007i;
        }

        @Override // com.avito.android.advertising.b
        @Y61.k
        public final Integer T() {
            return Integer.valueOf(this.f88004f);
        }

        @Override // com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner
        @Y61.k
        /* renamed from: V */
        public final Pixels getF88027o() {
            Pixels.f87983q.getClass();
            return Pixels.f87984r;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        public final String W() {
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProfilePromo)) {
                return false;
            }
            ProfilePromo profilePromo = (ProfilePromo) obj;
            return L.f(this.f88000b, profilePromo.f88000b) && L.f(this.f88001c, profilePromo.f88001c) && L.f(this.f88002d, profilePromo.f88002d) && L.f(this.f88003e, profilePromo.f88003e) && this.f88004f == profilePromo.f88004f && this.f88005g == profilePromo.f88005g && L.f(this.f88006h, profilePromo.f88006h) && L.f(this.f88007i, profilePromo.f88007i);
        }

        @Override // com.avito.android.advertising.loaders.D
        @Y61.l
        /* renamed from: g, reason: from getter */
        public final MarkInfo getF88006h() {
            return this.f88006h;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: g0 */
        public final String getF88260e() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner
        @Y61.k
        /* renamed from: getAnalyticParams */
        public final AnalyticsParams getF88026n() {
            return (AnalyticsParams) this.f88010l.getValue();
        }

        @Override // com.avito.android.advertising.loaders.D
        @Y61.k
        /* renamed from: getDescription, reason: from getter */
        public final String getF88001c() {
            return this.f88001c;
        }

        @Override // com.avito.android.advertising.loaders.D
        @Y61.k
        /* renamed from: getImage, reason: from getter */
        public final Uri getF88002d() {
            return this.f88002d;
        }

        @Override // com.avito.android.advertising.loaders.D
        @Y61.k
        /* renamed from: getTitle, reason: from getter */
        public final String getF88000b() {
            return this.f88000b;
        }

        @Override // com.avito.android.advertising.loaders.D
        @Y61.k
        /* renamed from: getUri, reason: from getter */
        public final String getF88003e() {
            return this.f88003e;
        }

        @Override // com.avito.android.advertising.b
        @Y61.k
        /* renamed from: h0 */
        public final String getF88258c() {
            return getF88001c();
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.e(this.f88004f, H.d(androidx.media3.exoplayer.analytics.m.e(this.f88002d, H.d(this.f88000b.hashCode() * 31, 31, this.f88001c), 31), 31, this.f88003e), 31), 31, this.f88005g);
            MarkInfo markInfo = this.f88006h;
            int iHashCode = (i12 + (markInfo == null ? 0 : markInfo.hashCode())) * 31;
            List<HideReason> list = this.f88007i;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        @Override // com.avito.android.advertising.loaders.D
        /* renamed from: isHidden, reason: from getter */
        public final boolean getF88005g() {
            return this.f88005g;
        }

        @Override // com.avito.android.advertising.b
        @Y61.k
        /* renamed from: j0 */
        public final String getF88257b() {
            return getF88000b();
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProfilePromo(title=");
            sb2.append(this.f88000b);
            sb2.append(", description=");
            sb2.append(this.f88001c);
            sb2.append(", image=");
            sb2.append(this.f88002d);
            sb2.append(", uri=");
            sb2.append(this.f88003e);
            sb2.append(", creativeId=");
            sb2.append(this.f88004f);
            sb2.append(", isHidden=");
            sb2.append(this.f88005g);
            sb2.append(", markInfo=");
            sb2.append(this.f88006h);
            sb2.append(", hideReasons=");
            return H.p(sb2, this.f88007i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f88000b);
            parcel.writeString(this.f88001c);
            parcel.writeParcelable(this.f88002d, i12);
            parcel.writeString(this.f88003e);
            parcel.writeInt(this.f88004f);
            parcel.writeInt(this.f88005g ? 1 : 0);
            MarkInfo markInfo = this.f88006h;
            if (markInfo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                markInfo.writeToParcel(parcel, i12);
            }
            List<HideReason> list = this.f88007i;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((HideReason) itA.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: AvitoBanner.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$ProfilePromoGallery;", "Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner;", "Lcom/avito/android/advertising/c;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProfilePromoGallery implements AvitoNetworkBanner, com.avito.android.advertising.c {

        @Y61.k
        public static final Parcelable.Creator<ProfilePromoGallery> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f88012b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ArrayList f88013c;

        /* compiled from: AvitoBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ProfilePromoGallery> {
            @Override // android.os.Parcelable.Creator
            public final ProfilePromoGallery createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(ProfilePromo.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new ProfilePromoGallery(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final ProfilePromoGallery[] newArray(int i12) {
                return new ProfilePromoGallery[i12];
            }
        }

        public ProfilePromoGallery(@Y61.k String str, @Y61.k ArrayList arrayList) {
            this.f88012b = str;
            this.f88013c = arrayList;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        public final Integer T() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner
        @Y61.k
        /* renamed from: V */
        public final Pixels getF88027o() {
            Pixels.f87983q.getClass();
            return Pixels.f87984r;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        public final String W() {
            return null;
        }

        @Override // com.avito.android.advertising.c
        @Y61.k
        public final List<com.avito.android.advertising.b> c() {
            return this.f88013c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProfilePromoGallery)) {
                return false;
            }
            ProfilePromoGallery profilePromoGallery = (ProfilePromoGallery) obj;
            return L.f(this.f88012b, profilePromoGallery.f88012b) && this.f88013c.equals(profilePromoGallery.f88013c);
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: g0 */
        public final String getF88260e() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner
        @Y61.l
        /* renamed from: getAnalyticParams */
        public final AnalyticsParams getF88026n() {
            return null;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: h0 */
        public final String getF88258c() {
            return null;
        }

        public final int hashCode() {
            return this.f88013c.hashCode() + (this.f88012b.hashCode() * 31);
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: j0 */
        public final String getF88257b() {
            return null;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProfilePromoGallery(title=");
            sb2.append(this.f88012b);
            sb2.append(", posters=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f88013c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f88012b);
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f88013c, parcel);
            while (itZ.hasNext()) {
                ((ProfilePromo) itZ.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: AvitoBanner.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$Video;", "Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner;", "Lcom/avito/android/advertising/loaders/C;", "Lcom/avito/android/advertising/loaders/event_service/b;", "Lcom/avito/android/advertising/loaders/event_service/l;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Video implements AvitoNetworkBanner, C, com.avito.android.advertising.loaders.event_service.b, com.avito.android.advertising.loaders.event_service.l {

        @Y61.k
        public static final Parcelable.Creator<Video> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f88014b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f88015c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f88016d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f88017e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f88018f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f88019g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final Uri f88020h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final Uri f88021i;

        /* renamed from: j, reason: collision with root package name */
        public final float f88022j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final String f88023k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final Uri f88024l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final Float f88025m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.k
        public final AnalyticsParams f88026n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.k
        public final Pixels f88027o;

        /* compiled from: AvitoBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Video> {
            @Override // android.os.Parcelable.Creator
            public final Video createFromParcel(Parcel parcel) {
                return new Video(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(Video.class.getClassLoader()), (Uri) parcel.readParcelable(Video.class.getClassLoader()), parcel.readFloat(), parcel.readString(), (Uri) parcel.readParcelable(Video.class.getClassLoader()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), AnalyticsParams.CREATOR.createFromParcel(parcel), Pixels.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Video[] newArray(int i12) {
                return new Video[i12];
            }
        }

        public Video(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l Uri uri, @Y61.k Uri uri2, float f12, @Y61.l String str7, @Y61.l Uri uri3, @Y61.l Float f13, @Y61.k AnalyticsParams analyticsParams, @Y61.k Pixels pixels) {
            this.f88014b = str;
            this.f88015c = str2;
            this.f88016d = str3;
            this.f88017e = str4;
            this.f88018f = str5;
            this.f88019g = str6;
            this.f88020h = uri;
            this.f88021i = uri2;
            this.f88022j = f12;
            this.f88023k = str7;
            this.f88024l = uri3;
            this.f88025m = f13;
            this.f88026n = analyticsParams;
            this.f88027o = pixels;
        }

        @Override // com.avito.android.advertising.loaders.C
        @Y61.l
        public final String A() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        @Y61.l
        public final List<String> B() {
            return this.f88027o.f87990g;
        }

        @Override // com.avito.android.advertising.loaders.C
        @Y61.k
        /* renamed from: C, reason: from getter */
        public final String getF88014b() {
            return this.f88014b;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        @Y61.l
        public final List<String> E() {
            return this.f88027o.f87996m;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        /* renamed from: H */
        public final boolean getF88382k() {
            return this.f88027o.f87999p;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        public final void I() {
            this.f88027o.f87993j = true;
        }

        @Override // com.avito.android.advertising.loaders.C
        @Y61.l
        /* renamed from: J */
        public final String getF88268m() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        @Y61.l
        public final List<String> K() {
            return this.f88027o.f87987d;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        public final void L() {
            this.f88027o.f87988e = true;
        }

        @Override // com.avito.android.advertising.loaders.C
        /* renamed from: M, reason: from getter */
        public final float getF88265j() {
            return this.f88022j;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        public final Integer T() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner
        @Y61.k
        /* renamed from: V, reason: from getter */
        public final Pixels getF88027o() {
            return this.f88027o;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        public final String W() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        @Y61.k
        /* renamed from: c */
        public final String getF88298e() {
            return "avito";
        }

        @Override // com.avito.android.advertising.loaders.C
        @Y61.l
        /* renamed from: d, reason: from getter */
        public final String getF88262g() {
            return this.f88019g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Video)) {
                return false;
            }
            Video video = (Video) obj;
            return L.f(this.f88014b, video.f88014b) && L.f(this.f88015c, video.f88015c) && L.f(this.f88016d, video.f88016d) && L.f(this.f88017e, video.f88017e) && L.f(this.f88018f, video.f88018f) && L.f(this.f88019g, video.f88019g) && L.f(this.f88020h, video.f88020h) && L.f(this.f88021i, video.f88021i) && Float.compare(this.f88022j, video.f88022j) == 0 && L.f(this.f88023k, video.f88023k) && L.f(this.f88024l, video.f88024l) && L.f(this.f88025m, video.f88025m) && L.f(this.f88026n, video.f88026n) && L.f(this.f88027o, video.f88027o);
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        public final void f() {
            this.f88027o.f87997n = true;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: g0, reason: from getter */
        public final String getF88260e() {
            return this.f88017e;
        }

        @Override // com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner
        @Y61.k
        /* renamed from: getAnalyticParams, reason: from getter */
        public final AnalyticsParams getF88026n() {
            return this.f88026n;
        }

        @Override // com.avito.android.advertising.loaders.C
        @Y61.l
        /* renamed from: getLogo, reason: from getter */
        public final Uri getF88267l() {
            return this.f88024l;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: h0, reason: from getter */
        public final String getF88258c() {
            return this.f88016d;
        }

        public final int hashCode() {
            int iHashCode = this.f88014b.hashCode() * 31;
            String str = this.f88015c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f88016d;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f88017e;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f88018f;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f88019g;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Uri uri = this.f88020h;
            int iD2 = androidx.appcompat.app.r.d(this.f88022j, androidx.media3.exoplayer.analytics.m.e(this.f88021i, (iHashCode6 + (uri == null ? 0 : uri.hashCode())) * 31, 31), 31);
            String str6 = this.f88023k;
            int iHashCode7 = (iD2 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Uri uri2 = this.f88024l;
            int iHashCode8 = (iHashCode7 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
            Float f12 = this.f88025m;
            return this.f88027o.hashCode() + ((this.f88026n.hashCode() + ((iHashCode8 + (f12 != null ? f12.hashCode() : 0)) * 31)) * 31);
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        /* renamed from: i */
        public final boolean getF88376e() {
            return this.f88027o.f87993j;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        public final void j() {
            this.f88027o.f87991h = true;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: j0, reason: from getter */
        public final String getF88257b() {
            return this.f88015c;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        @Y61.l
        public final List<String> l() {
            return this.f88027o.f87998o;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        /* renamed from: l0 */
        public final boolean getF88302i() {
            return this.f88027o.f87988e;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        /* renamed from: m */
        public final boolean getF88378g() {
            return this.f88027o.f87995l;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        public final void n() {
            this.f88027o.f87995l = true;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        @Y61.l
        public final List<String> n0() {
            return this.f88027o.f87994k;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        /* renamed from: o */
        public final boolean getF88380i() {
            return this.f88027o.f87997n;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        public final void p() {
            this.f88027o.f87999p = true;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        /* renamed from: q */
        public final boolean getF88374c() {
            return this.f88027o.f87991h;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        @Y61.l
        public final List<String> s() {
            return this.f88027o.f87992i;
        }

        @Y61.k
        public final String toString() {
            return "Video(linkUrl=" + this.f88014b + ", adTitle=" + this.f88015c + ", adBody=" + this.f88016d + ", adLegal=" + this.f88017e + ", juristicText=" + this.f88018f + ", age=" + this.f88019g + ", videoPreview=" + this.f88020h + ", video=" + this.f88021i + ", videoRatio=" + this.f88022j + ", buttonText=" + this.f88023k + ", logo=" + this.f88024l + ", logoRatio=" + this.f88025m + ", analyticParams=" + this.f88026n + ", pixels=" + this.f88027o + ')';
        }

        @Override // com.avito.android.advertising.loaders.C
        @Y61.k
        /* renamed from: u, reason: from getter */
        public final Uri getF88264i() {
            return this.f88021i;
        }

        @Override // com.avito.android.advertising.loaders.C
        @Y61.l
        /* renamed from: v, reason: from getter */
        public final String getF88018f() {
            return this.f88018f;
        }

        @Override // com.avito.android.advertising.loaders.C
        @Y61.l
        /* renamed from: w, reason: from getter */
        public final String getF88266k() {
            return this.f88023k;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f88014b);
            parcel.writeString(this.f88015c);
            parcel.writeString(this.f88016d);
            parcel.writeString(this.f88017e);
            parcel.writeString(this.f88018f);
            parcel.writeString(this.f88019g);
            parcel.writeParcelable(this.f88020h, i12);
            parcel.writeParcelable(this.f88021i, i12);
            parcel.writeFloat(this.f88022j);
            parcel.writeString(this.f88023k);
            parcel.writeParcelable(this.f88024l, i12);
            Float f12 = this.f88025m;
            if (f12 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.B(parcel, 1, f12);
            }
            this.f88026n.writeToParcel(parcel, i12);
            this.f88027o.writeToParcel(parcel, i12);
        }

        @Override // com.avito.android.advertising.loaders.C
        public final boolean x() {
            return false;
        }

        @Override // com.avito.android.advertising.loaders.C
        @Y61.l
        /* renamed from: y, reason: from getter */
        public final Float getF88025m() {
            return this.f88025m;
        }

        @Override // com.avito.android.advertising.loaders.C
        @Y61.l
        /* renamed from: z, reason: from getter */
        public final Uri getF88263h() {
            return this.f88020h;
        }
    }

    /* compiled from: AvitoBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    /* renamed from: V */
    Pixels getF88027o();

    @Y61.l
    /* renamed from: getAnalyticParams */
    AnalyticsParams getF88026n();

    /* compiled from: AvitoBanner.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$Html;", "Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner;", "Lcom/avito/android/advertising/loaders/B;", "Lcom/avito/android/advertising/loaders/event_service/b;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Html implements AvitoNetworkBanner, B, com.avito.android.advertising.loaders.event_service.b {

        @Y61.k
        public static final Parcelable.Creator<Html> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f87970b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Float f87971c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f87972d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f87973e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final AnalyticsParams f87974f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final Pixels f87975g;

        /* compiled from: AvitoBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Html> {
            @Override // android.os.Parcelable.Creator
            public final Html createFromParcel(Parcel parcel) {
                return new Html(parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0, parcel.readInt() != 0, AnalyticsParams.CREATOR.createFromParcel(parcel), Pixels.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Html[] newArray(int i12) {
                return new Html[i12];
            }
        }

        public Html(@Y61.k String str, @Y61.l Float f12, boolean z12, boolean z13, @Y61.k AnalyticsParams analyticsParams, @Y61.k Pixels pixels) {
            this.f87970b = str;
            this.f87971c = f12;
            this.f87972d = z12;
            this.f87973e = z13;
            this.f87974f = analyticsParams;
            this.f87975g = pixels;
        }

        @Override // com.avito.android.advertising.loaders.B
        public final void G() {
            this.f87973e = true;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        @Y61.l
        public final List<String> K() {
            return this.f87975g.f87987d;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        public final void L() {
            this.f87975g.f87988e = true;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        public final Integer T() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner
        @Y61.k
        /* renamed from: V, reason: from getter */
        public final Pixels getF88027o() {
            return this.f87975g;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        public final String W() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        @Y61.k
        /* renamed from: c */
        public final String getF88298e() {
            return this.f87975g.f87989f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.advertising.loaders.B
        @Y61.k
        /* renamed from: e, reason: from getter */
        public final String getF88271b() {
            return this.f87970b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Html)) {
                return false;
            }
            Html html = (Html) obj;
            return L.f(this.f87970b, html.f87970b) && L.f(this.f87971c, html.f87971c) && this.f87972d == html.f87972d && this.f87973e == html.f87973e && L.f(this.f87974f, html.f87974f) && L.f(this.f87975g, html.f87975g);
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: g0 */
        public final String getF88260e() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner
        @Y61.k
        /* renamed from: getAnalyticParams, reason: from getter */
        public final AnalyticsParams getF88026n() {
            return this.f87974f;
        }

        @Override // com.avito.android.advertising.loaders.B
        @Y61.l
        /* renamed from: getHeight */
        public final Integer getF88273d() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.B
        @Y61.l
        /* renamed from: getWidth */
        public final Integer getF88272c() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.B
        /* renamed from: h, reason: from getter */
        public final boolean getF88275f() {
            return this.f87972d;
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: h0 */
        public final String getF88258c() {
            return null;
        }

        public final int hashCode() {
            int iHashCode = this.f87970b.hashCode() * 31;
            Float f12 = this.f87971c;
            return this.f87975g.hashCode() + ((this.f87974f.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode + (f12 == null ? 0 : f12.hashCode())) * 31, 31, this.f87972d), 31, this.f87973e)) * 31);
        }

        @Override // com.avito.android.advertising.b
        @Y61.l
        /* renamed from: j0 */
        public final String getF88257b() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.B
        /* renamed from: k, reason: from getter */
        public final boolean getF88276g() {
            return this.f87973e;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        /* renamed from: l0 */
        public final boolean getF88302i() {
            return this.f87975g.f87988e;
        }

        @Override // com.avito.android.advertising.loaders.B
        @Y61.l
        /* renamed from: r, reason: from getter */
        public final Float getF88274e() {
            return this.f87971c;
        }

        @Override // com.avito.android.advertising.loaders.B
        public final void t() {
            this.f87972d = true;
        }

        @Y61.k
        public final String toString() {
            return "Html(html=" + this.f87970b + ", ratio=" + this.f87971c + ", gotError=" + this.f87972d + ", wasRendered=" + this.f87973e + ", analyticParams=" + this.f87974f + ", pixels=" + this.f87975g + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f87970b);
            Float f12 = this.f87971c;
            if (f12 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.B(parcel, 1, f12);
            }
            parcel.writeInt(this.f87972d ? 1 : 0);
            parcel.writeInt(this.f87973e ? 1 : 0);
            this.f87974f.writeToParcel(parcel, i12);
            this.f87975g.writeToParcel(parcel, i12);
        }

        public /* synthetic */ Html(String str, Float f12, boolean z12, boolean z13, AnalyticsParams analyticsParams, Pixels pixels, int i12, C42822w c42822w) {
            this(str, f12, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? false : z13, analyticsParams, pixels);
        }
    }

    /* compiled from: AvitoBanner.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$AnalyticsParams;", "Landroid/os/Parcelable;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AnalyticsParams implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<AnalyticsParams> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f87955b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f87956c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f87957d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f87958e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f87959f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f87960g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f87961h;

        /* compiled from: AvitoBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AnalyticsParams> {
            @Override // android.os.Parcelable.Creator
            public final AnalyticsParams createFromParcel(Parcel parcel) {
                return new AnalyticsParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AnalyticsParams[] newArray(int i12) {
                return new AnalyticsParams[i12];
            }
        }

        public AnalyticsParams(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, boolean z12, @Y61.l String str6) {
            this.f87955b = str;
            this.f87956c = str2;
            this.f87957d = str3;
            this.f87958e = str4;
            this.f87959f = str5;
            this.f87960g = str6;
            this.f87961h = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnalyticsParams)) {
                return false;
            }
            AnalyticsParams analyticsParams = (AnalyticsParams) obj;
            return L.f(this.f87955b, analyticsParams.f87955b) && L.f(this.f87956c, analyticsParams.f87956c) && L.f(this.f87957d, analyticsParams.f87957d) && L.f(this.f87958e, analyticsParams.f87958e) && L.f(this.f87959f, analyticsParams.f87959f) && L.f(this.f87960g, analyticsParams.f87960g) && this.f87961h == analyticsParams.f87961h;
        }

        public final int hashCode() {
            String str = this.f87955b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f87956c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f87957d;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f87958e;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f87959f;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f87960g;
            return Boolean.hashCode(this.f87961h) + ((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AnalyticsParams(creativeId=");
            sb2.append(this.f87955b);
            sb2.append(", campaignId=");
            sb2.append(this.f87956c);
            sb2.append(", templateId=");
            sb2.append(this.f87957d);
            sb2.append(", impressionId=");
            sb2.append(this.f87958e);
            sb2.append(", clickId=");
            sb2.append(this.f87959f);
            sb2.append(", fullViewId=");
            sb2.append(this.f87960g);
            sb2.append(", isClickIn=");
            return androidx.appcompat.app.r.x(sb2, this.f87961h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f87955b);
            parcel.writeString(this.f87956c);
            parcel.writeString(this.f87957d);
            parcel.writeString(this.f87958e);
            parcel.writeString(this.f87959f);
            parcel.writeString(this.f87960g);
            parcel.writeInt(this.f87961h ? 1 : 0);
        }

        public /* synthetic */ AnalyticsParams(String str, String str2, String str3, String str4, String str5, String str6, boolean z12, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 64) != 0 ? false : z12, (i12 & 32) != 0 ? null : str6);
        }
    }

    /* compiled from: AvitoBanner.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$Pixels;", "Landroid/os/Parcelable;", "Lcom/avito/android/advertising/loaders/event_service/b;", "Lcom/avito/android/advertising/loaders/event_service/i;", "Lcom/avito/android/advertising/loaders/event_service/l;", "a", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Pixels implements Parcelable, com.avito.android.advertising.loaders.event_service.b, com.avito.android.advertising.loaders.event_service.i, com.avito.android.advertising.loaders.event_service.l {

        /* renamed from: r, reason: collision with root package name */
        @Y61.k
        public static final Pixels f87984r;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<String> f87985b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f87986c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final List<String> f87987d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f87988e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f87989f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final List<String> f87990g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f87991h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final List<String> f87992i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f87993j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final List<String> f87994k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f87995l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.k
        public final List<String> f87996m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f87997n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.k
        public final List<String> f87998o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f87999p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.k
        public static final a f87983q = new a(null);

        @Y61.k
        public static final Parcelable.Creator<Pixels> CREATOR = new b();

        /* compiled from: AvitoBanner.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$Pixels$a;", "", "<init>", "()V", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        /* compiled from: AvitoBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Pixels> {
            @Override // android.os.Parcelable.Creator
            public final Pixels createFromParcel(Parcel parcel) {
                return new Pixels(parcel.createStringArrayList(), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Pixels[] newArray(int i12) {
                return new Pixels[i12];
            }
        }

        static {
            C42784z0 c42784z0 = C42784z0.f406748b;
            f87984r = new Pixels(c42784z0, true, c42784z0, true, null, c42784z0, true, c42784z0, true, c42784z0, true, c42784z0, true, c42784z0, true, 16, null);
        }

        public Pixels(@Y61.k List<String> list, boolean z12, @Y61.k List<String> list2, boolean z13, @Y61.k String str, @Y61.k List<String> list3, boolean z14, @Y61.k List<String> list4, boolean z15, @Y61.k List<String> list5, boolean z16, @Y61.k List<String> list6, boolean z17, @Y61.k List<String> list7, boolean z18) {
            this.f87985b = list;
            this.f87986c = z12;
            this.f87987d = list2;
            this.f87988e = z13;
            this.f87989f = str;
            this.f87990g = list3;
            this.f87991h = z14;
            this.f87992i = list4;
            this.f87993j = z15;
            this.f87994k = list5;
            this.f87995l = z16;
            this.f87996m = list6;
            this.f87997n = z17;
            this.f87998o = list7;
            this.f87999p = z18;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        @Y61.k
        public final List<String> B() {
            return this.f87990g;
        }

        @Override // com.avito.android.advertising.loaders.event_service.i
        @Y61.k
        public final List<String> D() {
            return this.f87985b;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        @Y61.k
        public final List<String> E() {
            return this.f87996m;
        }

        @Override // com.avito.android.advertising.loaders.event_service.i
        public final void F() {
            this.f87986c = true;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        /* renamed from: H, reason: from getter */
        public final boolean getF88382k() {
            return this.f87999p;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        public final void I() {
            this.f87993j = true;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        @Y61.k
        public final List<String> K() {
            return this.f87987d;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        public final void L() {
            this.f87988e = true;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getF88298e() {
            return this.f87989f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pixels)) {
                return false;
            }
            Pixels pixels = (Pixels) obj;
            return L.f(this.f87985b, pixels.f87985b) && this.f87986c == pixels.f87986c && L.f(this.f87987d, pixels.f87987d) && this.f87988e == pixels.f87988e && L.f(this.f87989f, pixels.f87989f) && L.f(this.f87990g, pixels.f87990g) && this.f87991h == pixels.f87991h && L.f(this.f87992i, pixels.f87992i) && this.f87993j == pixels.f87993j && L.f(this.f87994k, pixels.f87994k) && this.f87995l == pixels.f87995l && L.f(this.f87996m, pixels.f87996m) && this.f87997n == pixels.f87997n && L.f(this.f87998o, pixels.f87998o) && this.f87999p == pixels.f87999p;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        public final void f() {
            this.f87997n = true;
        }

        @Override // com.avito.android.advertising.loaders.event_service.i
        /* renamed from: g, reason: from getter */
        public final boolean getF88301h() {
            return this.f87986c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f87999p) + H.e(androidx.appcompat.app.r.i(H.e(androidx.appcompat.app.r.i(H.e(androidx.appcompat.app.r.i(H.e(androidx.appcompat.app.r.i(H.e(H.d(androidx.appcompat.app.r.i(H.e(androidx.appcompat.app.r.i(this.f87985b.hashCode() * 31, 31, this.f87986c), 31, this.f87987d), 31, this.f87988e), 31, this.f87989f), 31, this.f87990g), 31, this.f87991h), 31, this.f87992i), 31, this.f87993j), 31, this.f87994k), 31, this.f87995l), 31, this.f87996m), 31, this.f87997n), 31, this.f87998o);
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        /* renamed from: i, reason: from getter */
        public final boolean getF88376e() {
            return this.f87993j;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        public final void j() {
            this.f87991h = true;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        @Y61.k
        public final List<String> l() {
            return this.f87998o;
        }

        @Override // com.avito.android.advertising.loaders.event_service.b
        /* renamed from: l0, reason: from getter */
        public final boolean getF88302i() {
            return this.f87988e;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        /* renamed from: m, reason: from getter */
        public final boolean getF88378g() {
            return this.f87995l;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        public final void n() {
            this.f87995l = true;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        @Y61.k
        public final List<String> n0() {
            return this.f87994k;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        /* renamed from: o, reason: from getter */
        public final boolean getF88380i() {
            return this.f87997n;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        public final void p() {
            this.f87999p = true;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        /* renamed from: q, reason: from getter */
        public final boolean getF88374c() {
            return this.f87991h;
        }

        @Override // com.avito.android.advertising.loaders.event_service.l
        @Y61.k
        public final List<String> s() {
            return this.f87992i;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Pixels(impressionUrls=");
            sb2.append(this.f87985b);
            sb2.append(", wasImpressionTracked=");
            sb2.append(this.f87986c);
            sb2.append(", clickUrls=");
            sb2.append(this.f87987d);
            sb2.append(", wasClickTracked=");
            sb2.append(this.f87988e);
            sb2.append(", networkName=");
            sb2.append(this.f87989f);
            sb2.append(", videoStartUrls=");
            sb2.append(this.f87990g);
            sb2.append(", wasVideoStartTracked=");
            sb2.append(this.f87991h);
            sb2.append(", videoFirstQuartileUrls=");
            sb2.append(this.f87992i);
            sb2.append(", wasVideoFirstQuartileTracked=");
            sb2.append(this.f87993j);
            sb2.append(", videoMidpointUrls=");
            sb2.append(this.f87994k);
            sb2.append(", wasVideoMidpointTracked=");
            sb2.append(this.f87995l);
            sb2.append(", videoThirdQuartileUrls=");
            sb2.append(this.f87996m);
            sb2.append(", wasVideoThirdQuartileTracked=");
            sb2.append(this.f87997n);
            sb2.append(", videoCompletedUrls=");
            sb2.append(this.f87998o);
            sb2.append(", wasVideoCompleteTracked=");
            return androidx.appcompat.app.r.x(sb2, this.f87999p, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeStringList(this.f87985b);
            parcel.writeInt(this.f87986c ? 1 : 0);
            parcel.writeStringList(this.f87987d);
            parcel.writeInt(this.f87988e ? 1 : 0);
            parcel.writeString(this.f87989f);
            parcel.writeStringList(this.f87990g);
            parcel.writeInt(this.f87991h ? 1 : 0);
            parcel.writeStringList(this.f87992i);
            parcel.writeInt(this.f87993j ? 1 : 0);
            parcel.writeStringList(this.f87994k);
            parcel.writeInt(this.f87995l ? 1 : 0);
            parcel.writeStringList(this.f87996m);
            parcel.writeInt(this.f87997n ? 1 : 0);
            parcel.writeStringList(this.f87998o);
            parcel.writeInt(this.f87999p ? 1 : 0);
        }

        public /* synthetic */ Pixels(List list, boolean z12, List list2, boolean z13, String str, List list3, boolean z14, List list4, boolean z15, List list5, boolean z16, List list6, boolean z17, List list7, boolean z18, int i12, C42822w c42822w) {
            this(list, (i12 & 2) != 0 ? false : z12, list2, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? "avito" : str, list3, (i12 & 64) != 0 ? false : z14, list4, (i12 & 256) != 0 ? false : z15, list5, (i12 & 1024) != 0 ? false : z16, list6, (i12 & 4096) != 0 ? false : z17, list7, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z18);
        }
    }
}
