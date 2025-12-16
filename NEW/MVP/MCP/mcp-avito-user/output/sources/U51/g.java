package U51;

import Y41.l;
import io.ktor.client.plugins.C41448g;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class g extends N implements l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f16208l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(1);
        this.f16208l = hVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        io.ktor.client.d dVar = (io.ktor.client.d) obj;
        dVar.a(new c(this.f16208l));
        dVar.b(io.ktor.client.plugins.contentnegotiation.a.f399304c, e.f16206l);
        dVar.b(C41448g.f399427b, f.f16207l);
        return G0.f406611a;
    }
}
