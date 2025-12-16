package com.avito.android.delivery_tarifikator.domain;

import Ov.C14740c;
import com.squareup.anvil.annotations.ContributesBinding;
import cw.C39420a;
import cw.C39422c;
import cw.C39423d;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: CustomTariffsOnboardingMapper.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/f;", "Lcom/avito/android/delivery_tarifikator/domain/e;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.delivery_tarifikator.domain.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29810f implements InterfaceC29809e {
    @Inject
    public C29810f() {
    }

    @Override // com.avito.android.delivery_tarifikator.domain.InterfaceC29809e
    @Y61.l
    public final C14740c a(@Y61.k C39420a c39420a) {
        C39422c customTariffsCardOnboarding = c39420a.getCustomTariffsCardOnboarding();
        if (customTariffsCardOnboarding == null) {
            return null;
        }
        C39423d button = customTariffsCardOnboarding.getButton();
        return new C14740c(customTariffsCardOnboarding.getText(), customTariffsCardOnboarding.getBadgeText(), button != null ? new Ov.i(button.getText(), button.getDeeplink()) : null);
    }
}
