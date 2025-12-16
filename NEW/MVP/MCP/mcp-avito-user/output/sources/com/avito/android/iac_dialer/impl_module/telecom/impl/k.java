package com.avito.android.iac_dialer.impl_module.telecom.impl;

import Y41.p;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReason;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReasonBundle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacTelecomManagerImpl.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "<anonymous parameter 0>", "Lcom/avito/android/iac_dialer/impl_module/telecom/a;", "callControl", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Lcom/avito/android/iac_dialer/impl_module/telecom/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class k extends N implements p<String, com.avito.android.iac_dialer.impl_module.telecom.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final k f166479l = new k();

    public k() {
        super(2);
    }

    @Override // Y41.p
    public final G0 invoke(String str, com.avito.android.iac_dialer.impl_module.telecom.a aVar) {
        aVar.b(new TerminateReasonBundle(TerminateReason.InternalError.INSTANCE, true));
        return G0.f406611a;
    }
}
