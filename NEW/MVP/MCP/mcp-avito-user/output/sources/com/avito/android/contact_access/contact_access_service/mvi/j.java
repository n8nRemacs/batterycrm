package com.avito.android.contact_access.contact_access_service.mvi;

import Er.b;
import com.avito.android.arch.mvi.u;
import com.avito.android.contact_access.contact_access_service.mvi.entity.ContactAccessServiceState;
import com.avito.android.error.z;
import com.avito.android.remote.model.ContactAccessService;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ContactAccessServiceReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/contact_access/contact_access_service/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "LEr/b;", "Lcom/avito/android/contact_access/contact_access_service/mvi/entity/ContactAccessServiceState;", "<init>", "()V", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements u<Er.b, ContactAccessServiceState> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final ContactAccessServiceState a(Er.b bVar, ContactAccessServiceState contactAccessServiceState) {
        Er.b bVar2 = bVar;
        ContactAccessServiceState contactAccessServiceState2 = contactAccessServiceState;
        if ((bVar2 instanceof b.a) || (bVar2 instanceof b.d) || (bVar2 instanceof b.e)) {
            return contactAccessServiceState2;
        }
        if (!(bVar2 instanceof b.c)) {
            if (bVar2 instanceof b.C0262b) {
                return new ContactAccessServiceState.Error(z.j(((b.C0262b) bVar2).f4351a));
            }
            if (bVar2 instanceof b.f) {
                return contactAccessServiceState2;
            }
            throw new NoWhenBranchMatchedException();
        }
        ContactAccessService contactAccessService = ((b.c) bVar2).f4352a;
        String title = contactAccessService.getService().getTitle();
        String subtitle = contactAccessService.getService().getSubtitle();
        String name = contactAccessService.getService().getName();
        String strValueOf = String.valueOf(contactAccessService.getService().getPriceValue());
        Integer size = contactAccessService.getService().getSize();
        return new ContactAccessServiceState.Content(title, subtitle, name, strValueOf, (size != null ? size.intValue() : 1) > 1, contactAccessService.getLegal(), false, contactAccessService.getAction().getDeepLink());
    }
}
