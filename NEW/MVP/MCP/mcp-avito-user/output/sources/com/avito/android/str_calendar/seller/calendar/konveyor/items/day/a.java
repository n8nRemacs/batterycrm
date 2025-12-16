package com.avito.android.str_calendar.seller.calendar.konveyor.items.day;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.str_calendar.common.models.Position;
import j.InterfaceC42150f;
import j.InterfaceC42165v;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerCalendarDayItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/konveyor/items/day/a;", "LTV0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f287615b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Position f287616c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Position f287617d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f287618e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f287619f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f287620g;

    /* renamed from: h, reason: collision with root package name */
    public final int f287621h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Integer f287622i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Integer f287623j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Integer f287624k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final Integer f287625l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final Integer f287626m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Date f287627n;

    public a(long j12, @k Position position, @k Position position2, @k String str, @k String str2, boolean z12, @InterfaceC42150f int i12, @InterfaceC42150f @l Integer num, @InterfaceC42165v @l Integer num2, @InterfaceC42165v @l Integer num3, @InterfaceC42165v @l Integer num4, @InterfaceC42165v @l Integer num5, @k Date date) {
        this.f287615b = j12;
        this.f287616c = position;
        this.f287617d = position2;
        this.f287618e = str;
        this.f287619f = str2;
        this.f287620g = z12;
        this.f287621h = i12;
        this.f287622i = num;
        this.f287623j = num2;
        this.f287624k = num3;
        this.f287625l = num4;
        this.f287626m = num5;
        this.f287627n = date;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f287615b == aVar.f287615b && this.f287616c == aVar.f287616c && this.f287617d == aVar.f287617d && L.f(this.f287618e, aVar.f287618e) && L.f(this.f287619f, aVar.f287619f) && this.f287620g == aVar.f287620g && this.f287621h == aVar.f287621h && this.f287622i.equals(aVar.f287622i) && L.f(this.f287623j, aVar.f287623j) && L.f(this.f287624k, aVar.f287624k) && L.f(this.f287625l, aVar.f287625l) && L.f(this.f287626m, aVar.f287626m) && L.f(this.f287627n, aVar.f287627n);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF186614b() {
        return this.f287615b;
    }

    public final int hashCode() {
        int iHashCode = (this.f287622i.hashCode() + r.e(this.f287621h, r.i(H.d(H.d((this.f287617d.hashCode() + ((this.f287616c.hashCode() + (Long.hashCode(this.f287615b) * 31)) * 31)) * 31, 31, this.f287618e), 31, this.f287619f), 31, this.f287620g), 31)) * 31;
        Integer num = this.f287623j;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f287624k;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f287625l;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f287626m;
        return this.f287627n.hashCode() + ((iHashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrSellerCalendarDayItem(id=");
        sb2.append(this.f287615b);
        sb2.append(", primaryPosition=");
        sb2.append(this.f287616c);
        sb2.append(", secondaryPosition=");
        sb2.append(this.f287617d);
        sb2.append(", text=");
        sb2.append(this.f287618e);
        sb2.append(", nightPrice=");
        sb2.append(this.f287619f);
        sb2.append(", isClickListenerEnabled=");
        sb2.append(this.f287620g);
        sb2.append(", dayTextColor=");
        sb2.append(this.f287621h);
        sb2.append(", priceTextColor=");
        sb2.append(this.f287622i);
        sb2.append(", primaryBackground=");
        sb2.append(this.f287623j);
        sb2.append(", secondaryBackground=");
        sb2.append(this.f287624k);
        sb2.append(", dotBackground=");
        sb2.append(this.f287625l);
        sb2.append(", fireBackground=");
        sb2.append(this.f287626m);
        sb2.append(", date=");
        return com.avito.android.bxcontent.mvi.entity.f.n(sb2, this.f287627n, ')');
    }
}
