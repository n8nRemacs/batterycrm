package com.avito.android.publish.items.int_range;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IntRangeItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/int_range/a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public Long f236959a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f236960b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f236961c;

    /* renamed from: d, reason: collision with root package name */
    public final int f236962d;

    /* renamed from: e, reason: collision with root package name */
    public final int f236963e;

    public a(@Y61.l Long l12, @Y61.l String str, @Y61.l String str2, int i12, int i13) {
        this.f236959a = l12;
        this.f236960b = str;
        this.f236961c = str2;
        this.f236962d = i12;
        this.f236963e = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f236959a, aVar.f236959a) && L.f(this.f236960b, aVar.f236960b) && L.f(this.f236961c, aVar.f236961c) && this.f236962d == aVar.f236962d && this.f236963e == aVar.f236963e;
    }

    public final int hashCode() {
        Long l12 = this.f236959a;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        String str = this.f236960b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f236961c;
        return Integer.hashCode(this.f236963e) + r.e(this.f236962d, (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRangeInput(value=");
        sb2.append(this.f236959a);
        sb2.append(", prefix=");
        sb2.append(this.f236960b);
        sb2.append(", hint=");
        sb2.append(this.f236961c);
        sb2.append(", maxValueLength=");
        sb2.append(this.f236962d);
        sb2.append(", autoResetBehaviour=");
        return r.t(sb2, this.f236963e, ')');
    }

    public /* synthetic */ a(Long l12, String str, String str2, int i12, int i13, int i14, C42822w c42822w) {
        this(l12, str, str2, (i14 & 8) != 0 ? 2 : i12, (i14 & 16) != 0 ? 1 : i13);
    }
}
