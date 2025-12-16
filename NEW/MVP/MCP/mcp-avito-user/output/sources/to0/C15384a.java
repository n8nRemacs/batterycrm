package To0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo0/a;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: To0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C15384a {

    /* renamed from: a, reason: collision with root package name */
    public final long f15866a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15867b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f15868c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Long f15869d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Long f15870e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f15871f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final f f15872g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ArrayList f15873h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final h f15874i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final i f15875j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final C15385b f15876k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final Boolean f15877l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f15878m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final ArrayList f15879n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final ArrayList f15880o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final Boolean f15881p;

    public C15384a(long j12, long j13, @k String str, @l Long l12, @l Long l13, @l String str2, @k f fVar, @k ArrayList arrayList, @l h hVar, @l i iVar, @l C15385b c15385b, @l Boolean bool, boolean z12, @l ArrayList arrayList2, @l ArrayList arrayList3, @l Boolean bool2) {
        this.f15866a = j12;
        this.f15867b = j13;
        this.f15868c = str;
        this.f15869d = l12;
        this.f15870e = l13;
        this.f15871f = str2;
        this.f15872g = fVar;
        this.f15873h = arrayList;
        this.f15874i = hVar;
        this.f15875j = iVar;
        this.f15876k = c15385b;
        this.f15877l = bool;
        this.f15878m = z12;
        this.f15879n = arrayList2;
        this.f15880o = arrayList3;
        this.f15881p = bool2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15384a)) {
            return false;
        }
        C15384a c15384a = (C15384a) obj;
        return this.f15866a == c15384a.f15866a && this.f15867b == c15384a.f15867b && L.f(this.f15868c, c15384a.f15868c) && this.f15869d.equals(c15384a.f15869d) && L.f(this.f15870e, c15384a.f15870e) && L.f(this.f15871f, c15384a.f15871f) && this.f15872g.equals(c15384a.f15872g) && this.f15873h.equals(c15384a.f15873h) && L.f(this.f15874i, c15384a.f15874i) && L.f(this.f15875j, c15384a.f15875j) && this.f15876k.equals(c15384a.f15876k) && L.f(this.f15877l, c15384a.f15877l) && this.f15878m == c15384a.f15878m && L.f(this.f15879n, c15384a.f15879n) && L.f(this.f15880o, c15384a.f15880o) && L.f(this.f15881p, c15384a.f15881p);
    }

    public final int hashCode() {
        int iHashCode = (this.f15869d.hashCode() + H.d(r.g(Long.hashCode(this.f15866a) * 31, 31, this.f15867b), 31, this.f15868c)) * 31;
        Long l12 = this.f15870e;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.f15871f;
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f15873h, (this.f15872g.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
        h hVar = this.f15874i;
        int iHashCode3 = (iG2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        i iVar = this.f15875j;
        int iHashCode4 = (this.f15876k.hashCode() + ((iHashCode3 + (iVar == null ? 0 : iVar.f15921a.hashCode())) * 31)) * 31;
        Boolean bool = this.f15877l;
        int i12 = r.i((iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f15878m);
        ArrayList arrayList = this.f15879n;
        int iHashCode5 = (i12 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.f15880o;
        int iHashCode6 = (iHashCode5 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        Boolean bool2 = this.f15881p;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateDiscountDispatchData(id=");
        sb2.append(this.f15866a);
        sb2.append(", availableAudienceCount=");
        sb2.append(this.f15867b);
        sb2.append(", previewMessage=");
        sb2.append(this.f15868c);
        sb2.append(", price=");
        sb2.append(this.f15869d);
        sb2.append(", pricePerRecipient=");
        sb2.append(this.f15870e);
        sb2.append(", status=");
        sb2.append(this.f15871f);
        sb2.append(", itemInfo=");
        sb2.append(this.f15872g);
        sb2.append(", offers=");
        sb2.append(this.f15873h);
        sb2.append(", tariff=");
        sb2.append(this.f15874i);
        sb2.append(", vas=");
        sb2.append(this.f15875j);
        sb2.append(", descriptions=");
        sb2.append(this.f15876k);
        sb2.append(", autoDispatchFeatureSupport=");
        sb2.append(this.f15877l);
        sb2.append(", autoDispatchEnabledByDefault=");
        sb2.append(this.f15878m);
        sb2.append(", fastChips=");
        sb2.append(this.f15879n);
        sb2.append(", forecastPresets=");
        sb2.append(this.f15880o);
        sb2.append(", forecastsForAutoDispatchFeatureSupported=");
        return C0.g(sb2, this.f15881p, ')');
    }
}
