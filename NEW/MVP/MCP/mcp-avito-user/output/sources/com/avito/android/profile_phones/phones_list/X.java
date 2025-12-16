package com.avito.android.profile_phones.phones_list;

import kotlin.Metadata;

/* compiled from: IacTimeIntervalPicker.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/X;", "", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class X {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final org.threeten.bp.g f227426a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final org.threeten.bp.g f227427b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final org.threeten.bp.g f227428c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final org.threeten.bp.g f227429d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final org.threeten.bp.g f227430e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f227431f;

    public X(@Y61.k org.threeten.bp.g gVar, @Y61.k org.threeten.bp.g gVar2, @Y61.k org.threeten.bp.g gVar3, @Y61.k org.threeten.bp.g gVar4, @Y61.k org.threeten.bp.g gVar5, boolean z12) {
        this.f227426a = gVar;
        this.f227427b = gVar2;
        this.f227428c = gVar3;
        this.f227429d = gVar4;
        this.f227430e = gVar5;
        this.f227431f = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x12 = (X) obj;
        return kotlin.jvm.internal.L.f(this.f227426a, x12.f227426a) && kotlin.jvm.internal.L.f(this.f227427b, x12.f227427b) && kotlin.jvm.internal.L.f(this.f227428c, x12.f227428c) && kotlin.jvm.internal.L.f(this.f227429d, x12.f227429d) && kotlin.jvm.internal.L.f(this.f227430e, x12.f227430e) && this.f227431f == x12.f227431f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227431f) + ((this.f227430e.hashCode() + ((this.f227429d.hashCode() + ((this.f227428c.hashCode() + ((this.f227427b.hashCode() + (this.f227426a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimeIntervalPickerData(startTime=");
        sb2.append(this.f227426a);
        sb2.append(", endTime=");
        sb2.append(this.f227427b);
        sb2.append(", anyTime=");
        sb2.append(this.f227428c);
        sb2.append(", defaultStartTime=");
        sb2.append(this.f227429d);
        sb2.append(", defaultEndTime=");
        sb2.append(this.f227430e);
        sb2.append(", isEmpty=");
        return androidx.appcompat.app.r.x(sb2, this.f227431f, ')');
    }
}
