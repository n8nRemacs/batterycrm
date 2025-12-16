package com.avito.android.referral_contacts.contacts_list;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ContactPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/referral_contacts/contacts_list/d;", "LTV0/d;", "Lcom/avito/android/referral_contacts/contacts_list/c;", "Lcom/avito/android/referral_contacts/contacts_list/ContactItem;", "<init>", "()V", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements TV0.d<c, ContactItem> {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) eVar;
        ContactItem contactItem = (ContactItem) aVar;
        cVar.f252404b.setText(contactItem.f252397b);
        cVar.f252405c.setText(contactItem.f252398c);
    }
}
