package io.ktor.http;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: HttpHeaderValueParser.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/P;", "", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class P {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f399891a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f399892b;

    public P(@Y61.k String str, @Y61.k String str2) {
        this.f399891a = str;
        this.f399892b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof P) {
            P p12 = (P) obj;
            if (C43066x.C(p12.f399891a, this.f399891a, true) && C43066x.C(p12.f399892b, this.f399892b, true)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        int iHashCode = this.f399891a.toLowerCase(locale).hashCode();
        return this.f399892b.toLowerCase(locale).hashCode() + (iHashCode * 31) + iHashCode;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderValueParam(name=");
        sb2.append(this.f399891a);
        sb2.append(", value=");
        return AK.c.s(sb2, this.f399892b, ", escapeValue=false)");
    }
}
