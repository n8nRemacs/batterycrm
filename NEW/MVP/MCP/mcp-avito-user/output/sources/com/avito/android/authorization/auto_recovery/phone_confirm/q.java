package com.avito.android.authorization.auto_recovery.phone_confirm;

import To.d;
import ie.InterfaceC41389a;
import javax.inject.Inject;
import ke.InterfaceC42674c;
import kotlin.Metadata;

/* compiled from: AutoRecoveryPhoneRequestInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/phone_confirm/q;", "Lcom/avito/android/authorization/auto_recovery/phone_confirm/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q extends a {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final i f93266c;

    @Inject
    public q(@Y61.k InterfaceC41389a interfaceC41389a, @com.avito.android.code_check_public.g @Y61.k i iVar) {
        super(interfaceC41389a, iVar);
        this.f93266c = iVar;
    }

    @Override // com.avito.android.authorization.auto_recovery.phone_confirm.a
    @Y61.k
    public final To.d d(@Y61.k InterfaceC42674c.b bVar, @Y61.k String str, long j12) {
        return bVar.getIsPhoneUsed() ? new d.f(this.f93266c.a(j12, str)) : new d.a(str, j12, 5, null, 8, null);
    }
}
