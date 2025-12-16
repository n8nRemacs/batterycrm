package com.avito.android.gig_shift_action.mvi;

import androidx.compose.foundation.H;
import com.avito.android.gig.shift_action_impl.generated.api.qr_scan_v_2.ActionV2;
import com.avito.android.gig.shift_action_impl.generated.api.qr_scan_v_2.Reason;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigShiftActionState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/z;", "", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final ActionV2.ActionName f160536a;

    /* renamed from: b, reason: collision with root package name */
    public final long f160537b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f160538c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f160539d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f160540e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f160541f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f160542g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f160543h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f160544i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final List<Reason> f160545j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Reason f160546k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Date f160547l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final Date f160548m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f160549n;

    public z(@Y61.l ActionV2.ActionName actionName, long j12, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.l String str5, @Y61.k String str6, @Y61.l String str7, @Y61.l List<Reason> list, @Y61.l Reason reason, @Y61.l Date date, @Y61.l Date date2, boolean z12) {
        this.f160536a = actionName;
        this.f160537b = j12;
        this.f160538c = str;
        this.f160539d = str2;
        this.f160540e = str3;
        this.f160541f = str4;
        this.f160542g = str5;
        this.f160543h = str6;
        this.f160544i = str7;
        this.f160545j = list;
        this.f160546k = reason;
        this.f160547l = date;
        this.f160548m = date2;
        this.f160549n = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f160536a == zVar.f160536a && this.f160537b == zVar.f160537b && L.f(this.f160538c, zVar.f160538c) && L.f(this.f160539d, zVar.f160539d) && L.f(this.f160540e, zVar.f160540e) && L.f(this.f160541f, zVar.f160541f) && L.f(this.f160542g, zVar.f160542g) && L.f(this.f160543h, zVar.f160543h) && L.f(this.f160544i, zVar.f160544i) && L.f(this.f160545j, zVar.f160545j) && L.f(this.f160546k, zVar.f160546k) && L.f(this.f160547l, zVar.f160547l) && L.f(this.f160548m, zVar.f160548m) && this.f160549n == zVar.f160549n;
    }

    public final int hashCode() {
        ActionV2.ActionName actionName = this.f160536a;
        int iD2 = H.d(H.d(H.d(H.d(androidx.appcompat.app.r.g((actionName == null ? 0 : actionName.hashCode()) * 31, 31, this.f160537b), 31, this.f160538c), 31, this.f160539d), 31, this.f160540e), 31, this.f160541f);
        String str = this.f160542g;
        int iD3 = H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f160543h);
        String str2 = this.f160544i;
        int iHashCode = (iD3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Reason> list = this.f160545j;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Reason reason = this.f160546k;
        int iHashCode3 = (iHashCode2 + (reason == null ? 0 : reason.hashCode())) * 31;
        Date date = this.f160547l;
        int iHashCode4 = (iHashCode3 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f160548m;
        return Boolean.hashCode(this.f160549n) + ((iHashCode4 + (date2 != null ? date2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigShiftItemState(action=");
        sb2.append(this.f160536a);
        sb2.append(", slotId=");
        sb2.append(this.f160537b);
        sb2.append(", title=");
        sb2.append(this.f160538c);
        sb2.append(", formattedTime=");
        sb2.append(this.f160539d);
        sb2.append(", sellerName=");
        sb2.append(this.f160540e);
        sb2.append(", address=");
        sb2.append(this.f160541f);
        sb2.append(", logoUrl=");
        sb2.append(this.f160542g);
        sb2.append(", buttonText=");
        sb2.append(this.f160543h);
        sb2.append(", secret=");
        sb2.append(this.f160544i);
        sb2.append(", reasons=");
        sb2.append(this.f160545j);
        sb2.append(", selectedReason=");
        sb2.append(this.f160546k);
        sb2.append(", startTime=");
        sb2.append(this.f160547l);
        sb2.append(", endTime=");
        sb2.append(this.f160548m);
        sb2.append(", isSlotStarted=");
        return androidx.appcompat.app.r.x(sb2, this.f160549n, ')');
    }

    public /* synthetic */ z(ActionV2.ActionName actionName, long j12, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, Reason reason, Date date, Date date2, boolean z12, int i12, C42822w c42822w) {
        this(actionName, j12, str, str2, str3, str4, str5, str6, str7, list, reason, date, date2, (i12 & 8192) != 0 ? false : z12);
    }
}
