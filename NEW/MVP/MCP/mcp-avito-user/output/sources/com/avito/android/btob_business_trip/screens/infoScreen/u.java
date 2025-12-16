package com.avito.android.btob_business_trip.screens.infoScreen;

import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.btob_business_trip.models.AdvantageInfo;
import com.avito.android.btob_business_trip.models.ConditionItemInfo;
import com.avito.android.btob_business_trip.models.ConditionsInfo;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: B2bBusinessTripInfoScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class u extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<AdvantageInfo> f108023l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ConditionsInfo f108024m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f108025n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(List<AdvantageInfo> list, ConditionsInfo conditionsInfo, String str) {
        super(1);
        this.f108023l = list;
        this.f108024m = conditionsInfo;
        this.f108025n = str;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        m0Var2.c(null, null, new C22096n(573729120, new l(this.f108025n), true));
        m mVar = m.f107989l;
        List<AdvantageInfo> list = this.f108023l;
        m0Var2.a(list.size(), null, new o(mVar, list), new C22096n(-632812321, new p(list), true));
        y.f108031a.getClass();
        m0Var2.c(null, null, y.f108032b);
        List<ConditionItemInfo> list2 = this.f108024m.f107856b;
        m0Var2.a(list2.size(), null, new s(q.f108019l, list2), new C22096n(-632812321, new t(list2), true));
        return G0.f406611a;
    }
}
