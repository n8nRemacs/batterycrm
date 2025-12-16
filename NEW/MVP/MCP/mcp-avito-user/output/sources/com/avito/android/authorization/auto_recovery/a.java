package com.avito.android.authorization.auto_recovery;

import Y61.k;
import com.avito.android.deep_linking.links.auth.AutoRecoveryLink;
import io.reactivex.rxjava3.internal.operators.single.O;
import kotlin.Metadata;

/* compiled from: AutoRecoveryAvailabilityInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/a;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {
    @k
    O a(@k AutoRecoveryLink.Scenario scenario);
}
