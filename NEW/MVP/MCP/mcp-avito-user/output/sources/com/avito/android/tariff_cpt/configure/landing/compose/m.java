package com.avito.android.tariff_cpt.configure.landing.compose;

import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.internal.C22096n;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import oC0.C44625c;
import oC0.InterfaceC44623a;

/* compiled from: TariffCptConfigureLandingScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class m extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C44625c f297712l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC44623a, G0> f297713m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f297714n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(C44625c c44625c, Y41.l<? super InterfaceC44623a, G0> lVar, InterfaceC22196w1 interfaceC22196w1) {
        super(1);
        this.f297712l = c44625c;
        this.f297713m = lVar;
        this.f297714n = interfaceC22196w1;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        C44625c c44625c = this.f297712l;
        m0Var2.c(null, null, new C22096n(1817220080, new d(c44625c), true));
        List<C44625c.b> list = c44625c.f419599c;
        int size = list.size();
        h hVar = new h(list);
        Y41.l<InterfaceC44623a, G0> lVar = this.f297713m;
        m0Var2.a(size, null, hVar, new C22096n(-1091073711, new i(lVar, list), true));
        m0Var2.c(null, null, new C22096n(605847641, new e(c44625c), true));
        List<C44625c.C12178c> list2 = c44625c.f419601e;
        m0Var2.a(list2.size(), null, new k(list2), new C22096n(-1091073711, new l(lVar, list2), true));
        m0Var2.c(null, null, new C22096n(1944339896, new f(this.f297714n), true));
        return G0.f406611a;
    }
}
