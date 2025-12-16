package com.avito.beduin.v2.interaction.navigation.flow;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CloseInteraction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/f;", "LdU0/b;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class f implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final ResultStatus f337524a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final s f337525b;

    public f(@Y61.l ResultStatus resultStatus, @Y61.l s sVar) {
        this.f337524a = resultStatus;
        this.f337525b = sVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f337524a == fVar.f337524a && L.f(this.f337525b, fVar.f337525b);
    }

    public final int hashCode() {
        ResultStatus resultStatus = this.f337524a;
        int iHashCode = (resultStatus == null ? 0 : resultStatus.hashCode()) * 31;
        s sVar = this.f337525b;
        return iHashCode + (sVar != null ? Arrays.hashCode(sVar.f337542a) : 0);
    }

    @Y61.k
    public final String toString() {
        return "CloseInteraction(status=" + this.f337524a + ", params=" + this.f337525b + ')';
    }
}
