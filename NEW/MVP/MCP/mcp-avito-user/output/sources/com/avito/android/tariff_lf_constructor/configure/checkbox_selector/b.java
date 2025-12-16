package com.avito.android.tariff_lf_constructor.configure.checkbox_selector;

import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.toggle.State;
import com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import vD0.C49197a;

/* compiled from: CheckBoxConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/b;", "Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/a;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    public static d.a b(C49197a c49197a, boolean z12) {
        ArrayList arrayList;
        String id2 = c49197a.getId();
        String title = c49197a.getTitle();
        State state = L.f(c49197a.getIsSelected(), Boolean.TRUE) ? State.f181147b : State.f181148c;
        String parentId = c49197a.getParentId();
        Integer level = c49197a.getLevel();
        Boolean isEnabled = c49197a.getIsEnabled();
        boolean zBooleanValue = isEnabled != null ? isEnabled.booleanValue() : true;
        Boolean isRoot = c49197a.getIsRoot();
        boolean z13 = !z12;
        List<C49197a> listA = c49197a.a();
        if (listA != null) {
            List<C49197a> list = listA;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (C49197a c49197a2 : list) {
                arrayList2.add(O2.a(c49197a2.a()) ? b(c49197a2, z12) : c(c49197a2));
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = null;
        }
        return new d.a(id2, title, state, parentId, level, zBooleanValue, isRoot, c49197a.getSubtitle(), arrayList, z13, z12);
    }

    public static d.b c(C49197a c49197a) {
        String id2 = c49197a.getId();
        String title = c49197a.getTitle();
        Boolean isRoot = c49197a.getIsRoot();
        State state = L.f(c49197a.getIsSelected(), Boolean.TRUE) ? State.f181147b : State.f181148c;
        String parentId = c49197a.getParentId();
        Integer level = c49197a.getLevel();
        Boolean isEnabled = c49197a.getIsEnabled();
        return new d.b(id2, title, state, parentId, level, isEnabled != null ? isEnabled.booleanValue() : true, isRoot, c49197a.getSubtitle());
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.a
    @Y61.k
    public final ArrayList a(@Y61.k List list, boolean z12) {
        List<C49197a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (C49197a c49197a : list2) {
            arrayList.add(O2.a(c49197a.a()) ? b(c49197a, z12) : c(c49197a));
        }
        return arrayList;
    }
}
