package Hb1;

import gc1.C40657a;
import gc1.InterfaceC40658b;
import kotlin.G0;

/* loaded from: classes9.dex */
public final class a0 extends kotlin.jvm.internal.N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f7426l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(Y41.p pVar) {
        super(2);
        this.f7426l = (kotlin.jvm.internal.N) pVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        C40657a c40657a = (C40657a) obj2;
        this.f7426l.invoke((InterfaceC40658b) obj, c40657a != null ? C40657a.a(c40657a, Boolean.FALSE) : null);
        return G0.f406611a;
    }
}
