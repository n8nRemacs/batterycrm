package com.avito.android.sbc.dispatch_edit;

import Wo0.C15785a;
import Wo0.InterfaceC15786b;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SbcDispatchEditScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class r extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Wo0.d f260158l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC15786b, G0> f260159m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f260160n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(float f12, Wo0.d dVar, Y41.l lVar) {
        super(1);
        this.f260158l = dVar;
        this.f260159m = lVar;
        this.f260160n = f12;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        Wo0.d dVar = this.f260158l;
        List<C15785a> list = dVar.f18064e;
        m mVar = m.f260102l;
        m0Var2.a(list.size(), mVar != null ? new o(mVar, list) : null, new p(n.f260149l, list), new C22096n(-632812321, new q(list, dVar, this.f260159m, this.f260160n), true));
        return G0.f406611a;
    }
}
