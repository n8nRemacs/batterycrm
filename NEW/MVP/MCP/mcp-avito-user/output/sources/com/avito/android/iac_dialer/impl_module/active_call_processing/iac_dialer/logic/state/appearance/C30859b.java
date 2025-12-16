package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance;

import com.avito.android.iac_dialer.impl_module.device_status.connection_status.IacConnectionStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Appearance.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30859b extends N implements Y41.l<Appearance, IacConnectionStatus> {

    /* renamed from: l, reason: collision with root package name */
    public static final C30859b f165520l = new C30859b();

    public C30859b() {
        super(1);
    }

    @Override // Y41.l
    public final IacConnectionStatus invoke(Appearance appearance) {
        return appearance.getNetwork();
    }
}
