package com.avito.beduin.v2.component.lazy_row.compose;

import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.beduin.v2.component.lazy_row.state.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyRowComponent.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class j extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.component.lazy_row.state.a f336059l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f336060m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f336061n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.avito.beduin.v2.component.lazy_row.state.a aVar, boolean z12, boolean z13) {
        super(1);
        this.f336059l = aVar;
        this.f336060m = z12;
        this.f336061n = z13;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        ET0.a<a.C10413a> aVar = this.f336059l.f336066a;
        d dVar = d.f336046l;
        m0Var2.a(aVar.f4014b.size(), dVar != null ? new g(dVar, aVar) : null, new h(e.f336047l, aVar), new C22096n(-632812321, new i(aVar, this.f336060m, this.f336061n), true));
        return G0.f406611a;
    }
}
