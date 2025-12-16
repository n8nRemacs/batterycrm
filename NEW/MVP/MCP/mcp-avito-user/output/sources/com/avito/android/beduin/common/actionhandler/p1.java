package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinSingleExposeAction;
import com.avito.android.beduin_models.BeduinAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinSingleExposeActionHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/p1;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinSingleExposeAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p1 implements InterfaceC15523b<BeduinSingleExposeAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<String, u3.l<? extends u3.j>> f100346a;

    @Inject
    public p1(@Y61.k Map<String, u3.l<? extends u3.j>> map) {
        this.f100346a = map;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        List<String> configKeyList = ((BeduinSingleExposeAction) beduinAction).getConfigKeyList();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = configKeyList.iterator();
        while (it.hasNext()) {
            u3.l<? extends u3.j> lVar = this.f100346a.get((String) it.next());
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((u3.l) it2.next()).b();
        }
    }
}
