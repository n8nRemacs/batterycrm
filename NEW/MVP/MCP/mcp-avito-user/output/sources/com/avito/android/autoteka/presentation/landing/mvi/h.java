package com.avito.android.autoteka.presentation.landing.mvi;

import Mf.C14480a;
import com.avito.android.autoteka.presentation.landing.mvi.entity.AutotekaLandingInternalAction;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;
import lj.InterfaceC43779a;

/* compiled from: AutotekaLandingBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/landing/mvi/h;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements com.avito.android.arch.mvi.b<AutotekaLandingInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C14480a f97362a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f97363b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.landing.a f97364c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f97365d;

    @Inject
    public h(@Y61.k C14480a c14480a, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k com.avito.android.autoteka.data.landing.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f97362a = c14480a;
        this.f97363b = interfaceC40691b;
        this.f97364c = aVar;
        this.f97365d = aVar2;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AutotekaLandingInternalAction> a() {
        C14480a c14480a = this.f97362a;
        InterfaceC43779a interfaceC43779a = c14480a.f10978a;
        C43137a0 c43137a0 = new C43137a0(new c(2, null), y.a(interfaceC43779a.getF103348p()));
        InterfaceC43779a interfaceC43779a2 = c14480a.f10979b;
        InterfaceC43160i interfaceC43160iA = y.a(interfaceC43779a2.getF103348p());
        InterfaceC43779a interfaceC43779a3 = c14480a.f10980c;
        return C43175k.N(C43175k.k(c43137a0, interfaceC43160iA, new C43137a0(new d(2, null), y.a(interfaceC43779a3.getF103348p())), new e(interfaceC43779a, interfaceC43779a2, interfaceC43779a3, null)), this.f97364c.a(), C43175k.C(new g(this, null), new f(y.a(this.f97365d.d9()))));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        this.f97363b.onCleared();
        return G0.f406611a;
    }
}
