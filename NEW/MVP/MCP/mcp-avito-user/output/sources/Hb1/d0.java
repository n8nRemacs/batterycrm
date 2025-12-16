package Hb1;

import androidx.compose.runtime.C22066f2;
import java.util.List;
import kotlin.G0;

/* loaded from: classes9.dex */
public final class d0 extends kotlin.jvm.internal.N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f7441l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f7442m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f7443n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N f7444o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f7445p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7446q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(List list, androidx.compose.ui.v vVar, long j12, N n12, Y41.p pVar, int i12) {
        super(2);
        this.f7441l = list;
        this.f7442m = vVar;
        this.f7443n = j12;
        this.f7444o = n12;
        this.f7445p = (kotlin.jvm.internal.N) pVar;
        this.f7446q = i12;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f7446q | 1);
        N n12 = this.f7444o;
        ?? r52 = this.f7445p;
        k0.c(this.f7441l, this.f7442m, this.f7443n, n12, r52, (androidx.compose.runtime.A) obj, iA2);
        return G0.f406611a;
    }
}
