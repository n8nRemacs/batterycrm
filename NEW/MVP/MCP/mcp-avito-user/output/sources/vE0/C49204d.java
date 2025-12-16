package vE0;

import Y61.k;
import Y61.l;
import androidx.media3.exoplayer.analytics.m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TimestampRange.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvE0/d;", "", "_avito_timestamp-storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vE0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C49204d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Long f440552a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f440553b;

    /* JADX WARN: Multi-variable type inference failed */
    public C49204d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49204d)) {
            return false;
        }
        C49204d c49204d = (C49204d) obj;
        return L.f(this.f440552a, c49204d.f440552a) && L.f(this.f440553b, c49204d.f440553b);
    }

    public final int hashCode() {
        Long l12 = this.f440552a;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        Long l13 = this.f440553b;
        return iHashCode + (l13 != null ? l13.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimestampRange(min=");
        sb2.append(this.f440552a);
        sb2.append(", max=");
        return m.m(sb2, this.f440553b, ')');
    }

    public C49204d(@l Long l12, @l Long l13) {
        this.f440552a = l12;
        this.f440553b = l13;
    }

    public /* synthetic */ C49204d(Long l12, Long l13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : l12, (i12 & 2) != 0 ? null : l13);
    }
}
