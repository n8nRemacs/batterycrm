package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Appearance.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class i extends N implements Y41.l<Appearance, Map<String, ? extends CallInit>> {

    /* renamed from: l, reason: collision with root package name */
    public static final i f165527l = new i();

    public i() {
        super(1);
    }

    @Override // Y41.l
    public final Map<String, ? extends CallInit> invoke(Appearance appearance) {
        return appearance.getCallInits();
    }
}
