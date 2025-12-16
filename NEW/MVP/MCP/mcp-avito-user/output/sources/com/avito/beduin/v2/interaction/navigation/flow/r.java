package com.avito.beduin.v2.interaction.navigation.flow;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SetResultInteraction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/r;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f337540a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f337541b;

    public r(@Y61.k String str, @Y61.k String str2) {
        this.f337540a = str;
        this.f337541b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return L.f(this.f337540a, rVar.f337540a) && L.f(this.f337541b, rVar.f337541b);
    }

    public final int hashCode() {
        return this.f337541b.hashCode() + (this.f337540a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultEntry(key=");
        sb2.append(this.f337540a);
        sb2.append(", value=");
        return C22026a.c(sb2, this.f337541b, ')');
    }
}
