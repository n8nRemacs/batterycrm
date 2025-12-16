package com.avito.android.beduin.common.container.layered;

import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.utils.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import oj.InterfaceC44784a;

/* compiled from: LayeredContainerExtractionStrategy.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/container/layered/k;", "Loj/a;", "Lcom/avito/android/beduin/common/container/layered/BeduinLayeredContainerModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements InterfaceC44784a<BeduinLayeredContainerModel> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC44784a<BeduinModel>> f103153a;

    @Inject
    public k(@Y61.k h31.e<InterfaceC44784a<BeduinModel>> eVar) {
        this.f103153a = eVar;
    }

    @Override // oj.InterfaceC44784a
    public final Map m(BeduinModel beduinModel) {
        ArrayList arrayList;
        BeduinLayeredContainerModel beduinLayeredContainerModel = (BeduinLayeredContainerModel) beduinModel;
        InterfaceC44784a<BeduinModel> interfaceC44784a = this.f103153a.get();
        List<BeduinLayeredContainerChild> foregroundChildren = beduinLayeredContainerModel.getForegroundChildren();
        if (foregroundChildren != null) {
            List<BeduinLayeredContainerChild> list = foregroundChildren;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((BeduinLayeredContainerChild) it.next()).getChild());
            }
        } else {
            arrayList = null;
        }
        return P0.k(q.a(arrayList, interfaceC44784a), interfaceC44784a.m(beduinLayeredContainerModel.getBackgroundChild()));
    }
}
