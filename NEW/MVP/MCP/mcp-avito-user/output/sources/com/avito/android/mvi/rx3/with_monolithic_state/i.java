package com.avito.android.mvi.rx3.with_monolithic_state;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: BaseMviEntityWithMonolithicState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002F\u0010\u0004\u001aB\u0012\f\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000\u0012\f\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000\u0012\f\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "StateT", "Lkotlin/Q;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/G0;", "invoke", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class i extends N implements Y41.l<Q<Object, Object>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC32892c<Object> f207158l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AbstractC32892c<Object> abstractC32892c) {
        super(1);
        this.f207158l = abstractC32892c;
    }

    @Override // Y41.l
    public final G0 invoke(Q<Object, Object> q12) {
        this.f207158l.f207138P.accept(q12.f406620c);
        return G0.f406611a;
    }
}
