package O91;

import B91.t;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class g extends N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f12044l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t tVar) {
        super(2);
        this.f12044l = tVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        t tVar = this.f12044l;
        H91.g.a(0, H91.c.a(12) + iIntValue2, 7, tVar.f1168b);
        H91.g.a(iIntValue, 0, 13, tVar.f1173g);
        return G0.f406611a;
    }
}
