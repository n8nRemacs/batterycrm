package io.ktor.http;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: HttpHeaderValueParser.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/O;", "", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f399881a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<P> f399882b;

    /* renamed from: c, reason: collision with root package name */
    public final double f399883c;

    public O(@Y61.k String str, @Y61.k List<P> list) {
        Double d12;
        Object next;
        String str2;
        Double dW02;
        this.f399881a = str;
        this.f399882b = list;
        Iterator<T> it = list.iterator();
        while (true) {
            d12 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.L.f(((P) next).f399891a, "q")) {
                    break;
                }
            }
        }
        P p12 = (P) next;
        double dDoubleValue = 1.0d;
        if (p12 != null && (str2 = p12.f399892b) != null && (dW02 = C43066x.w0(str2)) != null) {
            double dDoubleValue2 = dW02.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                d12 = dW02;
            }
            if (d12 != null) {
                dDoubleValue = d12.doubleValue();
            }
        }
        this.f399883c = dDoubleValue;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o12 = (O) obj;
        return kotlin.jvm.internal.L.f(this.f399881a, o12.f399881a) && kotlin.jvm.internal.L.f(this.f399882b, o12.f399882b);
    }

    public final int hashCode() {
        return this.f399882b.hashCode() + (this.f399881a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderValue(value=");
        sb2.append(this.f399881a);
        sb2.append(", params=");
        return androidx.compose.foundation.H.p(sb2, this.f399882b, ')');
    }

    public O(String str, List list, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? C42784z0.f406748b : list);
    }
}
