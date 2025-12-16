package com.avito.android.code_check_public;

import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Scenario.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/d;", "", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f119285a;

    public d(@Y61.k a aVar) {
        this.f119285a = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f119285a, ((d) obj).f119285a);
    }

    public final int hashCode() {
        return this.f119285a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "Scenario(startNavigation=" + this.f119285a + ')';
    }
}
