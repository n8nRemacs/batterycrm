package com.avito.beduin.v2.interaction.copy.flow;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CopyInteraction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/copy/flow/b;", "LdU0/b;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f337270a;

    public b(@k String str) {
        this.f337270a = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && L.f(this.f337270a, ((b) obj).f337270a);
    }

    public final int hashCode() {
        return this.f337270a.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("CopyInteraction(value="), this.f337270a, ')');
    }
}
