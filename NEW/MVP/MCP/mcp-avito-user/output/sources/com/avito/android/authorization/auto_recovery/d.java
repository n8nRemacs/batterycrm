package com.avito.android.authorization.auto_recovery;

import Y61.k;
import com.avito.android.deep_linking.links.auth.AutoRecoveryLink;
import com.avito.android.util.InterfaceC35745a5;
import ie.InterfaceC41389a;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import io.reactivex.rxjava3.internal.operators.single.O;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.rx3.Q;

/* compiled from: AutoRecoveryAvailabilityInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/d;", "Lcom/avito/android/authorization/auto_recovery/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC41389a> f93072a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f93073b;

    @Inject
    public d(@k InterfaceC35745a5 interfaceC35745a5, @k h31.e eVar) {
        this.f93072a = eVar;
        this.f93073b = interfaceC35745a5;
    }

    @Override // com.avito.android.authorization.auto_recovery.a
    @k
    public final O a(@k AutoRecoveryLink.Scenario scenario) {
        C42006d c42006dA = Q.a(EmptyCoroutineContext.INSTANCE, new b(this, null));
        InterfaceC35745a5 interfaceC35745a5 = this.f93073b;
        return c42006dA.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).r(new c(scenario));
    }
}
