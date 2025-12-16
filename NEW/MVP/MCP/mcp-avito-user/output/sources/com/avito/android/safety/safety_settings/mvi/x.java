package com.avito.android.safety.safety_settings.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsElement;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import jo0.C42405a;
import jo0.C42406b;
import jo0.C42408d;
import jo0.InterfaceC42407c;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SafetySettingsConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/x;", "", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class x {
    @Inject
    public x() {
    }

    public static List a(InterfaceC42407c.b bVar) {
        ArrayList arrayList;
        DeepLink uri;
        List<C42406b> listC = bVar.c();
        ArrayList arrayList2 = null;
        if (listC != null) {
            List<C42406b> list = listC;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list, 10));
            for (C42406b c42406b : list) {
                String title = c42406b.getTitle();
                String subtitle = c42406b.getSubtitle();
                String deviceId = c42406b.getDeviceId();
                Boolean isCurrent = c42406b.getIsCurrent();
                String loginType = c42406b.getLoginType();
                SafetySettingsElement.SessionItem.LoginType loginType2 = SafetySettingsElement.SessionItem.LoginType.f257679b;
                if (!L.f(loginType, "email")) {
                    loginType2 = SafetySettingsElement.SessionItem.LoginType.f257680c;
                }
                String sessionIdHash = c42406b.getSessionIdHash();
                List<C42405a> listA = c42406b.a();
                if (listA != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (C42405a c42405a : listA) {
                        String title2 = c42405a.getTitle();
                        SafetySettingsElement.SessionItem.a aVar = (title2 == null || (uri = c42405a.getUri()) == null) ? null : new SafetySettingsElement.SessionItem.a(title2, uri);
                        if (aVar != null) {
                            arrayList4.add(aVar);
                        }
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                arrayList3.add(new SafetySettingsElement.SessionItem(title, subtitle, deviceId, isCurrent, loginType2, sessionIdHash, arrayList, null, 128, null));
            }
            arrayList2 = arrayList3;
        }
        return arrayList2 == null ? C42784z0.f406748b : arrayList2;
    }

    @Y61.l
    public static Long b(@Y61.k C42408d c42408d) {
        List<InterfaceC42407c> listA = c42408d.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (obj instanceof InterfaceC42407c.b) {
                arrayList.add(obj);
            }
        }
        InterfaceC42407c.b bVar = (InterfaceC42407c.b) C42745f0.G(arrayList);
        if (bVar != null) {
            return bVar.getCursor();
        }
        return null;
    }
}
