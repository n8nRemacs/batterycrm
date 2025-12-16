package T51;

import C81.d;
import C81.e;
import D31.g;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;

/* loaded from: classes8.dex */
public final class b extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f15376l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(0);
        this.f15376l = cVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        N0 n0D;
        e eVar = this.f15376l.f15378b;
        synchronized (eVar) {
            N0 n02 = eVar.f2010f;
            T t12 = (T) ((g) eVar.f2008d).f2880a.getValue();
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            n0D = C43259k.d(t12, null, null, new d(null, eVar), 3);
            eVar.f2010f = n0D;
            ((O51.d) eVar.f2006b).f12005b = n0D;
        }
        return n0D;
    }
}
