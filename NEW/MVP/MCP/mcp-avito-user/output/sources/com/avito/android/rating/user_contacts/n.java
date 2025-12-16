package com.avito.android.rating.user_contacts;

import com.avito.android.rating.user_contacts.adapter.contact.ContactItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserContactsSpanProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/user_contacts/n;", "Lcom/avito/android/rating/user_contacts/m;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public UV0.c f247870a;

    @Inject
    public n() {
    }

    @Override // com.avito.android.rating.user_contacts.m
    public final int a(int i12, int i13) {
        UV0.c cVar = this.f247870a;
        com.avito.conveyor_item.a aVar = null;
        if (cVar != null && i12 >= 0 && i12 < cVar.getCount()) {
            aVar = (com.avito.conveyor_item.a) cVar.f16399b.get(i12);
        }
        if (aVar instanceof ContactItem) {
            return 1;
        }
        return i13;
    }

    @Override // com.avito.android.rating.user_contacts.m
    public final void b(@Y61.k UV0.c cVar) {
        this.f247870a = cVar;
    }
}
