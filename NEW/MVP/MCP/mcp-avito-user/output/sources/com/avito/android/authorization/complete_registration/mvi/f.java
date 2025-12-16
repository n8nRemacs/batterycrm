package com.avito.android.authorization.complete_registration.mvi;

import Wd.InterfaceC15745b;
import com.avito.android.authorization.complete_registration.mvi.entity.CompleteRegistrationInternalAction;
import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.Session;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CompleteRegistrationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/complete_registration/mvi/f;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface f {
    @Y61.k
    InterfaceC43160i<CompleteRegistrationInternalAction> a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k InterfaceC15745b.C1278b c1278b);

    @Y61.k
    InterfaceC43160i<CompleteRegistrationInternalAction> b(@Y61.k Profile profile, @Y61.k Session session, @Y61.k String str, @Y61.k InterfaceC15745b.C1278b c1278b, @Y61.k String str2);
}
