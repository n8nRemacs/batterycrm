package com.avito.android.gig_shift_cancel.mvi;

import androidx.compose.foundation.H;
import com.avito.android.gig.shift_cancel_impl.generated.api.cancel_info_v_1.ActionV2;
import com.avito.android.gig.shift_cancel_impl.generated.api.cancel_info_v_1.Reason;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigShiftCancelState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_cancel/mvi/r;", "", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final ActionV2.ActionName f160677a;

    /* renamed from: b, reason: collision with root package name */
    public final long f160678b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f160679c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f160680d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f160681e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f160682f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f160683g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f160684h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f160685i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final List<Reason> f160686j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Reason f160687k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Date f160688l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final Date f160689m;

    public r(@Y61.l ActionV2.ActionName actionName, long j12, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.l String str5, @Y61.k String str6, @Y61.l String str7, @Y61.l List<Reason> list, @Y61.l Reason reason, @Y61.l Date date, @Y61.l Date date2) {
        this.f160677a = actionName;
        this.f160678b = j12;
        this.f160679c = str;
        this.f160680d = str2;
        this.f160681e = str3;
        this.f160682f = str4;
        this.f160683g = str5;
        this.f160684h = str6;
        this.f160685i = str7;
        this.f160686j = list;
        this.f160687k = reason;
        this.f160688l = date;
        this.f160689m = date2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f160677a == rVar.f160677a && this.f160678b == rVar.f160678b && L.f(this.f160679c, rVar.f160679c) && L.f(this.f160680d, rVar.f160680d) && L.f(this.f160681e, rVar.f160681e) && L.f(this.f160682f, rVar.f160682f) && L.f(this.f160683g, rVar.f160683g) && L.f(this.f160684h, rVar.f160684h) && L.f(this.f160685i, rVar.f160685i) && L.f(this.f160686j, rVar.f160686j) && L.f(this.f160687k, rVar.f160687k) && L.f(this.f160688l, rVar.f160688l) && L.f(this.f160689m, rVar.f160689m);
    }

    public final int hashCode() {
        ActionV2.ActionName actionName = this.f160677a;
        int iD2 = H.d(H.d(H.d(H.d(androidx.appcompat.app.r.g((actionName == null ? 0 : actionName.hashCode()) * 31, 31, this.f160678b), 31, this.f160679c), 31, this.f160680d), 31, this.f160681e), 31, this.f160682f);
        String str = this.f160683g;
        int iD3 = H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f160684h);
        String str2 = this.f160685i;
        int iHashCode = (iD3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Reason> list = this.f160686j;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Reason reason = this.f160687k;
        int iHashCode3 = (iHashCode2 + (reason == null ? 0 : reason.hashCode())) * 31;
        Date date = this.f160688l;
        int iHashCode4 = (iHashCode3 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f160689m;
        return iHashCode4 + (date2 != null ? date2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigShiftCancelItemState(action=");
        sb2.append(this.f160677a);
        sb2.append(", slotId=");
        sb2.append(this.f160678b);
        sb2.append(", title=");
        sb2.append(this.f160679c);
        sb2.append(", time=");
        sb2.append(this.f160680d);
        sb2.append(", sellerName=");
        sb2.append(this.f160681e);
        sb2.append(", address=");
        sb2.append(this.f160682f);
        sb2.append(", logoUrl=");
        sb2.append(this.f160683g);
        sb2.append(", buttonText=");
        sb2.append(this.f160684h);
        sb2.append(", secret=");
        sb2.append(this.f160685i);
        sb2.append(", reasons=");
        sb2.append(this.f160686j);
        sb2.append(", selectedReason=");
        sb2.append(this.f160687k);
        sb2.append(", startTime=");
        sb2.append(this.f160688l);
        sb2.append(", endTime=");
        return com.avito.android.bxcontent.mvi.entity.f.n(sb2, this.f160689m, ')');
    }
}
