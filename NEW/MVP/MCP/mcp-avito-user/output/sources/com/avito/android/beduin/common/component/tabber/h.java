package com.avito.android.beduin.common.component.tabber;

import com.avito.android.beduin_models.BeduinModel;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import oj.InterfaceC44784a;

/* compiled from: BeduinTabberParametersExtractionStrategy.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/tabber/h;", "Loj/a;", "Lcom/avito/android/beduin/common/component/tabber/BeduinTabberModel;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements InterfaceC44784a<BeduinTabberModel> {
    @Inject
    public h() {
    }

    @Override // oj.InterfaceC44784a
    public final Map m(BeduinModel beduinModel) {
        Object next;
        String id2;
        BeduinTabberModel beduinTabberModel = (BeduinTabberModel) beduinModel;
        if (beduinTabberModel.getId() == null || beduinTabberModel.getTabs().isEmpty()) {
            return P0.c();
        }
        String id3 = beduinTabberModel.getId();
        Iterator<T> it = beduinTabberModel.getTabs().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((BeduinTabberChild) next).getId(), beduinTabberModel.getSelectedTabId())) {
                break;
            }
        }
        BeduinTabberChild beduinTabberChild = (BeduinTabberChild) next;
        if (beduinTabberChild == null || (id2 = beduinTabberChild.getId()) == null) {
            id2 = ((BeduinTabberChild) C42745f0.E(beduinTabberModel.getTabs())).getId();
        }
        return Collections.singletonMap(id3, id2);
    }
}
