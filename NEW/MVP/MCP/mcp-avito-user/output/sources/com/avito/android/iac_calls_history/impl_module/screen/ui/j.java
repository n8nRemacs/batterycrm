package com.avito.android.iac_calls_history.impl_module.screen.ui;

import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.items.IacCallsHistoryItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: CallsHistoryScreenUI.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class j extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CallsHistoryScreenState f164933l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.a f164934m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f164935n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<IacCallsHistoryItem, G0> f164936o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(CallsHistoryScreenState callsHistoryScreenState, l0.a aVar, Y41.a<G0> aVar2, Y41.l<? super IacCallsHistoryItem, G0> lVar) {
        super(1);
        this.f164933l = callsHistoryScreenState;
        this.f164934m = aVar;
        this.f164935n = aVar2;
        this.f164936o = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        CallsHistoryScreenState callsHistoryScreenState = this.f164933l;
        List<CallsHistoryScreenState.Item> list = callsHistoryScreenState.f164827e;
        m0Var.a(list.size(), null, new h(list), new C22096n(-1091073711, new i(list, callsHistoryScreenState, this.f164934m, this.f164935n, this.f164936o), true));
        return G0.f406611a;
    }
}
