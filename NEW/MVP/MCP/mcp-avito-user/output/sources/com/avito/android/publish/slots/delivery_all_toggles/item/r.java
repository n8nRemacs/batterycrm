package com.avito.android.publish.slots.delivery_all_toggles.item;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryAllTogglesSlotItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/delivery_all_toggles/item/r;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class r implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f243529b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final UniversalImage f243530c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f243531d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<s> f243532e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final a f243533f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f243534g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f243535h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f243536i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f243537j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f243538k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Y41.p<String, Boolean, G0> f243539l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final List<String> f243540m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, Boolean> f243541n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final String f243542o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final String f243543p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final String f243544q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final String f243545r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f243546s;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@Y61.k String str, @Y61.k UniversalImage universalImage, @Y61.l String str2, @Y61.l List<s> list, @Y61.l a aVar, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, boolean z12, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.p<? super String, ? super Boolean, G0> pVar, @Y61.k List<String> list2, @Y61.k Y41.l<? super String, Boolean> lVar, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9, boolean z13) {
        this.f243529b = str;
        this.f243530c = universalImage;
        this.f243531d = str2;
        this.f243532e = list;
        this.f243533f = aVar;
        this.f243534g = str3;
        this.f243535h = str4;
        this.f243536i = str5;
        this.f243537j = z12;
        this.f243538k = aVar2;
        this.f243539l = pVar;
        this.f243540m = list2;
        this.f243541n = lVar;
        this.f243542o = str6;
        this.f243543p = str7;
        this.f243544q = str8;
        this.f243545r = str9;
        this.f243546s = z13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return L.f(this.f243529b, rVar.f243529b) && L.f(this.f243530c, rVar.f243530c) && L.f(this.f243531d, rVar.f243531d) && L.f(this.f243532e, rVar.f243532e) && L.f(this.f243533f, rVar.f243533f) && L.f(this.f243534g, rVar.f243534g) && L.f(this.f243535h, rVar.f243535h) && L.f(this.f243536i, rVar.f243536i) && this.f243537j == rVar.f243537j && L.f(this.f243538k, rVar.f243538k) && L.f(this.f243539l, rVar.f243539l) && L.f(this.f243540m, rVar.f243540m) && L.f(this.f243541n, rVar.f243541n) && L.f(this.f243542o, rVar.f243542o) && L.f(this.f243543p, rVar.f243543p) && L.f(this.f243544q, rVar.f243544q) && L.f(this.f243545r, rVar.f243545r) && this.f243546s == rVar.f243546s;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80368b() {
        return getF173917b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF173917b() {
        return this.f243529b;
    }

    public final int hashCode() {
        int iA2 = com.avito.android.actions_sheet.a.a(this.f243529b.hashCode() * 31, 31, this.f243530c);
        String str = this.f243531d;
        int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        List<s> list = this.f243532e;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        a aVar = this.f243533f;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.f243534g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f243535h;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f243536i;
        int iHashCode6 = (this.f243541n.hashCode() + H.e((this.f243539l.hashCode() + androidx.appcompat.app.r.h(androidx.appcompat.app.r.i((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f243537j), 31, this.f243538k)) * 31, 31, this.f243540m)) * 31;
        String str5 = this.f243542o;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f243543p;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f243544q;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f243545r;
        return Boolean.hashCode(this.f243546s) + ((iHashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryAllTogglesSlotItem(stringId=");
        sb2.append(this.f243529b);
        sb2.append(", bannerImage=");
        sb2.append(this.f243530c);
        sb2.append(", featuresLabel=");
        sb2.append(this.f243531d);
        sb2.append(", featuresList=");
        sb2.append(this.f243532e);
        sb2.append(", bottomSheetData=");
        sb2.append(this.f243533f);
        sb2.append(", primaryButtonDisabledLabel=");
        sb2.append(this.f243534g);
        sb2.append(", primaryButtonEnabledLabel=");
        sb2.append(this.f243535h);
        sb2.append(", secondaryButtonLabel=");
        sb2.append(this.f243536i);
        sb2.append(", isAnyDeliveryEnabled=");
        sb2.append(this.f243537j);
        sb2.append(", goToNextStep=");
        sb2.append(this.f243538k);
        sb2.append(", saveSlotParameter=");
        sb2.append(this.f243539l);
        sb2.append(", availableDeliveryToggles=");
        sb2.append(this.f243540m);
        sb2.append(", getSlotParameterValue=");
        sb2.append(this.f243541n);
        sb2.append(", descriptionText=");
        sb2.append(this.f243542o);
        sb2.append(", descriptionLabel=");
        sb2.append(this.f243543p);
        sb2.append(", moreLinkLabel=");
        sb2.append(this.f243544q);
        sb2.append(", moreLinkUrl=");
        sb2.append(this.f243545r);
        sb2.append(", isOneButtonSpecificEnabled=");
        return androidx.appcompat.app.r.x(sb2, this.f243546s, ')');
    }

    public /* synthetic */ r(String str, UniversalImage universalImage, String str2, List list, a aVar, String str3, String str4, String str5, boolean z12, Y41.a aVar2, Y41.p pVar, List list2, Y41.l lVar, String str6, String str7, String str8, String str9, boolean z13, int i12, C42822w c42822w) {
        this(str, universalImage, str2, list, aVar, str3, str4, str5, z12, aVar2, pVar, list2, lVar, str6, str7, str8, str9, (i12 & 131072) != 0 ? true : z13);
    }
}
