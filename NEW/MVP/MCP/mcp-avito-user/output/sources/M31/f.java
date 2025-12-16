package m31;

import kotlin.G0;
import kotlin.jvm.internal.N;
import y2.C50040a;

/* loaded from: classes8.dex */
public final class f extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C50040a f414290l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Ub1.b f414291m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C50040a c50040a, Ub1.b bVar) {
        super(0);
        this.f414290l = c50040a;
        this.f414291m = bVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        C50040a c50040a = this.f414290l;
        if (c50040a.f442860b) {
            c50040a.f442860b = false;
            this.f414291m.getContext().getApplicationContext().unbindService(c50040a);
        }
        return G0.f406611a;
    }
}
