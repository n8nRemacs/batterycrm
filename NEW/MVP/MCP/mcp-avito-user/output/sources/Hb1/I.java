package Hb1;

import gc1.C40657a;
import gc1.InterfaceC40658b;
import kotlin.G0;

/* loaded from: classes9.dex */
public final class I extends kotlin.jvm.internal.N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f7358l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.o f7359m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(Y41.p pVar, InterfaceC40658b.o oVar) {
        super(1);
        this.f7358l = (kotlin.jvm.internal.N) pVar;
        this.f7359m = oVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final Object invoke(Object obj) {
        C40657a c40657a = (C40657a) obj;
        ?? r02 = this.f7358l;
        if (r02 != 0) {
            r02.invoke(this.f7359m, c40657a);
        }
        return G0.f406611a;
    }
}
