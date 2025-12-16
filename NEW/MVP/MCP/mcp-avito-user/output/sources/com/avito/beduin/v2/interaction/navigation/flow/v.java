package com.avito.beduin.v2.interaction.navigation.flow;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SetResultInteraction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/v;", "LdU0/b;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class v implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ResultStatus f337553a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final s f337554b;

    public v(@Y61.k ResultStatus resultStatus, @Y61.k s sVar) {
        this.f337553a = resultStatus;
        this.f337554b = sVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f337553a == vVar.f337553a && L.f(this.f337554b, vVar.f337554b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f337554b.f337542a) + (this.f337553a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "SetResultInteraction(status=" + this.f337553a + ", params=" + this.f337554b + ')';
    }
}
