package com.avito.android.profile.pro.impl.converters;

import B90.b;
import com.avito.android.profile.pro.impl.ProfileTabUserType;
import com.avito.android.profile.pro.impl.interactor.ProfileProWidgetsParams;
import com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ProfileTabWidgetParamsConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/converters/I;", "Lcom/avito/android/profile/pro/impl/converters/H;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class I implements H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f222446a;

    @Inject
    public I(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f222446a = interfaceC35863o4;
    }

    @Override // com.avito.android.profile.pro.impl.converters.H
    @Y61.k
    public final ProfileProWidgetsParams c(@Y61.k B90.a aVar, @Y61.l String str, @Y61.k ProfileTabUserType profileTabUserType) {
        ArrayList arrayList = aVar.f918c;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator it = arrayList.iterator();
        ProfileProWidgetsParams.AvitoFinanceParams avitoFinanceParams = null;
        while (it.hasNext()) {
            ProfileTabWidget profileTabWidget = (ProfileTabWidget) it.next();
            if (profileTabWidget instanceof B90.b) {
                if (profileTabWidget.getF971a().length() > 0) {
                    arrayList3.add(profileTabWidget.getF971a());
                }
                List<b.a> items = ((B90.b) profileTabWidget).getItems();
                ArrayList arrayList6 = new ArrayList();
                Iterator<T> it2 = items.iterator();
                while (it2.hasNext()) {
                    String f956a = ((b.a) it2.next()).getF956a();
                    if (f956a != null) {
                        arrayList6.add(f956a);
                    }
                }
                arrayList4.addAll(arrayList6);
            } else if (profileTabWidget instanceof ProfileTabWidget.d) {
                arrayList5.add(((ProfileTabWidget.d) profileTabWidget).f222779c);
                arrayList2.add(((ProfileTabWidget.d) profileTabWidget).f222777a);
            } else if (profileTabWidget instanceof ProfileTabWidget.b) {
                avitoFinanceParams = ProfileProWidgetsParams.AvitoFinanceParams.f222681b;
                arrayList2.add(((ProfileTabWidget.b) profileTabWidget).f222769a);
            } else {
                arrayList2.add(profileTabWidget.getF971a());
            }
        }
        if (str == null) {
            str = this.f222446a.a();
        }
        return new ProfileProWidgetsParams(str, arrayList2, arrayList3, arrayList4, arrayList5, profileTabUserType, avitoFinanceParams);
    }
}
