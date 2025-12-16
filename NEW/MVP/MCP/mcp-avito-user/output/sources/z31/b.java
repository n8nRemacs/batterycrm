package z31;

import java.util.Iterator;
import kotlin.G0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import sc1.d;

/* loaded from: classes8.dex */
public final class b extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f443829l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f443830m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, d dVar) {
        super(0);
        this.f443829l = cVar;
        this.f443830m = dVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        c cVar = this.f443829l;
        if (!L.f(cVar.f443831a, "")) {
            this.f443830m.getClass();
            G0 g02 = G0.f406611a;
            Iterator it = cVar.f443832b.values().iterator();
            while (it.hasNext()) {
                ((Y41.a) it.next()).invoke();
            }
        }
        return G0.f406611a;
    }
}
