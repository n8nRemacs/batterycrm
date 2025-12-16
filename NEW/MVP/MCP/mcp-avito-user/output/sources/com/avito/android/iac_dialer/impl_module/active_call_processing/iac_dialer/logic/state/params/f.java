package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.params;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CallParams.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class f extends N implements Y41.l<CallParams, Map<String, ? extends String>> {

    /* renamed from: l, reason: collision with root package name */
    public static final f f165610l = new f();

    public f() {
        super(1);
    }

    @Override // Y41.l
    public final Map<String, ? extends String> invoke(CallParams callParams) {
        return callParams.getCustomParams();
    }
}
