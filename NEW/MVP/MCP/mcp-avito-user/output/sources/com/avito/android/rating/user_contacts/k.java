package com.avito.android.rating.user_contacts;

import com.avito.android.rating.user_contacts.adapter.contact.ContactItem;
import com.avito.android.rating.user_contacts.adapter.info.InfoItem;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.user_contacts.InfoElement;
import com.avito.android.remote.model.user_contacts.UserContactElement;
import com.avito.android.remote.model.user_contacts.UserContactResultElement;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: UserContactsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/user_contacts/k;", "Lcom/avito/android/rating/user_contacts/j;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements j {
    @Inject
    public k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.avito.android.rating.user_contacts.adapter.contact.ContactItem] */
    @Override // com.avito.android.rating.user_contacts.j
    @Y61.k
    public final ArrayList a(int i12, @Y61.k List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i13 = 0;
        for (Object obj : list2) {
            int i14 = i13 + 1;
            InfoItem contactItem = null;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            UserContactResultElement userContactResultElement = (UserContactResultElement) obj;
            long j12 = i12 + i13;
            if (userContactResultElement instanceof InfoElement) {
                InfoElement infoElement = (InfoElement) userContactResultElement;
                contactItem = new InfoItem(j12, null, infoElement.getTitle(), infoElement.getSubtitle(), 2, null);
            } else if (userContactResultElement instanceof UserContactElement) {
                UserContactElement userContactElement = (UserContactElement) userContactResultElement;
                String userKey = userContactElement.getUser().getUserKey();
                String name = userContactElement.getUser().getName();
                String id2 = userContactElement.getItem().getId();
                Image image = userContactElement.getItem().getImage();
                String title = userContactElement.getItem().getTitle();
                String price = userContactElement.getItem().getPrice();
                Boolean isAuto = userContactElement.getItem().getIsAuto();
                boolean zBooleanValue = isAuto != null ? isAuto.booleanValue() : false;
                Action action = userContactElement.getAction();
                contactItem = new ContactItem(j12, null, userKey, name, id2, image, title, price, zBooleanValue, action != null ? action.getDeepLink() : null, userContactElement.getItemInfoAction(), 2, null);
            }
            arrayList.add(contactItem);
            i13 = i14;
        }
        return C42745f0.C(arrayList);
    }
}
