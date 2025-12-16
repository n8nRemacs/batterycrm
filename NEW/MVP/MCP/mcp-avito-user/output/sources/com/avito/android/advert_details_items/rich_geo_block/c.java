package com.avito.android.advert_details_items.rich_geo_block;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsRichGeoBlockData.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/rich_geo_block/c;", "", "a", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f85417a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f85418b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final List<a> f85419c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f85420d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f85421e;

    /* compiled from: AdvertDetailsRichGeoBlockData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/rich_geo_block/c$a;", "", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final List<String> f85422a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f85423b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f85424c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f85425d;

        public a(@Y61.l List<String> list, @Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
            this.f85422a = list;
            this.f85423b = str;
            this.f85424c = str2;
            this.f85425d = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f85422a, aVar.f85422a) && L.f(this.f85423b, aVar.f85423b) && L.f(this.f85424c, aVar.f85424c) && L.f(this.f85425d, aVar.f85425d);
        }

        public final int hashCode() {
            List<String> list = this.f85422a;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.f85423b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f85424c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f85425d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MetroStation(colors=");
            sb2.append(this.f85422a);
            sb2.append(", title=");
            sb2.append(this.f85423b);
            sb2.append(", iconName=");
            sb2.append(this.f85424c);
            sb2.append(", travelTime=");
            return C22026a.c(sb2, this.f85425d, ')');
        }
    }

    public c(@Y61.l String str, @Y61.l String str2, @Y61.l List<a> list, @Y61.l UniversalImage universalImage, boolean z12) {
        this.f85417a = str;
        this.f85418b = str2;
        this.f85419c = list;
        this.f85420d = universalImage;
        this.f85421e = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f85417a, cVar.f85417a) && L.f(this.f85418b, cVar.f85418b) && L.f(this.f85419c, cVar.f85419c) && L.f(this.f85420d, cVar.f85420d) && this.f85421e == cVar.f85421e;
    }

    public final int hashCode() {
        String str = this.f85417a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f85418b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<a> list = this.f85419c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        UniversalImage universalImage = this.f85420d;
        return Boolean.hashCode(this.f85421e) + ((iHashCode3 + (universalImage != null ? universalImage.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsRichGeoBlockData(title=");
        sb2.append(this.f85417a);
        sb2.append(", address=");
        sb2.append(this.f85418b);
        sb2.append(", metroStations=");
        sb2.append(this.f85419c);
        sb2.append(", pinImage=");
        sb2.append(this.f85420d);
        sb2.append(", str=");
        return androidx.appcompat.app.r.x(sb2, this.f85421e, ')');
    }

    public /* synthetic */ c(String str, String str2, List list, UniversalImage universalImage, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, list, (i12 & 8) != 0 ? null : universalImage, (i12 & 16) != 0 ? false : z12);
    }
}
