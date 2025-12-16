package Hb1;

import androidx.compose.runtime.C22066f2;
import gc1.InterfaceC40658b;
import kotlin.G0;

/* loaded from: classes9.dex */
public final class b0 extends kotlin.jvm.internal.N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.o f7428l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f7429m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f7430n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f7431o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f7432p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(InterfaceC40658b.o oVar, androidx.compose.ui.v vVar, long j12, Y41.p pVar, int i12) {
        super(2);
        this.f7428l = oVar;
        this.f7429m = vVar;
        this.f7430n = j12;
        this.f7431o = (kotlin.jvm.internal.N) pVar;
        this.f7432p = i12;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f7432p | 1);
        ?? r42 = this.f7431o;
        e0.a(this.f7428l, this.f7429m, this.f7430n, r42, (androidx.compose.runtime.A) obj, iA2);
        return G0.f406611a;
    }
}
