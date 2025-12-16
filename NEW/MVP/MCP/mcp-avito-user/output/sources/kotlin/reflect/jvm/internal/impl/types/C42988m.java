package kotlin.reflect.jvm.internal.impl.types;

import kotlin.collections.C42745f0;

/* compiled from: AbstractTypeConstructor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42988m extends kotlin.jvm.internal.N implements Y41.l<q0, Iterable<? extends O>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC42983j f410225l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42988m(AbstractC42983j abstractC42983j) {
        super(1);
        this.f410225l = abstractC42983j;
    }

    @Override // Y41.l
    public final Iterable<? extends O> invoke(q0 q0Var) {
        q0 q0Var2 = q0Var;
        this.f410225l.getClass();
        AbstractC42983j abstractC42983j = q0Var2 instanceof AbstractC42983j ? (AbstractC42983j) q0Var2 : null;
        return abstractC42983j != null ? C42745f0.h0(abstractC42983j.g(false), abstractC42983j.f410213b.invoke().f410214a) : q0Var2.C();
    }
}
