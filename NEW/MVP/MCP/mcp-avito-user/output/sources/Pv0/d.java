package pV0;

import Y61.k;
import com.avito.beduin.v2.engine.C36272i;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PersistentRepositoryClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpV0/d;", "LpV0/e;", "persistent_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final oV0.d<String, String> f428551a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C47009c f428552b;

    public d(@k PU0.b bVar, @k oV0.d<String, String> dVar) {
        this.f428551a = dVar;
        this.f428552b = new C47009c(bVar);
    }

    @Override // pV0.InterfaceC47007a
    public final com.avito.beduin.v2.engine.field.d a(C36272i c36272i, String str) {
        String strB = this.f428551a.b(str);
        if (strB == null) {
            return null;
        }
        C47009c c47009c = this.f428552b;
        c47009c.getClass();
        return c47009c.f428550b.a(c36272i, strB);
    }

    @Override // pV0.InterfaceC47007a
    public final void b(String str) {
        this.f428551a.a(str);
    }

    @Override // pV0.InterfaceC47007a
    public final void c(com.avito.beduin.v2.engine.field.d dVar, String str) {
        G0 g02;
        oV0.d<String, String> dVar2 = this.f428551a;
        if (dVar != null) {
            dVar2.c(this.f428552b.f428549a.a(dVar), str);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            dVar2.a(str);
        }
    }
}
