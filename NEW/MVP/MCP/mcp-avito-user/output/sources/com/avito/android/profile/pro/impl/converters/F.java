package com.avito.android.profile.pro.impl.converters;

import B90.b;
import com.avito.android.profile.pro.impl.screen.item.widget_group.title.ProfileProWidgetGroupTitleItem;
import com.avito.android.profile.pro.impl.screen.item.widget_group.widget.ProfileProWidgetItem;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.y6;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProWidgetGroupConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/converters/F;", "Lcom/avito/android/profile/pro/impl/converters/E;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class F implements E {
    @Inject
    public F() {
    }

    @Override // com.avito.android.profile.pro.impl.converters.E
    @Y61.k
    public final ArrayList a(@Y61.k b.d dVar) {
        ArrayList arrayList = new ArrayList();
        String str = dVar.f952b;
        if (str != null && str.length() != 0) {
            arrayList.add(new ProfileProWidgetGroupTitleItem(str, str, dVar.f953c));
        }
        ArrayList arrayList2 = dVar.f955e;
        int i12 = 0;
        for (Object obj : arrayList2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            b.d.a aVar = (b.d.a) obj;
            String str2 = aVar.f956a;
            b.d.a.C0040a c0040a = aVar.f958c;
            UniversalImage universalImage = c0040a.f960b;
            int iB2 = i12 == 0 ? y6.b(!(str == null || str.length() == 0) ? 12 : 32) : y6.b(2);
            int size = arrayList2.size();
            arrayList.add(new ProfileProWidgetItem(str2, c0040a.f961c, c0040a.f959a, aVar.f957b, universalImage, iB2, size == 1 ? ProfileProWidgetItem.Type.f223597e : i12 == 0 ? ProfileProWidgetItem.Type.f223594b : i12 == size + (-1) ? ProfileProWidgetItem.Type.f223596d : ProfileProWidgetItem.Type.f223595c, dVar.getF222828a(), aVar.f956a));
            i12 = i13;
        }
        return arrayList;
    }
}
