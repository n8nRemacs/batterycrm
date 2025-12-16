package com.avito.android.mvi.rx3.with_monolithic_state;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BaseMviEntityWithMonolithicState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0003*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "StateT", "Lcom/avito/android/mvi/rx3/with_monolithic_state/x;", "kotlin.jvm.PlatformType", "otherReducible", "", "invoke", "(Lcom/avito/android/mvi/rx3/with_monolithic_state/x;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mvi.rx3.with_monolithic_state.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32893d extends N implements Y41.l<x<Object>, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC32892c<Object> f207147l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x<Object> f207148m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32893d(AbstractC32892c<Object> abstractC32892c, x<Object> xVar) {
        super(1);
        this.f207147l = abstractC32892c;
        this.f207148m = xVar;
    }

    @Override // Y41.l
    public final Boolean invoke(x<Object> xVar) {
        x<Object> xVar2 = xVar;
        AbstractC32892c<Object> abstractC32892c = this.f207147l;
        E<Object> e12 = abstractC32892c.f207134L;
        x<Object> xVar3 = this.f207148m;
        boolean zA2 = e12.a(xVar2, xVar3);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xVar2);
        sb2.append(' ');
        sb2.append(zA2 ? "SHOULD" : "SHOULD NOT");
        sb2.append(" cancel ");
        sb2.append(xVar3);
        abstractC32892c.f207135M.invoke(sb2.toString());
        return Boolean.valueOf(zA2);
    }
}
