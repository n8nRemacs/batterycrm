package ub1;

import kotlin.G0;
import kotlin.jvm.internal.N;
import ru.rustore.sdk.core.exception.RuStoreException;

/* loaded from: classes9.dex */
public final class t extends N implements Y41.l<RuStoreException, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.rustore.sdk.reactive.single.p<G0> f440175l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ru.rustore.sdk.reactive.single.p<G0> pVar) {
        super(1);
        this.f440175l = pVar;
    }

    @Override // Y41.l
    public final G0 invoke(RuStoreException ruStoreException) {
        this.f440175l.a(ruStoreException);
        return G0.f406611a;
    }
}
