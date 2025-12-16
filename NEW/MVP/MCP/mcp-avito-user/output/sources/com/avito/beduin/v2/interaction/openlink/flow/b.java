package com.avito.beduin.v2.interaction.openlink.flow;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.interaction.launch.flow.i;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OpenWebLinkInteraction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/openlink/flow/b;", "LdU0/b;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f337705a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f337706b;

    public b(@k String str, @k i iVar) {
        this.f337705a = str;
        this.f337706b = iVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f337705a, bVar.f337705a) && L.f(this.f337706b, bVar.f337706b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f337706b.f337466a) + (this.f337705a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "OpenWebLinkInteraction(url=" + this.f337705a + ", params=" + this.f337706b + ')';
    }
}
