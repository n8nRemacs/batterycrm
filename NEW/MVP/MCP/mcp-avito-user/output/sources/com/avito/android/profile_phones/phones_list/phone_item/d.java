package com.avito.android.profile_phones.phones_list.phone_item;

import Y61.k;
import android.content.res.ColorStateList;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.profile_phones.phones_list.PhoneItem;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneListItem;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneListItemView;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PhoneListItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/phone_item/d;", "Lcom/avito/android/profile_phones/phones_list/phone_item/c;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.profile_phones.phones_list.phone_item.a f228156b;

    /* compiled from: PhoneListItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PhoneListItem.Status.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PhoneListItem.Status status = PhoneListItem.Status.f228140b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PhoneListItem.Status status2 = PhoneListItem.Status.f228140b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public d(@k com.avito.android.profile_phones.phones_list.phone_item.a aVar) {
        this.f228156b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        PhoneListItemView.StatusType statusType;
        PhoneListItemView phoneListItemView = (PhoneListItemView) eVar;
        PhoneListItem phoneListItem = (PhoneListItem) aVar;
        PhoneItem phoneItem = phoneListItemView.f228146b;
        phoneItem.setTitle(phoneListItem.f228127c);
        phoneItem.setSubtitle(phoneListItem.f228128d);
        int iOrdinal = phoneListItem.f228129e.ordinal();
        if (iOrdinal == 0) {
            statusType = PhoneListItemView.StatusType.f228148d;
        } else if (iOrdinal == 1) {
            statusType = PhoneListItemView.StatusType.f228149e;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            statusType = PhoneListItemView.StatusType.f228147c;
        }
        phoneItem.setMessage(phoneListItem.f228131g);
        phoneItem.setMessageColor(C35835l0.e(statusType.f228152b, phoneItem.getContext()));
        phoneItem.setProtected(phoneListItem.f228135k);
        if (phoneListItem.f228136l) {
            D6.f(phoneListItemView.f228146b, y6.b(24), 0, y6.b(24), 0, 10);
        } else {
            D6.f(phoneListItemView.f228146b, y6.b(16), 0, y6.b(16), 0, 10);
        }
        phoneItem.setOnClickListener(new g(0, new e(this, phoneListItem)));
        if (phoneListItem.f228132h.isEmpty()) {
            ListItem.k(phoneItem, 0, 0, 1);
        } else {
            ListItem.k(phoneItem, 0, R.drawable.ic_more_horizontal_24, 1);
            phoneItem.setRightIconColor(ColorStateList.valueOf(C35835l0.d(R.attr.black, phoneItem.getContext())));
        }
    }
}
