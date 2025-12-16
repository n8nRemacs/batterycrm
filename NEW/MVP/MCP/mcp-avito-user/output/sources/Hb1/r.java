package Hb1;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;

/* loaded from: classes9.dex */
public final class r extends kotlin.jvm.internal.N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f7521l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f7522m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f7523n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f7524o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f7525p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(androidx.compose.ui.v vVar, long j12, float f12, Y41.a aVar, int i12) {
        super(2);
        this.f7521l = vVar;
        this.f7522m = j12;
        this.f7523n = f12;
        this.f7524o = (kotlin.jvm.internal.N) aVar;
        this.f7525p = i12;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f7525p | 1);
        ?? r42 = this.f7524o;
        AbstractC13969u.a(this.f7521l, this.f7522m, this.f7523n, r42, (androidx.compose.runtime.A) obj, iA2);
        return G0.f406611a;
    }
}
