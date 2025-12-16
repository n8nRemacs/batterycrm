package com.avito.android.comfortable_deal.end_deal;

import Hp.InterfaceC14016a;
import Hp.d;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.InterfaceC22489j2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: EndDealScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class E extends kotlin.jvm.internal.N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d.a f122030l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC14016a, G0> f122031m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22489j2 f122032n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E(d.a aVar, Y41.l<? super InterfaceC14016a, G0> lVar, InterfaceC22489j2 interfaceC22489j2) {
        super(1);
        this.f122030l = aVar;
        this.f122031m = lVar;
        this.f122032n = interfaceC22489j2;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        C29471a.f122143a.getClass();
        m0Var2.c(null, null, C29471a.f122146d);
        d.a aVar = this.f122030l;
        List listO = P0.o(aVar.f7744c);
        C29486p c29486p = C29486p.f122362l;
        A a12 = A.f122022l;
        int size = listO.size();
        B b12 = c29486p != null ? new B(c29486p, listO) : null;
        C c12 = new C(a12, listO);
        Y41.l<InterfaceC14016a, G0> lVar = this.f122031m;
        m0Var2.a(size, b12, c12, new C22096n(-632812321, new D(listO, lVar, this.f122032n), true));
        m0Var2.c(null, null, new C22096n(463815098, new C29495z(aVar, lVar), true));
        m0Var2.c(null, null, C29471a.f122147e);
        return G0.f406611a;
    }
}
