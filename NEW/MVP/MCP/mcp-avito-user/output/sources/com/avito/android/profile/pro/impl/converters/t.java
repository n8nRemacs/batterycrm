package com.avito.android.profile.pro.impl.converters;

import B90.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.pro.impl.screen.item.my_services.ProfileProMyServiceItem;
import com.avito.android.profile.pro.impl.screen.item.my_services.ProfileProMyServicesItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProMyServicesItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/converters/t;", "Lcom/avito/android/profile/pro/impl/converters/s;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class t implements s {
    @Inject
    public t() {
    }

    @Override // com.avito.android.profile.pro.impl.converters.s
    @Y61.k
    public final List<ProfileProMyServicesItem> a(@Y61.k b.C0038b c0038b) {
        String str = c0038b.f934b;
        if (str != null) {
            ArrayList<b.C0038b.a> arrayList = c0038b.f936d;
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                for (b.C0038b.a aVar : arrayList) {
                    b.C0038b.a.C0039a c0039a = aVar.f940d;
                    DeepLink deepLink = aVar.f939c;
                    arrayList2.add(new ProfileProMyServiceItem(c0039a.f942b, c0039a.f941a, str, aVar.f938b, deepLink, aVar.f937a));
                }
                return Collections.singletonList(new ProfileProMyServicesItem(c0038b.f935c, str, str, arrayList2));
            }
        }
        return C42784z0.f406748b;
    }
}
