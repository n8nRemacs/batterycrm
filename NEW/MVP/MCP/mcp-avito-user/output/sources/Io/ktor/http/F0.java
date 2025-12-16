package io.ktor.http;

import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: RangesSpecifier.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/F0;", "", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class F0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f399855a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<AbstractC41520g> f399856b;

    public F0() {
        throw null;
    }

    public F0(String str, List list, int i12, C42822w c42822w) {
        this.f399855a = (i12 & 1) != 0 ? "bytes" : str;
        this.f399856b = list;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("It should be at least one range");
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        return kotlin.jvm.internal.L.f(this.f399855a, f02.f399855a) && kotlin.jvm.internal.L.f(this.f399856b, f02.f399856b);
    }

    public final int hashCode() {
        return this.f399856b.hashCode() + (this.f399855a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return C42745f0.O(this.f399856b, ",", C22026a.c(new StringBuilder(), this.f399855a, '='), null, null, 60);
    }
}
