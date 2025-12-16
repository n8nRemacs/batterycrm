package com.avito.android.wallet.history.mvi;

import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.wallet.history.mvi.entity.a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WalletHistoryScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class p extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a.C10157a f327713l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<GO0.a, G0> f327714m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(a.C10157a c10157a, Y41.l<? super GO0.a, G0> lVar) {
        super(1);
        this.f327713l = c10157a;
        this.f327714m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        List<GO0.b> list = this.f327713l.f327676a;
        k kVar = k.f327705l;
        m0Var2.a(list.size(), kVar != null ? new m(kVar, list) : null, new n(l.f327706l, list), new C22096n(-632812321, new o(this.f327714m, list), true));
        return G0.f406611a;
    }
}
