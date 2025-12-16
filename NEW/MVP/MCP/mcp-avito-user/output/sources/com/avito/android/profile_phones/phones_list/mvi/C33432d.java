package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.iac_incoming_call_ability.public_module.iac_enable.ScheduleOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: PhonesIacData.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/d;", "", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile_phones.phones_list.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C33432d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f227956a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<NL.b> f227957b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final org.threeten.bp.g f227958c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final org.threeten.bp.g f227959d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f227960e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<ScheduleOption> f227961f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f227962g;

    public C33432d(boolean z12, @Y61.k List<NL.b> list, @Y61.l org.threeten.bp.g gVar, @Y61.l org.threeten.bp.g gVar2, boolean z13, @Y61.k List<ScheduleOption> list2, boolean z14) {
        this.f227956a = z12;
        this.f227957b = list;
        this.f227958c = gVar;
        this.f227959d = gVar2;
        this.f227960e = z13;
        this.f227961f = list2;
        this.f227962g = z14;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33432d)) {
            return false;
        }
        C33432d c33432d = (C33432d) obj;
        return this.f227956a == c33432d.f227956a && kotlin.jvm.internal.L.f(this.f227957b, c33432d.f227957b) && kotlin.jvm.internal.L.f(this.f227958c, c33432d.f227958c) && kotlin.jvm.internal.L.f(this.f227959d, c33432d.f227959d) && this.f227960e == c33432d.f227960e && kotlin.jvm.internal.L.f(this.f227961f, c33432d.f227961f) && this.f227962g == c33432d.f227962g;
    }

    public final int hashCode() {
        int iE2 = androidx.compose.foundation.H.e(Boolean.hashCode(this.f227956a) * 31, 31, this.f227957b);
        org.threeten.bp.g gVar = this.f227958c;
        int iHashCode = (iE2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        org.threeten.bp.g gVar2 = this.f227959d;
        return Boolean.hashCode(this.f227962g) + androidx.compose.foundation.H.e(androidx.appcompat.app.r.i((iHashCode + (gVar2 != null ? gVar2.hashCode() : 0)) * 31, 31, this.f227960e), 31, this.f227961f);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhonesIacData(iacMandatory=");
        sb2.append(this.f227956a);
        sb2.append(", devices=");
        sb2.append(this.f227957b);
        sb2.append(", timePickerStart=");
        sb2.append(this.f227958c);
        sb2.append(", timePickerEnd=");
        sb2.append(this.f227959d);
        sb2.append(", iacEnabled=");
        sb2.append(this.f227960e);
        sb2.append(", scheduleOptions=");
        sb2.append(this.f227961f);
        sb2.append(", callTimeEnabled=");
        return androidx.appcompat.app.r.x(sb2, this.f227962g, ')');
    }

    public C33432d(boolean z12, List list, org.threeten.bp.g gVar, org.threeten.bp.g gVar2, boolean z13, List list2, boolean z14, int i12, C42822w c42822w) {
        this(z12, list, gVar, gVar2, z13, (i12 & 32) != 0 ? C42784z0.f406748b : list2, z14);
    }
}
