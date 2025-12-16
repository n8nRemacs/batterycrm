package Hb1;

import androidx.compose.runtime.C22066f2;
import gc1.InterfaceC40658b;
import kotlin.G0;

/* loaded from: classes9.dex */
public final class O extends kotlin.jvm.internal.N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.o f7384l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f7385m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f7386n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f7387o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f7388p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public O(InterfaceC40658b.o oVar, androidx.compose.ui.v vVar, long j12, Y41.p pVar, int i12) {
        super(2);
        this.f7384l = oVar;
        this.f7385m = vVar;
        this.f7386n = j12;
        this.f7387o = (kotlin.jvm.internal.N) pVar;
        this.f7388p = i12;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f7388p | 1);
        InterfaceC40658b.o oVar = this.f7384l;
        ?? r42 = this.f7387o;
        e0.c(oVar, this.f7385m, this.f7386n, r42, (androidx.compose.runtime.A) obj, iA2);
        return G0.f406611a;
    }
}
