package org.koin.androidx.scope;

import androidx.view.InterfaceC22983P;
import androidx.view.O0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import w71.C49465d;

/* compiled from: LifecycleViewModelScopeDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lorg/koin/androidx/scope/k;", "Lkotlin/properties/g;", "Landroidx/lifecycle/P;", "Lorg/koin/core/scope/a;", "koin-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class k implements kotlin.properties.g<InterfaceC22983P, org.koin.core.scope.a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o71.d f421413b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<o71.d, org.koin.core.scope.a> f421414c;

    /* compiled from: LifecycleViewModelScopeDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo71/d;", "k", "Lorg/koin/core/scope/a;", "invoke", "(Lo71/d;)Lorg/koin/core/scope/a;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends N implements Y41.l<o71.d, org.koin.core.scope.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.view.n f421415l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.view.n nVar) {
            super(1);
            this.f421415l = nVar;
        }

        @Override // Y41.l
        public final org.koin.core.scope.a invoke(o71.d dVar) {
            androidx.view.n nVar = this.f421415l;
            C49465d c49465dB = org.koin.core.component.g.b(nVar);
            return dVar.a(c49465dB.f441300b, org.koin.core.component.g.b(nVar), null);
        }
    }

    public k() {
        throw null;
    }

    public k(androidx.view.n nVar, o71.d dVar, Y41.l lVar, int i12, C42822w c42822w) {
        lVar = (i12 & 4) != 0 ? new a(nVar) : lVar;
        this.f421413b = dVar;
        this.f421414c = lVar;
        nVar.getLifecycle().a(new l((r) new O0(m0.f406844a.b(r.class), new n(nVar), new m(nVar), new o(nVar)).getValue(), this));
    }

    @Override // kotlin.properties.g
    public final org.koin.core.scope.a getValue(InterfaceC22983P interfaceC22983P, kotlin.reflect.n nVar) {
        throw null;
    }
}
