package com.avito.android.extended_profile_map.bottom_sheet;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.remote.model.GeoReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileAddressBottomSheetData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_map/bottom_sheet/g;", "", "a", "b", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f151201a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f151202b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<GeoReference> f151203c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final b f151204d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<a> f151205e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f151206f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final DeeplinkAction f151207g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f151208h;

    /* compiled from: ExtendedProfileAddressBottomSheetData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_map/bottom_sheet/g$a;", "", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f151209a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<String> f151210b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f151211c;

        public a(@Y61.k String str, @Y61.k List<String> list, boolean z12) {
            this.f151209a = str;
            this.f151210b = list;
            this.f151211c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f151209a, aVar.f151209a) && L.f(this.f151210b, aVar.f151210b) && this.f151211c == aVar.f151211c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f151211c) + H.e(this.f151209a.hashCode() * 31, 31, this.f151210b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReadableDaySchedule(dayName=");
            sb2.append(this.f151209a);
            sb2.append(", periods=");
            sb2.append(this.f151210b);
            sb2.append(", isToday=");
            return r.x(sb2, this.f151211c, ')');
        }
    }

    /* compiled from: ExtendedProfileAddressBottomSheetData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_map/bottom_sheet/g$b;", "", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f151212a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f151213b;

        public b(boolean z12, @Y61.k String str) {
            this.f151212a = z12;
            this.f151213b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f151212a == bVar.f151212a && L.f(this.f151213b, bVar.f151213b);
        }

        public final int hashCode() {
            return this.f151213b.hashCode() + (Boolean.hashCode(this.f151212a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScheduleHeader(isOpen=");
            sb2.append(this.f151212a);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f151213b, ')');
        }
    }

    public g(@Y61.k String str, @l String str2, @l List<GeoReference> list, @l b bVar, @l List<a> list2, boolean z12, @Y61.k DeeplinkAction deeplinkAction, boolean z13) {
        this.f151201a = str;
        this.f151202b = str2;
        this.f151203c = list;
        this.f151204d = bVar;
        this.f151205e = list2;
        this.f151206f = z12;
        this.f151207g = deeplinkAction;
        this.f151208h = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f151201a, gVar.f151201a) && L.f(this.f151202b, gVar.f151202b) && L.f(this.f151203c, gVar.f151203c) && L.f(this.f151204d, gVar.f151204d) && L.f(this.f151205e, gVar.f151205e) && this.f151206f == gVar.f151206f && L.f(this.f151207g, gVar.f151207g) && this.f151208h == gVar.f151208h;
    }

    public final int hashCode() {
        int iHashCode = this.f151201a.hashCode() * 31;
        String str = this.f151202b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<GeoReference> list = this.f151203c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        b bVar = this.f151204d;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List<a> list2 = this.f151205e;
        return Boolean.hashCode(this.f151208h) + ((this.f151207g.hashCode() + r.i((iHashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31, 31, this.f151206f)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileAddressBottomSheetData(formattedAddress=");
        sb2.append(this.f151201a);
        sb2.append(", comment=");
        sb2.append(this.f151202b);
        sb2.append(", geoReferences=");
        sb2.append(this.f151203c);
        sb2.append(", scheduleHeader=");
        sb2.append(this.f151204d);
        sb2.append(", schedule=");
        sb2.append(this.f151205e);
        sb2.append(", showPhoneButton=");
        sb2.append(this.f151206f);
        sb2.append(", phoneButtonAction=");
        sb2.append(this.f151207g);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f151208h, ')');
    }

    public /* synthetic */ g(String str, String str2, List list, b bVar, List list2, boolean z12, DeeplinkAction deeplinkAction, boolean z13, int i12, C42822w c42822w) {
        this(str, str2, list, bVar, list2, z12, deeplinkAction, (i12 & 128) != 0 ? false : z13);
    }
}
