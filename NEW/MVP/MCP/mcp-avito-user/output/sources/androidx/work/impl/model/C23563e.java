package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.InterfaceC23452i0;
import androidx.room.InterfaceC23472t;
import kotlin.Metadata;

/* compiled from: Preference.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/e;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@androidx.room.J
/* renamed from: androidx.work.impl.model.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C23563e {

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    @InterfaceC23452i0
    public final String f55852a;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final Long f55853b;

    public C23563e(@Y61.k String str, @Y61.l Long l12) {
        this.f55852a = str;
        this.f55853b = l12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23563e)) {
            return false;
        }
        C23563e c23563e = (C23563e) obj;
        return kotlin.jvm.internal.L.f(this.f55852a, c23563e.f55852a) && kotlin.jvm.internal.L.f(this.f55853b, c23563e.f55853b);
    }

    public final int hashCode() {
        int iHashCode = this.f55852a.hashCode() * 31;
        Long l12 = this.f55853b;
        return iHashCode + (l12 == null ? 0 : l12.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Preference(key=");
        sb2.append(this.f55852a);
        sb2.append(", value=");
        return androidx.media3.exoplayer.analytics.m.m(sb2, this.f55853b, ')');
    }
}
