package com.avito.android.profile_phones.phones_list.actions;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneListItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneActionItemsConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/actions/b;", "Lcom/avito/android/profile_phones/phones_list/actions/a;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.profile_phones.phones_list.actions.a
    @k
    public final ArrayList a(@k String str, @k List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList.add(new com.avito.android.profile_phones.phones_list.actions.items.a(String.valueOf(i12), str, (PhoneListItem.Action) obj));
            i12 = i13;
        }
        return arrayList;
    }
}
