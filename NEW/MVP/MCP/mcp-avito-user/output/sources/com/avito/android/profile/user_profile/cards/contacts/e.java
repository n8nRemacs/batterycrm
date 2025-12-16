package com.avito.android.profile.user_profile.cards.contacts;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.Action;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ContactsCardItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/contacts/e;", "Lcom/avito/android/profile/user_profile/cards/contacts/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f224926b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC15503a, G0> lVar) {
        this.f224926b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        CardItem.ContactsCardItem contactsCardItem = (CardItem.ContactsCardItem) aVar;
        gVar.b(contactsCardItem.f224389d);
        gVar.n(contactsCardItem.f224390e);
        Action action = contactsCardItem.f224391f;
        if (action == null) {
            gVar.ak();
        } else {
            gVar.P(action.getTitle(), new d(this, contactsCardItem));
        }
    }
}
