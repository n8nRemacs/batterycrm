package com.avito.android.mortgage_invite.client_search;

import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageClientSearchScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class z extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W10.c f205507l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<MortgageClient, G0> f205508m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f205509n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(W10.c cVar, Y41.l<? super MortgageClient, G0> lVar, Y41.a<G0> aVar) {
        super(1);
        this.f205507l = cVar;
        this.f205508m = lVar;
        this.f205509n = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        W10.c cVar = this.f205507l;
        if (!cVar.f17562e.isEmpty()) {
            r rVar = r.f205495l;
            v vVar = v.f205500l;
            List<MortgageClient> list = cVar.f17562e;
            m0Var2.a(list.size(), rVar != null ? new w(rVar, list) : null, new x(vVar, list), new C22096n(-632812321, new y(this.f205508m, list), true));
        } else if (cVar.f17561d.length() > 0) {
            C32814a.f205357a.getClass();
            m0Var2.c(null, null, C32814a.f205359c);
        }
        m0Var2.c(null, null, new C22096n(1924074680, new u(this.f205509n), true));
        return G0.f406611a;
    }
}
