package androidx.compose.ui.platform;

import kotlin.Metadata;

/* compiled from: InspectableValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/s2;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.s2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C22524s2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f41598a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Object f41599b;

    public C22524s2(@Y61.k String str, @Y61.l Object obj) {
        this.f41598a = str;
        this.f41599b = obj;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22524s2)) {
            return false;
        }
        C22524s2 c22524s2 = (C22524s2) obj;
        return kotlin.jvm.internal.L.f(this.f41598a, c22524s2.f41598a) && kotlin.jvm.internal.L.f(this.f41599b, c22524s2.f41599b);
    }

    public final int hashCode() {
        int iHashCode = this.f41598a.hashCode() * 31;
        Object obj = this.f41599b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ValueElement(name=");
        sb2.append(this.f41598a);
        sb2.append(", value=");
        return androidx.compose.foundation.H.n(sb2, this.f41599b, ')');
    }
}
