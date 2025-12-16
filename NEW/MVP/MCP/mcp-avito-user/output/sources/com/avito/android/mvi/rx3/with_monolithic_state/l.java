package com.avito.android.mvi.rx3.with_monolithic_state;

import com.avito.android.util.X2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BaseMviEntityWithMonolithicState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "StateT", "", "kotlin.jvm.PlatformType", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class l extends N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC32892c<Object> f207162l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AbstractC32892c<Object> abstractC32892c) {
        super(1);
        this.f207162l = abstractC32892c;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        AbstractC32892c<Object> abstractC32892c = this.f207162l;
        abstractC32892c.getClass();
        X2.f318778a.a(abstractC32892c.f207131E, "Uncaught error in reducer chain!", th2);
        return G0.f406611a;
    }
}
