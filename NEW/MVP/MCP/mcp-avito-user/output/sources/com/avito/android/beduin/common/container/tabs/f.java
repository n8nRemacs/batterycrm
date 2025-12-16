package com.avito.android.beduin.common.container.tabs;

import Y61.k;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.utils.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import oj.InterfaceC44784a;

/* compiled from: TabContainerExtractionStrategy.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/container/tabs/f;", "Loj/a;", "Lcom/avito/android/beduin/common/container/tabs/BeduinTabContainerModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements InterfaceC44784a<BeduinTabContainerModel> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC44784a<BeduinModel>> f103228a;

    @Inject
    public f(@k h31.e<InterfaceC44784a<BeduinModel>> eVar) {
        this.f103228a = eVar;
    }

    @Override // oj.InterfaceC44784a
    public final Map m(BeduinModel beduinModel) {
        List<BeduinTabContainerChild> tabs = ((BeduinTabContainerModel) beduinModel).getTabs();
        ArrayList arrayList = new ArrayList(C42745f0.q(tabs, 10));
        Iterator<T> it = tabs.iterator();
        while (it.hasNext()) {
            arrayList.add(((BeduinTabContainerChild) it.next()).getChild());
        }
        return q.a(arrayList, this.f103228a.get());
    }
}
