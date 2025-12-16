package Eb1;

import B81.e;
import Mb1.b;
import Y41.l;
import kotlin.G0;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;

/* loaded from: classes9.dex */
public final class b extends N implements l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f4100l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Zb1.b f4101m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Zb1.b bVar) {
        super(1);
        this.f4100l = dVar;
        this.f4101m = bVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        Mb1.b bVar = (Mb1.b) obj;
        boolean z12 = bVar instanceof b.C0688b;
        Zb1.b bVar2 = this.f4101m;
        d dVar = this.f4100l;
        yc1.b bVar3 = dVar.f4106e;
        if (z12 || (bVar instanceof b.f)) {
            bVar3.a(bVar2, true);
        } else {
            ((e) dVar.f4109h).b(new lc1.d("", null, bVar2.f20272c, null));
            N0 n02 = dVar.f4110i;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            dVar.f4110i = bVar3.a(bVar2, false);
        }
        return G0.f406611a;
    }
}
