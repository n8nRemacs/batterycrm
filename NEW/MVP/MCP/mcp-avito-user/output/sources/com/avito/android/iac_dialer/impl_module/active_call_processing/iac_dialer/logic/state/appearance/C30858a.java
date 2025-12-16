package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Appearance.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30858a extends N implements Y41.l<Appearance, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final C30858a f165519l = new C30858a();

    public C30858a() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(Appearance appearance) {
        return Boolean.valueOf(appearance.isGsmBusy());
    }
}
