package org.koin.androidx.viewmodel.factory;

import Y61.k;
import Y61.l;
import androidx.view.M0;
import androidx.view.P0;
import kotlin.C49177a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import w71.InterfaceC49462a;
import z1.AbstractC50339a;

/* compiled from: KoinViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/koin/androidx/viewmodel/factory/b;", "Landroidx/lifecycle/P0$c;", "koin-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d<? extends M0> f421432a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final org.koin.core.scope.a f421433b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final InterfaceC49462a f421434c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Y41.a<C49177a> f421435d;

    /* compiled from: KoinViewModelFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Lv71/a;", "invoke", "()Lv71/a;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends N implements Y41.a<C49177a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ org.koin.androidx.viewmodel.parameter.b f421436l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(org.koin.androidx.viewmodel.parameter.b bVar) {
            super(0);
            this.f421436l = bVar;
        }

        @Override // Y41.a
        public final C49177a invoke() {
            return this.f421436l;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k d<? extends M0> dVar, @k org.koin.core.scope.a aVar, @l InterfaceC49462a interfaceC49462a, @l Y41.a<? extends C49177a> aVar2) {
        this.f421432a = dVar;
        this.f421433b = aVar;
        this.f421434c = interfaceC49462a;
        this.f421435d = aVar2;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls, @k AbstractC50339a abstractC50339a) {
        return (T) this.f421433b.b(new a(new org.koin.androidx.viewmodel.parameter.b(this.f421435d, abstractC50339a)), this.f421432a, this.f421434c);
    }

    public /* synthetic */ b(d dVar, org.koin.core.scope.a aVar, InterfaceC49462a interfaceC49462a, Y41.a aVar2, int i12, C42822w c42822w) {
        this(dVar, aVar, (i12 & 4) != 0 ? null : interfaceC49462a, (i12 & 8) != 0 ? null : aVar2);
    }
}
