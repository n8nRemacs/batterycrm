package com.avito.android.contact_access.contact_access_package.mvi;

import Dr.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.contact_access.contact_access_package.mvi.entity.ContactAccessPackageState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ContactAccessPackageReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/contact_access/contact_access_package/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "LDr/c;", "Lcom/avito/android/contact_access/contact_access_package/mvi/entity/ContactAccessPackageState;", "<init>", "()V", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements u<Dr.c, ContactAccessPackageState> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final ContactAccessPackageState a(Dr.c cVar, ContactAccessPackageState contactAccessPackageState) {
        Dr.c cVar2 = cVar;
        ContactAccessPackageState contactAccessPackageState2 = contactAccessPackageState;
        return cVar2 instanceof c.d ? new ContactAccessPackageState(contactAccessPackageState2.f125893b, true) : cVar2 instanceof c.f ? new ContactAccessPackageState(contactAccessPackageState2.f125893b, true) : cVar2 instanceof c.C0199c ? new ContactAccessPackageState(((c.C0199c) cVar2).f3483a, false) : contactAccessPackageState2;
    }
}
