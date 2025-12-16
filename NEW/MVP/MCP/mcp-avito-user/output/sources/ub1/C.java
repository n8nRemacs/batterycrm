package ub1;

import kotlin.G0;
import kotlin.jvm.internal.N;
import ru.rustore.sdk.reactive.single.AbstractC47905a;
import ru.rustore.sdk.reactive.single.C47909e;
import ru.rustore.sdk.review.model.ReviewInfo;

/* loaded from: classes9.dex */
public final class C extends N implements Y41.l<G0, AbstractC47905a<G0>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E f440125l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ReviewInfo f440126m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(E e12, ReviewInfo reviewInfo) {
        super(1);
        this.f440125l = e12;
        this.f440126m = reviewInfo;
    }

    @Override // Y41.l
    public final AbstractC47905a<G0> invoke(G0 g02) {
        E e12 = this.f440125l;
        e12.getClass();
        AbstractC47905a.C12588a c12588a = AbstractC47905a.f436968a;
        C49018B c49018b = new C49018B(e12, this.f440126m);
        c12588a.getClass();
        return new C47909e(c49018b);
    }
}
