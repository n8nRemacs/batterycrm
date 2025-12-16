package com.avito.android.rating.user_contacts.mvi;

import android.net.Uri;
import com.avito.android.arch.mvi.u;
import com.avito.android.rating.user_contacts.adapter.contact.ContactItem;
import com.avito.android.rating.user_contacts.adapter.info.InfoItem;
import com.avito.android.rating.user_contacts.mvi.entity.UserContactsInternalAction;
import com.avito.android.rating_ui.loading.RatingLoadingItem;
import com.avito.android.remote.model.user_contacts.UserContactResultElement;
import com.avito.android.remote.model.user_contacts.UserContactsResult;
import com.avito.android.util.C35809h6;
import j.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UserContactsReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/s;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction;", "Lcom/avito/android/rating/user_contacts/mvi/entity/b;", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class s implements u<UserContactsInternalAction, com.avito.android.rating.user_contacts.mvi.entity.b> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f247867c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating.user_contacts.j f247868b;

    /* compiled from: UserContactsReducer.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/s$a;", "", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k0
        @Y61.k
        public static List a(@Y61.k ArrayList arrayList) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!(((com.avito.conveyor_item.a) it.next()) instanceof InfoItem)) {
                        return arrayList;
                    }
                }
            }
            return C42784z0.f406748b;
        }

        public a() {
        }
    }

    @Inject
    public s(@Y61.k com.avito.android.rating.user_contacts.j jVar) {
        this.f247868b = jVar;
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((com.avito.conveyor_item.a) obj) instanceof RatingLoadingItem)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.avito.android.arch.mvi.u
    public final com.avito.android.rating.user_contacts.mvi.entity.b a(UserContactsInternalAction userContactsInternalAction, com.avito.android.rating.user_contacts.mvi.entity.b bVar) {
        com.avito.android.rating.user_contacts.mvi.entity.b bVar2;
        ArrayList arrayListH0;
        UserContactsInternalAction userContactsInternalAction2 = userContactsInternalAction;
        com.avito.android.rating.user_contacts.mvi.entity.b bVar3 = bVar;
        if (userContactsInternalAction2 instanceof UserContactsInternalAction.Loading) {
            return com.avito.android.rating.user_contacts.mvi.entity.b.a(bVar3, null, ((UserContactsInternalAction.Loading) userContactsInternalAction2).f247791d, 13);
        }
        boolean z12 = userContactsInternalAction2 instanceof UserContactsInternalAction.Loaded;
        List listI0 = bVar3.f247810b;
        if (z12) {
            UserContactsInternalAction.Loaded loaded = (UserContactsInternalAction.Loaded) userContactsInternalAction2;
            UserContactsResult userContactsResult = loaded.f247789b;
            Uri nextPage = userContactsResult.getNextPage();
            List listB = b(listI0);
            if (loaded.f247790c) {
                listB = null;
            }
            if (listB == null) {
                listB = C42784z0.f406748b;
            }
            List<UserContactResultElement> elements = userContactsResult.getElements();
            if (elements == null) {
                elements = C42784z0.f406748b;
            }
            ArrayList arrayListA = this.f247868b.a(listB.size(), elements);
            if (arrayListA.isEmpty()) {
                arrayListH0 = C42745f0.h0(arrayListA, listB);
            } else {
                arrayListH0 = C42745f0.h0(arrayListA, listB);
                if (nextPage != null) {
                    arrayListH0 = C42745f0.i0(new RatingLoadingItem(null, 1, null), arrayListH0);
                }
            }
            return new com.avito.android.rating.user_contacts.mvi.entity.b(arrayListH0, null, false, nextPage);
        }
        boolean z13 = userContactsInternalAction2 instanceof UserContactsInternalAction.ContactDeleted;
        a aVar = f247867c;
        Uri uri = bVar3.f247813e;
        if (z13) {
            UserContactsInternalAction.ContactDeleted contactDeleted = (UserContactsInternalAction.ContactDeleted) userContactsInternalAction2;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listI0) {
                com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) obj;
                if (aVar2 instanceof ContactItem) {
                    ContactItem contactItem = (ContactItem) aVar2;
                    if (L.f(contactItem.f247681d, contactDeleted.f247784b)) {
                        if (L.f(contactItem.f247683f, contactDeleted.f247785c)) {
                        }
                    }
                }
                arrayList.add(obj);
            }
            aVar.getClass();
            List listA = a.a(arrayList);
            bVar2 = new com.avito.android.rating.user_contacts.mvi.entity.b(listA, null, false, uri != null ? C35809h6.b(uri, listI0.size() - listA.size()) : null);
        } else {
            if (!(userContactsInternalAction2 instanceof UserContactsInternalAction.RatingPublished)) {
                if (userContactsInternalAction2 instanceof UserContactsInternalAction.ShowLoadingItem) {
                    if (uri != null) {
                        listI0 = C42745f0.i0(new RatingLoadingItem(null, 1, null), listI0);
                    }
                    return com.avito.android.rating.user_contacts.mvi.entity.b.a(bVar3, listI0, null, 14);
                }
                if (userContactsInternalAction2 instanceof UserContactsInternalAction.HideLoadingItem) {
                    return com.avito.android.rating.user_contacts.mvi.entity.b.a(bVar3, b(listI0), null, 14);
                }
                if (userContactsInternalAction2 instanceof UserContactsInternalAction.ShowError) {
                    return com.avito.android.rating.user_contacts.mvi.entity.b.a(bVar3, null, null, 9);
                }
                if (userContactsInternalAction2 instanceof UserContactsInternalAction.HandleDeeplink ? true : userContactsInternalAction2 instanceof UserContactsInternalAction.ShowErrorToast) {
                    return com.avito.android.rating.user_contacts.mvi.entity.b.a(bVar3, null, null, 13);
                }
                throw new NoWhenBranchMatchedException();
            }
            UserContactsInternalAction.RatingPublished ratingPublished = (UserContactsInternalAction.RatingPublished) userContactsInternalAction2;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listI0) {
                com.avito.conveyor_item.a aVar3 = (com.avito.conveyor_item.a) obj2;
                ContactItem contactItem2 = aVar3 instanceof ContactItem ? (ContactItem) aVar3 : null;
                if (contactItem2 != null) {
                    if (!L.f(contactItem2.f247681d, ratingPublished.f247792b)) {
                    }
                }
                arrayList2.add(obj2);
            }
            aVar.getClass();
            List listA2 = a.a(arrayList2);
            bVar2 = new com.avito.android.rating.user_contacts.mvi.entity.b(listA2, null, false, uri != null ? C35809h6.b(uri, listI0.size() - listA2.size()) : null);
        }
        return bVar2;
    }
}
