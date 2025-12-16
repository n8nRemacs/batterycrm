package com.avito.beduin.v2.interaction.launch.flow;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LaunchClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/launch/flow/i;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k[] f337466a;

    public i(@Y61.k k[] kVarArr) {
        this.f337466a = kVarArr;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && L.f(this.f337466a, ((i) obj).f337466a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f337466a);
    }

    @Y61.k
    public final String toString() {
        return "LaunchParams(data=" + Arrays.toString(this.f337466a) + ')';
    }
}
