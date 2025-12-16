package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update;

import com.avito.android.analytics.clickstream.I;
import com.avito.android.push.public_module.token.sending.sending_interactor.SendPushTokenInteractor;
import com.squareup.anvil.annotations.ContributesBinding;
import ig0.AbstractC41398a;
import io.reactivex.rxjava3.internal.operators.single.U;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: IacVoipPushTokenUpdater.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/iac_enable/update/l;", "Lcom/avito/android/iac_incoming_call_ability/impl_module/iac_enable/update/k;", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SendPushTokenInteractor f168378a;

    @Inject
    public l(@Y61.k SendPushTokenInteractor sendPushTokenInteractor) {
        this.f168378a = sendPushTokenInteractor;
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update.k
    @Y61.k
    public final U a(@Y61.k AbstractC41398a abstractC41398a) {
        return this.f168378a.a(abstractC41398a, true).u(new I(15));
    }
}
