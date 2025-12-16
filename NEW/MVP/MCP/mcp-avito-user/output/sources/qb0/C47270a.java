package qB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureLandingState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqB0/a;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qB0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C47270a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Float f429082a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C47271b f429083b;

    public C47270a(@l Float f12, @l C47271b c47271b) {
        this.f429082a = f12;
        this.f429083b = c47271b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47270a)) {
            return false;
        }
        C47270a c47270a = (C47270a) obj;
        return L.f(this.f429082a, c47270a.f429082a) && L.f(this.f429083b, c47270a.f429083b);
    }

    public final int hashCode() {
        Float f12 = this.f429082a;
        int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
        C47271b c47271b = this.f429083b;
        return iHashCode + (c47271b != null ? c47271b.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AppBar(progress=" + this.f429082a + ", button=" + this.f429083b + ')';
    }
}
