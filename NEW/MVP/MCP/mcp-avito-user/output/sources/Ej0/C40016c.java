package eJ0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsResultDomain.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeJ0/c;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eJ0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C40016c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC40015b f395108a;

    public C40016c(@k InterfaceC40015b interfaceC40015b) {
        this.f395108a = interfaceC40015b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40016c) && L.f(this.f395108a, ((C40016c) obj).f395108a);
    }

    public final int hashCode() {
        return this.f395108a.hashCode();
    }

    @k
    public final String toString() {
        return "UserAdvertsResultDomain(items=" + this.f395108a + ')';
    }
}
