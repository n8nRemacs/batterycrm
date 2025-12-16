package ub1;

import kotlin.G0;
import kotlin.Z;
import kotlin.jvm.internal.N;
import ru.rustore.sdk.review.model.ReviewInfo;

/* loaded from: classes9.dex */
public final class w extends N implements Y41.l<ru.rustore.sdk.reactive.single.p<G0>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E f440178l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ReviewInfo f440179m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(E e12, ReviewInfo reviewInfo) {
        super(1);
        this.f440178l = e12;
        this.f440179m = reviewInfo;
    }

    @Override // Y41.l
    public final G0 invoke(ru.rustore.sdk.reactive.single.p<G0> pVar) {
        Object bVar;
        ru.rustore.sdk.reactive.single.p<G0> pVar2 = pVar;
        E e12 = this.f440178l;
        ReviewInfo reviewInfo = this.f440179m;
        try {
            int i12 = Z.f406624c;
            E.a(e12.f440129a, new t(pVar2), new ServiceConnectionC49025g(e12.f440129a, reviewInfo, e12.f440130b, new u(pVar2), new v(pVar2)));
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
