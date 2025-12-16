package com.avito.android.rating.user_contacts.mvi;

import android.os.Bundle;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.RatingPublishLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.FallbackableLink;
import com.avito.android.rating.user_contacts.adapter.contact.ContactItem;
import com.avito.android.rating.user_contacts.mvi.entity.UserContactsInternalAction;
import com.avito.android.rating.user_contacts.mvi.entity.a;
import com.avito.android.rating_form.deep_link.RatingFormLink;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UserContactsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/rating/user_contacts/mvi/entity/a;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction;", "Lcom/avito/android/rating/user_contacts/mvi/entity/b;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements com.avito.android.arch.mvi.a<com.avito.android.rating.user_contacts.mvi.entity.a, UserContactsInternalAction, com.avito.android.rating.user_contacts.mvi.entity.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f247782a;

    @Inject
    public d(@Y61.k n nVar) {
        this.f247782a = nVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<UserContactsInternalAction> b(com.avito.android.rating.user_contacts.mvi.entity.a aVar, com.avito.android.rating.user_contacts.mvi.entity.b bVar) {
        ArrayList<DeepLink> arrayList;
        com.avito.android.rating.user_contacts.mvi.entity.a aVar2 = aVar;
        com.avito.android.rating.user_contacts.mvi.entity.b bVar2 = bVar;
        if (aVar2 instanceof a.e) {
            return C43175k.G(new c((a.e) aVar2, this, null));
        }
        if (!(aVar2 instanceof a.b)) {
            if (aVar2 instanceof a.c) {
                ContactItem contactItem = ((a.c) aVar2).f247804a;
                return this.f247782a.b(contactItem.f247681d, contactItem.f247683f);
            }
            if (aVar2 instanceof a.C7439a) {
                return C43175k.G(new a(((a.C7439a) aVar2).f247801a.f247689l, null, null));
            }
            if (aVar2.equals(a.d.f247805a)) {
                return C43175k.G(new b(bVar2, this, null));
            }
            if (aVar2.equals(a.f.f247807a)) {
                return new C43210w(UserContactsInternalAction.ShowLoadingItem.f247800b);
            }
            throw new NoWhenBranchMatchedException();
        }
        a.b bVar3 = (a.b) aVar2;
        ContactItem contactItem2 = bVar3.f247802a;
        DeepLink deepLink = contactItem2.f247688k;
        boolean z12 = true;
        boolean z13 = (deepLink instanceof RatingFormLink) || (deepLink instanceof RatingPublishLink);
        if (!(deepLink instanceof FallbackableLink) || ((arrayList = ((FallbackableLink) deepLink).f133329d) != null && arrayList.isEmpty())) {
            z12 = false;
        } else {
            for (DeepLink deepLink2 : arrayList) {
                if ((deepLink2 instanceof RatingFormLink) || (deepLink2 instanceof RatingPublishLink)) {
                    break;
                }
            }
            z12 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("key_score", bVar3.f247803b);
        bundle.putString("key_item_id", contactItem2.f247683f);
        bundle.putBoolean("key_is_auto", contactItem2.f247687j);
        bundle.putString("key_published_rating_user_key", contactItem2.f247681d);
        if (!z13 && !z12) {
            bundle = null;
        }
        return C43175k.G(new a(deepLink, bundle, null));
    }
}
