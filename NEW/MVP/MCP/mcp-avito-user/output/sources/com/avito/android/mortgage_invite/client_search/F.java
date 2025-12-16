package com.avito.android.mortgage_invite.client_search;

import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.ui.unit.h;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageClientSearchScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class F extends N implements Y41.q<T1, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W10.c f205322l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f205323m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f205324n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f205325o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<MortgageClient, G0> f205326p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public F(W10.c cVar, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.l<? super MortgageClient, G0> lVar) {
        super(3);
        this.f205322l = cVar;
        this.f205323m = aVar;
        this.f205324n = aVar2;
        this.f205325o = aVar3;
        this.f205326p = lVar;
    }

    @Override // Y41.q
    public final G0 invoke(T1 t12, androidx.compose.runtime.A a12, Integer num) {
        T1 t13 = t12;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(t13) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            androidx.compose.ui.v vVarH = R1.h(androidx.compose.ui.v.f42878y1, t13);
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            I.e(this.f205322l, this.f205323m, this.f205324n, this.f205325o, this.f205326p, R1.k(16, 0.0f, 2, vVarH), a13, 0);
        }
        return G0.f406611a;
    }
}
