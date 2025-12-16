package com.avito.android.profile.pro.impl.converters;

import B90.b;
import com.avito.android.profile.pro.impl.screen.item.group.row.ProfileProGroupRowItem;
import com.avito.android.profile.pro.impl.screen.item.group.title.ProfileProGroupTitleItem;
import com.avito.android.util.y6;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProGroupConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/converters/n;", "Lcom/avito/android/profile/pro/impl/converters/m;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements m {
    @Inject
    public n() {
    }

    @Override // com.avito.android.profile.pro.impl.converters.m
    @Y61.k
    public final ArrayList a(@Y61.k b.c cVar) {
        ArrayList arrayList = new ArrayList();
        String str = cVar.f943a;
        if (str != null && str.length() != 0) {
            arrayList.add(new ProfileProGroupTitleItem(str, str));
        }
        ArrayList arrayList2 = cVar.f945c;
        int i12 = 0;
        for (Object obj : arrayList2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            b.c.a aVar = (b.c.a) obj;
            String str2 = aVar.f946a;
            if (str2 != null) {
                String str3 = aVar.f948c;
                String str4 = !L.f(str3, "0") ? str3 : null;
                int iB2 = i12 == 0 ? y6.b(!(str == null || str.length() == 0) ? 12 : 32) : y6.b(2);
                int size = arrayList2.size();
                arrayList.add(new ProfileProGroupRowItem(str2, aVar.f947b, str4, aVar.f949d, aVar.f950e, iB2, size == 1 ? ProfileProGroupRowItem.Type.f223303e : i12 == 0 ? ProfileProGroupRowItem.Type.f223300b : i12 == size + (-1) ? ProfileProGroupRowItem.Type.f223302d : ProfileProGroupRowItem.Type.f223301c, cVar.getF971a(), aVar.f946a));
            }
            i12 = i13;
        }
        return arrayList;
    }
}
