package X91;

import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class l extends N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B91.p f18740l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(B91.p pVar) {
        super(2);
        this.f18740l = pVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        B91.p pVar = this.f18740l;
        H91.g.a(0, iIntValue2, 7, pVar.f1157e);
        H91.g.a(iIntValue, 0, 13, pVar.f1158f);
        H91.g.a(iIntValue, 0, 13, pVar.f1156d);
        return G0.f406611a;
    }
}
