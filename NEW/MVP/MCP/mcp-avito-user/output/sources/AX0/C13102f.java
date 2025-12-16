package Ax0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigStatusDocState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAx0/f;", "", "_avito_gig_status-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ax0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C13102f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f732a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f733b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C13097a f734c;

    public C13102f(@k String str, @k String str2, @l C13097a c13097a) {
        this.f732a = str;
        this.f733b = str2;
        this.f734c = c13097a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13102f)) {
            return false;
        }
        C13102f c13102f = (C13102f) obj;
        return L.f(this.f732a, c13102f.f732a) && L.f(this.f733b, c13102f.f733b) && L.f(this.f734c, c13102f.f734c);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f732a.hashCode() * 31, 31, this.f733b);
        C13097a c13097a = this.f734c;
        return iD2 + (c13097a == null ? 0 : c13097a.hashCode());
    }

    @k
    public final String toString() {
        return "Info(title=" + this.f732a + ", description=" + this.f733b + ", button=" + this.f734c + ')';
    }
}
