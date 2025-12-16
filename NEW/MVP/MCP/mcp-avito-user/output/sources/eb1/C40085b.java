package eb1;

import Y61.k;
import Y61.l;
import kotlin.jvm.internal.L;
import ob1.InterfaceC44751a;

/* renamed from: eb1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C40085b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Xa1.a f395250a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC44751a f395251b;

    public C40085b(@k Xa1.a aVar, @k InterfaceC44751a interfaceC44751a) {
        this.f395250a = aVar;
        this.f395251b = interfaceC44751a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40085b)) {
            return false;
        }
        C40085b c40085b = (C40085b) obj;
        return L.f(this.f395250a, c40085b.f395250a) && L.f(this.f395251b, c40085b.f395251b);
    }

    public final int hashCode() {
        return this.f395251b.hashCode() + (this.f395250a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "SubscribeIPCClientsDto(authIPCClient=" + this.f395250a + ", pushIPCClient=" + this.f395251b + ')';
    }
}
