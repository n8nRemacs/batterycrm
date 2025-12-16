package com.avito.android.safety.safety_settings;

import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SafetySettingsFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/safety_settings/b;", "Lcom/avito/android/deeplink_handler/view/impl/i;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends com.avito.android.deeplink_handler.view.impl.i {
    @Override // com.avito.android.deeplink_handler.view.impl.i, com.avito.android.deeplink_handler.view.a.g
    public final void g(@l com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
        if (L.f(aVar != null ? aVar.f134521b : null, "reqTfaEnable")) {
            return;
        }
        a(z12);
    }
}
