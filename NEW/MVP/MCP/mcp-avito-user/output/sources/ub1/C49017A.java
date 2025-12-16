package ub1;

import kotlin.G0;
import kotlin.Z;
import kotlin.jvm.internal.N;
import ru.rustore.sdk.review.model.ReviewInfo;

/* renamed from: ub1.A, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49017A extends N implements Y41.l<ru.rustore.sdk.reactive.single.p<ReviewInfo>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E f440122l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49017A(E e12) {
        super(1);
        this.f440122l = e12;
    }

    @Override // Y41.l
    public final G0 invoke(ru.rustore.sdk.reactive.single.p<ReviewInfo> pVar) {
        Object bVar;
        ru.rustore.sdk.reactive.single.p<ReviewInfo> pVar2 = pVar;
        E e12 = this.f440122l;
        try {
            int i12 = Z.f406624c;
            E.a(e12.f440129a, new x(pVar2), new l(e12.f440129a, e12.f440130b, new y(pVar2), new z(pVar2)));
            bVar = G0.f406611a;
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        Throwable thB = Z.b(bVar);
        if (thB != null) {
            pVar2.a(thB);
        }
        return G0.f406611a;
    }
}
