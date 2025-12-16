package ub1;

import kotlin.G0;
import kotlin.jvm.internal.N;
import ru.rustore.sdk.review.model.ReviewInfo;

/* loaded from: classes9.dex */
public final class y extends N implements Y41.l<ReviewInfo, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.rustore.sdk.reactive.single.p<ReviewInfo> f440181l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ru.rustore.sdk.reactive.single.p<ReviewInfo> pVar) {
        super(1);
        this.f440181l = pVar;
    }

    @Override // Y41.l
    public final G0 invoke(ReviewInfo reviewInfo) {
        this.f440181l.b(reviewInfo);
        return G0.f406611a;
    }
}
