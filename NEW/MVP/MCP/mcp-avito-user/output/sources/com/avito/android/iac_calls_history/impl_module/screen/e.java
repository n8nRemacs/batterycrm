package com.avito.android.iac_calls_history.impl_module.screen;

import com.avito.android.iac_calls_history.impl_module.screen.CallsHistoryScreenActivity;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CallsHistoryScreenActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CallsHistoryScreenActivity f164781l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CallsHistoryScreenActivity callsHistoryScreenActivity) {
        super(0);
        this.f164781l = callsHistoryScreenActivity;
    }

    @Override // Y41.a
    public final G0 invoke() {
        CallsHistoryScreenActivity.a aVar = CallsHistoryScreenActivity.f164759q;
        this.f164781l.a2().accept(a.g.f164837a);
        return G0.f406611a;
    }
}
