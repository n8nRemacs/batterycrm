package p31;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class q extends N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f428184l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f428185m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(int i12, Y41.a aVar) {
        super(2);
        this.f428184l = (N) aVar;
        this.f428185m = i12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f428185m | 1);
        r.a(this.f428184l, (A) obj, iA2);
        return G0.f406611a;
    }
}
