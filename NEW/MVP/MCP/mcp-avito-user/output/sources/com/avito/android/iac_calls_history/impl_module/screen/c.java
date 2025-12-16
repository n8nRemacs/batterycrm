package com.avito.android.iac_calls_history.impl_module.screen;

import com.avito.android.iac_calls_history.impl_module.screen.CallsHistoryScreenActivity;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CallsHistoryScreenActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class c extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CallsHistoryScreenActivity f164778l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CallsHistoryScreenActivity callsHistoryScreenActivity) {
        super(1);
        this.f164778l = callsHistoryScreenActivity;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        CallsHistoryScreenActivity.a aVar = CallsHistoryScreenActivity.f164759q;
        this.f164778l.a2().accept(new a.h(iIntValue));
        return G0.f406611a;
    }
}
