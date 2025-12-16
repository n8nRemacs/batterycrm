package defpackage;

import java.net.UnknownHostException;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public final /* synthetic */ class yj7 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yj7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new UnknownHostException(wy1.h("No IPv4 address found for ", (String) this.b));
            case 1:
                return new UnknownHostException(wy1.h("No IPv6 address found for ", (String) this.b));
            case 2:
                return new UnknownHostException(wy1.h("No address found for ", (String) this.b));
            case 3:
                return new UnknownHostException(wy1.h("No address found for ", (String) this.b));
            default:
                r4c r4cVar = ((hhb) this.b).b;
                r4cVar.getClass();
                return new kb8(r4cVar.e, r4cVar.f, r4cVar.g, r4cVar.d, r4cVar.c);
        }
    }
}
