package uI;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Suggestion.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuI/c;", "", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uI.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C48902c {

    /* renamed from: a, reason: collision with root package name */
    public final double f439888a;

    /* renamed from: b, reason: collision with root package name */
    public final double f439889b;

    public C48902c(double d12, double d13) {
        this.f439888a = d12;
        this.f439889b = d13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48902c)) {
            return false;
        }
        C48902c c48902c = (C48902c) obj;
        return Double.compare(this.f439888a, c48902c.f439888a) == 0 && Double.compare(this.f439889b, c48902c.f439889b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f439889b) + (Double.hashCode(this.f439888a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestionCoordinates(latitude=");
        sb2.append(this.f439888a);
        sb2.append(", longitude=");
        return androidx.compose.ui.graphics.colorspace.e.o(sb2, this.f439889b, ')');
    }
}
