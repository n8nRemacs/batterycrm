package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update;

import androidx.appcompat.app.r;
import com.avito.android.push.public_module.token.sending.sending_interactor.SendPushTokenInteractor;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.single.G;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import l41.o;

/* compiled from: IacDeviceAvailabilityUpdater.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/push/public_module/token/sending/sending_interactor/SendPushTokenInteractor$TokenRegistrationResult;", "tokenRegistrationResult", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lcom/avito/android/push/public_module/token/sending/sending_interactor/SendPushTokenInteractor$TokenRegistrationResult;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f168367b;

    public g(c cVar) {
        this.f168367b = cVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        final boolean z12 = ((SendPushTokenInteractor.TokenRegistrationResult) obj) == SendPushTokenInteractor.TokenRegistrationResult.f246086b;
        c cVar = this.f168367b;
        cVar.getClass();
        return new G(new Callable() { // from class: com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i12 = c.f168348k;
                V2 v22 = V2.f318762a;
                StringBuilder sb2 = new StringBuilder("update device availability: forced=[");
                boolean z13 = z12;
                v22.c("IacDeviceAvailabilityUpdater", r.x(sb2, z13, ']'), null);
                return Boolean.valueOf(z13);
            }
        }).s(cVar.f168353e.a()).o(new f(cVar, z12));
    }
}
