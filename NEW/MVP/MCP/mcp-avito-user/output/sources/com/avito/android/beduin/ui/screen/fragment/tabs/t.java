package com.avito.android.beduin.ui.screen.fragment.tabs;

import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import com.avito.android.beduin_models.BeduinForm;
import gj.InterfaceC40691b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;
import qi.InterfaceC47401b;
import vi.C49332a;

/* compiled from: TabsToStateMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/t;", "Lcom/avito/android/beduin/ui/screen/fragment/j;", "Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class t implements com.avito.android.beduin.ui.screen.fragment.j<TabsScreenModel, TabsScreenModel> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f104372a;

    @Inject
    public t(@Y61.k InterfaceC40691b interfaceC40691b) {
        this.f104372a = interfaceC40691b;
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.j
    public final com.avito.android.beduin.ui.screen.fragment.i a(InterfaceC47401b interfaceC47401b) {
        TabsScreenModel tabsScreenModel = (TabsScreenModel) interfaceC47401b;
        List<TabsScreenModel.b> listI = tabsScreenModel.i();
        ArrayList arrayList = new ArrayList(C42745f0.q(listI, 10));
        Iterator<T> it = listI.iterator();
        while (it.hasNext()) {
            arrayList.add(((TabsScreenModel.b) it.next()).getContent());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof C49332a) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C49332a c49332a = (C49332a) it3.next();
            C42745f0.h(C42756l.B(new BeduinForm[]{c49332a.getTopForm(), c49332a.getMainForm(), c49332a.getBottomForm()}), arrayList3);
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            com.avito.android.beduin_shared.model.utils.m.b(this.f104372a.j(), (BeduinForm) it4.next());
        }
        return tabsScreenModel;
    }
}
