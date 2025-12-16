package com.avito.android.arch.mvi;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Feature.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\u0001*\u00020\u0003\"\b\b\u0003\u0010\u0005*\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "State", "Action", "", "InternalAction", "OneTimeEvent", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class j extends N implements Y41.a<Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c<Object, Object, Object, Object> f91958l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c<Object, Object, Object, Object> cVar) {
        super(0);
        this.f91958l = cVar;
    }

    @Override // Y41.a
    @Y61.k
    public final Object invoke() {
        return this.f91958l.f91929r.get();
    }
}
