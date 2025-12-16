package Hb1;

import gc1.C40657a;
import gc1.InterfaceC40658b;
import kotlin.G0;

/* loaded from: classes9.dex */
public final class P extends kotlin.jvm.internal.N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.p f7389l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.c f7390m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C40657a f7391n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Y41.p pVar, InterfaceC40658b.c cVar, C40657a c40657a) {
        super(0);
        this.f7389l = pVar;
        this.f7390m = cVar;
        this.f7391n = c40657a;
    }

    @Override // Y41.a
    public final Object invoke() {
        Y41.p pVar = this.f7389l;
        if (pVar != null) {
            pVar.invoke(this.f7390m, this.f7391n);
        }
        return G0.f406611a;
    }
}
