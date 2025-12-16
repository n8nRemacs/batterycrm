package FZ;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import lj.InterfaceC43779a;

/* compiled from: ModelCardComponentsForms.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFZ/b;", "", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC43779a f4775a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC43779a f4776b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC43779a f4777c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC43779a f4778d;

    public b(@k InterfaceC43779a interfaceC43779a, @k InterfaceC43779a interfaceC43779a2, @k InterfaceC43779a interfaceC43779a3, @k InterfaceC43779a interfaceC43779a4) {
        this.f4775a = interfaceC43779a;
        this.f4776b = interfaceC43779a2;
        this.f4777c = interfaceC43779a3;
        this.f4778d = interfaceC43779a4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f4775a, bVar.f4775a) && L.f(this.f4776b, bVar.f4776b) && L.f(this.f4777c, bVar.f4777c) && L.f(this.f4778d, bVar.f4778d);
    }

    public final int hashCode() {
        return this.f4778d.hashCode() + ((this.f4777c.hashCode() + ((this.f4776b.hashCode() + (this.f4775a.hashCode() * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "ModelCardComponentsForms(navBarRight=" + this.f4775a + ", navBarMain=" + this.f4776b + ", main=" + this.f4777c + ", bottom=" + this.f4778d + ')';
    }
}
