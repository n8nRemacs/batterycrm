package com.avito.beduin.v2.engine;

import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ScenarioFeatures.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/q;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Boolean f336898a;

    public q() {
        this(null, 1, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && L.f(this.f336898a, ((q) obj).f336898a);
    }

    public final int hashCode() {
        Boolean bool = this.f336898a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C0.g(new StringBuilder("GlobalPreferences(printSensitiveInfo="), this.f336898a, ')');
    }

    public q(Boolean bool, int i12, C42822w c42822w) {
        this.f336898a = (i12 & 1) != 0 ? null : bool;
    }
}
