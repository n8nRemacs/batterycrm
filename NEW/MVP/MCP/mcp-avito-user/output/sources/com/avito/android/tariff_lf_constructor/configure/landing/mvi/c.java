package com.avito.android.tariff_lf_constructor.configure.landing.mvi;

import com.avito.android.tariff_lf_constructor.configure.landing.mvi.entity.ConstructorLandingInternalAction;
import jD0.C42238c;
import jD0.InterfaceC42236a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ConstructorLandingActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LjD0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingInternalAction;", "invoke", "(LjD0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements Y41.l<InterfaceC42236a, InterfaceC43160i<? extends ConstructorLandingInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f299712l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C42238c> f299713m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Y41.a<C42238c> aVar) {
        super(1);
        this.f299712l = dVar;
        this.f299713m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends ConstructorLandingInternalAction> invoke(InterfaceC42236a interfaceC42236a) {
        C42238c c42238cInvoke = this.f299713m.invoke();
        return this.f299712l.b(interfaceC42236a, c42238cInvoke);
    }
}
