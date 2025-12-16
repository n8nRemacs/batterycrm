package com.avito.android.btob_business_trip.screens.selectItemScreen;

import Bk.c;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.btob_business_trip.models.SelectItemInfo;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: B2bBusinessSelectItemsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class o extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c.b.C0071b f108233l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<Long, Boolean, G0> f108234m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(c.b.C0071b c0071b, Y41.p<? super Long, ? super Boolean, G0> pVar) {
        super(1);
        this.f108233l = c0071b;
        this.f108234m = pVar;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        c.b.C0071b c0071b = this.f108233l;
        m0Var2.c(null, null, new C22096n(424158595, new g(c0071b), true));
        m0Var2.c(null, null, new C22096n(1078550764, new h(c0071b), true));
        List<SelectItemInfo> list = c0071b.f1663d;
        i iVar = i.f108188l;
        m0Var2.a(list.size(), iVar != null ? new l(iVar, list) : null, new m(k.f108191l, list), new C22096n(-632812321, new n(list, c0071b, this.f108234m), true));
        return G0.f406611a;
    }
}
