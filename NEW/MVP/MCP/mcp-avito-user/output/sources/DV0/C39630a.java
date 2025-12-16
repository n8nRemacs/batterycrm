package dV0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientEventBusEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdV0/a;", "", "client-event-bus_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dV0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C39630a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f393895a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f393896b;

    public C39630a(@k String str, @l String str2) {
        this.f393895a = str;
        this.f393896b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39630a)) {
            return false;
        }
        C39630a c39630a = (C39630a) obj;
        return L.f(this.f393895a, c39630a.f393895a) && L.f(this.f393896b, c39630a.f393896b);
    }

    public final int hashCode() {
        int iHashCode = this.f393895a.hashCode() * 31;
        String str = this.f393896b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientEventBusEvent(type=");
        sb2.append(this.f393895a);
        sb2.append(", subType=");
        return C22026a.c(sb2, this.f393896b, ')');
    }
}
