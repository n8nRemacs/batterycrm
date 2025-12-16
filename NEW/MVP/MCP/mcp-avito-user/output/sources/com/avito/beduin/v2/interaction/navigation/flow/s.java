package com.avito.beduin.v2.interaction.navigation.flow;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: SetResultInteraction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/s;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final r[] f337542a;

    public s(@Y61.k r[] rVarArr) {
        this.f337542a = rVarArr;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f337542a, ((s) obj).f337542a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f337542a);
    }

    @Y61.k
    public final String toString() {
        return "ResultParams(data=" + Arrays.toString(this.f337542a) + ')';
    }
}
