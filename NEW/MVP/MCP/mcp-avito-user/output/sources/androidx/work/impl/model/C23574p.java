package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.InterfaceC23472t;
import kotlin.Metadata;

/* compiled from: SystemIdInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/p;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@androidx.room.J
/* renamed from: androidx.work.impl.model.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C23574p {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @InterfaceC23472t
    @Y61.k
    public final String f55876a;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC23472t
    public final int f55877b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @InterfaceC23472t
    public final int f55878c;

    public C23574p(@Y61.k String str, int i12, int i13) {
        this.f55876a = str;
        this.f55877b = i12;
        this.f55878c = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23574p)) {
            return false;
        }
        C23574p c23574p = (C23574p) obj;
        return kotlin.jvm.internal.L.f(this.f55876a, c23574p.f55876a) && this.f55877b == c23574p.f55877b && this.f55878c == c23574p.f55878c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55878c) + androidx.appcompat.app.r.e(this.f55877b, this.f55876a.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f55876a);
        sb2.append(", generation=");
        sb2.append(this.f55877b);
        sb2.append(", systemId=");
        return androidx.appcompat.app.r.t(sb2, this.f55878c, ')');
    }
}
