package Hb1;

import gc1.C40657a;
import gc1.InterfaceC40658b;
import kotlin.G0;

/* loaded from: classes9.dex */
public final class h0 extends kotlin.jvm.internal.N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.p f7470l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.e f7471m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C40657a f7472n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Y41.p pVar, InterfaceC40658b.e eVar, C40657a c40657a) {
        super(0);
        this.f7470l = pVar;
        this.f7471m = eVar;
        this.f7472n = c40657a;
    }

    @Override // Y41.a
    public final Object invoke() {
        Y41.p pVar = this.f7470l;
        if (pVar != null) {
            pVar.invoke(this.f7471m, this.f7472n);
        }
        return G0.f406611a;
    }
}
