package eb1;

import Y61.k;
import Y61.l;
import Za1.C;
import kotlin.jvm.internal.L;
import ob1.InterfaceC44751a;

/* renamed from: eb1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C40084a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Xa1.a f395247a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC44751a f395248b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C f395249c;

    public C40084a(@k Xa1.a aVar, @k InterfaceC44751a interfaceC44751a, @l C c12) {
        this.f395247a = aVar;
        this.f395248b = interfaceC44751a;
        this.f395249c = c12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40084a)) {
            return false;
        }
        C40084a c40084a = (C40084a) obj;
        return L.f(this.f395247a, c40084a.f395247a) && L.f(this.f395248b, c40084a.f395248b) && L.f(this.f395249c, c40084a.f395249c);
    }

    public final int hashCode() {
        int iHashCode = (this.f395248b.hashCode() + (this.f395247a.hashCode() * 31)) * 31;
        C c12 = this.f395249c;
        return iHashCode + (c12 == null ? 0 : c12.hashCode());
    }

    @k
    public final String toString() {
        return "IPCClientsDto(authIPCClient=" + this.f395247a + ", pushIPCClient=" + this.f395248b + ", testPushIPCClient=" + this.f395249c + ')';
    }
}
