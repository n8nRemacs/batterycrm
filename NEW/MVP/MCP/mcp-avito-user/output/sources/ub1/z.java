package ub1;

import kotlin.G0;
import kotlin.jvm.internal.N;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.review.model.ReviewInfo;

/* loaded from: classes9.dex */
public final class z extends N implements Y41.l<RuStoreException, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.rustore.sdk.reactive.single.p<ReviewInfo> f440182l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ru.rustore.sdk.reactive.single.p<ReviewInfo> pVar) {
        super(1);
        this.f440182l = pVar;
    }

    @Override // Y41.l
    public final G0 invoke(RuStoreException ruStoreException) {
        this.f440182l.a(ruStoreException);
        return G0.f406611a;
    }
}
