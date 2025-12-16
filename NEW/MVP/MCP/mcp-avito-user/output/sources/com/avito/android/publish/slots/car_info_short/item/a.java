package com.avito.android.publish.slots.car_info_short.item;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.car_info_short.CarImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CarInfoShortItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/car_info_short/item/a;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f243119b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f243120c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f243121d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<CarImage> f243122e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f243123f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Float f243124g;

    public a(@k String str, @l String str2, @l String str3, @l List<CarImage> list, @l String str4, @l Float f12) {
        this.f243119b = str;
        this.f243120c = str2;
        this.f243121d = str3;
        this.f243122e = list;
        this.f243123f = str4;
        this.f243124g = f12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f243119b, aVar.f243119b) && L.f(this.f243120c, aVar.f243120c) && L.f(this.f243121d, aVar.f243121d) && L.f(this.f243122e, aVar.f243122e) && L.f(this.f243123f, aVar.f243123f) && L.f(this.f243124g, aVar.f243124g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return getF242922b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF242922b() {
        return this.f243119b;
    }

    public final int hashCode() {
        int iHashCode = this.f243119b.hashCode() * 31;
        String str = this.f243120c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f243121d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<CarImage> list = this.f243122e;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f243123f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f12 = this.f243124g;
        return iHashCode5 + (f12 != null ? f12.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CarInfoShortItem(stringId=");
        sb2.append(this.f243119b);
        sb2.append(", title=");
        sb2.append(this.f243120c);
        sb2.append(", shortTitle=");
        sb2.append(this.f243121d);
        sb2.append(", images=");
        sb2.append(this.f243122e);
        sb2.append(", progressText=");
        sb2.append(this.f243123f);
        sb2.append(", progressValue=");
        return org.webrtc.h.d(sb2, this.f243124g, ')');
    }
}
