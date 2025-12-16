package com.avito.android.early_access.adapter.short_price;

import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.early_access.adapter.short_price.element.EarlyAccessShortPriceItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyAccessShortPrice.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class i extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<EarlyAccessShortPriceItem> f145240l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<EarlyAccessShortPriceItem, G0> f145241m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Y41.l lVar, List list) {
        super(1);
        this.f145240l = list;
        this.f145241m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        a.f145215a.getClass();
        m0Var2.c(null, null, a.f145216b);
        e eVar = e.f145228l;
        List<EarlyAccessShortPriceItem> list = this.f145240l;
        m0Var2.a(list.size(), null, new g(eVar, list), new C22096n(-632812321, new h(this.f145241m, list), true));
        m0Var2.c(null, null, a.f145217c);
        return G0.f406611a;
    }
}
