package com.avito.android.select.new_districts.compose;

import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.select.new_districts.mvi.entity.SelectDistrictViewState;
import com.avito.android.select.new_districts.mvi.entity.ui.UiItem;
import eq0.InterfaceC40146a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectDistrictScreenContent.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class x extends kotlin.jvm.internal.N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SelectDistrictViewState f265783l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC40146a, G0> f265784m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.K f265785n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(SelectDistrictViewState selectDistrictViewState, Y41.l lVar, androidx.compose.foundation.layout.K k12) {
        super(1);
        this.f265783l = selectDistrictViewState;
        this.f265784m = lVar;
        this.f265785n = k12;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        SelectDistrictViewState selectDistrictViewState = this.f265783l;
        List<UiItem> list = selectDistrictViewState.f265825b;
        C34628o c34628o = C34628o.f265761l;
        m0Var2.a(list.size(), c34628o != null ? new C34633u(c34628o, list) : null, new v(C34632t.f265774l, list), new C22096n(-632812321, new w(list, selectDistrictViewState, this.f265784m, this.f265785n), true));
        C34620g.f265746a.getClass();
        m0Var2.c(null, null, C34620g.f265747b);
        return G0.f406611a;
    }
}
