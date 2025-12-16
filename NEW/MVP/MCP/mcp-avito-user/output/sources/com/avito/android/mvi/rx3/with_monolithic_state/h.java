package com.avito.android.mvi.rx3.with_monolithic_state;

import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: BaseMviEntityWithMonolithicState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002F\u0010\u0004\u001aB\u0012\f\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000\u0012\f\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000\u0012\f\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "StateT", "Lkotlin/Q;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Q;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class h extends N implements Y41.l<Q<Object, Object>, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC32892c<Object> f207156l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x<Object> f207157m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AbstractC32892c<Object> abstractC32892c, x<Object> xVar) {
        super(1);
        this.f207156l = abstractC32892c;
        this.f207157m = xVar;
    }

    @Override // Y41.l
    public final Boolean invoke(Q<Object, Object> q12) {
        Q<Object, Object> q13 = q12;
        Object obj = q13.f406619b;
        Object obj2 = q13.f406620c;
        boolean z12 = obj2 != obj;
        AbstractC32892c<Object> abstractC32892c = this.f207156l;
        abstractC32892c.getClass();
        if (z12) {
            abstractC32892c.f207137O.invoke(androidx.camera.view.k.a(obj2, "New State: "));
        }
        return Boolean.valueOf(z12);
    }
}
