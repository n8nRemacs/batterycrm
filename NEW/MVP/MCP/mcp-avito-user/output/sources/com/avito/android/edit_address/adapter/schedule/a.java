package com.avito.android.edit_address.adapter.schedule;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import dy.InterfaceC39826b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ScheduleItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_address/adapter/schedule/a;", "Ldy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements InterfaceC39826b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f145795b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f145796c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f145797d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f145798e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f145799f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f145800g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f145801h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f145802i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f145803j;

    public a(String str, String str2, boolean z12, boolean z13, String str3, String str4, String str5, boolean z14, boolean z15, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? "schedule_item" : str;
        z12 = (i12 & 4) != 0 ? true : z12;
        z13 = (i12 & 8) != 0 ? false : z13;
        str3 = (i12 & 16) != 0 ? null : str3;
        str4 = (i12 & 32) != 0 ? null : str4;
        str5 = (i12 & 64) != 0 ? null : str5;
        z14 = (i12 & 128) != 0 ? false : z14;
        z15 = (i12 & 256) != 0 ? false : z15;
        this.f145795b = str;
        this.f145796c = str2;
        this.f145797d = z12;
        this.f145798e = z13;
        this.f145799f = str3;
        this.f145800g = str4;
        this.f145801h = str5;
        this.f145802i = z14;
        this.f145803j = z15;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f145795b, aVar.f145795b) && L.f(this.f145796c, aVar.f145796c) && this.f145797d == aVar.f145797d && this.f145798e == aVar.f145798e && L.f(this.f145799f, aVar.f145799f) && L.f(this.f145800g, aVar.f145800g) && L.f(this.f145801h, aVar.f145801h) && this.f145802i == aVar.f145802i && this.f145803j == aVar.f145803j;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF273716c() {
        return this.f145795b;
    }

    public final int hashCode() {
        int i12 = r.i(r.i(H.d(this.f145795b.hashCode() * 31, 31, this.f145796c), 31, this.f145797d), 31, this.f145798e);
        String str = this.f145799f;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f145800g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f145801h;
        return Boolean.hashCode(this.f145803j) + r.i((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f145802i);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScheduleItem(stringId=");
        sb2.append(this.f145795b);
        sb2.append(", scheduleId=");
        sb2.append(this.f145796c);
        sb2.append(", showTitle=");
        sb2.append(this.f145797d);
        sb2.append(", showRemoveButton=");
        sb2.append(this.f145798e);
        sb2.append(", workDays=");
        sb2.append(this.f145799f);
        sb2.append(", workTime=");
        sb2.append(this.f145800g);
        sb2.append(", breakTime=");
        sb2.append(this.f145801h);
        sb2.append(", hasWorkDaysError=");
        sb2.append(this.f145802i);
        sb2.append(", hasWorkTimeError=");
        return r.x(sb2, this.f145803j, ')');
    }
}
