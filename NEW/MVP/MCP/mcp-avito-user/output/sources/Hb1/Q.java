package Hb1;

import androidx.compose.runtime.C22066f2;
import gc1.InterfaceC40658b;
import kotlin.G0;

/* loaded from: classes9.dex */
public final class Q extends kotlin.jvm.internal.N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.i f7392l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f7393m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f7394n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f7395o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f7396p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Q(InterfaceC40658b.i iVar, androidx.compose.ui.v vVar, long j12, Y41.p pVar, int i12) {
        super(2);
        this.f7392l = iVar;
        this.f7393m = vVar;
        this.f7394n = j12;
        this.f7395o = (kotlin.jvm.internal.N) pVar;
        this.f7396p = i12;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f7396p | 1);
        ?? r42 = this.f7395o;
        k0.b(this.f7392l, this.f7393m, this.f7394n, r42, (androidx.compose.runtime.A) obj, iA2);
        return G0.f406611a;
    }
}
